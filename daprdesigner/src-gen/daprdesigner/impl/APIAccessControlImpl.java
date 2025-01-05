/**
 */
package daprdesigner.impl;

import daprdesigner.API;
import daprdesigner.APIAccessControl;
import daprdesigner.DaprdesignerPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>API Access Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.impl.APIAccessControlImpl#getAllowedAPIs <em>Allowed AP Is</em>}</li>
 *   <li>{@link daprdesigner.impl.APIAccessControlImpl#getDeniedAPIs <em>Denied AP Is</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APIAccessControlImpl extends MinimalEObjectImpl.Container implements APIAccessControl {
	/**
	 * The cached value of the '{@link #getAllowedAPIs() <em>Allowed AP Is</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedAPIs()
	 * @generated
	 * @ordered
	 */
	protected EList<API> allowedAPIs;

	/**
	 * The cached value of the '{@link #getDeniedAPIs() <em>Denied AP Is</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeniedAPIs()
	 * @generated
	 * @ordered
	 */
	protected EList<API> deniedAPIs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APIAccessControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaprdesignerPackage.Literals.API_ACCESS_CONTROL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<API> getAllowedAPIs() {
		if (allowedAPIs == null) {
			allowedAPIs = new EObjectContainmentEList<API>(API.class, this,
					DaprdesignerPackage.API_ACCESS_CONTROL__ALLOWED_AP_IS);
		}
		return allowedAPIs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<API> getDeniedAPIs() {
		if (deniedAPIs == null) {
			deniedAPIs = new EObjectContainmentEList<API>(API.class, this,
					DaprdesignerPackage.API_ACCESS_CONTROL__DENIED_AP_IS);
		}
		return deniedAPIs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DaprdesignerPackage.API_ACCESS_CONTROL__ALLOWED_AP_IS:
			return ((InternalEList<?>) getAllowedAPIs()).basicRemove(otherEnd, msgs);
		case DaprdesignerPackage.API_ACCESS_CONTROL__DENIED_AP_IS:
			return ((InternalEList<?>) getDeniedAPIs()).basicRemove(otherEnd, msgs);
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
		case DaprdesignerPackage.API_ACCESS_CONTROL__ALLOWED_AP_IS:
			return getAllowedAPIs();
		case DaprdesignerPackage.API_ACCESS_CONTROL__DENIED_AP_IS:
			return getDeniedAPIs();
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
		case DaprdesignerPackage.API_ACCESS_CONTROL__ALLOWED_AP_IS:
			getAllowedAPIs().clear();
			getAllowedAPIs().addAll((Collection<? extends API>) newValue);
			return;
		case DaprdesignerPackage.API_ACCESS_CONTROL__DENIED_AP_IS:
			getDeniedAPIs().clear();
			getDeniedAPIs().addAll((Collection<? extends API>) newValue);
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
		case DaprdesignerPackage.API_ACCESS_CONTROL__ALLOWED_AP_IS:
			getAllowedAPIs().clear();
			return;
		case DaprdesignerPackage.API_ACCESS_CONTROL__DENIED_AP_IS:
			getDeniedAPIs().clear();
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
		case DaprdesignerPackage.API_ACCESS_CONTROL__ALLOWED_AP_IS:
			return allowedAPIs != null && !allowedAPIs.isEmpty();
		case DaprdesignerPackage.API_ACCESS_CONTROL__DENIED_AP_IS:
			return deniedAPIs != null && !deniedAPIs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //APIAccessControlImpl
