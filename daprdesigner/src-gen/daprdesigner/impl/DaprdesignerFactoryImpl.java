/**
 */
package daprdesigner.impl;

import daprdesigner.*;

import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DaprdesignerFactoryImpl extends EFactoryImpl implements DaprdesignerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DaprdesignerFactory init() {
		try {
			DaprdesignerFactory theDaprdesignerFactory = (DaprdesignerFactory) EPackage.Registry.INSTANCE
					.getEFactory(DaprdesignerPackage.eNS_URI);
			if (theDaprdesignerFactory != null) {
				return theDaprdesignerFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DaprdesignerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaprdesignerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case DaprdesignerPackage.ESTRING_TO_STRING_MAP_ENTRY:
			return (EObject) createEStringToStringMapEntry();
		case DaprdesignerPackage.DAPR_ARCHITECTURE:
			return createDaprArchitecture();
		case DaprdesignerPackage.ENVIRONMENT:
			return createEnvironment();
		case DaprdesignerPackage.NAMESPACE:
			return createNamespace();
		case DaprdesignerPackage.TRUSTDOMAIN:
			return createTrustdomain();
		case DaprdesignerPackage.SERVICES:
			return createServices();
		case DaprdesignerPackage.APP:
			return createApp();
		case DaprdesignerPackage.APP_CONFIGURATION:
			return createAppConfiguration();
		case DaprdesignerPackage.LOGGING_CONFIGURATION:
			return createLoggingConfiguration();
		case DaprdesignerPackage.NAME_RESOLUTION_CONFIGURATION:
			return createNameResolutionConfiguration();
		case DaprdesignerPackage.SECRETS_CONFIGURATION:
			return createSecretsConfiguration();
		case DaprdesignerPackage.SECRETS_LIST:
			return createSecretsList();
		case DaprdesignerPackage.METRICS_CONFIGURATION:
			return createMetricsConfiguration();
		case DaprdesignerPackage.API_ACCESS_CONTROL:
			return createAPIAccessControl();
		case DaprdesignerPackage.API:
			return createAPI();
		case DaprdesignerPackage.APP_ACCESS_CONTROL:
			return createAppAccessControl();
		case DaprdesignerPackage.APP_POLICY:
			return createAppPolicy();
		case DaprdesignerPackage.OPERATION:
			return createOperation();
		case DaprdesignerPackage.MIDDLEWARE_CONFIGURATION:
			return createMiddlewareConfiguration();
		case DaprdesignerPackage.HTTP_HANDLER:
			return createHttpHandler();
		case DaprdesignerPackage.TRACING_CONFIGURATION:
			return createTracingConfiguration();
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION:
			return createSubscriptionConfiguration();
		case DaprdesignerPackage.ROUTE_RULES:
			return createRouteRules();
		case DaprdesignerPackage.RESILIENCY_CONFIGURATION:
			return createResiliencyConfiguration();
		case DaprdesignerPackage.RESILIENCY_POLICY:
			return createResiliencyPolicy();
		case DaprdesignerPackage.RESILIENCY_TIMEOUT:
			return createResiliencyTimeout();
		case DaprdesignerPackage.RETRY_POLICY:
			return createRetryPolicy();
		case DaprdesignerPackage.CIRCUIT_BREAKER_POLICY:
			return createCircuitBreakerPolicy();
		case DaprdesignerPackage.RESILIENCY_TARGET:
			return createResiliencyTarget();
		case DaprdesignerPackage.HTTP_END_POINT:
			return createHTTPEndPoint();
		case DaprdesignerPackage.COMPONENT_SPEC:
			return createComponentSpec();
		case DaprdesignerPackage.SPEC_METADATA:
			return createSpecMetadata();
		case DaprdesignerPackage.HASHICORP_VAULT:
			return createHashicorpVault();
		case DaprdesignerPackage.PUB_SUB:
			return createPubSub();
		case DaprdesignerPackage.BINDINGS:
			return createBindings();
		case DaprdesignerPackage.JOBS:
			return createJobs();
		case DaprdesignerPackage.CONFIGURATION:
			return createConfiguration();
		case DaprdesignerPackage.WORKFLOW:
			return createWorkflow();
		case DaprdesignerPackage.ACTORS:
			return createActors();
		case DaprdesignerPackage.SECRETS:
			return createSecrets();
		case DaprdesignerPackage.STATE_MANAGEMENT:
			return createStateManagement();
		case DaprdesignerPackage.DISTRIBUTED_LOCKS:
			return createDistributedLocks();
		case DaprdesignerPackage.CRYPTO_GRAPHY:
			return createCryptoGraphy();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case DaprdesignerPackage.RESILIENCY_TARGET_TYPE:
			return createResiliencyTargetTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case DaprdesignerPackage.RESILIENCY_TARGET_TYPE:
			return convertResiliencyTargetTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, String> createEStringToStringMapEntry() {
		EStringToStringMapEntryImpl eStringToStringMapEntry = new EStringToStringMapEntryImpl();
		return eStringToStringMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaprArchitecture createDaprArchitecture() {
		DaprArchitectureImpl daprArchitecture = new DaprArchitectureImpl();
		return daprArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment createEnvironment() {
		EnvironmentImpl environment = new EnvironmentImpl();
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace createNamespace() {
		NamespaceImpl namespace = new NamespaceImpl();
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trustdomain createTrustdomain() {
		TrustdomainImpl trustdomain = new TrustdomainImpl();
		return trustdomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Services createServices() {
		ServicesImpl services = new ServicesImpl();
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public App createApp() {
		AppImpl app = new AppImpl();
		return app;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppConfiguration createAppConfiguration() {
		AppConfigurationImpl appConfiguration = new AppConfigurationImpl();
		return appConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoggingConfiguration createLoggingConfiguration() {
		LoggingConfigurationImpl loggingConfiguration = new LoggingConfigurationImpl();
		return loggingConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameResolutionConfiguration createNameResolutionConfiguration() {
		NameResolutionConfigurationImpl nameResolutionConfiguration = new NameResolutionConfigurationImpl();
		return nameResolutionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecretsConfiguration createSecretsConfiguration() {
		SecretsConfigurationImpl secretsConfiguration = new SecretsConfigurationImpl();
		return secretsConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecretsList createSecretsList() {
		SecretsListImpl secretsList = new SecretsListImpl();
		return secretsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricsConfiguration createMetricsConfiguration() {
		MetricsConfigurationImpl metricsConfiguration = new MetricsConfigurationImpl();
		return metricsConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APIAccessControl createAPIAccessControl() {
		APIAccessControlImpl apiAccessControl = new APIAccessControlImpl();
		return apiAccessControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public API createAPI() {
		APIImpl api = new APIImpl();
		return api;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppAccessControl createAppAccessControl() {
		AppAccessControlImpl appAccessControl = new AppAccessControlImpl();
		return appAccessControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppPolicy createAppPolicy() {
		AppPolicyImpl appPolicy = new AppPolicyImpl();
		return appPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiddlewareConfiguration createMiddlewareConfiguration() {
		MiddlewareConfigurationImpl middlewareConfiguration = new MiddlewareConfigurationImpl();
		return middlewareConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpHandler createHttpHandler() {
		HttpHandlerImpl httpHandler = new HttpHandlerImpl();
		return httpHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracingConfiguration createTracingConfiguration() {
		TracingConfigurationImpl tracingConfiguration = new TracingConfigurationImpl();
		return tracingConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionConfiguration createSubscriptionConfiguration() {
		SubscriptionConfigurationImpl subscriptionConfiguration = new SubscriptionConfigurationImpl();
		return subscriptionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteRules createRouteRules() {
		RouteRulesImpl routeRules = new RouteRulesImpl();
		return routeRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResiliencyConfiguration createResiliencyConfiguration() {
		ResiliencyConfigurationImpl resiliencyConfiguration = new ResiliencyConfigurationImpl();
		return resiliencyConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResiliencyPolicy createResiliencyPolicy() {
		ResiliencyPolicyImpl resiliencyPolicy = new ResiliencyPolicyImpl();
		return resiliencyPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResiliencyTimeout createResiliencyTimeout() {
		ResiliencyTimeoutImpl resiliencyTimeout = new ResiliencyTimeoutImpl();
		return resiliencyTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RetryPolicy createRetryPolicy() {
		RetryPolicyImpl retryPolicy = new RetryPolicyImpl();
		return retryPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircuitBreakerPolicy createCircuitBreakerPolicy() {
		CircuitBreakerPolicyImpl circuitBreakerPolicy = new CircuitBreakerPolicyImpl();
		return circuitBreakerPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResiliencyTarget createResiliencyTarget() {
		ResiliencyTargetImpl resiliencyTarget = new ResiliencyTargetImpl();
		return resiliencyTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPEndPoint createHTTPEndPoint() {
		HTTPEndPointImpl httpEndPoint = new HTTPEndPointImpl();
		return httpEndPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentSpec createComponentSpec() {
		ComponentSpecImpl componentSpec = new ComponentSpecImpl();
		return componentSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecMetadata createSpecMetadata() {
		SpecMetadataImpl specMetadata = new SpecMetadataImpl();
		return specMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HashicorpVault createHashicorpVault() {
		HashicorpVaultImpl hashicorpVault = new HashicorpVaultImpl();
		return hashicorpVault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PubSub createPubSub() {
		PubSubImpl pubSub = new PubSubImpl();
		return pubSub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bindings createBindings() {
		BindingsImpl bindings = new BindingsImpl();
		return bindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Jobs createJobs() {
		JobsImpl jobs = new JobsImpl();
		return jobs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workflow createWorkflow() {
		WorkflowImpl workflow = new WorkflowImpl();
		return workflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actors createActors() {
		ActorsImpl actors = new ActorsImpl();
		return actors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Secrets createSecrets() {
		SecretsImpl secrets = new SecretsImpl();
		return secrets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateManagement createStateManagement() {
		StateManagementImpl stateManagement = new StateManagementImpl();
		return stateManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributedLocks createDistributedLocks() {
		DistributedLocksImpl distributedLocks = new DistributedLocksImpl();
		return distributedLocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CryptoGraphy createCryptoGraphy() {
		CryptoGraphyImpl cryptoGraphy = new CryptoGraphyImpl();
		return cryptoGraphy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResiliencyTargetType createResiliencyTargetTypeFromString(EDataType eDataType, String initialValue) {
		ResiliencyTargetType result = ResiliencyTargetType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResiliencyTargetTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaprdesignerPackage getDaprdesignerPackage() {
		return (DaprdesignerPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DaprdesignerPackage getPackage() {
		return DaprdesignerPackage.eINSTANCE;
	}

} //DaprdesignerFactoryImpl
