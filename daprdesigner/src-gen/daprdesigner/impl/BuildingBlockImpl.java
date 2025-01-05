/**
 */
package daprdesigner.impl;

import daprdesigner.BuildingBlock;
import daprdesigner.DaprdesignerPackage;
import daprdesigner.Namespace;
import daprdesigner.Trustdomain;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Building Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.impl.BuildingBlockImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link daprdesigner.impl.BuildingBlockImpl#getTrustDomain <em>Trust Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BuildingBlockImpl extends MinimalEObjectImpl.Container implements BuildingBlock {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuildingBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaprdesignerPackage.Literals.BUILDING_BLOCK;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DaprdesignerPackage.BUILDING_BLOCK__NAMESPACE, oldNamespace, namespace));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.BUILDING_BLOCK__NAMESPACE,
					oldNamespace, namespace));
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
							DaprdesignerPackage.BUILDING_BLOCK__TRUST_DOMAIN, oldTrustDomain, trustDomain));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.BUILDING_BLOCK__TRUST_DOMAIN,
					oldTrustDomain, trustDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DaprdesignerPackage.BUILDING_BLOCK__NAMESPACE:
			if (resolve)
				return getNamespace();
			return basicGetNamespace();
		case DaprdesignerPackage.BUILDING_BLOCK__TRUST_DOMAIN:
			if (resolve)
				return getTrustDomain();
			return basicGetTrustDomain();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DaprdesignerPackage.BUILDING_BLOCK__NAMESPACE:
			setNamespace((Namespace) newValue);
			return;
		case DaprdesignerPackage.BUILDING_BLOCK__TRUST_DOMAIN:
			setTrustDomain((Trustdomain) newValue);
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
		case DaprdesignerPackage.BUILDING_BLOCK__NAMESPACE:
			setNamespace((Namespace) null);
			return;
		case DaprdesignerPackage.BUILDING_BLOCK__TRUST_DOMAIN:
			setTrustDomain((Trustdomain) null);
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
		case DaprdesignerPackage.BUILDING_BLOCK__NAMESPACE:
			return namespace != null;
		case DaprdesignerPackage.BUILDING_BLOCK__TRUST_DOMAIN:
			return trustDomain != null;
		}
		return super.eIsSet(featureID);
	}

} //BuildingBlockImpl
