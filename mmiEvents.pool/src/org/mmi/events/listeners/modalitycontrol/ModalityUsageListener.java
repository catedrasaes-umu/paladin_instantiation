package org.mmi.events.listeners.modalitycontrol;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import org.apache.log4j.Logger;
import org.mmi.events.Event;
import org.mmi.events.event_t;
import org.mmi.events.factory.EventFactory;
import org.mmi.events.listeners.EndTurnPushingListener;
import org.mmi.events.listeners.metacomm.MetacommListener;
import org.mmi.events.pool.EventPool;
import org.mmi.model.McReasonT;
import org.mmi.model.MmiTypeT;
import org.mmi.model.ModTypeT;
import org.mmi.model.RoleT;
import org.mmi.model.instantiator.MmiModelInstantiator;
import org.mmi.model.instantiator.detail.ModalityInstantiator;

/**
 * Listener used to collect different modality events and set
 * the corresponding modality meta-info into the model instance
 * using the corresponding instantiator.
 * 
 * @author mateo-navarro.pedro
 *
 */
public class ModalityUsageListener extends EndTurnPushingListener {

	private final static Logger LOG = Logger.getLogger(MetacommListener.class); 
	
	private ModalityInstantiator moinst_;
	
	//
	// Event registers
	//
	private Set<Integer> speechInSet;
	private Set<Integer> visualInSet;
	private Set<Integer> gestureInSet;

	private Set<Integer> speechOutSet;
	private Set<Integer> visualOutSet;
	private Set<Integer> gestureOutSet;
	
	/**
	 * Events leading to a reset of the modality usage flags
	 */
	private Set<Integer> resetEvents;

	///
	/// event handling - control modality changes
	///

	private ModTypeT lastUserMod_;
	private ModTypeT lastSystemMod_;
	private boolean lastUserModSet_;
	private boolean lastSystemModSet_;

	private boolean speechUsed_;
	private boolean visualUsed_;
	private boolean gestureUsed_;

	private boolean onUserTurn;
	private boolean onSystemTurn;
	
	

	public ModalityUsageListener(EventPool epool, EventFactory efact, MmiModelInstantiator inst) {
		super(epool, efact, inst);
		//
		_initializeSets();
		//
		lastUserModSet_ = false;
		lastSystemModSet_ = false;
		//
		moinst_ = inst.modality;
	}

	private void resetFlags() {
		speechUsed_ = false;
		visualUsed_ = false;
		gestureUsed_ = false;

		onUserTurn = false;
		onSystemTurn = false;
	}

	@Override
	public void onEvent(int type, Event e) {
		//do my work
		
		
		/*
		 *  When system turn or user turn starts reset the  modality usage flags. Modality
		 *  usage is logged on system turn end user turn level. Thus, there is no need to set 
		 *  an already enabled modality to false during a system turn or user turn. The logical
		 *  conclusion is to reset the flags at the start OR end of system/user turn. 
		 *  We do it at the beginning, in order to decouple system and user turn. 
		 */
		//
		if(resetEvents.contains(e.getType())) {
			resetFlags();
		}

		// input -> on user turn...
		if (speechInSet.contains(e.getType())){
			speechUsed_ = true;
			onUserTurn = true;
		}
		else if (visualInSet.contains(e.getType())){
			visualUsed_ = true;
			onUserTurn = true;
		}
		else if (gestureInSet.contains(e.getType())){
			gestureUsed_ = true;
			onUserTurn = true;
		}

		/// output
		else if (speechOutSet.contains(e.getType())){
			speechUsed_ = true;
			onSystemTurn = true;
		}
		else if (visualOutSet.contains(e.getType())){
			visualUsed_ = true;
			onSystemTurn = true;
		}
		else if (gestureOutSet.contains(e.getType())){
			gestureUsed_ = true;
			onSystemTurn = true;
		}

		//call parent method
		super.onEvent(type, e);
	}

	///
	/// end turn work
	///

	@Override
	public void doWork(Event e) {
		
		//decide used modalities and multimodal interaction type
		ModTypeT currentMod;
		MmiTypeT mmiType;
		if (speechUsed_ && visualUsed_ && gestureUsed_){ 
			currentMod = ModTypeT.SVG;
			mmiType = MmiTypeT.COMPLEMENTARY;//TODO
			LOG.info(e.getTimestamp() + "\t   L1 :: ModalityUsageL: SVG modality.");
		}
		else if (visualUsed_ && gestureUsed_){ 
			currentMod = ModTypeT.VG;
			mmiType = MmiTypeT.COMPLEMENTARY;//TODO
			LOG.info(e.getTimestamp() + "\t   L1 :: ModalityUsageL: VG modality.");
		}
		else if (speechUsed_  && gestureUsed_){ 
			currentMod = ModTypeT.SG;
			mmiType = MmiTypeT.COMPLEMENTARY;//TODO
			LOG.info(e.getTimestamp() + "\t   L1 :: ModalityUsageL: SG modality.");
		}
		else if (speechUsed_ && visualUsed_){ 
			currentMod = ModTypeT.SV;
			mmiType = MmiTypeT.COMPLEMENTARY;//TODO
			LOG.info(e.getTimestamp() + "\t   L1 :: ModalityUsageL: SV modality.");
		}
		else if (speechUsed_){ 
			currentMod = ModTypeT.S;
			mmiType = MmiTypeT.UNIMODAL;
			LOG.info(e.getTimestamp() + "\t   L1 :: ModalityUsageL: S modality.");
		}
		else if (visualUsed_){ 
			currentMod = ModTypeT.V;
			mmiType = MmiTypeT.UNIMODAL;
			LOG.info(e.getTimestamp() + "\t   L1 :: ModalityUsageL: V modality.");
		}
		else if (gestureUsed_){ 
			currentMod = ModTypeT.G;
			mmiType = MmiTypeT.UNIMODAL;
			LOG.info(e.getTimestamp() + "\t   L1 :: ModalityUsageL: G modality.");
		}
		else{
			try {
				throw new Exception("ModalityUsageListener :: No modality selected.");
			} catch (Exception ex) {
				ex.printStackTrace();
				resetFlags();
				return;
			}
		}
		
		//error if information from two turns was received
		if (onSystemTurn && onUserTurn) {
			try {
				throw new Exception("ModalityUsageListener :: input and output data were collected in the same turn.");
			} catch (Exception ex) {
				LOG.error(ex);
				resetFlags();
				return;
			}
		}
		
		///
		/// if not error, set information in the model instance
		
		//input/output type
		moinst_.setModalityType(currentMod);
		//mmi type
		moinst_.setMultimodalInteractionType(mmiType);//TODO
		
		//check if modality change
		if (onSystemTurn && lastSystemModSet_ 
				&& (currentMod != lastSystemMod_)){
			moinst_.setModalityChange(RoleT.SYSTEM, McReasonT.SYSTEMDECISION);
			LOG.info(e.getTimestamp() + "\t   L1 :: ModalityUsageL: Modality change in the System turn.");
		}
		else if (onUserTurn && lastUserModSet_ 
				&& (currentMod != lastUserMod_)){
			moinst_.setModalityChange(RoleT.USER, McReasonT.USERDECISION);
			LOG.info(e.getTimestamp() + "\t   L1 :: ModalityUsageL: Modality change in the User turn.");
		}


		//update some data for the next time
		if (onSystemTurn){
			lastSystemMod_ = currentMod;
			lastSystemModSet_ = true;
		} else if (onUserTurn) {
			lastUserMod_ = currentMod;
			lastUserModSet_ = true;
		}

		LOG.info(e.getTimestamp() + "\t   L1 :: ModalityUsageL: Work done.");
	}

	///
	/// event registration
	///

	private void _initializeSets(){
		///
		/// speech events
		///
		//input
		speechInSet = new HashSet<Integer>();
		speechInSet.add(event_t.OVERALLWORDS.getValue());
		speechInSet.add(event_t.SUBSTITUTEDWORDS.getValue());
		speechInSet.add(event_t.DELETEDWORDS.getValue());
		speechInSet.add(event_t.INSERTEDWORDS.getValue());
		speechInSet.add(event_t.OVERALLSENTENCES.getValue());
		speechInSet.add(event_t.SUBSTITUTEDSENTENCES.getValue());
		speechInSet.add(event_t.DELETEDSENTENCES.getValue());
		speechInSet.add(event_t.INSERTEDSENTENCES.getValue());
		speechInSet.add(event_t.OVERALLCONCEPTS.getValue());
		speechInSet.add(event_t.SUBSTITUTEDCONCEPTS.getValue());
		speechInSet.add(event_t.DELETEDCONCEPTS.getValue());
		speechInSet.add(event_t.INSERTEDCONCEPTS.getValue());
		//output
		speechOutSet = new HashSet<Integer>();
		speechOutSet.add(event_t.SPEECHELEMENTS.getValue());
		speechOutSet.add(event_t.SPEECHFEEDBACK.getValue());
		speechOutSet.add(event_t.SPEECHCONCEPTS.getValue());
		speechOutSet.add(event_t.SPEECHNOISE.getValue());
		speechOutSet.add(event_t.SPEECHQUESTIONS.getValue());

		///
		/// visual events
		///
		//input
		visualInSet = new HashSet<Integer>();
		visualInSet.add(event_t.NAVIGATIONMOVE.getValue());
		visualInSet.add(event_t.NAVIGATIONLENGTH.getValue());
		visualInSet.add(event_t.NAVIGATIONACTION.getValue());
		visualInSet.add(event_t.NAVIGATIONEXPLORE.getValue());
		visualInSet.add(event_t.TEXTWORD.getValue());
		visualInSet.add(event_t.TEXTCOMMAND.getValue());
		visualInSet.add(event_t.TEXTEXPLORE.getValue());
		//output
		visualOutSet = new HashSet<Integer>();
		visualOutSet.add(event_t.GUIELEMENTS.getValue());
		visualOutSet.add(event_t.GUIFEEDBACK.getValue());

		///
		/// gesture events
		///
		//input
		gestureInSet = new HashSet<Integer>();
		//output
		gestureOutSet = new HashSet<Integer>();
		
		//
		// reset flags events
		//
		resetEvents = new HashSet<Integer>();
		resetEvents.add(event_t.STARTUSERTURN.getValue());
		resetEvents.add(event_t.STARTSYSTEMTURN.getValue());

	}

	@Override
	public LinkedList<Integer> registerTypes() {
		
		LinkedList<Integer> auxl = new LinkedList<Integer>();
		
		//add events in sets
		auxl.addAll(speechInSet);
		auxl.addAll(speechOutSet);
		auxl.addAll(visualInSet);
		auxl.addAll(visualOutSet);
		auxl.addAll(gestureInSet);
		auxl.addAll(gestureOutSet);
		auxl.addAll(resetEvents);

		//add pushing events
		auxl.addAll(getPushingEvents());

		return auxl;
	}

}
