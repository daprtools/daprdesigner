/**
 */
package daprdesigner.impl;

import daprdesigner.DaprdesignerPackage;
import daprdesigner.RetryPolicy;
import daprdesigner.RetryPolicyType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Retry Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.impl.RetryPolicyImpl#getPolicy_type <em>Policy type</em>}</li>
 *   <li>{@link daprdesigner.impl.RetryPolicyImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link daprdesigner.impl.RetryPolicyImpl#getMaxRetries <em>Max Retries</em>}</li>
 *   <li>{@link daprdesigner.impl.RetryPolicyImpl#getMaxInterval <em>Max Interval</em>}</li>
 *   <li>{@link daprdesigner.impl.RetryPolicyImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RetryPolicyImpl extends DaprNodeImpl implements RetryPolicy {
	/**
	 * The default value of the '{@link #getPolicy_type() <em>Policy type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicy_type()
	 * @generated
	 * @ordered
	 */
	protected static final RetryPolicyType POLICY_TYPE_EDEFAULT = RetryPolicyType.CONSTANT;

	/**
	 * The cached value of the '{@link #getPolicy_type() <em>Policy type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicy_type()
	 * @generated
	 * @ordered
	 */
	protected RetryPolicyType policy_type = POLICY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected int duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxRetries() <em>Max Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRetries()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_RETRIES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxRetries() <em>Max Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRetries()
	 * @generated
	 * @ordered
	 */
	protected int maxRetries = MAX_RETRIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxInterval() <em>Max Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInterval()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_INTERVAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxInterval() <em>Max Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInterval()
	 * @generated
	 * @ordered
	 */
	protected int maxInterval = MAX_INTERVAL_EDEFAULT;

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
	protected RetryPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaprdesignerPackage.Literals.RETRY_POLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RetryPolicyType getPolicy_type() {
		return policy_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicy_type(RetryPolicyType newPolicy_type) {
		RetryPolicyType oldPolicy_type = policy_type;
		policy_type = newPolicy_type == null ? POLICY_TYPE_EDEFAULT : newPolicy_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.RETRY_POLICY__POLICY_TYPE,
					oldPolicy_type, policy_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(int newDuration) {
		int oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.RETRY_POLICY__DURATION,
					oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxRetries() {
		return maxRetries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxRetries(int newMaxRetries) {
		int oldMaxRetries = maxRetries;
		maxRetries = newMaxRetries;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.RETRY_POLICY__MAX_RETRIES,
					oldMaxRetries, maxRetries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxInterval() {
		return maxInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxInterval(int newMaxInterval) {
		int oldMaxInterval = maxInterval;
		maxInterval = newMaxInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.RETRY_POLICY__MAX_INTERVAL,
					oldMaxInterval, maxInterval));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.RETRY_POLICY__NAME, oldName,
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
		case DaprdesignerPackage.RETRY_POLICY__POLICY_TYPE:
			return getPolicy_type();
		case DaprdesignerPackage.RETRY_POLICY__DURATION:
			return getDuration();
		case DaprdesignerPackage.RETRY_POLICY__MAX_RETRIES:
			return getMaxRetries();
		case DaprdesignerPackage.RETRY_POLICY__MAX_INTERVAL:
			return getMaxInterval();
		case DaprdesignerPackage.RETRY_POLICY__NAME:
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
		case DaprdesignerPackage.RETRY_POLICY__POLICY_TYPE:
			setPolicy_type((RetryPolicyType) newValue);
			return;
		case DaprdesignerPackage.RETRY_POLICY__DURATION:
			setDuration((Integer) newValue);
			return;
		case DaprdesignerPackage.RETRY_POLICY__MAX_RETRIES:
			setMaxRetries((Integer) newValue);
			return;
		case DaprdesignerPackage.RETRY_POLICY__MAX_INTERVAL:
			setMaxInterval((Integer) newValue);
			return;
		case DaprdesignerPackage.RETRY_POLICY__NAME:
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
		case DaprdesignerPackage.RETRY_POLICY__POLICY_TYPE:
			setPolicy_type(POLICY_TYPE_EDEFAULT);
			return;
		case DaprdesignerPackage.RETRY_POLICY__DURATION:
			setDuration(DURATION_EDEFAULT);
			return;
		case DaprdesignerPackage.RETRY_POLICY__MAX_RETRIES:
			setMaxRetries(MAX_RETRIES_EDEFAULT);
			return;
		case DaprdesignerPackage.RETRY_POLICY__MAX_INTERVAL:
			setMaxInterval(MAX_INTERVAL_EDEFAULT);
			return;
		case DaprdesignerPackage.RETRY_POLICY__NAME:
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
		case DaprdesignerPackage.RETRY_POLICY__POLICY_TYPE:
			return policy_type != POLICY_TYPE_EDEFAULT;
		case DaprdesignerPackage.RETRY_POLICY__DURATION:
			return duration != DURATION_EDEFAULT;
		case DaprdesignerPackage.RETRY_POLICY__MAX_RETRIES:
			return maxRetries != MAX_RETRIES_EDEFAULT;
		case DaprdesignerPackage.RETRY_POLICY__MAX_INTERVAL:
			return maxInterval != MAX_INTERVAL_EDEFAULT;
		case DaprdesignerPackage.RETRY_POLICY__NAME:
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
		result.append(" (policy_type: ");
		result.append(policy_type);
		result.append(", duration: ");
		result.append(duration);
		result.append(", maxRetries: ");
		result.append(maxRetries);
		result.append(", maxInterval: ");
		result.append(maxInterval);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RetryPolicyImpl
