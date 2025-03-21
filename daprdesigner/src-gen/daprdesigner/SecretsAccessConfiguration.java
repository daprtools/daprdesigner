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
 *   <li>{@link daprdesigner.SecretsAccessConfiguration#getRequiredFields <em>Required Fields</em>}</li>
 *   <li>{@link daprdesigner.SecretsAccessConfiguration#getHelp <em>Help</em>}</li>
 *   <li>{@link daprdesigner.SecretsAccessConfiguration#getAccessList <em>Access List</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getSecretsAccessConfiguration()
 * @model
 * @generated
 */
public interface SecretsAccessConfiguration extends AppConfiguration {
	/**
	 * Returns the value of the '<em><b>Required Fields</b></em>' attribute.
	 * The default value is <code>"Name"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Fields</em>' attribute.
	 * @see daprdesigner.DaprdesignerPackage#getSecretsAccessConfiguration_RequiredFields()
	 * @model default="Name" changeable="false"
	 * @generated
	 */
	String getRequiredFields();

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

	/**
	 * Returns the value of the '<em><b>Help</b></em>' attribute.
	 * The default value is <code>"https://docs.dapr.io/operations/configuration/secret-scope/"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Help</em>' attribute.
	 * @see daprdesigner.DaprdesignerPackage#getSecretsAccessConfiguration_Help()
	 * @model default="https://docs.dapr.io/operations/configuration/secret-scope/" changeable="false"
	 * @generated
	 */
	String getHelp();

} // SecretsAccessConfiguration
