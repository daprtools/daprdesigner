/**
 */
package daprdesigner.impl;

import daprdesigner.DaprdesignerPackage;
import daprdesigner.LoggingConfiguration;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logging Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.impl.LoggingConfigurationImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link daprdesigner.impl.LoggingConfigurationImpl#isObfuscateURLs <em>Obfuscate UR Ls</em>}</li>
 *   <li>{@link daprdesigner.impl.LoggingConfigurationImpl#isOmitHealthChecks <em>Omit Health Checks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoggingConfigurationImpl extends AppConfigurationImpl implements LoggingConfiguration {
	/**
	 * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean enabled = ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #isObfuscateURLs() <em>Obfuscate UR Ls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObfuscateURLs()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OBFUSCATE_UR_LS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isObfuscateURLs() <em>Obfuscate UR Ls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObfuscateURLs()
	 * @generated
	 * @ordered
	 */
	protected boolean obfuscateURLs = OBFUSCATE_UR_LS_EDEFAULT;

	/**
	 * The default value of the '{@link #isOmitHealthChecks() <em>Omit Health Checks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOmitHealthChecks()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OMIT_HEALTH_CHECKS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isOmitHealthChecks() <em>Omit Health Checks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOmitHealthChecks()
	 * @generated
	 * @ordered
	 */
	protected boolean omitHealthChecks = OMIT_HEALTH_CHECKS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoggingConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaprdesignerPackage.Literals.LOGGING_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(boolean newEnabled) {
		boolean oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.LOGGING_CONFIGURATION__ENABLED,
					oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isObfuscateURLs() {
		return obfuscateURLs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObfuscateURLs(boolean newObfuscateURLs) {
		boolean oldObfuscateURLs = obfuscateURLs;
		obfuscateURLs = newObfuscateURLs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.LOGGING_CONFIGURATION__OBFUSCATE_UR_LS, oldObfuscateURLs, obfuscateURLs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOmitHealthChecks() {
		return omitHealthChecks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOmitHealthChecks(boolean newOmitHealthChecks) {
		boolean oldOmitHealthChecks = omitHealthChecks;
		omitHealthChecks = newOmitHealthChecks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.LOGGING_CONFIGURATION__OMIT_HEALTH_CHECKS, oldOmitHealthChecks,
					omitHealthChecks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DaprdesignerPackage.LOGGING_CONFIGURATION__ENABLED:
			return isEnabled();
		case DaprdesignerPackage.LOGGING_CONFIGURATION__OBFUSCATE_UR_LS:
			return isObfuscateURLs();
		case DaprdesignerPackage.LOGGING_CONFIGURATION__OMIT_HEALTH_CHECKS:
			return isOmitHealthChecks();
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
		case DaprdesignerPackage.LOGGING_CONFIGURATION__ENABLED:
			setEnabled((Boolean) newValue);
			return;
		case DaprdesignerPackage.LOGGING_CONFIGURATION__OBFUSCATE_UR_LS:
			setObfuscateURLs((Boolean) newValue);
			return;
		case DaprdesignerPackage.LOGGING_CONFIGURATION__OMIT_HEALTH_CHECKS:
			setOmitHealthChecks((Boolean) newValue);
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
		case DaprdesignerPackage.LOGGING_CONFIGURATION__ENABLED:
			setEnabled(ENABLED_EDEFAULT);
			return;
		case DaprdesignerPackage.LOGGING_CONFIGURATION__OBFUSCATE_UR_LS:
			setObfuscateURLs(OBFUSCATE_UR_LS_EDEFAULT);
			return;
		case DaprdesignerPackage.LOGGING_CONFIGURATION__OMIT_HEALTH_CHECKS:
			setOmitHealthChecks(OMIT_HEALTH_CHECKS_EDEFAULT);
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
		case DaprdesignerPackage.LOGGING_CONFIGURATION__ENABLED:
			return enabled != ENABLED_EDEFAULT;
		case DaprdesignerPackage.LOGGING_CONFIGURATION__OBFUSCATE_UR_LS:
			return obfuscateURLs != OBFUSCATE_UR_LS_EDEFAULT;
		case DaprdesignerPackage.LOGGING_CONFIGURATION__OMIT_HEALTH_CHECKS:
			return omitHealthChecks != OMIT_HEALTH_CHECKS_EDEFAULT;
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
		result.append(" (enabled: ");
		result.append(enabled);
		result.append(", obfuscateURLs: ");
		result.append(obfuscateURLs);
		result.append(", omitHealthChecks: ");
		result.append(omitHealthChecks);
		result.append(')');
		return result.toString();
	}

} //LoggingConfigurationImpl
