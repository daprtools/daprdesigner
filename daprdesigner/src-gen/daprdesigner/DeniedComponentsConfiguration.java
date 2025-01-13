/**
 */
package daprdesigner;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Denied Components Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.DeniedComponentsConfiguration#getDeniedComponents <em>Denied Components</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getDeniedComponentsConfiguration()
 * @model
 * @generated
 */
public interface DeniedComponentsConfiguration extends AppConfiguration {
	/**
	 * Returns the value of the '<em><b>Denied Components</b></em>' reference list.
	 * The list contents are of type {@link daprdesigner.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Denied Components</em>' reference list.
	 * @see daprdesigner.DaprdesignerPackage#getDeniedComponentsConfiguration_DeniedComponents()
	 * @model
	 * @generated
	 */
	EList<Component> getDeniedComponents();

} // DeniedComponentsConfiguration
