/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mmi.events;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inserted Words Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mmi.events.InsertedWordsEvent#getNwords <em>Nwords</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mmi.events.EventsPackage#getInsertedWordsEvent()
 * @model
 * @generated
 */
public interface InsertedWordsEvent extends SpeechInputEvent {
	/**
	 * Returns the value of the '<em><b>Nwords</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nwords</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nwords</em>' attribute.
	 * @see #setNwords(int)
	 * @see org.mmi.events.EventsPackage#getInsertedWordsEvent_Nwords()
	 * @model
	 * @generated
	 */
	int getNwords();

	/**
	 * Sets the value of the '{@link org.mmi.events.InsertedWordsEvent#getNwords <em>Nwords</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nwords</em>' attribute.
	 * @see #getNwords()
	 * @generated
	 */
	void setNwords(int value);

} // InsertedWordsEvent
