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
 *   <li>{@link daprdesigner.LoggingConfiguration#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link daprdesigner.LoggingConfiguration#isObfuscateURLs <em>Obfuscate UR Ls</em>}</li>
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
	 * Returns the value of the '<em><b>Obfuscate UR Ls</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obfuscate UR Ls</em>' attribute.
	 * @see #setObfuscateURLs(boolean)
	 * @see daprdesigner.DaprdesignerPackage#getLoggingConfiguration_ObfuscateURLs()
	 * @model default="false"
	 * @generated
	 */
	boolean isObfuscateURLs();

	/**
	 * Sets the value of the '{@link daprdesigner.LoggingConfiguration#isObfuscateURLs <em>Obfuscate UR Ls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obfuscate UR Ls</em>' attribute.
	 * @see #isObfuscateURLs()
	 * @generated
	 */
	void setObfuscateURLs(boolean value);

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

} // LoggingConfiguration
