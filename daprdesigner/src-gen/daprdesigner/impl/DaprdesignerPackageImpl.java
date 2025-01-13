/**
 */
package daprdesigner.impl;

import daprdesigner.APIAccessControl;
import daprdesigner.AccessAction;
import daprdesigner.App;
import daprdesigner.AppAccessControl;
import daprdesigner.AppConfiguration;
import daprdesigner.AppPolicy;
import daprdesigner.Block;
import daprdesigner.BlockType;
import daprdesigner.CircuitBreakerPolicy;
import daprdesigner.Component;
import daprdesigner.ComponentSpec;
import daprdesigner.DaprArchitecture;
import daprdesigner.DaprNode;
import daprdesigner.DaprdesignerFactory;
import daprdesigner.DaprdesignerPackage;
import daprdesigner.DeniedComponentsConfiguration;
import daprdesigner.HTTPEndPoint;
import daprdesigner.HashicorpVault;
import daprdesigner.HttpHandler;
import daprdesigner.HttpHandlerType;
import daprdesigner.LoggingConfiguration;
import daprdesigner.MessageBroker;
import daprdesigner.MetricsConfiguration;
import daprdesigner.MiddlewareConfiguration;
import daprdesigner.NameResolutionConfiguration;
import daprdesigner.Namespace;
import daprdesigner.Operation;
import daprdesigner.Protocol;
import daprdesigner.ResiliencyConfiguration;
import daprdesigner.ResiliencyPolicy;
import daprdesigner.ResiliencyTarget;
import daprdesigner.ResiliencyTargetType;
import daprdesigner.ResiliencyTimeout;
import daprdesigner.RetryPolicy;
import daprdesigner.RetryPolicyType;
import daprdesigner.RouteRules;
import daprdesigner.SDKLanguage;
import daprdesigner.SecretStore;
import daprdesigner.SecretsAccessConfiguration;
import daprdesigner.SecretsAccessList;
import daprdesigner.SpecMetadata;
import daprdesigner.SubscriptionConfiguration;
import daprdesigner.TracingConfiguration;
import daprdesigner.Trustdomain;
import daprdesigner.Verb;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DaprdesignerPackageImpl extends EPackageImpl implements DaprdesignerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eStringToStringMapEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daprArchitectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daprNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trustdomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deniedComponentsConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loggingConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameResolutionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass secretsAccessConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass secretsAccessListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricsConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apiAccessControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appAccessControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass middlewareConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass httpHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracingConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subscriptionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routeRulesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resiliencyConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resiliencyPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass retryPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resiliencyTimeoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass circuitBreakerPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resiliencyTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass httpEndPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specMetadataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass secretStoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hashicorpVaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageBrokerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accessActionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum retryPolicyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum httpHandlerTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resiliencyTargetTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum blockTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sdkLanguageEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum protocolEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum verbEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see daprdesigner.DaprdesignerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DaprdesignerPackageImpl() {
		super(eNS_URI, DaprdesignerFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DaprdesignerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DaprdesignerPackage init() {
		if (isInited)
			return (DaprdesignerPackage) EPackage.Registry.INSTANCE.getEPackage(DaprdesignerPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDaprdesignerPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DaprdesignerPackageImpl theDaprdesignerPackage = registeredDaprdesignerPackage instanceof DaprdesignerPackageImpl
				? (DaprdesignerPackageImpl) registeredDaprdesignerPackage
				: new DaprdesignerPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theDaprdesignerPackage.createPackageContents();

		// Initialize created meta-data
		theDaprdesignerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDaprdesignerPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DaprdesignerPackage.eNS_URI, theDaprdesignerPackage);
		return theDaprdesignerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEStringToStringMapEntry() {
		return eStringToStringMapEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStringToStringMapEntry_Key() {
		return (EAttribute) eStringToStringMapEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStringToStringMapEntry_Value() {
		return (EAttribute) eStringToStringMapEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaprArchitecture() {
		return daprArchitectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaprArchitecture_Name() {
		return (EAttribute) daprArchitectureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaprArchitecture_Buildingblocks() {
		return (EReference) daprArchitectureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_Name() {
		return (EAttribute) blockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_Description() {
		return (EAttribute) blockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_Notes() {
		return (EAttribute) blockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_BlockType() {
		return (EAttribute) blockEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Subblocks() {
		return (EReference) blockEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Nodes() {
		return (EReference) blockEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaprNode() {
		return daprNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaprNode_Name() {
		return (EAttribute) daprNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaprNode_Description() {
		return (EAttribute) daprNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaprNode_Notes() {
		return (EAttribute) daprNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamespace() {
		return namespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamespace_Name() {
		return (EAttribute) namespaceEClass.getEStructuralFeatures().get(-1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrustdomain() {
		return trustdomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrustdomain_Name() {
		return (EAttribute) trustdomainEClass.getEStructuralFeatures().get(-1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApp() {
		return appEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApp_AppId() {
		return (EAttribute) appEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApp_Repository() {
		return (EAttribute) appEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApp_SdkLanguage() {
		return (EAttribute) appEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApp_Namespace() {
		return (EReference) appEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApp_TrustDomain() {
		return (EReference) appEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApp_Configurations() {
		return (EReference) appEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppConfiguration() {
		return appConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppConfiguration_ApiVersion() {
		return (EAttribute) appConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppConfiguration_Kind() {
		return (EAttribute) appConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeniedComponentsConfiguration() {
		return deniedComponentsConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeniedComponentsConfiguration_DeniedComponents() {
		return (EReference) deniedComponentsConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoggingConfiguration() {
		return loggingConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoggingConfiguration_Enabled() {
		return (EAttribute) loggingConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoggingConfiguration_ObfuscateURLs() {
		return (EAttribute) loggingConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoggingConfiguration_OmitHealthChecks() {
		return (EAttribute) loggingConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameResolutionConfiguration() {
		return nameResolutionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNameResolutionConfiguration_Component() {
		return (EReference) nameResolutionConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameResolutionConfiguration_ComponentVersion() {
		return (EAttribute) nameResolutionConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameResolutionConfiguration_ConfigurationKey() {
		return (EAttribute) nameResolutionConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameResolutionConfiguration_ConfigurationValue() {
		return (EAttribute) nameResolutionConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecretsAccessConfiguration() {
		return secretsAccessConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecretsAccessConfiguration_AccessList() {
		return (EReference) secretsAccessConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecretsAccessList() {
		return secretsAccessListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecretsAccessList_Component() {
		return (EReference) secretsAccessListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecretsAccessList_DefaultAccess() {
		return (EAttribute) secretsAccessListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecretsAccessList_Secrets() {
		return (EAttribute) secretsAccessListEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecretsAccessList_Action() {
		return (EAttribute) secretsAccessListEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetricsConfiguration() {
		return metricsConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetricsConfiguration_Enabled() {
		return (EAttribute) metricsConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetricsConfiguration_LatencyDistributionBuckets() {
		return (EAttribute) metricsConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetricsConfiguration_Http_increasedCardinality() {
		return (EAttribute) metricsConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetricsConfiguration_Http_pathMatching() {
		return (EAttribute) metricsConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetricsConfiguration_Http_excludeVerbs() {
		return (EAttribute) metricsConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPIAccessControl() {
		return apiAccessControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPIAccessControl_ApiList() {
		return (EReference) apiAccessControlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPI() {
		return apiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPI_Component() {
		return (EReference) apiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPI_Api_version() {
		return (EAttribute) apiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPI_Protocol() {
		return (EAttribute) apiEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPI_Access() {
		return (EAttribute) apiEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppAccessControl() {
		return appAccessControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppAccessControl_DefaultAction() {
		return (EAttribute) appAccessControlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppAccessControl_TrustDomain() {
		return (EReference) appAccessControlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppAccessControl_Policies() {
		return (EReference) appAccessControlEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppPolicy() {
		return appPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppPolicy_App() {
		return (EReference) appPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppPolicy_DefaultAction() {
		return (EAttribute) appPolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppPolicy_TrustDomain() {
		return (EReference) appPolicyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppPolicy_Namespace() {
		return (EReference) appPolicyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppPolicy_Operations() {
		return (EReference) appPolicyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Protocol() {
		return (EAttribute) operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_OperationName() {
		return (EAttribute) operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Verbs() {
		return (EAttribute) operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Action() {
		return (EAttribute) operationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMiddlewareConfiguration() {
		return middlewareConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiddlewareConfiguration_HttpHandlers() {
		return (EReference) middlewareConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHttpHandler() {
		return httpHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHttpHandler_HandlerName() {
		return (EAttribute) httpHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHttpHandler_Type() {
		return (EAttribute) httpHandlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHttpHandler_HandlerType() {
		return (EAttribute) httpHandlerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHttpHandler_Name() {
		return (EAttribute) httpHandlerEClass.getEStructuralFeatures().get(-1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracingConfiguration() {
		return tracingConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTracingConfiguration_SamplingRate() {
		return (EAttribute) tracingConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTracingConfiguration_Stdout() {
		return (EAttribute) tracingConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTracingConfiguration_Otel_endPointAddress() {
		return (EAttribute) tracingConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTracingConfiguration_Otel_isSecure() {
		return (EAttribute) tracingConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTracingConfiguration_Otel_protocol() {
		return (EAttribute) tracingConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTracingConfiguration_Zipkin_endPointAddress() {
		return (EAttribute) tracingConfigurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubscriptionConfiguration() {
		return subscriptionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriptionConfiguration_ApiVersion() {
		return (EAttribute) subscriptionConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriptionConfiguration_Kind() {
		return (EAttribute) subscriptionConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriptionConfiguration_TopicName() {
		return (EAttribute) subscriptionConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscriptionConfiguration_RouteRules() {
		return (EReference) subscriptionConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscriptionConfiguration_Pubsub() {
		return (EReference) subscriptionConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriptionConfiguration_DeadLetterTopic() {
		return (EAttribute) subscriptionConfigurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriptionConfiguration_BulkSubscribe_enabled() {
		return (EAttribute) subscriptionConfigurationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriptionConfiguration_BulkSubscribe_maxMessagesCount() {
		return (EAttribute) subscriptionConfigurationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriptionConfiguration_BulkSubscribe_maxAwaitDurationMs() {
		return (EAttribute) subscriptionConfigurationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscriptionConfiguration_Scopes() {
		return (EReference) subscriptionConfigurationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriptionConfiguration_Name() {
		return (EAttribute) subscriptionConfigurationEClass.getEStructuralFeatures().get(-1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRouteRules() {
		return routeRulesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRouteRules_Match() {
		return (EAttribute) routeRulesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRouteRules_Path() {
		return (EAttribute) routeRulesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResiliencyConfiguration() {
		return resiliencyConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResiliencyConfiguration_ApiVersion() {
		return (EAttribute) resiliencyConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResiliencyConfiguration_Kind() {
		return (EAttribute) resiliencyConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResiliencyConfiguration_Version() {
		return (EAttribute) resiliencyConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResiliencyConfiguration_Scopes() {
		return (EReference) resiliencyConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResiliencyConfiguration_Policy() {
		return (EReference) resiliencyConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResiliencyConfiguration_Targets() {
		return (EReference) resiliencyConfigurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResiliencyConfiguration_Name() {
		return (EAttribute) resiliencyConfigurationEClass.getEStructuralFeatures().get(-1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResiliencyPolicy() {
		return resiliencyPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResiliencyPolicy_Retries() {
		return (EReference) resiliencyPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResiliencyPolicy_Circuitbreakers() {
		return (EReference) resiliencyPolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResiliencyPolicy_TimeoutDefinitions() {
		return (EReference) resiliencyPolicyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRetryPolicy() {
		return retryPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRetryPolicy_Policy_type() {
		return (EAttribute) retryPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRetryPolicy_Duration() {
		return (EAttribute) retryPolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRetryPolicy_MaxRetries() {
		return (EAttribute) retryPolicyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRetryPolicy_MaxInterval() {
		return (EAttribute) retryPolicyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRetryPolicy_Name() {
		return (EAttribute) retryPolicyEClass.getEStructuralFeatures().get(-1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResiliencyTimeout() {
		return resiliencyTimeoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResiliencyTimeout_TimeOutinSeconds() {
		return (EAttribute) resiliencyTimeoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResiliencyTimeout_Name() {
		return (EAttribute) resiliencyTimeoutEClass.getEStructuralFeatures().get(-1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCircuitBreakerPolicy() {
		return circuitBreakerPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircuitBreakerPolicy_MaxRequests() {
		return (EAttribute) circuitBreakerPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircuitBreakerPolicy_Interval() {
		return (EAttribute) circuitBreakerPolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircuitBreakerPolicy_Timeout() {
		return (EAttribute) circuitBreakerPolicyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircuitBreakerPolicy_Trip() {
		return (EAttribute) circuitBreakerPolicyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircuitBreakerPolicy_Name() {
		return (EAttribute) circuitBreakerPolicyEClass.getEStructuralFeatures().get(-1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResiliencyTarget() {
		return resiliencyTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResiliencyTarget_Type() {
		return (EAttribute) resiliencyTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResiliencyTarget_CircuitBreaker() {
		return (EReference) resiliencyTargetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResiliencyTarget_Retry() {
		return (EReference) resiliencyTargetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResiliencyTarget_CircuitBreakerCacheSize() {
		return (EAttribute) resiliencyTargetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResiliencyTarget_Timeout() {
		return (EReference) resiliencyTargetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResiliencyTarget_Name() {
		return (EAttribute) resiliencyTargetEClass.getEStructuralFeatures().get(-1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHTTPEndPoint() {
		return httpEndPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHTTPEndPoint_ApiVersion() {
		return (EAttribute) httpEndPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHTTPEndPoint_Kind() {
		return (EAttribute) httpEndPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHTTPEndPoint_Auth() {
		return (EReference) httpEndPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHTTPEndPoint_BaseUrl() {
		return (EAttribute) httpEndPointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHTTPEndPoint_Scopes() {
		return (EReference) httpEndPointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHTTPEndPoint_Headers() {
		return (EReference) httpEndPointEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHTTPEndPoint_ClientTLS_rootCA() {
		return (EReference) httpEndPointEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHTTPEndPoint_ClientTLS_certificate() {
		return (EReference) httpEndPointEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHTTPEndPoint_ClientTLS_privateKey() {
		return (EReference) httpEndPointEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_ApiVersion() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Kind() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Auth() {
		return (EReference) componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Metadata_namespace() {
		return (EReference) componentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Spec() {
		return (EReference) componentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Scopes() {
		return (EReference) componentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentSpec() {
		return componentSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentSpec_IgnoreErrors() {
		return (EAttribute) componentSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentSpec_InitTimeout() {
		return (EAttribute) componentSpecEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentSpec_Spec_metadata() {
		return (EReference) componentSpecEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecMetadata() {
		return specMetadataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecMetadata_Value() {
		return (EAttribute) specMetadataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecMetadata_IsFetchedFromSecret() {
		return (EAttribute) specMetadataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecMetadata_IsFetchedFromEnvironment() {
		return (EAttribute) specMetadataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecMetadata_SecretKeyRefName() {
		return (EAttribute) specMetadataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecMetadata_SecretKeyRefKey() {
		return (EAttribute) specMetadataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecMetadata_EnvRef() {
		return (EAttribute) specMetadataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecMetadata_Name() {
		return (EAttribute) specMetadataEClass.getEStructuralFeatures().get(-1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecretStore() {
		return secretStoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHashicorpVault() {
		return hashicorpVaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHashicorpVault_Spec_type() {
		return (EAttribute) hashicorpVaultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHashicorpVault_Spec_version() {
		return (EAttribute) hashicorpVaultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageBroker() {
		return messageBrokerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAccessAction() {
		return accessActionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRetryPolicyType() {
		return retryPolicyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHttpHandlerType() {
		return httpHandlerTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResiliencyTargetType() {
		return resiliencyTargetTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBlockType() {
		return blockTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSDKLanguage() {
		return sdkLanguageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProtocol() {
		return protocolEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVerb() {
		return verbEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaprdesignerFactory getDaprdesignerFactory() {
		return (DaprdesignerFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		eStringToStringMapEntryEClass = createEClass(ESTRING_TO_STRING_MAP_ENTRY);
		createEAttribute(eStringToStringMapEntryEClass, ESTRING_TO_STRING_MAP_ENTRY__KEY);
		createEAttribute(eStringToStringMapEntryEClass, ESTRING_TO_STRING_MAP_ENTRY__VALUE);

		daprArchitectureEClass = createEClass(DAPR_ARCHITECTURE);
		createEAttribute(daprArchitectureEClass, DAPR_ARCHITECTURE__NAME);
		createEReference(daprArchitectureEClass, DAPR_ARCHITECTURE__BUILDINGBLOCKS);

		blockEClass = createEClass(BLOCK);
		createEAttribute(blockEClass, BLOCK__NAME);
		createEAttribute(blockEClass, BLOCK__DESCRIPTION);
		createEAttribute(blockEClass, BLOCK__NOTES);
		createEAttribute(blockEClass, BLOCK__BLOCK_TYPE);
		createEReference(blockEClass, BLOCK__SUBBLOCKS);
		createEReference(blockEClass, BLOCK__NODES);

		daprNodeEClass = createEClass(DAPR_NODE);
		createEAttribute(daprNodeEClass, DAPR_NODE__NAME);
		createEAttribute(daprNodeEClass, DAPR_NODE__DESCRIPTION);
		createEAttribute(daprNodeEClass, DAPR_NODE__NOTES);

		namespaceEClass = createEClass(NAMESPACE);
		createEAttribute(namespaceEClass, NAMESPACE__NAME);

		trustdomainEClass = createEClass(TRUSTDOMAIN);
		createEAttribute(trustdomainEClass, TRUSTDOMAIN__NAME);

		appEClass = createEClass(APP);
		createEAttribute(appEClass, APP__APP_ID);
		createEAttribute(appEClass, APP__REPOSITORY);
		createEAttribute(appEClass, APP__SDK_LANGUAGE);
		createEReference(appEClass, APP__NAMESPACE);
		createEReference(appEClass, APP__TRUST_DOMAIN);
		createEReference(appEClass, APP__CONFIGURATIONS);

		appConfigurationEClass = createEClass(APP_CONFIGURATION);
		createEAttribute(appConfigurationEClass, APP_CONFIGURATION__API_VERSION);
		createEAttribute(appConfigurationEClass, APP_CONFIGURATION__KIND);

		deniedComponentsConfigurationEClass = createEClass(DENIED_COMPONENTS_CONFIGURATION);
		createEReference(deniedComponentsConfigurationEClass, DENIED_COMPONENTS_CONFIGURATION__DENIED_COMPONENTS);

		loggingConfigurationEClass = createEClass(LOGGING_CONFIGURATION);
		createEAttribute(loggingConfigurationEClass, LOGGING_CONFIGURATION__ENABLED);
		createEAttribute(loggingConfigurationEClass, LOGGING_CONFIGURATION__OBFUSCATE_UR_LS);
		createEAttribute(loggingConfigurationEClass, LOGGING_CONFIGURATION__OMIT_HEALTH_CHECKS);

		nameResolutionConfigurationEClass = createEClass(NAME_RESOLUTION_CONFIGURATION);
		createEReference(nameResolutionConfigurationEClass, NAME_RESOLUTION_CONFIGURATION__COMPONENT);
		createEAttribute(nameResolutionConfigurationEClass, NAME_RESOLUTION_CONFIGURATION__COMPONENT_VERSION);
		createEAttribute(nameResolutionConfigurationEClass, NAME_RESOLUTION_CONFIGURATION__CONFIGURATION_KEY);
		createEAttribute(nameResolutionConfigurationEClass, NAME_RESOLUTION_CONFIGURATION__CONFIGURATION_VALUE);

		secretsAccessConfigurationEClass = createEClass(SECRETS_ACCESS_CONFIGURATION);
		createEReference(secretsAccessConfigurationEClass, SECRETS_ACCESS_CONFIGURATION__ACCESS_LIST);

		secretsAccessListEClass = createEClass(SECRETS_ACCESS_LIST);
		createEReference(secretsAccessListEClass, SECRETS_ACCESS_LIST__COMPONENT);
		createEAttribute(secretsAccessListEClass, SECRETS_ACCESS_LIST__DEFAULT_ACCESS);
		createEAttribute(secretsAccessListEClass, SECRETS_ACCESS_LIST__SECRETS);
		createEAttribute(secretsAccessListEClass, SECRETS_ACCESS_LIST__ACTION);

		metricsConfigurationEClass = createEClass(METRICS_CONFIGURATION);
		createEAttribute(metricsConfigurationEClass, METRICS_CONFIGURATION__ENABLED);
		createEAttribute(metricsConfigurationEClass, METRICS_CONFIGURATION__LATENCY_DISTRIBUTION_BUCKETS);
		createEAttribute(metricsConfigurationEClass, METRICS_CONFIGURATION__HTTP_INCREASED_CARDINALITY);
		createEAttribute(metricsConfigurationEClass, METRICS_CONFIGURATION__HTTP_PATH_MATCHING);
		createEAttribute(metricsConfigurationEClass, METRICS_CONFIGURATION__HTTP_EXCLUDE_VERBS);

		apiAccessControlEClass = createEClass(API_ACCESS_CONTROL);
		createEReference(apiAccessControlEClass, API_ACCESS_CONTROL__API_LIST);

		apiEClass = createEClass(API);
		createEReference(apiEClass, API__COMPONENT);
		createEAttribute(apiEClass, API__API_VERSION);
		createEAttribute(apiEClass, API__PROTOCOL);
		createEAttribute(apiEClass, API__ACCESS);

		appAccessControlEClass = createEClass(APP_ACCESS_CONTROL);
		createEAttribute(appAccessControlEClass, APP_ACCESS_CONTROL__DEFAULT_ACTION);
		createEReference(appAccessControlEClass, APP_ACCESS_CONTROL__TRUST_DOMAIN);
		createEReference(appAccessControlEClass, APP_ACCESS_CONTROL__POLICIES);

		appPolicyEClass = createEClass(APP_POLICY);
		createEReference(appPolicyEClass, APP_POLICY__APP);
		createEAttribute(appPolicyEClass, APP_POLICY__DEFAULT_ACTION);
		createEReference(appPolicyEClass, APP_POLICY__TRUST_DOMAIN);
		createEReference(appPolicyEClass, APP_POLICY__NAMESPACE);
		createEReference(appPolicyEClass, APP_POLICY__OPERATIONS);

		operationEClass = createEClass(OPERATION);
		createEAttribute(operationEClass, OPERATION__PROTOCOL);
		createEAttribute(operationEClass, OPERATION__OPERATION_NAME);
		createEAttribute(operationEClass, OPERATION__VERBS);
		createEAttribute(operationEClass, OPERATION__ACTION);

		middlewareConfigurationEClass = createEClass(MIDDLEWARE_CONFIGURATION);
		createEReference(middlewareConfigurationEClass, MIDDLEWARE_CONFIGURATION__HTTP_HANDLERS);

		httpHandlerEClass = createEClass(HTTP_HANDLER);
		createEAttribute(httpHandlerEClass, HTTP_HANDLER__HANDLER_NAME);
		createEAttribute(httpHandlerEClass, HTTP_HANDLER__TYPE);
		createEAttribute(httpHandlerEClass, HTTP_HANDLER__HANDLER_TYPE);
		createEAttribute(httpHandlerEClass, HTTP_HANDLER__NAME);

		tracingConfigurationEClass = createEClass(TRACING_CONFIGURATION);
		createEAttribute(tracingConfigurationEClass, TRACING_CONFIGURATION__SAMPLING_RATE);
		createEAttribute(tracingConfigurationEClass, TRACING_CONFIGURATION__STDOUT);
		createEAttribute(tracingConfigurationEClass, TRACING_CONFIGURATION__OTEL_END_POINT_ADDRESS);
		createEAttribute(tracingConfigurationEClass, TRACING_CONFIGURATION__OTEL_IS_SECURE);
		createEAttribute(tracingConfigurationEClass, TRACING_CONFIGURATION__OTEL_PROTOCOL);
		createEAttribute(tracingConfigurationEClass, TRACING_CONFIGURATION__ZIPKIN_END_POINT_ADDRESS);

		subscriptionConfigurationEClass = createEClass(SUBSCRIPTION_CONFIGURATION);
		createEAttribute(subscriptionConfigurationEClass, SUBSCRIPTION_CONFIGURATION__API_VERSION);
		createEAttribute(subscriptionConfigurationEClass, SUBSCRIPTION_CONFIGURATION__KIND);
		createEAttribute(subscriptionConfigurationEClass, SUBSCRIPTION_CONFIGURATION__TOPIC_NAME);
		createEReference(subscriptionConfigurationEClass, SUBSCRIPTION_CONFIGURATION__ROUTE_RULES);
		createEReference(subscriptionConfigurationEClass, SUBSCRIPTION_CONFIGURATION__PUBSUB);
		createEAttribute(subscriptionConfigurationEClass, SUBSCRIPTION_CONFIGURATION__DEAD_LETTER_TOPIC);
		createEAttribute(subscriptionConfigurationEClass, SUBSCRIPTION_CONFIGURATION__BULK_SUBSCRIBE_ENABLED);
		createEAttribute(subscriptionConfigurationEClass,
				SUBSCRIPTION_CONFIGURATION__BULK_SUBSCRIBE_MAX_MESSAGES_COUNT);
		createEAttribute(subscriptionConfigurationEClass,
				SUBSCRIPTION_CONFIGURATION__BULK_SUBSCRIBE_MAX_AWAIT_DURATION_MS);
		createEReference(subscriptionConfigurationEClass, SUBSCRIPTION_CONFIGURATION__SCOPES);
		createEAttribute(subscriptionConfigurationEClass, SUBSCRIPTION_CONFIGURATION__NAME);

		routeRulesEClass = createEClass(ROUTE_RULES);
		createEAttribute(routeRulesEClass, ROUTE_RULES__MATCH);
		createEAttribute(routeRulesEClass, ROUTE_RULES__PATH);

		resiliencyConfigurationEClass = createEClass(RESILIENCY_CONFIGURATION);
		createEAttribute(resiliencyConfigurationEClass, RESILIENCY_CONFIGURATION__API_VERSION);
		createEAttribute(resiliencyConfigurationEClass, RESILIENCY_CONFIGURATION__KIND);
		createEAttribute(resiliencyConfigurationEClass, RESILIENCY_CONFIGURATION__VERSION);
		createEReference(resiliencyConfigurationEClass, RESILIENCY_CONFIGURATION__SCOPES);
		createEReference(resiliencyConfigurationEClass, RESILIENCY_CONFIGURATION__POLICY);
		createEReference(resiliencyConfigurationEClass, RESILIENCY_CONFIGURATION__TARGETS);
		createEAttribute(resiliencyConfigurationEClass, RESILIENCY_CONFIGURATION__NAME);

		resiliencyPolicyEClass = createEClass(RESILIENCY_POLICY);
		createEReference(resiliencyPolicyEClass, RESILIENCY_POLICY__RETRIES);
		createEReference(resiliencyPolicyEClass, RESILIENCY_POLICY__CIRCUITBREAKERS);
		createEReference(resiliencyPolicyEClass, RESILIENCY_POLICY__TIMEOUT_DEFINITIONS);

		retryPolicyEClass = createEClass(RETRY_POLICY);
		createEAttribute(retryPolicyEClass, RETRY_POLICY__POLICY_TYPE);
		createEAttribute(retryPolicyEClass, RETRY_POLICY__DURATION);
		createEAttribute(retryPolicyEClass, RETRY_POLICY__MAX_RETRIES);
		createEAttribute(retryPolicyEClass, RETRY_POLICY__MAX_INTERVAL);
		createEAttribute(retryPolicyEClass, RETRY_POLICY__NAME);

		resiliencyTimeoutEClass = createEClass(RESILIENCY_TIMEOUT);
		createEAttribute(resiliencyTimeoutEClass, RESILIENCY_TIMEOUT__TIME_OUTIN_SECONDS);
		createEAttribute(resiliencyTimeoutEClass, RESILIENCY_TIMEOUT__NAME);

		circuitBreakerPolicyEClass = createEClass(CIRCUIT_BREAKER_POLICY);
		createEAttribute(circuitBreakerPolicyEClass, CIRCUIT_BREAKER_POLICY__MAX_REQUESTS);
		createEAttribute(circuitBreakerPolicyEClass, CIRCUIT_BREAKER_POLICY__INTERVAL);
		createEAttribute(circuitBreakerPolicyEClass, CIRCUIT_BREAKER_POLICY__TIMEOUT);
		createEAttribute(circuitBreakerPolicyEClass, CIRCUIT_BREAKER_POLICY__TRIP);
		createEAttribute(circuitBreakerPolicyEClass, CIRCUIT_BREAKER_POLICY__NAME);

		resiliencyTargetEClass = createEClass(RESILIENCY_TARGET);
		createEAttribute(resiliencyTargetEClass, RESILIENCY_TARGET__TYPE);
		createEReference(resiliencyTargetEClass, RESILIENCY_TARGET__CIRCUIT_BREAKER);
		createEReference(resiliencyTargetEClass, RESILIENCY_TARGET__RETRY);
		createEAttribute(resiliencyTargetEClass, RESILIENCY_TARGET__CIRCUIT_BREAKER_CACHE_SIZE);
		createEReference(resiliencyTargetEClass, RESILIENCY_TARGET__TIMEOUT);
		createEAttribute(resiliencyTargetEClass, RESILIENCY_TARGET__NAME);

		httpEndPointEClass = createEClass(HTTP_END_POINT);
		createEAttribute(httpEndPointEClass, HTTP_END_POINT__API_VERSION);
		createEAttribute(httpEndPointEClass, HTTP_END_POINT__KIND);
		createEReference(httpEndPointEClass, HTTP_END_POINT__AUTH);
		createEAttribute(httpEndPointEClass, HTTP_END_POINT__BASE_URL);
		createEReference(httpEndPointEClass, HTTP_END_POINT__SCOPES);
		createEReference(httpEndPointEClass, HTTP_END_POINT__HEADERS);
		createEReference(httpEndPointEClass, HTTP_END_POINT__CLIENT_TLS_ROOT_CA);
		createEReference(httpEndPointEClass, HTTP_END_POINT__CLIENT_TLS_CERTIFICATE);
		createEReference(httpEndPointEClass, HTTP_END_POINT__CLIENT_TLS_PRIVATE_KEY);

		componentEClass = createEClass(COMPONENT);
		createEAttribute(componentEClass, COMPONENT__API_VERSION);
		createEAttribute(componentEClass, COMPONENT__KIND);
		createEReference(componentEClass, COMPONENT__AUTH);
		createEReference(componentEClass, COMPONENT__METADATA_NAMESPACE);
		createEReference(componentEClass, COMPONENT__SPEC);
		createEReference(componentEClass, COMPONENT__SCOPES);

		componentSpecEClass = createEClass(COMPONENT_SPEC);
		createEAttribute(componentSpecEClass, COMPONENT_SPEC__IGNORE_ERRORS);
		createEAttribute(componentSpecEClass, COMPONENT_SPEC__INIT_TIMEOUT);
		createEReference(componentSpecEClass, COMPONENT_SPEC__SPEC_METADATA);

		specMetadataEClass = createEClass(SPEC_METADATA);
		createEAttribute(specMetadataEClass, SPEC_METADATA__VALUE);
		createEAttribute(specMetadataEClass, SPEC_METADATA__IS_FETCHED_FROM_SECRET);
		createEAttribute(specMetadataEClass, SPEC_METADATA__IS_FETCHED_FROM_ENVIRONMENT);
		createEAttribute(specMetadataEClass, SPEC_METADATA__SECRET_KEY_REF_NAME);
		createEAttribute(specMetadataEClass, SPEC_METADATA__SECRET_KEY_REF_KEY);
		createEAttribute(specMetadataEClass, SPEC_METADATA__ENV_REF);
		createEAttribute(specMetadataEClass, SPEC_METADATA__NAME);

		secretStoreEClass = createEClass(SECRET_STORE);

		hashicorpVaultEClass = createEClass(HASHICORP_VAULT);
		createEAttribute(hashicorpVaultEClass, HASHICORP_VAULT__SPEC_TYPE);
		createEAttribute(hashicorpVaultEClass, HASHICORP_VAULT__SPEC_VERSION);

		messageBrokerEClass = createEClass(MESSAGE_BROKER);

		// Create enums
		accessActionEEnum = createEEnum(ACCESS_ACTION);
		retryPolicyTypeEEnum = createEEnum(RETRY_POLICY_TYPE);
		httpHandlerTypeEEnum = createEEnum(HTTP_HANDLER_TYPE);
		resiliencyTargetTypeEEnum = createEEnum(RESILIENCY_TARGET_TYPE);
		blockTypeEEnum = createEEnum(BLOCK_TYPE);
		sdkLanguageEEnum = createEEnum(SDK_LANGUAGE);
		protocolEEnum = createEEnum(PROTOCOL);
		verbEEnum = createEEnum(VERB);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		namespaceEClass.getESuperTypes().add(this.getDaprNode());
		trustdomainEClass.getESuperTypes().add(this.getDaprNode());
		appEClass.getESuperTypes().add(this.getDaprNode());
		appConfigurationEClass.getESuperTypes().add(this.getDaprNode());
		deniedComponentsConfigurationEClass.getESuperTypes().add(this.getAppConfiguration());
		loggingConfigurationEClass.getESuperTypes().add(this.getAppConfiguration());
		nameResolutionConfigurationEClass.getESuperTypes().add(this.getAppConfiguration());
		secretsAccessConfigurationEClass.getESuperTypes().add(this.getAppConfiguration());
		secretsAccessListEClass.getESuperTypes().add(this.getDaprNode());
		metricsConfigurationEClass.getESuperTypes().add(this.getAppConfiguration());
		apiAccessControlEClass.getESuperTypes().add(this.getAppConfiguration());
		apiEClass.getESuperTypes().add(this.getDaprNode());
		appAccessControlEClass.getESuperTypes().add(this.getAppConfiguration());
		appPolicyEClass.getESuperTypes().add(this.getDaprNode());
		operationEClass.getESuperTypes().add(this.getDaprNode());
		middlewareConfigurationEClass.getESuperTypes().add(this.getAppConfiguration());
		httpHandlerEClass.getESuperTypes().add(this.getDaprNode());
		tracingConfigurationEClass.getESuperTypes().add(this.getAppConfiguration());
		subscriptionConfigurationEClass.getESuperTypes().add(this.getDaprNode());
		routeRulesEClass.getESuperTypes().add(this.getDaprNode());
		resiliencyConfigurationEClass.getESuperTypes().add(this.getDaprNode());
		resiliencyPolicyEClass.getESuperTypes().add(this.getDaprNode());
		retryPolicyEClass.getESuperTypes().add(this.getDaprNode());
		resiliencyTimeoutEClass.getESuperTypes().add(this.getDaprNode());
		circuitBreakerPolicyEClass.getESuperTypes().add(this.getDaprNode());
		resiliencyTargetEClass.getESuperTypes().add(this.getDaprNode());
		httpEndPointEClass.getESuperTypes().add(this.getDaprNode());
		componentEClass.getESuperTypes().add(this.getDaprNode());
		componentSpecEClass.getESuperTypes().add(this.getDaprNode());
		specMetadataEClass.getESuperTypes().add(this.getDaprNode());
		secretStoreEClass.getESuperTypes().add(this.getComponent());
		hashicorpVaultEClass.getESuperTypes().add(this.getSecretStore());
		messageBrokerEClass.getESuperTypes().add(this.getComponent());

		// Initialize classes, features, and operations; add parameters
		initEClass(eStringToStringMapEntryEClass, Map.Entry.class, "EStringToStringMapEntry", !IS_ABSTRACT,
				!IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEStringToStringMapEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStringToStringMapEntry_Value(), ecorePackage.getEString(), "value", null, 0, 1,
				Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(daprArchitectureEClass, DaprArchitecture.class, "DaprArchitecture", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDaprArchitecture_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				DaprArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getDaprArchitecture_Buildingblocks(), this.getBlock(), null, "buildingblocks", null, 0, -1,
				DaprArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBlock_Name(), ecorePackage.getEString(), "name", null, 0, 1, Block.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlock_Description(), ecorePackage.getEString(), "description", null, 0, 1, Block.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlock_Notes(), ecorePackage.getEString(), "notes", null, 0, 1, Block.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlock_BlockType(), this.getBlockType(), "blockType", null, 0, 1, Block.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Subblocks(), this.getBlock(), null, "subblocks", null, 0, -1, Block.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Nodes(), this.getDaprNode(), null, "nodes", null, 0, -1, Block.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(daprNodeEClass, DaprNode.class, "DaprNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDaprNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, DaprNode.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDaprNode_Description(), ecorePackage.getEString(), "description", null, 0, 1, DaprNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDaprNode_Notes(), ecorePackage.getEString(), "notes", null, 0, 1, DaprNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namespaceEClass, Namespace.class, "Namespace", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamespace_Name(), ecorePackage.getEString(), "name", null, 0, 1, Namespace.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trustdomainEClass, Trustdomain.class, "Trustdomain", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrustdomain_Name(), ecorePackage.getEString(), "name", null, 0, 1, Trustdomain.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(appEClass, App.class, "App", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApp_AppId(), ecorePackage.getEString(), "appId", null, 0, 1, App.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApp_Repository(), ecorePackage.getEString(), "repository", null, 0, 1, App.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApp_SdkLanguage(), this.getSDKLanguage(), "sdkLanguage", null, 0, 1, App.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApp_Namespace(), this.getNamespace(), null, "namespace", null, 0, 1, App.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getApp_TrustDomain(), this.getTrustdomain(), null, "trustDomain", null, 0, 1, App.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApp_Configurations(), this.getAppConfiguration(), null, "configurations", null, 0, -1,
				App.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(appConfigurationEClass, AppConfiguration.class, "AppConfiguration", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAppConfiguration_ApiVersion(), ecorePackage.getEString(), "apiVersion", "dapr.io/v1alpha1", 0,
				1, AppConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppConfiguration_Kind(), ecorePackage.getEString(), "kind", "Configuration", 0, 1,
				AppConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(deniedComponentsConfigurationEClass, DeniedComponentsConfiguration.class,
				"DeniedComponentsConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeniedComponentsConfiguration_DeniedComponents(), this.getComponent(), null,
				"deniedComponents", null, 0, -1, DeniedComponentsConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loggingConfigurationEClass, LoggingConfiguration.class, "LoggingConfiguration", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLoggingConfiguration_Enabled(), ecorePackage.getEBoolean(), "enabled", "true", 0, 1,
				LoggingConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoggingConfiguration_ObfuscateURLs(), ecorePackage.getEBoolean(), "obfuscateURLs", "false", 0,
				1, LoggingConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoggingConfiguration_OmitHealthChecks(), ecorePackage.getEBoolean(), "omitHealthChecks",
				"true", 0, 1, LoggingConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameResolutionConfigurationEClass, NameResolutionConfiguration.class, "NameResolutionConfiguration",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNameResolutionConfiguration_Component(), this.getComponent(), null, "component", null, 0, 1,
				NameResolutionConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNameResolutionConfiguration_ComponentVersion(), ecorePackage.getEString(), "componentVersion",
				null, 0, 1, NameResolutionConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNameResolutionConfiguration_ConfigurationKey(), ecorePackage.getEString(), "configurationKey",
				null, 0, 1, NameResolutionConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNameResolutionConfiguration_ConfigurationValue(), ecorePackage.getEString(),
				"configurationValue", null, 0, 1, NameResolutionConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(secretsAccessConfigurationEClass, SecretsAccessConfiguration.class, "SecretsAccessConfiguration",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecretsAccessConfiguration_AccessList(), this.getSecretsAccessList(), null, "accessList",
				null, 0, -1, SecretsAccessConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(secretsAccessListEClass, SecretsAccessList.class, "SecretsAccessList", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecretsAccessList_Component(), this.getComponent(), null, "component", null, 0, 1,
				SecretsAccessList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecretsAccessList_DefaultAccess(), ecorePackage.getEBoolean(), "defaultAccess", "true", 0, 1,
				SecretsAccessList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecretsAccessList_Secrets(), ecorePackage.getEString(), "secrets", null, 0, -1,
				SecretsAccessList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecretsAccessList_Action(), this.getAccessAction(), "action", null, 0, 1,
				SecretsAccessList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(metricsConfigurationEClass, MetricsConfiguration.class, "MetricsConfiguration", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetricsConfiguration_Enabled(), ecorePackage.getEBoolean(), "enabled", null, 0, 1,
				MetricsConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetricsConfiguration_LatencyDistributionBuckets(), ecorePackage.getEInt(),
				"latencyDistributionBuckets", null, 0, -1, MetricsConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetricsConfiguration_Http_increasedCardinality(), ecorePackage.getEBoolean(),
				"http_increasedCardinality", null, 0, 1, MetricsConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetricsConfiguration_Http_pathMatching(), ecorePackage.getEString(), "http_pathMatching",
				null, 0, -1, MetricsConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetricsConfiguration_Http_excludeVerbs(), ecorePackage.getEBoolean(), "http_excludeVerbs",
				null, 0, 1, MetricsConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apiAccessControlEClass, APIAccessControl.class, "APIAccessControl", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPIAccessControl_ApiList(), this.getAPI(), null, "apiList", null, 0, -1,
				APIAccessControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apiEClass, daprdesigner.API.class, "API", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPI_Component(), this.getComponent(), null, "component", null, 0, 1, daprdesigner.API.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAPI_Api_version(), ecorePackage.getEString(), "api_version", null, 0, 1,
				daprdesigner.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAPI_Protocol(), this.getProtocol(), "protocol", null, 0, 1, daprdesigner.API.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAPI_Access(), this.getAccessAction(), "access", null, 0, 1, daprdesigner.API.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(appAccessControlEClass, AppAccessControl.class, "AppAccessControl", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAppAccessControl_DefaultAction(), this.getAccessAction(), "defaultAction", null, 0, 1,
				AppAccessControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getAppAccessControl_TrustDomain(), this.getTrustdomain(), null, "trustDomain", null, 0, 1,
				AppAccessControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppAccessControl_Policies(), this.getAppPolicy(), null, "policies", null, 0, -1,
				AppAccessControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(appPolicyEClass, AppPolicy.class, "AppPolicy", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAppPolicy_App(), this.getApp(), null, "app", null, 0, 1, AppPolicy.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getAppPolicy_DefaultAction(), this.getAccessAction(), "defaultAction", null, 0, 1,
				AppPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getAppPolicy_TrustDomain(), this.getTrustdomain(), null, "trustDomain", null, 0, 1,
				AppPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppPolicy_Namespace(), this.getNamespace(), null, "namespace", null, 0, 1, AppPolicy.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppPolicy_Operations(), this.getOperation(), null, "operations", null, 0, -1, AppPolicy.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperation_Protocol(), this.getProtocol(), "protocol", null, 0, 1, Operation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_OperationName(), ecorePackage.getEString(), "operationName", null, 0, 1,
				Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Verbs(), this.getVerb(), "verbs", null, 0, -1, Operation.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Action(), this.getAccessAction(), "action", null, 0, 1, Operation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(middlewareConfigurationEClass, MiddlewareConfiguration.class, "MiddlewareConfiguration",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMiddlewareConfiguration_HttpHandlers(), this.getHttpHandler(), null, "httpHandlers", null, 0,
				-1, MiddlewareConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(httpHandlerEClass, HttpHandler.class, "HttpHandler", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHttpHandler_HandlerName(), ecorePackage.getEString(), "handlerName", null, 0, 1,
				HttpHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getHttpHandler_Type(), ecorePackage.getEString(), "type", null, 0, 1, HttpHandler.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHttpHandler_HandlerType(), this.getHttpHandlerType(), "handlerType", null, 0, 1,
				HttpHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getHttpHandler_Name(), ecorePackage.getEString(), "name", null, 0, 1, HttpHandler.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracingConfigurationEClass, TracingConfiguration.class, "TracingConfiguration", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTracingConfiguration_SamplingRate(), ecorePackage.getEString(), "samplingRate", null, 0, 1,
				TracingConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTracingConfiguration_Stdout(), ecorePackage.getEBoolean(), "stdout", null, 0, 1,
				TracingConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTracingConfiguration_Otel_endPointAddress(), ecorePackage.getEString(),
				"otel_endPointAddress", null, 0, 1, TracingConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTracingConfiguration_Otel_isSecure(), ecorePackage.getEBoolean(), "otel_isSecure", null, 0, 1,
				TracingConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTracingConfiguration_Otel_protocol(), ecorePackage.getEString(), "otel_protocol", null, 0, 1,
				TracingConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTracingConfiguration_Zipkin_endPointAddress(), ecorePackage.getEString(),
				"zipkin_endPointAddress", null, 0, 1, TracingConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subscriptionConfigurationEClass, SubscriptionConfiguration.class, "SubscriptionConfiguration",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubscriptionConfiguration_ApiVersion(), ecorePackage.getEString(), "apiVersion",
				"dapr.io/v2alpha1", 0, 1, SubscriptionConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubscriptionConfiguration_Kind(), ecorePackage.getEString(), "kind", "Subscription", 0, 1,
				SubscriptionConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubscriptionConfiguration_TopicName(), ecorePackage.getEString(), "topicName", null, 0, 1,
				SubscriptionConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubscriptionConfiguration_RouteRules(), this.getRouteRules(), null, "routeRules", null, 0, -1,
				SubscriptionConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubscriptionConfiguration_Pubsub(), this.getComponent(), null, "pubsub", null, 0, 1,
				SubscriptionConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubscriptionConfiguration_DeadLetterTopic(), ecorePackage.getEString(), "deadLetterTopic",
				null, 0, 1, SubscriptionConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubscriptionConfiguration_BulkSubscribe_enabled(), ecorePackage.getEBoolean(),
				"bulkSubscribe_enabled", null, 0, 1, SubscriptionConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubscriptionConfiguration_BulkSubscribe_maxMessagesCount(), ecorePackage.getEString(),
				"bulkSubscribe_maxMessagesCount", null, 0, 1, SubscriptionConfiguration.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubscriptionConfiguration_BulkSubscribe_maxAwaitDurationMs(), ecorePackage.getEString(),
				"bulkSubscribe_maxAwaitDurationMs", null, 0, 1, SubscriptionConfiguration.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubscriptionConfiguration_Scopes(), this.getApp(), null, "scopes", null, 0, -1,
				SubscriptionConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubscriptionConfiguration_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				SubscriptionConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(routeRulesEClass, RouteRules.class, "RouteRules", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRouteRules_Match(), ecorePackage.getEString(), "match", null, 0, 1, RouteRules.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRouteRules_Path(), ecorePackage.getEString(), "path", null, 0, 1, RouteRules.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resiliencyConfigurationEClass, ResiliencyConfiguration.class, "ResiliencyConfiguration",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResiliencyConfiguration_ApiVersion(), ecorePackage.getEString(), "apiVersion",
				"dapr.io/v2alpha1", 0, 1, ResiliencyConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResiliencyConfiguration_Kind(), ecorePackage.getEString(), "kind", "Resiliency", 0, 1,
				ResiliencyConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResiliencyConfiguration_Version(), ecorePackage.getEString(), "version", "v1alpha1", 0, 1,
				ResiliencyConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResiliencyConfiguration_Scopes(), this.getApp(), null, "scopes", null, 0, -1,
				ResiliencyConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResiliencyConfiguration_Policy(), this.getResiliencyPolicy(), null, "policy", null, 0, 1,
				ResiliencyConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResiliencyConfiguration_Targets(), this.getResiliencyTarget(), null, "targets", null, 0, -1,
				ResiliencyConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResiliencyConfiguration_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				ResiliencyConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resiliencyPolicyEClass, ResiliencyPolicy.class, "ResiliencyPolicy", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResiliencyPolicy_Retries(), this.getRetryPolicy(), null, "retries", null, 0, -1,
				ResiliencyPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResiliencyPolicy_Circuitbreakers(), this.getCircuitBreakerPolicy(), null, "circuitbreakers",
				null, 0, -1, ResiliencyPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResiliencyPolicy_TimeoutDefinitions(), this.getResiliencyTimeout(), null,
				"timeoutDefinitions", null, 0, -1, ResiliencyPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(retryPolicyEClass, RetryPolicy.class, "RetryPolicy", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRetryPolicy_Policy_type(), this.getRetryPolicyType(), "policy_type", null, 0, 1,
				RetryPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRetryPolicy_Duration(), ecorePackage.getEInt(), "duration", null, 0, 1, RetryPolicy.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRetryPolicy_MaxRetries(), ecorePackage.getEInt(), "maxRetries", null, 0, 1, RetryPolicy.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRetryPolicy_MaxInterval(), ecorePackage.getEInt(), "maxInterval", null, 0, 1,
				RetryPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRetryPolicy_Name(), ecorePackage.getEString(), "name", null, 0, 1, RetryPolicy.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resiliencyTimeoutEClass, ResiliencyTimeout.class, "ResiliencyTimeout", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResiliencyTimeout_TimeOutinSeconds(), ecorePackage.getEInt(), "timeOutinSeconds", null, 0, 1,
				ResiliencyTimeout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getResiliencyTimeout_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				ResiliencyTimeout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(circuitBreakerPolicyEClass, CircuitBreakerPolicy.class, "CircuitBreakerPolicy", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCircuitBreakerPolicy_MaxRequests(), ecorePackage.getEInt(), "maxRequests", null, 0, 1,
				CircuitBreakerPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCircuitBreakerPolicy_Interval(), ecorePackage.getEInt(), "interval", null, 0, 1,
				CircuitBreakerPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCircuitBreakerPolicy_Timeout(), ecorePackage.getEInt(), "timeout", null, 0, 1,
				CircuitBreakerPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCircuitBreakerPolicy_Trip(), ecorePackage.getEString(), "trip", "consecutiveFailures > 5", 0,
				1, CircuitBreakerPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCircuitBreakerPolicy_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				CircuitBreakerPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resiliencyTargetEClass, ResiliencyTarget.class, "ResiliencyTarget", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResiliencyTarget_Type(), this.getResiliencyTargetType(), "type", null, 0, 1,
				ResiliencyTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getResiliencyTarget_CircuitBreaker(), this.getCircuitBreakerPolicy(), null, "circuitBreaker",
				null, 0, 1, ResiliencyTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResiliencyTarget_Retry(), this.getRetryPolicy(), null, "retry", null, 0, 1,
				ResiliencyTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResiliencyTarget_CircuitBreakerCacheSize(), ecorePackage.getEInt(), "circuitBreakerCacheSize",
				null, 0, 1, ResiliencyTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResiliencyTarget_Timeout(), this.getResiliencyTimeout(), null, "timeout", null, 0, 1,
				ResiliencyTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResiliencyTarget_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				ResiliencyTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(httpEndPointEClass, HTTPEndPoint.class, "HTTPEndPoint", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHTTPEndPoint_ApiVersion(), ecorePackage.getEString(), "apiVersion", "dapr.io/v1alpha1", 0, 1,
				HTTPEndPoint.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getHTTPEndPoint_Kind(), ecorePackage.getEString(), "kind", "HTTPEndpoint", 0, 1,
				HTTPEndPoint.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getHTTPEndPoint_Auth(), this.getSecretStore(), null, "auth", null, 0, 1, HTTPEndPoint.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHTTPEndPoint_BaseUrl(), ecorePackage.getEString(), "baseUrl", null, 0, 1, HTTPEndPoint.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHTTPEndPoint_Scopes(), this.getApp(), null, "scopes", null, 0, -1, HTTPEndPoint.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHTTPEndPoint_Headers(), this.getSpecMetadata(), null, "headers", null, 0, -1,
				HTTPEndPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHTTPEndPoint_ClientTLS_rootCA(), this.getSpecMetadata(), null, "clientTLS_rootCA", null, 0, 1,
				HTTPEndPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHTTPEndPoint_ClientTLS_certificate(), this.getSpecMetadata(), null, "clientTLS_certificate",
				null, 0, 1, HTTPEndPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHTTPEndPoint_ClientTLS_privateKey(), this.getSpecMetadata(), null, "clientTLS_privateKey",
				null, 0, 1, HTTPEndPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponent_ApiVersion(), ecorePackage.getEString(), "apiVersion", "dapr.io/v1alpha1", 0, 1,
				Component.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Kind(), ecorePackage.getEString(), "kind", "Component", 0, 1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getComponent_Auth(), this.getSecretStore(), null, "auth", null, 0, 1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Metadata_namespace(), this.getNamespace(), null, "metadata_namespace", null, 0, 1,
				Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Spec(), this.getComponentSpec(), null, "spec", null, 0, 1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Scopes(), this.getApp(), null, "scopes", null, 0, -1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentSpecEClass, ComponentSpec.class, "ComponentSpec", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentSpec_IgnoreErrors(), ecorePackage.getEBoolean(), "ignoreErrors", null, 0, 1,
				ComponentSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentSpec_InitTimeout(), ecorePackage.getEString(), "initTimeout", null, 0, 1,
				ComponentSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getComponentSpec_Spec_metadata(), this.getSpecMetadata(), null, "spec_metadata", null, 0, -1,
				ComponentSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specMetadataEClass, SpecMetadata.class, "SpecMetadata", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpecMetadata_Value(), ecorePackage.getEString(), "value", null, 0, 1, SpecMetadata.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecMetadata_IsFetchedFromSecret(), ecorePackage.getEBoolean(), "isFetchedFromSecret",
				"false", 0, 1, SpecMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecMetadata_IsFetchedFromEnvironment(), ecorePackage.getEBoolean(),
				"isFetchedFromEnvironment", "false", 0, 1, SpecMetadata.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecMetadata_SecretKeyRefName(), ecorePackage.getEString(), "secretKeyRefName", null, 0, 1,
				SpecMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecMetadata_SecretKeyRefKey(), ecorePackage.getEString(), "secretKeyRefKey", null, 0, 1,
				SpecMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecMetadata_EnvRef(), ecorePackage.getEString(), "envRef", null, 0, 1, SpecMetadata.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecMetadata_Name(), ecorePackage.getEString(), "name", null, 0, 1, SpecMetadata.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(secretStoreEClass, SecretStore.class, "SecretStore", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(hashicorpVaultEClass, HashicorpVault.class, "HashicorpVault", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHashicorpVault_Spec_type(), ecorePackage.getEString(), "spec_type",
				"secretstores.aws.parameterstore", 0, 1, HashicorpVault.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHashicorpVault_Spec_version(), ecorePackage.getEString(), "spec_version", "v1", 0, 1,
				HashicorpVault.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(messageBrokerEClass, MessageBroker.class, "MessageBroker", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(accessActionEEnum, AccessAction.class, "AccessAction");
		addEEnumLiteral(accessActionEEnum, AccessAction.ALLOW);
		addEEnumLiteral(accessActionEEnum, AccessAction.DENY);

		initEEnum(retryPolicyTypeEEnum, RetryPolicyType.class, "RetryPolicyType");
		addEEnumLiteral(retryPolicyTypeEEnum, RetryPolicyType.CONSTANT);
		addEEnumLiteral(retryPolicyTypeEEnum, RetryPolicyType.EXPONENTIAL);

		initEEnum(httpHandlerTypeEEnum, HttpHandlerType.class, "HttpHandlerType");
		addEEnumLiteral(httpHandlerTypeEEnum, HttpHandlerType.INCOMING);
		addEEnumLiteral(httpHandlerTypeEEnum, HttpHandlerType.OUTGOING);

		initEEnum(resiliencyTargetTypeEEnum, ResiliencyTargetType.class, "ResiliencyTargetType");
		addEEnumLiteral(resiliencyTargetTypeEEnum, ResiliencyTargetType.APP);
		addEEnumLiteral(resiliencyTargetTypeEEnum, ResiliencyTargetType.ACTOR);
		addEEnumLiteral(resiliencyTargetTypeEEnum, ResiliencyTargetType.COMPONENT_INBOUND);
		addEEnumLiteral(resiliencyTargetTypeEEnum, ResiliencyTargetType.COMPONENT_OUTBOUND);

		initEEnum(blockTypeEEnum, BlockType.class, "BlockType");
		addEEnumLiteral(blockTypeEEnum, BlockType.ENVIRONMENT);
		addEEnumLiteral(blockTypeEEnum, BlockType.MICROSERVICES);
		addEEnumLiteral(blockTypeEEnum, BlockType.PUBSUB);
		addEEnumLiteral(blockTypeEEnum, BlockType.SECRETSTORE);
		addEEnumLiteral(blockTypeEEnum, BlockType.BINDINGS);
		addEEnumLiteral(blockTypeEEnum, BlockType.JOBS);
		addEEnumLiteral(blockTypeEEnum, BlockType.WORKFLOW);
		addEEnumLiteral(blockTypeEEnum, BlockType.ACTORS);
		addEEnumLiteral(blockTypeEEnum, BlockType.STATESTORE);
		addEEnumLiteral(blockTypeEEnum, BlockType.DISTRIBUTEDLOCK);
		addEEnumLiteral(blockTypeEEnum, BlockType.CRYPTOGRAPHY);
		addEEnumLiteral(blockTypeEEnum, BlockType.CONFIGURATION);
		addEEnumLiteral(blockTypeEEnum, BlockType.CONFIGURATIONGROUP);

		initEEnum(sdkLanguageEEnum, SDKLanguage.class, "SDKLanguage");
		addEEnumLiteral(sdkLanguageEEnum, SDKLanguage.JAVA);
		addEEnumLiteral(sdkLanguageEEnum, SDKLanguage.CSHARP);
		addEEnumLiteral(sdkLanguageEEnum, SDKLanguage.PYTHON);
		addEEnumLiteral(sdkLanguageEEnum, SDKLanguage.NODE);
		addEEnumLiteral(sdkLanguageEEnum, SDKLanguage.RUST);

		initEEnum(protocolEEnum, Protocol.class, "Protocol");
		addEEnumLiteral(protocolEEnum, Protocol.HTTP);
		addEEnumLiteral(protocolEEnum, Protocol.GRPC);

		initEEnum(verbEEnum, Verb.class, "Verb");
		addEEnumLiteral(verbEEnum, Verb.GET);
		addEEnumLiteral(verbEEnum, Verb.POST);
		addEEnumLiteral(verbEEnum, Verb.PUT);
		addEEnumLiteral(verbEEnum, Verb.DELETE);
		addEEnumLiteral(verbEEnum, Verb.PATCH);

		// Create resource
		createResource(eNS_URI);
	}

} //DaprdesignerPackageImpl
