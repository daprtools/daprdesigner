/**
 */
package daprdesigner.impl;

import daprdesigner.API;
import daprdesigner.DaprdesignerPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>API</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.impl.APIImpl#getApi_name <em>Api name</em>}</li>
 *   <li>{@link daprdesigner.impl.APIImpl#getApi_version <em>Api version</em>}</li>
 *   <li>{@link daprdesigner.impl.APIImpl#getProtocol <em>Protocol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APIImpl extends MinimalEObjectImpl.Container implements API {
	/**
	 * The default value of the '{@link #getApi_name() <em>Api name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApi_name()
	 * @generated
	 * @ordered
	 */
	protected static final String API_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApi_name() <em>Api name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApi_name()
	 * @generated
	 * @ordered
	 */
	protected String api_name = API_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getApi_version() <em>Api version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApi_version()
	 * @generated
	 * @ordered
	 */
	protected static final String API_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApi_version() <em>Api version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApi_version()
	 * @generated
	 * @ordered
	 */
	protected String api_version = API_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected String protocol = PROTOCOL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaprdesignerPackage.Literals.API;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApi_name() {
		return api_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApi_name(String newApi_name) {
		String oldApi_name = api_name;
		api_name = newApi_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.API__API_NAME, oldApi_name,
					api_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApi_version() {
		return api_version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApi_version(String newApi_version) {
		String oldApi_version = api_version;
		api_version = newApi_version;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.API__API_VERSION, oldApi_version,
					api_version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(String newProtocol) {
		String oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.API__PROTOCOL, oldProtocol,
					protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DaprdesignerPackage.API__API_NAME:
			return getApi_name();
		case DaprdesignerPackage.API__API_VERSION:
			return getApi_version();
		case DaprdesignerPackage.API__PROTOCOL:
			return getProtocol();
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
		case DaprdesignerPackage.API__API_NAME:
			setApi_name((String) newValue);
			return;
		case DaprdesignerPackage.API__API_VERSION:
			setApi_version((String) newValue);
			return;
		case DaprdesignerPackage.API__PROTOCOL:
			setProtocol((String) newValue);
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
		case DaprdesignerPackage.API__API_NAME:
			setApi_name(API_NAME_EDEFAULT);
			return;
		case DaprdesignerPackage.API__API_VERSION:
			setApi_version(API_VERSION_EDEFAULT);
			return;
		case DaprdesignerPackage.API__PROTOCOL:
			setProtocol(PROTOCOL_EDEFAULT);
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
		case DaprdesignerPackage.API__API_NAME:
			return API_NAME_EDEFAULT == null ? api_name != null : !API_NAME_EDEFAULT.equals(api_name);
		case DaprdesignerPackage.API__API_VERSION:
			return API_VERSION_EDEFAULT == null ? api_version != null : !API_VERSION_EDEFAULT.equals(api_version);
		case DaprdesignerPackage.API__PROTOCOL:
			return PROTOCOL_EDEFAULT == null ? protocol != null : !PROTOCOL_EDEFAULT.equals(protocol);
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
		result.append(" (api_name: ");
		result.append(api_name);
		result.append(", api_version: ");
		result.append(api_version);
		result.append(", protocol: ");
		result.append(protocol);
		result.append(')');
		return result.toString();
	}

} //APIImpl
