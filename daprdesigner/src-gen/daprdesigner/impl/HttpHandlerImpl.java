/**
 */
package daprdesigner.impl;

import daprdesigner.DaprdesignerPackage;
import daprdesigner.HttpHandler;
import daprdesigner.HttpHandlerType;

import daprdesigner.Middleware;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Http Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.impl.HttpHandlerImpl#getHelp <em>Help</em>}</li>
 *   <li>{@link daprdesigner.impl.HttpHandlerImpl#getMiddlewareComponent <em>Middleware Component</em>}</li>
 *   <li>{@link daprdesigner.impl.HttpHandlerImpl#getHandlerType <em>Handler Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HttpHandlerImpl extends DaprNodeImpl implements HttpHandler {
	/**
	 * The default value of the '{@link #getHelp() <em>Help</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelp()
	 * @generated
	 * @ordered
	 */
	protected static final String HELP_EDEFAULT = "https://docs.dapr.io/operations/configuration/configuration-overview/#middleware";

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
	 * The cached value of the '{@link #getMiddlewareComponent() <em>Middleware Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiddlewareComponent()
	 * @generated
	 * @ordered
	 */
	protected Middleware middlewareComponent;

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
	public String getHelp() {
		return help;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Middleware getMiddlewareComponent() {
		if (middlewareComponent != null && middlewareComponent.eIsProxy()) {
			InternalEObject oldMiddlewareComponent = (InternalEObject) middlewareComponent;
			middlewareComponent = (Middleware) eResolveProxy(oldMiddlewareComponent);
			if (middlewareComponent != oldMiddlewareComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DaprdesignerPackage.HTTP_HANDLER__MIDDLEWARE_COMPONENT, oldMiddlewareComponent,
							middlewareComponent));
			}
		}
		return middlewareComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Middleware basicGetMiddlewareComponent() {
		return middlewareComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMiddlewareComponent(Middleware newMiddlewareComponent) {
		Middleware oldMiddlewareComponent = middlewareComponent;
		middlewareComponent = newMiddlewareComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.HTTP_HANDLER__MIDDLEWARE_COMPONENT, oldMiddlewareComponent,
					middlewareComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DaprdesignerPackage.HTTP_HANDLER__HELP:
			return getHelp();
		case DaprdesignerPackage.HTTP_HANDLER__MIDDLEWARE_COMPONENT:
			if (resolve)
				return getMiddlewareComponent();
			return basicGetMiddlewareComponent();
		case DaprdesignerPackage.HTTP_HANDLER__HANDLER_TYPE:
			return getHandlerType();
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
		case DaprdesignerPackage.HTTP_HANDLER__MIDDLEWARE_COMPONENT:
			setMiddlewareComponent((Middleware) newValue);
			return;
		case DaprdesignerPackage.HTTP_HANDLER__HANDLER_TYPE:
			setHandlerType((HttpHandlerType) newValue);
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
		case DaprdesignerPackage.HTTP_HANDLER__MIDDLEWARE_COMPONENT:
			setMiddlewareComponent((Middleware) null);
			return;
		case DaprdesignerPackage.HTTP_HANDLER__HANDLER_TYPE:
			setHandlerType(HANDLER_TYPE_EDEFAULT);
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
		case DaprdesignerPackage.HTTP_HANDLER__HELP:
			return HELP_EDEFAULT == null ? help != null : !HELP_EDEFAULT.equals(help);
		case DaprdesignerPackage.HTTP_HANDLER__MIDDLEWARE_COMPONENT:
			return middlewareComponent != null;
		case DaprdesignerPackage.HTTP_HANDLER__HANDLER_TYPE:
			return handlerType != HANDLER_TYPE_EDEFAULT;
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
		result.append(", handlerType: ");
		result.append(handlerType);
		result.append(')');
		return result.toString();
	}

} //HttpHandlerImpl
