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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resiliency Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.impl.ResiliencyTargetImpl#getType <em>Type</em>}</li>
 *   <li>{@link daprdesigner.impl.ResiliencyTargetImpl#getName <em>Name</em>}</li>
 *   <li>{@link daprdesigner.impl.ResiliencyTargetImpl#getCircuitBreaker <em>Circuit Breaker</em>}</li>
 *   <li>{@link daprdesigner.impl.ResiliencyTargetImpl#getRetry <em>Retry</em>}</li>
 *   <li>{@link daprdesigner.impl.ResiliencyTargetImpl#getCircuitBreakerCacheSize <em>Circuit Breaker Cache Size</em>}</li>
 *   <li>{@link daprdesigner.impl.ResiliencyTargetImpl#getTimeout <em>Timeout</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResiliencyTargetImpl extends MinimalEObjectImpl.Container implements ResiliencyTarget {
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
	 * The cached value of the '{@link #getCircuitBreaker() <em>Circuit Breaker</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircuitBreaker()
	 * @generated
	 * @ordered
	 */
	protected CircuitBreakerPolicy circuitBreaker;

	/**
	 * The cached value of the '{@link #getRetry() <em>Retry</em>}' containment reference.
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
	 * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected ResiliencyTimeout timeout;

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
	public CircuitBreakerPolicy getCircuitBreaker() {
		return circuitBreaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCircuitBreaker(CircuitBreakerPolicy newCircuitBreaker, NotificationChain msgs) {
		CircuitBreakerPolicy oldCircuitBreaker = circuitBreaker;
		circuitBreaker = newCircuitBreaker;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.RESILIENCY_TARGET__CIRCUIT_BREAKER, oldCircuitBreaker, newCircuitBreaker);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCircuitBreaker(CircuitBreakerPolicy newCircuitBreaker) {
		if (newCircuitBreaker != circuitBreaker) {
			NotificationChain msgs = null;
			if (circuitBreaker != null)
				msgs = ((InternalEObject) circuitBreaker).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DaprdesignerPackage.RESILIENCY_TARGET__CIRCUIT_BREAKER, null, msgs);
			if (newCircuitBreaker != null)
				msgs = ((InternalEObject) newCircuitBreaker).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DaprdesignerPackage.RESILIENCY_TARGET__CIRCUIT_BREAKER, null, msgs);
			msgs = basicSetCircuitBreaker(newCircuitBreaker, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.RESILIENCY_TARGET__CIRCUIT_BREAKER, newCircuitBreaker, newCircuitBreaker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RetryPolicy getRetry() {
		return retry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRetry(RetryPolicy newRetry, NotificationChain msgs) {
		RetryPolicy oldRetry = retry;
		retry = newRetry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.RESILIENCY_TARGET__RETRY, oldRetry, newRetry);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetry(RetryPolicy newRetry) {
		if (newRetry != retry) {
			NotificationChain msgs = null;
			if (retry != null)
				msgs = ((InternalEObject) retry).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DaprdesignerPackage.RESILIENCY_TARGET__RETRY, null, msgs);
			if (newRetry != null)
				msgs = ((InternalEObject) newRetry).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DaprdesignerPackage.RESILIENCY_TARGET__RETRY, null, msgs);
			msgs = basicSetRetry(newRetry, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.RESILIENCY_TARGET__RETRY,
					newRetry, newRetry));
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
		return timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeout(ResiliencyTimeout newTimeout, NotificationChain msgs) {
		ResiliencyTimeout oldTimeout = timeout;
		timeout = newTimeout;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.RESILIENCY_TARGET__TIMEOUT, oldTimeout, newTimeout);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeout(ResiliencyTimeout newTimeout) {
		if (newTimeout != timeout) {
			NotificationChain msgs = null;
			if (timeout != null)
				msgs = ((InternalEObject) timeout).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DaprdesignerPackage.RESILIENCY_TARGET__TIMEOUT, null, msgs);
			if (newTimeout != null)
				msgs = ((InternalEObject) newTimeout).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DaprdesignerPackage.RESILIENCY_TARGET__TIMEOUT, null, msgs);
			msgs = basicSetTimeout(newTimeout, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.RESILIENCY_TARGET__TIMEOUT,
					newTimeout, newTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DaprdesignerPackage.RESILIENCY_TARGET__CIRCUIT_BREAKER:
			return basicSetCircuitBreaker(null, msgs);
		case DaprdesignerPackage.RESILIENCY_TARGET__RETRY:
			return basicSetRetry(null, msgs);
		case DaprdesignerPackage.RESILIENCY_TARGET__TIMEOUT:
			return basicSetTimeout(null, msgs);
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
		case DaprdesignerPackage.RESILIENCY_TARGET__TYPE:
			return getType();
		case DaprdesignerPackage.RESILIENCY_TARGET__NAME:
			return getName();
		case DaprdesignerPackage.RESILIENCY_TARGET__CIRCUIT_BREAKER:
			return getCircuitBreaker();
		case DaprdesignerPackage.RESILIENCY_TARGET__RETRY:
			return getRetry();
		case DaprdesignerPackage.RESILIENCY_TARGET__CIRCUIT_BREAKER_CACHE_SIZE:
			return getCircuitBreakerCacheSize();
		case DaprdesignerPackage.RESILIENCY_TARGET__TIMEOUT:
			return getTimeout();
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
		case DaprdesignerPackage.RESILIENCY_TARGET__NAME:
			setName((String) newValue);
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
		case DaprdesignerPackage.RESILIENCY_TARGET__NAME:
			setName(NAME_EDEFAULT);
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
		case DaprdesignerPackage.RESILIENCY_TARGET__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case DaprdesignerPackage.RESILIENCY_TARGET__CIRCUIT_BREAKER:
			return circuitBreaker != null;
		case DaprdesignerPackage.RESILIENCY_TARGET__RETRY:
			return retry != null;
		case DaprdesignerPackage.RESILIENCY_TARGET__CIRCUIT_BREAKER_CACHE_SIZE:
			return circuitBreakerCacheSize != CIRCUIT_BREAKER_CACHE_SIZE_EDEFAULT;
		case DaprdesignerPackage.RESILIENCY_TARGET__TIMEOUT:
			return timeout != null;
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
		result.append(", name: ");
		result.append(name);
		result.append(", circuitBreakerCacheSize: ");
		result.append(circuitBreakerCacheSize);
		result.append(')');
		return result.toString();
	}

} //ResiliencyTargetImpl
