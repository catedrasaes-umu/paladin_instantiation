/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mmi.events;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inserted Sentences Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mmi.events.InsertedSentencesEvent#getNsentences <em>Nsentences</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mmi.events.EventsPackage#getInsertedSentencesEvent()
 * @model
 * @generated
 */
public interface InsertedSentencesEvent extends SpeechInputEvent {
	/**
	 * Returns the value of the '<em><b>Nsentences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nsentences</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nsentences</em>' attribute.
	 * @see #setNsentences(int)
	 * @see org.mmi.events.EventsPackage#getInsertedSentencesEvent_Nsentences()
	 * @model
	 * @generated
	 */
	int getNsentences();

	/**
	 * Sets the value of the '{@link org.mmi.events.InsertedSentencesEvent#getNsentences <em>Nsentences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nsentences</em>' attribute.
	 * @see #getNsentences()
	 * @generated
	 */
	void setNsentences(int value);

} // InsertedSentencesEvent
