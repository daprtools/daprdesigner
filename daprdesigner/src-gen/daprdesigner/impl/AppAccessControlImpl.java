/**
 */
package daprdesigner.impl;

import daprdesigner.AppAccessControl;
import daprdesigner.AppPolicy;
import daprdesigner.DaprdesignerPackage;
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
 * An implementation of the model object '<em><b>App Access Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.impl.AppAccessControlImpl#getDefaultAction <em>Default Action</em>}</li>
 *   <li>{@link daprdesigner.impl.AppAccessControlImpl#getTrustDomain <em>Trust Domain</em>}</li>
 *   <li>{@link daprdesigner.impl.AppAccessControlImpl#getPolicies <em>Policies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AppAccessControlImpl extends MinimalEObjectImpl.Container implements AppAccessControl {
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
	 * The cached value of the '{@link #getPolicies() <em>Policies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicies()
	 * @generated
	 * @ordered
	 */
	protected EList<AppPolicy> policies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppAccessControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaprdesignerPackage.Literals.APP_ACCESS_CONTROL;
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.APP_ACCESS_CONTROL__DEFAULT_ACTION, oldDefaultAction, defaultAction));
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
							DaprdesignerPackage.APP_ACCESS_CONTROL__TRUST_DOMAIN, oldTrustDomain, trustDomain));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.APP_ACCESS_CONTROL__TRUST_DOMAIN,
					oldTrustDomain, trustDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AppPolicy> getPolicies() {
		if (policies == null) {
			policies = new EObjectContainmentEList<AppPolicy>(AppPolicy.class, this,
					DaprdesignerPackage.APP_ACCESS_CONTROL__POLICIES);
		}
		return policies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DaprdesignerPackage.APP_ACCESS_CONTROL__POLICIES:
			return ((InternalEList<?>) getPolicies()).basicRemove(otherEnd, msgs);
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
		case DaprdesignerPackage.APP_ACCESS_CONTROL__DEFAULT_ACTION:
			return getDefaultAction();
		case DaprdesignerPackage.APP_ACCESS_CONTROL__TRUST_DOMAIN:
			if (resolve)
				return getTrustDomain();
			return basicGetTrustDomain();
		case DaprdesignerPackage.APP_ACCESS_CONTROL__POLICIES:
			return getPolicies();
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
		case DaprdesignerPackage.APP_ACCESS_CONTROL__DEFAULT_ACTION:
			setDefaultAction((String) newValue);
			return;
		case DaprdesignerPackage.APP_ACCESS_CONTROL__TRUST_DOMAIN:
			setTrustDomain((Trustdomain) newValue);
			return;
		case DaprdesignerPackage.APP_ACCESS_CONTROL__POLICIES:
			getPolicies().clear();
			getPolicies().addAll((Collection<? extends AppPolicy>) newValue);
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
		case DaprdesignerPackage.APP_ACCESS_CONTROL__DEFAULT_ACTION:
			setDefaultAction(DEFAULT_ACTION_EDEFAULT);
			return;
		case DaprdesignerPackage.APP_ACCESS_CONTROL__TRUST_DOMAIN:
			setTrustDomain((Trustdomain) null);
			return;
		case DaprdesignerPackage.APP_ACCESS_CONTROL__POLICIES:
			getPolicies().clear();
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
		case DaprdesignerPackage.APP_ACCESS_CONTROL__DEFAULT_ACTION:
			return DEFAULT_ACTION_EDEFAULT == null ? defaultAction != null
					: !DEFAULT_ACTION_EDEFAULT.equals(defaultAction);
		case DaprdesignerPackage.APP_ACCESS_CONTROL__TRUST_DOMAIN:
			return trustDomain != null;
		case DaprdesignerPackage.APP_ACCESS_CONTROL__POLICIES:
			return policies != null && !policies.isEmpty();
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

} //AppAccessControlImpl
