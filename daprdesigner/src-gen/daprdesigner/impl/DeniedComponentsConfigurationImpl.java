/**
 */
package daprdesigner.impl;

import daprdesigner.Component;
import daprdesigner.DaprdesignerPackage;
import daprdesigner.DeniedComponentsConfiguration;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Denied Components Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.impl.DeniedComponentsConfigurationImpl#getHelp <em>Help</em>}</li>
 *   <li>{@link daprdesigner.impl.DeniedComponentsConfigurationImpl#getDeniedComponents <em>Denied Components</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeniedComponentsConfigurationImpl extends AppConfigurationImpl implements DeniedComponentsConfiguration {
	/**
	 * The default value of the '{@link #getHelp() <em>Help</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelp()
	 * @generated
	 * @ordered
	 */
	protected static final String HELP_EDEFAULT = "https://docs.dapr.io/operations/configuration/configuration-overview/#disallow-usage-of-certain-component-types";

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
	 * The cached value of the '{@link #getDeniedComponents() <em>Denied Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeniedComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> deniedComponents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeniedComponentsConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaprdesignerPackage.Literals.DENIED_COMPONENTS_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getDeniedComponents() {
		if (deniedComponents == null) {
			deniedComponents = new EObjectResolvingEList<Component>(Component.class, this,
					DaprdesignerPackage.DENIED_COMPONENTS_CONFIGURATION__DENIED_COMPONENTS);
		}
		return deniedComponents;
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DaprdesignerPackage.DENIED_COMPONENTS_CONFIGURATION__HELP:
			return getHelp();
		case DaprdesignerPackage.DENIED_COMPONENTS_CONFIGURATION__DENIED_COMPONENTS:
			return getDeniedComponents();
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
		case DaprdesignerPackage.DENIED_COMPONENTS_CONFIGURATION__DENIED_COMPONENTS:
			getDeniedComponents().clear();
			getDeniedComponents().addAll((Collection<? extends Component>) newValue);
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
		case DaprdesignerPackage.DENIED_COMPONENTS_CONFIGURATION__DENIED_COMPONENTS:
			getDeniedComponents().clear();
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
		case DaprdesignerPackage.DENIED_COMPONENTS_CONFIGURATION__HELP:
			return HELP_EDEFAULT == null ? help != null : !HELP_EDEFAULT.equals(help);
		case DaprdesignerPackage.DENIED_COMPONENTS_CONFIGURATION__DENIED_COMPONENTS:
			return deniedComponents != null && !deniedComponents.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //DeniedComponentsConfigurationImpl
