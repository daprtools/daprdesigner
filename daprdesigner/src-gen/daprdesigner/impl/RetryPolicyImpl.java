/**
 */
package daprdesigner.impl;

import daprdesigner.DaprdesignerPackage;
import daprdesigner.RetryPolicy;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Retry Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.impl.RetryPolicyImpl#getName <em>Name</em>}</li>
 *   <li>{@link daprdesigner.impl.RetryPolicyImpl#getPolicy_type <em>Policy type</em>}</li>
 *   <li>{@link daprdesigner.impl.RetryPolicyImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link daprdesigner.impl.RetryPolicyImpl#getMaxRetries <em>Max Retries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RetryPolicyImpl extends MinimalEObjectImpl.Container implements RetryPolicy {
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
	 * The default value of the '{@link #getPolicy_type() <em>Policy type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicy_type()
	 * @generated
	 * @ordered
	 */
	protected static final String POLICY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPolicy_type() <em>Policy type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicy_type()
	 * @generated
	 * @ordered
	 */
	protected String policy_type = POLICY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final String DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected String duration = DURATION_EDEFAULT;

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
	public String getPolicy_type() {
		return policy_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicy_type(String newPolicy_type) {
		String oldPolicy_type = policy_type;
		policy_type = newPolicy_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.RETRY_POLICY__POLICY_TYPE,
					oldPolicy_type, policy_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(String newDuration) {
		String oldDuration = duration;
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DaprdesignerPackage.RETRY_POLICY__NAME:
			return getName();
		case DaprdesignerPackage.RETRY_POLICY__POLICY_TYPE:
			return getPolicy_type();
		case DaprdesignerPackage.RETRY_POLICY__DURATION:
			return getDuration();
		case DaprdesignerPackage.RETRY_POLICY__MAX_RETRIES:
			return getMaxRetries();
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
		case DaprdesignerPackage.RETRY_POLICY__NAME:
			setName((String) newValue);
			return;
		case DaprdesignerPackage.RETRY_POLICY__POLICY_TYPE:
			setPolicy_type((String) newValue);
			return;
		case DaprdesignerPackage.RETRY_POLICY__DURATION:
			setDuration((String) newValue);
			return;
		case DaprdesignerPackage.RETRY_POLICY__MAX_RETRIES:
			setMaxRetries((Integer) newValue);
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
		case DaprdesignerPackage.RETRY_POLICY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case DaprdesignerPackage.RETRY_POLICY__POLICY_TYPE:
			setPolicy_type(POLICY_TYPE_EDEFAULT);
			return;
		case DaprdesignerPackage.RETRY_POLICY__DURATION:
			setDuration(DURATION_EDEFAULT);
			return;
		case DaprdesignerPackage.RETRY_POLICY__MAX_RETRIES:
			setMaxRetries(MAX_RETRIES_EDEFAULT);
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
		case DaprdesignerPackage.RETRY_POLICY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case DaprdesignerPackage.RETRY_POLICY__POLICY_TYPE:
			return POLICY_TYPE_EDEFAULT == null ? policy_type != null : !POLICY_TYPE_EDEFAULT.equals(policy_type);
		case DaprdesignerPackage.RETRY_POLICY__DURATION:
			return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
		case DaprdesignerPackage.RETRY_POLICY__MAX_RETRIES:
			return maxRetries != MAX_RETRIES_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", policy_type: ");
		result.append(policy_type);
		result.append(", duration: ");
		result.append(duration);
		result.append(", maxRetries: ");
		result.append(maxRetries);
		result.append(')');
		return result.toString();
	}

} //RetryPolicyImpl
