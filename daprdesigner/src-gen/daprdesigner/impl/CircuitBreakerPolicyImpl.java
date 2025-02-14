/**
 */
package daprdesigner.impl;

import daprdesigner.CircuitBreakerPolicy;
import daprdesigner.DaprdesignerPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Circuit Breaker Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.impl.CircuitBreakerPolicyImpl#getHelp <em>Help</em>}</li>
 *   <li>{@link daprdesigner.impl.CircuitBreakerPolicyImpl#getMaxRequests <em>Max Requests</em>}</li>
 *   <li>{@link daprdesigner.impl.CircuitBreakerPolicyImpl#getInterval <em>Interval</em>}</li>
 *   <li>{@link daprdesigner.impl.CircuitBreakerPolicyImpl#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link daprdesigner.impl.CircuitBreakerPolicyImpl#getTrip <em>Trip</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CircuitBreakerPolicyImpl extends DaprNodeImpl implements CircuitBreakerPolicy {
	/**
	 * The default value of the '{@link #getHelp() <em>Help</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelp()
	 * @generated
	 * @ordered
	 */
	protected static final String HELP_EDEFAULT = "https://docs.dapr.io/operations/resiliency/policies/#circuit-breakers";

	/**
	 * The cached value of the '{@link #getHelp() <em>Help</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelp()
	 * @generated
	 * @ordered
	 */
	protected String help = HELP_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxRequests() <em>Max Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRequests()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_REQUESTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxRequests() <em>Max Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRequests()
	 * @generated
	 * @ordered
	 */
	protected int maxRequests = MAX_REQUESTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterval() <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected static final int INTERVAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInterval() <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected int interval = INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final int TIMEOUT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected int timeout = TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrip() <em>Trip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrip()
	 * @generated
	 * @ordered
	 */
	protected static final String TRIP_EDEFAULT = "consecutiveFailures > 5";

	/**
	 * The cached value of the '{@link #getTrip() <em>Trip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrip()
	 * @generated
	 * @ordered
	 */
	protected String trip = TRIP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CircuitBreakerPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaprdesignerPackage.Literals.CIRCUIT_BREAKER_POLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHelp() {
		return help;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxRequests() {
		return maxRequests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxRequests(int newMaxRequests) {
		int oldMaxRequests = maxRequests;
		maxRequests = newMaxRequests;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.CIRCUIT_BREAKER_POLICY__MAX_REQUESTS, oldMaxRequests, maxRequests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInterval() {
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterval(int newInterval) {
		int oldInterval = interval;
		interval = newInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.CIRCUIT_BREAKER_POLICY__INTERVAL,
					oldInterval, interval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTimeout() {
		return timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeout(int newTimeout) {
		int oldTimeout = timeout;
		timeout = newTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.CIRCUIT_BREAKER_POLICY__TIMEOUT,
					oldTimeout, timeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTrip() {
		return trip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrip(String newTrip) {
		String oldTrip = trip;
		trip = newTrip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.CIRCUIT_BREAKER_POLICY__TRIP,
					oldTrip, trip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DaprdesignerPackage.CIRCUIT_BREAKER_POLICY__HELP:
			return getHelp();
		case DaprdesignerPackage.CIRCUIT_BREAKER_POLICY__MAX_REQUESTS:
			return getMaxRequests();
		case DaprdesignerPackage.CIRCUIT_BREAKER_POLICY__INTERVAL:
			return getInterval();
		case DaprdesignerPackage.CIRCUIT_BREAKER_POLICY__TIMEOUT:
			return getTimeout();
		case DaprdesignerPackage.CIRCUIT_BREAKER_POLICY__TRIP:
			return getTrip();
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
		case DaprdesignerPackage.CIRCUIT_BREAKER_POLICY__MAX_REQUESTS:
			setMaxRequests((Integer) newValue);
			return;
		case DaprdesignerPackage.CIRCUIT_BREAKER_POLICY__INTERVAL:
			setInterval((Integer) newValue);
			return;
		case DaprdesignerPackage.CIRCUIT_BREAKER_POLICY__TIMEOUT:
			setTimeout((Integer) newValue);
			return;
		case DaprdesignerPackage.CIRCUIT_BREAKER_POLICY__TRIP:
			setTrip((String) newValue);
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
		case DaprdesignerPackage.CIRCUIT_BREAKER_POLICY__MAX_REQUESTS:
			setMaxRequests(MAX_REQUESTS_EDEFAULT);
			return;
		case DaprdesignerPackage.CIRCUIT_BREAKER_POLICY__INTERVAL:
			setInterval(INTERVAL_EDEFAULT);
			return;
		case DaprdesignerPackage.CIRCUIT_BREAKER_POLICY__TIMEOUT:
			setTimeout(TIMEOUT_EDEFAULT);
			return;
		case DaprdesignerPackage.CIRCUIT_BREAKER_POLICY__TRIP:
			setTrip(TRIP_EDEFAULT);
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
		case DaprdesignerPackage.CIRCUIT_BREAKER_POLICY__HELP:
			return HELP_EDEFAULT == null ? help != null : !HELP_EDEFAULT.equals(help);
		case DaprdesignerPackage.CIRCUIT_BREAKER_POLICY__MAX_REQUESTS:
			return maxRequests != MAX_REQUESTS_EDEFAULT;
		case DaprdesignerPackage.CIRCUIT_BREAKER_POLICY__INTERVAL:
			return interval != INTERVAL_EDEFAULT;
		case DaprdesignerPackage.CIRCUIT_BREAKER_POLICY__TIMEOUT:
			return timeout != TIMEOUT_EDEFAULT;
		case DaprdesignerPackage.CIRCUIT_BREAKER_POLICY__TRIP:
			return TRIP_EDEFAULT == null ? trip != null : !TRIP_EDEFAULT.equals(trip);
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
		result.append(" (help: ");
		result.append(help);
		result.append(", maxRequests: ");
		result.append(maxRequests);
		result.append(", interval: ");
		result.append(interval);
		result.append(", timeout: ");
		result.append(timeout);
		result.append(", trip: ");
		result.append(trip);
		result.append(')');
		return result.toString();
	}

} //CircuitBreakerPolicyImpl
