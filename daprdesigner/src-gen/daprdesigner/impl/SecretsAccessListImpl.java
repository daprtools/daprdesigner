/**
 */
package daprdesigner.impl;

import daprdesigner.AccessAction;
import daprdesigner.DaprdesignerPackage;
import daprdesigner.SecretStore;
import daprdesigner.SecretsAccessList;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Secrets Access List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.impl.SecretsAccessListImpl#getHelp <em>Help</em>}</li>
 *   <li>{@link daprdesigner.impl.SecretsAccessListImpl#getSecretStore <em>Secret Store</em>}</li>
 *   <li>{@link daprdesigner.impl.SecretsAccessListImpl#getDefaultAccess <em>Default Access</em>}</li>
 *   <li>{@link daprdesigner.impl.SecretsAccessListImpl#getAllowedSecrets <em>Allowed Secrets</em>}</li>
 *   <li>{@link daprdesigner.impl.SecretsAccessListImpl#getDeniedSecrets <em>Denied Secrets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecretsAccessListImpl extends DaprNodeImpl implements SecretsAccessList {
	/**
	 * The default value of the '{@link #getHelp() <em>Help</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelp()
	 * @generated
	 * @ordered
	 */
	protected static final String HELP_EDEFAULT = "https://docs.dapr.io/operations/configuration/secret-scope/";

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
	 * The cached value of the '{@link #getSecretStore() <em>Secret Store</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecretStore()
	 * @generated
	 * @ordered
	 */
	protected SecretStore secretStore;

	/**
	 * The default value of the '{@link #getDefaultAccess() <em>Default Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultAccess()
	 * @generated
	 * @ordered
	 */
	protected static final AccessAction DEFAULT_ACCESS_EDEFAULT = AccessAction.ALLOW;

	/**
	 * The cached value of the '{@link #getDefaultAccess() <em>Default Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultAccess()
	 * @generated
	 * @ordered
	 */
	protected AccessAction defaultAccess = DEFAULT_ACCESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAllowedSecrets() <em>Allowed Secrets</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedSecrets()
	 * @generated
	 * @ordered
	 */
	protected EList<String> allowedSecrets;

	/**
	 * The cached value of the '{@link #getDeniedSecrets() <em>Denied Secrets</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeniedSecrets()
	 * @generated
	 * @ordered
	 */
	protected EList<String> deniedSecrets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecretsAccessListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaprdesignerPackage.Literals.SECRETS_ACCESS_LIST;
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
	public SecretStore getSecretStore() {
		if (secretStore != null && secretStore.eIsProxy()) {
			InternalEObject oldSecretStore = (InternalEObject) secretStore;
			secretStore = (SecretStore) eResolveProxy(oldSecretStore);
			if (secretStore != oldSecretStore) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DaprdesignerPackage.SECRETS_ACCESS_LIST__SECRET_STORE, oldSecretStore, secretStore));
			}
		}
		return secretStore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecretStore basicGetSecretStore() {
		return secretStore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecretStore(SecretStore newSecretStore) {
		SecretStore oldSecretStore = secretStore;
		secretStore = newSecretStore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.SECRETS_ACCESS_LIST__SECRET_STORE,
					oldSecretStore, secretStore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessAction getDefaultAccess() {
		return defaultAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultAccess(AccessAction newDefaultAccess) {
		AccessAction oldDefaultAccess = defaultAccess;
		defaultAccess = newDefaultAccess == null ? DEFAULT_ACCESS_EDEFAULT : newDefaultAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.SECRETS_ACCESS_LIST__DEFAULT_ACCESS, oldDefaultAccess, defaultAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAllowedSecrets() {
		if (allowedSecrets == null) {
			allowedSecrets = new EDataTypeUniqueEList<String>(String.class, this,
					DaprdesignerPackage.SECRETS_ACCESS_LIST__ALLOWED_SECRETS);
		}
		return allowedSecrets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDeniedSecrets() {
		if (deniedSecrets == null) {
			deniedSecrets = new EDataTypeUniqueEList<String>(String.class, this,
					DaprdesignerPackage.SECRETS_ACCESS_LIST__DENIED_SECRETS);
		}
		return deniedSecrets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DaprdesignerPackage.SECRETS_ACCESS_LIST__HELP:
			return getHelp();
		case DaprdesignerPackage.SECRETS_ACCESS_LIST__SECRET_STORE:
			if (resolve)
				return getSecretStore();
			return basicGetSecretStore();
		case DaprdesignerPackage.SECRETS_ACCESS_LIST__DEFAULT_ACCESS:
			return getDefaultAccess();
		case DaprdesignerPackage.SECRETS_ACCESS_LIST__ALLOWED_SECRETS:
			return getAllowedSecrets();
		case DaprdesignerPackage.SECRETS_ACCESS_LIST__DENIED_SECRETS:
			return getDeniedSecrets();
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
		case DaprdesignerPackage.SECRETS_ACCESS_LIST__SECRET_STORE:
			setSecretStore((SecretStore) newValue);
			return;
		case DaprdesignerPackage.SECRETS_ACCESS_LIST__DEFAULT_ACCESS:
			setDefaultAccess((AccessAction) newValue);
			return;
		case DaprdesignerPackage.SECRETS_ACCESS_LIST__ALLOWED_SECRETS:
			getAllowedSecrets().clear();
			getAllowedSecrets().addAll((Collection<? extends String>) newValue);
			return;
		case DaprdesignerPackage.SECRETS_ACCESS_LIST__DENIED_SECRETS:
			getDeniedSecrets().clear();
			getDeniedSecrets().addAll((Collection<? extends String>) newValue);
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
		case DaprdesignerPackage.SECRETS_ACCESS_LIST__SECRET_STORE:
			setSecretStore((SecretStore) null);
			return;
		case DaprdesignerPackage.SECRETS_ACCESS_LIST__DEFAULT_ACCESS:
			setDefaultAccess(DEFAULT_ACCESS_EDEFAULT);
			return;
		case DaprdesignerPackage.SECRETS_ACCESS_LIST__ALLOWED_SECRETS:
			getAllowedSecrets().clear();
			return;
		case DaprdesignerPackage.SECRETS_ACCESS_LIST__DENIED_SECRETS:
			getDeniedSecrets().clear();
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
		case DaprdesignerPackage.SECRETS_ACCESS_LIST__HELP:
			return HELP_EDEFAULT == null ? help != null : !HELP_EDEFAULT.equals(help);
		case DaprdesignerPackage.SECRETS_ACCESS_LIST__SECRET_STORE:
			return secretStore != null;
		case DaprdesignerPackage.SECRETS_ACCESS_LIST__DEFAULT_ACCESS:
			return defaultAccess != DEFAULT_ACCESS_EDEFAULT;
		case DaprdesignerPackage.SECRETS_ACCESS_LIST__ALLOWED_SECRETS:
			return allowedSecrets != null && !allowedSecrets.isEmpty();
		case DaprdesignerPackage.SECRETS_ACCESS_LIST__DENIED_SECRETS:
			return deniedSecrets != null && !deniedSecrets.isEmpty();
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
		result.append(", defaultAccess: ");
		result.append(defaultAccess);
		result.append(", allowedSecrets: ");
		result.append(allowedSecrets);
		result.append(", deniedSecrets: ");
		result.append(deniedSecrets);
		result.append(')');
		return result.toString();
	}

} //SecretsAccessListImpl
