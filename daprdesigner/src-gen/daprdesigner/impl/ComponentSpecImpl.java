/**
 */
package daprdesigner.impl;

import daprdesigner.ComponentSpec;
import daprdesigner.DaprdesignerPackage;
import daprdesigner.SpecMetadata;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.impl.ComponentSpecImpl#isIgnoreErrors <em>Ignore Errors</em>}</li>
 *   <li>{@link daprdesigner.impl.ComponentSpecImpl#getInitTimeout <em>Init Timeout</em>}</li>
 *   <li>{@link daprdesigner.impl.ComponentSpecImpl#getSpec_metadata <em>Spec metadata</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentSpecImpl extends MinimalEObjectImpl.Container implements ComponentSpec {
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
	 * The cached value of the '{@link #getSpec_metadata() <em>Spec metadata</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpec_metadata()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecMetadata> spec_metadata;

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
	public EList<SpecMetadata> getSpec_metadata() {
		if (spec_metadata == null) {
			spec_metadata = new EObjectContainmentEList<SpecMetadata>(SpecMetadata.class, this,
					DaprdesignerPackage.COMPONENT_SPEC__SPEC_METADATA);
		}
		return spec_metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DaprdesignerPackage.COMPONENT_SPEC__SPEC_METADATA:
			return ((InternalEList<?>) getSpec_metadata()).basicRemove(otherEnd, msgs);
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
		case DaprdesignerPackage.COMPONENT_SPEC__IGNORE_ERRORS:
			return isIgnoreErrors();
		case DaprdesignerPackage.COMPONENT_SPEC__INIT_TIMEOUT:
			return getInitTimeout();
		case DaprdesignerPackage.COMPONENT_SPEC__SPEC_METADATA:
			return getSpec_metadata();
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
			getSpec_metadata().clear();
			getSpec_metadata().addAll((Collection<? extends SpecMetadata>) newValue);
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
			getSpec_metadata().clear();
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
		case DaprdesignerPackage.COMPONENT_SPEC__IGNORE_ERRORS:
			return ignoreErrors != IGNORE_ERRORS_EDEFAULT;
		case DaprdesignerPackage.COMPONENT_SPEC__INIT_TIMEOUT:
			return INIT_TIMEOUT_EDEFAULT == null ? initTimeout != null : !INIT_TIMEOUT_EDEFAULT.equals(initTimeout);
		case DaprdesignerPackage.COMPONENT_SPEC__SPEC_METADATA:
			return spec_metadata != null && !spec_metadata.isEmpty();
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
		result.append(" (ignoreErrors: ");
		result.append(ignoreErrors);
		result.append(", initTimeout: ");
		result.append(initTimeout);
		result.append(')');
		return result.toString();
	}

} //ComponentSpecImpl
