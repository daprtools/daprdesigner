/**
 */
package daprdesigner.util;

import daprdesigner.*;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see daprdesigner.DaprdesignerPackage
 * @generated
 */
public class DaprdesignerSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DaprdesignerPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaprdesignerSwitch() {
		if (modelPackage == null) {
			modelPackage = DaprdesignerPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case DaprdesignerPackage.ESTRING_TO_STRING_MAP_ENTRY: {
			@SuppressWarnings("unchecked")
			Map.Entry<String, String> eStringToStringMapEntry = (Map.Entry<String, String>) theEObject;
			T result = caseEStringToStringMapEntry(eStringToStringMapEntry);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DaprdesignerPackage.DAPR_ARCHITECTURE: {
			DaprArchitecture daprArchitecture = (DaprArchitecture) theEObject;
			T result = caseDaprArchitecture(daprArchitecture);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DaprdesignerPackage.BLOCK: {
			Block block = (Block) theEObject;
			T result = caseBlock(block);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DaprdesignerPackage.DAPR_NODE: {
			DaprNode daprNode = (DaprNode) theEObject;
			T result = caseDaprNode(daprNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DaprdesignerPackage.NODE_BLOCKS: {
			NodeBlocks nodeBlocks = (NodeBlocks) theEObject;
			T result = caseNodeBlocks(nodeBlocks);
			if (result == null)
				result = caseDaprNode(nodeBlocks);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DaprdesignerPackage.NAMESPACE: {
			Namespace namespace = (Namespace) theEObject;
			T result = caseNamespace(namespace);
			if (result == null)
				result = caseDaprNode(namespace);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DaprdesignerPackage.TRUSTDOMAIN: {
			Trustdomain trustdomain = (Trustdomain) theEObject;
			T result = caseTrustdomain(trustdomain);
			if (result == null)
				result = caseDaprNode(trustdomain);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DaprdesignerPackage.APP: {
			App app = (App) theEObject;
			T result = caseApp(app);
			if (result == null)
				result = caseDaprNode(app);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DaprdesignerPackage.ACTOR: {
			Actor actor = (Actor) theEObject;
			T result = caseActor(actor);
			if (result == null)
				result = caseApp(actor);
			if (result == null)
				result = caseDaprNode(actor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DaprdesignerPackage.JOBS: {
			Jobs jobs = (Jobs) theEObject;
			T result = caseJobs(jobs);
			if (result == null)
				result = caseApp(jobs);
			if (result == null)
				result = caseDaprNode(jobs);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DaprdesignerPackage.WORKFLOW: {
			Workflow workflow = (Workflow) theEObject;
			T result = caseWorkflow(workflow);
			if (result == null)
				result = caseApp(workflow);
			if (result == null)
				result = caseDaprNode(workflow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DaprdesignerPackage.APP_CONFIGURATION: {
			AppConfiguration appConfiguration = (AppConfiguration) theEObject;
			T result = caseAppConfiguration(appConfiguration);
			if (result == null)
				result = caseDaprNode(appConfiguration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DaprdesignerPackage.DENIED_COMPONENTS_CONFIGURATION: {
			DeniedComponentsConfiguration deniedComponentsConfiguration = (DeniedComponentsConfiguration) theEObject;
			T result = caseDeniedComponentsConfiguration(deniedComponentsConfiguration);
			if (result == null)
				result = caseAppConfiguration(deniedComponentsConfiguration);
			if (result == null)
				result = caseDaprNode(deniedComponentsConfiguration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DaprdesignerPackage.LOGGING_CONFIGURATION: {
			LoggingConfiguration loggingConfiguration = (LoggingConfiguration) theEObject;
			T result = caseLoggingConfiguration(loggingConfiguration);
			if (result == null)
				result = caseAppConfiguration(loggingConfiguration);
			if (result == null)
				result = caseDaprNode(loggingConfiguration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DaprdesignerPackage.NAME_RESOLUTION_CONFIGURATION: {
			NameResolutionConfiguration nameResolutionConfiguration = (NameResolutionConfiguration) theEObject;
			T result = caseNameResolutionConfiguration(nameResolutionConfiguration);
			if (result == null)
				result = caseAppConfiguration(nameResolutionConfiguration);
			if (result == null)
				result = caseDaprNode(nameResolutionConfiguration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DaprdesignerPackage.SECRETS_ACCESS_CONFIGURATION: {
			SecretsAccessConfiguration secretsAccessConfiguration = (SecretsAccessConfiguration) theEObject;
			T result = caseSecretsAccessConfiguration(secretsAccessConfiguration);
			if (result == null)
				result = caseAppConfiguration(secretsAccessConfiguration);
			if (result == null)
				result = caseDaprNode(secretsAccessConfiguration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DaprdesignerPackage.SECRETS_ACCESS_LIST: {
			SecretsAccessList secretsAccessList = (SecretsAccessList) theEObject;
			T result = caseSecretsAccessList(secretsAccessList);
			if (result == null)
				result = caseDaprNode(secretsAccessList);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DaprdesignerPackage.METRICS_CONFIGURATION: {
			MetricsConfiguration metricsConfiguration = (MetricsConfiguration) theEObject;
			T result = caseMetricsConfiguration(metricsConfiguration);
			if (result == null)
				result = caseAppConfiguration(metricsConfiguration);
			if (result == null)
				result = caseDaprNode(metricsConfiguration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DaprdesignerPackage.API_ACCESS_CONTROL: {
			APIAccessControl apiAccessControl = (APIAccessControl) theEObject;
			T result = caseAPIAccessControl(apiAccessControl);
			if (result == null)
				result = caseAppConfiguration(apiAccessControl);
			if (result == null)
				result = caseDaprNode(apiAccessControl);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DaprdesignerPackage.API: {
			API api = (API) theEObject;
			T result = caseAPI(api);
			if (result == null)
				result = caseDaprNode(api);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DaprdesignerPackage.APP_ACCESS_CONTROL: {
			AppAccessControl appAccessControl = (AppAccessControl) theEObject;
			T result = caseAppAccessControl(appAccessControl);
			if (result == null)
				result = caseAppConfiguration(appAccessControl);
			if (result == null)
				result = caseDaprNode(appAccessControl);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DaprdesignerPackage.APP_POLICY: {
			AppPolicy appPolicy = (AppPolicy) theEObject;
			T result = caseAppPolicy(appPolicy);
			if (result == null)
				result = caseDaprNode(appPolicy);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DaprdesignerPackage.OPERATION: {
			Operation operation = (Operation) theEObject;
			T result = caseOperation(operation);
			if (result == null)
				result = caseDaprNode(operation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DaprdesignerPackage.MIDDLEWARE_CONFIGURATION: {
			MiddlewareConfiguration middlewareConfiguration = (MiddlewareConfiguration) theEObject;
			T result = caseMiddlewareConfiguration(middlewareConfiguration);
			if (result == null)
				result = caseAppConfiguration(middlewareConfiguration);
			if (result == null)
				result = caseDaprNode(middlewareConfiguration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DaprdesignerPackage.HTTP_HANDLER: {
			HttpHandler httpHandler = (HttpHandler) theEObject;
			T result = caseHttpHandler(httpHandler);
			if (result == null)
				result = caseDaprNode(httpHandler);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DaprdesignerPackage.TRACING_CONFIGURATION: {
			TracingConfiguration tracingConfiguration = (TracingConfiguration) theEObject;
			T result = caseTracingConfiguration(tracingConfiguration);
			if (result == null)
				result = caseAppConfiguration(tracingConfiguration);
			if (result == null)
				result = caseDaprNode(tracingConfiguration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION: {
			SubscriptionConfiguration subscriptionConfiguration = (SubscriptionConfiguration) theEObject;
			T result = caseSubscriptionConfiguration(subscriptionConfiguration);
			if (result == null)
				result = caseDaprNode(subscriptionConfiguration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DaprdesignerPackage.ROUTE_RULES: {
			RouteRules routeRules = (RouteRules) theEObject;
			T result = caseRouteRules(routeRules);
			if (result == null)
				result = caseDaprNode(routeRules);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DaprdesignerPackage.RESILIENCY_CONFIGURATION: {
			ResiliencyConfiguration resiliencyConfiguration = (ResiliencyConfiguration) theEObject;
			T result = caseResiliencyConfiguration(resiliencyConfiguration);
			if (result == null)
				result = caseDaprNode(resiliencyConfiguration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DaprdesignerPackage.RESILIENCY_POLICY: {
			ResiliencyPolicy resiliencyPolicy = (ResiliencyPolicy) theEObject;
			T result = caseResiliencyPolicy(resiliencyPolicy);
			if (result == null)
				result = caseDaprNode(resiliencyPolicy);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DaprdesignerPackage.RETRY_POLICY: {
			RetryPolicy retryPolicy = (RetryPolicy) theEObject;
			T result = caseRetryPolicy(retryPolicy);
			if (result == null)
				result = caseDaprNode(retryPolicy);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DaprdesignerPackage.RESILIENCY_TIMEOUT: {
			ResiliencyTimeout resiliencyTimeout = (ResiliencyTimeout) theEObject;
			T result = caseResiliencyTimeout(resiliencyTimeout);
			if (result == null)
				result = caseDaprNode(resiliencyTimeout);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DaprdesignerPackage.CIRCUIT_BREAKER_POLICY: {
			CircuitBreakerPolicy circuitBreakerPolicy = (CircuitBreakerPolicy) theEObject;
			T result = caseCircuitBreakerPolicy(circuitBreakerPolicy);
			if (result == null)
				result = caseDaprNode(circuitBreakerPolicy);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DaprdesignerPackage.RESILIENCY_TARGET: {
			ResiliencyTarget resiliencyTarget = (ResiliencyTarget) theEObject;
			T result = caseResiliencyTarget(resiliencyTarget);
			if (result == null)
				result = caseDaprNode(resiliencyTarget);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DaprdesignerPackage.HTTP_END_POINT: {
			HTTPEndPoint httpEndPoint = (HTTPEndPoint) theEObject;
			T result = caseHTTPEndPoint(httpEndPoint);
			if (result == null)
				result = caseDaprNode(httpEndPoint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DaprdesignerPackage.COMPONENT: {
			Component component = (Component) theEObject;
			T result = caseComponent(component);
			if (result == null)
				result = caseDaprNode(component);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DaprdesignerPackage.COMPONENT_SPEC: {
			ComponentSpec componentSpec = (ComponentSpec) theEObject;
			T result = caseComponentSpec(componentSpec);
			if (result == null)
				result = caseDaprNode(componentSpec);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DaprdesignerPackage.SPEC_METADATA: {
			SpecMetadata specMetadata = (SpecMetadata) theEObject;
			T result = caseSpecMetadata(specMetadata);
			if (result == null)
				result = caseDaprNode(specMetadata);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DaprdesignerPackage.PUB_SUB: {
			PubSub pubSub = (PubSub) theEObject;
			T result = casePubSub(pubSub);
			if (result == null)
				result = caseComponent(pubSub);
			if (result == null)
				result = caseDaprNode(pubSub);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DaprdesignerPackage.BINDINGS: {
			Bindings bindings = (Bindings) theEObject;
			T result = caseBindings(bindings);
			if (result == null)
				result = caseComponent(bindings);
			if (result == null)
				result = caseDaprNode(bindings);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DaprdesignerPackage.SECRET_STORE: {
			SecretStore secretStore = (SecretStore) theEObject;
			T result = caseSecretStore(secretStore);
			if (result == null)
				result = caseComponent(secretStore);
			if (result == null)
				result = caseDaprNode(secretStore);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DaprdesignerPackage.STATE_STORE: {
			StateStore stateStore = (StateStore) theEObject;
			T result = caseStateStore(stateStore);
			if (result == null)
				result = caseComponent(stateStore);
			if (result == null)
				result = caseDaprNode(stateStore);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DaprdesignerPackage.CONFIGURATION_STORE: {
			ConfigurationStore configurationStore = (ConfigurationStore) theEObject;
			T result = caseConfigurationStore(configurationStore);
			if (result == null)
				result = caseComponent(configurationStore);
			if (result == null)
				result = caseDaprNode(configurationStore);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DaprdesignerPackage.LOCKS: {
			Locks locks = (Locks) theEObject;
			T result = caseLocks(locks);
			if (result == null)
				result = caseComponent(locks);
			if (result == null)
				result = caseDaprNode(locks);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DaprdesignerPackage.CRYPTOGRAPHY: {
			Cryptography cryptography = (Cryptography) theEObject;
			T result = caseCryptography(cryptography);
			if (result == null)
				result = caseComponent(cryptography);
			if (result == null)
				result = caseDaprNode(cryptography);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DaprdesignerPackage.MIDDLEWARE: {
			Middleware middleware = (Middleware) theEObject;
			T result = caseMiddleware(middleware);
			if (result == null)
				result = caseComponent(middleware);
			if (result == null)
				result = caseDaprNode(middleware);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DaprdesignerPackage.NAMERESOLUTION: {
			Nameresolution nameresolution = (Nameresolution) theEObject;
			T result = caseNameresolution(nameresolution);
			if (result == null)
				result = caseComponent(nameresolution);
			if (result == null)
				result = caseDaprNode(nameresolution);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DaprdesignerPackage.CONVERSATION: {
			Conversation conversation = (Conversation) theEObject;
			T result = caseConversation(conversation);
			if (result == null)
				result = caseComponent(conversation);
			if (result == null)
				result = caseDaprNode(conversation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EString To String Map Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EString To String Map Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEStringToStringMapEntry(Map.Entry<String, String> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dapr Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dapr Architecture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaprArchitecture(DaprArchitecture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dapr Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dapr Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaprNode(DaprNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Blocks</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Blocks</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeBlocks(NodeBlocks object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespace(Namespace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trustdomain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trustdomain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrustdomain(Trustdomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApp(App object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActor(Actor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jobs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jobs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJobs(Jobs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflow(Workflow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppConfiguration(AppConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Denied Components Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Denied Components Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeniedComponentsConfiguration(DeniedComponentsConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logging Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logging Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoggingConfiguration(LoggingConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Resolution Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Resolution Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameResolutionConfiguration(NameResolutionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Secrets Access Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Secrets Access Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecretsAccessConfiguration(SecretsAccessConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Secrets Access List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Secrets Access List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecretsAccessList(SecretsAccessList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metrics Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metrics Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetricsConfiguration(MetricsConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>API Access Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>API Access Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPIAccessControl(APIAccessControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>API</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>API</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPI(API object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App Access Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App Access Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppAccessControl(AppAccessControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppPolicy(AppPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Middleware Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Middleware Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMiddlewareConfiguration(MiddlewareConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Http Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Http Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHttpHandler(HttpHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tracing Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tracing Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracingConfiguration(TracingConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subscription Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subscription Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubscriptionConfiguration(SubscriptionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route Rules</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route Rules</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRouteRules(RouteRules object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resiliency Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resiliency Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResiliencyConfiguration(ResiliencyConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resiliency Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resiliency Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResiliencyPolicy(ResiliencyPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Retry Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Retry Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRetryPolicy(RetryPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resiliency Timeout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resiliency Timeout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResiliencyTimeout(ResiliencyTimeout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Circuit Breaker Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Circuit Breaker Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCircuitBreakerPolicy(CircuitBreakerPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resiliency Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resiliency Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResiliencyTarget(ResiliencyTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HTTP End Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HTTP End Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHTTPEndPoint(HTTPEndPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentSpec(ComponentSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spec Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spec Metadata</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecMetadata(SpecMetadata object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pub Sub</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pub Sub</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePubSub(PubSub object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bindings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bindings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindings(Bindings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Secret Store</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Secret Store</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecretStore(SecretStore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Store</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Store</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateStore(StateStore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Store</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Store</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationStore(ConfigurationStore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Locks</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Locks</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocks(Locks object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cryptography</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cryptography</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCryptography(Cryptography object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Middleware</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Middleware</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMiddleware(Middleware object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nameresolution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nameresolution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameresolution(Nameresolution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conversation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conversation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConversation(Conversation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DaprdesignerSwitch
