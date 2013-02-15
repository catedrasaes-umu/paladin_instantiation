/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mmi.events.impl;

import org.eclipse.emf.ecore.EClass;

import org.mmi.events.EventsPackage;
import org.mmi.events.TextEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class TextEventImpl extends InputEventImpl implements TextEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EventsPackage.Literals.TEXT_EVENT;
	}

} //TextEventImpl
