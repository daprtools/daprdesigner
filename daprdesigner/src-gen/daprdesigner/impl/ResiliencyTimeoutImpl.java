/**
 */
package daprdesigner.impl;

import daprdesigner.DaprdesignerPackage;
import daprdesigner.ResiliencyTimeout;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resiliency Timeout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.impl.ResiliencyTimeoutImpl#getHelp <em>Help</em>}</li>
 *   <li>{@link daprdesigner.impl.ResiliencyTimeoutImpl#getTimeOutinSeconds <em>Time Outin Seconds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResiliencyTimeoutImpl extends DaprNodeImpl implements ResiliencyTimeout {
	/**
	 * The default value of the '{@link #getHelp() <em>Help</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelp()
	 * @generated
	 * @ordered
	 */
	protected static final String HELP_EDEFAULT = "https://docs.dapr.io/operations/resiliency/policies/#timeouts";

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
	 * The default value of the '{@link #getTimeOutinSeconds() <em>Time Outin Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOutinSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final int TIME_OUTIN_SECONDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTimeOutinSeconds() <em>Time Outin Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOutinSeconds()
	 * @generated
	 * @ordered
	 */
	protected int timeOutinSeconds = TIME_OUTIN_SECONDS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResiliencyTimeoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaprdesignerPackage.Literals.RESILIENCY_TIMEOUT;
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
	public int getTimeOutinSeconds() {
		return timeOutinSeconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeOutinSeconds(int newTimeOutinSeconds) {
		int oldTimeOutinSeconds = timeOutinSeconds;
		timeOutinSeconds = newTimeOutinSeconds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.RESILIENCY_TIMEOUT__TIME_OUTIN_SECONDS, oldTimeOutinSeconds, timeOutinSeconds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DaprdesignerPackage.RESILIENCY_TIMEOUT__HELP:
			return getHelp();
		case DaprdesignerPackage.RESILIENCY_TIMEOUT__TIME_OUTIN_SECONDS:
			return getTimeOutinSeconds();
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
		case DaprdesignerPackage.RESILIENCY_TIMEOUT__TIME_OUTIN_SECONDS:
			setTimeOutinSeconds((Integer) newValue);
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
		case DaprdesignerPackage.RESILIENCY_TIMEOUT__TIME_OUTIN_SECONDS:
			setTimeOutinSeconds(TIME_OUTIN_SECONDS_EDEFAULT);
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
		case DaprdesignerPackage.RESILIENCY_TIMEOUT__HELP:
			return HELP_EDEFAULT == null ? help != null : !HELP_EDEFAULT.equals(help);
		case DaprdesignerPackage.RESILIENCY_TIMEOUT__TIME_OUTIN_SECONDS:
			return timeOutinSeconds != TIME_OUTIN_SECONDS_EDEFAULT;
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
		result.append(", timeOutinSeconds: ");
		result.append(timeOutinSeconds);
		result.append(')');
		return result.toString();
	}

} //ResiliencyTimeoutImpl
