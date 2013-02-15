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
import org.mmi.events.SubstitutedWordsEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substituted Words Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mmi.events.impl.SubstitutedWordsEventImpl#getNwords <em>Nwords</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubstitutedWordsEventImpl extends SpeechInputEventImpl implements SubstitutedWordsEvent {
	/**
	 * The default value of the '{@link #getNwords() <em>Nwords</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNwords()
	 * @generated
	 * @ordered
	 */
	protected static final int NWORDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNwords() <em>Nwords</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNwords()
	 * @generated
	 * @ordered
	 */
	protected int nwords = NWORDS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstitutedWordsEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EventsPackage.Literals.SUBSTITUTED_WORDS_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNwords() {
		return nwords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNwords(int newNwords) {
		int oldNwords = nwords;
		nwords = newNwords;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.SUBSTITUTED_WORDS_EVENT__NWORDS, oldNwords, nwords));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EventsPackage.SUBSTITUTED_WORDS_EVENT__NWORDS:
				return getNwords();
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
			case EventsPackage.SUBSTITUTED_WORDS_EVENT__NWORDS:
				setNwords((Integer)newValue);
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
			case EventsPackage.SUBSTITUTED_WORDS_EVENT__NWORDS:
				setNwords(NWORDS_EDEFAULT);
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
			case EventsPackage.SUBSTITUTED_WORDS_EVENT__NWORDS:
				return nwords != NWORDS_EDEFAULT;
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
		result.append(" (nwords: ");
		result.append(nwords);
		result.append(')');
		return result.toString();
	}

} //SubstitutedWordsEventImpl
