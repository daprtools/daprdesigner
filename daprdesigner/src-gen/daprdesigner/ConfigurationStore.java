/**
 */
package daprdesigner;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.ConfigurationStore#getHelp <em>Help</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getConfigurationStore()
 * @model
 * @generated
 */
public interface ConfigurationStore extends Component {

	/**
	 * Returns the value of the '<em><b>Help</b></em>' attribute.
	 * The default value is <code>"https://docs.dapr.io/reference/components-reference/supported-configuration-stores/"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Help</em>' attribute.
	 * @see daprdesigner.DaprdesignerPackage#getConfigurationStore_Help()
	 * @model default="https://docs.dapr.io/reference/components-reference/supported-configuration-stores/" changeable="false"
	 * @generated
	 */
	String getHelp();
} // ConfigurationStore
