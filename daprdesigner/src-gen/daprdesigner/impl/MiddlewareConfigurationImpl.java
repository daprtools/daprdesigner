/**
 */
package daprdesigner.impl;

import daprdesigner.DaprdesignerPackage;
import daprdesigner.MiddlewareConfiguration;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Middleware Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.impl.MiddlewareConfigurationImpl#getIncomingHandler <em>Incoming Handler</em>}</li>
 *   <li>{@link daprdesigner.impl.MiddlewareConfigurationImpl#getOutgoingHandler <em>Outgoing Handler</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MiddlewareConfigurationImpl extends AppConfigurationImpl implements MiddlewareConfiguration {
	/**
	 * The cached value of the '{@link #getIncomingHandler() <em>Incoming Handler</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingHandler()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> incomingHandler;

	/**
	 * The cached value of the '{@link #getOutgoingHandler() <em>Outgoing Handler</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingHandler()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> outgoingHandler;

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
	public EMap<String, String> getIncomingHandler() {
		if (incomingHandler == null) {
			incomingHandler = new EcoreEMap<String, String>(DaprdesignerPackage.Literals.ESTRING_TO_STRING_MAP_ENTRY,
					EStringToStringMapEntryImpl.class, this,
					DaprdesignerPackage.MIDDLEWARE_CONFIGURATION__INCOMING_HANDLER);
		}
		return incomingHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getOutgoingHandler() {
		if (outgoingHandler == null) {
			outgoingHandler = new EcoreEMap<String, String>(DaprdesignerPackage.Literals.ESTRING_TO_STRING_MAP_ENTRY,
					EStringToStringMapEntryImpl.class, this,
					DaprdesignerPackage.MIDDLEWARE_CONFIGURATION__OUTGOING_HANDLER);
		}
		return outgoingHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DaprdesignerPackage.MIDDLEWARE_CONFIGURATION__INCOMING_HANDLER:
			return ((InternalEList<?>) getIncomingHandler()).basicRemove(otherEnd, msgs);
		case DaprdesignerPackage.MIDDLEWARE_CONFIGURATION__OUTGOING_HANDLER:
			return ((InternalEList<?>) getOutgoingHandler()).basicRemove(otherEnd, msgs);
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
		case DaprdesignerPackage.MIDDLEWARE_CONFIGURATION__INCOMING_HANDLER:
			if (coreType)
				return getIncomingHandler();
			else
				return getIncomingHandler().map();
		case DaprdesignerPackage.MIDDLEWARE_CONFIGURATION__OUTGOING_HANDLER:
			if (coreType)
				return getOutgoingHandler();
			else
				return getOutgoingHandler().map();
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
		case DaprdesignerPackage.MIDDLEWARE_CONFIGURATION__INCOMING_HANDLER:
			((EStructuralFeature.Setting) getIncomingHandler()).set(newValue);
			return;
		case DaprdesignerPackage.MIDDLEWARE_CONFIGURATION__OUTGOING_HANDLER:
			((EStructuralFeature.Setting) getOutgoingHandler()).set(newValue);
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
		case DaprdesignerPackage.MIDDLEWARE_CONFIGURATION__INCOMING_HANDLER:
			getIncomingHandler().clear();
			return;
		case DaprdesignerPackage.MIDDLEWARE_CONFIGURATION__OUTGOING_HANDLER:
			getOutgoingHandler().clear();
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
		case DaprdesignerPackage.MIDDLEWARE_CONFIGURATION__INCOMING_HANDLER:
			return incomingHandler != null && !incomingHandler.isEmpty();
		case DaprdesignerPackage.MIDDLEWARE_CONFIGURATION__OUTGOING_HANDLER:
			return outgoingHandler != null && !outgoingHandler.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MiddlewareConfigurationImpl
