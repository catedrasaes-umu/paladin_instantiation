package org.mmi.events.pool;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.mmi.events.Event;
import org.mmi.events.listeners.EventPoolListener;

/**
 * Event pool object. It is used to post new events and
 * distribute them to the interested listeners.
 * 
 * @author mateo-navarro.pedro
 *
 */
public class EventPool {
	
	/**
	 * Listeners map
	 */
	private Map<Integer, List<EventPoolListener>> listeners_;

	/**
	 * Constructor
	 */
	public EventPool(){
		//initialize pool
		listeners_ = new HashMap<Integer, List<EventPoolListener>>();
	}

	/**
	 * Method used to add new listeners
	 * @param eventType type of the event to subscribe
	 * @param l listener
	 */
	public void addListener(int eventType, EventPoolListener l){
		//add the listener
		//
		//in case there is no previous listeners for this event
		//create the list for this event
		if (!listeners_.containsKey(eventType))
		{
			listeners_.put(eventType, new LinkedList<EventPoolListener>());
		}
		//get this list
		List<EventPoolListener> auxl = listeners_.get(eventType);
		//add the listener at the end
		auxl.add(l);
	}

	/**
	 * Another subscription method, but using a list of event types
	 * instead a single type
	 * @param eventTypes list of event types
	 * @param l listener
	 */
	public void addListener(LinkedList<Integer> eventTypes, EventPoolListener l){
		for (int type : eventTypes){
			addListener(type, l);
		}
	}

	public void removeListener()
	{
		//TODO
	}

	/**
	 * Method used to post new events and send them to the
	 * listeners
	 * @param e event object
	 */
	public void postEvent(Event e)
	{
		List<EventPoolListener> auxl = listeners_.get(e.getType());
		if (auxl != null) {
			for (EventPoolListener l : auxl) {
				l.onEvent(e.getType(), e);
			}
		}
	}

	/**
	 * Method used to post new events and send them to the
	 * listeners, but using a customized timestamp
	 * @param e event object
	 * @param timestamp customized timestamp
	 */
	public void postEvent(Event e, long timestamp)
	{
		//modify timestamp
		if (timestamp > 0) {
			e.setTimestamp(timestamp);
		}
		//post event
		postEvent(e);
	}
}