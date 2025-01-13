/**
 */
package daprdesigner;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Secrets Access Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.SecretsAccessConfiguration#getAccessList <em>Access List</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getSecretsAccessConfiguration()
 * @model
 * @generated
 */
public interface SecretsAccessConfiguration extends AppConfiguration {
	/**
	 * Returns the value of the '<em><b>Access List</b></em>' reference list.
	 * The list contents are of type {@link daprdesigner.SecretsAccessList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access List</em>' reference list.
	 * @see daprdesigner.DaprdesignerPackage#getSecretsAccessConfiguration_AccessList()
	 * @model
	 * @generated
	 */
	EList<SecretsAccessList> getAccessList();

} // SecretsAccessConfiguration
