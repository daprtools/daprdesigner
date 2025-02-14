/**
 */
package daprdesigner;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pub Sub</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.PubSub#getHelp <em>Help</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getPubSub()
 * @model
 * @generated
 */
public interface PubSub extends Component {

	/**
	 * Returns the value of the '<em><b>Help</b></em>' attribute.
	 * The default value is <code>"https://docs.dapr.io/reference/components-reference/supported-pubsub/"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Help</em>' attribute.
	 * @see daprdesigner.DaprdesignerPackage#getPubSub_Help()
	 * @model default="https://docs.dapr.io/reference/components-reference/supported-pubsub/" changeable="false"
	 * @generated
	 */
	String getHelp();
} // PubSub
