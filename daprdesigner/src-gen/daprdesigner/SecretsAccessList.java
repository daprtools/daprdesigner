/**
 */
package daprdesigner;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Secrets Access List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.SecretsAccessList#getHelp <em>Help</em>}</li>
 *   <li>{@link daprdesigner.SecretsAccessList#getSecretStore <em>Secret Store</em>}</li>
 *   <li>{@link daprdesigner.SecretsAccessList#getDefaultAccess <em>Default Access</em>}</li>
 *   <li>{@link daprdesigner.SecretsAccessList#getAllowedSecrets <em>Allowed Secrets</em>}</li>
 *   <li>{@link daprdesigner.SecretsAccessList#getDeniedSecrets <em>Denied Secrets</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getSecretsAccessList()
 * @model
 * @generated
 */
public interface SecretsAccessList extends DaprNode {
	/**
	 * Returns the value of the '<em><b>Help</b></em>' attribute.
	 * The default value is <code>"https://docs.dapr.io/operations/configuration/secret-scope/"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Help</em>' attribute.
	 * @see daprdesigner.DaprdesignerPackage#getSecretsAccessList_Help()
	 * @model default="https://docs.dapr.io/operations/configuration/secret-scope/" changeable="false"
	 * @generated
	 */
	String getHelp();

	/**
	 * Returns the value of the '<em><b>Secret Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secret Store</em>' reference.
	 * @see #setSecretStore(SecretStore)
	 * @see daprdesigner.DaprdesignerPackage#getSecretsAccessList_SecretStore()
	 * @model
	 * @generated
	 */
	SecretStore getSecretStore();

	/**
	 * Sets the value of the '{@link daprdesigner.SecretsAccessList#getSecretStore <em>Secret Store</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secret Store</em>' reference.
	 * @see #getSecretStore()
	 * @generated
	 */
	void setSecretStore(SecretStore value);

	/**
	 * Returns the value of the '<em><b>Default Access</b></em>' attribute.
	 * The literals are from the enumeration {@link daprdesigner.AccessAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Access</em>' attribute.
	 * @see daprdesigner.AccessAction
	 * @see #setDefaultAccess(AccessAction)
	 * @see daprdesigner.DaprdesignerPackage#getSecretsAccessList_DefaultAccess()
	 * @model
	 * @generated
	 */
	AccessAction getDefaultAccess();

	/**
	 * Sets the value of the '{@link daprdesigner.SecretsAccessList#getDefaultAccess <em>Default Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Access</em>' attribute.
	 * @see daprdesigner.AccessAction
	 * @see #getDefaultAccess()
	 * @generated
	 */
	void setDefaultAccess(AccessAction value);

	/**
	 * Returns the value of the '<em><b>Allowed Secrets</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Secrets</em>' attribute list.
	 * @see daprdesigner.DaprdesignerPackage#getSecretsAccessList_AllowedSecrets()
	 * @model
	 * @generated
	 */
	EList<String> getAllowedSecrets();

	/**
	 * Returns the value of the '<em><b>Denied Secrets</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Denied Secrets</em>' attribute list.
	 * @see daprdesigner.DaprdesignerPackage#getSecretsAccessList_DeniedSecrets()
	 * @model
	 * @generated
	 */
	EList<String> getDeniedSecrets();

} // SecretsAccessList
