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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HTTP End Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.impl.HTTPEndPointImpl#getApiVersion <em>Api Version</em>}</li>
 *   <li>{@link daprdesigner.impl.HTTPEndPointImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link daprdesigner.impl.HTTPEndPointImpl#getAuth <em>Auth</em>}</li>
 *   <li>{@link daprdesigner.impl.HTTPEndPointImpl#getBaseUrl <em>Base Url</em>}</li>
 *   <li>{@link daprdesigner.impl.HTTPEndPointImpl#getScopes <em>Scopes</em>}</li>
 *   <li>{@link daprdesigner.impl.HTTPEndPointImpl#getHeaders <em>Headers</em>}</li>
 *   <li>{@link daprdesigner.impl.HTTPEndPointImpl#getClientTLS_rootCA <em>Client TLS root CA</em>}</li>
 *   <li>{@link daprdesigner.impl.HTTPEndPointImpl#getClientTLS_certificate <em>Client TLS certificate</em>}</li>
 *   <li>{@link daprdesigner.impl.HTTPEndPointImpl#getClientTLS_privateKey <em>Client TLS private Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HTTPEndPointImpl extends DaprNodeImpl implements HTTPEndPoint {
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
	 * The cached value of the '{@link #getAuth() <em>Auth</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuth()
	 * @generated
	 * @ordered
	 */
	protected SecretStore auth;

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
	 * The cached value of the '{@link #getScopes() <em>Scopes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopes()
	 * @generated
	 * @ordered
	 */
	protected EList<App> scopes;

	/**
	 * The cached value of the '{@link #getHeaders() <em>Headers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaders()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecMetadata> headers;

	/**
	 * The cached value of the '{@link #getClientTLS_rootCA() <em>Client TLS root CA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientTLS_rootCA()
	 * @generated
	 * @ordered
	 */
	protected SpecMetadata clientTLS_rootCA;

	/**
	 * The cached value of the '{@link #getClientTLS_certificate() <em>Client TLS certificate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientTLS_certificate()
	 * @generated
	 * @ordered
	 */
	protected SpecMetadata clientTLS_certificate;

	/**
	 * The cached value of the '{@link #getClientTLS_privateKey() <em>Client TLS private Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientTLS_privateKey()
	 * @generated
	 * @ordered
	 */
	protected SpecMetadata clientTLS_privateKey;

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
	public EList<SpecMetadata> getHeaders() {
		if (headers == null) {
			headers = new EObjectContainmentEList<SpecMetadata>(SpecMetadata.class, this,
					DaprdesignerPackage.HTTP_END_POINT__HEADERS);
		}
		return headers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecMetadata getClientTLS_rootCA() {
		return clientTLS_rootCA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClientTLS_rootCA(SpecMetadata newClientTLS_rootCA, NotificationChain msgs) {
		SpecMetadata oldClientTLS_rootCA = clientTLS_rootCA;
		clientTLS_rootCA = newClientTLS_rootCA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.HTTP_END_POINT__CLIENT_TLS_ROOT_CA, oldClientTLS_rootCA, newClientTLS_rootCA);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientTLS_rootCA(SpecMetadata newClientTLS_rootCA) {
		if (newClientTLS_rootCA != clientTLS_rootCA) {
			NotificationChain msgs = null;
			if (clientTLS_rootCA != null)
				msgs = ((InternalEObject) clientTLS_rootCA).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DaprdesignerPackage.HTTP_END_POINT__CLIENT_TLS_ROOT_CA, null, msgs);
			if (newClientTLS_rootCA != null)
				msgs = ((InternalEObject) newClientTLS_rootCA).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DaprdesignerPackage.HTTP_END_POINT__CLIENT_TLS_ROOT_CA, null, msgs);
			msgs = basicSetClientTLS_rootCA(newClientTLS_rootCA, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.HTTP_END_POINT__CLIENT_TLS_ROOT_CA, newClientTLS_rootCA, newClientTLS_rootCA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecMetadata getClientTLS_certificate() {
		return clientTLS_certificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClientTLS_certificate(SpecMetadata newClientTLS_certificate,
			NotificationChain msgs) {
		SpecMetadata oldClientTLS_certificate = clientTLS_certificate;
		clientTLS_certificate = newClientTLS_certificate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.HTTP_END_POINT__CLIENT_TLS_CERTIFICATE, oldClientTLS_certificate,
					newClientTLS_certificate);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientTLS_certificate(SpecMetadata newClientTLS_certificate) {
		if (newClientTLS_certificate != clientTLS_certificate) {
			NotificationChain msgs = null;
			if (clientTLS_certificate != null)
				msgs = ((InternalEObject) clientTLS_certificate).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DaprdesignerPackage.HTTP_END_POINT__CLIENT_TLS_CERTIFICATE, null,
						msgs);
			if (newClientTLS_certificate != null)
				msgs = ((InternalEObject) newClientTLS_certificate).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DaprdesignerPackage.HTTP_END_POINT__CLIENT_TLS_CERTIFICATE, null,
						msgs);
			msgs = basicSetClientTLS_certificate(newClientTLS_certificate, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.HTTP_END_POINT__CLIENT_TLS_CERTIFICATE, newClientTLS_certificate,
					newClientTLS_certificate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecMetadata getClientTLS_privateKey() {
		return clientTLS_privateKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClientTLS_privateKey(SpecMetadata newClientTLS_privateKey,
			NotificationChain msgs) {
		SpecMetadata oldClientTLS_privateKey = clientTLS_privateKey;
		clientTLS_privateKey = newClientTLS_privateKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.HTTP_END_POINT__CLIENT_TLS_PRIVATE_KEY, oldClientTLS_privateKey,
					newClientTLS_privateKey);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientTLS_privateKey(SpecMetadata newClientTLS_privateKey) {
		if (newClientTLS_privateKey != clientTLS_privateKey) {
			NotificationChain msgs = null;
			if (clientTLS_privateKey != null)
				msgs = ((InternalEObject) clientTLS_privateKey).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DaprdesignerPackage.HTTP_END_POINT__CLIENT_TLS_PRIVATE_KEY, null,
						msgs);
			if (newClientTLS_privateKey != null)
				msgs = ((InternalEObject) newClientTLS_privateKey).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DaprdesignerPackage.HTTP_END_POINT__CLIENT_TLS_PRIVATE_KEY, null,
						msgs);
			msgs = basicSetClientTLS_privateKey(newClientTLS_privateKey, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.HTTP_END_POINT__CLIENT_TLS_PRIVATE_KEY, newClientTLS_privateKey,
					newClientTLS_privateKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DaprdesignerPackage.HTTP_END_POINT__HEADERS:
			return ((InternalEList<?>) getHeaders()).basicRemove(otherEnd, msgs);
		case DaprdesignerPackage.HTTP_END_POINT__CLIENT_TLS_ROOT_CA:
			return basicSetClientTLS_rootCA(null, msgs);
		case DaprdesignerPackage.HTTP_END_POINT__CLIENT_TLS_CERTIFICATE:
			return basicSetClientTLS_certificate(null, msgs);
		case DaprdesignerPackage.HTTP_END_POINT__CLIENT_TLS_PRIVATE_KEY:
			return basicSetClientTLS_privateKey(null, msgs);
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
		case DaprdesignerPackage.HTTP_END_POINT__API_VERSION:
			return getApiVersion();
		case DaprdesignerPackage.HTTP_END_POINT__KIND:
			return getKind();
		case DaprdesignerPackage.HTTP_END_POINT__AUTH:
			if (resolve)
				return getAuth();
			return basicGetAuth();
		case DaprdesignerPackage.HTTP_END_POINT__BASE_URL:
			return getBaseUrl();
		case DaprdesignerPackage.HTTP_END_POINT__SCOPES:
			return getScopes();
		case DaprdesignerPackage.HTTP_END_POINT__HEADERS:
			return getHeaders();
		case DaprdesignerPackage.HTTP_END_POINT__CLIENT_TLS_ROOT_CA:
			return getClientTLS_rootCA();
		case DaprdesignerPackage.HTTP_END_POINT__CLIENT_TLS_CERTIFICATE:
			return getClientTLS_certificate();
		case DaprdesignerPackage.HTTP_END_POINT__CLIENT_TLS_PRIVATE_KEY:
			return getClientTLS_privateKey();
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
		case DaprdesignerPackage.HTTP_END_POINT__AUTH:
			setAuth((SecretStore) newValue);
			return;
		case DaprdesignerPackage.HTTP_END_POINT__BASE_URL:
			setBaseUrl((String) newValue);
			return;
		case DaprdesignerPackage.HTTP_END_POINT__SCOPES:
			getScopes().clear();
			getScopes().addAll((Collection<? extends App>) newValue);
			return;
		case DaprdesignerPackage.HTTP_END_POINT__HEADERS:
			getHeaders().clear();
			getHeaders().addAll((Collection<? extends SpecMetadata>) newValue);
			return;
		case DaprdesignerPackage.HTTP_END_POINT__CLIENT_TLS_ROOT_CA:
			setClientTLS_rootCA((SpecMetadata) newValue);
			return;
		case DaprdesignerPackage.HTTP_END_POINT__CLIENT_TLS_CERTIFICATE:
			setClientTLS_certificate((SpecMetadata) newValue);
			return;
		case DaprdesignerPackage.HTTP_END_POINT__CLIENT_TLS_PRIVATE_KEY:
			setClientTLS_privateKey((SpecMetadata) newValue);
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
		case DaprdesignerPackage.HTTP_END_POINT__AUTH:
			setAuth((SecretStore) null);
			return;
		case DaprdesignerPackage.HTTP_END_POINT__BASE_URL:
			setBaseUrl(BASE_URL_EDEFAULT);
			return;
		case DaprdesignerPackage.HTTP_END_POINT__SCOPES:
			getScopes().clear();
			return;
		case DaprdesignerPackage.HTTP_END_POINT__HEADERS:
			getHeaders().clear();
			return;
		case DaprdesignerPackage.HTTP_END_POINT__CLIENT_TLS_ROOT_CA:
			setClientTLS_rootCA((SpecMetadata) null);
			return;
		case DaprdesignerPackage.HTTP_END_POINT__CLIENT_TLS_CERTIFICATE:
			setClientTLS_certificate((SpecMetadata) null);
			return;
		case DaprdesignerPackage.HTTP_END_POINT__CLIENT_TLS_PRIVATE_KEY:
			setClientTLS_privateKey((SpecMetadata) null);
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
		case DaprdesignerPackage.HTTP_END_POINT__API_VERSION:
			return API_VERSION_EDEFAULT == null ? apiVersion != null : !API_VERSION_EDEFAULT.equals(apiVersion);
		case DaprdesignerPackage.HTTP_END_POINT__KIND:
			return KIND_EDEFAULT == null ? kind != null : !KIND_EDEFAULT.equals(kind);
		case DaprdesignerPackage.HTTP_END_POINT__AUTH:
			return auth != null;
		case DaprdesignerPackage.HTTP_END_POINT__BASE_URL:
			return BASE_URL_EDEFAULT == null ? baseUrl != null : !BASE_URL_EDEFAULT.equals(baseUrl);
		case DaprdesignerPackage.HTTP_END_POINT__SCOPES:
			return scopes != null && !scopes.isEmpty();
		case DaprdesignerPackage.HTTP_END_POINT__HEADERS:
			return headers != null && !headers.isEmpty();
		case DaprdesignerPackage.HTTP_END_POINT__CLIENT_TLS_ROOT_CA:
			return clientTLS_rootCA != null;
		case DaprdesignerPackage.HTTP_END_POINT__CLIENT_TLS_CERTIFICATE:
			return clientTLS_certificate != null;
		case DaprdesignerPackage.HTTP_END_POINT__CLIENT_TLS_PRIVATE_KEY:
			return clientTLS_privateKey != null;
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
		result.append(", baseUrl: ");
		result.append(baseUrl);
		result.append(')');
		return result.toString();
	}

} //HTTPEndPointImpl
