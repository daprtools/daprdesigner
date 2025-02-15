/**
 */
package daprdesigner.impl;

import daprdesigner.ComponentSpec;
import daprdesigner.DaprdesignerPackage;
import daprdesigner.SpecMetadata;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.impl.ComponentSpecImpl#getHelp <em>Help</em>}</li>
 *   <li>{@link daprdesigner.impl.ComponentSpecImpl#isIgnoreErrors <em>Ignore Errors</em>}</li>
 *   <li>{@link daprdesigner.impl.ComponentSpecImpl#getInitTimeout <em>Init Timeout</em>}</li>
 *   <li>{@link daprdesigner.impl.ComponentSpecImpl#getSpecMetadata <em>Spec Metadata</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentSpecImpl extends DaprNodeImpl implements ComponentSpec {
	/**
	 * The default value of the '{@link #getHelp() <em>Help</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelp()
	 * @generated
	 * @ordered
	 */
	protected static final String HELP_EDEFAULT = "https://docs.dapr.io/reference/resource-specs/component-schema/";

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
	 * The default value of the '{@link #isIgnoreErrors() <em>Ignore Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnoreErrors()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IGNORE_ERRORS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIgnoreErrors() <em>Ignore Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnoreErrors()
	 * @generated
	 * @ordered
	 */
	protected boolean ignoreErrors = IGNORE_ERRORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitTimeout() <em>Init Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final String INIT_TIMEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitTimeout() <em>Init Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitTimeout()
	 * @generated
	 * @ordered
	 */
	protected String initTimeout = INIT_TIMEOUT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpecMetadata() <em>Spec Metadata</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecMetadata()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecMetadata> specMetadata;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentSpecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaprdesignerPackage.Literals.COMPONENT_SPEC;
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
	public boolean isIgnoreErrors() {
		return ignoreErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIgnoreErrors(boolean newIgnoreErrors) {
		boolean oldIgnoreErrors = ignoreErrors;
		ignoreErrors = newIgnoreErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.COMPONENT_SPEC__IGNORE_ERRORS,
					oldIgnoreErrors, ignoreErrors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitTimeout() {
		return initTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitTimeout(String newInitTimeout) {
		String oldInitTimeout = initTimeout;
		initTimeout = newInitTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.COMPONENT_SPEC__INIT_TIMEOUT,
					oldInitTimeout, initTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecMetadata> getSpecMetadata() {
		if (specMetadata == null) {
			specMetadata = new EObjectResolvingEList<SpecMetadata>(SpecMetadata.class, this,
					DaprdesignerPackage.COMPONENT_SPEC__SPEC_METADATA);
		}
		return specMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DaprdesignerPackage.COMPONENT_SPEC__HELP:
			return getHelp();
		case DaprdesignerPackage.COMPONENT_SPEC__IGNORE_ERRORS:
			return isIgnoreErrors();
		case DaprdesignerPackage.COMPONENT_SPEC__INIT_TIMEOUT:
			return getInitTimeout();
		case DaprdesignerPackage.COMPONENT_SPEC__SPEC_METADATA:
			return getSpecMetadata();
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
		case DaprdesignerPackage.COMPONENT_SPEC__IGNORE_ERRORS:
			setIgnoreErrors((Boolean) newValue);
			return;
		case DaprdesignerPackage.COMPONENT_SPEC__INIT_TIMEOUT:
			setInitTimeout((String) newValue);
			return;
		case DaprdesignerPackage.COMPONENT_SPEC__SPEC_METADATA:
			getSpecMetadata().clear();
			getSpecMetadata().addAll((Collection<? extends SpecMetadata>) newValue);
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
		case DaprdesignerPackage.COMPONENT_SPEC__IGNORE_ERRORS:
			setIgnoreErrors(IGNORE_ERRORS_EDEFAULT);
			return;
		case DaprdesignerPackage.COMPONENT_SPEC__INIT_TIMEOUT:
			setInitTimeout(INIT_TIMEOUT_EDEFAULT);
			return;
		case DaprdesignerPackage.COMPONENT_SPEC__SPEC_METADATA:
			getSpecMetadata().clear();
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
		case DaprdesignerPackage.COMPONENT_SPEC__HELP:
			return HELP_EDEFAULT == null ? help != null : !HELP_EDEFAULT.equals(help);
		case DaprdesignerPackage.COMPONENT_SPEC__IGNORE_ERRORS:
			return ignoreErrors != IGNORE_ERRORS_EDEFAULT;
		case DaprdesignerPackage.COMPONENT_SPEC__INIT_TIMEOUT:
			return INIT_TIMEOUT_EDEFAULT == null ? initTimeout != null : !INIT_TIMEOUT_EDEFAULT.equals(initTimeout);
		case DaprdesignerPackage.COMPONENT_SPEC__SPEC_METADATA:
			return specMetadata != null && !specMetadata.isEmpty();
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
		result.append(", ignoreErrors: ");
		result.append(ignoreErrors);
		result.append(", initTimeout: ");
		result.append(initTimeout);
		result.append(')');
		return result.toString();
	}

} //ComponentSpecImpl
