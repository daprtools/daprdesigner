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
		case DaprdesignerPackage.BLOCK:
			return createBlock();
		case DaprdesignerPackage.NAMESPACE:
			return createNamespace();
		case DaprdesignerPackage.TRUSTDOMAIN:
			return createTrustdomain();
		case DaprdesignerPackage.APP:
			return createApp();
		case DaprdesignerPackage.DENIED_COMPONENTS_CONFIGURATION:
			return createDeniedComponentsConfiguration();
		case DaprdesignerPackage.LOGGING_CONFIGURATION:
			return createLoggingConfiguration();
		case DaprdesignerPackage.NAME_RESOLUTION_CONFIGURATION:
			return createNameResolutionConfiguration();
		case DaprdesignerPackage.SECRETS_ACCESS_CONFIGURATION:
			return createSecretsAccessConfiguration();
		case DaprdesignerPackage.SECRETS_ACCESS_LIST:
			return createSecretsAccessList();
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
		case DaprdesignerPackage.RETRY_POLICY:
			return createRetryPolicy();
		case DaprdesignerPackage.RESILIENCY_TIMEOUT:
			return createResiliencyTimeout();
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
		case DaprdesignerPackage.ACCESS_ACTION:
			return createAccessActionFromString(eDataType, initialValue);
		case DaprdesignerPackage.RETRY_POLICY_TYPE:
			return createRetryPolicyTypeFromString(eDataType, initialValue);
		case DaprdesignerPackage.HTTP_HANDLER_TYPE:
			return createHttpHandlerTypeFromString(eDataType, initialValue);
		case DaprdesignerPackage.RESILIENCY_TARGET_TYPE:
			return createResiliencyTargetTypeFromString(eDataType, initialValue);
		case DaprdesignerPackage.BLOCK_TYPE:
			return createBlockTypeFromString(eDataType, initialValue);
		case DaprdesignerPackage.SDK_LANGUAGE:
			return createSDKLanguageFromString(eDataType, initialValue);
		case DaprdesignerPackage.PROTOCOL:
			return createProtocolFromString(eDataType, initialValue);
		case DaprdesignerPackage.VERB:
			return createVerbFromString(eDataType, initialValue);
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
		case DaprdesignerPackage.ACCESS_ACTION:
			return convertAccessActionToString(eDataType, instanceValue);
		case DaprdesignerPackage.RETRY_POLICY_TYPE:
			return convertRetryPolicyTypeToString(eDataType, instanceValue);
		case DaprdesignerPackage.HTTP_HANDLER_TYPE:
			return convertHttpHandlerTypeToString(eDataType, instanceValue);
		case DaprdesignerPackage.RESILIENCY_TARGET_TYPE:
			return convertResiliencyTargetTypeToString(eDataType, instanceValue);
		case DaprdesignerPackage.BLOCK_TYPE:
			return convertBlockTypeToString(eDataType, instanceValue);
		case DaprdesignerPackage.SDK_LANGUAGE:
			return convertSDKLanguageToString(eDataType, instanceValue);
		case DaprdesignerPackage.PROTOCOL:
			return convertProtocolToString(eDataType, instanceValue);
		case DaprdesignerPackage.VERB:
			return convertVerbToString(eDataType, instanceValue);
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
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
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
	public App createApp() {
		AppImpl app = new AppImpl();
		return app;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeniedComponentsConfiguration createDeniedComponentsConfiguration() {
		DeniedComponentsConfigurationImpl deniedComponentsConfiguration = new DeniedComponentsConfigurationImpl();
		return deniedComponentsConfiguration;
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
	public SecretsAccessConfiguration createSecretsAccessConfiguration() {
		SecretsAccessConfigurationImpl secretsAccessConfiguration = new SecretsAccessConfigurationImpl();
		return secretsAccessConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecretsAccessList createSecretsAccessList() {
		SecretsAccessListImpl secretsAccessList = new SecretsAccessListImpl();
		return secretsAccessList;
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
	public RetryPolicy createRetryPolicy() {
		RetryPolicyImpl retryPolicy = new RetryPolicyImpl();
		return retryPolicy;
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
	public AccessAction createAccessActionFromString(EDataType eDataType, String initialValue) {
		AccessAction result = AccessAction.get(initialValue);
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
	public String convertAccessActionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RetryPolicyType createRetryPolicyTypeFromString(EDataType eDataType, String initialValue) {
		RetryPolicyType result = RetryPolicyType.get(initialValue);
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
	public String convertRetryPolicyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpHandlerType createHttpHandlerTypeFromString(EDataType eDataType, String initialValue) {
		HttpHandlerType result = HttpHandlerType.get(initialValue);
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
	public String convertHttpHandlerTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
	public BlockType createBlockTypeFromString(EDataType eDataType, String initialValue) {
		BlockType result = BlockType.get(initialValue);
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
	public String convertBlockTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDKLanguage createSDKLanguageFromString(EDataType eDataType, String initialValue) {
		SDKLanguage result = SDKLanguage.get(initialValue);
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
	public String convertSDKLanguageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Protocol createProtocolFromString(EDataType eDataType, String initialValue) {
		Protocol result = Protocol.get(initialValue);
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
	public String convertProtocolToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Verb createVerbFromString(EDataType eDataType, String initialValue) {
		Verb result = Verb.get(initialValue);
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
	public String convertVerbToString(EDataType eDataType, Object instanceValue) {
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
