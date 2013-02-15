package org.mmi.events.listeners;

import java.util.LinkedList;

import org.mmi.events.Event;
import org.mmi.events.factory.EventFactory;
import org.mmi.events.pool.EventPool;
import org.mmi.model.instantiator.MmiModelInstantiator;

/**
 * This special listener calls the doWork() method
 * when some pushing event arrives.
 * For example, it can be used to listen some events and
 * have some counters. At the end, some pushing event arrives
 * and the doWork method is called to commit all the values
 * included in those counters.
 * 
 * @author mateo-navarro.pedro
 *
 */
public abstract class PushEventListener extends EventPoolListener {

	public PushEventListener(EventPool epool, EventFactory efact,
			MmiModelInstantiator inst) {
		super(epool, efact, inst);
	}

	/**
	 * This method have to be called by child classes to do this work
	 */
	@Override
	public void onEvent(int type, Event e) {
		if (getPushingEvents().contains(type))
			doWork(e);
	}

	/**
	 * This abstract method returns the types corresponding to
	 * the pushing events.
	 * Note that the events included in this list should be 
	 * included in the register types as well.
	 * 
	 * @return the pushing event types
	 */
	public abstract LinkedList<Integer> getPushingEvents();
	
	/**
	 * This method is called when a pushing event arrives
	 * @param e
	 */
	public abstract void doWork(Event e);

}
