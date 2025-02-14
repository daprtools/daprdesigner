/**
 */
package daprdesigner;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Middleware</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.Middleware#getHelp <em>Help</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getMiddleware()
 * @model
 * @generated
 */
public interface Middleware extends Component {

	/**
	 * Returns the value of the '<em><b>Help</b></em>' attribute.
	 * The default value is <code>"https://docs.dapr.io/reference/components-reference/supported-middleware/"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Help</em>' attribute.
	 * @see daprdesigner.DaprdesignerPackage#getMiddleware_Help()
	 * @model default="https://docs.dapr.io/reference/components-reference/supported-middleware/" changeable="false"
	 * @generated
	 */
	String getHelp();
} // Middleware
