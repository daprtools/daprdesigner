/**
 */
package daprdesigner;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.Namespace#getRequiredFields <em>Required Fields</em>}</li>
 *   <li>{@link daprdesigner.Namespace#getHelp <em>Help</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getNamespace()
 * @model
 * @generated
 */
public interface Namespace extends DaprNode {
	/**
	 * Returns the value of the '<em><b>Required Fields</b></em>' attribute.
	 * The default value is <code>"Name"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Fields</em>' attribute.
	 * @see daprdesigner.DaprdesignerPackage#getNamespace_RequiredFields()
	 * @model default="Name" changeable="false"
	 * @generated
	 */
	String getRequiredFields();

	/**
	 * Returns the value of the '<em><b>Help</b></em>' attribute.
	 * The default value is <code>"https://docs.dapr.io/operations/components/component-scopes/"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Help</em>' attribute.
	 * @see daprdesigner.DaprdesignerPackage#getNamespace_Help()
	 * @model default="https://docs.dapr.io/operations/components/component-scopes/" changeable="false"
	 * @generated
	 */
	String getHelp();

} // Namespace
