package org.mmi.model.instantiator;

/**
 * Exception during the instantiation process
 * @author mateo-navarro.pedro
 *
 */
public class InstantiationException extends Exception {

	/**
	 * id
	 */
	private static final long serialVersionUID = 4064742466417173062L;

	/**
	 * constructor
	 * @param message exception reason
	 */
	public InstantiationException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	
	public InstantiationException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public InstantiationException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

}
