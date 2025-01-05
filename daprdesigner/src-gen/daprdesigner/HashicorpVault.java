/**
 */
package daprdesigner;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hashicorp Vault</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.HashicorpVault#getSpec_type <em>Spec type</em>}</li>
 *   <li>{@link daprdesigner.HashicorpVault#getSpec_version <em>Spec version</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getHashicorpVault()
 * @model
 * @generated
 */
public interface HashicorpVault extends SecretStore {
	/**
	 * Returns the value of the '<em><b>Spec type</b></em>' attribute.
	 * The default value is <code>"secretstores.aws.parameterstore"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec type</em>' attribute.
	 * @see daprdesigner.DaprdesignerPackage#getHashicorpVault_Spec_type()
	 * @model default="secretstores.aws.parameterstore" changeable="false"
	 * @generated
	 */
	String getSpec_type();

	/**
	 * Returns the value of the '<em><b>Spec version</b></em>' attribute.
	 * The default value is <code>"v1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec version</em>' attribute.
	 * @see daprdesigner.DaprdesignerPackage#getHashicorpVault_Spec_version()
	 * @model default="v1" changeable="false"
	 * @generated
	 */
	String getSpec_version();

} // HashicorpVault
