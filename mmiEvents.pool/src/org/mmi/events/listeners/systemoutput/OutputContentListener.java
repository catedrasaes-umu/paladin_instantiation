package org.mmi.events.listeners.systemoutput;

import java.util.LinkedList;

import org.apache.log4j.Logger;
import org.mmi.events.Event;
import org.mmi.events.ScreenContentEvent;
import org.mmi.events.SpeechOutputContentEvent;
import org.mmi.events.event_t;
import org.mmi.events.factory.EventFactory;
import org.mmi.events.listeners.EndTurnPushingListener;
import org.mmi.events.pool.EventPool;
import org.mmi.model.instantiator.MmiModelInstantiator;
import org.mmi.model.instantiator.detail.TurnContentInstantiator;

/**
 * Listener used to collect turn-content-related events and set
 * the corresponding data into the model instance using the 
 * corresponding instantiator.
 * 
 * @author mateo-navarro.pedro
 *
 */
public class OutputContentListener extends EndTurnPushingListener {

	private final static Logger LOG = Logger.getLogger(OutputContentListener.class);
	
	public OutputContentListener(EventPool epool, EventFactory efact,
			MmiModelInstantiator inst) {
		super(epool, efact, inst);
		//
		_resetCounters();
		//
		tcinst_ = inst.turnContent;
	}
	
	private TurnContentInstantiator tcinst_;

	/**
	 * variables
	 */
	private int nelements_;
	private int nfeedback_;
	private int nconcepts_;
	private int nnoise_;
	private int nquestions_;

	private void _resetCounters(){
		nelements_ = 0;
		nfeedback_ = 0;
		nconcepts_ = 0;
		nnoise_ = 0;
		nquestions_ = 0;
	}

	/**
	 * 
	 */
	@Override
	public void onEvent(int type, Event e) {
		//do my work
		//"NEWELEMENTS" value="4001" />
		if (type == event_t.GUIELEMENTS.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L1 GUIELEMENTS");
			nelements_ += ((ScreenContentEvent)e).getNitems();
			}
		else if (type == event_t.SPEECHELEMENTS.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L1 SPEECHELEMENTS");
			nelements_ += ((SpeechOutputContentEvent)e).getNitems();
		}
		
		//"NEWFEEDBACKELEMENTS" value="4002" />
		else if (type == event_t.GUIFEEDBACK.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L1 GUIFEEDBACK");
			nfeedback_ += ((ScreenContentEvent)e).getNitems();
		}
		else if (type == event_t.SPEECHFEEDBACK.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L1 SPEECHFEEDBACK");
			nfeedback_ += ((SpeechOutputContentEvent)e).getNitems();
		}
		
		//"NEWCONCEPTS" value="4003" />
		else if (type == event_t.GUICONCEPTS.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L1 GUICONCEPTS");
			nconcepts_ += ((ScreenContentEvent)e).getNitems();
		}
		else if (type == event_t.SPEECHCONCEPTS.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L1 SPEECHCONCEPTS");
			nconcepts_ += ((SpeechOutputContentEvent)e).getNitems();
		}
		
		//"NEWNOISE" value="4004" />
		else if (type == event_t.GUINOISE.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L1 GUINOISE");
			nnoise_ += ((ScreenContentEvent)e).getNitems();
		}
		else if (type == event_t.SPEECHNOISE.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L1 SPEECHNOISE");
			nnoise_ += ((SpeechOutputContentEvent)e).getNitems();
		}
		
		//"NEWQUESTIONS" value="4005" />
		else if (type == event_t.GUIQUESTIONS.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L1 GUIQUESTIONS");
			nquestions_ += ((ScreenContentEvent)e).getNitems();
		}
		else if (type == event_t.SPEECHQUESTIONS.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L1 SPEECHQUESTIONS");
			nquestions_ += ((SpeechOutputContentEvent)e).getNitems();
		}

		//call parent method
		super.onEvent(type, e);
	}

	@Override 
	public void doWork(Event e) {
		//commit data for Turn Content
		//number of total elements
		tcinst_.addElements(nelements_);
		tcinst_.addFeedback(nfeedback_);
		tcinst_.addConcepts(nconcepts_);
		tcinst_.addNoise(nnoise_);
		tcinst_.addQuestions(nquestions_);
		
		LOG.info(e.getTimestamp() + "\t   L1 :: TurnContentL: Work done.");

		//and reset counters
		_resetCounters();
	}

	@Override
	public LinkedList<Integer> registerTypes() {
		LinkedList<Integer> auxl = new java.util.LinkedList<Integer>();
		//add own events
		auxl.add(event_t.GUIELEMENTS.getValue());
		auxl.add(event_t.GUIFEEDBACK.getValue());
		auxl.add(event_t.GUICONCEPTS.getValue());
		auxl.add(event_t.GUINOISE.getValue());
		auxl.add(event_t.GUIQUESTIONS.getValue());
		auxl.add(event_t.SPEECHELEMENTS.getValue());
		auxl.add(event_t.SPEECHFEEDBACK.getValue());
		auxl.add(event_t.SPEECHCONCEPTS.getValue());
		auxl.add(event_t.SPEECHNOISE.getValue());
		auxl.add(event_t.SPEECHQUESTIONS.getValue());

		//add pushing events
		auxl.addAll(getPushingEvents());

		return auxl;
	}

}
