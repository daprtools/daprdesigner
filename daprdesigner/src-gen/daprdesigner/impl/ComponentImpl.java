/**
 */
package daprdesigner.impl;

import daprdesigner.App;
import daprdesigner.Component;
import daprdesigner.DaprdesignerPackage;
import daprdesigner.Namespace;
import daprdesigner.SecretStore;
import daprdesigner.SpecMetadata;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.impl.ComponentImpl#getApiVersion <em>Api Version</em>}</li>
 *   <li>{@link daprdesigner.impl.ComponentImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link daprdesigner.impl.ComponentImpl#getProviderName <em>Provider Name</em>}</li>
 *   <li>{@link daprdesigner.impl.ComponentImpl#getProviderVersion <em>Provider Version</em>}</li>
 *   <li>{@link daprdesigner.impl.ComponentImpl#getAuth <em>Auth</em>}</li>
 *   <li>{@link daprdesigner.impl.ComponentImpl#getMetadata_namespace <em>Metadata namespace</em>}</li>
 *   <li>{@link daprdesigner.impl.ComponentImpl#isIgnoreErrors <em>Ignore Errors</em>}</li>
 *   <li>{@link daprdesigner.impl.ComponentImpl#getInitTimeout <em>Init Timeout</em>}</li>
 *   <li>{@link daprdesigner.impl.ComponentImpl#getSpecMetadata <em>Spec Metadata</em>}</li>
 *   <li>{@link daprdesigner.impl.ComponentImpl#getScopes <em>Scopes</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComponentImpl extends DaprNodeImpl implements Component {
	/**
	 * The default value of the '{@link #getApiVersion() <em>Api Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String API_VERSION_EDEFAULT = "dapr.io/v1alpha1";

	/**
	 * The cached value of the '{@link #getApiVersion() <em>Api Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiVersion()
	 * @generated
	 * @ordered
	 */
	protected String apiVersion = API_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final String KIND_EDEFAULT = "Component";

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected String kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getProviderName() <em>Provider Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProviderName() <em>Provider Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderName()
	 * @generated
	 * @ordered
	 */
	protected String providerName = PROVIDER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProviderVersion() <em>Provider Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProviderVersion() <em>Provider Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderVersion()
	 * @generated
	 * @ordered
	 */
	protected String providerVersion = PROVIDER_VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAuth() <em>Auth</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuth()
	 * @generated
	 * @ordered
	 */
	protected SecretStore auth;

	/**
	 * The cached value of the '{@link #getMetadata_namespace() <em>Metadata namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata_namespace()
	 * @generated
	 * @ordered
	 */
	protected Namespace metadata_namespace;

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
	 * The cached value of the '{@link #getScopes() <em>Scopes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopes()
	 * @generated
	 * @ordered
	 */
	protected EList<App> scopes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaprdesignerPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApiVersion() {
		return apiVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProviderName() {
		return providerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProviderName(String newProviderName) {
		String oldProviderName = providerName;
		providerName = newProviderName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.COMPONENT__PROVIDER_NAME,
					oldProviderName, providerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProviderVersion() {
		return providerVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProviderVersion(String newProviderVersion) {
		String oldProviderVersion = providerVersion;
		providerVersion = newProviderVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.COMPONENT__PROVIDER_VERSION,
					oldProviderVersion, providerVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecretStore getAuth() {
		if (auth != null && auth.eIsProxy()) {
			InternalEObject oldAuth = (InternalEObject) auth;
			auth = (SecretStore) eResolveProxy(oldAuth);
			if (auth != oldAuth) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DaprdesignerPackage.COMPONENT__AUTH,
							oldAuth, auth));
			}
		}
		return auth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecretStore basicGetAuth() {
		return auth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuth(SecretStore newAuth) {
		SecretStore oldAuth = auth;
		auth = newAuth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.COMPONENT__AUTH, oldAuth, auth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getMetadata_namespace() {
		if (metadata_namespace != null && metadata_namespace.eIsProxy()) {
			InternalEObject oldMetadata_namespace = (InternalEObject) metadata_namespace;
			metadata_namespace = (Namespace) eResolveProxy(oldMetadata_namespace);
			if (metadata_namespace != oldMetadata_namespace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DaprdesignerPackage.COMPONENT__METADATA_NAMESPACE, oldMetadata_namespace,
							metadata_namespace));
			}
		}
		return metadata_namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetMetadata_namespace() {
		return metadata_namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetadata_namespace(Namespace newMetadata_namespace) {
		Namespace oldMetadata_namespace = metadata_namespace;
		metadata_namespace = newMetadata_namespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.COMPONENT__METADATA_NAMESPACE,
					oldMetadata_namespace, metadata_namespace));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.COMPONENT__IGNORE_ERRORS,
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
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.COMPONENT__INIT_TIMEOUT,
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
					DaprdesignerPackage.COMPONENT__SPEC_METADATA);
		}
		return specMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<App> getScopes() {
		if (scopes == null) {
			scopes = new EObjectResolvingEList<App>(App.class, this, DaprdesignerPackage.COMPONENT__SCOPES);
		}
		return scopes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DaprdesignerPackage.COMPONENT__API_VERSION:
			return getApiVersion();
		case DaprdesignerPackage.COMPONENT__KIND:
			return getKind();
		case DaprdesignerPackage.COMPONENT__PROVIDER_NAME:
			return getProviderName();
		case DaprdesignerPackage.COMPONENT__PROVIDER_VERSION:
			return getProviderVersion();
		case DaprdesignerPackage.COMPONENT__AUTH:
			if (resolve)
				return getAuth();
			return basicGetAuth();
		case DaprdesignerPackage.COMPONENT__METADATA_NAMESPACE:
			if (resolve)
				return getMetadata_namespace();
			return basicGetMetadata_namespace();
		case DaprdesignerPackage.COMPONENT__IGNORE_ERRORS:
			return isIgnoreErrors();
		case DaprdesignerPackage.COMPONENT__INIT_TIMEOUT:
			return getInitTimeout();
		case DaprdesignerPackage.COMPONENT__SPEC_METADATA:
			return getSpecMetadata();
		case DaprdesignerPackage.COMPONENT__SCOPES:
			return getScopes();
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
		case DaprdesignerPackage.COMPONENT__PROVIDER_NAME:
			setProviderName((String) newValue);
			return;
		case DaprdesignerPackage.COMPONENT__PROVIDER_VERSION:
			setProviderVersion((String) newValue);
			return;
		case DaprdesignerPackage.COMPONENT__AUTH:
			setAuth((SecretStore) newValue);
			return;
		case DaprdesignerPackage.COMPONENT__METADATA_NAMESPACE:
			setMetadata_namespace((Namespace) newValue);
			return;
		case DaprdesignerPackage.COMPONENT__IGNORE_ERRORS:
			setIgnoreErrors((Boolean) newValue);
			return;
		case DaprdesignerPackage.COMPONENT__INIT_TIMEOUT:
			setInitTimeout((String) newValue);
			return;
		case DaprdesignerPackage.COMPONENT__SPEC_METADATA:
			getSpecMetadata().clear();
			getSpecMetadata().addAll((Collection<? extends SpecMetadata>) newValue);
			return;
		case DaprdesignerPackage.COMPONENT__SCOPES:
			getScopes().clear();
			getScopes().addAll((Collection<? extends App>) newValue);
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
		case DaprdesignerPackage.COMPONENT__PROVIDER_NAME:
			setProviderName(PROVIDER_NAME_EDEFAULT);
			return;
		case DaprdesignerPackage.COMPONENT__PROVIDER_VERSION:
			setProviderVersion(PROVIDER_VERSION_EDEFAULT);
			return;
		case DaprdesignerPackage.COMPONENT__AUTH:
			setAuth((SecretStore) null);
			return;
		case DaprdesignerPackage.COMPONENT__METADATA_NAMESPACE:
			setMetadata_namespace((Namespace) null);
			return;
		case DaprdesignerPackage.COMPONENT__IGNORE_ERRORS:
			setIgnoreErrors(IGNORE_ERRORS_EDEFAULT);
			return;
		case DaprdesignerPackage.COMPONENT__INIT_TIMEOUT:
			setInitTimeout(INIT_TIMEOUT_EDEFAULT);
			return;
		case DaprdesignerPackage.COMPONENT__SPEC_METADATA:
			getSpecMetadata().clear();
			return;
		case DaprdesignerPackage.COMPONENT__SCOPES:
			getScopes().clear();
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
		case DaprdesignerPackage.COMPONENT__API_VERSION:
			return API_VERSION_EDEFAULT == null ? apiVersion != null : !API_VERSION_EDEFAULT.equals(apiVersion);
		case DaprdesignerPackage.COMPONENT__KIND:
			return KIND_EDEFAULT == null ? kind != null : !KIND_EDEFAULT.equals(kind);
		case DaprdesignerPackage.COMPONENT__PROVIDER_NAME:
			return PROVIDER_NAME_EDEFAULT == null ? providerName != null : !PROVIDER_NAME_EDEFAULT.equals(providerName);
		case DaprdesignerPackage.COMPONENT__PROVIDER_VERSION:
			return PROVIDER_VERSION_EDEFAULT == null ? providerVersion != null
					: !PROVIDER_VERSION_EDEFAULT.equals(providerVersion);
		case DaprdesignerPackage.COMPONENT__AUTH:
			return auth != null;
		case DaprdesignerPackage.COMPONENT__METADATA_NAMESPACE:
			return metadata_namespace != null;
		case DaprdesignerPackage.COMPONENT__IGNORE_ERRORS:
			return ignoreErrors != IGNORE_ERRORS_EDEFAULT;
		case DaprdesignerPackage.COMPONENT__INIT_TIMEOUT:
			return INIT_TIMEOUT_EDEFAULT == null ? initTimeout != null : !INIT_TIMEOUT_EDEFAULT.equals(initTimeout);
		case DaprdesignerPackage.COMPONENT__SPEC_METADATA:
			return specMetadata != null && !specMetadata.isEmpty();
		case DaprdesignerPackage.COMPONENT__SCOPES:
			return scopes != null && !scopes.isEmpty();
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
		result.append(" (apiVersion: ");
		result.append(apiVersion);
		result.append(", kind: ");
		result.append(kind);
		result.append(", providerName: ");
		result.append(providerName);
		result.append(", providerVersion: ");
		result.append(providerVersion);
		result.append(", ignoreErrors: ");
		result.append(ignoreErrors);
		result.append(", initTimeout: ");
		result.append(initTimeout);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
