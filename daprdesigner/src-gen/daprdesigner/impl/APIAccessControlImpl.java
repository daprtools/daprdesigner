/**
 */
package daprdesigner.impl;

import daprdesigner.API;
import daprdesigner.APIAccessControl;
import daprdesigner.DaprdesignerPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>API Access Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.impl.APIAccessControlImpl#getApiList <em>Api List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APIAccessControlImpl extends AppConfigurationImpl implements APIAccessControl {
	/**
	 * The cached value of the '{@link #getApiList() <em>Api List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiList()
	 * @generated
	 * @ordered
	 */
	protected EList<API> apiList;

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
	public EList<API> getApiList() {
		if (apiList == null) {
			apiList = new EObjectResolvingEList<API>(API.class, this, DaprdesignerPackage.API_ACCESS_CONTROL__API_LIST);
		}
		return apiList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DaprdesignerPackage.API_ACCESS_CONTROL__API_LIST:
			return getApiList();
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
		case DaprdesignerPackage.API_ACCESS_CONTROL__API_LIST:
			getApiList().clear();
			getApiList().addAll((Collection<? extends API>) newValue);
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
		case DaprdesignerPackage.API_ACCESS_CONTROL__API_LIST:
			getApiList().clear();
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
		case DaprdesignerPackage.API_ACCESS_CONTROL__API_LIST:
			return apiList != null && !apiList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //APIAccessControlImpl
