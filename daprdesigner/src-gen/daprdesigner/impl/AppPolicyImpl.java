/**
 */
package daprdesigner.impl;

import daprdesigner.App;
import daprdesigner.AppPolicy;
import daprdesigner.DaprdesignerPackage;
import daprdesigner.Namespace;
import daprdesigner.Operation;
import daprdesigner.Trustdomain;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>App Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.impl.AppPolicyImpl#getApp <em>App</em>}</li>
 *   <li>{@link daprdesigner.impl.AppPolicyImpl#getDefaultAction <em>Default Action</em>}</li>
 *   <li>{@link daprdesigner.impl.AppPolicyImpl#getTrustDomain <em>Trust Domain</em>}</li>
 *   <li>{@link daprdesigner.impl.AppPolicyImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link daprdesigner.impl.AppPolicyImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AppPolicyImpl extends MinimalEObjectImpl.Container implements AppPolicy {
	/**
	 * The cached value of the '{@link #getApp() <em>App</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApp()
	 * @generated
	 * @ordered
	 */
	protected App app;

	/**
	 * The default value of the '{@link #getDefaultAction() <em>Default Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultAction()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultAction() <em>Default Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultAction()
	 * @generated
	 * @ordered
	 */
	protected String defaultAction = DEFAULT_ACTION_EDEFAULT;

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
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected Namespace namespace;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> operations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaprdesignerPackage.Literals.APP_POLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public App getApp() {
		if (app != null && app.eIsProxy()) {
			InternalEObject oldApp = (InternalEObject) app;
			app = (App) eResolveProxy(oldApp);
			if (app != oldApp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DaprdesignerPackage.APP_POLICY__APP,
							oldApp, app));
			}
		}
		return app;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public App basicGetApp() {
		return app;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApp(App newApp) {
		App oldApp = app;
		app = newApp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.APP_POLICY__APP, oldApp, app));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultAction() {
		return defaultAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultAction(String newDefaultAction) {
		String oldDefaultAction = defaultAction;
		defaultAction = newDefaultAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.APP_POLICY__DEFAULT_ACTION,
					oldDefaultAction, defaultAction));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DaprdesignerPackage.APP_POLICY__TRUST_DOMAIN, oldTrustDomain, trustDomain));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.APP_POLICY__TRUST_DOMAIN,
					oldTrustDomain, trustDomain));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DaprdesignerPackage.APP_POLICY__NAMESPACE,
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
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.APP_POLICY__NAMESPACE,
					oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<Operation>(Operation.class, this,
					DaprdesignerPackage.APP_POLICY__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DaprdesignerPackage.APP_POLICY__OPERATIONS:
			return ((InternalEList<?>) getOperations()).basicRemove(otherEnd, msgs);
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
		case DaprdesignerPackage.APP_POLICY__APP:
			if (resolve)
				return getApp();
			return basicGetApp();
		case DaprdesignerPackage.APP_POLICY__DEFAULT_ACTION:
			return getDefaultAction();
		case DaprdesignerPackage.APP_POLICY__TRUST_DOMAIN:
			if (resolve)
				return getTrustDomain();
			return basicGetTrustDomain();
		case DaprdesignerPackage.APP_POLICY__NAMESPACE:
			if (resolve)
				return getNamespace();
			return basicGetNamespace();
		case DaprdesignerPackage.APP_POLICY__OPERATIONS:
			return getOperations();
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
		case DaprdesignerPackage.APP_POLICY__APP:
			setApp((App) newValue);
			return;
		case DaprdesignerPackage.APP_POLICY__DEFAULT_ACTION:
			setDefaultAction((String) newValue);
			return;
		case DaprdesignerPackage.APP_POLICY__TRUST_DOMAIN:
			setTrustDomain((Trustdomain) newValue);
			return;
		case DaprdesignerPackage.APP_POLICY__NAMESPACE:
			setNamespace((Namespace) newValue);
			return;
		case DaprdesignerPackage.APP_POLICY__OPERATIONS:
			getOperations().clear();
			getOperations().addAll((Collection<? extends Operation>) newValue);
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
		case DaprdesignerPackage.APP_POLICY__APP:
			setApp((App) null);
			return;
		case DaprdesignerPackage.APP_POLICY__DEFAULT_ACTION:
			setDefaultAction(DEFAULT_ACTION_EDEFAULT);
			return;
		case DaprdesignerPackage.APP_POLICY__TRUST_DOMAIN:
			setTrustDomain((Trustdomain) null);
			return;
		case DaprdesignerPackage.APP_POLICY__NAMESPACE:
			setNamespace((Namespace) null);
			return;
		case DaprdesignerPackage.APP_POLICY__OPERATIONS:
			getOperations().clear();
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
		case DaprdesignerPackage.APP_POLICY__APP:
			return app != null;
		case DaprdesignerPackage.APP_POLICY__DEFAULT_ACTION:
			return DEFAULT_ACTION_EDEFAULT == null ? defaultAction != null
					: !DEFAULT_ACTION_EDEFAULT.equals(defaultAction);
		case DaprdesignerPackage.APP_POLICY__TRUST_DOMAIN:
			return trustDomain != null;
		case DaprdesignerPackage.APP_POLICY__NAMESPACE:
			return namespace != null;
		case DaprdesignerPackage.APP_POLICY__OPERATIONS:
			return operations != null && !operations.isEmpty();
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
		result.append(" (defaultAction: ");
		result.append(defaultAction);
		result.append(')');
		return result.toString();
	}

} //AppPolicyImpl
