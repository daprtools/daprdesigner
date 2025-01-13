/**
 */
package daprdesigner.impl;

import daprdesigner.AccessAction;
import daprdesigner.Component;
import daprdesigner.DaprdesignerPackage;
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
 *   <li>{@link daprdesigner.impl.SecretsAccessListImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link daprdesigner.impl.SecretsAccessListImpl#isDefaultAccess <em>Default Access</em>}</li>
 *   <li>{@link daprdesigner.impl.SecretsAccessListImpl#getSecrets <em>Secrets</em>}</li>
 *   <li>{@link daprdesigner.impl.SecretsAccessListImpl#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecretsAccessListImpl extends DaprNodeImpl implements SecretsAccessList {
	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected Component component;

	/**
	 * The default value of the '{@link #isDefaultAccess() <em>Default Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultAccess()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFAULT_ACCESS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isDefaultAccess() <em>Default Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultAccess()
	 * @generated
	 * @ordered
	 */
	protected boolean defaultAccess = DEFAULT_ACCESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSecrets() <em>Secrets</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecrets()
	 * @generated
	 * @ordered
	 */
	protected EList<String> secrets;

	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final AccessAction ACTION_EDEFAULT = AccessAction.ALLOW;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected AccessAction action = ACTION_EDEFAULT;

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
	public Component getComponent() {
		if (component != null && component.eIsProxy()) {
			InternalEObject oldComponent = (InternalEObject) component;
			component = (Component) eResolveProxy(oldComponent);
			if (component != oldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DaprdesignerPackage.SECRETS_ACCESS_LIST__COMPONENT, oldComponent, component));
			}
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(Component newComponent) {
		Component oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.SECRETS_ACCESS_LIST__COMPONENT,
					oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDefaultAccess() {
		return defaultAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultAccess(boolean newDefaultAccess) {
		boolean oldDefaultAccess = defaultAccess;
		defaultAccess = newDefaultAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.SECRETS_ACCESS_LIST__DEFAULT_ACCESS, oldDefaultAccess, defaultAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSecrets() {
		if (secrets == null) {
			secrets = new EDataTypeUniqueEList<String>(String.class, this,
					DaprdesignerPackage.SECRETS_ACCESS_LIST__SECRETS);
		}
		return secrets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessAction getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(AccessAction newAction) {
		AccessAction oldAction = action;
		action = newAction == null ? ACTION_EDEFAULT : newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.SECRETS_ACCESS_LIST__ACTION,
					oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DaprdesignerPackage.SECRETS_ACCESS_LIST__COMPONENT:
			if (resolve)
				return getComponent();
			return basicGetComponent();
		case DaprdesignerPackage.SECRETS_ACCESS_LIST__DEFAULT_ACCESS:
			return isDefaultAccess();
		case DaprdesignerPackage.SECRETS_ACCESS_LIST__SECRETS:
			return getSecrets();
		case DaprdesignerPackage.SECRETS_ACCESS_LIST__ACTION:
			return getAction();
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
		case DaprdesignerPackage.SECRETS_ACCESS_LIST__COMPONENT:
			setComponent((Component) newValue);
			return;
		case DaprdesignerPackage.SECRETS_ACCESS_LIST__DEFAULT_ACCESS:
			setDefaultAccess((Boolean) newValue);
			return;
		case DaprdesignerPackage.SECRETS_ACCESS_LIST__SECRETS:
			getSecrets().clear();
			getSecrets().addAll((Collection<? extends String>) newValue);
			return;
		case DaprdesignerPackage.SECRETS_ACCESS_LIST__ACTION:
			setAction((AccessAction) newValue);
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
		case DaprdesignerPackage.SECRETS_ACCESS_LIST__COMPONENT:
			setComponent((Component) null);
			return;
		case DaprdesignerPackage.SECRETS_ACCESS_LIST__DEFAULT_ACCESS:
			setDefaultAccess(DEFAULT_ACCESS_EDEFAULT);
			return;
		case DaprdesignerPackage.SECRETS_ACCESS_LIST__SECRETS:
			getSecrets().clear();
			return;
		case DaprdesignerPackage.SECRETS_ACCESS_LIST__ACTION:
			setAction(ACTION_EDEFAULT);
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
		case DaprdesignerPackage.SECRETS_ACCESS_LIST__COMPONENT:
			return component != null;
		case DaprdesignerPackage.SECRETS_ACCESS_LIST__DEFAULT_ACCESS:
			return defaultAccess != DEFAULT_ACCESS_EDEFAULT;
		case DaprdesignerPackage.SECRETS_ACCESS_LIST__SECRETS:
			return secrets != null && !secrets.isEmpty();
		case DaprdesignerPackage.SECRETS_ACCESS_LIST__ACTION:
			return action != ACTION_EDEFAULT;
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
		result.append(" (defaultAccess: ");
		result.append(defaultAccess);
		result.append(", secrets: ");
		result.append(secrets);
		result.append(", action: ");
		result.append(action);
		result.append(')');
		return result.toString();
	}

} //SecretsAccessListImpl
