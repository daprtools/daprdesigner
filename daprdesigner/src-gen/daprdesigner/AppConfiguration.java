/**
 */
package daprdesigner;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link daprdesigner.AppConfiguration#getMetadata_namespace <em>Metadata namespace</em>}</li>
 *   <li>{@link daprdesigner.AppConfiguration#getAccessControl <em>Access Control</em>}</li>
 *   <li>{@link daprdesigner.AppConfiguration#getApiControl <em>Api Control</em>}</li>
 *   <li>{@link daprdesigner.AppConfiguration#getMiddlewareConfiguration <em>Middleware Configuration</em>}</li>
 *   <li>{@link daprdesigner.AppConfiguration#getLoggingConfiguration <em>Logging Configuration</em>}</li>
 *   <li>{@link daprdesigner.AppConfiguration#getNameResolutionConfiguration <em>Name Resolution Configuration</em>}</li>
 *   <li>{@link daprdesigner.AppConfiguration#getSecretsConfiguration <em>Secrets Configuration</em>}</li>
 *   <li>{@link daprdesigner.AppConfiguration#getMetricsConfiguration <em>Metrics Configuration</em>}</li>
 *   <li>{@link daprdesigner.AppConfiguration#getTracingConfiguration <em>Tracing Configuration</em>}</li>
 *   <li>{@link daprdesigner.AppConfiguration#getComponentsDenyList <em>Components Deny List</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Metadata namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata namespace</em>' reference.
	 * @see #setMetadata_namespace(Namespace)
	 * @see daprdesigner.DaprdesignerPackage#getAppConfiguration_Metadata_namespace()
	 * @model
	 * @generated
	 */
	Namespace getMetadata_namespace();

	/**
	 * Sets the value of the '{@link daprdesigner.AppConfiguration#getMetadata_namespace <em>Metadata namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata namespace</em>' reference.
	 * @see #getMetadata_namespace()
	 * @generated
	 */
	void setMetadata_namespace(Namespace value);

	/**
	 * Returns the value of the '<em><b>Access Control</b></em>' reference list.
	 * The list contents are of type {@link daprdesigner.AppAccessControl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Control</em>' reference list.
	 * @see daprdesigner.DaprdesignerPackage#getAppConfiguration_AccessControl()
	 * @model
	 * @generated
	 */
	EList<AppAccessControl> getAccessControl();

	/**
	 * Returns the value of the '<em><b>Api Control</b></em>' reference list.
	 * The list contents are of type {@link daprdesigner.APIAccessControl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Control</em>' reference list.
	 * @see daprdesigner.DaprdesignerPackage#getAppConfiguration_ApiControl()
	 * @model
	 * @generated
	 */
	EList<APIAccessControl> getApiControl();

	/**
	 * Returns the value of the '<em><b>Middleware Configuration</b></em>' reference list.
	 * The list contents are of type {@link daprdesigner.MiddlewareConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Middleware Configuration</em>' reference list.
	 * @see daprdesigner.DaprdesignerPackage#getAppConfiguration_MiddlewareConfiguration()
	 * @model
	 * @generated
	 */
	EList<MiddlewareConfiguration> getMiddlewareConfiguration();

	/**
	 * Returns the value of the '<em><b>Logging Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logging Configuration</em>' reference.
	 * @see #setLoggingConfiguration(LoggingConfiguration)
	 * @see daprdesigner.DaprdesignerPackage#getAppConfiguration_LoggingConfiguration()
	 * @model
	 * @generated
	 */
	LoggingConfiguration getLoggingConfiguration();

	/**
	 * Sets the value of the '{@link daprdesigner.AppConfiguration#getLoggingConfiguration <em>Logging Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logging Configuration</em>' reference.
	 * @see #getLoggingConfiguration()
	 * @generated
	 */
	void setLoggingConfiguration(LoggingConfiguration value);

	/**
	 * Returns the value of the '<em><b>Name Resolution Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Resolution Configuration</em>' reference.
	 * @see #setNameResolutionConfiguration(NameResolutionConfiguration)
	 * @see daprdesigner.DaprdesignerPackage#getAppConfiguration_NameResolutionConfiguration()
	 * @model
	 * @generated
	 */
	NameResolutionConfiguration getNameResolutionConfiguration();

	/**
	 * Sets the value of the '{@link daprdesigner.AppConfiguration#getNameResolutionConfiguration <em>Name Resolution Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Resolution Configuration</em>' reference.
	 * @see #getNameResolutionConfiguration()
	 * @generated
	 */
	void setNameResolutionConfiguration(NameResolutionConfiguration value);

	/**
	 * Returns the value of the '<em><b>Secrets Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secrets Configuration</em>' reference.
	 * @see #setSecretsConfiguration(SecretsConfiguration)
	 * @see daprdesigner.DaprdesignerPackage#getAppConfiguration_SecretsConfiguration()
	 * @model
	 * @generated
	 */
	SecretsConfiguration getSecretsConfiguration();

	/**
	 * Sets the value of the '{@link daprdesigner.AppConfiguration#getSecretsConfiguration <em>Secrets Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secrets Configuration</em>' reference.
	 * @see #getSecretsConfiguration()
	 * @generated
	 */
	void setSecretsConfiguration(SecretsConfiguration value);

	/**
	 * Returns the value of the '<em><b>Metrics Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metrics Configuration</em>' reference.
	 * @see #setMetricsConfiguration(MetricsConfiguration)
	 * @see daprdesigner.DaprdesignerPackage#getAppConfiguration_MetricsConfiguration()
	 * @model
	 * @generated
	 */
	MetricsConfiguration getMetricsConfiguration();

	/**
	 * Sets the value of the '{@link daprdesigner.AppConfiguration#getMetricsConfiguration <em>Metrics Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metrics Configuration</em>' reference.
	 * @see #getMetricsConfiguration()
	 * @generated
	 */
	void setMetricsConfiguration(MetricsConfiguration value);

	/**
	 * Returns the value of the '<em><b>Tracing Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracing Configuration</em>' reference.
	 * @see #setTracingConfiguration(TracingConfiguration)
	 * @see daprdesigner.DaprdesignerPackage#getAppConfiguration_TracingConfiguration()
	 * @model
	 * @generated
	 */
	TracingConfiguration getTracingConfiguration();

	/**
	 * Sets the value of the '{@link daprdesigner.AppConfiguration#getTracingConfiguration <em>Tracing Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tracing Configuration</em>' reference.
	 * @see #getTracingConfiguration()
	 * @generated
	 */
	void setTracingConfiguration(TracingConfiguration value);

	/**
	 * Returns the value of the '<em><b>Components Deny List</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components Deny List</em>' attribute list.
	 * @see daprdesigner.DaprdesignerPackage#getAppConfiguration_ComponentsDenyList()
	 * @model
	 * @generated
	 */
	EList<String> getComponentsDenyList();

} // AppConfiguration
