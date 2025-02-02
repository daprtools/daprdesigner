/**
 */
package daprdesigner.impl;

import daprdesigner.App;
import daprdesigner.Component;
import daprdesigner.ComponentSpec;
import daprdesigner.DaprdesignerPackage;
import daprdesigner.Namespace;
import daprdesigner.SecretStore;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
 *   <li>{@link daprdesigner.impl.ComponentImpl#getAuth <em>Auth</em>}</li>
 *   <li>{@link daprdesigner.impl.ComponentImpl#getMetadata_name <em>Metadata name</em>}</li>
 *   <li>{@link daprdesigner.impl.ComponentImpl#getMetadata_namespace <em>Metadata namespace</em>}</li>
 *   <li>{@link daprdesigner.impl.ComponentImpl#getSpec <em>Spec</em>}</li>
 *   <li>{@link daprdesigner.impl.ComponentImpl#getScopes <em>Scopes</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComponentImpl extends MinimalEObjectImpl.Container implements Component {
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
	 * The cached value of the '{@link #getAuth() <em>Auth</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuth()
	 * @generated
	 * @ordered
	 */
	protected SecretStore auth;

	/**
	 * The default value of the '{@link #getMetadata_name() <em>Metadata name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata_name()
	 * @generated
	 * @ordered
	 */
	protected static final String METADATA_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetadata_name() <em>Metadata name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata_name()
	 * @generated
	 * @ordered
	 */
	protected String metadata_name = METADATA_NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getSpec() <em>Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpec()
	 * @generated
	 * @ordered
	 */
	protected ComponentSpec spec;

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
	public String getMetadata_name() {
		return metadata_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetadata_name(String newMetadata_name) {
		String oldMetadata_name = metadata_name;
		metadata_name = newMetadata_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.COMPONENT__METADATA_NAME,
					oldMetadata_name, metadata_name));
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
	public ComponentSpec getSpec() {
		return spec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpec(ComponentSpec newSpec, NotificationChain msgs) {
		ComponentSpec oldSpec = spec;
		spec = newSpec;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.COMPONENT__SPEC, oldSpec, newSpec);
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
	public void setSpec(ComponentSpec newSpec) {
		if (newSpec != spec) {
			NotificationChain msgs = null;
			if (spec != null)
				msgs = ((InternalEObject) spec).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DaprdesignerPackage.COMPONENT__SPEC, null, msgs);
			if (newSpec != null)
				msgs = ((InternalEObject) newSpec).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DaprdesignerPackage.COMPONENT__SPEC, null, msgs);
			msgs = basicSetSpec(newSpec, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.COMPONENT__SPEC, newSpec,
					newSpec));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DaprdesignerPackage.COMPONENT__SPEC:
			return basicSetSpec(null, msgs);
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
		case DaprdesignerPackage.COMPONENT__API_VERSION:
			return getApiVersion();
		case DaprdesignerPackage.COMPONENT__KIND:
			return getKind();
		case DaprdesignerPackage.COMPONENT__AUTH:
			if (resolve)
				return getAuth();
			return basicGetAuth();
		case DaprdesignerPackage.COMPONENT__METADATA_NAME:
			return getMetadata_name();
		case DaprdesignerPackage.COMPONENT__METADATA_NAMESPACE:
			if (resolve)
				return getMetadata_namespace();
			return basicGetMetadata_namespace();
		case DaprdesignerPackage.COMPONENT__SPEC:
			return getSpec();
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
		case DaprdesignerPackage.COMPONENT__AUTH:
			setAuth((SecretStore) newValue);
			return;
		case DaprdesignerPackage.COMPONENT__METADATA_NAME:
			setMetadata_name((String) newValue);
			return;
		case DaprdesignerPackage.COMPONENT__METADATA_NAMESPACE:
			setMetadata_namespace((Namespace) newValue);
			return;
		case DaprdesignerPackage.COMPONENT__SPEC:
			setSpec((ComponentSpec) newValue);
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
		case DaprdesignerPackage.COMPONENT__AUTH:
			setAuth((SecretStore) null);
			return;
		case DaprdesignerPackage.COMPONENT__METADATA_NAME:
			setMetadata_name(METADATA_NAME_EDEFAULT);
			return;
		case DaprdesignerPackage.COMPONENT__METADATA_NAMESPACE:
			setMetadata_namespace((Namespace) null);
			return;
		case DaprdesignerPackage.COMPONENT__SPEC:
			setSpec((ComponentSpec) null);
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
		case DaprdesignerPackage.COMPONENT__AUTH:
			return auth != null;
		case DaprdesignerPackage.COMPONENT__METADATA_NAME:
			return METADATA_NAME_EDEFAULT == null ? metadata_name != null
					: !METADATA_NAME_EDEFAULT.equals(metadata_name);
		case DaprdesignerPackage.COMPONENT__METADATA_NAMESPACE:
			return metadata_namespace != null;
		case DaprdesignerPackage.COMPONENT__SPEC:
			return spec != null;
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
		result.append(", metadata_name: ");
		result.append(metadata_name);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
