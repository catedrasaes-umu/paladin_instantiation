package org.mmi.events.listeners.timing;

import java.util.LinkedList;

import org.apache.log4j.Logger;
import org.mmi.events.Event;
import org.mmi.events.event_t;
import org.mmi.events.factory.EventFactory;
import org.mmi.events.listeners.EventPoolListener;
import org.mmi.events.pool.EventPool;
import org.mmi.model.instantiator.MmiModelInstantiator;
import org.mmi.model.instantiator.detail.TurnTimingInstantiator;

/**
 * Listener used to collect turn-timing-related events and set
 * the corresponding data into the model instance using the 
 * corresponding instantiator.
 * 
 * @author mateo-navarro.pedro
 *
 */
public class TurnTimingListener extends EventPoolListener {
	
	private final static Logger LOG = Logger.getLogger(TurnTimingListener.class);

	public TurnTimingListener(EventPool epool, EventFactory efact, MmiModelInstantiator inst){
		//set instantiators
		super(epool, efact, inst);
		minst_ = inst.turnControl;
	}

	private TurnTimingInstantiator minst_;

	@Override
	public void onEvent(int type, Event e) {
		if (type == event_t.STARTSYSTEMTURN.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L2 STARTSYSTEMTURN ");
			minst_.startSystemTurn(e.getTimestamp());
		}
		else if (type == event_t.SYSTEMFEEDBACKSTART.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L2 SYSTEMFEEDBACKSTART ");
			minst_.feedbackStart(e.getTimestamp());
		}
		else if (type == event_t.SYSTEMACTIONSTART.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L2 SYSTEMACTIONSTART ");
			minst_.actionStart(e.getTimestamp());
		}
		else if (type == event_t.SYSTEMACTIONEND.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L2 SYSTEMACTIONEND ");
			minst_.actionEnd(e.getTimestamp());
		}
		else if (type == event_t.ENDSYSTEMTURN.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L2 ENDSYSTEMTURN ");
			minst_.endSystemTurn(e.getTimestamp());
		}
		//
		else if (type == event_t.STARTUSERTURN.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L2 STARTUSERTURN ");
			minst_.startUserTurn(e.getTimestamp());
		}
		else if (type == event_t.USERFEEDBACKSTART.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L2 USERFEEDBACKSTART ");
			minst_.feedbackStart(e.getTimestamp());
		}
		else if (type == event_t.USERACTIONSTART.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L2 USERACTIONSTART ");
			minst_.actionStart(e.getTimestamp());
		}
		else if (type == event_t.USERACTIONEND.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L2 USERACTIONEND ");
			minst_.actionEnd(e.getTimestamp());
		}
		else if (type == event_t.ENDUSERTURN.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L2 ENDUSERTURN ");
			minst_.endUserTurn(e.getTimestamp());
		}
		//
		else if (type == event_t.STARTDIALOGUE.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L2 STARTDIALOGUE ");
			minst_.startDialogue(e.getTimestamp());
		}
		else if (type == event_t.ENDDIALOGUE.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L2 ENDDIALOGUE ");
			minst_.endDialogue(e.getTimestamp());
		}
	}

	@Override
	public LinkedList<Integer> registerTypes() {
		LinkedList<Integer> auxl = new java.util.LinkedList<Integer>();
		auxl.add(event_t.STARTSYSTEMTURN.getValue());
		auxl.add(event_t.SYSTEMFEEDBACKSTART.getValue());
		auxl.add(event_t.SYSTEMACTIONSTART.getValue());
		auxl.add(event_t.SYSTEMACTIONEND.getValue());
		auxl.add(event_t.ENDSYSTEMTURN.getValue());
		//
		auxl.add(event_t.STARTUSERTURN.getValue());
		auxl.add(event_t.USERFEEDBACKSTART.getValue());
		auxl.add(event_t.USERACTIONSTART.getValue());
		auxl.add(event_t.USERACTIONEND.getValue());
		auxl.add(event_t.ENDUSERTURN.getValue());
		//
		auxl.add(event_t.STARTDIALOGUE.getValue());
		auxl.add(event_t.ENDDIALOGUE.getValue());

		return auxl;
	}

}
