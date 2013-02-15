package org.mmi.events.listeners;

import java.util.LinkedList;

import org.mmi.events.event_t;
import org.mmi.events.factory.EventFactory;
import org.mmi.events.pool.EventPool;
import org.mmi.model.instantiator.MmiModelInstantiator;

/**
 * A PushingListener which fires doWork method just before the user
 * turn ends
 * 
 * @author mateo-navarro.pedro
 *
 */
public abstract class UserTurnPushingListener extends PushEventListener {

	public UserTurnPushingListener(EventPool epool, EventFactory efact,
			MmiModelInstantiator inst) {
		super(epool, efact, inst);
		// TODO Auto-generated constructor stub
	}

	/**
	 * EndUserTurn is set as pushing event
	 */
	@Override
	public LinkedList<Integer> getPushingEvents() {
		LinkedList<Integer> auxl = new java.util.LinkedList<Integer>();
		auxl.add(event_t.USERACTIONEND.getValue());
		return auxl;
	}
}
