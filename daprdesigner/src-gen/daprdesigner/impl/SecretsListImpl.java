/**
 */
package daprdesigner.impl;

import daprdesigner.DaprdesignerPackage;
import daprdesigner.SecretsList;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Secrets List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.impl.SecretsListImpl#getStoreName <em>Store Name</em>}</li>
 *   <li>{@link daprdesigner.impl.SecretsListImpl#isDefaultAccess <em>Default Access</em>}</li>
 *   <li>{@link daprdesigner.impl.SecretsListImpl#getSecrets <em>Secrets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecretsListImpl extends MinimalEObjectImpl.Container implements SecretsList {
	/**
	 * The default value of the '{@link #getStoreName() <em>Store Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoreName()
	 * @generated
	 * @ordered
	 */
	protected static final String STORE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStoreName() <em>Store Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoreName()
	 * @generated
	 * @ordered
	 */
	protected String storeName = STORE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isDefaultAccess() <em>Default Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultAccess()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFAULT_ACCESS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isDefaultAccess() <em>Default Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultAccess()
	 * @generated
	 * @ordered
	 */
	protected boolean defaultAccess = DEFAULT_ACCESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSecrets() <em>Secrets</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecrets()
	 * @generated
	 * @ordered
	 */
	protected EList<String> secrets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecretsListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaprdesignerPackage.Literals.SECRETS_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStoreName() {
		return storeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStoreName(String newStoreName) {
		String oldStoreName = storeName;
		storeName = newStoreName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.SECRETS_LIST__STORE_NAME,
					oldStoreName, storeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDefaultAccess() {
		return defaultAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultAccess(boolean newDefaultAccess) {
		boolean oldDefaultAccess = defaultAccess;
		defaultAccess = newDefaultAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.SECRETS_LIST__DEFAULT_ACCESS,
					oldDefaultAccess, defaultAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSecrets() {
		if (secrets == null) {
			secrets = new EDataTypeUniqueEList<String>(String.class, this, DaprdesignerPackage.SECRETS_LIST__SECRETS);
		}
		return secrets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DaprdesignerPackage.SECRETS_LIST__STORE_NAME:
			return getStoreName();
		case DaprdesignerPackage.SECRETS_LIST__DEFAULT_ACCESS:
			return isDefaultAccess();
		case DaprdesignerPackage.SECRETS_LIST__SECRETS:
			return getSecrets();
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
		case DaprdesignerPackage.SECRETS_LIST__STORE_NAME:
			setStoreName((String) newValue);
			return;
		case DaprdesignerPackage.SECRETS_LIST__DEFAULT_ACCESS:
			setDefaultAccess((Boolean) newValue);
			return;
		case DaprdesignerPackage.SECRETS_LIST__SECRETS:
			getSecrets().clear();
			getSecrets().addAll((Collection<? extends String>) newValue);
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
		case DaprdesignerPackage.SECRETS_LIST__STORE_NAME:
			setStoreName(STORE_NAME_EDEFAULT);
			return;
		case DaprdesignerPackage.SECRETS_LIST__DEFAULT_ACCESS:
			setDefaultAccess(DEFAULT_ACCESS_EDEFAULT);
			return;
		case DaprdesignerPackage.SECRETS_LIST__SECRETS:
			getSecrets().clear();
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
		case DaprdesignerPackage.SECRETS_LIST__STORE_NAME:
			return STORE_NAME_EDEFAULT == null ? storeName != null : !STORE_NAME_EDEFAULT.equals(storeName);
		case DaprdesignerPackage.SECRETS_LIST__DEFAULT_ACCESS:
			return defaultAccess != DEFAULT_ACCESS_EDEFAULT;
		case DaprdesignerPackage.SECRETS_LIST__SECRETS:
			return secrets != null && !secrets.isEmpty();
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
		result.append(" (storeName: ");
		result.append(storeName);
		result.append(", defaultAccess: ");
		result.append(defaultAccess);
		result.append(", secrets: ");
		result.append(secrets);
		result.append(')');
		return result.toString();
	}

} //SecretsListImpl
