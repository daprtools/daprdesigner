/**
 */
package daprdesigner.impl;

import daprdesigner.DaprdesignerPackage;
import daprdesigner.HttpHandler;
import daprdesigner.HttpHandlerType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Http Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.impl.HttpHandlerImpl#getHandlerName <em>Handler Name</em>}</li>
 *   <li>{@link daprdesigner.impl.HttpHandlerImpl#getType <em>Type</em>}</li>
 *   <li>{@link daprdesigner.impl.HttpHandlerImpl#getHandlerType <em>Handler Type</em>}</li>
 *   <li>{@link daprdesigner.impl.HttpHandlerImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HttpHandlerImpl extends DaprNodeImpl implements HttpHandler {
	/**
	 * The default value of the '{@link #getHandlerName() <em>Handler Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlerName()
	 * @generated
	 * @ordered
	 */
	protected static final String HANDLER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHandlerName() <em>Handler Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlerName()
	 * @generated
	 * @ordered
	 */
	protected String handlerName = HANDLER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHandlerType() <em>Handler Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlerType()
	 * @generated
	 * @ordered
	 */
	protected static final HttpHandlerType HANDLER_TYPE_EDEFAULT = HttpHandlerType.INCOMING;

	/**
	 * The cached value of the '{@link #getHandlerType() <em>Handler Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlerType()
	 * @generated
	 * @ordered
	 */
	protected HttpHandlerType handlerType = HANDLER_TYPE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HttpHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaprdesignerPackage.Literals.HTTP_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHandlerName() {
		return handlerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandlerName(String newHandlerName) {
		String oldHandlerName = handlerName;
		handlerName = newHandlerName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.HTTP_HANDLER__HANDLER_NAME,
					oldHandlerName, handlerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.HTTP_HANDLER__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpHandlerType getHandlerType() {
		return handlerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandlerType(HttpHandlerType newHandlerType) {
		HttpHandlerType oldHandlerType = handlerType;
		handlerType = newHandlerType == null ? HANDLER_TYPE_EDEFAULT : newHandlerType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.HTTP_HANDLER__HANDLER_TYPE,
					oldHandlerType, handlerType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.HTTP_HANDLER__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DaprdesignerPackage.HTTP_HANDLER__HANDLER_NAME:
			return getHandlerName();
		case DaprdesignerPackage.HTTP_HANDLER__TYPE:
			return getType();
		case DaprdesignerPackage.HTTP_HANDLER__HANDLER_TYPE:
			return getHandlerType();
		case DaprdesignerPackage.HTTP_HANDLER__NAME:
			return getName();
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
		case DaprdesignerPackage.HTTP_HANDLER__HANDLER_NAME:
			setHandlerName((String) newValue);
			return;
		case DaprdesignerPackage.HTTP_HANDLER__TYPE:
			setType((String) newValue);
			return;
		case DaprdesignerPackage.HTTP_HANDLER__HANDLER_TYPE:
			setHandlerType((HttpHandlerType) newValue);
			return;
		case DaprdesignerPackage.HTTP_HANDLER__NAME:
			setName((String) newValue);
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
		case DaprdesignerPackage.HTTP_HANDLER__HANDLER_NAME:
			setHandlerName(HANDLER_NAME_EDEFAULT);
			return;
		case DaprdesignerPackage.HTTP_HANDLER__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case DaprdesignerPackage.HTTP_HANDLER__HANDLER_TYPE:
			setHandlerType(HANDLER_TYPE_EDEFAULT);
			return;
		case DaprdesignerPackage.HTTP_HANDLER__NAME:
			setName(NAME_EDEFAULT);
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
		case DaprdesignerPackage.HTTP_HANDLER__HANDLER_NAME:
			return HANDLER_NAME_EDEFAULT == null ? handlerName != null : !HANDLER_NAME_EDEFAULT.equals(handlerName);
		case DaprdesignerPackage.HTTP_HANDLER__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case DaprdesignerPackage.HTTP_HANDLER__HANDLER_TYPE:
			return handlerType != HANDLER_TYPE_EDEFAULT;
		case DaprdesignerPackage.HTTP_HANDLER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (handlerName: ");
		result.append(handlerName);
		result.append(", type: ");
		result.append(type);
		result.append(", handlerType: ");
		result.append(handlerType);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //HttpHandlerImpl
