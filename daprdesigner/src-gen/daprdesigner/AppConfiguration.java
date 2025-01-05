/**
 */
package daprdesigner;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

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
 *   <li>{@link daprdesigner.AppConfiguration#getMetadata_name <em>Metadata name</em>}</li>
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
 * @model
 * @generated
 */
public interface AppConfiguration extends EObject {
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
	 * Returns the value of the '<em><b>Metadata name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata name</em>' attribute.
	 * @see #setMetadata_name(String)
	 * @see daprdesigner.DaprdesignerPackage#getAppConfiguration_Metadata_name()
	 * @model
	 * @generated
	 */
	String getMetadata_name();

	/**
	 * Sets the value of the '{@link daprdesigner.AppConfiguration#getMetadata_name <em>Metadata name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata name</em>' attribute.
	 * @see #getMetadata_name()
	 * @generated
	 */
	void setMetadata_name(String value);

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
	 * Returns the value of the '<em><b>Access Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Control</em>' containment reference.
	 * @see #setAccessControl(AppAccessControl)
	 * @see daprdesigner.DaprdesignerPackage#getAppConfiguration_AccessControl()
	 * @model containment="true"
	 * @generated
	 */
	AppAccessControl getAccessControl();

	/**
	 * Sets the value of the '{@link daprdesigner.AppConfiguration#getAccessControl <em>Access Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Control</em>' containment reference.
	 * @see #getAccessControl()
	 * @generated
	 */
	void setAccessControl(AppAccessControl value);

	/**
	 * Returns the value of the '<em><b>Api Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Control</em>' containment reference.
	 * @see #setApiControl(APIAccessControl)
	 * @see daprdesigner.DaprdesignerPackage#getAppConfiguration_ApiControl()
	 * @model containment="true"
	 * @generated
	 */
	APIAccessControl getApiControl();

	/**
	 * Sets the value of the '{@link daprdesigner.AppConfiguration#getApiControl <em>Api Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Control</em>' containment reference.
	 * @see #getApiControl()
	 * @generated
	 */
	void setApiControl(APIAccessControl value);

	/**
	 * Returns the value of the '<em><b>Middleware Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Middleware Configuration</em>' containment reference.
	 * @see #setMiddlewareConfiguration(MiddlewareConfiguration)
	 * @see daprdesigner.DaprdesignerPackage#getAppConfiguration_MiddlewareConfiguration()
	 * @model containment="true"
	 * @generated
	 */
	MiddlewareConfiguration getMiddlewareConfiguration();

	/**
	 * Sets the value of the '{@link daprdesigner.AppConfiguration#getMiddlewareConfiguration <em>Middleware Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Middleware Configuration</em>' containment reference.
	 * @see #getMiddlewareConfiguration()
	 * @generated
	 */
	void setMiddlewareConfiguration(MiddlewareConfiguration value);

	/**
	 * Returns the value of the '<em><b>Logging Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logging Configuration</em>' containment reference.
	 * @see #setLoggingConfiguration(LoggingConfiguration)
	 * @see daprdesigner.DaprdesignerPackage#getAppConfiguration_LoggingConfiguration()
	 * @model containment="true"
	 * @generated
	 */
	LoggingConfiguration getLoggingConfiguration();

	/**
	 * Sets the value of the '{@link daprdesigner.AppConfiguration#getLoggingConfiguration <em>Logging Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logging Configuration</em>' containment reference.
	 * @see #getLoggingConfiguration()
	 * @generated
	 */
	void setLoggingConfiguration(LoggingConfiguration value);

	/**
	 * Returns the value of the '<em><b>Name Resolution Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Resolution Configuration</em>' containment reference.
	 * @see #setNameResolutionConfiguration(NameResolutionConfiguration)
	 * @see daprdesigner.DaprdesignerPackage#getAppConfiguration_NameResolutionConfiguration()
	 * @model containment="true"
	 * @generated
	 */
	NameResolutionConfiguration getNameResolutionConfiguration();

	/**
	 * Sets the value of the '{@link daprdesigner.AppConfiguration#getNameResolutionConfiguration <em>Name Resolution Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Resolution Configuration</em>' containment reference.
	 * @see #getNameResolutionConfiguration()
	 * @generated
	 */
	void setNameResolutionConfiguration(NameResolutionConfiguration value);

	/**
	 * Returns the value of the '<em><b>Secrets Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secrets Configuration</em>' containment reference.
	 * @see #setSecretsConfiguration(SecretsConfiguration)
	 * @see daprdesigner.DaprdesignerPackage#getAppConfiguration_SecretsConfiguration()
	 * @model containment="true"
	 * @generated
	 */
	SecretsConfiguration getSecretsConfiguration();

	/**
	 * Sets the value of the '{@link daprdesigner.AppConfiguration#getSecretsConfiguration <em>Secrets Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secrets Configuration</em>' containment reference.
	 * @see #getSecretsConfiguration()
	 * @generated
	 */
	void setSecretsConfiguration(SecretsConfiguration value);

	/**
	 * Returns the value of the '<em><b>Metrics Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metrics Configuration</em>' containment reference.
	 * @see #setMetricsConfiguration(MetricsConfiguration)
	 * @see daprdesigner.DaprdesignerPackage#getAppConfiguration_MetricsConfiguration()
	 * @model containment="true"
	 * @generated
	 */
	MetricsConfiguration getMetricsConfiguration();

	/**
	 * Sets the value of the '{@link daprdesigner.AppConfiguration#getMetricsConfiguration <em>Metrics Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metrics Configuration</em>' containment reference.
	 * @see #getMetricsConfiguration()
	 * @generated
	 */
	void setMetricsConfiguration(MetricsConfiguration value);

	/**
	 * Returns the value of the '<em><b>Tracing Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracing Configuration</em>' containment reference.
	 * @see #setTracingConfiguration(TracingConfiguration)
	 * @see daprdesigner.DaprdesignerPackage#getAppConfiguration_TracingConfiguration()
	 * @model containment="true"
	 * @generated
	 */
	TracingConfiguration getTracingConfiguration();

	/**
	 * Sets the value of the '{@link daprdesigner.AppConfiguration#getTracingConfiguration <em>Tracing Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tracing Configuration</em>' containment reference.
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
