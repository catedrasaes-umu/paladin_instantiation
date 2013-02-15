package org.mmi.model.instantiator;

import org.mmi.model.Dialogue;
import org.mmi.model.DialogueStepT;
import org.mmi.model.DocumentRoot;
import org.mmi.model.ModelFactory;
import org.mmi.model.SystemTurn;
import org.mmi.model.Turn;
import org.mmi.model.UserTurn;

/**
 * This class represents the instantiation context in
 * which the model instances are created.
 * 
 * @author mateo-navarro.pedro
 *
 */
public class InstantiationContext {

	/**
	 * model classes factory
	 */
	public ModelFactory mfact;
	
	/**
	 * root element of a model instance
	 */
	public DocumentRoot droot;

	/**
	 * dialogue object
	 */
	public Dialogue dialogue;

	/**
	 * dialogue step object
	 */
	public DialogueStepT dstep;

	/**
	 * current turn during the instantiation process
	 */
	public Turn cturn;

	/**
	 * current system turn during the instantiation process
	 */
	public SystemTurn sturn;

	/**
	 * current user turn during the instantiation process
	 */
	public UserTurn uturn;

	/**
	 * instantiation state FSM
	 */
	public InstantiationFSM state;

}
