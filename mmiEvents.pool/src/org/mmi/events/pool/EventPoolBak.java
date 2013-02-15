package org.mmi.events.pool;

public class EventPoolBak {

}

/*package org.mmi.events.pool;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.logging.Logger;

import org.mmi.events.Event;
import org.mmi.events.listeners.EventPoolListener;
import org.mmi.utils.GlobalLog;


public class EventPoolbak {
	
	public EventPool(){
		//initialize pool
		listeners_ = 
			new HashMap<Integer, java.util.LinkedList<EventPoolListener>>();
		controlListeners_ = 
			new HashMap<Integer, java.util.LinkedList<EventPoolListener>>();
		events_ = new LinkedList<Event>();
		controlevents_ = new LinkedList<Event>();
	}

	final Logger LOG = GlobalLog.out;
	
	public void addListener(int eventType, EventPoolListener l){
		_addListener(eventType, l, false);
	}
	
	public void addControlListener(int eventType, EventPoolListener l){
		_addListener(eventType, l, true);
	}

	private void _addListener(int eventType, EventPoolListener l, boolean control)
	{
		//select a map
		HashMap<Integer, LinkedList<EventPoolListener>> auxm = null;
		if (control){
			auxm = controlListeners_;
		}
		else{
			auxm = listeners_;
		}
		
		//add the listener
		//
		//in case there is no previous listeners for this event
		//create the list for this event
		if (!auxm.containsKey(eventType))
		{
			auxm.put(eventType, new LinkedList<EventPoolListener>());
		}
		//get this list
		LinkedList<EventPoolListener> auxl = auxm.get(eventType);
		//add the listener at the end
		auxl.addLast(l);
	}
	
	public void addListener(LinkedList<Integer> eventTypes, EventPoolListener l){
		for (int type : eventTypes){
			addListener(type, l);
		}
	}
	
	public void addControlListener(LinkedList<Integer> eventTypes, EventPoolListener l){
		for (int type : eventTypes){
			addControlListener(type, l);
		}
	}
	
	
	public void removeListener()
	{
		//TODO
	}
	
	public void postEvent(Event e)
	{
		events_.addLast(e);
		_dispatchEvents();
	}
	
	public void postControlEvent(Event e)
	{
		controlevents_.addLast(e);
		_dispatchEvents();
	}
	
	private void _dispatchEvents(){
		///
		/// 1. regular events go to ControlListeners 
		///    (they're not removed from the list)
		///
		
		//for every regular event...
		for (Event e : events_){
			//found a control listener
			LinkedList<EventPoolListener> auxl = 
				controlListeners_.get(e.getType());
			if (auxl != null)
			{
				for (EventPoolListener l : auxl)
				{
					l.onEvent(e.getType(), e);
					//LOG.finest("" + e.getType() + l.toString());
				}
			}
		}
		
		///
		/// 2. control events go to Listeners
		///
		
		//for every control event...
		for (Event e : controlevents_){
			//found a listener
			LinkedList<EventPoolListener> auxl = 
				listeners_.get(e.getType());
			if (auxl != null)
			{
				for (EventPoolListener l : auxl)
				{
					l.onEvent(e.getType(), e);
				}
			}
		}
		controlevents_.clear();
		
		///
		/// 3. regular events go to Listeners
		///
		
		//for every regular event...
		for (Event e : events_){
			//found a listener
			LinkedList<EventPoolListener> auxl = 
				listeners_.get(e.getType());
			if (auxl != null)
			{
				for (EventPoolListener l : auxl)
				{
					l.onEvent(e.getType(), e);
				}
			}
		}
		events_.clear();
	}
	
	private HashMap<Integer, LinkedList<EventPoolListener>> listeners_;
	private HashMap<Integer, LinkedList<EventPoolListener>> controlListeners_;
	private LinkedList<Event> events_;
	private LinkedList<Event> controlevents_;
}
*/