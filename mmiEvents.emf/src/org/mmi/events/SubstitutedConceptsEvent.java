/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mmi.events;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substituted Concepts Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mmi.events.SubstitutedConceptsEvent#getNconcepts <em>Nconcepts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mmi.events.EventsPackage#getSubstitutedConceptsEvent()
 * @model
 * @generated
 */
public interface SubstitutedConceptsEvent extends SpeechInputEvent {
	/**
	 * Returns the value of the '<em><b>Nconcepts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nconcepts</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nconcepts</em>' attribute.
	 * @see #setNconcepts(int)
	 * @see org.mmi.events.EventsPackage#getSubstitutedConceptsEvent_Nconcepts()
	 * @model
	 * @generated
	 */
	int getNconcepts();

	/**
	 * Sets the value of the '{@link org.mmi.events.SubstitutedConceptsEvent#getNconcepts <em>Nconcepts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nconcepts</em>' attribute.
	 * @see #getNconcepts()
	 * @generated
	 */
	void setNconcepts(int value);

} // SubstitutedConceptsEvent
