/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mmi.events;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bargein Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mmi.events.BargeinEvent#isSuccessful <em>Successful</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mmi.events.EventsPackage#getBargeinEvent()
 * @model
 * @generated
 */
public interface BargeinEvent extends MetacommEvent {
	/**
	 * Returns the value of the '<em><b>Successful</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Successful</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successful</em>' attribute.
	 * @see #setSuccessful(boolean)
	 * @see org.mmi.events.EventsPackage#getBargeinEvent_Successful()
	 * @model
	 * @generated
	 */
	boolean isSuccessful();

	/**
	 * Sets the value of the '{@link org.mmi.events.BargeinEvent#isSuccessful <em>Successful</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Successful</em>' attribute.
	 * @see #isSuccessful()
	 * @generated
	 */
	void setSuccessful(boolean value);

} // BargeinEvent
