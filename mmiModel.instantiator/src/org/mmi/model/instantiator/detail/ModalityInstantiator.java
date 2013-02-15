package org.mmi.model.instantiator.detail;

import org.mmi.model.McReasonT;
import org.mmi.model.MmiTypeT;
import org.mmi.model.ModAppropT;
import org.mmi.model.ModTypeT;
import org.mmi.model.RoleT;
import org.mmi.model.instantiator.InstantiationContext;
import org.mmi.model.instantiator.InstantiatorBase;

/**
 * Instantiator for modality meta-information.
 * It is used by the corresponding listeners to set this
 * information into the model instances.
 * 
 * @author mateo-navarro.pedro
 *
 */
public class ModalityInstantiator extends InstantiatorBase {

	public ModalityInstantiator(InstantiationContext c) {
		super(c);
	}

	///
	/// modality info
	///
	
	/**
	 * sets the modality type
	 * @param t
	 */
	public void setModalityType(ModTypeT t){
		icontext_.cturn.getModality().setModalityType(t);
	}
	
	/**
	 * sets the multimodal interaction type
	 * @param t
	 */
	public void setMultimodalInteractionType(MmiTypeT t){
		icontext_.cturn.getModality().setMmiType(t);
	}

	///
	/// modality changes
	///
	
	/**
	 * sets that a modality change happened
	 * @param origin the origin of the change
	 * @param reason the reason of the change
	 */
	public void setModalityChange(RoleT origin, McReasonT reason){
		icontext_.cturn.getModality().getChange().setOrigin(origin);
		icontext_.cturn.getModality().getChange().setReason(reason);
	}

	///
	/// asynchronous info
	///

	/**
	 * sets the number of lags detected
	 * @param n lags count
	 */
	public void setLags(int n){
		icontext_.cturn.getModality().getSynchroni().setNlags(n);
	}

	/**
	 * sets the cumulative time for the lags
	 * @param n lag time
	 */
	public void setLagTime(long n){
		icontext_.cturn.getModality().getSynchroni().setLagtime(n);
	}

	/**
	 * set the number of asynchronous events
	 * @param n events count
	 */
	public void setEvents(int n){
		icontext_.cturn.getModality().getSynchroni().setNevents(n);
	}

	///
	/// modality appropriateness
	///
	
	/**
	 * sets modality appropriateness
	 * @param a appropriateness level
	 */
	public void setAppropiateness(ModAppropT a){
		icontext_.cturn.getModality().getAppropriateness().setAppropriateness(a);
	}
}
