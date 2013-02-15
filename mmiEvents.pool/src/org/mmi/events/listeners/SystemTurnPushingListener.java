package org.mmi.events.listeners;

import java.util.LinkedList;

import org.mmi.events.event_t;
import org.mmi.events.factory.EventFactory;
import org.mmi.events.pool.EventPool;
import org.mmi.model.instantiator.MmiModelInstantiator;

/**
 * A PushingListener which fires doWork method just before the system
 * turn ends
 * 
 * @author mateo-navarro.pedro
 *
 */
public abstract class SystemTurnPushingListener extends PushEventListener {

	public SystemTurnPushingListener(EventPool epool, EventFactory efact,
			MmiModelInstantiator inst) {
		super(epool, efact, inst);
		// TODO Auto-generated constructor stub
	}

	@Override
	public LinkedList<Integer> getPushingEvents() {
		LinkedList<Integer> auxl = new java.util.LinkedList<Integer>();
		auxl.add(event_t.SYSTEMACTIONEND.getValue());
		return auxl;
	}
}
