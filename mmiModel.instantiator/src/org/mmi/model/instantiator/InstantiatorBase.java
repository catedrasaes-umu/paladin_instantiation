package org.mmi.model.instantiator;

/**
 * A base class for sub-Instantiators including a working context
 * @author mateo-navarro.pedro
 *
 */
public abstract class InstantiatorBase {

	public InstantiatorBase(InstantiationContext c){
		icontext_ = c;
	}
	
	protected InstantiationContext icontext_;
}
