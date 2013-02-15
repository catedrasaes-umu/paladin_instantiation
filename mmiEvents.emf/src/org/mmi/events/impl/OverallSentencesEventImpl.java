/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mmi.events.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mmi.events.EventsPackage;
import org.mmi.events.OverallSentencesEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Overall Sentences Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mmi.events.impl.OverallSentencesEventImpl#getNsentences <em>Nsentences</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OverallSentencesEventImpl extends SpeechInputEventImpl implements OverallSentencesEvent {
	/**
	 * The default value of the '{@link #getNsentences() <em>Nsentences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNsentences()
	 * @generated
	 * @ordered
	 */
	protected static final int NSENTENCES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNsentences() <em>Nsentences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNsentences()
	 * @generated
	 * @ordered
	 */
	protected int nsentences = NSENTENCES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OverallSentencesEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EventsPackage.Literals.OVERALL_SENTENCES_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNsentences() {
		return nsentences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNsentences(int newNsentences) {
		int oldNsentences = nsentences;
		nsentences = newNsentences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.OVERALL_SENTENCES_EVENT__NSENTENCES, oldNsentences, nsentences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EventsPackage.OVERALL_SENTENCES_EVENT__NSENTENCES:
				return getNsentences();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EventsPackage.OVERALL_SENTENCES_EVENT__NSENTENCES:
				setNsentences((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EventsPackage.OVERALL_SENTENCES_EVENT__NSENTENCES:
				setNsentences(NSENTENCES_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EventsPackage.OVERALL_SENTENCES_EVENT__NSENTENCES:
				return nsentences != NSENTENCES_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nsentences: ");
		result.append(nsentences);
		result.append(')');
		return result.toString();
	}

} //OverallSentencesEventImpl
