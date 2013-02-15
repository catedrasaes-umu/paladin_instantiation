package org.mmi.model.instantiator;

import org.mmi.utils.GenericFSM;

/**
 * This class represents the FSM that holds all the
 * states and transitions during the model instantiation
 * process
 *  
 * @author mateo-navarro.pedro
 *
 */
public class InstantiationFSM extends GenericFSM {

	public InstantiationFSM() throws FSMIntegrityException {
		super();
	}
	
	/**
	 * Instantiation states
	 * @author mateo-navarro.pedro
	 *
	 */
	public enum state_t{
		START(10), 
		DIALOGUE_STARTED(11), 
		SYSTEM_TURN(12), 
		USER_TURN(13), 
		DIALOGUE_ENDED(14), 
		END(15);

		public final int value;
		state_t(int i) {
			this.value = i;
		}
	}

	@Override
	public int getInitialState() {
		return state_t.START.value;
	}

	@Override
	public int getFinalState() {
		return state_t.END.value;
	}

	@Override
	public void fillStates() {
		states_.add(state_t.START.value);
		states_.add(state_t.DIALOGUE_STARTED.value);
		states_.add(state_t.SYSTEM_TURN.value);
		states_.add(state_t.USER_TURN.value);
		states_.add(state_t.DIALOGUE_ENDED.value);
		states_.add(state_t.END.value);
	}
	
	/**
	 * Event types
	 * @author mateo-navarro.pedro
	 *
	 */
	public enum event_t{
		START_DIALOGUE(21), TO_SYSTEM_TURN(22), 
		TO_USER_TURN(23), END_DIALOGUE(24),
		END_INSTANTIATION(25);

		public final int value;
		event_t(int i) {
			this.value = i;
		}
	}

	@Override
	public void fillEvents() {
		events_.add(event_t.START_DIALOGUE.value);
		events_.add(event_t.TO_SYSTEM_TURN.value);
		events_.add(event_t.TO_USER_TURN.value);
		events_.add(event_t.END_DIALOGUE.value);
		events_.add(event_t.END_INSTANTIATION.value);
	}

	@Override
	public void fillTransitions() {
		//from start
		addTransition(event_t.START_DIALOGUE.value, 
				state_t.START.value, 
				state_t.DIALOGUE_STARTED.value);
		//from dialogue started
		addTransition(event_t.TO_SYSTEM_TURN.value, 
				state_t.DIALOGUE_STARTED.value, 
				state_t.SYSTEM_TURN.value);
		addTransition(event_t.TO_USER_TURN.value, 
				state_t.DIALOGUE_STARTED.value, 
				state_t.USER_TURN.value);
		//from system turn
		addTransition(event_t.TO_USER_TURN.value, 
				state_t.SYSTEM_TURN.value, 
				state_t.USER_TURN.value);
		addTransition(event_t.END_DIALOGUE.value, 
				state_t.SYSTEM_TURN.value, 
				state_t.DIALOGUE_ENDED.value);
		//from user turn
		addTransition(event_t.TO_SYSTEM_TURN.value, 
				state_t.USER_TURN.value, 
				state_t.SYSTEM_TURN.value);
		addTransition(event_t.END_DIALOGUE.value, 
				state_t.USER_TURN.value, 
				state_t.DIALOGUE_ENDED.value);
		//from dialogue ended
		addTransition(event_t.START_DIALOGUE.value, 
				state_t.DIALOGUE_ENDED.value, 
				state_t.DIALOGUE_STARTED.value);
		addTransition(event_t.END_INSTANTIATION.value, 
				state_t.DIALOGUE_ENDED.value, 
				state_t.END.value);
	}

}
