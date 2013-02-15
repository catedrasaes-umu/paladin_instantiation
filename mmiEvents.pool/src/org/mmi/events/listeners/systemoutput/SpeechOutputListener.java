package org.mmi.events.listeners.systemoutput;

import java.util.LinkedList;

import org.apache.log4j.Logger;
import org.mmi.events.Event;
import org.mmi.events.event_t;
import org.mmi.events.factory.EventFactory;
import org.mmi.events.listeners.EventPoolListener;
import org.mmi.events.pool.EventPool;
import org.mmi.model.PromptTypeT;
import org.mmi.model.instantiator.MmiModelInstantiator;
import org.mmi.model.instantiator.detail.SpeechOutputInstantiator;

/**
 * Listener used to collect speech-output-related events and set
 * the corresponding data into the model instance using the 
 * corresponding instantiator.
 * 
 * @author mateo-navarro.pedro
 *
 */
public class SpeechOutputListener extends EventPoolListener {
	
	private final static Logger LOG = Logger.getLogger(SpeechOutputListener.class);

	public SpeechOutputListener(EventPool epool, EventFactory efact,
			MmiModelInstantiator inst) {
		super(epool, efact, inst);
		//
		soinst_ = inst.speechOutput;
	}

	private SpeechOutputInstantiator soinst_;

	@Override
	public void onEvent(int type, Event e) {
		//"CORRECTANSWER" value="6001" />
		if (type == event_t.CORRECTANSWER.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L1 CORRECTANSWER");
			soinst_.addCorrectAnswers(1);
		}
		//"INCORRECTANSWER" value="6002" />
		else if (type == event_t.INCORRECTANSWER.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L1 INCORRECTANSWER");
			soinst_.addIncorrectAnswers(1);
		}
		//"PARTIALLYCORRECTANSWER" value="6003" />
		else if (type == event_t.PARTIALLYCORRECTANSWER.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L1 PARTIALLYCORRECTANSWER");
			soinst_.addPartiallyCorrectAnswers(1);
		}
		//"NOTANSWER" value="6004" />
		else if (type == event_t.NOTANSWER.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L1 NOTANSWER");
			soinst_.addNoAnswers(1);
		}
		///
		///
		//"OPENPROMPT" value="6005" />
		else if (type == event_t.OPENPROMPT.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L1 OPENPROMPT");
			soinst_.setPromptType(PromptTypeT.OPEN);
		}
		//"HALFOPENPROMPT" value="6006" />
		else if (type == event_t.HALFOPENPROMPT.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L1 HALFOPENPROMPT");
			soinst_.setPromptType(PromptTypeT.HALFOPEN);
		}
		//"CLOSEDPROMPT" value="6007" />
		else if (type == event_t.CLOSEDPROMPT.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L1 CLOSEDPROMPT");
			soinst_.setPromptType(PromptTypeT.CLOSED);
		}
		//"NOQUESTIONPROMPT" value="6008" />
		else if (type == event_t.NOQUESTIONPROMPT.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L1 NOQUESTIONPROMPT");
			soinst_.setPromptType(PromptTypeT.NOQUESTION);
		}

	}

	@Override
	public LinkedList<Integer> registerTypes() {
		//"CORRECTANSWER" value="6001" />
		//"INCORRECTANSWER" value="6002" />
		//"PARTIALLYCORRECTANSWER" value="6003" />
		//"NOTANSWER" value="6004" />
		//"OPENPROMPT" value="6005" />
		//"HALFOPENPROMPT" value="6006" />
		//"CLOSEDPROMPT" value="6007" />
		//"NOQUESTIONPROMPT" value="6008" />

		LinkedList<Integer> auxl = new java.util.LinkedList<Integer>();
		//add own events
		auxl.add(event_t.CORRECTANSWER.getValue());
		auxl.add(event_t.INCORRECTANSWER.getValue());
		auxl.add(event_t.PARTIALLYCORRECTANSWER.getValue());
		auxl.add(event_t.NOTANSWER.getValue());
		auxl.add(event_t.OPENPROMPT.getValue());
		auxl.add(event_t.HALFOPENPROMPT.getValue());
		auxl.add(event_t.CLOSEDPROMPT.getValue());
		auxl.add(event_t.NOQUESTIONPROMPT.getValue());

		return auxl;
	}

}
