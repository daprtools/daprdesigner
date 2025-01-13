/**
 */
package daprdesigner.util;

import daprdesigner.*;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see daprdesigner.DaprdesignerPackage
 * @generated
 */
public class DaprdesignerAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DaprdesignerPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaprdesignerAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DaprdesignerPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DaprdesignerSwitch<Adapter> modelSwitch = new DaprdesignerSwitch<Adapter>() {
		@Override
		public Adapter caseEStringToStringMapEntry(Map.Entry<String, String> object) {
			return createEStringToStringMapEntryAdapter();
		}

		@Override
		public Adapter caseDaprArchitecture(DaprArchitecture object) {
			return createDaprArchitectureAdapter();
		}

		@Override
		public Adapter caseBlock(Block object) {
			return createBlockAdapter();
		}

		@Override
		public Adapter caseDaprNode(DaprNode object) {
			return createDaprNodeAdapter();
		}

		@Override
		public Adapter caseNamespace(Namespace object) {
			return createNamespaceAdapter();
		}

		@Override
		public Adapter caseTrustdomain(Trustdomain object) {
			return createTrustdomainAdapter();
		}

		@Override
		public Adapter caseApp(App object) {
			return createAppAdapter();
		}

		@Override
		public Adapter caseAppConfiguration(AppConfiguration object) {
			return createAppConfigurationAdapter();
		}

		@Override
		public Adapter caseDeniedComponentsConfiguration(DeniedComponentsConfiguration object) {
			return createDeniedComponentsConfigurationAdapter();
		}

		@Override
		public Adapter caseLoggingConfiguration(LoggingConfiguration object) {
			return createLoggingConfigurationAdapter();
		}

		@Override
		public Adapter caseNameResolutionConfiguration(NameResolutionConfiguration object) {
			return createNameResolutionConfigurationAdapter();
		}

		@Override
		public Adapter caseSecretsAccessConfiguration(SecretsAccessConfiguration object) {
			return createSecretsAccessConfigurationAdapter();
		}

		@Override
		public Adapter caseSecretsAccessList(SecretsAccessList object) {
			return createSecretsAccessListAdapter();
		}

		@Override
		public Adapter caseMetricsConfiguration(MetricsConfiguration object) {
			return createMetricsConfigurationAdapter();
		}

		@Override
		public Adapter caseAPIAccessControl(APIAccessControl object) {
			return createAPIAccessControlAdapter();
		}

		@Override
		public Adapter caseAPI(API object) {
			return createAPIAdapter();
		}

		@Override
		public Adapter caseAppAccessControl(AppAccessControl object) {
			return createAppAccessControlAdapter();
		}

		@Override
		public Adapter caseAppPolicy(AppPolicy object) {
			return createAppPolicyAdapter();
		}

		@Override
		public Adapter caseOperation(Operation object) {
			return createOperationAdapter();
		}

		@Override
		public Adapter caseMiddlewareConfiguration(MiddlewareConfiguration object) {
			return createMiddlewareConfigurationAdapter();
		}

		@Override
		public Adapter caseHttpHandler(HttpHandler object) {
			return createHttpHandlerAdapter();
		}

		@Override
		public Adapter caseTracingConfiguration(TracingConfiguration object) {
			return createTracingConfigurationAdapter();
		}

		@Override
		public Adapter caseSubscriptionConfiguration(SubscriptionConfiguration object) {
			return createSubscriptionConfigurationAdapter();
		}

		@Override
		public Adapter caseRouteRules(RouteRules object) {
			return createRouteRulesAdapter();
		}

		@Override
		public Adapter caseResiliencyConfiguration(ResiliencyConfiguration object) {
			return createResiliencyConfigurationAdapter();
		}

		@Override
		public Adapter caseResiliencyPolicy(ResiliencyPolicy object) {
			return createResiliencyPolicyAdapter();
		}

		@Override
		public Adapter caseRetryPolicy(RetryPolicy object) {
			return createRetryPolicyAdapter();
		}

		@Override
		public Adapter caseResiliencyTimeout(ResiliencyTimeout object) {
			return createResiliencyTimeoutAdapter();
		}

		@Override
		public Adapter caseCircuitBreakerPolicy(CircuitBreakerPolicy object) {
			return createCircuitBreakerPolicyAdapter();
		}

		@Override
		public Adapter caseResiliencyTarget(ResiliencyTarget object) {
			return createResiliencyTargetAdapter();
		}

		@Override
		public Adapter caseHTTPEndPoint(HTTPEndPoint object) {
			return createHTTPEndPointAdapter();
		}

		@Override
		public Adapter caseComponent(Component object) {
			return createComponentAdapter();
		}

		@Override
		public Adapter caseComponentSpec(ComponentSpec object) {
			return createComponentSpecAdapter();
		}

		@Override
		public Adapter caseSpecMetadata(SpecMetadata object) {
			return createSpecMetadataAdapter();
		}

		@Override
		public Adapter caseSecretStore(SecretStore object) {
			return createSecretStoreAdapter();
		}

		@Override
		public Adapter caseHashicorpVault(HashicorpVault object) {
			return createHashicorpVaultAdapter();
		}

		@Override
		public Adapter caseMessageBroker(MessageBroker object) {
			return createMessageBrokerAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>EString To String Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createEStringToStringMapEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daprdesigner.DaprArchitecture <em>Dapr Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daprdesigner.DaprArchitecture
	 * @generated
	 */
	public Adapter createDaprArchitectureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daprdesigner.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daprdesigner.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daprdesigner.DaprNode <em>Dapr Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daprdesigner.DaprNode
	 * @generated
	 */
	public Adapter createDaprNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daprdesigner.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daprdesigner.Namespace
	 * @generated
	 */
	public Adapter createNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daprdesigner.Trustdomain <em>Trustdomain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daprdesigner.Trustdomain
	 * @generated
	 */
	public Adapter createTrustdomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daprdesigner.App <em>App</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daprdesigner.App
	 * @generated
	 */
	public Adapter createAppAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daprdesigner.AppConfiguration <em>App Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daprdesigner.AppConfiguration
	 * @generated
	 */
	public Adapter createAppConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daprdesigner.DeniedComponentsConfiguration <em>Denied Components Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daprdesigner.DeniedComponentsConfiguration
	 * @generated
	 */
	public Adapter createDeniedComponentsConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daprdesigner.LoggingConfiguration <em>Logging Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daprdesigner.LoggingConfiguration
	 * @generated
	 */
	public Adapter createLoggingConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daprdesigner.NameResolutionConfiguration <em>Name Resolution Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daprdesigner.NameResolutionConfiguration
	 * @generated
	 */
	public Adapter createNameResolutionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daprdesigner.SecretsAccessConfiguration <em>Secrets Access Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daprdesigner.SecretsAccessConfiguration
	 * @generated
	 */
	public Adapter createSecretsAccessConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daprdesigner.SecretsAccessList <em>Secrets Access List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daprdesigner.SecretsAccessList
	 * @generated
	 */
	public Adapter createSecretsAccessListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daprdesigner.MetricsConfiguration <em>Metrics Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daprdesigner.MetricsConfiguration
	 * @generated
	 */
	public Adapter createMetricsConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daprdesigner.APIAccessControl <em>API Access Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daprdesigner.APIAccessControl
	 * @generated
	 */
	public Adapter createAPIAccessControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daprdesigner.API <em>API</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daprdesigner.API
	 * @generated
	 */
	public Adapter createAPIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daprdesigner.AppAccessControl <em>App Access Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daprdesigner.AppAccessControl
	 * @generated
	 */
	public Adapter createAppAccessControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daprdesigner.AppPolicy <em>App Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daprdesigner.AppPolicy
	 * @generated
	 */
	public Adapter createAppPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daprdesigner.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daprdesigner.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daprdesigner.MiddlewareConfiguration <em>Middleware Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daprdesigner.MiddlewareConfiguration
	 * @generated
	 */
	public Adapter createMiddlewareConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daprdesigner.HttpHandler <em>Http Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daprdesigner.HttpHandler
	 * @generated
	 */
	public Adapter createHttpHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daprdesigner.TracingConfiguration <em>Tracing Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daprdesigner.TracingConfiguration
	 * @generated
	 */
	public Adapter createTracingConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daprdesigner.SubscriptionConfiguration <em>Subscription Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daprdesigner.SubscriptionConfiguration
	 * @generated
	 */
	public Adapter createSubscriptionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daprdesigner.RouteRules <em>Route Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daprdesigner.RouteRules
	 * @generated
	 */
	public Adapter createRouteRulesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daprdesigner.ResiliencyConfiguration <em>Resiliency Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daprdesigner.ResiliencyConfiguration
	 * @generated
	 */
	public Adapter createResiliencyConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daprdesigner.ResiliencyPolicy <em>Resiliency Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daprdesigner.ResiliencyPolicy
	 * @generated
	 */
	public Adapter createResiliencyPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daprdesigner.RetryPolicy <em>Retry Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daprdesigner.RetryPolicy
	 * @generated
	 */
	public Adapter createRetryPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daprdesigner.ResiliencyTimeout <em>Resiliency Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daprdesigner.ResiliencyTimeout
	 * @generated
	 */
	public Adapter createResiliencyTimeoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daprdesigner.CircuitBreakerPolicy <em>Circuit Breaker Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daprdesigner.CircuitBreakerPolicy
	 * @generated
	 */
	public Adapter createCircuitBreakerPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daprdesigner.ResiliencyTarget <em>Resiliency Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daprdesigner.ResiliencyTarget
	 * @generated
	 */
	public Adapter createResiliencyTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daprdesigner.HTTPEndPoint <em>HTTP End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daprdesigner.HTTPEndPoint
	 * @generated
	 */
	public Adapter createHTTPEndPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daprdesigner.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daprdesigner.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daprdesigner.ComponentSpec <em>Component Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daprdesigner.ComponentSpec
	 * @generated
	 */
	public Adapter createComponentSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daprdesigner.SpecMetadata <em>Spec Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daprdesigner.SpecMetadata
	 * @generated
	 */
	public Adapter createSpecMetadataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daprdesigner.SecretStore <em>Secret Store</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daprdesigner.SecretStore
	 * @generated
	 */
	public Adapter createSecretStoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daprdesigner.HashicorpVault <em>Hashicorp Vault</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daprdesigner.HashicorpVault
	 * @generated
	 */
	public Adapter createHashicorpVaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daprdesigner.MessageBroker <em>Message Broker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daprdesigner.MessageBroker
	 * @generated
	 */
	public Adapter createMessageBrokerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DaprdesignerAdapterFactory
