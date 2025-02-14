/**
 */
package daprdesigner;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trustdomain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.Trustdomain#getHelp <em>Help</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getTrustdomain()
 * @model
 * @generated
 */
public interface Trustdomain extends DaprNode {
	/**
	 * Returns the value of the '<em><b>Help</b></em>' attribute.
	 * The default value is <code>"https://docs.dapr.io/operations/configuration/invoke-allowlist/#trustdomain"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Help</em>' attribute.
	 * @see daprdesigner.DaprdesignerPackage#getTrustdomain_Help()
	 * @model default="https://docs.dapr.io/operations/configuration/invoke-allowlist/#trustdomain" changeable="false"
	 * @generated
	 */
	String getHelp();

} // Trustdomain
