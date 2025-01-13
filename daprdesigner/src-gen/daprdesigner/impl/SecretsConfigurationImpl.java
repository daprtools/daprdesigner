/**
 */
package daprdesigner.impl;

import daprdesigner.DaprdesignerPackage;
import daprdesigner.SecretsConfiguration;
import daprdesigner.SecretsList;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Secrets Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.impl.SecretsConfigurationImpl#getAllowedList <em>Allowed List</em>}</li>
 *   <li>{@link daprdesigner.impl.SecretsConfigurationImpl#getDeniedList <em>Denied List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecretsConfigurationImpl extends AppConfigurationImpl implements SecretsConfiguration {
	/**
	 * The cached value of the '{@link #getAllowedList() <em>Allowed List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedList()
	 * @generated
	 * @ordered
	 */
	protected EList<SecretsList> allowedList;

	/**
	 * The cached value of the '{@link #getDeniedList() <em>Denied List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeniedList()
	 * @generated
	 * @ordered
	 */
	protected EList<SecretsList> deniedList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecretsConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaprdesignerPackage.Literals.SECRETS_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecretsList> getAllowedList() {
		if (allowedList == null) {
			allowedList = new EObjectContainmentEList<SecretsList>(SecretsList.class, this,
					DaprdesignerPackage.SECRETS_CONFIGURATION__ALLOWED_LIST);
		}
		return allowedList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecretsList> getDeniedList() {
		if (deniedList == null) {
			deniedList = new EObjectContainmentEList<SecretsList>(SecretsList.class, this,
					DaprdesignerPackage.SECRETS_CONFIGURATION__DENIED_LIST);
		}
		return deniedList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DaprdesignerPackage.SECRETS_CONFIGURATION__ALLOWED_LIST:
			return ((InternalEList<?>) getAllowedList()).basicRemove(otherEnd, msgs);
		case DaprdesignerPackage.SECRETS_CONFIGURATION__DENIED_LIST:
			return ((InternalEList<?>) getDeniedList()).basicRemove(otherEnd, msgs);
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
		case DaprdesignerPackage.SECRETS_CONFIGURATION__ALLOWED_LIST:
			return getAllowedList();
		case DaprdesignerPackage.SECRETS_CONFIGURATION__DENIED_LIST:
			return getDeniedList();
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
		case DaprdesignerPackage.SECRETS_CONFIGURATION__ALLOWED_LIST:
			getAllowedList().clear();
			getAllowedList().addAll((Collection<? extends SecretsList>) newValue);
			return;
		case DaprdesignerPackage.SECRETS_CONFIGURATION__DENIED_LIST:
			getDeniedList().clear();
			getDeniedList().addAll((Collection<? extends SecretsList>) newValue);
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
		case DaprdesignerPackage.SECRETS_CONFIGURATION__ALLOWED_LIST:
			getAllowedList().clear();
			return;
		case DaprdesignerPackage.SECRETS_CONFIGURATION__DENIED_LIST:
			getDeniedList().clear();
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
		case DaprdesignerPackage.SECRETS_CONFIGURATION__ALLOWED_LIST:
			return allowedList != null && !allowedList.isEmpty();
		case DaprdesignerPackage.SECRETS_CONFIGURATION__DENIED_LIST:
			return deniedList != null && !deniedList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SecretsConfigurationImpl
