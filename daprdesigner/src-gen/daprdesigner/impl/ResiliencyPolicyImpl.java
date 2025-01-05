/**
 */
package daprdesigner.impl;

import daprdesigner.CircuitBreakerPolicy;
import daprdesigner.DaprdesignerPackage;
import daprdesigner.ResiliencyPolicy;
import daprdesigner.RetryPolicy;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resiliency Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.impl.ResiliencyPolicyImpl#getRetries <em>Retries</em>}</li>
 *   <li>{@link daprdesigner.impl.ResiliencyPolicyImpl#getCircuitbreakers <em>Circuitbreakers</em>}</li>
 *   <li>{@link daprdesigner.impl.ResiliencyPolicyImpl#getTimeouts <em>Timeouts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResiliencyPolicyImpl extends MinimalEObjectImpl.Container implements ResiliencyPolicy {
	/**
	 * The cached value of the '{@link #getRetries() <em>Retries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetries()
	 * @generated
	 * @ordered
	 */
	protected EList<RetryPolicy> retries;

	/**
	 * The cached value of the '{@link #getCircuitbreakers() <em>Circuitbreakers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircuitbreakers()
	 * @generated
	 * @ordered
	 */
	protected EList<CircuitBreakerPolicy> circuitbreakers;

	/**
	 * The cached value of the '{@link #getTimeouts() <em>Timeouts</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeouts()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> timeouts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResiliencyPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaprdesignerPackage.Literals.RESILIENCY_POLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RetryPolicy> getRetries() {
		if (retries == null) {
			retries = new EObjectContainmentEList<RetryPolicy>(RetryPolicy.class, this,
					DaprdesignerPackage.RESILIENCY_POLICY__RETRIES);
		}
		return retries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CircuitBreakerPolicy> getCircuitbreakers() {
		if (circuitbreakers == null) {
			circuitbreakers = new EObjectContainmentEList<CircuitBreakerPolicy>(CircuitBreakerPolicy.class, this,
					DaprdesignerPackage.RESILIENCY_POLICY__CIRCUITBREAKERS);
		}
		return circuitbreakers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getTimeouts() {
		if (timeouts == null) {
			timeouts = new EcoreEMap<String, String>(DaprdesignerPackage.Literals.ESTRING_TO_STRING_MAP_ENTRY,
					EStringToStringMapEntryImpl.class, this, DaprdesignerPackage.RESILIENCY_POLICY__TIMEOUTS);
		}
		return timeouts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DaprdesignerPackage.RESILIENCY_POLICY__RETRIES:
			return ((InternalEList<?>) getRetries()).basicRemove(otherEnd, msgs);
		case DaprdesignerPackage.RESILIENCY_POLICY__CIRCUITBREAKERS:
			return ((InternalEList<?>) getCircuitbreakers()).basicRemove(otherEnd, msgs);
		case DaprdesignerPackage.RESILIENCY_POLICY__TIMEOUTS:
			return ((InternalEList<?>) getTimeouts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DaprdesignerPackage.RESILIENCY_POLICY__RETRIES:
			return getRetries();
		case DaprdesignerPackage.RESILIENCY_POLICY__CIRCUITBREAKERS:
			return getCircuitbreakers();
		case DaprdesignerPackage.RESILIENCY_POLICY__TIMEOUTS:
			if (coreType)
				return getTimeouts();
			else
				return getTimeouts().map();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DaprdesignerPackage.RESILIENCY_POLICY__RETRIES:
			getRetries().clear();
			getRetries().addAll((Collection<? extends RetryPolicy>) newValue);
			return;
		case DaprdesignerPackage.RESILIENCY_POLICY__CIRCUITBREAKERS:
			getCircuitbreakers().clear();
			getCircuitbreakers().addAll((Collection<? extends CircuitBreakerPolicy>) newValue);
			return;
		case DaprdesignerPackage.RESILIENCY_POLICY__TIMEOUTS:
			((EStructuralFeature.Setting) getTimeouts()).set(newValue);
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
		case DaprdesignerPackage.RESILIENCY_POLICY__RETRIES:
			getRetries().clear();
			return;
		case DaprdesignerPackage.RESILIENCY_POLICY__CIRCUITBREAKERS:
			getCircuitbreakers().clear();
			return;
		case DaprdesignerPackage.RESILIENCY_POLICY__TIMEOUTS:
			getTimeouts().clear();
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
		case DaprdesignerPackage.RESILIENCY_POLICY__RETRIES:
			return retries != null && !retries.isEmpty();
		case DaprdesignerPackage.RESILIENCY_POLICY__CIRCUITBREAKERS:
			return circuitbreakers != null && !circuitbreakers.isEmpty();
		case DaprdesignerPackage.RESILIENCY_POLICY__TIMEOUTS:
			return timeouts != null && !timeouts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResiliencyPolicyImpl
