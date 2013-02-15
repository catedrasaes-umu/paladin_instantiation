package org.mmi.model.instantiator.detail;

import org.mmi.model.GuiInput;
import org.mmi.model.instantiator.InstantiationContext;
import org.mmi.model.instantiator.InstantiatorBase;

/**
 * Instantiator for GUI input information.
 * It is used by the corresponding listeners to set this
 * information into the model instances
 * 
 * @author mateo-navarro.pedro
 *
 */
public class GuiInputInstantiator extends InstantiatorBase {

	/**
	 * Constructor
	 * @param c instantiation context
	 */
	public GuiInputInstantiator(InstantiationContext c) {
		super(c); 
	}
	
	private GuiInput _cinput(){
		return icontext_.uturn.getGuiInput();
	} 
	
	/**
	 * to set text elements
	 * @param elements
	 */
	public void setTextElements(int elements){
		_cinput().setTextElements(elements);
	}
	
	/**
	 * to add new text elements
	 * @param elements
	 */
	public void addTextElements(int elements){
		_cinput().setTextElements(_cinput().getTextElements() + elements);
	}
	
	/**
	 * to set navigation actions
	 * @param actions
	 */
	public void setNavigationActions(int actions){
		_cinput().setNavigationActions(actions);
	}
	
	/**
	 * to add new navigation actions
	 * @param actions
	 */
	public void addNavigationActions(int actions){
		_cinput().setNavigationActions(_cinput().getNavigationActions() + actions);
	}
	
	/**
	 * to set navigation moves
	 * @param moves
	 */
	public void setNavigationMoves(int moves){
		_cinput().setNavigationMoves(moves);
	}
	
	/**
	 * to add new navigation moves
	 * @param moves
	 */
	public void addNavigationMoves(int moves){
		_cinput().setNavigationMoves(_cinput().getNavigationMoves() + moves);
	}
	
	/**
	 * to set navigation length
	 * @param length
	 */
	public void setNavigationLength(int length){
		_cinput().setNavigationLength(length);
	}
	
	/**
	 * to add new navigation length
	 * @param length
	 */
	public void addNavigationLength(int length){
		_cinput().setNavigationLength(_cinput().getNavigationLength() + length);
	}
	
	/**
	 * to set exploring actions
	 * @param actions
	 */
	public void setExploringActions(int actions){
		_cinput().setExploringActions(actions);
	}
	
	/**
	 * to add new exploring actions
	 * @param actions
	 */
	public void addExploringActions(int actions){
		_cinput().setExploringActions(_cinput().getExploringActions() + actions);
	}
	
	/**
	 * to set transferring actions
	 * @param actions
	 */
	public void setTransferringActions(int actions){
		_cinput().setTransferringActions(actions);
	}
	
	/**
	 * to add new transferring actions
	 * @param actions
	 */
	public void addTransferringActions(int actions){
		_cinput().setTransferringActions(_cinput().getTransferringActions() + actions);
	}
	
}
