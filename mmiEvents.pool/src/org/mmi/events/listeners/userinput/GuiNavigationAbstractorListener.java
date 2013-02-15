package org.mmi.events.listeners.userinput;

import java.util.LinkedList;

import org.apache.log4j.Logger;
import org.mmi.events.Event;
import org.mmi.events.MoveEvent;
import org.mmi.events.event_t;
import org.mmi.events.factory.EventFactory;
import org.mmi.events.listeners.UserTurnPushingListener;
import org.mmi.events.pool.EventPool;
import org.mmi.model.instantiator.MmiModelInstantiator;

/**
 * Listener to abstract all the GUI navigation actions into
 * more simple events.
 * It uses low-level events to create more general ones.
 * 
 * @author mateo-navarro.pedro
 *
 */
public class GuiNavigationAbstractorListener extends UserTurnPushingListener {

	private final static Logger LOG = Logger.getLogger(GuiNavigationAbstractorListener.class);

	public GuiNavigationAbstractorListener(EventPool epool, EventFactory efact, MmiModelInstantiator inst) {
		super(epool, efact, inst);
	}

	

	
	@SuppressWarnings("unused")
	private void _resetCounters(){
		//TODO
	}

	//<eLiterals name="NAVIGATIONMOVE" value="1001" />
	//<eLiterals name="NAVIGATIONACTION" value="1003" />
	//<eLiterals name="NAVIGATIONEXPLORE" value="1004" />
	
	@Override
	public void onEvent(int type, Event e) {
		if (type == event_t.TOUCH.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L0 TOUCH");
			epool_.postEvent(efact_.createNavigationActionEvent(), e.getTimestamp());
		}
		else if (type == event_t.MOVE.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L0 MOVE");
			//navigation movements are accompanied with length
			int length = ((MoveEvent)e).getLength();
			epool_.postEvent(efact_.createNavigationMoveEvent(length), e.getTimestamp());
			//LOG.finer(e.getTimestamp() + "\t:: GuiNavigationL: Sent new Navigation Move");
		}
		else if (type == event_t.CLICK.getValue() || 
				type == event_t.LONGCLICK.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L0 CLICK (kind of)");
			//any kind of CLICK is considered as a navigation action
			epool_.postEvent(efact_.createNavigationActionEvent(), e.getTimestamp());
			//LOG.finer(e.getTimestamp() + "\t:: GuiNavigationL: Sent new Navigation Action");
		}
		else if (type == event_t.SCROLL.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L0 SCROLL");
			//SCROLL is considered as an exploring action
			epool_.postEvent(efact_.createNavigationExploreEvent(), e.getTimestamp());
			//LOG.finer(e.getTimestamp() + "\t:: GuiNavigationL: Sent new Navigation Explore");
		}

		//call parent method
		super.onEvent(type, e);
	}

	@Override
	public void doWork(Event e) {
		//reset counters
		//_resetCounters();
		LOG.info(e.getTimestamp() + "\t   L1 :: GuiNavigationAbstractorL: Work done.");
	}

	@Override
	public LinkedList<Integer> registerTypes() {
		LinkedList<Integer> auxl = new java.util.LinkedList<Integer>();
		auxl.add(event_t.TOUCH.getValue());
		auxl.add(event_t.CLICK.getValue());
		auxl.add(event_t.LONGCLICK.getValue());
		auxl.add(event_t.SCROLL.getValue());
		auxl.add(event_t.MOVE.getValue());

		//add pushing events
		auxl.addAll(getPushingEvents());

		return auxl;
	}

}
