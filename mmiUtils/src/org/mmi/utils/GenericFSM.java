package org.mmi.utils;

import java.util.ArrayList;

/**
 * Generic Finite State Machine (FSM) implementation
 * 
 * @author mateo-navarro.pedro
 *
 */
public abstract class GenericFSM {

	/**
	 * Constructor
	 * @throws FSMIntegrityException
	 */
	public GenericFSM() throws FSMIntegrityException{
		events_ = new ArrayList<Integer>();
		fillEvents();
		states_ = new ArrayList<Integer>();
		fillStates();
		transitions_ = new ArrayList<Transition>();
		fillTransitions();
		checkIntegrity();
		currentState_ = getInitialState();
	}

	/**
	 * list of states
	 */
	protected ArrayList<Integer> states_;

	/**
	 * list of events
	 */
	protected ArrayList<Integer> events_;

	/**
	 * list of transitions
	 */
	protected ArrayList<Transition> transitions_;

	/**
	 * current state
	 */
	protected int currentState_;

	/**
	 * 
	 * @return current state
	 */
	public int getCurrentState() {
		return currentState_;
	}

	/**
	 * checks the current state
	 * @param state state to check
	 * @return true if the state to check is the current one
	 */
	public boolean inState(int state){
		return state == currentState_;
	}

	/**
	 * checks if the process is finished
	 * @return
	 */
	public boolean isEnded(){
		return currentState_ == getFinalState();
	}

	/**
	 * method to execute a transition
	 * @param event event which originates the transition
	 * @return true if the transition was performed
	 * @throws FSMInvalidTransitionException
	 */
	public boolean doTransition(int event) throws FSMInvalidTransitionException{
		//check event
		if (!events_.contains(event))
			throw (new FSMInvalidTransitionException(event));

		//do transition
		for (Transition t : transitions_){
			if (t.eventId == event && currentState_ == t.stateA){
				currentState_ = t.stateB;
				return true;
			}
		}
		return false;
	}
	
	/**
	 * method to check if a transition can be performed
	 * @param event event which originates the transition
	 * @return true if the transition can be performed
	 * @throws FSMInvalidTransitionException
	 */
	public boolean checkTransition(int event) throws FSMInvalidTransitionException{
		//check event
		if (!events_.contains(event))
			throw (new FSMInvalidTransitionException(event));

		//check transition
		for (Transition t : transitions_){
			if (t.eventId == event && currentState_ == t.stateA){
				//currentState_ = t.stateB; //transition is not performed
				return true;
			}
		}
		return false;
	}

	///
	///
	///

	/**
	 * Checks the integrity of the FSM configuration
	 * @throws FSMIntegrityException
	 */
	protected void checkIntegrity() throws FSMIntegrityException{
		//check init and end states
		if (!states_.contains(getInitialState()))
			throw (new FSMIntegrityException(getCurrentState()));
		if (!states_.contains(getFinalState()))
			throw (new FSMIntegrityException(getCurrentState()));
		//check transitions
		for (Transition t : transitions_){
			if (!events_.contains(t.eventId))
				throw (new FSMIntegrityException(getCurrentState()));
			if (!states_.contains(t.stateA))
				throw (new FSMIntegrityException(getCurrentState()));
			if (!states_.contains(t.stateB))
				throw (new FSMIntegrityException(getCurrentState()));
		}
	}

	/**
	 * Adds a new transition to the FSM
	 * @param event the event
	 * @param stateA the origin state
	 * @param stateB the destination state
	 */
	protected void addTransition(int event, int stateA, int stateB){
		transitions_.add(new Transition(event, stateA, stateB));
	}

	/**
	 * (abstract method to be redefined)
	 * @return initial state
	 */
	public abstract int getInitialState();
	
	/**
	 * (abstract method to be redefined)
	 * @return final state
	 */
	public abstract int getFinalState();
	
	/**
	 * (abstract method to be redefined)
	 * This method adds all the states to the corresponding list
	 */
	public abstract void fillStates();

	/**
	 * (abstract method to be redefined)
	 * This method adds all the events to the corresponding list
	 */
	public abstract void fillEvents();

	/**
	 * (abstract method to be redefined)
	 * This method adds all the transitions to the corresponding list
	 */
	public abstract void fillTransitions();

	/**
	 * Transition class (internal)
	 * @author mateo-navarro.pedro
	 *
	 */
	protected class Transition{

		Transition(int e, int sa, int sb){
			eventId = e;
			stateA = sa;
			stateB = sb;
		}

		/**
		 * origin state
		 */
		int stateA;

		/**
		 * destination state
		 */
		int stateB;

		/**
		 * event which fires the transitions
		 */
		int eventId;
	}

	/**
	 * Invalid transition Exeception
	 * @author mateo-navarro.pedro
	 *
	 */
	public class FSMInvalidTransitionException extends Exception {

		/**
		 * Constructor method
		 * @param cstate Current state
		 * @param dstate Destination state
		 */
		public FSMInvalidTransitionException(int event) {
			// call superclass constructor
			super("FSM Invalid Transition Exception. Code " + event);
		}

		/**
		 * exception ID
		 */
		private static final long serialVersionUID = 1L;
		
		/**
		 * the origin state of the transition
		 */
		public int currentState;
		
		/**
		 * destination state of the transition
		 */
		public int destinationState;
	}

	/**
	 * Integrity exception
	 * @author mateo-navarro.pedro
	 *
	 */
	public class FSMIntegrityException extends Exception {

		/**
		 * exception ID
		 */
		private static final long serialVersionUID = 1L;

		/**
		 * Constructor method
		 * @param cstate Current state
		 * @param dstate Destination state
		 */
		public FSMIntegrityException(int code) {
			// call superclass constructor
			super("FSM Integrity Exception. Code " + code);
		}
	}


}


