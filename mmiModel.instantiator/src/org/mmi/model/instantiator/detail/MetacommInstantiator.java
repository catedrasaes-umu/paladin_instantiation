package org.mmi.model.instantiator.detail;

import org.mmi.model.instantiator.InstantiationContext;
import org.mmi.model.instantiator.InstantiationException;
import org.mmi.model.instantiator.InstantiatorBase;

/**
 * Instantiator for metacommunication information.
 * It is used by the corresponding listeners to set this
 * information into the model instances
 * 
 * @author mateo-navarro.pedro
 *
 */
public class MetacommInstantiator extends InstantiatorBase {

	/**
	 * Constructor
	 * @param c instantiation context
	 */
	public MetacommInstantiator(InstantiationContext c) {
		super(c);
	}

	///
	/// common
	///

	/**
	 * to mark help turns
	 * @param isSystemTurn
	 */
	public void setIsHelpTurn(boolean isSystemTurn){
		if (isSystemTurn)
			icontext_.sturn.getMetacomm().setIsHelp(true);
		else
		{
			icontext_.uturn.getMetacomm().setIsHelp(true);
		}
	}

	/**
	 * to mark correction turns
	 * @param isSystemTurn
	 */
	public void setIsCorrectionTurn(boolean isSystemTurn){
		if (isSystemTurn)
			icontext_.sturn.getMetacomm().setIsCorrection(true);
		else
			icontext_.uturn.getMetacomm().setIsCorrection(true);
	}

	///
	/// system metacomm
	///

	/**
	 * to mark ASR errors
	 * @param isSystemTurn denotes whether the process is in system turn
	 * @throws InstantiationException
	 */
	public void setIsASRRejection(boolean isSystemTurn) throws InstantiationException{
		if (!isSystemTurn)
			throw new InstantiationException("Setting ASRREJECTION out of System turn.");
		else
			icontext_.sturn.getMetacomm().setIsASRReject(true);
	}

	/**
	 * to mark DIV error
	 * @param isSystemTurn denotes whether the process is in system turn
	 * @throws InstantiationException
	 */
	public void setIsDIVRejection(boolean isSystemTurn) throws InstantiationException{
		if (!isSystemTurn)
			throw new InstantiationException("Setting DIVREJECTION out of System turn.");
		else
			icontext_.sturn.getMetacomm().setIsDIVReject(true);
	}

	/**
	 * to mark GR errors
	 * @param isSystemTurn denotes whether the process is in system turn
	 * @throws InstantiationException
	 */
	public void setIsGRRejection(boolean isSystemTurn) throws InstantiationException{
		if (!isSystemTurn)
			throw new InstantiationException("Setting GRREJECTION out of System turn.");
		else
			icontext_.sturn.getMetacomm().setIsGRReject(true);
	}

	///
	/// user metacomm
	///

	/**
	 * to mark timeouts
	 * @param isUserTurn used to denote whether the process is in user turn
	 * @throws InstantiationException
	 */
	public void setIsTimeout(boolean isUserTurn) throws InstantiationException{
		if (!isUserTurn)
			throw new InstantiationException("Setting Timeout out of User turn.");
		else
			icontext_.uturn.getMetacomm().setIsTimeOut(true);
	}

	/**
	 * to mark cancel turns
	 * @param isUserTurn used to denote whether the process is in user turn
	 * @throws InstantiationException
	 */
	public void setIsCancelTurn(boolean isUserTurn) throws InstantiationException{
		if (!isUserTurn)
			throw new InstantiationException("Setting CancelTurn out of User turn.");
		else
			icontext_.uturn.getMetacomm().setIsCancel(true);
	}

	/**
	 * to mark restart turns
	 * @param isUserTurn used to denote whether the process is in user turn
	 * @throws InstantiationException
	 */
	public void setIsRestartTurn(boolean isUserTurn) throws InstantiationException{
		if (!isUserTurn)
			throw new InstantiationException("Setting RestartTurn out of User turn.");
		else
			icontext_.uturn.getMetacomm().setIsRestart(true);
	}

	/**
	 * to mark bargeins
	 * @param isUserTurn used to denote whether the process is in user turn
	 * @param success indicates if the bargein was successful
	 * @throws InstantiationException
	 */
	public void setIsBargein(boolean isUserTurn, boolean success) throws InstantiationException{
		if (!isUserTurn)
			throw new InstantiationException("Setting Bargein out of User turn.");
		else{
			icontext_.uturn.getMetacomm().setIsBargein(true);
			icontext_.uturn.getMetacomm().setIsSuccessfulBargein(success);
		}
	}
}
