/**
 */
package daprdesigner.impl;

import daprdesigner.Component;
import daprdesigner.DaprdesignerPackage;
import daprdesigner.NameResolutionConfiguration;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Name Resolution Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.impl.NameResolutionConfigurationImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link daprdesigner.impl.NameResolutionConfigurationImpl#getComponentVersion <em>Component Version</em>}</li>
 *   <li>{@link daprdesigner.impl.NameResolutionConfigurationImpl#getConfigurationKey <em>Configuration Key</em>}</li>
 *   <li>{@link daprdesigner.impl.NameResolutionConfigurationImpl#getConfigurationValue <em>Configuration Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NameResolutionConfigurationImpl extends AppConfigurationImpl implements NameResolutionConfiguration {
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
	 * The default value of the '{@link #getComponentVersion() <em>Component Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponentVersion() <em>Component Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentVersion()
	 * @generated
	 * @ordered
	 */
	protected String componentVersion = COMPONENT_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfigurationKey() <em>Configuration Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationKey()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIGURATION_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigurationKey() <em>Configuration Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationKey()
	 * @generated
	 * @ordered
	 */
	protected String configurationKey = CONFIGURATION_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfigurationValue() <em>Configuration Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationValue()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIGURATION_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigurationValue() <em>Configuration Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationValue()
	 * @generated
	 * @ordered
	 */
	protected String configurationValue = CONFIGURATION_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NameResolutionConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaprdesignerPackage.Literals.NAME_RESOLUTION_CONFIGURATION;
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
							DaprdesignerPackage.NAME_RESOLUTION_CONFIGURATION__COMPONENT, oldComponent, component));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.NAME_RESOLUTION_CONFIGURATION__COMPONENT, oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComponentVersion() {
		return componentVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentVersion(String newComponentVersion) {
		String oldComponentVersion = componentVersion;
		componentVersion = newComponentVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.NAME_RESOLUTION_CONFIGURATION__COMPONENT_VERSION, oldComponentVersion,
					componentVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfigurationKey() {
		return configurationKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationKey(String newConfigurationKey) {
		String oldConfigurationKey = configurationKey;
		configurationKey = newConfigurationKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.NAME_RESOLUTION_CONFIGURATION__CONFIGURATION_KEY, oldConfigurationKey,
					configurationKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfigurationValue() {
		return configurationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationValue(String newConfigurationValue) {
		String oldConfigurationValue = configurationValue;
		configurationValue = newConfigurationValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.NAME_RESOLUTION_CONFIGURATION__CONFIGURATION_VALUE, oldConfigurationValue,
					configurationValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DaprdesignerPackage.NAME_RESOLUTION_CONFIGURATION__COMPONENT:
			if (resolve)
				return getComponent();
			return basicGetComponent();
		case DaprdesignerPackage.NAME_RESOLUTION_CONFIGURATION__COMPONENT_VERSION:
			return getComponentVersion();
		case DaprdesignerPackage.NAME_RESOLUTION_CONFIGURATION__CONFIGURATION_KEY:
			return getConfigurationKey();
		case DaprdesignerPackage.NAME_RESOLUTION_CONFIGURATION__CONFIGURATION_VALUE:
			return getConfigurationValue();
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
		case DaprdesignerPackage.NAME_RESOLUTION_CONFIGURATION__COMPONENT:
			setComponent((Component) newValue);
			return;
		case DaprdesignerPackage.NAME_RESOLUTION_CONFIGURATION__COMPONENT_VERSION:
			setComponentVersion((String) newValue);
			return;
		case DaprdesignerPackage.NAME_RESOLUTION_CONFIGURATION__CONFIGURATION_KEY:
			setConfigurationKey((String) newValue);
			return;
		case DaprdesignerPackage.NAME_RESOLUTION_CONFIGURATION__CONFIGURATION_VALUE:
			setConfigurationValue((String) newValue);
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
		case DaprdesignerPackage.NAME_RESOLUTION_CONFIGURATION__COMPONENT:
			setComponent((Component) null);
			return;
		case DaprdesignerPackage.NAME_RESOLUTION_CONFIGURATION__COMPONENT_VERSION:
			setComponentVersion(COMPONENT_VERSION_EDEFAULT);
			return;
		case DaprdesignerPackage.NAME_RESOLUTION_CONFIGURATION__CONFIGURATION_KEY:
			setConfigurationKey(CONFIGURATION_KEY_EDEFAULT);
			return;
		case DaprdesignerPackage.NAME_RESOLUTION_CONFIGURATION__CONFIGURATION_VALUE:
			setConfigurationValue(CONFIGURATION_VALUE_EDEFAULT);
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
		case DaprdesignerPackage.NAME_RESOLUTION_CONFIGURATION__COMPONENT:
			return component != null;
		case DaprdesignerPackage.NAME_RESOLUTION_CONFIGURATION__COMPONENT_VERSION:
			return COMPONENT_VERSION_EDEFAULT == null ? componentVersion != null
					: !COMPONENT_VERSION_EDEFAULT.equals(componentVersion);
		case DaprdesignerPackage.NAME_RESOLUTION_CONFIGURATION__CONFIGURATION_KEY:
			return CONFIGURATION_KEY_EDEFAULT == null ? configurationKey != null
					: !CONFIGURATION_KEY_EDEFAULT.equals(configurationKey);
		case DaprdesignerPackage.NAME_RESOLUTION_CONFIGURATION__CONFIGURATION_VALUE:
			return CONFIGURATION_VALUE_EDEFAULT == null ? configurationValue != null
					: !CONFIGURATION_VALUE_EDEFAULT.equals(configurationValue);
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
		result.append(" (componentVersion: ");
		result.append(componentVersion);
		result.append(", configurationKey: ");
		result.append(configurationKey);
		result.append(", configurationValue: ");
		result.append(configurationValue);
		result.append(')');
		return result.toString();
	}

} //NameResolutionConfigurationImpl
