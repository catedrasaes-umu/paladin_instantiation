package org.mmi.events.listeners.userinput;

import java.util.LinkedList;

import org.apache.log4j.Logger;
import org.mmi.events.DeletedConceptsEvent;
import org.mmi.events.DeletedSentencesEvent;
import org.mmi.events.DeletedWordsEvent;
import org.mmi.events.Event;
import org.mmi.events.InsertedConceptsEvent;
import org.mmi.events.InsertedSentencesEvent;
import org.mmi.events.InsertedWordsEvent;
import org.mmi.events.OverallConceptsEvent;
import org.mmi.events.OverallSentencesEvent;
import org.mmi.events.OverallWordsEvent;
import org.mmi.events.SubstitutedConceptsEvent;
import org.mmi.events.SubstitutedSentencesEvent;
import org.mmi.events.SubstitutedWordsEvent;
import org.mmi.events.event_t;
import org.mmi.events.factory.EventFactory;
import org.mmi.events.listeners.UserTurnPushingListener;
import org.mmi.events.pool.EventPool;
import org.mmi.model.ParsingResultT;
import org.mmi.model.instantiator.MmiModelInstantiator;
import org.mmi.model.instantiator.detail.SpeechInputInstantiator;
import org.mmi.model.instantiator.detail.TurnContentInstantiator;

/**
 * Listener used to collect speech-input-related events and set
 * the corresponding data into the model instance using the 
 * corresponding instantiator.
 * 
 * @author mateo-navarro.pedro
 *
 */
public class SpeechInputListener extends UserTurnPushingListener {
	
	private final static Logger LOG = Logger.getLogger(SpeechInputListener.class);

	public SpeechInputListener(EventPool epool, EventFactory efact,
			MmiModelInstantiator inst) {
		super(epool, efact, inst);
		//
		_resetCounters();
		//
		speechInputInstantiator = inst.speechInput;
		turnConceptInstantiator = inst.turnContent;
	}
	
	private SpeechInputInstantiator speechInputInstantiator;
	private TurnContentInstantiator turnConceptInstantiator;
	
	/**
	 * counters
	 */
	private int overallWordsNumber;
	private int substitutedWordsNumber;
	private int deletedWordsNumber;
	private int insertedWordsNumber;
	private int overallSentencesNumber;
	private int substitutedSentencesNumber;
	private int deletedSentencesNumber;
	private int insertedSentencesNumber;
	private int overallConceptsNumber;
	private int substitutedConceptsNumber;
	private int deletedConceptsNumber;
	private int insertedConceptsNumber;
	
	private void _resetCounters(){
		overallWordsNumber = substitutedWordsNumber = deletedWordsNumber = insertedWordsNumber = overallSentencesNumber =
			substitutedSentencesNumber = deletedSentencesNumber = insertedSentencesNumber = overallConceptsNumber =
				substitutedConceptsNumber = deletedConceptsNumber = insertedConceptsNumber = 0;
	}

	/**
	 * 
	 */
	@Override
	public void onEvent(int type, Event e) {
		//"OVERALLWORDS" value="7001" />
		if (type == event_t.OVERALLWORDS.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L1 OVERALLWORDS");
			overallWordsNumber = overallWordsNumber + ((OverallWordsEvent)e).getNwords();
		}
		//"SUBSTITUTEDWORDS" value="7002" />
		else if (type == event_t.SUBSTITUTEDWORDS.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L1 SUBSTITUTEDWORDS");
			substitutedWordsNumber = substitutedWordsNumber + ((SubstitutedWordsEvent)e).getNwords();
		}
		//"DELETEDWORDS" value="7003" />
		else if (type == event_t.DELETEDWORDS.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L1 DELETEDWORDS");
			deletedWordsNumber = deletedWordsNumber + ((DeletedWordsEvent)e).getNwords();
		}
		//"INSERTEDWORDS" value="7004" />
		else if (type == event_t.INSERTEDWORDS.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L1 INSERTEDWORDS");
			insertedWordsNumber = insertedWordsNumber + ((InsertedWordsEvent)e).getNwords();
		}
		//"OVERALLSENTENCES" value="7005" />
		else if (type == event_t.OVERALLSENTENCES.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L1 OVERALLSENTENCES");
			overallSentencesNumber = overallSentencesNumber + ((OverallSentencesEvent)e).getNsentences();
		}
		//"SUBSTITUTEDSENTENCES" value="7006" />
		else if (type == event_t.SUBSTITUTEDSENTENCES.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L1 SUBSTITUTEDSENTENCES");
			substitutedSentencesNumber = substitutedSentencesNumber + ((SubstitutedSentencesEvent)e).getNsentences();
		}
		//"DELETEDSENTENCES" value="7007" />
		else if (type == event_t.DELETEDSENTENCES.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L1 DELETEDSENTENCES");
			deletedSentencesNumber = deletedSentencesNumber + ((DeletedSentencesEvent)e).getNsentences();
		}
		//"INSERTEDSENTENCES" value="7008" />
		else if (type == event_t.INSERTEDSENTENCES.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L1 INSERTEDSENTENCES");
			insertedSentencesNumber = insertedSentencesNumber + ((InsertedSentencesEvent)e).getNsentences();
		}
		//"OVERALLCONCEPTS" value="7009" />
		else if (type == event_t.OVERALLCONCEPTS.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L1 OVERALLCONCEPTS");
			overallConceptsNumber = overallConceptsNumber + ((OverallConceptsEvent)e).getNconcepts();
		}
		//"SUBSTITUTEDCONCEPTS" value="7010" />
		else if (type == event_t.SUBSTITUTEDCONCEPTS.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L1 SUBSTITUTEDCONCEPTS");
			substitutedConceptsNumber = substitutedConceptsNumber + ((SubstitutedConceptsEvent)e).getNconcepts();
		}
		//"DELETEDCONCEPTS" value="7011" />
		else if (type == event_t.DELETEDCONCEPTS.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L1 DELETEDCONCEPTS");
			deletedConceptsNumber = deletedConceptsNumber + ((DeletedConceptsEvent)e).getNconcepts();
		}
		//"INSERTEDCONCEPTS" value="7012" />
		else if (type == event_t.INSERTEDCONCEPTS.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L1 INSERTEDCONCEPTS");
			insertedConceptsNumber = insertedConceptsNumber + ((InsertedConceptsEvent)e).getNconcepts();
		}

		//"CORRECTLYPARSEDUTTERANCE" value="7013" />
		else if (type == event_t.CORRECTLYPARSEDUTTERANCE.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L1 CORRECTLYPARSEDUTTERANCE");
			speechInputInstantiator.setParsingResult(ParsingResultT.CORRECTLYUNDERSTOOD);
		}
		//"PARTIALLYPARSEDUTTERANCE" value="7014" />
		else if (type == event_t.PARTIALLYPARSEDUTTERANCE.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L1 PARTIALLYPARSEDUTTERANCE");
			speechInputInstantiator.setParsingResult(ParsingResultT.PARTIALLYUNDERSTOOD);
		}
		//"INCORRECTLYPARSEDUTTERANCE" value="7015" />
		else if (type == event_t.INCORRECTLYPARSEDUTTERANCE.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L1 INCORRECTLYPARSEDUTTERANCE");
			speechInputInstantiator.setParsingResult(ParsingResultT.NOTHINGUNDERSTOOD);
		}

		//call parent method
		super.onEvent(type, e);
	}

	@Override
	public void doWork(Event e) {
		//commit data for Speech input
		speechInputInstantiator.setOverallWords(overallWordsNumber);
		speechInputInstantiator.setSubstitutedWords(substitutedWordsNumber);
		speechInputInstantiator.setDeletedWords(deletedWordsNumber);
		speechInputInstantiator.setInsertedWords(insertedWordsNumber);
		speechInputInstantiator.setOverallSentences(overallSentencesNumber);
		speechInputInstantiator.setSubstitutedSentences(substitutedSentencesNumber);
		speechInputInstantiator.setDeletedSentences(deletedSentencesNumber);
		speechInputInstantiator.setInsertedSentences(insertedSentencesNumber);
		speechInputInstantiator.setOverallConcepts(overallConceptsNumber);
		speechInputInstantiator.setSubstitutedConcepts(substitutedConceptsNumber);
		speechInputInstantiator.setDeletedConcepts(deletedConceptsNumber);
		speechInputInstantiator.setInsertedConcepts(insertedConceptsNumber);
		
		//commit data for Turn content
		turnConceptInstantiator.addElements(overallWordsNumber);
		turnConceptInstantiator.addConcepts(overallConceptsNumber);
		
		LOG.info(e.getTimestamp() + "\t   L1 :: SpeechInputL: Work done.");

		//and reset counters
		_resetCounters();
	}

	@Override
	public LinkedList<Integer> registerTypes() {
		//"OVERALLWORDS" value="7001" />
		//"SUBSTITUTEDWORDS" value="7002" />
		//"DELETEDWORDS" value="7003" />
		//"INSERTEDWORDS" value="7004" />
		//"OVERALLSENTENCES" value="7005" />
		//"SUBSTITUTEDSENTENCES" value="7006" />
		//"DELETEDSENTENCES" value="7007" />
		//"INSERTEDSENTENCES" value="7008" />
		//"OVERALLCONCEPTS" value="7009" />
		//"SUBSTITUTEDCONCEPTS" value="7010" />
		//"DELETEDCONCEPTS" value="7011" />
		//"INSERTEDCONCEPTS" value="7012" />

		//"CORRECTLYPARSEDUTTERANCE" value="7013" />
		//"PARTIALLYPARSEDUTTERANCE" value="7014" />
		//"INCORRECTLYPARSEDUTTERANCE" value="7015" />

		LinkedList<Integer> auxl = new java.util.LinkedList<Integer>();
		//add own events
		auxl.add(event_t.OVERALLWORDS.getValue());
		auxl.add(event_t.SUBSTITUTEDWORDS.getValue());
		auxl.add(event_t.DELETEDWORDS.getValue());
		auxl.add(event_t.INSERTEDWORDS.getValue());
		auxl.add(event_t.OVERALLSENTENCES.getValue());
		auxl.add(event_t.SUBSTITUTEDSENTENCES.getValue());
		auxl.add(event_t.DELETEDSENTENCES.getValue());
		auxl.add(event_t.INSERTEDSENTENCES.getValue());
		auxl.add(event_t.OVERALLCONCEPTS.getValue());
		auxl.add(event_t.SUBSTITUTEDCONCEPTS.getValue());
		auxl.add(event_t.DELETEDCONCEPTS.getValue());
		auxl.add(event_t.INSERTEDCONCEPTS.getValue());

		auxl.add(event_t.CORRECTLYPARSEDUTTERANCE.getValue());
		auxl.add(event_t.PARTIALLYPARSEDUTTERANCE.getValue());
		auxl.add(event_t.INCORRECTLYPARSEDUTTERANCE.getValue());

		//add pushing events
		auxl.addAll(getPushingEvents());

		return auxl;
	}

}
