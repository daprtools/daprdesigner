/**
 */
package daprdesigner;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logging Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.LoggingConfiguration#getHelp <em>Help</em>}</li>
 *   <li>{@link daprdesigner.LoggingConfiguration#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link daprdesigner.LoggingConfiguration#isObfuscateUrls <em>Obfuscate Urls</em>}</li>
 *   <li>{@link daprdesigner.LoggingConfiguration#isOmitHealthChecks <em>Omit Health Checks</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getLoggingConfiguration()
 * @model
 * @generated
 */
public interface LoggingConfiguration extends AppConfiguration {
	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(boolean)
	 * @see daprdesigner.DaprdesignerPackage#getLoggingConfiguration_Enabled()
	 * @model default="true"
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * Sets the value of the '{@link daprdesigner.LoggingConfiguration#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #isEnabled()
	 * @generated
	 */
	void setEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Obfuscate Urls</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obfuscate Urls</em>' attribute.
	 * @see #setObfuscateUrls(boolean)
	 * @see daprdesigner.DaprdesignerPackage#getLoggingConfiguration_ObfuscateUrls()
	 * @model default="false"
	 * @generated
	 */
	boolean isObfuscateUrls();

	/**
	 * Sets the value of the '{@link daprdesigner.LoggingConfiguration#isObfuscateUrls <em>Obfuscate Urls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obfuscate Urls</em>' attribute.
	 * @see #isObfuscateUrls()
	 * @generated
	 */
	void setObfuscateUrls(boolean value);

	/**
	 * Returns the value of the '<em><b>Omit Health Checks</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Omit Health Checks</em>' attribute.
	 * @see #setOmitHealthChecks(boolean)
	 * @see daprdesigner.DaprdesignerPackage#getLoggingConfiguration_OmitHealthChecks()
	 * @model default="true"
	 * @generated
	 */
	boolean isOmitHealthChecks();

	/**
	 * Sets the value of the '{@link daprdesigner.LoggingConfiguration#isOmitHealthChecks <em>Omit Health Checks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Omit Health Checks</em>' attribute.
	 * @see #isOmitHealthChecks()
	 * @generated
	 */
	void setOmitHealthChecks(boolean value);

	/**
	 * Returns the value of the '<em><b>Help</b></em>' attribute.
	 * The default value is <code>"https://docs.dapr.io/operations/configuration/configuration-overview/#logging"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Help</em>' attribute.
	 * @see daprdesigner.DaprdesignerPackage#getLoggingConfiguration_Help()
	 * @model default="https://docs.dapr.io/operations/configuration/configuration-overview/#logging" changeable="false"
	 * @generated
	 */
	String getHelp();

} // LoggingConfiguration
