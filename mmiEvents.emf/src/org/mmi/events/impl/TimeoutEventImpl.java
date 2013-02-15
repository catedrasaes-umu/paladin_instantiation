/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mmi.events.impl;

import org.eclipse.emf.ecore.EClass;

import org.mmi.events.EventsPackage;
import org.mmi.events.TimeoutEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timeout Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TimeoutEventImpl extends MetacommEventImpl implements TimeoutEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeoutEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EventsPackage.Literals.TIMEOUT_EVENT;
	}

} //TimeoutEventImpl
