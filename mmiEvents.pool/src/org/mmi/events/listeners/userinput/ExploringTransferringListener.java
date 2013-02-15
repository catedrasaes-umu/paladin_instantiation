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
import org.mmi.model.instantiator.detail.GuiInputInstantiator;
import org.mmi.model.instantiator.detail.TurnContentInstantiator;

/**
 * Listener used to collect exploring-and-transferring-related
 * events and set the corresponding data into the model instance
 * using the corresponding instantiator.
 * 
 * @author mateo-navarro.pedro
 *
 */
public class ExploringTransferringListener extends UserTurnPushingListener {
	
	private final static Logger LOG = Logger.getLogger(ExploringTransferringListener.class);

	public ExploringTransferringListener(EventPool epool, EventFactory efact,
			MmiModelInstantiator inst) {
		super(epool, efact, inst);
		//
		giinst_ = inst.guiInput;
		tcinst_ = inst.turnContent;
		//
		_initializeSets();
	}

	private GuiInputInstantiator giinst_;
	private TurnContentInstantiator tcinst_;

	/**
	 * Counter variables
	 */
	private int nexploring_;
	private int ntransferring_;

	/**
	 * Event sets
	 */
	private Set<Integer> exploringSet_;
	private Set<Integer> transferringSet_;

	private void _initializeSets(){
		///
		/// potentially exploring events
		///
		exploringSet_ = new HashSet<Integer>();
		exploringSet_.add(event_t.NAVIGATIONMOVE.getValue());
		exploringSet_.add(event_t.NAVIGATIONEXPLORE.getValue());
		exploringSet_.add(event_t.TEXTEXPLORE.getValue());

		///
		/// transferring events
		///
		transferringSet_ = new HashSet<Integer>();
		transferringSet_.add(event_t.NAVIGATIONACTION.getValue());
		transferringSet_.add(event_t.TEXTWORD.getValue());
		transferringSet_.add(event_t.TEXTCOMMAND.getValue());
	}

	private void _resetCounters(){
		nexploring_ = ntransferring_ = 0;
	}

	/**
	 * 
	 */
	@Override
	public void onEvent(int type, Event e) {
		//do my work
		//transferring actions are always summed up.
		//exploring alctions are only summed up if no
		//transferring actions have been performed yet
		if (ntransferring_ == 0 && 
				exploringSet_.contains(e.getType())){
			nexploring_++;
		}
		else if (transferringSet_.contains(e.getType()) ||
				exploringSet_.contains(e.getType())){
			ntransferring_++;
		}

		//call parent method
		super.onEvent(type, e);
	}

	@Override
	public void doWork(Event e) {
		//commit data for GUI input
		giinst_.setExploringActions(nexploring_);
		giinst_.setTransferringActions(ntransferring_);
		
		//commit data for Turn Content
		//number of total elements
		tcinst_.addElements(ntransferring_);
		//number of feedback elements
		tcinst_.addFeedback(nexploring_);
		
		LOG.info(e.getTimestamp() + "\t   L1 :: ExploringTransferringL: Work done.");

		//and reset counters
		_resetCounters();
	}

	@Override
	public LinkedList<Integer> registerTypes() {

		LinkedList<Integer> auxl = new java.util.LinkedList<Integer>();
		//add events in sets
		for (int n : exploringSet_){
			auxl.add(n);
		}
		for (int n : transferringSet_){
			auxl.add(n);
		}

		//add pushing events
		auxl.addAll(getPushingEvents());

		return auxl;
	}

}
