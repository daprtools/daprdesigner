/**
 */
package daprdesigner;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see daprdesigner.DaprdesignerPackage
 * @generated
 */
public interface DaprdesignerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DaprdesignerFactory eINSTANCE = daprdesigner.impl.DaprdesignerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Dapr Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dapr Architecture</em>'.
	 * @generated
	 */
	DaprArchitecture createDaprArchitecture();

	/**
	 * Returns a new object of class '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block</em>'.
	 * @generated
	 */
	Block createBlock();

	/**
	 * Returns a new object of class '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Namespace</em>'.
	 * @generated
	 */
	Namespace createNamespace();

	/**
	 * Returns a new object of class '<em>Trustdomain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trustdomain</em>'.
	 * @generated
	 */
	Trustdomain createTrustdomain();

	/**
	 * Returns a new object of class '<em>App</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>App</em>'.
	 * @generated
	 */
	App createApp();

	/**
	 * Returns a new object of class '<em>Logging Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logging Configuration</em>'.
	 * @generated
	 */
	LoggingConfiguration createLoggingConfiguration();

	/**
	 * Returns a new object of class '<em>Name Resolution Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Name Resolution Configuration</em>'.
	 * @generated
	 */
	NameResolutionConfiguration createNameResolutionConfiguration();

	/**
	 * Returns a new object of class '<em>Secrets Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Secrets Configuration</em>'.
	 * @generated
	 */
	SecretsConfiguration createSecretsConfiguration();

	/**
	 * Returns a new object of class '<em>Secrets List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Secrets List</em>'.
	 * @generated
	 */
	SecretsList createSecretsList();

	/**
	 * Returns a new object of class '<em>Metrics Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metrics Configuration</em>'.
	 * @generated
	 */
	MetricsConfiguration createMetricsConfiguration();

	/**
	 * Returns a new object of class '<em>API Access Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>API Access Control</em>'.
	 * @generated
	 */
	APIAccessControl createAPIAccessControl();

	/**
	 * Returns a new object of class '<em>API</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>API</em>'.
	 * @generated
	 */
	API createAPI();

	/**
	 * Returns a new object of class '<em>App Access Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>App Access Control</em>'.
	 * @generated
	 */
	AppAccessControl createAppAccessControl();

	/**
	 * Returns a new object of class '<em>App Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>App Policy</em>'.
	 * @generated
	 */
	AppPolicy createAppPolicy();

	/**
	 * Returns a new object of class '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation</em>'.
	 * @generated
	 */
	Operation createOperation();

	/**
	 * Returns a new object of class '<em>Middleware Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Middleware Configuration</em>'.
	 * @generated
	 */
	MiddlewareConfiguration createMiddlewareConfiguration();

	/**
	 * Returns a new object of class '<em>Http Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Http Handler</em>'.
	 * @generated
	 */
	HttpHandler createHttpHandler();

	/**
	 * Returns a new object of class '<em>Tracing Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tracing Configuration</em>'.
	 * @generated
	 */
	TracingConfiguration createTracingConfiguration();

	/**
	 * Returns a new object of class '<em>Subscription Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subscription Configuration</em>'.
	 * @generated
	 */
	SubscriptionConfiguration createSubscriptionConfiguration();

	/**
	 * Returns a new object of class '<em>Route Rules</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Route Rules</em>'.
	 * @generated
	 */
	RouteRules createRouteRules();

	/**
	 * Returns a new object of class '<em>Resiliency Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resiliency Configuration</em>'.
	 * @generated
	 */
	ResiliencyConfiguration createResiliencyConfiguration();

	/**
	 * Returns a new object of class '<em>Resiliency Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resiliency Policy</em>'.
	 * @generated
	 */
	ResiliencyPolicy createResiliencyPolicy();

	/**
	 * Returns a new object of class '<em>Resiliency Timeout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resiliency Timeout</em>'.
	 * @generated
	 */
	ResiliencyTimeout createResiliencyTimeout();

	/**
	 * Returns a new object of class '<em>Retry Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Retry Policy</em>'.
	 * @generated
	 */
	RetryPolicy createRetryPolicy();

	/**
	 * Returns a new object of class '<em>Circuit Breaker Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Circuit Breaker Policy</em>'.
	 * @generated
	 */
	CircuitBreakerPolicy createCircuitBreakerPolicy();

	/**
	 * Returns a new object of class '<em>Resiliency Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resiliency Target</em>'.
	 * @generated
	 */
	ResiliencyTarget createResiliencyTarget();

	/**
	 * Returns a new object of class '<em>HTTP End Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HTTP End Point</em>'.
	 * @generated
	 */
	HTTPEndPoint createHTTPEndPoint();

	/**
	 * Returns a new object of class '<em>Component Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Spec</em>'.
	 * @generated
	 */
	ComponentSpec createComponentSpec();

	/**
	 * Returns a new object of class '<em>Spec Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spec Metadata</em>'.
	 * @generated
	 */
	SpecMetadata createSpecMetadata();

	/**
	 * Returns a new object of class '<em>Hashicorp Vault</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hashicorp Vault</em>'.
	 * @generated
	 */
	HashicorpVault createHashicorpVault();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DaprdesignerPackage getDaprdesignerPackage();

} //DaprdesignerFactory
