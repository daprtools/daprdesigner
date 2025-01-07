/**
 */
package daprdesigner;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.Configuration#getName <em>Name</em>}</li>
 *   <li>{@link daprdesigner.Configuration#getAppID <em>App ID</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends BuildingBlock {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Configuration"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see daprdesigner.DaprdesignerPackage#getConfiguration_Name()
	 * @model default="Configuration" changeable="false"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>App ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App ID</em>' attribute.
	 * @see #setAppID(String)
	 * @see daprdesigner.DaprdesignerPackage#getConfiguration_AppID()
	 * @model
	 * @generated
	 */
	String getAppID();

	/**
	 * Sets the value of the '{@link daprdesigner.Configuration#getAppID <em>App ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App ID</em>' attribute.
	 * @see #getAppID()
	 * @generated
	 */
	void setAppID(String value);

} // Configuration
