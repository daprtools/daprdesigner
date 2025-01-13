/**
 */
package daprdesigner.impl;

import daprdesigner.App;
import daprdesigner.AppConfiguration;
import daprdesigner.DaprdesignerPackage;
import daprdesigner.Namespace;
import daprdesigner.SDKLanguage;
import daprdesigner.Trustdomain;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>App</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.impl.AppImpl#getAppId <em>App Id</em>}</li>
 *   <li>{@link daprdesigner.impl.AppImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link daprdesigner.impl.AppImpl#getSdkLanguage <em>Sdk Language</em>}</li>
 *   <li>{@link daprdesigner.impl.AppImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link daprdesigner.impl.AppImpl#getTrustDomain <em>Trust Domain</em>}</li>
 *   <li>{@link daprdesigner.impl.AppImpl#getConfigurations <em>Configurations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AppImpl extends DaprNodeImpl implements App {
	/**
	 * The default value of the '{@link #getAppId() <em>App Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppId()
	 * @generated
	 * @ordered
	 */
	protected static final String APP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAppId() <em>App Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppId()
	 * @generated
	 * @ordered
	 */
	protected String appId = APP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepository() <em>Repository</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepository()
	 * @generated
	 * @ordered
	 */
	protected static final String REPOSITORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepository() <em>Repository</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepository()
	 * @generated
	 * @ordered
	 */
	protected String repository = REPOSITORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSdkLanguage() <em>Sdk Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSdkLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final SDKLanguage SDK_LANGUAGE_EDEFAULT = SDKLanguage.JAVA;

	/**
	 * The cached value of the '{@link #getSdkLanguage() <em>Sdk Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSdkLanguage()
	 * @generated
	 * @ordered
	 */
	protected SDKLanguage sdkLanguage = SDK_LANGUAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected Namespace namespace;

	/**
	 * The cached value of the '{@link #getTrustDomain() <em>Trust Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrustDomain()
	 * @generated
	 * @ordered
	 */
	protected Trustdomain trustDomain;

	/**
	 * The cached value of the '{@link #getConfigurations() <em>Configurations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<AppConfiguration> configurations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaprdesignerPackage.Literals.APP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAppId() {
		return appId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppId(String newAppId) {
		String oldAppId = appId;
		appId = newAppId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.APP__APP_ID, oldAppId, appId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepository() {
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepository(String newRepository) {
		String oldRepository = repository;
		repository = newRepository;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.APP__REPOSITORY, oldRepository,
					repository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDKLanguage getSdkLanguage() {
		return sdkLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSdkLanguage(SDKLanguage newSdkLanguage) {
		SDKLanguage oldSdkLanguage = sdkLanguage;
		sdkLanguage = newSdkLanguage == null ? SDK_LANGUAGE_EDEFAULT : newSdkLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.APP__SDK_LANGUAGE, oldSdkLanguage,
					sdkLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getNamespace() {
		if (namespace != null && namespace.eIsProxy()) {
			InternalEObject oldNamespace = (InternalEObject) namespace;
			namespace = (Namespace) eResolveProxy(oldNamespace);
			if (namespace != oldNamespace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DaprdesignerPackage.APP__NAMESPACE,
							oldNamespace, namespace));
			}
		}
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(Namespace newNamespace) {
		Namespace oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.APP__NAMESPACE, oldNamespace,
					namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trustdomain getTrustDomain() {
		if (trustDomain != null && trustDomain.eIsProxy()) {
			InternalEObject oldTrustDomain = (InternalEObject) trustDomain;
			trustDomain = (Trustdomain) eResolveProxy(oldTrustDomain);
			if (trustDomain != oldTrustDomain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DaprdesignerPackage.APP__TRUST_DOMAIN,
							oldTrustDomain, trustDomain));
			}
		}
		return trustDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trustdomain basicGetTrustDomain() {
		return trustDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrustDomain(Trustdomain newTrustDomain) {
		Trustdomain oldTrustDomain = trustDomain;
		trustDomain = newTrustDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.APP__TRUST_DOMAIN, oldTrustDomain,
					trustDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AppConfiguration> getConfigurations() {
		if (configurations == null) {
			configurations = new EObjectResolvingEList<AppConfiguration>(AppConfiguration.class, this,
					DaprdesignerPackage.APP__CONFIGURATIONS);
		}
		return configurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DaprdesignerPackage.APP__APP_ID:
			return getAppId();
		case DaprdesignerPackage.APP__REPOSITORY:
			return getRepository();
		case DaprdesignerPackage.APP__SDK_LANGUAGE:
			return getSdkLanguage();
		case DaprdesignerPackage.APP__NAMESPACE:
			if (resolve)
				return getNamespace();
			return basicGetNamespace();
		case DaprdesignerPackage.APP__TRUST_DOMAIN:
			if (resolve)
				return getTrustDomain();
			return basicGetTrustDomain();
		case DaprdesignerPackage.APP__CONFIGURATIONS:
			return getConfigurations();
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
		case DaprdesignerPackage.APP__APP_ID:
			setAppId((String) newValue);
			return;
		case DaprdesignerPackage.APP__REPOSITORY:
			setRepository((String) newValue);
			return;
		case DaprdesignerPackage.APP__SDK_LANGUAGE:
			setSdkLanguage((SDKLanguage) newValue);
			return;
		case DaprdesignerPackage.APP__NAMESPACE:
			setNamespace((Namespace) newValue);
			return;
		case DaprdesignerPackage.APP__TRUST_DOMAIN:
			setTrustDomain((Trustdomain) newValue);
			return;
		case DaprdesignerPackage.APP__CONFIGURATIONS:
			getConfigurations().clear();
			getConfigurations().addAll((Collection<? extends AppConfiguration>) newValue);
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
		case DaprdesignerPackage.APP__APP_ID:
			setAppId(APP_ID_EDEFAULT);
			return;
		case DaprdesignerPackage.APP__REPOSITORY:
			setRepository(REPOSITORY_EDEFAULT);
			return;
		case DaprdesignerPackage.APP__SDK_LANGUAGE:
			setSdkLanguage(SDK_LANGUAGE_EDEFAULT);
			return;
		case DaprdesignerPackage.APP__NAMESPACE:
			setNamespace((Namespace) null);
			return;
		case DaprdesignerPackage.APP__TRUST_DOMAIN:
			setTrustDomain((Trustdomain) null);
			return;
		case DaprdesignerPackage.APP__CONFIGURATIONS:
			getConfigurations().clear();
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
		case DaprdesignerPackage.APP__APP_ID:
			return APP_ID_EDEFAULT == null ? appId != null : !APP_ID_EDEFAULT.equals(appId);
		case DaprdesignerPackage.APP__REPOSITORY:
			return REPOSITORY_EDEFAULT == null ? repository != null : !REPOSITORY_EDEFAULT.equals(repository);
		case DaprdesignerPackage.APP__SDK_LANGUAGE:
			return sdkLanguage != SDK_LANGUAGE_EDEFAULT;
		case DaprdesignerPackage.APP__NAMESPACE:
			return namespace != null;
		case DaprdesignerPackage.APP__TRUST_DOMAIN:
			return trustDomain != null;
		case DaprdesignerPackage.APP__CONFIGURATIONS:
			return configurations != null && !configurations.isEmpty();
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
		result.append(" (appId: ");
		result.append(appId);
		result.append(", repository: ");
		result.append(repository);
		result.append(", sdkLanguage: ");
		result.append(sdkLanguage);
		result.append(')');
		return result.toString();
	}

} //AppImpl
