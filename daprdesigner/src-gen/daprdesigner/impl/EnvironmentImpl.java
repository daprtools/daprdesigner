/**
 */
package daprdesigner.impl;

import daprdesigner.BuildingBlock;
import daprdesigner.DaprdesignerPackage;
import daprdesigner.Environment;
import daprdesigner.Namespace;
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
 * An implementation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.impl.EnvironmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link daprdesigner.impl.EnvironmentImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link daprdesigner.impl.EnvironmentImpl#getTrustdomain <em>Trustdomain</em>}</li>
 *   <li>{@link daprdesigner.impl.EnvironmentImpl#getBuildingblocks <em>Buildingblocks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnvironmentImpl extends MinimalEObjectImpl.Container implements Environment {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected Namespace namespace;

	/**
	 * The cached value of the '{@link #getTrustdomain() <em>Trustdomain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrustdomain()
	 * @generated
	 * @ordered
	 */
	protected EList<Trustdomain> trustdomain;

	/**
	 * The cached value of the '{@link #getBuildingblocks() <em>Buildingblocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildingblocks()
	 * @generated
	 * @ordered
	 */
	protected EList<BuildingBlock> buildingblocks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaprdesignerPackage.Literals.ENVIRONMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.ENVIRONMENT__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamespace(Namespace newNamespace, NotificationChain msgs) {
		Namespace oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.ENVIRONMENT__NAMESPACE, oldNamespace, newNamespace);
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
	public void setNamespace(Namespace newNamespace) {
		if (newNamespace != namespace) {
			NotificationChain msgs = null;
			if (namespace != null)
				msgs = ((InternalEObject) namespace).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DaprdesignerPackage.ENVIRONMENT__NAMESPACE, null, msgs);
			if (newNamespace != null)
				msgs = ((InternalEObject) newNamespace).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DaprdesignerPackage.ENVIRONMENT__NAMESPACE, null, msgs);
			msgs = basicSetNamespace(newNamespace, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.ENVIRONMENT__NAMESPACE,
					newNamespace, newNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trustdomain> getTrustdomain() {
		if (trustdomain == null) {
			trustdomain = new EObjectContainmentEList<Trustdomain>(Trustdomain.class, this,
					DaprdesignerPackage.ENVIRONMENT__TRUSTDOMAIN);
		}
		return trustdomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BuildingBlock> getBuildingblocks() {
		if (buildingblocks == null) {
			buildingblocks = new EObjectContainmentEList<BuildingBlock>(BuildingBlock.class, this,
					DaprdesignerPackage.ENVIRONMENT__BUILDINGBLOCKS);
		}
		return buildingblocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DaprdesignerPackage.ENVIRONMENT__NAMESPACE:
			return basicSetNamespace(null, msgs);
		case DaprdesignerPackage.ENVIRONMENT__TRUSTDOMAIN:
			return ((InternalEList<?>) getTrustdomain()).basicRemove(otherEnd, msgs);
		case DaprdesignerPackage.ENVIRONMENT__BUILDINGBLOCKS:
			return ((InternalEList<?>) getBuildingblocks()).basicRemove(otherEnd, msgs);
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
		case DaprdesignerPackage.ENVIRONMENT__NAME:
			return getName();
		case DaprdesignerPackage.ENVIRONMENT__NAMESPACE:
			return getNamespace();
		case DaprdesignerPackage.ENVIRONMENT__TRUSTDOMAIN:
			return getTrustdomain();
		case DaprdesignerPackage.ENVIRONMENT__BUILDINGBLOCKS:
			return getBuildingblocks();
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
		case DaprdesignerPackage.ENVIRONMENT__NAME:
			setName((String) newValue);
			return;
		case DaprdesignerPackage.ENVIRONMENT__NAMESPACE:
			setNamespace((Namespace) newValue);
			return;
		case DaprdesignerPackage.ENVIRONMENT__TRUSTDOMAIN:
			getTrustdomain().clear();
			getTrustdomain().addAll((Collection<? extends Trustdomain>) newValue);
			return;
		case DaprdesignerPackage.ENVIRONMENT__BUILDINGBLOCKS:
			getBuildingblocks().clear();
			getBuildingblocks().addAll((Collection<? extends BuildingBlock>) newValue);
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
		case DaprdesignerPackage.ENVIRONMENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case DaprdesignerPackage.ENVIRONMENT__NAMESPACE:
			setNamespace((Namespace) null);
			return;
		case DaprdesignerPackage.ENVIRONMENT__TRUSTDOMAIN:
			getTrustdomain().clear();
			return;
		case DaprdesignerPackage.ENVIRONMENT__BUILDINGBLOCKS:
			getBuildingblocks().clear();
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
		case DaprdesignerPackage.ENVIRONMENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case DaprdesignerPackage.ENVIRONMENT__NAMESPACE:
			return namespace != null;
		case DaprdesignerPackage.ENVIRONMENT__TRUSTDOMAIN:
			return trustdomain != null && !trustdomain.isEmpty();
		case DaprdesignerPackage.ENVIRONMENT__BUILDINGBLOCKS:
			return buildingblocks != null && !buildingblocks.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //EnvironmentImpl
