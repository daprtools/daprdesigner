/**
 */
package daprdesigner.impl;

import daprdesigner.CircuitBreakerPolicy;
import daprdesigner.DaprdesignerPackage;
import daprdesigner.ResiliencyTarget;
import daprdesigner.ResiliencyTargetType;
import daprdesigner.ResiliencyTimeout;
import daprdesigner.RetryPolicy;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resiliency Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.impl.ResiliencyTargetImpl#getType <em>Type</em>}</li>
 *   <li>{@link daprdesigner.impl.ResiliencyTargetImpl#getCircuitBreaker <em>Circuit Breaker</em>}</li>
 *   <li>{@link daprdesigner.impl.ResiliencyTargetImpl#getRetry <em>Retry</em>}</li>
 *   <li>{@link daprdesigner.impl.ResiliencyTargetImpl#getCircuitBreakerCacheSize <em>Circuit Breaker Cache Size</em>}</li>
 *   <li>{@link daprdesigner.impl.ResiliencyTargetImpl#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link daprdesigner.impl.ResiliencyTargetImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResiliencyTargetImpl extends DaprNodeImpl implements ResiliencyTarget {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ResiliencyTargetType TYPE_EDEFAULT = ResiliencyTargetType.APP;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ResiliencyTargetType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCircuitBreaker() <em>Circuit Breaker</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircuitBreaker()
	 * @generated
	 * @ordered
	 */
	protected CircuitBreakerPolicy circuitBreaker;

	/**
	 * The cached value of the '{@link #getRetry() <em>Retry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetry()
	 * @generated
	 * @ordered
	 */
	protected RetryPolicy retry;

	/**
	 * The default value of the '{@link #getCircuitBreakerCacheSize() <em>Circuit Breaker Cache Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircuitBreakerCacheSize()
	 * @generated
	 * @ordered
	 */
	protected static final int CIRCUIT_BREAKER_CACHE_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCircuitBreakerCacheSize() <em>Circuit Breaker Cache Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircuitBreakerCacheSize()
	 * @generated
	 * @ordered
	 */
	protected int circuitBreakerCacheSize = CIRCUIT_BREAKER_CACHE_SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected ResiliencyTimeout timeout;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResiliencyTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaprdesignerPackage.Literals.RESILIENCY_TARGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResiliencyTargetType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ResiliencyTargetType newType) {
		ResiliencyTargetType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.RESILIENCY_TARGET__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircuitBreakerPolicy getCircuitBreaker() {
		if (circuitBreaker != null && circuitBreaker.eIsProxy()) {
			InternalEObject oldCircuitBreaker = (InternalEObject) circuitBreaker;
			circuitBreaker = (CircuitBreakerPolicy) eResolveProxy(oldCircuitBreaker);
			if (circuitBreaker != oldCircuitBreaker) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DaprdesignerPackage.RESILIENCY_TARGET__CIRCUIT_BREAKER, oldCircuitBreaker, circuitBreaker));
			}
		}
		return circuitBreaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircuitBreakerPolicy basicGetCircuitBreaker() {
		return circuitBreaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCircuitBreaker(CircuitBreakerPolicy newCircuitBreaker) {
		CircuitBreakerPolicy oldCircuitBreaker = circuitBreaker;
		circuitBreaker = newCircuitBreaker;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.RESILIENCY_TARGET__CIRCUIT_BREAKER, oldCircuitBreaker, circuitBreaker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RetryPolicy getRetry() {
		if (retry != null && retry.eIsProxy()) {
			InternalEObject oldRetry = (InternalEObject) retry;
			retry = (RetryPolicy) eResolveProxy(oldRetry);
			if (retry != oldRetry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DaprdesignerPackage.RESILIENCY_TARGET__RETRY, oldRetry, retry));
			}
		}
		return retry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RetryPolicy basicGetRetry() {
		return retry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetry(RetryPolicy newRetry) {
		RetryPolicy oldRetry = retry;
		retry = newRetry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.RESILIENCY_TARGET__RETRY,
					oldRetry, retry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCircuitBreakerCacheSize() {
		return circuitBreakerCacheSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCircuitBreakerCacheSize(int newCircuitBreakerCacheSize) {
		int oldCircuitBreakerCacheSize = circuitBreakerCacheSize;
		circuitBreakerCacheSize = newCircuitBreakerCacheSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.RESILIENCY_TARGET__CIRCUIT_BREAKER_CACHE_SIZE, oldCircuitBreakerCacheSize,
					circuitBreakerCacheSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResiliencyTimeout getTimeout() {
		if (timeout != null && timeout.eIsProxy()) {
			InternalEObject oldTimeout = (InternalEObject) timeout;
			timeout = (ResiliencyTimeout) eResolveProxy(oldTimeout);
			if (timeout != oldTimeout) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DaprdesignerPackage.RESILIENCY_TARGET__TIMEOUT, oldTimeout, timeout));
			}
		}
		return timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResiliencyTimeout basicGetTimeout() {
		return timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeout(ResiliencyTimeout newTimeout) {
		ResiliencyTimeout oldTimeout = timeout;
		timeout = newTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.RESILIENCY_TARGET__TIMEOUT,
					oldTimeout, timeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.RESILIENCY_TARGET__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DaprdesignerPackage.RESILIENCY_TARGET__TYPE:
			return getType();
		case DaprdesignerPackage.RESILIENCY_TARGET__CIRCUIT_BREAKER:
			if (resolve)
				return getCircuitBreaker();
			return basicGetCircuitBreaker();
		case DaprdesignerPackage.RESILIENCY_TARGET__RETRY:
			if (resolve)
				return getRetry();
			return basicGetRetry();
		case DaprdesignerPackage.RESILIENCY_TARGET__CIRCUIT_BREAKER_CACHE_SIZE:
			return getCircuitBreakerCacheSize();
		case DaprdesignerPackage.RESILIENCY_TARGET__TIMEOUT:
			if (resolve)
				return getTimeout();
			return basicGetTimeout();
		case DaprdesignerPackage.RESILIENCY_TARGET__NAME:
			return getName();
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
		case DaprdesignerPackage.RESILIENCY_TARGET__TYPE:
			setType((ResiliencyTargetType) newValue);
			return;
		case DaprdesignerPackage.RESILIENCY_TARGET__CIRCUIT_BREAKER:
			setCircuitBreaker((CircuitBreakerPolicy) newValue);
			return;
		case DaprdesignerPackage.RESILIENCY_TARGET__RETRY:
			setRetry((RetryPolicy) newValue);
			return;
		case DaprdesignerPackage.RESILIENCY_TARGET__CIRCUIT_BREAKER_CACHE_SIZE:
			setCircuitBreakerCacheSize((Integer) newValue);
			return;
		case DaprdesignerPackage.RESILIENCY_TARGET__TIMEOUT:
			setTimeout((ResiliencyTimeout) newValue);
			return;
		case DaprdesignerPackage.RESILIENCY_TARGET__NAME:
			setName((String) newValue);
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
		case DaprdesignerPackage.RESILIENCY_TARGET__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case DaprdesignerPackage.RESILIENCY_TARGET__CIRCUIT_BREAKER:
			setCircuitBreaker((CircuitBreakerPolicy) null);
			return;
		case DaprdesignerPackage.RESILIENCY_TARGET__RETRY:
			setRetry((RetryPolicy) null);
			return;
		case DaprdesignerPackage.RESILIENCY_TARGET__CIRCUIT_BREAKER_CACHE_SIZE:
			setCircuitBreakerCacheSize(CIRCUIT_BREAKER_CACHE_SIZE_EDEFAULT);
			return;
		case DaprdesignerPackage.RESILIENCY_TARGET__TIMEOUT:
			setTimeout((ResiliencyTimeout) null);
			return;
		case DaprdesignerPackage.RESILIENCY_TARGET__NAME:
			setName(NAME_EDEFAULT);
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
		case DaprdesignerPackage.RESILIENCY_TARGET__TYPE:
			return type != TYPE_EDEFAULT;
		case DaprdesignerPackage.RESILIENCY_TARGET__CIRCUIT_BREAKER:
			return circuitBreaker != null;
		case DaprdesignerPackage.RESILIENCY_TARGET__RETRY:
			return retry != null;
		case DaprdesignerPackage.RESILIENCY_TARGET__CIRCUIT_BREAKER_CACHE_SIZE:
			return circuitBreakerCacheSize != CIRCUIT_BREAKER_CACHE_SIZE_EDEFAULT;
		case DaprdesignerPackage.RESILIENCY_TARGET__TIMEOUT:
			return timeout != null;
		case DaprdesignerPackage.RESILIENCY_TARGET__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", circuitBreakerCacheSize: ");
		result.append(circuitBreakerCacheSize);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ResiliencyTargetImpl
