/**
 */
package daprdesigner.impl;

import daprdesigner.App;
import daprdesigner.DaprdesignerPackage;
import daprdesigner.HTTPEndPoint;
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
 * An implementation of the model object '<em><b>HTTP End Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.impl.HTTPEndPointImpl#getHelp <em>Help</em>}</li>
 *   <li>{@link daprdesigner.impl.HTTPEndPointImpl#getApiVersion <em>Api Version</em>}</li>
 *   <li>{@link daprdesigner.impl.HTTPEndPointImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link daprdesigner.impl.HTTPEndPointImpl#getBaseUrl <em>Base Url</em>}</li>
 *   <li>{@link daprdesigner.impl.HTTPEndPointImpl#getAuth <em>Auth</em>}</li>
 *   <li>{@link daprdesigner.impl.HTTPEndPointImpl#getScopes <em>Scopes</em>}</li>
 *   <li>{@link daprdesigner.impl.HTTPEndPointImpl#getSpecHeaders <em>Spec Headers</em>}</li>
 *   <li>{@link daprdesigner.impl.HTTPEndPointImpl#getSpecRootCA <em>Spec Root CA</em>}</li>
 *   <li>{@link daprdesigner.impl.HTTPEndPointImpl#getSpecCertificate <em>Spec Certificate</em>}</li>
 *   <li>{@link daprdesigner.impl.HTTPEndPointImpl#getSpecPrivateKey <em>Spec Private Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HTTPEndPointImpl extends DaprNodeImpl implements HTTPEndPoint {
	/**
	 * The default value of the '{@link #getHelp() <em>Help</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelp()
	 * @generated
	 * @ordered
	 */
	protected static final String HELP_EDEFAULT = "https://docs.dapr.io/reference/resource-specs/httpendpoints-schema/";

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
	protected static final String KIND_EDEFAULT = "HTTPEndpoint";

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
	 * The default value of the '{@link #getBaseUrl() <em>Base Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseUrl() <em>Base Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseUrl()
	 * @generated
	 * @ordered
	 */
	protected String baseUrl = BASE_URL_EDEFAULT;

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
	 * The cached value of the '{@link #getScopes() <em>Scopes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopes()
	 * @generated
	 * @ordered
	 */
	protected EList<App> scopes;

	/**
	 * The cached value of the '{@link #getSpecHeaders() <em>Spec Headers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecHeaders()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecMetadata> specHeaders;

	/**
	 * The cached value of the '{@link #getSpecRootCA() <em>Spec Root CA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecRootCA()
	 * @generated
	 * @ordered
	 */
	protected SpecMetadata specRootCA;

	/**
	 * The cached value of the '{@link #getSpecCertificate() <em>Spec Certificate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecCertificate()
	 * @generated
	 * @ordered
	 */
	protected SpecMetadata specCertificate;

	/**
	 * The cached value of the '{@link #getSpecPrivateKey() <em>Spec Private Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecPrivateKey()
	 * @generated
	 * @ordered
	 */
	protected SpecMetadata specPrivateKey;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HTTPEndPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaprdesignerPackage.Literals.HTTP_END_POINT;
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
	public String getBaseUrl() {
		return baseUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseUrl(String newBaseUrl) {
		String oldBaseUrl = baseUrl;
		baseUrl = newBaseUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.HTTP_END_POINT__BASE_URL,
					oldBaseUrl, baseUrl));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DaprdesignerPackage.HTTP_END_POINT__AUTH,
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
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.HTTP_END_POINT__AUTH, oldAuth,
					auth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<App> getScopes() {
		if (scopes == null) {
			scopes = new EObjectResolvingEList<App>(App.class, this, DaprdesignerPackage.HTTP_END_POINT__SCOPES);
		}
		return scopes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecMetadata> getSpecHeaders() {
		if (specHeaders == null) {
			specHeaders = new EObjectResolvingEList<SpecMetadata>(SpecMetadata.class, this,
					DaprdesignerPackage.HTTP_END_POINT__SPEC_HEADERS);
		}
		return specHeaders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecMetadata getSpecRootCA() {
		if (specRootCA != null && specRootCA.eIsProxy()) {
			InternalEObject oldSpecRootCA = (InternalEObject) specRootCA;
			specRootCA = (SpecMetadata) eResolveProxy(oldSpecRootCA);
			if (specRootCA != oldSpecRootCA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DaprdesignerPackage.HTTP_END_POINT__SPEC_ROOT_CA, oldSpecRootCA, specRootCA));
			}
		}
		return specRootCA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecMetadata basicGetSpecRootCA() {
		return specRootCA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecRootCA(SpecMetadata newSpecRootCA) {
		SpecMetadata oldSpecRootCA = specRootCA;
		specRootCA = newSpecRootCA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.HTTP_END_POINT__SPEC_ROOT_CA,
					oldSpecRootCA, specRootCA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecMetadata getSpecCertificate() {
		if (specCertificate != null && specCertificate.eIsProxy()) {
			InternalEObject oldSpecCertificate = (InternalEObject) specCertificate;
			specCertificate = (SpecMetadata) eResolveProxy(oldSpecCertificate);
			if (specCertificate != oldSpecCertificate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DaprdesignerPackage.HTTP_END_POINT__SPEC_CERTIFICATE, oldSpecCertificate, specCertificate));
			}
		}
		return specCertificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecMetadata basicGetSpecCertificate() {
		return specCertificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecCertificate(SpecMetadata newSpecCertificate) {
		SpecMetadata oldSpecCertificate = specCertificate;
		specCertificate = newSpecCertificate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.HTTP_END_POINT__SPEC_CERTIFICATE,
					oldSpecCertificate, specCertificate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecMetadata getSpecPrivateKey() {
		if (specPrivateKey != null && specPrivateKey.eIsProxy()) {
			InternalEObject oldSpecPrivateKey = (InternalEObject) specPrivateKey;
			specPrivateKey = (SpecMetadata) eResolveProxy(oldSpecPrivateKey);
			if (specPrivateKey != oldSpecPrivateKey) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DaprdesignerPackage.HTTP_END_POINT__SPEC_PRIVATE_KEY, oldSpecPrivateKey, specPrivateKey));
			}
		}
		return specPrivateKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecMetadata basicGetSpecPrivateKey() {
		return specPrivateKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecPrivateKey(SpecMetadata newSpecPrivateKey) {
		SpecMetadata oldSpecPrivateKey = specPrivateKey;
		specPrivateKey = newSpecPrivateKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.HTTP_END_POINT__SPEC_PRIVATE_KEY,
					oldSpecPrivateKey, specPrivateKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DaprdesignerPackage.HTTP_END_POINT__HELP:
			return getHelp();
		case DaprdesignerPackage.HTTP_END_POINT__API_VERSION:
			return getApiVersion();
		case DaprdesignerPackage.HTTP_END_POINT__KIND:
			return getKind();
		case DaprdesignerPackage.HTTP_END_POINT__BASE_URL:
			return getBaseUrl();
		case DaprdesignerPackage.HTTP_END_POINT__AUTH:
			if (resolve)
				return getAuth();
			return basicGetAuth();
		case DaprdesignerPackage.HTTP_END_POINT__SCOPES:
			return getScopes();
		case DaprdesignerPackage.HTTP_END_POINT__SPEC_HEADERS:
			return getSpecHeaders();
		case DaprdesignerPackage.HTTP_END_POINT__SPEC_ROOT_CA:
			if (resolve)
				return getSpecRootCA();
			return basicGetSpecRootCA();
		case DaprdesignerPackage.HTTP_END_POINT__SPEC_CERTIFICATE:
			if (resolve)
				return getSpecCertificate();
			return basicGetSpecCertificate();
		case DaprdesignerPackage.HTTP_END_POINT__SPEC_PRIVATE_KEY:
			if (resolve)
				return getSpecPrivateKey();
			return basicGetSpecPrivateKey();
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
		case DaprdesignerPackage.HTTP_END_POINT__BASE_URL:
			setBaseUrl((String) newValue);
			return;
		case DaprdesignerPackage.HTTP_END_POINT__AUTH:
			setAuth((SecretStore) newValue);
			return;
		case DaprdesignerPackage.HTTP_END_POINT__SCOPES:
			getScopes().clear();
			getScopes().addAll((Collection<? extends App>) newValue);
			return;
		case DaprdesignerPackage.HTTP_END_POINT__SPEC_HEADERS:
			getSpecHeaders().clear();
			getSpecHeaders().addAll((Collection<? extends SpecMetadata>) newValue);
			return;
		case DaprdesignerPackage.HTTP_END_POINT__SPEC_ROOT_CA:
			setSpecRootCA((SpecMetadata) newValue);
			return;
		case DaprdesignerPackage.HTTP_END_POINT__SPEC_CERTIFICATE:
			setSpecCertificate((SpecMetadata) newValue);
			return;
		case DaprdesignerPackage.HTTP_END_POINT__SPEC_PRIVATE_KEY:
			setSpecPrivateKey((SpecMetadata) newValue);
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
		case DaprdesignerPackage.HTTP_END_POINT__BASE_URL:
			setBaseUrl(BASE_URL_EDEFAULT);
			return;
		case DaprdesignerPackage.HTTP_END_POINT__AUTH:
			setAuth((SecretStore) null);
			return;
		case DaprdesignerPackage.HTTP_END_POINT__SCOPES:
			getScopes().clear();
			return;
		case DaprdesignerPackage.HTTP_END_POINT__SPEC_HEADERS:
			getSpecHeaders().clear();
			return;
		case DaprdesignerPackage.HTTP_END_POINT__SPEC_ROOT_CA:
			setSpecRootCA((SpecMetadata) null);
			return;
		case DaprdesignerPackage.HTTP_END_POINT__SPEC_CERTIFICATE:
			setSpecCertificate((SpecMetadata) null);
			return;
		case DaprdesignerPackage.HTTP_END_POINT__SPEC_PRIVATE_KEY:
			setSpecPrivateKey((SpecMetadata) null);
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
		case DaprdesignerPackage.HTTP_END_POINT__HELP:
			return HELP_EDEFAULT == null ? help != null : !HELP_EDEFAULT.equals(help);
		case DaprdesignerPackage.HTTP_END_POINT__API_VERSION:
			return API_VERSION_EDEFAULT == null ? apiVersion != null : !API_VERSION_EDEFAULT.equals(apiVersion);
		case DaprdesignerPackage.HTTP_END_POINT__KIND:
			return KIND_EDEFAULT == null ? kind != null : !KIND_EDEFAULT.equals(kind);
		case DaprdesignerPackage.HTTP_END_POINT__BASE_URL:
			return BASE_URL_EDEFAULT == null ? baseUrl != null : !BASE_URL_EDEFAULT.equals(baseUrl);
		case DaprdesignerPackage.HTTP_END_POINT__AUTH:
			return auth != null;
		case DaprdesignerPackage.HTTP_END_POINT__SCOPES:
			return scopes != null && !scopes.isEmpty();
		case DaprdesignerPackage.HTTP_END_POINT__SPEC_HEADERS:
			return specHeaders != null && !specHeaders.isEmpty();
		case DaprdesignerPackage.HTTP_END_POINT__SPEC_ROOT_CA:
			return specRootCA != null;
		case DaprdesignerPackage.HTTP_END_POINT__SPEC_CERTIFICATE:
			return specCertificate != null;
		case DaprdesignerPackage.HTTP_END_POINT__SPEC_PRIVATE_KEY:
			return specPrivateKey != null;
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
		result.append(", apiVersion: ");
		result.append(apiVersion);
		result.append(", kind: ");
		result.append(kind);
		result.append(", baseUrl: ");
		result.append(baseUrl);
		result.append(')');
		return result.toString();
	}

} //HTTPEndPointImpl
