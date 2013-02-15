package org.mmi.events.listeners.userinput;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import org.apache.log4j.Logger;
import org.mmi.events.Event;
import org.mmi.events.event_t;
import org.mmi.events.factory.EventFactory;
import org.mmi.events.listeners.UserTurnPushingListener;
import org.mmi.events.pool.EventPool;
import org.mmi.model.instantiator.MmiModelInstantiator;

/**
 * Listener to abstract all the GUI text actions into
 * more simple events.
 * It uses low-level events to create more general ones.
 * 
 * @author mateo-navarro.pedro
 *
 */
public class GuiTextAbstractorListener extends UserTurnPushingListener  {

	public GuiTextAbstractorListener(EventPool epool, EventFactory efact, MmiModelInstantiator inst) {
		super(epool, efact, inst);
		//
		_initializeSets();
		//
		wordLength_ = 0;
	}
	
	private final static Logger LOG = Logger.getLogger(GuiTextAbstractorListener.class);

	/**
	 * variables
	 */
	private int wordLength_;

	/**
	 * Event sets
	 */
	private Set<Integer> otherActions_;

	private void _initializeSets(){
		///
		/// other GUI input actions that are not text
		otherActions_ = new HashSet<Integer>();
		otherActions_.add(event_t.NAVIGATIONMOVE.getValue());
		otherActions_.add(event_t.NAVIGATIONLENGTH.getValue());
		otherActions_.add(event_t.NAVIGATIONACTION.getValue());
		otherActions_.add(event_t.NAVIGATIONEXPLORE.getValue());
		///
		/// other events indicating
	}

	@Override
	public void onEvent(int type, Event e) {
		if (type == event_t.KEYTEXT.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L0 KEYTEXT");
			wordLength_++;
		}
		else if (type == event_t.KEYEXPLORE.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L0 KEYEXPLORE");
			//create a word if necessary
			_createWord(e);
			//create a second level event for exploring keys
			LOG.info(e.getTimestamp() + "\t   L0 << TextExplore (GuiTextAbstractorL)");
			epool_.postEvent(efact_.createTextExploreEvent(), e.getTimestamp());
		}
		else if (type == event_t.KEYCOMMAND.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L0 KEYCOMMAND");
			//create a word if necessary
			_createWord(e);
			//create a second level event for command keys
			LOG.info(e.getTimestamp() + "\t   L0 << TextCommand (GuiTextAbstractorL)");
			epool_.postEvent(efact_.createTextCommandEvent(), e.getTimestamp());
		}
		//if the event is "other action" event
		else{
			LOG.debug(e.getTimestamp() + "\t>> L0 NOT KEY, any action");
			//create a word if necessary
			_createWord(e);
		}
	}
	
	private void _createWord(Event e){
		//create a new WORD event if length > 0
		if (wordLength_ > 0){
			LOG.info(e.getTimestamp() + "\t   L0 << TextWord (GuiTextAbstractorL)");
			epool_.postEvent(efact_.createTextWordEvent(), e.getTimestamp());
			//reset word length
			wordLength_ = 0;
		}
		
	}
	
	@Override
	public void doWork(Event e) {
		LOG.info(e.getTimestamp() + "\t   L1 :: GuiTextAbstractorL: Working...");
		//create a word if necessary
		_createWord(e);
		LOG.info(e.getTimestamp() + "\t   L1 :: GuiTextAbstractorL: Work done.");
	}

	@Override
	public LinkedList<Integer> registerTypes() {
		LinkedList<Integer> auxl = new java.util.LinkedList<Integer>();
		//add key text
		//"KEYTEXT" value="201"/>
		//"KEYEXPLORE" value="202" />
		//"KEYCOMMAND" value="203" />
		auxl.add(event_t.KEYTEXT.getValue());
		auxl.add(event_t.KEYEXPLORE.getValue());
		auxl.add(event_t.KEYCOMMAND.getValue());
	
		//add other not-key actions
		for (int n : otherActions_){
			auxl.add(n);
		}
		
		return auxl;
	}

}