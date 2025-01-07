/**
 */
package daprdesigner;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see daprdesigner.DaprdesignerFactory
 * @model kind="package"
 * @generated
 */
public interface DaprdesignerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "daprdesigner";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://dapr.io/daprtools/daprdesigner";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "daprdesigner";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DaprdesignerPackage eINSTANCE = daprdesigner.impl.DaprdesignerPackageImpl.init();

	/**
	 * The meta object id for the '{@link daprdesigner.impl.EStringToStringMapEntryImpl <em>EString To String Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.EStringToStringMapEntryImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getEStringToStringMapEntry()
	 * @generated
	 */
	int ESTRING_TO_STRING_MAP_ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_STRING_MAP_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_STRING_MAP_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>EString To String Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_STRING_MAP_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>EString To String Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_STRING_MAP_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.DaprArchitectureImpl <em>Dapr Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.DaprArchitectureImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getDaprArchitecture()
	 * @generated
	 */
	int DAPR_ARCHITECTURE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAPR_ARCHITECTURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Environments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAPR_ARCHITECTURE__ENVIRONMENTS = 1;

	/**
	 * The number of structural features of the '<em>Dapr Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAPR_ARCHITECTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dapr Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAPR_ARCHITECTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.EnvironmentImpl <em>Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.EnvironmentImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getEnvironment()
	 * @generated
	 */
	int ENVIRONMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__NAMESPACE = 1;

	/**
	 * The feature id for the '<em><b>Trustdomain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__TRUSTDOMAIN = 2;

	/**
	 * The feature id for the '<em><b>Buildingblocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__BUILDINGBLOCKS = 3;

	/**
	 * The number of structural features of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.NamespaceImpl <em>Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.NamespaceImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getNamespace()
	 * @generated
	 */
	int NAMESPACE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.TrustdomainImpl <em>Trustdomain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.TrustdomainImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getTrustdomain()
	 * @generated
	 */
	int TRUSTDOMAIN = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTDOMAIN__NAME = 0;

	/**
	 * The number of structural features of the '<em>Trustdomain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTDOMAIN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Trustdomain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTDOMAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.BuildingBlockImpl <em>Building Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.BuildingBlockImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getBuildingBlock()
	 * @generated
	 */
	int BUILDING_BLOCK = 5;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_BLOCK__NAMESPACE = 0;

	/**
	 * The feature id for the '<em><b>Trust Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_BLOCK__TRUST_DOMAIN = 1;

	/**
	 * The number of structural features of the '<em>Building Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_BLOCK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Building Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.ServicesImpl <em>Services</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.ServicesImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getServices()
	 * @generated
	 */
	int SERVICES = 6;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES__NAMESPACE = BUILDING_BLOCK__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Trust Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES__TRUST_DOMAIN = BUILDING_BLOCK__TRUST_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES__NAME = BUILDING_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Apps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES__APPS = BUILDING_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES_FEATURE_COUNT = BUILDING_BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES_OPERATION_COUNT = BUILDING_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.AppImpl <em>App</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.AppImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getApp()
	 * @generated
	 */
	int APP = 7;

	/**
	 * The feature id for the '<em><b>App Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__APP_ID = 0;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__NAMESPACE = 1;

	/**
	 * The feature id for the '<em><b>Trust Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__TRUST_DOMAIN = 2;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__CONFIGURATION = 3;

	/**
	 * The number of structural features of the '<em>App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.AppConfigurationImpl <em>App Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.AppConfigurationImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getAppConfiguration()
	 * @generated
	 */
	int APP_CONFIGURATION = 8;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_CONFIGURATION__API_VERSION = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_CONFIGURATION__KIND = 1;

	/**
	 * The feature id for the '<em><b>Metadata name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_CONFIGURATION__METADATA_NAME = 2;

	/**
	 * The feature id for the '<em><b>Metadata namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_CONFIGURATION__METADATA_NAMESPACE = 3;

	/**
	 * The feature id for the '<em><b>Access Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_CONFIGURATION__ACCESS_CONTROL = 4;

	/**
	 * The feature id for the '<em><b>Api Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_CONFIGURATION__API_CONTROL = 5;

	/**
	 * The feature id for the '<em><b>Middleware Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_CONFIGURATION__MIDDLEWARE_CONFIGURATION = 6;

	/**
	 * The feature id for the '<em><b>Logging Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_CONFIGURATION__LOGGING_CONFIGURATION = 7;

	/**
	 * The feature id for the '<em><b>Name Resolution Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_CONFIGURATION__NAME_RESOLUTION_CONFIGURATION = 8;

	/**
	 * The feature id for the '<em><b>Secrets Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_CONFIGURATION__SECRETS_CONFIGURATION = 9;

	/**
	 * The feature id for the '<em><b>Metrics Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_CONFIGURATION__METRICS_CONFIGURATION = 10;

	/**
	 * The feature id for the '<em><b>Tracing Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_CONFIGURATION__TRACING_CONFIGURATION = 11;

	/**
	 * The feature id for the '<em><b>Components Deny List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_CONFIGURATION__COMPONENTS_DENY_LIST = 12;

	/**
	 * The number of structural features of the '<em>App Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_CONFIGURATION_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>App Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.LoggingConfigurationImpl <em>Logging Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.LoggingConfigurationImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getLoggingConfiguration()
	 * @generated
	 */
	int LOGGING_CONFIGURATION = 9;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGING_CONFIGURATION__ENABLED = 0;

	/**
	 * The feature id for the '<em><b>Obfuscate UR Ls</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGING_CONFIGURATION__OBFUSCATE_UR_LS = 1;

	/**
	 * The feature id for the '<em><b>Omit Health Checks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGING_CONFIGURATION__OMIT_HEALTH_CHECKS = 2;

	/**
	 * The number of structural features of the '<em>Logging Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGING_CONFIGURATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Logging Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGING_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.NameResolutionConfigurationImpl <em>Name Resolution Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.NameResolutionConfigurationImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getNameResolutionConfiguration()
	 * @generated
	 */
	int NAME_RESOLUTION_CONFIGURATION = 10;

	/**
	 * The feature id for the '<em><b>Component Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_RESOLUTION_CONFIGURATION__COMPONENT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_RESOLUTION_CONFIGURATION__COMPONENT_VERSION = 1;

	/**
	 * The feature id for the '<em><b>Configuration Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_RESOLUTION_CONFIGURATION__CONFIGURATION_KEY = 2;

	/**
	 * The feature id for the '<em><b>Configuration Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_RESOLUTION_CONFIGURATION__CONFIGURATION_VALUE = 3;

	/**
	 * The number of structural features of the '<em>Name Resolution Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_RESOLUTION_CONFIGURATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Name Resolution Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_RESOLUTION_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.SecretsConfigurationImpl <em>Secrets Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.SecretsConfigurationImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getSecretsConfiguration()
	 * @generated
	 */
	int SECRETS_CONFIGURATION = 11;

	/**
	 * The feature id for the '<em><b>Allowed List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS_CONFIGURATION__ALLOWED_LIST = 0;

	/**
	 * The feature id for the '<em><b>Denied List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS_CONFIGURATION__DENIED_LIST = 1;

	/**
	 * The number of structural features of the '<em>Secrets Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS_CONFIGURATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Secrets Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.SecretsListImpl <em>Secrets List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.SecretsListImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getSecretsList()
	 * @generated
	 */
	int SECRETS_LIST = 12;

	/**
	 * The feature id for the '<em><b>Store Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS_LIST__STORE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Default Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS_LIST__DEFAULT_ACCESS = 1;

	/**
	 * The feature id for the '<em><b>Secrets</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS_LIST__SECRETS = 2;

	/**
	 * The number of structural features of the '<em>Secrets List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS_LIST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Secrets List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.MetricsConfigurationImpl <em>Metrics Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.MetricsConfigurationImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getMetricsConfiguration()
	 * @generated
	 */
	int METRICS_CONFIGURATION = 13;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRICS_CONFIGURATION__ENABLED = 0;

	/**
	 * The feature id for the '<em><b>Latency Distribution Buckets</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRICS_CONFIGURATION__LATENCY_DISTRIBUTION_BUCKETS = 1;

	/**
	 * The feature id for the '<em><b>Http increased Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRICS_CONFIGURATION__HTTP_INCREASED_CARDINALITY = 2;

	/**
	 * The feature id for the '<em><b>Http path Matching</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRICS_CONFIGURATION__HTTP_PATH_MATCHING = 3;

	/**
	 * The feature id for the '<em><b>Http exclude Verbs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRICS_CONFIGURATION__HTTP_EXCLUDE_VERBS = 4;

	/**
	 * The number of structural features of the '<em>Metrics Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRICS_CONFIGURATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Metrics Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRICS_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.APIAccessControlImpl <em>API Access Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.APIAccessControlImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getAPIAccessControl()
	 * @generated
	 */
	int API_ACCESS_CONTROL = 14;

	/**
	 * The feature id for the '<em><b>Allowed AP Is</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_ACCESS_CONTROL__ALLOWED_AP_IS = 0;

	/**
	 * The feature id for the '<em><b>Denied AP Is</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_ACCESS_CONTROL__DENIED_AP_IS = 1;

	/**
	 * The number of structural features of the '<em>API Access Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_ACCESS_CONTROL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>API Access Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_ACCESS_CONTROL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.APIImpl <em>API</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.APIImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getAPI()
	 * @generated
	 */
	int API = 15;

	/**
	 * The feature id for the '<em><b>Api name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__API_NAME = 0;

	/**
	 * The feature id for the '<em><b>Api version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__API_VERSION = 1;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__PROTOCOL = 2;

	/**
	 * The number of structural features of the '<em>API</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>API</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.AppAccessControlImpl <em>App Access Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.AppAccessControlImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getAppAccessControl()
	 * @generated
	 */
	int APP_ACCESS_CONTROL = 16;

	/**
	 * The feature id for the '<em><b>Default Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_ACCESS_CONTROL__DEFAULT_ACTION = 0;

	/**
	 * The feature id for the '<em><b>Trust Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_ACCESS_CONTROL__TRUST_DOMAIN = 1;

	/**
	 * The feature id for the '<em><b>Policies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_ACCESS_CONTROL__POLICIES = 2;

	/**
	 * The number of structural features of the '<em>App Access Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_ACCESS_CONTROL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>App Access Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_ACCESS_CONTROL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.AppPolicyImpl <em>App Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.AppPolicyImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getAppPolicy()
	 * @generated
	 */
	int APP_POLICY = 17;

	/**
	 * The feature id for the '<em><b>App</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_POLICY__APP = 0;

	/**
	 * The feature id for the '<em><b>Default Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_POLICY__DEFAULT_ACTION = 1;

	/**
	 * The feature id for the '<em><b>Trust Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_POLICY__TRUST_DOMAIN = 2;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_POLICY__NAMESPACE = 3;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_POLICY__OPERATIONS = 4;

	/**
	 * The number of structural features of the '<em>App Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_POLICY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>App Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_POLICY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.OperationImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 18;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PROTOCOL = 0;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OPERATION_NAME = 1;

	/**
	 * The feature id for the '<em><b>Verbs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__VERBS = 2;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ACTION = 3;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.MiddlewareConfigurationImpl <em>Middleware Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.MiddlewareConfigurationImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getMiddlewareConfiguration()
	 * @generated
	 */
	int MIDDLEWARE_CONFIGURATION = 19;

	/**
	 * The feature id for the '<em><b>Incoming Handler</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE_CONFIGURATION__INCOMING_HANDLER = 0;

	/**
	 * The feature id for the '<em><b>Outgoing Handler</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE_CONFIGURATION__OUTGOING_HANDLER = 1;

	/**
	 * The number of structural features of the '<em>Middleware Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE_CONFIGURATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Middleware Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.HttpHandlerImpl <em>Http Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.HttpHandlerImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getHttpHandler()
	 * @generated
	 */
	int HTTP_HANDLER = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_HANDLER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_HANDLER__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Http Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_HANDLER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Http Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_HANDLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.TracingConfigurationImpl <em>Tracing Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.TracingConfigurationImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getTracingConfiguration()
	 * @generated
	 */
	int TRACING_CONFIGURATION = 21;

	/**
	 * The feature id for the '<em><b>Sampling Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_CONFIGURATION__SAMPLING_RATE = 0;

	/**
	 * The feature id for the '<em><b>Stdout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_CONFIGURATION__STDOUT = 1;

	/**
	 * The feature id for the '<em><b>Otel end Point Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_CONFIGURATION__OTEL_END_POINT_ADDRESS = 2;

	/**
	 * The feature id for the '<em><b>Otel is Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_CONFIGURATION__OTEL_IS_SECURE = 3;

	/**
	 * The feature id for the '<em><b>Otel protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_CONFIGURATION__OTEL_PROTOCOL = 4;

	/**
	 * The feature id for the '<em><b>Zipkin end Point Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_CONFIGURATION__ZIPKIN_END_POINT_ADDRESS = 5;

	/**
	 * The number of structural features of the '<em>Tracing Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_CONFIGURATION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Tracing Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.SubscriptionConfigurationImpl <em>Subscription Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.SubscriptionConfigurationImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getSubscriptionConfiguration()
	 * @generated
	 */
	int SUBSCRIPTION_CONFIGURATION = 22;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_CONFIGURATION__API_VERSION = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_CONFIGURATION__KIND = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_CONFIGURATION__NAME = 2;

	/**
	 * The feature id for the '<em><b>Topic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_CONFIGURATION__TOPIC_NAME = 3;

	/**
	 * The feature id for the '<em><b>Route Rules</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_CONFIGURATION__ROUTE_RULES = 4;

	/**
	 * The feature id for the '<em><b>Pubsubname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_CONFIGURATION__PUBSUBNAME = 5;

	/**
	 * The feature id for the '<em><b>Dead Letter Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_CONFIGURATION__DEAD_LETTER_TOPIC = 6;

	/**
	 * The feature id for the '<em><b>Bulk Subscribe enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_CONFIGURATION__BULK_SUBSCRIBE_ENABLED = 7;

	/**
	 * The feature id for the '<em><b>Bulk Subscribe max Messages Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_CONFIGURATION__BULK_SUBSCRIBE_MAX_MESSAGES_COUNT = 8;

	/**
	 * The feature id for the '<em><b>Bulk Subscribe max Await Duration Ms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_CONFIGURATION__BULK_SUBSCRIBE_MAX_AWAIT_DURATION_MS = 9;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_CONFIGURATION__SCOPES = 10;

	/**
	 * The number of structural features of the '<em>Subscription Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_CONFIGURATION_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Subscription Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.RouteRulesImpl <em>Route Rules</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.RouteRulesImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getRouteRules()
	 * @generated
	 */
	int ROUTE_RULES = 23;

	/**
	 * The feature id for the '<em><b>Match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_RULES__MATCH = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_RULES__PATH = 1;

	/**
	 * The number of structural features of the '<em>Route Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_RULES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Route Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_RULES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.ResiliencyConfigurationImpl <em>Resiliency Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.ResiliencyConfigurationImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getResiliencyConfiguration()
	 * @generated
	 */
	int RESILIENCY_CONFIGURATION = 24;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_CONFIGURATION__API_VERSION = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_CONFIGURATION__KIND = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_CONFIGURATION__NAME = 2;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_CONFIGURATION__SCOPES = 3;

	/**
	 * The feature id for the '<em><b>Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_CONFIGURATION__POLICY = 4;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_CONFIGURATION__TARGETS = 5;

	/**
	 * The number of structural features of the '<em>Resiliency Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_CONFIGURATION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Resiliency Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.ResiliencyPolicyImpl <em>Resiliency Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.ResiliencyPolicyImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getResiliencyPolicy()
	 * @generated
	 */
	int RESILIENCY_POLICY = 25;

	/**
	 * The feature id for the '<em><b>Retries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_POLICY__RETRIES = 0;

	/**
	 * The feature id for the '<em><b>Circuitbreakers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_POLICY__CIRCUITBREAKERS = 1;

	/**
	 * The feature id for the '<em><b>Timeouts</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_POLICY__TIMEOUTS = 2;

	/**
	 * The number of structural features of the '<em>Resiliency Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_POLICY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Resiliency Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_POLICY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.ResiliencyTimeoutImpl <em>Resiliency Timeout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.ResiliencyTimeoutImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getResiliencyTimeout()
	 * @generated
	 */
	int RESILIENCY_TIMEOUT = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_TIMEOUT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_TIMEOUT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Resiliency Timeout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_TIMEOUT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Resiliency Timeout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_TIMEOUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.RetryPolicyImpl <em>Retry Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.RetryPolicyImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getRetryPolicy()
	 * @generated
	 */
	int RETRY_POLICY = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_POLICY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Policy type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_POLICY__POLICY_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_POLICY__DURATION = 2;

	/**
	 * The feature id for the '<em><b>Max Retries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_POLICY__MAX_RETRIES = 3;

	/**
	 * The number of structural features of the '<em>Retry Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_POLICY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Retry Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_POLICY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.CircuitBreakerPolicyImpl <em>Circuit Breaker Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.CircuitBreakerPolicyImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getCircuitBreakerPolicy()
	 * @generated
	 */
	int CIRCUIT_BREAKER_POLICY = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BREAKER_POLICY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Max Requests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BREAKER_POLICY__MAX_REQUESTS = 1;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BREAKER_POLICY__INTERVAL = 2;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BREAKER_POLICY__TIMEOUT = 3;

	/**
	 * The feature id for the '<em><b>Trip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BREAKER_POLICY__TRIP = 4;

	/**
	 * The number of structural features of the '<em>Circuit Breaker Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BREAKER_POLICY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Circuit Breaker Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BREAKER_POLICY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.ResiliencyTargetImpl <em>Resiliency Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.ResiliencyTargetImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getResiliencyTarget()
	 * @generated
	 */
	int RESILIENCY_TARGET = 29;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_TARGET__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_TARGET__NAME = 1;

	/**
	 * The feature id for the '<em><b>Circuit Breaker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_TARGET__CIRCUIT_BREAKER = 2;

	/**
	 * The feature id for the '<em><b>Retry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_TARGET__RETRY = 3;

	/**
	 * The feature id for the '<em><b>Circuit Breaker Cache Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_TARGET__CIRCUIT_BREAKER_CACHE_SIZE = 4;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_TARGET__TIMEOUT = 5;

	/**
	 * The number of structural features of the '<em>Resiliency Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_TARGET_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Resiliency Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_TARGET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.HTTPEndPointImpl <em>HTTP End Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.HTTPEndPointImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getHTTPEndPoint()
	 * @generated
	 */
	int HTTP_END_POINT = 30;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_END_POINT__API_VERSION = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_END_POINT__KIND = 1;

	/**
	 * The feature id for the '<em><b>Auth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_END_POINT__AUTH = 2;

	/**
	 * The feature id for the '<em><b>Metadata name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_END_POINT__METADATA_NAME = 3;

	/**
	 * The feature id for the '<em><b>Base Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_END_POINT__BASE_URL = 4;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_END_POINT__SCOPES = 5;

	/**
	 * The feature id for the '<em><b>Headers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_END_POINT__HEADERS = 6;

	/**
	 * The feature id for the '<em><b>Client TLS root CA</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_END_POINT__CLIENT_TLS_ROOT_CA = 7;

	/**
	 * The feature id for the '<em><b>Client TLS certificate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_END_POINT__CLIENT_TLS_CERTIFICATE = 8;

	/**
	 * The feature id for the '<em><b>Client TLS private Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_END_POINT__CLIENT_TLS_PRIVATE_KEY = 9;

	/**
	 * The number of structural features of the '<em>HTTP End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_END_POINT_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>HTTP End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_END_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.ComponentImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 31;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__API_VERSION = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__KIND = 1;

	/**
	 * The feature id for the '<em><b>Auth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__AUTH = 2;

	/**
	 * The feature id for the '<em><b>Metadata name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__METADATA_NAME = 3;

	/**
	 * The feature id for the '<em><b>Metadata namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__METADATA_NAMESPACE = 4;

	/**
	 * The feature id for the '<em><b>Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SPEC = 5;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SCOPES = 6;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.ComponentSpecImpl <em>Component Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.ComponentSpecImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getComponentSpec()
	 * @generated
	 */
	int COMPONENT_SPEC = 32;

	/**
	 * The feature id for the '<em><b>Ignore Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SPEC__IGNORE_ERRORS = 0;

	/**
	 * The feature id for the '<em><b>Init Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SPEC__INIT_TIMEOUT = 1;

	/**
	 * The feature id for the '<em><b>Spec metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SPEC__SPEC_METADATA = 2;

	/**
	 * The number of structural features of the '<em>Component Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SPEC_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Component Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SPEC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.SpecMetadataImpl <em>Spec Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.SpecMetadataImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getSpecMetadata()
	 * @generated
	 */
	int SPEC_METADATA = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_METADATA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_METADATA__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Is Fetched From Secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_METADATA__IS_FETCHED_FROM_SECRET = 2;

	/**
	 * The feature id for the '<em><b>Is Fetched From Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_METADATA__IS_FETCHED_FROM_ENVIRONMENT = 3;

	/**
	 * The feature id for the '<em><b>Secret Key Ref Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_METADATA__SECRET_KEY_REF_NAME = 4;

	/**
	 * The feature id for the '<em><b>Secret Key Ref Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_METADATA__SECRET_KEY_REF_KEY = 5;

	/**
	 * The feature id for the '<em><b>Env Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_METADATA__ENV_REF = 6;

	/**
	 * The number of structural features of the '<em>Spec Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_METADATA_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Spec Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_METADATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.SecretStoreImpl <em>Secret Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.SecretStoreImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getSecretStore()
	 * @generated
	 */
	int SECRET_STORE = 34;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET_STORE__API_VERSION = COMPONENT__API_VERSION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET_STORE__KIND = COMPONENT__KIND;

	/**
	 * The feature id for the '<em><b>Auth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET_STORE__AUTH = COMPONENT__AUTH;

	/**
	 * The feature id for the '<em><b>Metadata name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET_STORE__METADATA_NAME = COMPONENT__METADATA_NAME;

	/**
	 * The feature id for the '<em><b>Metadata namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET_STORE__METADATA_NAMESPACE = COMPONENT__METADATA_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET_STORE__SPEC = COMPONENT__SPEC;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET_STORE__SCOPES = COMPONENT__SCOPES;

	/**
	 * The number of structural features of the '<em>Secret Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET_STORE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Secret Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET_STORE_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.HashicorpVaultImpl <em>Hashicorp Vault</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.HashicorpVaultImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getHashicorpVault()
	 * @generated
	 */
	int HASHICORP_VAULT = 35;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHICORP_VAULT__API_VERSION = SECRET_STORE__API_VERSION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHICORP_VAULT__KIND = SECRET_STORE__KIND;

	/**
	 * The feature id for the '<em><b>Auth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHICORP_VAULT__AUTH = SECRET_STORE__AUTH;

	/**
	 * The feature id for the '<em><b>Metadata name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHICORP_VAULT__METADATA_NAME = SECRET_STORE__METADATA_NAME;

	/**
	 * The feature id for the '<em><b>Metadata namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHICORP_VAULT__METADATA_NAMESPACE = SECRET_STORE__METADATA_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHICORP_VAULT__SPEC = SECRET_STORE__SPEC;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHICORP_VAULT__SCOPES = SECRET_STORE__SCOPES;

	/**
	 * The feature id for the '<em><b>Spec type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHICORP_VAULT__SPEC_TYPE = SECRET_STORE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Spec version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHICORP_VAULT__SPEC_VERSION = SECRET_STORE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hashicorp Vault</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHICORP_VAULT_FEATURE_COUNT = SECRET_STORE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Hashicorp Vault</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHICORP_VAULT_OPERATION_COUNT = SECRET_STORE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.MessageBrokerImpl <em>Message Broker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.MessageBrokerImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getMessageBroker()
	 * @generated
	 */
	int MESSAGE_BROKER = 36;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BROKER__API_VERSION = COMPONENT__API_VERSION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BROKER__KIND = COMPONENT__KIND;

	/**
	 * The feature id for the '<em><b>Auth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BROKER__AUTH = COMPONENT__AUTH;

	/**
	 * The feature id for the '<em><b>Metadata name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BROKER__METADATA_NAME = COMPONENT__METADATA_NAME;

	/**
	 * The feature id for the '<em><b>Metadata namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BROKER__METADATA_NAMESPACE = COMPONENT__METADATA_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BROKER__SPEC = COMPONENT__SPEC;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BROKER__SCOPES = COMPONENT__SCOPES;

	/**
	 * The number of structural features of the '<em>Message Broker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BROKER_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Message Broker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BROKER_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.PubSubImpl <em>Pub Sub</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.PubSubImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getPubSub()
	 * @generated
	 */
	int PUB_SUB = 37;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUB_SUB__NAMESPACE = BUILDING_BLOCK__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Trust Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUB_SUB__TRUST_DOMAIN = BUILDING_BLOCK__TRUST_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUB_SUB__NAME = BUILDING_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mbrokers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUB_SUB__MBROKERS = BUILDING_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pub Sub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUB_SUB_FEATURE_COUNT = BUILDING_BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pub Sub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUB_SUB_OPERATION_COUNT = BUILDING_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.BindingsImpl <em>Bindings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.BindingsImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getBindings()
	 * @generated
	 */
	int BINDINGS = 38;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDINGS__NAMESPACE = BUILDING_BLOCK__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Trust Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDINGS__TRUST_DOMAIN = BUILDING_BLOCK__TRUST_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDINGS__NAME = BUILDING_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>App ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDINGS__APP_ID = BUILDING_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bindings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDINGS_FEATURE_COUNT = BUILDING_BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bindings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDINGS_OPERATION_COUNT = BUILDING_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.JobsImpl <em>Jobs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.JobsImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getJobs()
	 * @generated
	 */
	int JOBS = 39;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOBS__NAMESPACE = BUILDING_BLOCK__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Trust Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOBS__TRUST_DOMAIN = BUILDING_BLOCK__TRUST_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOBS__NAME = BUILDING_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>App ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOBS__APP_ID = BUILDING_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Jobs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOBS_FEATURE_COUNT = BUILDING_BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Jobs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOBS_OPERATION_COUNT = BUILDING_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.ConfigurationImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 40;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__NAMESPACE = BUILDING_BLOCK__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Trust Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__TRUST_DOMAIN = BUILDING_BLOCK__TRUST_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__NAME = BUILDING_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>App ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__APP_ID = BUILDING_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = BUILDING_BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = BUILDING_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.WorkflowImpl <em>Workflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.WorkflowImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getWorkflow()
	 * @generated
	 */
	int WORKFLOW = 41;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__NAMESPACE = BUILDING_BLOCK__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Trust Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__TRUST_DOMAIN = BUILDING_BLOCK__TRUST_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__NAME = BUILDING_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>App ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__APP_ID = BUILDING_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_FEATURE_COUNT = BUILDING_BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_OPERATION_COUNT = BUILDING_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.ActorsImpl <em>Actors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.ActorsImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getActors()
	 * @generated
	 */
	int ACTORS = 42;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTORS__NAMESPACE = BUILDING_BLOCK__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Trust Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTORS__TRUST_DOMAIN = BUILDING_BLOCK__TRUST_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTORS__NAME = BUILDING_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>App ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTORS__APP_ID = BUILDING_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Actors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTORS_FEATURE_COUNT = BUILDING_BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Actors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTORS_OPERATION_COUNT = BUILDING_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.SecretsImpl <em>Secrets</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.SecretsImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getSecrets()
	 * @generated
	 */
	int SECRETS = 43;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS__NAMESPACE = BUILDING_BLOCK__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Trust Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS__TRUST_DOMAIN = BUILDING_BLOCK__TRUST_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS__NAME = BUILDING_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>App ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS__APP_ID = BUILDING_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Secrets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS_FEATURE_COUNT = BUILDING_BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Secrets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS_OPERATION_COUNT = BUILDING_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.StateManagementImpl <em>State Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.StateManagementImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getStateManagement()
	 * @generated
	 */
	int STATE_MANAGEMENT = 44;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MANAGEMENT__NAMESPACE = BUILDING_BLOCK__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Trust Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MANAGEMENT__TRUST_DOMAIN = BUILDING_BLOCK__TRUST_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MANAGEMENT__NAME = BUILDING_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>App ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MANAGEMENT__APP_ID = BUILDING_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>State Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MANAGEMENT_FEATURE_COUNT = BUILDING_BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>State Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MANAGEMENT_OPERATION_COUNT = BUILDING_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.DistributedLocksImpl <em>Distributed Locks</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.DistributedLocksImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getDistributedLocks()
	 * @generated
	 */
	int DISTRIBUTED_LOCKS = 45;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTED_LOCKS__NAMESPACE = BUILDING_BLOCK__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Trust Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTED_LOCKS__TRUST_DOMAIN = BUILDING_BLOCK__TRUST_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTED_LOCKS__NAME = BUILDING_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>App ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTED_LOCKS__APP_ID = BUILDING_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Distributed Locks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTED_LOCKS_FEATURE_COUNT = BUILDING_BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Distributed Locks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTED_LOCKS_OPERATION_COUNT = BUILDING_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.CryptoGraphyImpl <em>Crypto Graphy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.CryptoGraphyImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getCryptoGraphy()
	 * @generated
	 */
	int CRYPTO_GRAPHY = 46;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_GRAPHY__NAMESPACE = BUILDING_BLOCK__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Trust Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_GRAPHY__TRUST_DOMAIN = BUILDING_BLOCK__TRUST_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_GRAPHY__NAME = BUILDING_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>App ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_GRAPHY__APP_ID = BUILDING_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Crypto Graphy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_GRAPHY_FEATURE_COUNT = BUILDING_BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Crypto Graphy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_GRAPHY_OPERATION_COUNT = BUILDING_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.ResiliencyTargetType <em>Resiliency Target Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.ResiliencyTargetType
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getResiliencyTargetType()
	 * @generated
	 */
	int RESILIENCY_TARGET_TYPE = 47;

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>EString To String Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EString To String Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="org.eclipse.emf.ecore.EString"
	 * @generated
	 */
	EClass getEStringToStringMapEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEStringToStringMapEntry()
	 * @generated
	 */
	EAttribute getEStringToStringMapEntry_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEStringToStringMapEntry()
	 * @generated
	 */
	EAttribute getEStringToStringMapEntry_Value();

	/**
	 * Returns the meta object for class '{@link daprdesigner.DaprArchitecture <em>Dapr Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dapr Architecture</em>'.
	 * @see daprdesigner.DaprArchitecture
	 * @generated
	 */
	EClass getDaprArchitecture();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.DaprArchitecture#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see daprdesigner.DaprArchitecture#getName()
	 * @see #getDaprArchitecture()
	 * @generated
	 */
	EAttribute getDaprArchitecture_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link daprdesigner.DaprArchitecture#getEnvironments <em>Environments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Environments</em>'.
	 * @see daprdesigner.DaprArchitecture#getEnvironments()
	 * @see #getDaprArchitecture()
	 * @generated
	 */
	EReference getDaprArchitecture_Environments();

	/**
	 * Returns the meta object for class '{@link daprdesigner.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment</em>'.
	 * @see daprdesigner.Environment
	 * @generated
	 */
	EClass getEnvironment();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.Environment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see daprdesigner.Environment#getName()
	 * @see #getEnvironment()
	 * @generated
	 */
	EAttribute getEnvironment_Name();

	/**
	 * Returns the meta object for the containment reference '{@link daprdesigner.Environment#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Namespace</em>'.
	 * @see daprdesigner.Environment#getNamespace()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_Namespace();

	/**
	 * Returns the meta object for the containment reference list '{@link daprdesigner.Environment#getTrustdomain <em>Trustdomain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trustdomain</em>'.
	 * @see daprdesigner.Environment#getTrustdomain()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_Trustdomain();

	/**
	 * Returns the meta object for the containment reference list '{@link daprdesigner.Environment#getBuildingblocks <em>Buildingblocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Buildingblocks</em>'.
	 * @see daprdesigner.Environment#getBuildingblocks()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_Buildingblocks();

	/**
	 * Returns the meta object for class '{@link daprdesigner.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace</em>'.
	 * @see daprdesigner.Namespace
	 * @generated
	 */
	EClass getNamespace();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.Namespace#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see daprdesigner.Namespace#getName()
	 * @see #getNamespace()
	 * @generated
	 */
	EAttribute getNamespace_Name();

	/**
	 * Returns the meta object for class '{@link daprdesigner.Trustdomain <em>Trustdomain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trustdomain</em>'.
	 * @see daprdesigner.Trustdomain
	 * @generated
	 */
	EClass getTrustdomain();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.Trustdomain#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see daprdesigner.Trustdomain#getName()
	 * @see #getTrustdomain()
	 * @generated
	 */
	EAttribute getTrustdomain_Name();

	/**
	 * Returns the meta object for class '{@link daprdesigner.BuildingBlock <em>Building Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Building Block</em>'.
	 * @see daprdesigner.BuildingBlock
	 * @generated
	 */
	EClass getBuildingBlock();

	/**
	 * Returns the meta object for the reference '{@link daprdesigner.BuildingBlock#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Namespace</em>'.
	 * @see daprdesigner.BuildingBlock#getNamespace()
	 * @see #getBuildingBlock()
	 * @generated
	 */
	EReference getBuildingBlock_Namespace();

	/**
	 * Returns the meta object for the reference '{@link daprdesigner.BuildingBlock#getTrustDomain <em>Trust Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trust Domain</em>'.
	 * @see daprdesigner.BuildingBlock#getTrustDomain()
	 * @see #getBuildingBlock()
	 * @generated
	 */
	EReference getBuildingBlock_TrustDomain();

	/**
	 * Returns the meta object for class '{@link daprdesigner.Services <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Services</em>'.
	 * @see daprdesigner.Services
	 * @generated
	 */
	EClass getServices();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.Services#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see daprdesigner.Services#getName()
	 * @see #getServices()
	 * @generated
	 */
	EAttribute getServices_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link daprdesigner.Services#getApps <em>Apps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Apps</em>'.
	 * @see daprdesigner.Services#getApps()
	 * @see #getServices()
	 * @generated
	 */
	EReference getServices_Apps();

	/**
	 * Returns the meta object for class '{@link daprdesigner.App <em>App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App</em>'.
	 * @see daprdesigner.App
	 * @generated
	 */
	EClass getApp();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.App#getAppId <em>App Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>App Id</em>'.
	 * @see daprdesigner.App#getAppId()
	 * @see #getApp()
	 * @generated
	 */
	EAttribute getApp_AppId();

	/**
	 * Returns the meta object for the reference '{@link daprdesigner.App#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Namespace</em>'.
	 * @see daprdesigner.App#getNamespace()
	 * @see #getApp()
	 * @generated
	 */
	EReference getApp_Namespace();

	/**
	 * Returns the meta object for the reference '{@link daprdesigner.App#getTrustDomain <em>Trust Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trust Domain</em>'.
	 * @see daprdesigner.App#getTrustDomain()
	 * @see #getApp()
	 * @generated
	 */
	EReference getApp_TrustDomain();

	/**
	 * Returns the meta object for the containment reference '{@link daprdesigner.App#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration</em>'.
	 * @see daprdesigner.App#getConfiguration()
	 * @see #getApp()
	 * @generated
	 */
	EReference getApp_Configuration();

	/**
	 * Returns the meta object for class '{@link daprdesigner.AppConfiguration <em>App Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Configuration</em>'.
	 * @see daprdesigner.AppConfiguration
	 * @generated
	 */
	EClass getAppConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.AppConfiguration#getApiVersion <em>Api Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api Version</em>'.
	 * @see daprdesigner.AppConfiguration#getApiVersion()
	 * @see #getAppConfiguration()
	 * @generated
	 */
	EAttribute getAppConfiguration_ApiVersion();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.AppConfiguration#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see daprdesigner.AppConfiguration#getKind()
	 * @see #getAppConfiguration()
	 * @generated
	 */
	EAttribute getAppConfiguration_Kind();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.AppConfiguration#getMetadata_name <em>Metadata name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata name</em>'.
	 * @see daprdesigner.AppConfiguration#getMetadata_name()
	 * @see #getAppConfiguration()
	 * @generated
	 */
	EAttribute getAppConfiguration_Metadata_name();

	/**
	 * Returns the meta object for the reference '{@link daprdesigner.AppConfiguration#getMetadata_namespace <em>Metadata namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metadata namespace</em>'.
	 * @see daprdesigner.AppConfiguration#getMetadata_namespace()
	 * @see #getAppConfiguration()
	 * @generated
	 */
	EReference getAppConfiguration_Metadata_namespace();

	/**
	 * Returns the meta object for the containment reference '{@link daprdesigner.AppConfiguration#getAccessControl <em>Access Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access Control</em>'.
	 * @see daprdesigner.AppConfiguration#getAccessControl()
	 * @see #getAppConfiguration()
	 * @generated
	 */
	EReference getAppConfiguration_AccessControl();

	/**
	 * Returns the meta object for the containment reference '{@link daprdesigner.AppConfiguration#getApiControl <em>Api Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Api Control</em>'.
	 * @see daprdesigner.AppConfiguration#getApiControl()
	 * @see #getAppConfiguration()
	 * @generated
	 */
	EReference getAppConfiguration_ApiControl();

	/**
	 * Returns the meta object for the containment reference '{@link daprdesigner.AppConfiguration#getMiddlewareConfiguration <em>Middleware Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Middleware Configuration</em>'.
	 * @see daprdesigner.AppConfiguration#getMiddlewareConfiguration()
	 * @see #getAppConfiguration()
	 * @generated
	 */
	EReference getAppConfiguration_MiddlewareConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link daprdesigner.AppConfiguration#getLoggingConfiguration <em>Logging Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Logging Configuration</em>'.
	 * @see daprdesigner.AppConfiguration#getLoggingConfiguration()
	 * @see #getAppConfiguration()
	 * @generated
	 */
	EReference getAppConfiguration_LoggingConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link daprdesigner.AppConfiguration#getNameResolutionConfiguration <em>Name Resolution Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name Resolution Configuration</em>'.
	 * @see daprdesigner.AppConfiguration#getNameResolutionConfiguration()
	 * @see #getAppConfiguration()
	 * @generated
	 */
	EReference getAppConfiguration_NameResolutionConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link daprdesigner.AppConfiguration#getSecretsConfiguration <em>Secrets Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Secrets Configuration</em>'.
	 * @see daprdesigner.AppConfiguration#getSecretsConfiguration()
	 * @see #getAppConfiguration()
	 * @generated
	 */
	EReference getAppConfiguration_SecretsConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link daprdesigner.AppConfiguration#getMetricsConfiguration <em>Metrics Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metrics Configuration</em>'.
	 * @see daprdesigner.AppConfiguration#getMetricsConfiguration()
	 * @see #getAppConfiguration()
	 * @generated
	 */
	EReference getAppConfiguration_MetricsConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link daprdesigner.AppConfiguration#getTracingConfiguration <em>Tracing Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tracing Configuration</em>'.
	 * @see daprdesigner.AppConfiguration#getTracingConfiguration()
	 * @see #getAppConfiguration()
	 * @generated
	 */
	EReference getAppConfiguration_TracingConfiguration();

	/**
	 * Returns the meta object for the attribute list '{@link daprdesigner.AppConfiguration#getComponentsDenyList <em>Components Deny List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Components Deny List</em>'.
	 * @see daprdesigner.AppConfiguration#getComponentsDenyList()
	 * @see #getAppConfiguration()
	 * @generated
	 */
	EAttribute getAppConfiguration_ComponentsDenyList();

	/**
	 * Returns the meta object for class '{@link daprdesigner.LoggingConfiguration <em>Logging Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logging Configuration</em>'.
	 * @see daprdesigner.LoggingConfiguration
	 * @generated
	 */
	EClass getLoggingConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.LoggingConfiguration#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see daprdesigner.LoggingConfiguration#isEnabled()
	 * @see #getLoggingConfiguration()
	 * @generated
	 */
	EAttribute getLoggingConfiguration_Enabled();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.LoggingConfiguration#isObfuscateURLs <em>Obfuscate UR Ls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Obfuscate UR Ls</em>'.
	 * @see daprdesigner.LoggingConfiguration#isObfuscateURLs()
	 * @see #getLoggingConfiguration()
	 * @generated
	 */
	EAttribute getLoggingConfiguration_ObfuscateURLs();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.LoggingConfiguration#isOmitHealthChecks <em>Omit Health Checks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Omit Health Checks</em>'.
	 * @see daprdesigner.LoggingConfiguration#isOmitHealthChecks()
	 * @see #getLoggingConfiguration()
	 * @generated
	 */
	EAttribute getLoggingConfiguration_OmitHealthChecks();

	/**
	 * Returns the meta object for class '{@link daprdesigner.NameResolutionConfiguration <em>Name Resolution Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Resolution Configuration</em>'.
	 * @see daprdesigner.NameResolutionConfiguration
	 * @generated
	 */
	EClass getNameResolutionConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.NameResolutionConfiguration#getComponentName <em>Component Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Name</em>'.
	 * @see daprdesigner.NameResolutionConfiguration#getComponentName()
	 * @see #getNameResolutionConfiguration()
	 * @generated
	 */
	EAttribute getNameResolutionConfiguration_ComponentName();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.NameResolutionConfiguration#getComponentVersion <em>Component Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Version</em>'.
	 * @see daprdesigner.NameResolutionConfiguration#getComponentVersion()
	 * @see #getNameResolutionConfiguration()
	 * @generated
	 */
	EAttribute getNameResolutionConfiguration_ComponentVersion();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.NameResolutionConfiguration#getConfigurationKey <em>Configuration Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration Key</em>'.
	 * @see daprdesigner.NameResolutionConfiguration#getConfigurationKey()
	 * @see #getNameResolutionConfiguration()
	 * @generated
	 */
	EAttribute getNameResolutionConfiguration_ConfigurationKey();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.NameResolutionConfiguration#getConfigurationValue <em>Configuration Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration Value</em>'.
	 * @see daprdesigner.NameResolutionConfiguration#getConfigurationValue()
	 * @see #getNameResolutionConfiguration()
	 * @generated
	 */
	EAttribute getNameResolutionConfiguration_ConfigurationValue();

	/**
	 * Returns the meta object for class '{@link daprdesigner.SecretsConfiguration <em>Secrets Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secrets Configuration</em>'.
	 * @see daprdesigner.SecretsConfiguration
	 * @generated
	 */
	EClass getSecretsConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link daprdesigner.SecretsConfiguration#getAllowedList <em>Allowed List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Allowed List</em>'.
	 * @see daprdesigner.SecretsConfiguration#getAllowedList()
	 * @see #getSecretsConfiguration()
	 * @generated
	 */
	EReference getSecretsConfiguration_AllowedList();

	/**
	 * Returns the meta object for the containment reference list '{@link daprdesigner.SecretsConfiguration#getDeniedList <em>Denied List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Denied List</em>'.
	 * @see daprdesigner.SecretsConfiguration#getDeniedList()
	 * @see #getSecretsConfiguration()
	 * @generated
	 */
	EReference getSecretsConfiguration_DeniedList();

	/**
	 * Returns the meta object for class '{@link daprdesigner.SecretsList <em>Secrets List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secrets List</em>'.
	 * @see daprdesigner.SecretsList
	 * @generated
	 */
	EClass getSecretsList();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.SecretsList#getStoreName <em>Store Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Store Name</em>'.
	 * @see daprdesigner.SecretsList#getStoreName()
	 * @see #getSecretsList()
	 * @generated
	 */
	EAttribute getSecretsList_StoreName();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.SecretsList#isDefaultAccess <em>Default Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Access</em>'.
	 * @see daprdesigner.SecretsList#isDefaultAccess()
	 * @see #getSecretsList()
	 * @generated
	 */
	EAttribute getSecretsList_DefaultAccess();

	/**
	 * Returns the meta object for the attribute list '{@link daprdesigner.SecretsList#getSecrets <em>Secrets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Secrets</em>'.
	 * @see daprdesigner.SecretsList#getSecrets()
	 * @see #getSecretsList()
	 * @generated
	 */
	EAttribute getSecretsList_Secrets();

	/**
	 * Returns the meta object for class '{@link daprdesigner.MetricsConfiguration <em>Metrics Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metrics Configuration</em>'.
	 * @see daprdesigner.MetricsConfiguration
	 * @generated
	 */
	EClass getMetricsConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.MetricsConfiguration#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see daprdesigner.MetricsConfiguration#isEnabled()
	 * @see #getMetricsConfiguration()
	 * @generated
	 */
	EAttribute getMetricsConfiguration_Enabled();

	/**
	 * Returns the meta object for the attribute list '{@link daprdesigner.MetricsConfiguration#getLatencyDistributionBuckets <em>Latency Distribution Buckets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Latency Distribution Buckets</em>'.
	 * @see daprdesigner.MetricsConfiguration#getLatencyDistributionBuckets()
	 * @see #getMetricsConfiguration()
	 * @generated
	 */
	EAttribute getMetricsConfiguration_LatencyDistributionBuckets();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.MetricsConfiguration#isHttp_increasedCardinality <em>Http increased Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http increased Cardinality</em>'.
	 * @see daprdesigner.MetricsConfiguration#isHttp_increasedCardinality()
	 * @see #getMetricsConfiguration()
	 * @generated
	 */
	EAttribute getMetricsConfiguration_Http_increasedCardinality();

	/**
	 * Returns the meta object for the attribute list '{@link daprdesigner.MetricsConfiguration#getHttp_pathMatching <em>Http path Matching</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Http path Matching</em>'.
	 * @see daprdesigner.MetricsConfiguration#getHttp_pathMatching()
	 * @see #getMetricsConfiguration()
	 * @generated
	 */
	EAttribute getMetricsConfiguration_Http_pathMatching();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.MetricsConfiguration#isHttp_excludeVerbs <em>Http exclude Verbs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http exclude Verbs</em>'.
	 * @see daprdesigner.MetricsConfiguration#isHttp_excludeVerbs()
	 * @see #getMetricsConfiguration()
	 * @generated
	 */
	EAttribute getMetricsConfiguration_Http_excludeVerbs();

	/**
	 * Returns the meta object for class '{@link daprdesigner.APIAccessControl <em>API Access Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>API Access Control</em>'.
	 * @see daprdesigner.APIAccessControl
	 * @generated
	 */
	EClass getAPIAccessControl();

	/**
	 * Returns the meta object for the containment reference list '{@link daprdesigner.APIAccessControl#getAllowedAPIs <em>Allowed AP Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Allowed AP Is</em>'.
	 * @see daprdesigner.APIAccessControl#getAllowedAPIs()
	 * @see #getAPIAccessControl()
	 * @generated
	 */
	EReference getAPIAccessControl_AllowedAPIs();

	/**
	 * Returns the meta object for the containment reference list '{@link daprdesigner.APIAccessControl#getDeniedAPIs <em>Denied AP Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Denied AP Is</em>'.
	 * @see daprdesigner.APIAccessControl#getDeniedAPIs()
	 * @see #getAPIAccessControl()
	 * @generated
	 */
	EReference getAPIAccessControl_DeniedAPIs();

	/**
	 * Returns the meta object for class '{@link daprdesigner.API <em>API</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>API</em>'.
	 * @see daprdesigner.API
	 * @generated
	 */
	EClass getAPI();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.API#getApi_name <em>Api name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api name</em>'.
	 * @see daprdesigner.API#getApi_name()
	 * @see #getAPI()
	 * @generated
	 */
	EAttribute getAPI_Api_name();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.API#getApi_version <em>Api version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api version</em>'.
	 * @see daprdesigner.API#getApi_version()
	 * @see #getAPI()
	 * @generated
	 */
	EAttribute getAPI_Api_version();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.API#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see daprdesigner.API#getProtocol()
	 * @see #getAPI()
	 * @generated
	 */
	EAttribute getAPI_Protocol();

	/**
	 * Returns the meta object for class '{@link daprdesigner.AppAccessControl <em>App Access Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Access Control</em>'.
	 * @see daprdesigner.AppAccessControl
	 * @generated
	 */
	EClass getAppAccessControl();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.AppAccessControl#getDefaultAction <em>Default Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Action</em>'.
	 * @see daprdesigner.AppAccessControl#getDefaultAction()
	 * @see #getAppAccessControl()
	 * @generated
	 */
	EAttribute getAppAccessControl_DefaultAction();

	/**
	 * Returns the meta object for the reference '{@link daprdesigner.AppAccessControl#getTrustDomain <em>Trust Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trust Domain</em>'.
	 * @see daprdesigner.AppAccessControl#getTrustDomain()
	 * @see #getAppAccessControl()
	 * @generated
	 */
	EReference getAppAccessControl_TrustDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link daprdesigner.AppAccessControl#getPolicies <em>Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Policies</em>'.
	 * @see daprdesigner.AppAccessControl#getPolicies()
	 * @see #getAppAccessControl()
	 * @generated
	 */
	EReference getAppAccessControl_Policies();

	/**
	 * Returns the meta object for class '{@link daprdesigner.AppPolicy <em>App Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Policy</em>'.
	 * @see daprdesigner.AppPolicy
	 * @generated
	 */
	EClass getAppPolicy();

	/**
	 * Returns the meta object for the reference '{@link daprdesigner.AppPolicy#getApp <em>App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>App</em>'.
	 * @see daprdesigner.AppPolicy#getApp()
	 * @see #getAppPolicy()
	 * @generated
	 */
	EReference getAppPolicy_App();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.AppPolicy#getDefaultAction <em>Default Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Action</em>'.
	 * @see daprdesigner.AppPolicy#getDefaultAction()
	 * @see #getAppPolicy()
	 * @generated
	 */
	EAttribute getAppPolicy_DefaultAction();

	/**
	 * Returns the meta object for the reference '{@link daprdesigner.AppPolicy#getTrustDomain <em>Trust Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trust Domain</em>'.
	 * @see daprdesigner.AppPolicy#getTrustDomain()
	 * @see #getAppPolicy()
	 * @generated
	 */
	EReference getAppPolicy_TrustDomain();

	/**
	 * Returns the meta object for the reference '{@link daprdesigner.AppPolicy#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Namespace</em>'.
	 * @see daprdesigner.AppPolicy#getNamespace()
	 * @see #getAppPolicy()
	 * @generated
	 */
	EReference getAppPolicy_Namespace();

	/**
	 * Returns the meta object for the containment reference list '{@link daprdesigner.AppPolicy#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see daprdesigner.AppPolicy#getOperations()
	 * @see #getAppPolicy()
	 * @generated
	 */
	EReference getAppPolicy_Operations();

	/**
	 * Returns the meta object for class '{@link daprdesigner.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see daprdesigner.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.Operation#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see daprdesigner.Operation#getProtocol()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.Operation#getOperationName <em>Operation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Name</em>'.
	 * @see daprdesigner.Operation#getOperationName()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_OperationName();

	/**
	 * Returns the meta object for the attribute list '{@link daprdesigner.Operation#getVerbs <em>Verbs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Verbs</em>'.
	 * @see daprdesigner.Operation#getVerbs()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Verbs();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.Operation#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see daprdesigner.Operation#getAction()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Action();

	/**
	 * Returns the meta object for class '{@link daprdesigner.MiddlewareConfiguration <em>Middleware Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Middleware Configuration</em>'.
	 * @see daprdesigner.MiddlewareConfiguration
	 * @generated
	 */
	EClass getMiddlewareConfiguration();

	/**
	 * Returns the meta object for the map '{@link daprdesigner.MiddlewareConfiguration#getIncomingHandler <em>Incoming Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Incoming Handler</em>'.
	 * @see daprdesigner.MiddlewareConfiguration#getIncomingHandler()
	 * @see #getMiddlewareConfiguration()
	 * @generated
	 */
	EReference getMiddlewareConfiguration_IncomingHandler();

	/**
	 * Returns the meta object for the map '{@link daprdesigner.MiddlewareConfiguration#getOutgoingHandler <em>Outgoing Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Outgoing Handler</em>'.
	 * @see daprdesigner.MiddlewareConfiguration#getOutgoingHandler()
	 * @see #getMiddlewareConfiguration()
	 * @generated
	 */
	EReference getMiddlewareConfiguration_OutgoingHandler();

	/**
	 * Returns the meta object for class '{@link daprdesigner.HttpHandler <em>Http Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Http Handler</em>'.
	 * @see daprdesigner.HttpHandler
	 * @generated
	 */
	EClass getHttpHandler();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.HttpHandler#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see daprdesigner.HttpHandler#getName()
	 * @see #getHttpHandler()
	 * @generated
	 */
	EAttribute getHttpHandler_Name();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.HttpHandler#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see daprdesigner.HttpHandler#getType()
	 * @see #getHttpHandler()
	 * @generated
	 */
	EAttribute getHttpHandler_Type();

	/**
	 * Returns the meta object for class '{@link daprdesigner.TracingConfiguration <em>Tracing Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tracing Configuration</em>'.
	 * @see daprdesigner.TracingConfiguration
	 * @generated
	 */
	EClass getTracingConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.TracingConfiguration#getSamplingRate <em>Sampling Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sampling Rate</em>'.
	 * @see daprdesigner.TracingConfiguration#getSamplingRate()
	 * @see #getTracingConfiguration()
	 * @generated
	 */
	EAttribute getTracingConfiguration_SamplingRate();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.TracingConfiguration#isStdout <em>Stdout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stdout</em>'.
	 * @see daprdesigner.TracingConfiguration#isStdout()
	 * @see #getTracingConfiguration()
	 * @generated
	 */
	EAttribute getTracingConfiguration_Stdout();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.TracingConfiguration#getOtel_endPointAddress <em>Otel end Point Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Otel end Point Address</em>'.
	 * @see daprdesigner.TracingConfiguration#getOtel_endPointAddress()
	 * @see #getTracingConfiguration()
	 * @generated
	 */
	EAttribute getTracingConfiguration_Otel_endPointAddress();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.TracingConfiguration#isOtel_isSecure <em>Otel is Secure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Otel is Secure</em>'.
	 * @see daprdesigner.TracingConfiguration#isOtel_isSecure()
	 * @see #getTracingConfiguration()
	 * @generated
	 */
	EAttribute getTracingConfiguration_Otel_isSecure();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.TracingConfiguration#getOtel_protocol <em>Otel protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Otel protocol</em>'.
	 * @see daprdesigner.TracingConfiguration#getOtel_protocol()
	 * @see #getTracingConfiguration()
	 * @generated
	 */
	EAttribute getTracingConfiguration_Otel_protocol();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.TracingConfiguration#getZipkin_endPointAddress <em>Zipkin end Point Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zipkin end Point Address</em>'.
	 * @see daprdesigner.TracingConfiguration#getZipkin_endPointAddress()
	 * @see #getTracingConfiguration()
	 * @generated
	 */
	EAttribute getTracingConfiguration_Zipkin_endPointAddress();

	/**
	 * Returns the meta object for class '{@link daprdesigner.SubscriptionConfiguration <em>Subscription Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subscription Configuration</em>'.
	 * @see daprdesigner.SubscriptionConfiguration
	 * @generated
	 */
	EClass getSubscriptionConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.SubscriptionConfiguration#getApiVersion <em>Api Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api Version</em>'.
	 * @see daprdesigner.SubscriptionConfiguration#getApiVersion()
	 * @see #getSubscriptionConfiguration()
	 * @generated
	 */
	EAttribute getSubscriptionConfiguration_ApiVersion();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.SubscriptionConfiguration#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see daprdesigner.SubscriptionConfiguration#getKind()
	 * @see #getSubscriptionConfiguration()
	 * @generated
	 */
	EAttribute getSubscriptionConfiguration_Kind();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.SubscriptionConfiguration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see daprdesigner.SubscriptionConfiguration#getName()
	 * @see #getSubscriptionConfiguration()
	 * @generated
	 */
	EAttribute getSubscriptionConfiguration_Name();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.SubscriptionConfiguration#getTopicName <em>Topic Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic Name</em>'.
	 * @see daprdesigner.SubscriptionConfiguration#getTopicName()
	 * @see #getSubscriptionConfiguration()
	 * @generated
	 */
	EAttribute getSubscriptionConfiguration_TopicName();

	/**
	 * Returns the meta object for the map '{@link daprdesigner.SubscriptionConfiguration#getRouteRules <em>Route Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Route Rules</em>'.
	 * @see daprdesigner.SubscriptionConfiguration#getRouteRules()
	 * @see #getSubscriptionConfiguration()
	 * @generated
	 */
	EReference getSubscriptionConfiguration_RouteRules();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.SubscriptionConfiguration#getPubsubname <em>Pubsubname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pubsubname</em>'.
	 * @see daprdesigner.SubscriptionConfiguration#getPubsubname()
	 * @see #getSubscriptionConfiguration()
	 * @generated
	 */
	EAttribute getSubscriptionConfiguration_Pubsubname();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.SubscriptionConfiguration#getDeadLetterTopic <em>Dead Letter Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dead Letter Topic</em>'.
	 * @see daprdesigner.SubscriptionConfiguration#getDeadLetterTopic()
	 * @see #getSubscriptionConfiguration()
	 * @generated
	 */
	EAttribute getSubscriptionConfiguration_DeadLetterTopic();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.SubscriptionConfiguration#isBulkSubscribe_enabled <em>Bulk Subscribe enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bulk Subscribe enabled</em>'.
	 * @see daprdesigner.SubscriptionConfiguration#isBulkSubscribe_enabled()
	 * @see #getSubscriptionConfiguration()
	 * @generated
	 */
	EAttribute getSubscriptionConfiguration_BulkSubscribe_enabled();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.SubscriptionConfiguration#getBulkSubscribe_maxMessagesCount <em>Bulk Subscribe max Messages Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bulk Subscribe max Messages Count</em>'.
	 * @see daprdesigner.SubscriptionConfiguration#getBulkSubscribe_maxMessagesCount()
	 * @see #getSubscriptionConfiguration()
	 * @generated
	 */
	EAttribute getSubscriptionConfiguration_BulkSubscribe_maxMessagesCount();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.SubscriptionConfiguration#getBulkSubscribe_maxAwaitDurationMs <em>Bulk Subscribe max Await Duration Ms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bulk Subscribe max Await Duration Ms</em>'.
	 * @see daprdesigner.SubscriptionConfiguration#getBulkSubscribe_maxAwaitDurationMs()
	 * @see #getSubscriptionConfiguration()
	 * @generated
	 */
	EAttribute getSubscriptionConfiguration_BulkSubscribe_maxAwaitDurationMs();

	/**
	 * Returns the meta object for the reference list '{@link daprdesigner.SubscriptionConfiguration#getScopes <em>Scopes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scopes</em>'.
	 * @see daprdesigner.SubscriptionConfiguration#getScopes()
	 * @see #getSubscriptionConfiguration()
	 * @generated
	 */
	EReference getSubscriptionConfiguration_Scopes();

	/**
	 * Returns the meta object for class '{@link daprdesigner.RouteRules <em>Route Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route Rules</em>'.
	 * @see daprdesigner.RouteRules
	 * @generated
	 */
	EClass getRouteRules();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.RouteRules#getMatch <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Match</em>'.
	 * @see daprdesigner.RouteRules#getMatch()
	 * @see #getRouteRules()
	 * @generated
	 */
	EAttribute getRouteRules_Match();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.RouteRules#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see daprdesigner.RouteRules#getPath()
	 * @see #getRouteRules()
	 * @generated
	 */
	EAttribute getRouteRules_Path();

	/**
	 * Returns the meta object for class '{@link daprdesigner.ResiliencyConfiguration <em>Resiliency Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resiliency Configuration</em>'.
	 * @see daprdesigner.ResiliencyConfiguration
	 * @generated
	 */
	EClass getResiliencyConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.ResiliencyConfiguration#getApiVersion <em>Api Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api Version</em>'.
	 * @see daprdesigner.ResiliencyConfiguration#getApiVersion()
	 * @see #getResiliencyConfiguration()
	 * @generated
	 */
	EAttribute getResiliencyConfiguration_ApiVersion();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.ResiliencyConfiguration#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see daprdesigner.ResiliencyConfiguration#getKind()
	 * @see #getResiliencyConfiguration()
	 * @generated
	 */
	EAttribute getResiliencyConfiguration_Kind();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.ResiliencyConfiguration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see daprdesigner.ResiliencyConfiguration#getName()
	 * @see #getResiliencyConfiguration()
	 * @generated
	 */
	EAttribute getResiliencyConfiguration_Name();

	/**
	 * Returns the meta object for the reference list '{@link daprdesigner.ResiliencyConfiguration#getScopes <em>Scopes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scopes</em>'.
	 * @see daprdesigner.ResiliencyConfiguration#getScopes()
	 * @see #getResiliencyConfiguration()
	 * @generated
	 */
	EReference getResiliencyConfiguration_Scopes();

	/**
	 * Returns the meta object for the containment reference '{@link daprdesigner.ResiliencyConfiguration#getPolicy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Policy</em>'.
	 * @see daprdesigner.ResiliencyConfiguration#getPolicy()
	 * @see #getResiliencyConfiguration()
	 * @generated
	 */
	EReference getResiliencyConfiguration_Policy();

	/**
	 * Returns the meta object for the containment reference list '{@link daprdesigner.ResiliencyConfiguration#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Targets</em>'.
	 * @see daprdesigner.ResiliencyConfiguration#getTargets()
	 * @see #getResiliencyConfiguration()
	 * @generated
	 */
	EReference getResiliencyConfiguration_Targets();

	/**
	 * Returns the meta object for class '{@link daprdesigner.ResiliencyPolicy <em>Resiliency Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resiliency Policy</em>'.
	 * @see daprdesigner.ResiliencyPolicy
	 * @generated
	 */
	EClass getResiliencyPolicy();

	/**
	 * Returns the meta object for the containment reference list '{@link daprdesigner.ResiliencyPolicy#getRetries <em>Retries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Retries</em>'.
	 * @see daprdesigner.ResiliencyPolicy#getRetries()
	 * @see #getResiliencyPolicy()
	 * @generated
	 */
	EReference getResiliencyPolicy_Retries();

	/**
	 * Returns the meta object for the containment reference list '{@link daprdesigner.ResiliencyPolicy#getCircuitbreakers <em>Circuitbreakers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Circuitbreakers</em>'.
	 * @see daprdesigner.ResiliencyPolicy#getCircuitbreakers()
	 * @see #getResiliencyPolicy()
	 * @generated
	 */
	EReference getResiliencyPolicy_Circuitbreakers();

	/**
	 * Returns the meta object for the map '{@link daprdesigner.ResiliencyPolicy#getTimeouts <em>Timeouts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Timeouts</em>'.
	 * @see daprdesigner.ResiliencyPolicy#getTimeouts()
	 * @see #getResiliencyPolicy()
	 * @generated
	 */
	EReference getResiliencyPolicy_Timeouts();

	/**
	 * Returns the meta object for class '{@link daprdesigner.ResiliencyTimeout <em>Resiliency Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resiliency Timeout</em>'.
	 * @see daprdesigner.ResiliencyTimeout
	 * @generated
	 */
	EClass getResiliencyTimeout();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.ResiliencyTimeout#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see daprdesigner.ResiliencyTimeout#getName()
	 * @see #getResiliencyTimeout()
	 * @generated
	 */
	EAttribute getResiliencyTimeout_Name();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.ResiliencyTimeout#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see daprdesigner.ResiliencyTimeout#getValue()
	 * @see #getResiliencyTimeout()
	 * @generated
	 */
	EAttribute getResiliencyTimeout_Value();

	/**
	 * Returns the meta object for class '{@link daprdesigner.RetryPolicy <em>Retry Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Retry Policy</em>'.
	 * @see daprdesigner.RetryPolicy
	 * @generated
	 */
	EClass getRetryPolicy();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.RetryPolicy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see daprdesigner.RetryPolicy#getName()
	 * @see #getRetryPolicy()
	 * @generated
	 */
	EAttribute getRetryPolicy_Name();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.RetryPolicy#getPolicy_type <em>Policy type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy type</em>'.
	 * @see daprdesigner.RetryPolicy#getPolicy_type()
	 * @see #getRetryPolicy()
	 * @generated
	 */
	EAttribute getRetryPolicy_Policy_type();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.RetryPolicy#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see daprdesigner.RetryPolicy#getDuration()
	 * @see #getRetryPolicy()
	 * @generated
	 */
	EAttribute getRetryPolicy_Duration();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.RetryPolicy#getMaxRetries <em>Max Retries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Retries</em>'.
	 * @see daprdesigner.RetryPolicy#getMaxRetries()
	 * @see #getRetryPolicy()
	 * @generated
	 */
	EAttribute getRetryPolicy_MaxRetries();

	/**
	 * Returns the meta object for class '{@link daprdesigner.CircuitBreakerPolicy <em>Circuit Breaker Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circuit Breaker Policy</em>'.
	 * @see daprdesigner.CircuitBreakerPolicy
	 * @generated
	 */
	EClass getCircuitBreakerPolicy();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.CircuitBreakerPolicy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see daprdesigner.CircuitBreakerPolicy#getName()
	 * @see #getCircuitBreakerPolicy()
	 * @generated
	 */
	EAttribute getCircuitBreakerPolicy_Name();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.CircuitBreakerPolicy#getMaxRequests <em>Max Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Requests</em>'.
	 * @see daprdesigner.CircuitBreakerPolicy#getMaxRequests()
	 * @see #getCircuitBreakerPolicy()
	 * @generated
	 */
	EAttribute getCircuitBreakerPolicy_MaxRequests();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.CircuitBreakerPolicy#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval</em>'.
	 * @see daprdesigner.CircuitBreakerPolicy#getInterval()
	 * @see #getCircuitBreakerPolicy()
	 * @generated
	 */
	EAttribute getCircuitBreakerPolicy_Interval();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.CircuitBreakerPolicy#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout</em>'.
	 * @see daprdesigner.CircuitBreakerPolicy#getTimeout()
	 * @see #getCircuitBreakerPolicy()
	 * @generated
	 */
	EAttribute getCircuitBreakerPolicy_Timeout();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.CircuitBreakerPolicy#getTrip <em>Trip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trip</em>'.
	 * @see daprdesigner.CircuitBreakerPolicy#getTrip()
	 * @see #getCircuitBreakerPolicy()
	 * @generated
	 */
	EAttribute getCircuitBreakerPolicy_Trip();

	/**
	 * Returns the meta object for class '{@link daprdesigner.ResiliencyTarget <em>Resiliency Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resiliency Target</em>'.
	 * @see daprdesigner.ResiliencyTarget
	 * @generated
	 */
	EClass getResiliencyTarget();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.ResiliencyTarget#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see daprdesigner.ResiliencyTarget#getType()
	 * @see #getResiliencyTarget()
	 * @generated
	 */
	EAttribute getResiliencyTarget_Type();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.ResiliencyTarget#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see daprdesigner.ResiliencyTarget#getName()
	 * @see #getResiliencyTarget()
	 * @generated
	 */
	EAttribute getResiliencyTarget_Name();

	/**
	 * Returns the meta object for the containment reference '{@link daprdesigner.ResiliencyTarget#getCircuitBreaker <em>Circuit Breaker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Circuit Breaker</em>'.
	 * @see daprdesigner.ResiliencyTarget#getCircuitBreaker()
	 * @see #getResiliencyTarget()
	 * @generated
	 */
	EReference getResiliencyTarget_CircuitBreaker();

	/**
	 * Returns the meta object for the containment reference '{@link daprdesigner.ResiliencyTarget#getRetry <em>Retry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Retry</em>'.
	 * @see daprdesigner.ResiliencyTarget#getRetry()
	 * @see #getResiliencyTarget()
	 * @generated
	 */
	EReference getResiliencyTarget_Retry();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.ResiliencyTarget#getCircuitBreakerCacheSize <em>Circuit Breaker Cache Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Circuit Breaker Cache Size</em>'.
	 * @see daprdesigner.ResiliencyTarget#getCircuitBreakerCacheSize()
	 * @see #getResiliencyTarget()
	 * @generated
	 */
	EAttribute getResiliencyTarget_CircuitBreakerCacheSize();

	/**
	 * Returns the meta object for the containment reference '{@link daprdesigner.ResiliencyTarget#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timeout</em>'.
	 * @see daprdesigner.ResiliencyTarget#getTimeout()
	 * @see #getResiliencyTarget()
	 * @generated
	 */
	EReference getResiliencyTarget_Timeout();

	/**
	 * Returns the meta object for class '{@link daprdesigner.HTTPEndPoint <em>HTTP End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTTP End Point</em>'.
	 * @see daprdesigner.HTTPEndPoint
	 * @generated
	 */
	EClass getHTTPEndPoint();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.HTTPEndPoint#getApiVersion <em>Api Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api Version</em>'.
	 * @see daprdesigner.HTTPEndPoint#getApiVersion()
	 * @see #getHTTPEndPoint()
	 * @generated
	 */
	EAttribute getHTTPEndPoint_ApiVersion();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.HTTPEndPoint#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see daprdesigner.HTTPEndPoint#getKind()
	 * @see #getHTTPEndPoint()
	 * @generated
	 */
	EAttribute getHTTPEndPoint_Kind();

	/**
	 * Returns the meta object for the reference '{@link daprdesigner.HTTPEndPoint#getAuth <em>Auth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Auth</em>'.
	 * @see daprdesigner.HTTPEndPoint#getAuth()
	 * @see #getHTTPEndPoint()
	 * @generated
	 */
	EReference getHTTPEndPoint_Auth();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.HTTPEndPoint#getMetadata_name <em>Metadata name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata name</em>'.
	 * @see daprdesigner.HTTPEndPoint#getMetadata_name()
	 * @see #getHTTPEndPoint()
	 * @generated
	 */
	EAttribute getHTTPEndPoint_Metadata_name();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.HTTPEndPoint#getBaseUrl <em>Base Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Url</em>'.
	 * @see daprdesigner.HTTPEndPoint#getBaseUrl()
	 * @see #getHTTPEndPoint()
	 * @generated
	 */
	EAttribute getHTTPEndPoint_BaseUrl();

	/**
	 * Returns the meta object for the reference list '{@link daprdesigner.HTTPEndPoint#getScopes <em>Scopes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scopes</em>'.
	 * @see daprdesigner.HTTPEndPoint#getScopes()
	 * @see #getHTTPEndPoint()
	 * @generated
	 */
	EReference getHTTPEndPoint_Scopes();

	/**
	 * Returns the meta object for the containment reference list '{@link daprdesigner.HTTPEndPoint#getHeaders <em>Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Headers</em>'.
	 * @see daprdesigner.HTTPEndPoint#getHeaders()
	 * @see #getHTTPEndPoint()
	 * @generated
	 */
	EReference getHTTPEndPoint_Headers();

	/**
	 * Returns the meta object for the containment reference '{@link daprdesigner.HTTPEndPoint#getClientTLS_rootCA <em>Client TLS root CA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Client TLS root CA</em>'.
	 * @see daprdesigner.HTTPEndPoint#getClientTLS_rootCA()
	 * @see #getHTTPEndPoint()
	 * @generated
	 */
	EReference getHTTPEndPoint_ClientTLS_rootCA();

	/**
	 * Returns the meta object for the containment reference '{@link daprdesigner.HTTPEndPoint#getClientTLS_certificate <em>Client TLS certificate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Client TLS certificate</em>'.
	 * @see daprdesigner.HTTPEndPoint#getClientTLS_certificate()
	 * @see #getHTTPEndPoint()
	 * @generated
	 */
	EReference getHTTPEndPoint_ClientTLS_certificate();

	/**
	 * Returns the meta object for the containment reference '{@link daprdesigner.HTTPEndPoint#getClientTLS_privateKey <em>Client TLS private Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Client TLS private Key</em>'.
	 * @see daprdesigner.HTTPEndPoint#getClientTLS_privateKey()
	 * @see #getHTTPEndPoint()
	 * @generated
	 */
	EReference getHTTPEndPoint_ClientTLS_privateKey();

	/**
	 * Returns the meta object for class '{@link daprdesigner.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see daprdesigner.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.Component#getApiVersion <em>Api Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api Version</em>'.
	 * @see daprdesigner.Component#getApiVersion()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_ApiVersion();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.Component#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see daprdesigner.Component#getKind()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Kind();

	/**
	 * Returns the meta object for the reference '{@link daprdesigner.Component#getAuth <em>Auth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Auth</em>'.
	 * @see daprdesigner.Component#getAuth()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Auth();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.Component#getMetadata_name <em>Metadata name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata name</em>'.
	 * @see daprdesigner.Component#getMetadata_name()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Metadata_name();

	/**
	 * Returns the meta object for the reference '{@link daprdesigner.Component#getMetadata_namespace <em>Metadata namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metadata namespace</em>'.
	 * @see daprdesigner.Component#getMetadata_namespace()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Metadata_namespace();

	/**
	 * Returns the meta object for the containment reference '{@link daprdesigner.Component#getSpec <em>Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spec</em>'.
	 * @see daprdesigner.Component#getSpec()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Spec();

	/**
	 * Returns the meta object for the reference list '{@link daprdesigner.Component#getScopes <em>Scopes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scopes</em>'.
	 * @see daprdesigner.Component#getScopes()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Scopes();

	/**
	 * Returns the meta object for class '{@link daprdesigner.ComponentSpec <em>Component Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Spec</em>'.
	 * @see daprdesigner.ComponentSpec
	 * @generated
	 */
	EClass getComponentSpec();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.ComponentSpec#isIgnoreErrors <em>Ignore Errors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Errors</em>'.
	 * @see daprdesigner.ComponentSpec#isIgnoreErrors()
	 * @see #getComponentSpec()
	 * @generated
	 */
	EAttribute getComponentSpec_IgnoreErrors();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.ComponentSpec#getInitTimeout <em>Init Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init Timeout</em>'.
	 * @see daprdesigner.ComponentSpec#getInitTimeout()
	 * @see #getComponentSpec()
	 * @generated
	 */
	EAttribute getComponentSpec_InitTimeout();

	/**
	 * Returns the meta object for the containment reference list '{@link daprdesigner.ComponentSpec#getSpec_metadata <em>Spec metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spec metadata</em>'.
	 * @see daprdesigner.ComponentSpec#getSpec_metadata()
	 * @see #getComponentSpec()
	 * @generated
	 */
	EReference getComponentSpec_Spec_metadata();

	/**
	 * Returns the meta object for class '{@link daprdesigner.SpecMetadata <em>Spec Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Metadata</em>'.
	 * @see daprdesigner.SpecMetadata
	 * @generated
	 */
	EClass getSpecMetadata();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.SpecMetadata#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see daprdesigner.SpecMetadata#getName()
	 * @see #getSpecMetadata()
	 * @generated
	 */
	EAttribute getSpecMetadata_Name();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.SpecMetadata#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see daprdesigner.SpecMetadata#getValue()
	 * @see #getSpecMetadata()
	 * @generated
	 */
	EAttribute getSpecMetadata_Value();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.SpecMetadata#isIsFetchedFromSecret <em>Is Fetched From Secret</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Fetched From Secret</em>'.
	 * @see daprdesigner.SpecMetadata#isIsFetchedFromSecret()
	 * @see #getSpecMetadata()
	 * @generated
	 */
	EAttribute getSpecMetadata_IsFetchedFromSecret();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.SpecMetadata#isIsFetchedFromEnvironment <em>Is Fetched From Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Fetched From Environment</em>'.
	 * @see daprdesigner.SpecMetadata#isIsFetchedFromEnvironment()
	 * @see #getSpecMetadata()
	 * @generated
	 */
	EAttribute getSpecMetadata_IsFetchedFromEnvironment();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.SpecMetadata#getSecretKeyRefName <em>Secret Key Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Secret Key Ref Name</em>'.
	 * @see daprdesigner.SpecMetadata#getSecretKeyRefName()
	 * @see #getSpecMetadata()
	 * @generated
	 */
	EAttribute getSpecMetadata_SecretKeyRefName();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.SpecMetadata#getSecretKeyRefKey <em>Secret Key Ref Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Secret Key Ref Key</em>'.
	 * @see daprdesigner.SpecMetadata#getSecretKeyRefKey()
	 * @see #getSpecMetadata()
	 * @generated
	 */
	EAttribute getSpecMetadata_SecretKeyRefKey();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.SpecMetadata#getEnvRef <em>Env Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Env Ref</em>'.
	 * @see daprdesigner.SpecMetadata#getEnvRef()
	 * @see #getSpecMetadata()
	 * @generated
	 */
	EAttribute getSpecMetadata_EnvRef();

	/**
	 * Returns the meta object for class '{@link daprdesigner.SecretStore <em>Secret Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secret Store</em>'.
	 * @see daprdesigner.SecretStore
	 * @generated
	 */
	EClass getSecretStore();

	/**
	 * Returns the meta object for class '{@link daprdesigner.HashicorpVault <em>Hashicorp Vault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hashicorp Vault</em>'.
	 * @see daprdesigner.HashicorpVault
	 * @generated
	 */
	EClass getHashicorpVault();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.HashicorpVault#getSpec_type <em>Spec type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spec type</em>'.
	 * @see daprdesigner.HashicorpVault#getSpec_type()
	 * @see #getHashicorpVault()
	 * @generated
	 */
	EAttribute getHashicorpVault_Spec_type();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.HashicorpVault#getSpec_version <em>Spec version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spec version</em>'.
	 * @see daprdesigner.HashicorpVault#getSpec_version()
	 * @see #getHashicorpVault()
	 * @generated
	 */
	EAttribute getHashicorpVault_Spec_version();

	/**
	 * Returns the meta object for class '{@link daprdesigner.MessageBroker <em>Message Broker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Broker</em>'.
	 * @see daprdesigner.MessageBroker
	 * @generated
	 */
	EClass getMessageBroker();

	/**
	 * Returns the meta object for class '{@link daprdesigner.PubSub <em>Pub Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pub Sub</em>'.
	 * @see daprdesigner.PubSub
	 * @generated
	 */
	EClass getPubSub();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.PubSub#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see daprdesigner.PubSub#getName()
	 * @see #getPubSub()
	 * @generated
	 */
	EAttribute getPubSub_Name();

	/**
	 * Returns the meta object for the reference list '{@link daprdesigner.PubSub#getMbrokers <em>Mbrokers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mbrokers</em>'.
	 * @see daprdesigner.PubSub#getMbrokers()
	 * @see #getPubSub()
	 * @generated
	 */
	EReference getPubSub_Mbrokers();

	/**
	 * Returns the meta object for class '{@link daprdesigner.Bindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bindings</em>'.
	 * @see daprdesigner.Bindings
	 * @generated
	 */
	EClass getBindings();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.Bindings#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see daprdesigner.Bindings#getName()
	 * @see #getBindings()
	 * @generated
	 */
	EAttribute getBindings_Name();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.Bindings#getAppID <em>App ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>App ID</em>'.
	 * @see daprdesigner.Bindings#getAppID()
	 * @see #getBindings()
	 * @generated
	 */
	EAttribute getBindings_AppID();

	/**
	 * Returns the meta object for class '{@link daprdesigner.Jobs <em>Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jobs</em>'.
	 * @see daprdesigner.Jobs
	 * @generated
	 */
	EClass getJobs();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.Jobs#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see daprdesigner.Jobs#getName()
	 * @see #getJobs()
	 * @generated
	 */
	EAttribute getJobs_Name();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.Jobs#getAppID <em>App ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>App ID</em>'.
	 * @see daprdesigner.Jobs#getAppID()
	 * @see #getJobs()
	 * @generated
	 */
	EAttribute getJobs_AppID();

	/**
	 * Returns the meta object for class '{@link daprdesigner.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see daprdesigner.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.Configuration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see daprdesigner.Configuration#getName()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_Name();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.Configuration#getAppID <em>App ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>App ID</em>'.
	 * @see daprdesigner.Configuration#getAppID()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_AppID();

	/**
	 * Returns the meta object for class '{@link daprdesigner.Workflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow</em>'.
	 * @see daprdesigner.Workflow
	 * @generated
	 */
	EClass getWorkflow();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.Workflow#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see daprdesigner.Workflow#getName()
	 * @see #getWorkflow()
	 * @generated
	 */
	EAttribute getWorkflow_Name();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.Workflow#getAppID <em>App ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>App ID</em>'.
	 * @see daprdesigner.Workflow#getAppID()
	 * @see #getWorkflow()
	 * @generated
	 */
	EAttribute getWorkflow_AppID();

	/**
	 * Returns the meta object for class '{@link daprdesigner.Actors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actors</em>'.
	 * @see daprdesigner.Actors
	 * @generated
	 */
	EClass getActors();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.Actors#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see daprdesigner.Actors#getName()
	 * @see #getActors()
	 * @generated
	 */
	EAttribute getActors_Name();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.Actors#getAppID <em>App ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>App ID</em>'.
	 * @see daprdesigner.Actors#getAppID()
	 * @see #getActors()
	 * @generated
	 */
	EAttribute getActors_AppID();

	/**
	 * Returns the meta object for class '{@link daprdesigner.Secrets <em>Secrets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secrets</em>'.
	 * @see daprdesigner.Secrets
	 * @generated
	 */
	EClass getSecrets();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.Secrets#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see daprdesigner.Secrets#getName()
	 * @see #getSecrets()
	 * @generated
	 */
	EAttribute getSecrets_Name();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.Secrets#getAppID <em>App ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>App ID</em>'.
	 * @see daprdesigner.Secrets#getAppID()
	 * @see #getSecrets()
	 * @generated
	 */
	EAttribute getSecrets_AppID();

	/**
	 * Returns the meta object for class '{@link daprdesigner.StateManagement <em>State Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Management</em>'.
	 * @see daprdesigner.StateManagement
	 * @generated
	 */
	EClass getStateManagement();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.StateManagement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see daprdesigner.StateManagement#getName()
	 * @see #getStateManagement()
	 * @generated
	 */
	EAttribute getStateManagement_Name();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.StateManagement#getAppID <em>App ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>App ID</em>'.
	 * @see daprdesigner.StateManagement#getAppID()
	 * @see #getStateManagement()
	 * @generated
	 */
	EAttribute getStateManagement_AppID();

	/**
	 * Returns the meta object for class '{@link daprdesigner.DistributedLocks <em>Distributed Locks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distributed Locks</em>'.
	 * @see daprdesigner.DistributedLocks
	 * @generated
	 */
	EClass getDistributedLocks();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.DistributedLocks#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see daprdesigner.DistributedLocks#getName()
	 * @see #getDistributedLocks()
	 * @generated
	 */
	EAttribute getDistributedLocks_Name();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.DistributedLocks#getAppID <em>App ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>App ID</em>'.
	 * @see daprdesigner.DistributedLocks#getAppID()
	 * @see #getDistributedLocks()
	 * @generated
	 */
	EAttribute getDistributedLocks_AppID();

	/**
	 * Returns the meta object for class '{@link daprdesigner.CryptoGraphy <em>Crypto Graphy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crypto Graphy</em>'.
	 * @see daprdesigner.CryptoGraphy
	 * @generated
	 */
	EClass getCryptoGraphy();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.CryptoGraphy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see daprdesigner.CryptoGraphy#getName()
	 * @see #getCryptoGraphy()
	 * @generated
	 */
	EAttribute getCryptoGraphy_Name();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.CryptoGraphy#getAppID <em>App ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>App ID</em>'.
	 * @see daprdesigner.CryptoGraphy#getAppID()
	 * @see #getCryptoGraphy()
	 * @generated
	 */
	EAttribute getCryptoGraphy_AppID();

	/**
	 * Returns the meta object for enum '{@link daprdesigner.ResiliencyTargetType <em>Resiliency Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resiliency Target Type</em>'.
	 * @see daprdesigner.ResiliencyTargetType
	 * @generated
	 */
	EEnum getResiliencyTargetType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DaprdesignerFactory getDaprdesignerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link daprdesigner.impl.EStringToStringMapEntryImpl <em>EString To String Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.EStringToStringMapEntryImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getEStringToStringMapEntry()
		 * @generated
		 */
		EClass ESTRING_TO_STRING_MAP_ENTRY = eINSTANCE.getEStringToStringMapEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRING_TO_STRING_MAP_ENTRY__KEY = eINSTANCE.getEStringToStringMapEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRING_TO_STRING_MAP_ENTRY__VALUE = eINSTANCE.getEStringToStringMapEntry_Value();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.DaprArchitectureImpl <em>Dapr Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.DaprArchitectureImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getDaprArchitecture()
		 * @generated
		 */
		EClass DAPR_ARCHITECTURE = eINSTANCE.getDaprArchitecture();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAPR_ARCHITECTURE__NAME = eINSTANCE.getDaprArchitecture_Name();

		/**
		 * The meta object literal for the '<em><b>Environments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAPR_ARCHITECTURE__ENVIRONMENTS = eINSTANCE.getDaprArchitecture_Environments();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.EnvironmentImpl <em>Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.EnvironmentImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getEnvironment()
		 * @generated
		 */
		EClass ENVIRONMENT = eINSTANCE.getEnvironment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT__NAME = eINSTANCE.getEnvironment_Name();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__NAMESPACE = eINSTANCE.getEnvironment_Namespace();

		/**
		 * The meta object literal for the '<em><b>Trustdomain</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__TRUSTDOMAIN = eINSTANCE.getEnvironment_Trustdomain();

		/**
		 * The meta object literal for the '<em><b>Buildingblocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__BUILDINGBLOCKS = eINSTANCE.getEnvironment_Buildingblocks();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.NamespaceImpl <em>Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.NamespaceImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getNamespace()
		 * @generated
		 */
		EClass NAMESPACE = eINSTANCE.getNamespace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMESPACE__NAME = eINSTANCE.getNamespace_Name();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.TrustdomainImpl <em>Trustdomain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.TrustdomainImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getTrustdomain()
		 * @generated
		 */
		EClass TRUSTDOMAIN = eINSTANCE.getTrustdomain();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRUSTDOMAIN__NAME = eINSTANCE.getTrustdomain_Name();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.BuildingBlockImpl <em>Building Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.BuildingBlockImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getBuildingBlock()
		 * @generated
		 */
		EClass BUILDING_BLOCK = eINSTANCE.getBuildingBlock();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDING_BLOCK__NAMESPACE = eINSTANCE.getBuildingBlock_Namespace();

		/**
		 * The meta object literal for the '<em><b>Trust Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDING_BLOCK__TRUST_DOMAIN = eINSTANCE.getBuildingBlock_TrustDomain();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.ServicesImpl <em>Services</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.ServicesImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getServices()
		 * @generated
		 */
		EClass SERVICES = eINSTANCE.getServices();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICES__NAME = eINSTANCE.getServices_Name();

		/**
		 * The meta object literal for the '<em><b>Apps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICES__APPS = eINSTANCE.getServices_Apps();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.AppImpl <em>App</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.AppImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getApp()
		 * @generated
		 */
		EClass APP = eINSTANCE.getApp();

		/**
		 * The meta object literal for the '<em><b>App Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP__APP_ID = eINSTANCE.getApp_AppId();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__NAMESPACE = eINSTANCE.getApp_Namespace();

		/**
		 * The meta object literal for the '<em><b>Trust Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__TRUST_DOMAIN = eINSTANCE.getApp_TrustDomain();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__CONFIGURATION = eINSTANCE.getApp_Configuration();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.AppConfigurationImpl <em>App Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.AppConfigurationImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getAppConfiguration()
		 * @generated
		 */
		EClass APP_CONFIGURATION = eINSTANCE.getAppConfiguration();

		/**
		 * The meta object literal for the '<em><b>Api Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_CONFIGURATION__API_VERSION = eINSTANCE.getAppConfiguration_ApiVersion();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_CONFIGURATION__KIND = eINSTANCE.getAppConfiguration_Kind();

		/**
		 * The meta object literal for the '<em><b>Metadata name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_CONFIGURATION__METADATA_NAME = eINSTANCE.getAppConfiguration_Metadata_name();

		/**
		 * The meta object literal for the '<em><b>Metadata namespace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_CONFIGURATION__METADATA_NAMESPACE = eINSTANCE.getAppConfiguration_Metadata_namespace();

		/**
		 * The meta object literal for the '<em><b>Access Control</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_CONFIGURATION__ACCESS_CONTROL = eINSTANCE.getAppConfiguration_AccessControl();

		/**
		 * The meta object literal for the '<em><b>Api Control</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_CONFIGURATION__API_CONTROL = eINSTANCE.getAppConfiguration_ApiControl();

		/**
		 * The meta object literal for the '<em><b>Middleware Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_CONFIGURATION__MIDDLEWARE_CONFIGURATION = eINSTANCE
				.getAppConfiguration_MiddlewareConfiguration();

		/**
		 * The meta object literal for the '<em><b>Logging Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_CONFIGURATION__LOGGING_CONFIGURATION = eINSTANCE.getAppConfiguration_LoggingConfiguration();

		/**
		 * The meta object literal for the '<em><b>Name Resolution Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_CONFIGURATION__NAME_RESOLUTION_CONFIGURATION = eINSTANCE
				.getAppConfiguration_NameResolutionConfiguration();

		/**
		 * The meta object literal for the '<em><b>Secrets Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_CONFIGURATION__SECRETS_CONFIGURATION = eINSTANCE.getAppConfiguration_SecretsConfiguration();

		/**
		 * The meta object literal for the '<em><b>Metrics Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_CONFIGURATION__METRICS_CONFIGURATION = eINSTANCE.getAppConfiguration_MetricsConfiguration();

		/**
		 * The meta object literal for the '<em><b>Tracing Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_CONFIGURATION__TRACING_CONFIGURATION = eINSTANCE.getAppConfiguration_TracingConfiguration();

		/**
		 * The meta object literal for the '<em><b>Components Deny List</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_CONFIGURATION__COMPONENTS_DENY_LIST = eINSTANCE.getAppConfiguration_ComponentsDenyList();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.LoggingConfigurationImpl <em>Logging Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.LoggingConfigurationImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getLoggingConfiguration()
		 * @generated
		 */
		EClass LOGGING_CONFIGURATION = eINSTANCE.getLoggingConfiguration();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGGING_CONFIGURATION__ENABLED = eINSTANCE.getLoggingConfiguration_Enabled();

		/**
		 * The meta object literal for the '<em><b>Obfuscate UR Ls</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGGING_CONFIGURATION__OBFUSCATE_UR_LS = eINSTANCE.getLoggingConfiguration_ObfuscateURLs();

		/**
		 * The meta object literal for the '<em><b>Omit Health Checks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGGING_CONFIGURATION__OMIT_HEALTH_CHECKS = eINSTANCE.getLoggingConfiguration_OmitHealthChecks();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.NameResolutionConfigurationImpl <em>Name Resolution Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.NameResolutionConfigurationImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getNameResolutionConfiguration()
		 * @generated
		 */
		EClass NAME_RESOLUTION_CONFIGURATION = eINSTANCE.getNameResolutionConfiguration();

		/**
		 * The meta object literal for the '<em><b>Component Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_RESOLUTION_CONFIGURATION__COMPONENT_NAME = eINSTANCE
				.getNameResolutionConfiguration_ComponentName();

		/**
		 * The meta object literal for the '<em><b>Component Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_RESOLUTION_CONFIGURATION__COMPONENT_VERSION = eINSTANCE
				.getNameResolutionConfiguration_ComponentVersion();

		/**
		 * The meta object literal for the '<em><b>Configuration Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_RESOLUTION_CONFIGURATION__CONFIGURATION_KEY = eINSTANCE
				.getNameResolutionConfiguration_ConfigurationKey();

		/**
		 * The meta object literal for the '<em><b>Configuration Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_RESOLUTION_CONFIGURATION__CONFIGURATION_VALUE = eINSTANCE
				.getNameResolutionConfiguration_ConfigurationValue();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.SecretsConfigurationImpl <em>Secrets Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.SecretsConfigurationImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getSecretsConfiguration()
		 * @generated
		 */
		EClass SECRETS_CONFIGURATION = eINSTANCE.getSecretsConfiguration();

		/**
		 * The meta object literal for the '<em><b>Allowed List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECRETS_CONFIGURATION__ALLOWED_LIST = eINSTANCE.getSecretsConfiguration_AllowedList();

		/**
		 * The meta object literal for the '<em><b>Denied List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECRETS_CONFIGURATION__DENIED_LIST = eINSTANCE.getSecretsConfiguration_DeniedList();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.SecretsListImpl <em>Secrets List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.SecretsListImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getSecretsList()
		 * @generated
		 */
		EClass SECRETS_LIST = eINSTANCE.getSecretsList();

		/**
		 * The meta object literal for the '<em><b>Store Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECRETS_LIST__STORE_NAME = eINSTANCE.getSecretsList_StoreName();

		/**
		 * The meta object literal for the '<em><b>Default Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECRETS_LIST__DEFAULT_ACCESS = eINSTANCE.getSecretsList_DefaultAccess();

		/**
		 * The meta object literal for the '<em><b>Secrets</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECRETS_LIST__SECRETS = eINSTANCE.getSecretsList_Secrets();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.MetricsConfigurationImpl <em>Metrics Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.MetricsConfigurationImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getMetricsConfiguration()
		 * @generated
		 */
		EClass METRICS_CONFIGURATION = eINSTANCE.getMetricsConfiguration();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRICS_CONFIGURATION__ENABLED = eINSTANCE.getMetricsConfiguration_Enabled();

		/**
		 * The meta object literal for the '<em><b>Latency Distribution Buckets</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRICS_CONFIGURATION__LATENCY_DISTRIBUTION_BUCKETS = eINSTANCE
				.getMetricsConfiguration_LatencyDistributionBuckets();

		/**
		 * The meta object literal for the '<em><b>Http increased Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRICS_CONFIGURATION__HTTP_INCREASED_CARDINALITY = eINSTANCE
				.getMetricsConfiguration_Http_increasedCardinality();

		/**
		 * The meta object literal for the '<em><b>Http path Matching</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRICS_CONFIGURATION__HTTP_PATH_MATCHING = eINSTANCE.getMetricsConfiguration_Http_pathMatching();

		/**
		 * The meta object literal for the '<em><b>Http exclude Verbs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRICS_CONFIGURATION__HTTP_EXCLUDE_VERBS = eINSTANCE.getMetricsConfiguration_Http_excludeVerbs();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.APIAccessControlImpl <em>API Access Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.APIAccessControlImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getAPIAccessControl()
		 * @generated
		 */
		EClass API_ACCESS_CONTROL = eINSTANCE.getAPIAccessControl();

		/**
		 * The meta object literal for the '<em><b>Allowed AP Is</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API_ACCESS_CONTROL__ALLOWED_AP_IS = eINSTANCE.getAPIAccessControl_AllowedAPIs();

		/**
		 * The meta object literal for the '<em><b>Denied AP Is</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API_ACCESS_CONTROL__DENIED_AP_IS = eINSTANCE.getAPIAccessControl_DeniedAPIs();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.APIImpl <em>API</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.APIImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getAPI()
		 * @generated
		 */
		EClass API = eINSTANCE.getAPI();

		/**
		 * The meta object literal for the '<em><b>Api name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API__API_NAME = eINSTANCE.getAPI_Api_name();

		/**
		 * The meta object literal for the '<em><b>Api version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API__API_VERSION = eINSTANCE.getAPI_Api_version();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API__PROTOCOL = eINSTANCE.getAPI_Protocol();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.AppAccessControlImpl <em>App Access Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.AppAccessControlImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getAppAccessControl()
		 * @generated
		 */
		EClass APP_ACCESS_CONTROL = eINSTANCE.getAppAccessControl();

		/**
		 * The meta object literal for the '<em><b>Default Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_ACCESS_CONTROL__DEFAULT_ACTION = eINSTANCE.getAppAccessControl_DefaultAction();

		/**
		 * The meta object literal for the '<em><b>Trust Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_ACCESS_CONTROL__TRUST_DOMAIN = eINSTANCE.getAppAccessControl_TrustDomain();

		/**
		 * The meta object literal for the '<em><b>Policies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_ACCESS_CONTROL__POLICIES = eINSTANCE.getAppAccessControl_Policies();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.AppPolicyImpl <em>App Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.AppPolicyImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getAppPolicy()
		 * @generated
		 */
		EClass APP_POLICY = eINSTANCE.getAppPolicy();

		/**
		 * The meta object literal for the '<em><b>App</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_POLICY__APP = eINSTANCE.getAppPolicy_App();

		/**
		 * The meta object literal for the '<em><b>Default Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_POLICY__DEFAULT_ACTION = eINSTANCE.getAppPolicy_DefaultAction();

		/**
		 * The meta object literal for the '<em><b>Trust Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_POLICY__TRUST_DOMAIN = eINSTANCE.getAppPolicy_TrustDomain();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_POLICY__NAMESPACE = eINSTANCE.getAppPolicy_Namespace();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_POLICY__OPERATIONS = eINSTANCE.getAppPolicy_Operations();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.OperationImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__PROTOCOL = eINSTANCE.getOperation_Protocol();

		/**
		 * The meta object literal for the '<em><b>Operation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__OPERATION_NAME = eINSTANCE.getOperation_OperationName();

		/**
		 * The meta object literal for the '<em><b>Verbs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__VERBS = eINSTANCE.getOperation_Verbs();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__ACTION = eINSTANCE.getOperation_Action();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.MiddlewareConfigurationImpl <em>Middleware Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.MiddlewareConfigurationImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getMiddlewareConfiguration()
		 * @generated
		 */
		EClass MIDDLEWARE_CONFIGURATION = eINSTANCE.getMiddlewareConfiguration();

		/**
		 * The meta object literal for the '<em><b>Incoming Handler</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIDDLEWARE_CONFIGURATION__INCOMING_HANDLER = eINSTANCE.getMiddlewareConfiguration_IncomingHandler();

		/**
		 * The meta object literal for the '<em><b>Outgoing Handler</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIDDLEWARE_CONFIGURATION__OUTGOING_HANDLER = eINSTANCE.getMiddlewareConfiguration_OutgoingHandler();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.HttpHandlerImpl <em>Http Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.HttpHandlerImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getHttpHandler()
		 * @generated
		 */
		EClass HTTP_HANDLER = eINSTANCE.getHttpHandler();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_HANDLER__NAME = eINSTANCE.getHttpHandler_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_HANDLER__TYPE = eINSTANCE.getHttpHandler_Type();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.TracingConfigurationImpl <em>Tracing Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.TracingConfigurationImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getTracingConfiguration()
		 * @generated
		 */
		EClass TRACING_CONFIGURATION = eINSTANCE.getTracingConfiguration();

		/**
		 * The meta object literal for the '<em><b>Sampling Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACING_CONFIGURATION__SAMPLING_RATE = eINSTANCE.getTracingConfiguration_SamplingRate();

		/**
		 * The meta object literal for the '<em><b>Stdout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACING_CONFIGURATION__STDOUT = eINSTANCE.getTracingConfiguration_Stdout();

		/**
		 * The meta object literal for the '<em><b>Otel end Point Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACING_CONFIGURATION__OTEL_END_POINT_ADDRESS = eINSTANCE
				.getTracingConfiguration_Otel_endPointAddress();

		/**
		 * The meta object literal for the '<em><b>Otel is Secure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACING_CONFIGURATION__OTEL_IS_SECURE = eINSTANCE.getTracingConfiguration_Otel_isSecure();

		/**
		 * The meta object literal for the '<em><b>Otel protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACING_CONFIGURATION__OTEL_PROTOCOL = eINSTANCE.getTracingConfiguration_Otel_protocol();

		/**
		 * The meta object literal for the '<em><b>Zipkin end Point Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACING_CONFIGURATION__ZIPKIN_END_POINT_ADDRESS = eINSTANCE
				.getTracingConfiguration_Zipkin_endPointAddress();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.SubscriptionConfigurationImpl <em>Subscription Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.SubscriptionConfigurationImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getSubscriptionConfiguration()
		 * @generated
		 */
		EClass SUBSCRIPTION_CONFIGURATION = eINSTANCE.getSubscriptionConfiguration();

		/**
		 * The meta object literal for the '<em><b>Api Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION_CONFIGURATION__API_VERSION = eINSTANCE.getSubscriptionConfiguration_ApiVersion();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION_CONFIGURATION__KIND = eINSTANCE.getSubscriptionConfiguration_Kind();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION_CONFIGURATION__NAME = eINSTANCE.getSubscriptionConfiguration_Name();

		/**
		 * The meta object literal for the '<em><b>Topic Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION_CONFIGURATION__TOPIC_NAME = eINSTANCE.getSubscriptionConfiguration_TopicName();

		/**
		 * The meta object literal for the '<em><b>Route Rules</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPTION_CONFIGURATION__ROUTE_RULES = eINSTANCE.getSubscriptionConfiguration_RouteRules();

		/**
		 * The meta object literal for the '<em><b>Pubsubname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION_CONFIGURATION__PUBSUBNAME = eINSTANCE.getSubscriptionConfiguration_Pubsubname();

		/**
		 * The meta object literal for the '<em><b>Dead Letter Topic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION_CONFIGURATION__DEAD_LETTER_TOPIC = eINSTANCE
				.getSubscriptionConfiguration_DeadLetterTopic();

		/**
		 * The meta object literal for the '<em><b>Bulk Subscribe enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION_CONFIGURATION__BULK_SUBSCRIBE_ENABLED = eINSTANCE
				.getSubscriptionConfiguration_BulkSubscribe_enabled();

		/**
		 * The meta object literal for the '<em><b>Bulk Subscribe max Messages Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION_CONFIGURATION__BULK_SUBSCRIBE_MAX_MESSAGES_COUNT = eINSTANCE
				.getSubscriptionConfiguration_BulkSubscribe_maxMessagesCount();

		/**
		 * The meta object literal for the '<em><b>Bulk Subscribe max Await Duration Ms</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION_CONFIGURATION__BULK_SUBSCRIBE_MAX_AWAIT_DURATION_MS = eINSTANCE
				.getSubscriptionConfiguration_BulkSubscribe_maxAwaitDurationMs();

		/**
		 * The meta object literal for the '<em><b>Scopes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPTION_CONFIGURATION__SCOPES = eINSTANCE.getSubscriptionConfiguration_Scopes();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.RouteRulesImpl <em>Route Rules</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.RouteRulesImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getRouteRules()
		 * @generated
		 */
		EClass ROUTE_RULES = eINSTANCE.getRouteRules();

		/**
		 * The meta object literal for the '<em><b>Match</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE_RULES__MATCH = eINSTANCE.getRouteRules_Match();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE_RULES__PATH = eINSTANCE.getRouteRules_Path();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.ResiliencyConfigurationImpl <em>Resiliency Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.ResiliencyConfigurationImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getResiliencyConfiguration()
		 * @generated
		 */
		EClass RESILIENCY_CONFIGURATION = eINSTANCE.getResiliencyConfiguration();

		/**
		 * The meta object literal for the '<em><b>Api Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESILIENCY_CONFIGURATION__API_VERSION = eINSTANCE.getResiliencyConfiguration_ApiVersion();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESILIENCY_CONFIGURATION__KIND = eINSTANCE.getResiliencyConfiguration_Kind();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESILIENCY_CONFIGURATION__NAME = eINSTANCE.getResiliencyConfiguration_Name();

		/**
		 * The meta object literal for the '<em><b>Scopes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESILIENCY_CONFIGURATION__SCOPES = eINSTANCE.getResiliencyConfiguration_Scopes();

		/**
		 * The meta object literal for the '<em><b>Policy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESILIENCY_CONFIGURATION__POLICY = eINSTANCE.getResiliencyConfiguration_Policy();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESILIENCY_CONFIGURATION__TARGETS = eINSTANCE.getResiliencyConfiguration_Targets();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.ResiliencyPolicyImpl <em>Resiliency Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.ResiliencyPolicyImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getResiliencyPolicy()
		 * @generated
		 */
		EClass RESILIENCY_POLICY = eINSTANCE.getResiliencyPolicy();

		/**
		 * The meta object literal for the '<em><b>Retries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESILIENCY_POLICY__RETRIES = eINSTANCE.getResiliencyPolicy_Retries();

		/**
		 * The meta object literal for the '<em><b>Circuitbreakers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESILIENCY_POLICY__CIRCUITBREAKERS = eINSTANCE.getResiliencyPolicy_Circuitbreakers();

		/**
		 * The meta object literal for the '<em><b>Timeouts</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESILIENCY_POLICY__TIMEOUTS = eINSTANCE.getResiliencyPolicy_Timeouts();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.ResiliencyTimeoutImpl <em>Resiliency Timeout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.ResiliencyTimeoutImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getResiliencyTimeout()
		 * @generated
		 */
		EClass RESILIENCY_TIMEOUT = eINSTANCE.getResiliencyTimeout();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESILIENCY_TIMEOUT__NAME = eINSTANCE.getResiliencyTimeout_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESILIENCY_TIMEOUT__VALUE = eINSTANCE.getResiliencyTimeout_Value();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.RetryPolicyImpl <em>Retry Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.RetryPolicyImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getRetryPolicy()
		 * @generated
		 */
		EClass RETRY_POLICY = eINSTANCE.getRetryPolicy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETRY_POLICY__NAME = eINSTANCE.getRetryPolicy_Name();

		/**
		 * The meta object literal for the '<em><b>Policy type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETRY_POLICY__POLICY_TYPE = eINSTANCE.getRetryPolicy_Policy_type();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETRY_POLICY__DURATION = eINSTANCE.getRetryPolicy_Duration();

		/**
		 * The meta object literal for the '<em><b>Max Retries</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETRY_POLICY__MAX_RETRIES = eINSTANCE.getRetryPolicy_MaxRetries();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.CircuitBreakerPolicyImpl <em>Circuit Breaker Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.CircuitBreakerPolicyImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getCircuitBreakerPolicy()
		 * @generated
		 */
		EClass CIRCUIT_BREAKER_POLICY = eINSTANCE.getCircuitBreakerPolicy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCUIT_BREAKER_POLICY__NAME = eINSTANCE.getCircuitBreakerPolicy_Name();

		/**
		 * The meta object literal for the '<em><b>Max Requests</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCUIT_BREAKER_POLICY__MAX_REQUESTS = eINSTANCE.getCircuitBreakerPolicy_MaxRequests();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCUIT_BREAKER_POLICY__INTERVAL = eINSTANCE.getCircuitBreakerPolicy_Interval();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCUIT_BREAKER_POLICY__TIMEOUT = eINSTANCE.getCircuitBreakerPolicy_Timeout();

		/**
		 * The meta object literal for the '<em><b>Trip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCUIT_BREAKER_POLICY__TRIP = eINSTANCE.getCircuitBreakerPolicy_Trip();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.ResiliencyTargetImpl <em>Resiliency Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.ResiliencyTargetImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getResiliencyTarget()
		 * @generated
		 */
		EClass RESILIENCY_TARGET = eINSTANCE.getResiliencyTarget();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESILIENCY_TARGET__TYPE = eINSTANCE.getResiliencyTarget_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESILIENCY_TARGET__NAME = eINSTANCE.getResiliencyTarget_Name();

		/**
		 * The meta object literal for the '<em><b>Circuit Breaker</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESILIENCY_TARGET__CIRCUIT_BREAKER = eINSTANCE.getResiliencyTarget_CircuitBreaker();

		/**
		 * The meta object literal for the '<em><b>Retry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESILIENCY_TARGET__RETRY = eINSTANCE.getResiliencyTarget_Retry();

		/**
		 * The meta object literal for the '<em><b>Circuit Breaker Cache Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESILIENCY_TARGET__CIRCUIT_BREAKER_CACHE_SIZE = eINSTANCE
				.getResiliencyTarget_CircuitBreakerCacheSize();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESILIENCY_TARGET__TIMEOUT = eINSTANCE.getResiliencyTarget_Timeout();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.HTTPEndPointImpl <em>HTTP End Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.HTTPEndPointImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getHTTPEndPoint()
		 * @generated
		 */
		EClass HTTP_END_POINT = eINSTANCE.getHTTPEndPoint();

		/**
		 * The meta object literal for the '<em><b>Api Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_END_POINT__API_VERSION = eINSTANCE.getHTTPEndPoint_ApiVersion();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_END_POINT__KIND = eINSTANCE.getHTTPEndPoint_Kind();

		/**
		 * The meta object literal for the '<em><b>Auth</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_END_POINT__AUTH = eINSTANCE.getHTTPEndPoint_Auth();

		/**
		 * The meta object literal for the '<em><b>Metadata name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_END_POINT__METADATA_NAME = eINSTANCE.getHTTPEndPoint_Metadata_name();

		/**
		 * The meta object literal for the '<em><b>Base Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_END_POINT__BASE_URL = eINSTANCE.getHTTPEndPoint_BaseUrl();

		/**
		 * The meta object literal for the '<em><b>Scopes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_END_POINT__SCOPES = eINSTANCE.getHTTPEndPoint_Scopes();

		/**
		 * The meta object literal for the '<em><b>Headers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_END_POINT__HEADERS = eINSTANCE.getHTTPEndPoint_Headers();

		/**
		 * The meta object literal for the '<em><b>Client TLS root CA</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_END_POINT__CLIENT_TLS_ROOT_CA = eINSTANCE.getHTTPEndPoint_ClientTLS_rootCA();

		/**
		 * The meta object literal for the '<em><b>Client TLS certificate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_END_POINT__CLIENT_TLS_CERTIFICATE = eINSTANCE.getHTTPEndPoint_ClientTLS_certificate();

		/**
		 * The meta object literal for the '<em><b>Client TLS private Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_END_POINT__CLIENT_TLS_PRIVATE_KEY = eINSTANCE.getHTTPEndPoint_ClientTLS_privateKey();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.ComponentImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Api Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__API_VERSION = eINSTANCE.getComponent_ApiVersion();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__KIND = eINSTANCE.getComponent_Kind();

		/**
		 * The meta object literal for the '<em><b>Auth</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__AUTH = eINSTANCE.getComponent_Auth();

		/**
		 * The meta object literal for the '<em><b>Metadata name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__METADATA_NAME = eINSTANCE.getComponent_Metadata_name();

		/**
		 * The meta object literal for the '<em><b>Metadata namespace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__METADATA_NAMESPACE = eINSTANCE.getComponent_Metadata_namespace();

		/**
		 * The meta object literal for the '<em><b>Spec</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__SPEC = eINSTANCE.getComponent_Spec();

		/**
		 * The meta object literal for the '<em><b>Scopes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__SCOPES = eINSTANCE.getComponent_Scopes();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.ComponentSpecImpl <em>Component Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.ComponentSpecImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getComponentSpec()
		 * @generated
		 */
		EClass COMPONENT_SPEC = eINSTANCE.getComponentSpec();

		/**
		 * The meta object literal for the '<em><b>Ignore Errors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_SPEC__IGNORE_ERRORS = eINSTANCE.getComponentSpec_IgnoreErrors();

		/**
		 * The meta object literal for the '<em><b>Init Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_SPEC__INIT_TIMEOUT = eINSTANCE.getComponentSpec_InitTimeout();

		/**
		 * The meta object literal for the '<em><b>Spec metadata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_SPEC__SPEC_METADATA = eINSTANCE.getComponentSpec_Spec_metadata();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.SpecMetadataImpl <em>Spec Metadata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.SpecMetadataImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getSpecMetadata()
		 * @generated
		 */
		EClass SPEC_METADATA = eINSTANCE.getSpecMetadata();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_METADATA__NAME = eINSTANCE.getSpecMetadata_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_METADATA__VALUE = eINSTANCE.getSpecMetadata_Value();

		/**
		 * The meta object literal for the '<em><b>Is Fetched From Secret</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_METADATA__IS_FETCHED_FROM_SECRET = eINSTANCE.getSpecMetadata_IsFetchedFromSecret();

		/**
		 * The meta object literal for the '<em><b>Is Fetched From Environment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_METADATA__IS_FETCHED_FROM_ENVIRONMENT = eINSTANCE.getSpecMetadata_IsFetchedFromEnvironment();

		/**
		 * The meta object literal for the '<em><b>Secret Key Ref Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_METADATA__SECRET_KEY_REF_NAME = eINSTANCE.getSpecMetadata_SecretKeyRefName();

		/**
		 * The meta object literal for the '<em><b>Secret Key Ref Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_METADATA__SECRET_KEY_REF_KEY = eINSTANCE.getSpecMetadata_SecretKeyRefKey();

		/**
		 * The meta object literal for the '<em><b>Env Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_METADATA__ENV_REF = eINSTANCE.getSpecMetadata_EnvRef();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.SecretStoreImpl <em>Secret Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.SecretStoreImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getSecretStore()
		 * @generated
		 */
		EClass SECRET_STORE = eINSTANCE.getSecretStore();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.HashicorpVaultImpl <em>Hashicorp Vault</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.HashicorpVaultImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getHashicorpVault()
		 * @generated
		 */
		EClass HASHICORP_VAULT = eINSTANCE.getHashicorpVault();

		/**
		 * The meta object literal for the '<em><b>Spec type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HASHICORP_VAULT__SPEC_TYPE = eINSTANCE.getHashicorpVault_Spec_type();

		/**
		 * The meta object literal for the '<em><b>Spec version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HASHICORP_VAULT__SPEC_VERSION = eINSTANCE.getHashicorpVault_Spec_version();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.MessageBrokerImpl <em>Message Broker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.MessageBrokerImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getMessageBroker()
		 * @generated
		 */
		EClass MESSAGE_BROKER = eINSTANCE.getMessageBroker();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.PubSubImpl <em>Pub Sub</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.PubSubImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getPubSub()
		 * @generated
		 */
		EClass PUB_SUB = eINSTANCE.getPubSub();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUB_SUB__NAME = eINSTANCE.getPubSub_Name();

		/**
		 * The meta object literal for the '<em><b>Mbrokers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUB_SUB__MBROKERS = eINSTANCE.getPubSub_Mbrokers();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.BindingsImpl <em>Bindings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.BindingsImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getBindings()
		 * @generated
		 */
		EClass BINDINGS = eINSTANCE.getBindings();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDINGS__NAME = eINSTANCE.getBindings_Name();

		/**
		 * The meta object literal for the '<em><b>App ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDINGS__APP_ID = eINSTANCE.getBindings_AppID();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.JobsImpl <em>Jobs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.JobsImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getJobs()
		 * @generated
		 */
		EClass JOBS = eINSTANCE.getJobs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOBS__NAME = eINSTANCE.getJobs_Name();

		/**
		 * The meta object literal for the '<em><b>App ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOBS__APP_ID = eINSTANCE.getJobs_AppID();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.ConfigurationImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__NAME = eINSTANCE.getConfiguration_Name();

		/**
		 * The meta object literal for the '<em><b>App ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__APP_ID = eINSTANCE.getConfiguration_AppID();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.WorkflowImpl <em>Workflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.WorkflowImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getWorkflow()
		 * @generated
		 */
		EClass WORKFLOW = eINSTANCE.getWorkflow();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW__NAME = eINSTANCE.getWorkflow_Name();

		/**
		 * The meta object literal for the '<em><b>App ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW__APP_ID = eINSTANCE.getWorkflow_AppID();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.ActorsImpl <em>Actors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.ActorsImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getActors()
		 * @generated
		 */
		EClass ACTORS = eINSTANCE.getActors();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTORS__NAME = eINSTANCE.getActors_Name();

		/**
		 * The meta object literal for the '<em><b>App ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTORS__APP_ID = eINSTANCE.getActors_AppID();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.SecretsImpl <em>Secrets</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.SecretsImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getSecrets()
		 * @generated
		 */
		EClass SECRETS = eINSTANCE.getSecrets();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECRETS__NAME = eINSTANCE.getSecrets_Name();

		/**
		 * The meta object literal for the '<em><b>App ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECRETS__APP_ID = eINSTANCE.getSecrets_AppID();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.StateManagementImpl <em>State Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.StateManagementImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getStateManagement()
		 * @generated
		 */
		EClass STATE_MANAGEMENT = eINSTANCE.getStateManagement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_MANAGEMENT__NAME = eINSTANCE.getStateManagement_Name();

		/**
		 * The meta object literal for the '<em><b>App ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_MANAGEMENT__APP_ID = eINSTANCE.getStateManagement_AppID();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.DistributedLocksImpl <em>Distributed Locks</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.DistributedLocksImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getDistributedLocks()
		 * @generated
		 */
		EClass DISTRIBUTED_LOCKS = eINSTANCE.getDistributedLocks();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTED_LOCKS__NAME = eINSTANCE.getDistributedLocks_Name();

		/**
		 * The meta object literal for the '<em><b>App ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTED_LOCKS__APP_ID = eINSTANCE.getDistributedLocks_AppID();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.CryptoGraphyImpl <em>Crypto Graphy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.CryptoGraphyImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getCryptoGraphy()
		 * @generated
		 */
		EClass CRYPTO_GRAPHY = eINSTANCE.getCryptoGraphy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRYPTO_GRAPHY__NAME = eINSTANCE.getCryptoGraphy_Name();

		/**
		 * The meta object literal for the '<em><b>App ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRYPTO_GRAPHY__APP_ID = eINSTANCE.getCryptoGraphy_AppID();

		/**
		 * The meta object literal for the '{@link daprdesigner.ResiliencyTargetType <em>Resiliency Target Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.ResiliencyTargetType
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getResiliencyTargetType()
		 * @generated
		 */
		EEnum RESILIENCY_TARGET_TYPE = eINSTANCE.getResiliencyTargetType();

	}

} //DaprdesignerPackage
