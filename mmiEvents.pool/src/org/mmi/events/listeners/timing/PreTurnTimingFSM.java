package org.mmi.events.listeners.timing;

import org.mmi.utils.GenericFSM;

/**
 * FSM (Finite state machine) keeping the state of the
 * PreTurnTimingListener
 * 
 * @author mateo-navarro.pedro
 *
 */
public class PreTurnTimingFSM extends GenericFSM {

	public PreTurnTimingFSM() throws FSMIntegrityException {
		super();
	}

	@Override
	public int getInitialState() {
		return state_t.INIT.value;
	}

	@Override
	public int getFinalState() {
		return state_t.END_DIALOGUE.value;
	}

	public enum state_t{
		INIT(0),
		START_DIALOGUE(10),
		SYSTEM_FEEDBACK(11), SYSTEM_ACTION(12), 
		USER_FEEDBACK(13), USER_ACTION(14),  
		END_DIALOGUE(15);

		public final int value;
		state_t(int i) {
			this.value = i;
		}
	}

	@Override
	public void fillStates() {
		states_.add(state_t.INIT.value);
		states_.add(state_t.START_DIALOGUE.value);
		states_.add(state_t.SYSTEM_FEEDBACK.value);
		states_.add(state_t.SYSTEM_ACTION.value);
		states_.add(state_t.USER_FEEDBACK.value);
		states_.add(state_t.USER_ACTION.value);
		states_.add(state_t.END_DIALOGUE.value);
	}

	public enum event_t{
		START_DIALOGUE(20),
		SYSTEM_FEEDBACK(21), SYSTEM_ACTION(22), 
		USER_FEEDBACK(23), USER_ACTION(24),
		END_DIALOGUE(25);

		public final int value;
		event_t(int i) {
			this.value = i;
		}
	}

	@Override
	public void fillEvents() {
		events_.add(event_t.START_DIALOGUE.value);
		events_.add(event_t.SYSTEM_FEEDBACK.value);
		events_.add(event_t.SYSTEM_ACTION.value);
		events_.add(event_t.USER_FEEDBACK.value);
		events_.add(event_t.USER_ACTION.value);
		events_.add(event_t.END_DIALOGUE.value);
	}

	@Override
	public void fillTransitions() {
		///
		/// from init ///////////////////////////////////////
		///
		
		// to start dialogue
		addTransition(event_t.START_DIALOGUE.value, 
				state_t.INIT.value, 
				state_t.START_DIALOGUE.value);
		
		///
		/// from start //////////////////////////////////////
		///
		
		// to system states
		addTransition(event_t.SYSTEM_FEEDBACK.value, 
				state_t.START_DIALOGUE.value, 
				state_t.SYSTEM_FEEDBACK.value);
		addTransition(event_t.SYSTEM_ACTION.value, 
				state_t.START_DIALOGUE.value, 
				state_t.SYSTEM_ACTION.value);
		
		///
		/// from system feedback ////////////////////////////
		///
		
		// to system action
		addTransition(event_t.SYSTEM_ACTION.value, 
				state_t.SYSTEM_FEEDBACK.value, 
				state_t.SYSTEM_ACTION.value);
		
		// to user states
		addTransition(event_t.USER_FEEDBACK.value, 
				state_t.SYSTEM_FEEDBACK.value, 
				state_t.USER_FEEDBACK.value);
		addTransition(event_t.USER_ACTION.value, 
				state_t.SYSTEM_FEEDBACK.value, 
				state_t.USER_ACTION.value);
		
		// to end dialogue
		addTransition(event_t.END_DIALOGUE.value, 
				state_t.SYSTEM_FEEDBACK.value, 
				state_t.END_DIALOGUE.value);
		
		///
		/// from system action //////////////////////////////
		///
		
		// to user states
		addTransition(event_t.USER_FEEDBACK.value, 
				state_t.SYSTEM_ACTION.value, 
				state_t.USER_FEEDBACK.value);
		addTransition(event_t.USER_ACTION.value, 
				state_t.SYSTEM_ACTION.value, 
				state_t.USER_ACTION.value);
		
		// to end dialogue
		addTransition(event_t.END_DIALOGUE.value, 
				state_t.SYSTEM_ACTION.value, 
				state_t.END_DIALOGUE.value);
		
		///
		/// from user feedback //////////////////////////////
		///
		
		// to user action
		addTransition(event_t.USER_ACTION.value, 
				state_t.USER_FEEDBACK.value, 
				state_t.USER_ACTION.value);
		
		// to system states
		addTransition(event_t.SYSTEM_FEEDBACK.value, 
				state_t.USER_FEEDBACK.value, 
				state_t.SYSTEM_FEEDBACK.value);
		addTransition(event_t.SYSTEM_ACTION.value, 
				state_t.USER_FEEDBACK.value, 
				state_t.SYSTEM_ACTION.value);
		
		// to end dialogue
		addTransition(event_t.END_DIALOGUE.value, 
				state_t.USER_FEEDBACK.value, 
				state_t.END_DIALOGUE.value);
		
		///
		/// from user action ////////////////////////////////
		///
		
		// to system states
		addTransition(event_t.SYSTEM_FEEDBACK.value, 
				state_t.USER_ACTION.value, 
				state_t.SYSTEM_FEEDBACK.value);
		addTransition(event_t.SYSTEM_ACTION.value, 
				state_t.USER_ACTION.value, 
				state_t.SYSTEM_ACTION.value);
		
		// to end dialogue
		addTransition(event_t.END_DIALOGUE.value, 
				state_t.USER_ACTION.value, 
				state_t.END_DIALOGUE.value);
	}

}
