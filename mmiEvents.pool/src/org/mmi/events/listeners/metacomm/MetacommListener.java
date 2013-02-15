package org.mmi.events.listeners.metacomm;

import java.util.LinkedList;

import org.apache.log4j.Logger;
import org.mmi.events.BargeinEvent;
import org.mmi.events.Event;
import org.mmi.events.event_t;
import org.mmi.events.factory.EventFactory;
import org.mmi.events.listeners.EventPoolListener;
import org.mmi.events.pool.EventPool;
import org.mmi.model.instantiator.InstantiationException;
import org.mmi.model.instantiator.MmiModelInstantiator;
import org.mmi.model.instantiator.detail.MetacommInstantiator;

/**
 * Listener used to collect metacomm-related events and set
 * the corresponding data into the model instance using the 
 * corresponding instantiator.
 * 
 * @author mateo-navarro.pedro
 *
 */
public class MetacommListener extends EventPoolListener {

	private final static Logger LOG = Logger.getLogger(MetacommListener.class); 

	public MetacommListener(EventPool epool, EventFactory efact,
			MmiModelInstantiator inst) {
		super(epool, efact, inst);
		//
		onSystemTurn_ = false;
		onUserTurn_ = false;
		//
		mcinst_ = inst.metaComm;
	}

	private MetacommInstantiator mcinst_;

	/**
	 * control variables
	 */
	private boolean onSystemTurn_;
	private boolean onUserTurn_;

	@Override
	public void onEvent(int type, Event e){
		try {
			///
			/// control
			///

			if (e.getType() == event_t.STARTSYSTEMTURN.getValue()){
				onSystemTurn_ = true;
				onUserTurn_ = false;
			}
			//
			else if (e.getType() == event_t.STARTUSERTURN.getValue()){
				onSystemTurn_ = false;
				onUserTurn_ = true;
			}

			///
			/// common
			///

			//"HELPTURN" value="5002" />
			else if (e.getType() == event_t.HELPTURN.getValue()){
				LOG.debug(e.getTimestamp() + "\t>> L1 HELPTURN");
				mcinst_.setIsHelpTurn(onSystemTurn_);
			}
			//"CORRECTIONTURN" value="5003" />
			else if (e.getType() == event_t.CORRECTIONTURN.getValue()){
				LOG.debug(e.getTimestamp() + "\t>> L1 CORRECTIONTURN");
				mcinst_.setIsCorrectionTurn(onSystemTurn_);
			}

			///
			/// system
			///

			else if (onSystemTurn_){
				//"DIVREJECTION" value="5008" />
				if (e.getType() == event_t.DIVREJECTION.getValue()){
					LOG.debug(e.getTimestamp() + "\t>> L1 DIVREJECTION");
					mcinst_.setIsDIVRejection(onSystemTurn_);
				}
				//"ASRREJECTION" value="5009" />
				else if (e.getType() == event_t.ASRREJECTION.getValue()){
					LOG.debug(e.getTimestamp() + "\t>> L1 ASRREJECTION");
					mcinst_.setIsASRRejection(onSystemTurn_);
				}
				//"GRREJECTION" value="5010" />
				else if (e.getType() == event_t.GRREJECTION.getValue()){
					LOG.debug(e.getTimestamp() + "\t>> L1 GRREJECTION");
					mcinst_.setIsGRRejection(onSystemTurn_);
				}
			}

			///
			/// user
			///

			else if (onUserTurn_){
				//"TIMEOUT" value="5004" />
				if (e.getType() == event_t.TIMEOUT.getValue()){
					LOG.debug(e.getTimestamp() + "\t>> L1 TIMEOUT");
					mcinst_.setIsTimeout(onUserTurn_);
				}
				//"CANCELTURN" value="5005" />
				else if (e.getType() == event_t.CANCELTURN.getValue()){
					LOG.debug(e.getTimestamp() + "\t>> L1 CANCELTURN");
					mcinst_.setIsCancelTurn(onUserTurn_);
				}
				//"RESTARTTURN" value="5006" />
				else if (e.getType() == event_t.RESTARTTURN.getValue()){
					LOG.debug(e.getTimestamp() + "\t>> L1 RESTARTTURN");
					mcinst_.setIsRestartTurn(onUserTurn_);
				}
				//"BARGEIN" value="5007" />
				else if (e.getType() == event_t.BARGEIN.getValue()){
					LOG.debug(e.getTimestamp() + "\t>> L1 BARGEIN");
					mcinst_.setIsBargein(onUserTurn_,((BargeinEvent)e).isSuccessful());
				}
			}
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		}
	}

	@Override
	public LinkedList<Integer> registerTypes() {
		//"HELPTURN" value="5002" />
		//"CORRECTIONTURN" value="5003" />
		//"TIMEOUT" value="5004" />
		//"CANCELTURN" value="5005" />
		//"RESTARTTURN" value="5006" />
		//"BARGEIN" value="5007" />
		//"DIVREJECTION" value="5008" />
		//"ASRREJECTION" value="5009" />
		//"GRREJECTION" value="5010" />
		LinkedList<Integer> auxl = new java.util.LinkedList<Integer>();
		auxl.add(event_t.HELPTURN.getValue());
		auxl.add(event_t.CORRECTIONTURN.getValue());
		auxl.add(event_t.TIMEOUT.getValue());
		auxl.add(event_t.CANCELTURN.getValue());
		auxl.add(event_t.RESTARTTURN.getValue());
		auxl.add(event_t.BARGEIN.getValue());
		auxl.add(event_t.DIVREJECTION.getValue());
		auxl.add(event_t.ASRREJECTION.getValue());
		auxl.add(event_t.GRREJECTION.getValue());

		//turn start control
		auxl.add(event_t.STARTSYSTEMTURN.getValue());
		auxl.add(event_t.STARTUSERTURN.getValue());

		return auxl;
	}

}
