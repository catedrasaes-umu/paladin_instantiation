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
import org.mmi.events.SpeechOutputContentEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Speech Output Content Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mmi.events.impl.SpeechOutputContentEventImpl#getNitems <em>Nitems</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SpeechOutputContentEventImpl extends SpeechOutputEventImpl implements SpeechOutputContentEvent {
	/**
	 * The default value of the '{@link #getNitems() <em>Nitems</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNitems()
	 * @generated
	 * @ordered
	 */
	protected static final int NITEMS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNitems() <em>Nitems</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNitems()
	 * @generated
	 * @ordered
	 */
	protected int nitems = NITEMS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpeechOutputContentEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EventsPackage.Literals.SPEECH_OUTPUT_CONTENT_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNitems() {
		return nitems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNitems(int newNitems) {
		int oldNitems = nitems;
		nitems = newNitems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.SPEECH_OUTPUT_CONTENT_EVENT__NITEMS, oldNitems, nitems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EventsPackage.SPEECH_OUTPUT_CONTENT_EVENT__NITEMS:
				return getNitems();
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
			case EventsPackage.SPEECH_OUTPUT_CONTENT_EVENT__NITEMS:
				setNitems((Integer)newValue);
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
			case EventsPackage.SPEECH_OUTPUT_CONTENT_EVENT__NITEMS:
				setNitems(NITEMS_EDEFAULT);
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
			case EventsPackage.SPEECH_OUTPUT_CONTENT_EVENT__NITEMS:
				return nitems != NITEMS_EDEFAULT;
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
		result.append(" (nitems: ");
		result.append(nitems);
		result.append(')');
		return result.toString();
	}

} //SpeechOutputContentEventImpl
