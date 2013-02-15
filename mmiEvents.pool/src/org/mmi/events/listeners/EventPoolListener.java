package org.mmi.events.listeners;

import java.util.LinkedList;

import org.mmi.events.Event;
import org.mmi.events.factory.EventFactory;
import org.mmi.events.pool.EventPool;
import org.mmi.model.instantiator.MmiModelInstantiator;


/**
 * Base class for EventPool listeners
 * 
 *  @author mateo-navarro.pedro
 *
 */
public abstract class EventPoolListener
{
	/**
	 * Constructor
	 * @param inst a class to instantiate the model
	 */
	public EventPoolListener(EventPool epool, EventFactory efact, MmiModelInstantiator inst){
		epool_ = epool;
		efact_ = efact;
		instantiator_ = inst;
	}

	/**
	 * event pool object
	 */
	protected EventPool epool_;
	/**
	 * event factory object
	 */
	protected EventFactory efact_;
	/**
	 * main instantiator object
	 */
	protected MmiModelInstantiator instantiator_;

	/**
	 * Abstract method called when a new subscribed event arrives
	 * @param type event type
	 * @param e event object
	 */
	public abstract void onEvent(int type, Event e);
	
	/**
	 * Abstract method to return the event types to subscribe
	 * @return
	 */
	public abstract LinkedList<Integer> registerTypes();
}