package org.mmi.model.instantiator.detail;


import org.apache.log4j.Logger;
import org.mmi.model.instantiator.InstantiationContext;
import org.mmi.model.instantiator.InstantiationFSM;
import org.mmi.model.instantiator.InstantiatorBase;
import org.mmi.utils.GenericFSM.FSMInvalidTransitionException;

/**
 * Instantiator for turn timing information.
 * It is used by the corresponding listeners to set this
 * information into the model instances
 * 
 * @author mateo-navarro.pedro
 *
 */
public class TurnTimingInstantiator extends InstantiatorBase {

	/**
	 * Constructor
	 * @param c instantiation context
	 */
	public TurnTimingInstantiator(InstantiationContext c) {
		super(c);
	}

	final Logger LOG = Logger.getLogger(TurnTimingInstantiator.class);
	
	///
	/// Dialogue and turn timing methods
	///

	/**
	 * base time of the turn
	 */
	private long turnBasetime_;

	///
	/// methods
	///

	/**
	 * method used to indicate that the dialogue has started
	 * @param timestamp time in which this action is performed
	 */
	public void startDialogue(long timestamp){
		try {
			//change state in the FSM
			icontext_.state.doTransition(InstantiationFSM.event_t.START_DIALOGUE.value);
			//create a new dialogue
			icontext_.dialogue = icontext_.mfact.createDialogue();
			icontext_.dialogue.setDescription("Empty description.");//TODO
			icontext_.dialogue.setBaseTimestamp(0);//TODO
			icontext_.droot.setDialogue(icontext_.dialogue);
			//add task information
			icontext_.dialogue.setTask(icontext_.mfact.createTask());
			icontext_.dialogue.getTask().setAvm(icontext_.mfact.createAvm());
			//set internal base time
			turnBasetime_ = timestamp;
		} catch (FSMInvalidTransitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	/**
	 * method used to indicate that the dialogue has ended
	 * @param timestamp time in which this action is performed
	 */
	public void endDialogue(long timestamp){
		try {
			//change state in the FSM
			icontext_.state.doTransition(InstantiationFSM.event_t.END_DIALOGUE.value);
			//do things
			//TODO
		} catch (FSMInvalidTransitionException e) {
			e.printStackTrace();
		}
	}

	/**
	 * method used to indicate that the system turn has started
	 * @param timestamp time in which this action is performed
	 */
	public void startSystemTurn(long timestamp){
		try {
			//change state in the FSM
			icontext_.state.doTransition(InstantiationFSM.event_t.TO_SYSTEM_TURN.value);
			//create a complete and new dialogue step: system turn + user turn
			icontext_.dstep = icontext_.mfact.createDialogueStepT();
			///
			/// system turn
			///
			icontext_.sturn = icontext_.mfact.createSystemTurn();
			icontext_.dstep.setSystemTurn(icontext_.sturn);
			//add a metacomm object to the system turn
			icontext_.sturn.setMetacomm(icontext_.mfact.createSystemMetacomm());
			//add a modality object to the system turn
			icontext_.sturn.setModality(icontext_.mfact.createModalityInfo());
			icontext_.sturn.getModality().setSynchroni(icontext_.mfact.createModalitySynchroni());
			icontext_.sturn.getModality().setAppropriateness(icontext_.mfact.createModalityAppropriateness());
			icontext_.sturn.getModality().setChange(icontext_.mfact.createModalityChange());
			//add speech output and cooperativity objects
			icontext_.sturn.setSpeechOutput(icontext_.mfact.createSpeechOutput());
			icontext_.sturn.setCooperativity(icontext_.mfact.createCooperativity());
			///
			/// user turn
			///
			icontext_.uturn = icontext_.mfact.createUserTurn();
			icontext_.dstep.setUserTurn(icontext_.uturn);
			//add a metacomm object to the user turn
			icontext_.uturn.setMetacomm(icontext_.mfact.createUserMetacomm());
			//add a modality object to the system turn
			icontext_.uturn.setModality(icontext_.mfact.createModalityInfo());
			icontext_.uturn.getModality().setSynchroni(icontext_.mfact.createModalitySynchroni());
			icontext_.uturn.getModality().setAppropriateness(icontext_.mfact.createModalityAppropriateness());
			icontext_.uturn.getModality().setChange(icontext_.mfact.createModalityChange());
			//add speech input and GUI input objects
			icontext_.uturn.setGuiInput(icontext_.mfact.createGuiInput());
			icontext_.uturn.setSpeechInput(icontext_.mfact.createSpeechInput());
			
			
			///
			///set system turn as the current turn
			icontext_.cturn = icontext_.sturn;
			
			///
			//set base time to turn
			turnBasetime_ = timestamp;
		} catch (FSMInvalidTransitionException e) {
			e.printStackTrace();
		}
	}

	/**
	 * method used to indicate that the system turn has ended
	 * @param timestamp time in which this action is performed
	 */
	public void endSystemTurn(long timestamp){
		if (icontext_.state.inState(InstantiationFSM.state_t.SYSTEM_TURN.value)){
			//TODO
		}
		else{
			assert(false);//TODO
		}
	}

	/**
	 * method used to indicate that the user turn has started
	 * @param timestamp time in which this action is performed
	 */
	public void startUserTurn(long timestamp){
		try {
			//change state in the FSM
			icontext_.state.doTransition(InstantiationFSM.event_t.TO_USER_TURN.value);
			//Note that the user turn object was created earlier!!!
			
			//set user turn as the current turn
			icontext_.cturn = icontext_.uturn;
			
			//set base time to turn
			turnBasetime_ = timestamp;
		} catch (FSMInvalidTransitionException e) {
			e.printStackTrace();
		}
	}

	/**
	 * method used to indicate that the user turn has ended
	 * @param timestamp time in which this action is performed
	 */
	public void endUserTurn(long timestamp){
		if (icontext_.state.inState(InstantiationFSM.state_t.USER_TURN.value)){
			//add the dialogue step to the main dialogue
			icontext_.dialogue.getStep().add(icontext_.dstep);
		}
		else{
			assert(false);//TODO
		}
	}

	/**
	 * method used to indicate that the feedback has started
	 * @param timestamp time in which this action is performed
	 */
	public void feedbackStart(long timestamp){
		//calculate feedback delay
		long fdelay = timestamp - turnBasetime_;
		//set feedback delay time to the current turn
		icontext_.cturn.setFeedbackDelay(fdelay);
		
		//_printTimes("Feedback Start...",timestamp);
	}

	/**
	 * method used to indicate that the action has started
	 * @param timestamp time in which this action is performed
	 */
	public void actionStart(long timestamp){
		//if feedbackDelay is not set, then no feedback
		// -> feedbackDelay = timestamp - turnBase timestamp
		// -> feedbackDuration = 0
		if ( !icontext_.cturn.isSetFeedbackDelay() ) {
			icontext_.cturn.setFeedbackDelay(timestamp - turnBasetime_);
			icontext_.cturn.setFeedbackDuration(0);
		}
		
		// if feedbackDelay != 0, then
		// -> feedbackDuration = timestamp - turnBasetime_ - feedbackDelay
		else {
			icontext_.cturn.setFeedbackDuration(timestamp - turnBasetime_ - icontext_.cturn.getFeedbackDelay());
		}
		
		//_printTimes("Action Start...",timestamp);
	}
	
	/**
	 * method used to indicate that the action has ended
	 * @param timestamp time in which this action is performed
	 */
	public void actionEnd(long timestamp){
		//set the actionDuration time
		long actionDurationTime = timestamp - turnBasetime_ - icontext_.cturn.getFeedbackDelay() - icontext_.cturn.getFeedbackDuration();
		icontext_.cturn.setActionDuration(actionDurationTime);
		
		_printTimes("Action End...",timestamp);
	}
	
	private void _printTimes(String message, long timestamp){
		LOG.debug("\t=====================================");
		LOG.debug("\t@ " + message);
		LOG.debug("\t| base = " + turnBasetime_);
		LOG.debug("\t| current = " + timestamp);
		LOG.debug("\t| f.delay =" + icontext_.cturn.getFeedbackDelay());
		LOG.debug("\t| f.duration =" + icontext_.cturn.getFeedbackDuration());
		LOG.debug("\t| a.duration =" + icontext_.cturn.getActionDuration());
		LOG.debug("\t=====================================");
	}
}
