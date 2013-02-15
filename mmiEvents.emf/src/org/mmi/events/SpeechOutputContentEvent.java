/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mmi.events;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Speech Output Content Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mmi.events.SpeechOutputContentEvent#getNitems <em>Nitems</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mmi.events.EventsPackage#getSpeechOutputContentEvent()
 * @model abstract="true"
 * @generated
 */
public interface SpeechOutputContentEvent extends SpeechOutputEvent {
	/**
	 * Returns the value of the '<em><b>Nitems</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nitems</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nitems</em>' attribute.
	 * @see #setNitems(int)
	 * @see org.mmi.events.EventsPackage#getSpeechOutputContentEvent_Nitems()
	 * @model
	 * @generated
	 */
	int getNitems();

	/**
	 * Sets the value of the '{@link org.mmi.events.SpeechOutputContentEvent#getNitems <em>Nitems</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nitems</em>' attribute.
	 * @see #getNitems()
	 * @generated
	 */
	void setNitems(int value);

} // SpeechOutputContentEvent
