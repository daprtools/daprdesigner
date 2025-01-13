/**
 */
package daprdesigner.impl;

import daprdesigner.DaprdesignerPackage;
import daprdesigner.HttpHandler;
import daprdesigner.MiddlewareConfiguration;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Middleware Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.impl.MiddlewareConfigurationImpl#getHttpHandlers <em>Http Handlers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MiddlewareConfigurationImpl extends AppConfigurationImpl implements MiddlewareConfiguration {
	/**
	 * The cached value of the '{@link #getHttpHandlers() <em>Http Handlers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpHandlers()
	 * @generated
	 * @ordered
	 */
	protected EList<HttpHandler> httpHandlers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MiddlewareConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaprdesignerPackage.Literals.MIDDLEWARE_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HttpHandler> getHttpHandlers() {
		if (httpHandlers == null) {
			httpHandlers = new EObjectResolvingEList<HttpHandler>(HttpHandler.class, this,
					DaprdesignerPackage.MIDDLEWARE_CONFIGURATION__HTTP_HANDLERS);
		}
		return httpHandlers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DaprdesignerPackage.MIDDLEWARE_CONFIGURATION__HTTP_HANDLERS:
			return getHttpHandlers();
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
		case DaprdesignerPackage.MIDDLEWARE_CONFIGURATION__HTTP_HANDLERS:
			getHttpHandlers().clear();
			getHttpHandlers().addAll((Collection<? extends HttpHandler>) newValue);
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
		case DaprdesignerPackage.MIDDLEWARE_CONFIGURATION__HTTP_HANDLERS:
			getHttpHandlers().clear();
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
		case DaprdesignerPackage.MIDDLEWARE_CONFIGURATION__HTTP_HANDLERS:
			return httpHandlers != null && !httpHandlers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MiddlewareConfigurationImpl
