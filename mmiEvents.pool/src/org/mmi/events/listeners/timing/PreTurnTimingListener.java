package org.mmi.events.listeners.timing;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import org.apache.log4j.Logger;
import org.mmi.events.Event;
import org.mmi.events.event_t;
import org.mmi.events.factory.EventFactory;
import org.mmi.events.listeners.EventPoolListener;
import org.mmi.events.pool.EventPool;
import org.mmi.model.instantiator.MmiModelInstantiator;
import org.mmi.utils.GenericFSM.FSMIntegrityException;
import org.mmi.utils.GenericFSM.FSMInvalidTransitionException;

/**
 * 
 * This listener generates turn control events according
 * to the execution of feedback and transferring actions
 * by both the system and the user. This listener also
 * calculates some metrics as the delay, feedback, and
 * action times.
 * 
 * The following events describe dialogue and turn steps:
 * - dialogue start = concrete event
 * - dialogue end = concrete event
 * - system turn starts = new content in the window, new words, etc. (user turn ends)
 * - system feedback starts = feedback elements appear
 * - system action starts = no-feedback elements appear
 * - user turn starts = GUI elements or words stop appearing (system turn ends)
 * - user feedback starts = user exploring actions
 * - user action starts = user transferring actions
 * 
 * @author mateo-navarro.pedro
 *
 */
public class PreTurnTimingListener extends EventPoolListener {

	private final static Logger LOG = Logger.getLogger(PreTurnTimingListener.class);
	
	/**
	 * FSM
	 */
	private PreTurnTimingFSM state;

	/**
	 * event sets
	 */
	private Set<Integer> systemFeedbackEvents;
	private Set<Integer> systemActionEvents;
	private Set<Integer> userFeedbackEvents;
	private Set<Integer> userActionEvents;
	private Set<Integer> dialogueStartEvents;
	private Set<Integer> dialogueEndEvents;

	/**
	 * turn delimiters
	 */
	private long lastSystemActionTimeStamp;
	private boolean onSystemTurn;
	private long lastUserActionTimeStamp;
	private boolean onUserTurn;
	
	public PreTurnTimingListener(EventPool epool, EventFactory efact, MmiModelInstantiator inst) {
		super(epool, efact, inst);

		//state control
		try {
			state = new PreTurnTimingFSM();
		} catch (FSMIntegrityException e) {
			LOG.error(e);
		}

		///
		/// initialize event sets
		///

		///
		/// system feedback
		//
		systemFeedbackEvents = new HashSet<Integer>();
		//guis
		systemFeedbackEvents.add(event_t.GUIFEEDBACK.getValue());
		//speech
		systemFeedbackEvents.add(event_t.SPEECHFEEDBACK.getValue());
		
		///
		/// system actions
		//
		systemActionEvents = new HashSet<Integer>();
		//guis
		systemActionEvents.add(event_t.GUIELEMENTS.getValue());
		systemActionEvents.add(event_t.GUINOISE.getValue());
		systemActionEvents.add(event_t.GUICONCEPTS.getValue());
		systemActionEvents.add(event_t.GUIQUESTIONS.getValue());
		//speech
		systemActionEvents.add(event_t.SPEECHELEMENTS.getValue());
		systemActionEvents.add(event_t.SPEECHNOISE.getValue());
		systemActionEvents.add(event_t.SPEECHCONCEPTS.getValue());
		systemActionEvents.add(event_t.SPEECHQUESTIONS.getValue());
		systemActionEvents.add(event_t.OPENPROMPT.getValue());
		systemActionEvents.add(event_t.HALFOPENPROMPT.getValue());
		systemActionEvents.add(event_t.CLOSEDPROMPT.getValue());
		systemActionEvents.add(event_t.NOQUESTIONPROMPT.getValue());

		///
		/// user feedback
		//
		userFeedbackEvents = new HashSet<Integer>();
		
		// general
		userFeedbackEvents.add(event_t.USERFEEDBACKSTART.getValue());
		//guis
		userFeedbackEvents.add(event_t.NAVIGATIONMOVE.getValue());
		userFeedbackEvents.add(event_t.NAVIGATIONEXPLORE.getValue());
		userFeedbackEvents.add(event_t.TEXTEXPLORE.getValue());
		//speech
		
		///
		/// user actions
		//
		userActionEvents = new HashSet<Integer>();
		//guis
		userActionEvents.add(event_t.NAVIGATIONACTION.getValue());
		userActionEvents.add(event_t.TEXTWORD.getValue());
		userActionEvents.add(event_t.TEXTCOMMAND.getValue());
		//speech
		userActionEvents.add(event_t.OVERALLWORDS.getValue());
		userActionEvents.add(event_t.OVERALLSENTENCES.getValue());
		userActionEvents.add(event_t.OVERALLCONCEPTS.getValue());
		userActionEvents.add(event_t.CORRECTLYPARSEDUTTERANCE.getValue());
		userActionEvents.add(event_t.PARTIALLYPARSEDUTTERANCE.getValue());
		userActionEvents.add(event_t.INCORRECTLYPARSEDUTTERANCE.getValue());
		
		///
		///dialogue start and end events
		///
		dialogueStartEvents = new HashSet<Integer>();
		dialogueStartEvents.add(event_t.APPSTART.getValue());
		dialogueEndEvents = new HashSet<Integer>();
		dialogueEndEvents.add(event_t.APPEND.getValue());

		///
		/// initialize variables
		///
		lastSystemActionTimeStamp = 0;
		lastUserActionTimeStamp = 0;
		onSystemTurn = false;
		onUserTurn = false;
	}

	@Override
	public void onEvent(int type, Event e) {
		try {
			///
			/// system feedback
			//
			if (systemFeedbackEvents.contains(e.getType())){
				//if state transition can be performed...
				if (state.checkTransition(PreTurnTimingFSM.event_t.SYSTEM_FEEDBACK.value)){
					LOG.debug(e.getTimestamp() + "\t>> L1 :: (PTTL) transition to SYSTEM_FEEDBACK");
					
					//end user turn if necessary
					if (onUserTurn) {
						endUserTurn(e.getTimestamp());
					}
					
					//do transition
					state.doTransition(PreTurnTimingFSM.event_t.SYSTEM_FEEDBACK.value);
					
					//start system turn if necessary
					if (!onSystemTurn) {
						startSystemTurn(e.getTimestamp());
					}
					
					//generate event
					epool_.postEvent(efact_.createSystemFeedbackStartEvent(), e.getTimestamp());
				} else {
					LOG.debug(e.getTimestamp() + "\t>> L1 :: (PTTL) NO transition to SYSTEM_FEEDBACK :: e = " + e.getType());
				}
				
				//log event
				LOG.debug(e.getTimestamp() + "\t>> L1 :: (SYSTEM FEEDBACK EVENT)(PTTL)");
				//update times
				lastSystemActionTimeStamp = e.getTimestamp();
			}
			
			///
			/// system actions
			///
			else if (systemActionEvents.contains(e.getType())){
				//if state transition can be performed...
				if (state.checkTransition(PreTurnTimingFSM.event_t.SYSTEM_ACTION.value)){
					LOG.debug(e.getTimestamp() + "\t>> L1 :: (PTTL) transition to SYSTEM_ACTION");
					
					//end user turn if necessary
					if (onUserTurn) {
						endUserTurn(e.getTimestamp());
					}
					
					//do transition
					state.doTransition(PreTurnTimingFSM.event_t.SYSTEM_ACTION.value);
					
					//start system turn (if not started)
					if ( !onSystemTurn) {
						startSystemTurn(e.getTimestamp());
					}
					
					//generate event
					epool_.postEvent(efact_.createSystemActionStartEvent(),	e.getTimestamp());
					
					LOG.debug(e.getTimestamp() + "\t>> L1 :: (PTTL) End transition to SYSTEM_ACTION");
				}
				else{
					LOG.debug(e.getTimestamp() + "\t>> L1 :: (PTTL) NO transition to SYSTEM_ACTION :: e = " 
							+ e.getType());
				}
				
				//log event
				LOG.debug(e.getTimestamp() + "\t>> L1 :: (SYSTEM ACTION EVENT)(PTTL)");
				//update times
				lastSystemActionTimeStamp = e.getTimestamp();
			}
			
			/// ////////////////////////////////////////////////////////////////////
			///
			/// user feedback
			///
			else if (userFeedbackEvents.contains(e.getType())){
				//if state transition can be performed...
				if (state.checkTransition(PreTurnTimingFSM.event_t.USER_FEEDBACK.value)){
					LOG.debug(e.getTimestamp() + "\t>> L1 :: (PTTL) transition to USER_FEEDBACK");
					
					//end system turn
					if (onSystemTurn) {
						endSystemTurn(e.getTimestamp());
					}
					
					//do transition
					state.doTransition(PreTurnTimingFSM.event_t.USER_FEEDBACK.value);
					
					//start user turn if necessary...
					if (!onUserTurn) {
						startUserTurn(e.getTimestamp());
					}
					// ... and generate feedback start event, if e is not the feedback start event
					
					if( !e.equals(event_t.USERFEEDBACKSTART)) {
						epool_.postEvent(efact_.createUserFeedbackStartEvent(),	e.getTimestamp());
					}
				}
				else{
					LOG.debug(e.getTimestamp() + "\t>> L1 :: (PTTL) NO transition to USER_FEEDBACK :: e = "	+ e.getType());
				}
				
				//log event
				LOG.debug(e.getTimestamp() + "\t>> L1 :: (USER FEEDBACK EVENT)(PTTL)");
				//update times
				lastUserActionTimeStamp = e.getTimestamp();
			}
			
			///
			/// user actions
			///
			else if (userActionEvents.contains(e.getType())){
				//if state transition can be performed...
				if (state.checkTransition(PreTurnTimingFSM.event_t.USER_ACTION.value)){
					LOG.debug(e.getTimestamp() + "\t>> L1 :: (PTTL) transition to USER_ACTION");
					
					//end system turn (if necessary)
					if (onSystemTurn) {
						endSystemTurn(e.getTimestamp());
					}
					
					//do transition
					state.doTransition(PreTurnTimingFSM.event_t.USER_ACTION.value);
					
					//start user turn (if not started yet)
					if (!onUserTurn) {
						startUserTurn(e.getTimestamp());
					}
					
					//generate event
					epool_.postEvent(efact_.createUserActionStartEvent(), e.getTimestamp());
				} else {
					LOG.debug(e.getTimestamp() + "\t>> L1 :: (PTTL) NO transition to USER_ACTION :: e = " + e.getType());
				}
				
				//log event
				LOG.debug(e.getTimestamp() + "\t>> L1 :: (USER ACTION EVENT)(PTTL) " + e.getType());
				//update times
				lastUserActionTimeStamp = e.getTimestamp();
			}
			
			/// ////////////////////////////////////////////////////////////////////
			///
			/// dialogue start
			else if (dialogueStartEvents.contains(e.getType())){
				LOG.debug(e.getTimestamp() + "\t>> L1 :: (APP START EVENT)(PTTL)");
				
				//if not done yet, post a STARTDIALOGUE event
				if (state.doTransition(PreTurnTimingFSM.event_t.START_DIALOGUE.value)) {
					LOG.debug(e.getTimestamp() + "\t>> L1 :: (PTTL) state transition to START_DIALOGUE");
					LOG.info(e.getTimestamp() + "\t   L1 :: GuiTurnTimingL: Sending Start Dialogue");
					epool_.postEvent(efact_.createStartDialogueEvent(),	e.getTimestamp());
				} else {
					LOG.debug(e.getTimestamp() + "\t>> L1 :: (PTTL) NO transition to START_DIALOGUE :: e = " + e.getType());
				}
			}
			
			///
			/// dialogue end
			else if (dialogueEndEvents.contains(e.getType())){
				LOG.debug(e.getTimestamp() + "\t>> L1 :: (APP END EVENT)(PTTL)");
				
				//if state transition takes place...
				if (state.doTransition(PreTurnTimingFSM.event_t.END_DIALOGUE.value)) {
					LOG.debug(e.getTimestamp() + "\t>> L1 :: (PTTL) state transition...");
					//finish the user turn
					LOG.debug(e.getTimestamp() + "\t>> L1 :: GuiTurnTimingL: adding the last pair of turns");
					endUserTurn(e.getTimestamp());
					//finish the dialogue
					LOG.info(e.getTimestamp() + "\t   L1 :: GuiTurnTimingL: Sending End Dialogue");
					epool_.postEvent(efact_.createEndDialogueEvent(), e.getTimestamp());
				} else {
					LOG.debug(e.getTimestamp() + "\t>> L1 :: (PTTL) NO transition to END_DIALOGUE :: e = " + e.getType());
				}
			}
		} catch (FSMInvalidTransitionException e1) {
			LOG.error(e1);
		}
	}
	
	private void startSystemTurn(long timestamp){
		onSystemTurn = true;
		//lastUserActionTimeStamp++;
		
		LOG.info(String.format("%n%n%n%n        START SYSTEM TURN %n%n%n%n"));
		
		epool_.postEvent(efact_.createStartSystemTurnEvent(), timestamp);
	}
	
	private void startUserTurn(long timestamp){
		onUserTurn = true;
		//lastSystemActionTimeStamp++;
		
		LOG.info(String.format("%n%n%n%n        START USER TURN %n%n%n%n"));
		
		epool_.postEvent(efact_.createStartUserTurnEvent(), timestamp);
	}
	
	private void endUserTurn(long timestamp){
		//finish user action
		lastUserActionTimeStamp++;
		
		//LOG.info(lastUserActionTs_ + "\t   L1 :: GuiTurnTimingL: Sending End UserAction");
		epool_.postEvent(efact_.createUserActionEndEvent(), timestamp);
		
		//finish user turn
		lastUserActionTimeStamp++;
		onUserTurn = false;
		epool_.postEvent(efact_.createEndUserTurnEvent(), timestamp);
		
		LOG.info("\t___________________________________END USER TURN______________________");
	}
	
	private void endSystemTurn(long timestamp){
		//end action
		lastSystemActionTimeStamp++;
		LOG.info(lastSystemActionTimeStamp + "\t   L1 :: GuiTurnTimingL: Sending End SystemAction");
		epool_.postEvent(efact_.createSystemActionEndEvent(), timestamp);
		
		//end turn
		lastSystemActionTimeStamp++;
		onSystemTurn = false;
		LOG.info(lastSystemActionTimeStamp + "\t   L1 :: GuiTurnTimingL: Sending End SystemTurn");
		epool_.postEvent(efact_.createEndSystemTurnEvent(), timestamp);
		LOG.info("\t___________________________________END SYSTEM TURN____________________");
	}

	@Override
	public LinkedList<Integer> registerTypes() {
		LinkedList<Integer> auxl = new java.util.LinkedList<Integer>();

		///register all the events included in the sets
		auxl.addAll(systemFeedbackEvents);
		auxl.addAll(systemActionEvents);
		auxl.addAll(userFeedbackEvents);
		auxl.addAll(userActionEvents);
		auxl.addAll(dialogueStartEvents);
		auxl.addAll(dialogueEndEvents);

		return auxl;
	}

}
