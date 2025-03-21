/**
 */
package daprdesigner;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conversation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.Conversation#getHelp <em>Help</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getConversation()
 * @model
 * @generated
 */
public interface Conversation extends Component {
	/**
	 * Returns the value of the '<em><b>Help</b></em>' attribute.
	 * The default value is <code>"https://docs.dapr.io/reference/components-reference/supported-conversation/"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Help</em>' attribute.
	 * @see daprdesigner.DaprdesignerPackage#getConversation_Help()
	 * @model default="https://docs.dapr.io/reference/components-reference/supported-conversation/" changeable="false"
	 * @generated
	 */
	String getHelp();

} // Conversation
