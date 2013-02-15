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
import org.mmi.events.OverallConceptsEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Overall Concepts Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mmi.events.impl.OverallConceptsEventImpl#getNconcepts <em>Nconcepts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OverallConceptsEventImpl extends SpeechInputEventImpl implements OverallConceptsEvent {
	/**
	 * The default value of the '{@link #getNconcepts() <em>Nconcepts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNconcepts()
	 * @generated
	 * @ordered
	 */
	protected static final int NCONCEPTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNconcepts() <em>Nconcepts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNconcepts()
	 * @generated
	 * @ordered
	 */
	protected int nconcepts = NCONCEPTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OverallConceptsEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EventsPackage.Literals.OVERALL_CONCEPTS_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNconcepts() {
		return nconcepts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNconcepts(int newNconcepts) {
		int oldNconcepts = nconcepts;
		nconcepts = newNconcepts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.OVERALL_CONCEPTS_EVENT__NCONCEPTS, oldNconcepts, nconcepts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EventsPackage.OVERALL_CONCEPTS_EVENT__NCONCEPTS:
				return getNconcepts();
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
			case EventsPackage.OVERALL_CONCEPTS_EVENT__NCONCEPTS:
				setNconcepts((Integer)newValue);
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
			case EventsPackage.OVERALL_CONCEPTS_EVENT__NCONCEPTS:
				setNconcepts(NCONCEPTS_EDEFAULT);
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
			case EventsPackage.OVERALL_CONCEPTS_EVENT__NCONCEPTS:
				return nconcepts != NCONCEPTS_EDEFAULT;
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
		result.append(" (nconcepts: ");
		result.append(nconcepts);
		result.append(')');
		return result.toString();
	}

} //OverallConceptsEventImpl
