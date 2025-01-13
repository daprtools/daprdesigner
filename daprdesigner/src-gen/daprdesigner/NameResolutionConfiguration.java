/**
 */
package daprdesigner;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Resolution Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.NameResolutionConfiguration#getComponentName <em>Component Name</em>}</li>
 *   <li>{@link daprdesigner.NameResolutionConfiguration#getComponentVersion <em>Component Version</em>}</li>
 *   <li>{@link daprdesigner.NameResolutionConfiguration#getConfigurationKey <em>Configuration Key</em>}</li>
 *   <li>{@link daprdesigner.NameResolutionConfiguration#getConfigurationValue <em>Configuration Value</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getNameResolutionConfiguration()
 * @model
 * @generated
 */
public interface NameResolutionConfiguration extends AppConfiguration {
	/**
	 * Returns the value of the '<em><b>Component Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Name</em>' attribute.
	 * @see #setComponentName(String)
	 * @see daprdesigner.DaprdesignerPackage#getNameResolutionConfiguration_ComponentName()
	 * @model
	 * @generated
	 */
	String getComponentName();

	/**
	 * Sets the value of the '{@link daprdesigner.NameResolutionConfiguration#getComponentName <em>Component Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Name</em>' attribute.
	 * @see #getComponentName()
	 * @generated
	 */
	void setComponentName(String value);

	/**
	 * Returns the value of the '<em><b>Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Version</em>' attribute.
	 * @see #setComponentVersion(String)
	 * @see daprdesigner.DaprdesignerPackage#getNameResolutionConfiguration_ComponentVersion()
	 * @model
	 * @generated
	 */
	String getComponentVersion();

	/**
	 * Sets the value of the '{@link daprdesigner.NameResolutionConfiguration#getComponentVersion <em>Component Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Version</em>' attribute.
	 * @see #getComponentVersion()
	 * @generated
	 */
	void setComponentVersion(String value);

	/**
	 * Returns the value of the '<em><b>Configuration Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Key</em>' attribute.
	 * @see #setConfigurationKey(String)
	 * @see daprdesigner.DaprdesignerPackage#getNameResolutionConfiguration_ConfigurationKey()
	 * @model
	 * @generated
	 */
	String getConfigurationKey();

	/**
	 * Sets the value of the '{@link daprdesigner.NameResolutionConfiguration#getConfigurationKey <em>Configuration Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Key</em>' attribute.
	 * @see #getConfigurationKey()
	 * @generated
	 */
	void setConfigurationKey(String value);

	/**
	 * Returns the value of the '<em><b>Configuration Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Value</em>' attribute.
	 * @see #setConfigurationValue(String)
	 * @see daprdesigner.DaprdesignerPackage#getNameResolutionConfiguration_ConfigurationValue()
	 * @model
	 * @generated
	 */
	String getConfigurationValue();

	/**
	 * Sets the value of the '{@link daprdesigner.NameResolutionConfiguration#getConfigurationValue <em>Configuration Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Value</em>' attribute.
	 * @see #getConfigurationValue()
	 * @generated
	 */
	void setConfigurationValue(String value);

} // NameResolutionConfiguration
