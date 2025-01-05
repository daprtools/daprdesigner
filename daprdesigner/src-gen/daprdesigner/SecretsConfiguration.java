/**
 */
package daprdesigner;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Secrets Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.SecretsConfiguration#getAllowedList <em>Allowed List</em>}</li>
 *   <li>{@link daprdesigner.SecretsConfiguration#getDeniedList <em>Denied List</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getSecretsConfiguration()
 * @model
 * @generated
 */
public interface SecretsConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Allowed List</b></em>' containment reference list.
	 * The list contents are of type {@link daprdesigner.SecretsList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed List</em>' containment reference list.
	 * @see daprdesigner.DaprdesignerPackage#getSecretsConfiguration_AllowedList()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecretsList> getAllowedList();

	/**
	 * Returns the value of the '<em><b>Denied List</b></em>' containment reference list.
	 * The list contents are of type {@link daprdesigner.SecretsList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Denied List</em>' containment reference list.
	 * @see daprdesigner.DaprdesignerPackage#getSecretsConfiguration_DeniedList()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecretsList> getDeniedList();

} // SecretsConfiguration
