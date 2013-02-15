package org.mmi.events.listeners.userinput;

import java.util.LinkedList;

import org.apache.log4j.Logger;
import org.mmi.events.Event;
import org.mmi.events.NavigationMoveEvent;
import org.mmi.events.event_t;
import org.mmi.events.factory.EventFactory;
import org.mmi.events.listeners.UserTurnPushingListener;
import org.mmi.events.pool.EventPool;
import org.mmi.model.instantiator.MmiModelInstantiator;
import org.mmi.model.instantiator.detail.GuiInputInstantiator;

/**
 * Listener used to collect gui-navigation-and-text-related events
 * and set the corresponding data into the model instance using the 
 * corresponding instantiator.
 * 
 * @author mateo-navarro.pedro
 *
 */
public class NavigationTextMetricsListener extends UserTurnPushingListener {

	public NavigationTextMetricsListener(EventPool epool, EventFactory efact,
			MmiModelInstantiator inst) {
		super(epool, efact, inst);
		//
		_resetCounters();
		//
		giinst_ = inst.guiInput;
	}
	
	private final static Logger LOG = Logger.getLogger(NavigationTextMetricsListener.class);
	
	private GuiInputInstantiator giinst_;

	/**
	 * Counter variables
	 */
	private int nmoves_;
	private int nlength_;
	private int nactions_;
	private int nexplore_;
	private int twords_;
	private int tcommands_;
	private int texplore_;

	private void _resetCounters(){
		nmoves_ = nlength_= nactions_ = 
			nexplore_ = twords_ = tcommands_ = texplore_ = 0;
	}

	/**
	 * 
	 */
	@Override
	public void onEvent(int type, Event e) {
		//do my work
		// "NAVIGATIONMOVE" value="1001"/>
		if (type == event_t.NAVIGATIONMOVE.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L1 NAVIGATIONMOVE");
			nmoves_++;
			nlength_ += ((NavigationMoveEvent)e).getLength();
		}
		// "NAVIGATIONACTION" value="1003"/>
		else if (type == event_t.NAVIGATIONACTION.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L1 NAVIGATIONACTION");
			nactions_++;
		}
		// "NAVIGATIONEXPLORE" value="1004"/>
		else if (type == event_t.NAVIGATIONEXPLORE.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L1 NAVIGATIONEXPLORE");
			nexplore_++;
		}
		// "WORD" value="2001"/>
		else if (type == event_t.TEXTWORD.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L1 TEXTWORD");
			twords_++;
		}
		// "KEYCOMMAND" value="2002"/>
		else if (type == event_t.TEXTCOMMAND.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L1 TEXTCOMMAND");
			tcommands_++;
		}
		// "KEYEXPLORE" value="202"/>
		else if (type == event_t.TEXTEXPLORE.getValue()){
			LOG.debug(e.getTimestamp() + "\t>> L1 TEXTEXPLORE");
			texplore_++;
		}

		//call parent method
		super.onEvent(type, e);
	}

	@Override
	public void doWork(Event e) {
		//commit data for GUI input
		//nmoves_;
		giinst_.setNavigationMoves(nmoves_);
		//nlength_;
		giinst_.setNavigationLength(nlength_);
		//nactions_; & nexplore_;
		giinst_.setNavigationActions(nmoves_ + nexplore_ + nactions_);
		//words_; & kcommands_; & kexplore_;
		giinst_.setTextElements(twords_ + tcommands_ + texplore_);
		
		//turn content is updated in ExploringTransferringListener,
		//which can distinguish between feedback and actions
		
		LOG.info(e.getTimestamp() + "\t   L1 :: NavigationTextMetricsL: Work done.");
		
		//and reset counters
		_resetCounters();
	}

	@Override
	public LinkedList<Integer> registerTypes() {
		// "NAVIGATIONMOVE" value="1001"/>
		// "NAVIGATIONLENGTH" value="1002"/>
		// "NAVIGATIONACTION" value="1003"/>
		// "NAVIGATIONEXPLORE" value="1004"/>
		// "WORD" value="2001"/>
		// "KEYCOMMAND" value="2002"/>
		// "KEYEXPLORE" value="202"/>
		LinkedList<Integer> auxl = new java.util.LinkedList<Integer>();
		//add own events
		auxl.add(event_t.NAVIGATIONMOVE.getValue());
		auxl.add(event_t.NAVIGATIONACTION.getValue());
		auxl.add(event_t.NAVIGATIONEXPLORE.getValue());
		auxl.add(event_t.TEXTWORD.getValue());
		auxl.add(event_t.TEXTCOMMAND.getValue());
		auxl.add(event_t.TEXTEXPLORE.getValue());

		//add pushing events
		auxl.addAll(getPushingEvents());

		return auxl;
	}

}
