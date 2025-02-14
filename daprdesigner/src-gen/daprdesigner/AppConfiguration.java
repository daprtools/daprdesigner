/**
 */
package daprdesigner;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>App Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.AppConfiguration#getApiVersion <em>Api Version</em>}</li>
 *   <li>{@link daprdesigner.AppConfiguration#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getAppConfiguration()
 * @model abstract="true"
 * @generated
 */
public interface AppConfiguration extends DaprNode {
	/**
	 * Returns the value of the '<em><b>Api Version</b></em>' attribute.
	 * The default value is <code>"dapr.io/v1alpha1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Version</em>' attribute.
	 * @see daprdesigner.DaprdesignerPackage#getAppConfiguration_ApiVersion()
	 * @model default="dapr.io/v1alpha1" changeable="false"
	 * @generated
	 */
	String getApiVersion();

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"Configuration"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see daprdesigner.DaprdesignerPackage#getAppConfiguration_Kind()
	 * @model default="Configuration" changeable="false"
	 * @generated
	 */
	String getKind();

} // AppConfiguration
