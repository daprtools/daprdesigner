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
	 * The feature id for the '<em><b>Buildingblocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAPR_ARCHITECTURE__BUILDINGBLOCKS = 1;

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
	 * The meta object id for the '{@link daprdesigner.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.BlockImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__NOTES = 2;

	/**
	 * The feature id for the '<em><b>Block Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__BLOCK_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Subblocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__SUBBLOCKS = 4;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__NODES = 5;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.DaprNodeImpl <em>Dapr Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.DaprNodeImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getDaprNode()
	 * @generated
	 */
	int DAPR_NODE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAPR_NODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAPR_NODE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAPR_NODE__NOTES = 2;

	/**
	 * The number of structural features of the '<em>Dapr Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAPR_NODE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Dapr Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAPR_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.NodeBlocksImpl <em>Node Blocks</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.NodeBlocksImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getNodeBlocks()
	 * @generated
	 */
	int NODE_BLOCKS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_BLOCKS__NAME = DAPR_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_BLOCKS__DESCRIPTION = DAPR_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_BLOCKS__NOTES = DAPR_NODE__NOTES;

	/**
	 * The feature id for the '<em><b>Node Block Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_BLOCKS__NODE_BLOCK_TYPE = DAPR_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_BLOCKS__NODES = DAPR_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Node Blocks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_BLOCKS_FEATURE_COUNT = DAPR_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Node Blocks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_BLOCKS_OPERATION_COUNT = DAPR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.NamespaceImpl <em>Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.NamespaceImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getNamespace()
	 * @generated
	 */
	int NAMESPACE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__NAME = DAPR_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__DESCRIPTION = DAPR_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__NOTES = DAPR_NODE__NOTES;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__HELP = DAPR_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_FEATURE_COUNT = DAPR_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_OPERATION_COUNT = DAPR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.TrustdomainImpl <em>Trustdomain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.TrustdomainImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getTrustdomain()
	 * @generated
	 */
	int TRUSTDOMAIN = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTDOMAIN__NAME = DAPR_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTDOMAIN__DESCRIPTION = DAPR_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTDOMAIN__NOTES = DAPR_NODE__NOTES;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTDOMAIN__HELP = DAPR_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trustdomain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTDOMAIN_FEATURE_COUNT = DAPR_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trustdomain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTDOMAIN_OPERATION_COUNT = DAPR_NODE_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__NAME = DAPR_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__DESCRIPTION = DAPR_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__NOTES = DAPR_NODE__NOTES;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__HELP = DAPR_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>App Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__APP_ID = DAPR_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__REPOSITORY = DAPR_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sdk Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__SDK_LANGUAGE = DAPR_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__NAMESPACE = DAPR_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Trust Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__TRUST_DOMAIN = DAPR_NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__CONFIGURATIONS = DAPR_NODE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_FEATURE_COUNT = DAPR_NODE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_OPERATION_COUNT = DAPR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.ActorImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = APP__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__DESCRIPTION = APP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NOTES = APP__NOTES;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__HELP = APP__HELP;

	/**
	 * The feature id for the '<em><b>App Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__APP_ID = APP__APP_ID;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__REPOSITORY = APP__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Sdk Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__SDK_LANGUAGE = APP__SDK_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAMESPACE = APP__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Trust Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__TRUST_DOMAIN = APP__TRUST_DOMAIN;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__CONFIGURATIONS = APP__CONFIGURATIONS;

	/**
	 * The feature id for the '<em><b>Additional Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ADDITIONAL_HELP = APP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = APP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = APP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.WorkflowImpl <em>Workflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.WorkflowImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getWorkflow()
	 * @generated
	 */
	int WORKFLOW = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__NAME = APP__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__DESCRIPTION = APP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__NOTES = APP__NOTES;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__HELP = APP__HELP;

	/**
	 * The feature id for the '<em><b>App Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__APP_ID = APP__APP_ID;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__REPOSITORY = APP__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Sdk Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__SDK_LANGUAGE = APP__SDK_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__NAMESPACE = APP__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Trust Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__TRUST_DOMAIN = APP__TRUST_DOMAIN;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__CONFIGURATIONS = APP__CONFIGURATIONS;

	/**
	 * The feature id for the '<em><b>Additional Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__ADDITIONAL_HELP = APP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_FEATURE_COUNT = APP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_OPERATION_COUNT = APP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.AppConfigurationImpl <em>App Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.AppConfigurationImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getAppConfiguration()
	 * @generated
	 */
	int APP_CONFIGURATION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_CONFIGURATION__NAME = DAPR_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_CONFIGURATION__DESCRIPTION = DAPR_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_CONFIGURATION__NOTES = DAPR_NODE__NOTES;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_CONFIGURATION__API_VERSION = DAPR_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_CONFIGURATION__KIND = DAPR_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>App Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_CONFIGURATION_FEATURE_COUNT = DAPR_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>App Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_CONFIGURATION_OPERATION_COUNT = DAPR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.DeniedComponentsConfigurationImpl <em>Denied Components Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.DeniedComponentsConfigurationImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getDeniedComponentsConfiguration()
	 * @generated
	 */
	int DENIED_COMPONENTS_CONFIGURATION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENIED_COMPONENTS_CONFIGURATION__NAME = APP_CONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENIED_COMPONENTS_CONFIGURATION__DESCRIPTION = APP_CONFIGURATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENIED_COMPONENTS_CONFIGURATION__NOTES = APP_CONFIGURATION__NOTES;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENIED_COMPONENTS_CONFIGURATION__API_VERSION = APP_CONFIGURATION__API_VERSION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENIED_COMPONENTS_CONFIGURATION__KIND = APP_CONFIGURATION__KIND;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENIED_COMPONENTS_CONFIGURATION__HELP = APP_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Denied Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENIED_COMPONENTS_CONFIGURATION__DENIED_COMPONENTS = APP_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Denied Components Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENIED_COMPONENTS_CONFIGURATION_FEATURE_COUNT = APP_CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Denied Components Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENIED_COMPONENTS_CONFIGURATION_OPERATION_COUNT = APP_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.LoggingConfigurationImpl <em>Logging Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.LoggingConfigurationImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getLoggingConfiguration()
	 * @generated
	 */
	int LOGGING_CONFIGURATION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGING_CONFIGURATION__NAME = APP_CONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGING_CONFIGURATION__DESCRIPTION = APP_CONFIGURATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGING_CONFIGURATION__NOTES = APP_CONFIGURATION__NOTES;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGING_CONFIGURATION__API_VERSION = APP_CONFIGURATION__API_VERSION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGING_CONFIGURATION__KIND = APP_CONFIGURATION__KIND;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGING_CONFIGURATION__HELP = APP_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGING_CONFIGURATION__ENABLED = APP_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Obfuscate Urls</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGING_CONFIGURATION__OBFUSCATE_URLS = APP_CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Omit Health Checks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGING_CONFIGURATION__OMIT_HEALTH_CHECKS = APP_CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Logging Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGING_CONFIGURATION_FEATURE_COUNT = APP_CONFIGURATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Logging Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGING_CONFIGURATION_OPERATION_COUNT = APP_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.NameResolutionConfigurationImpl <em>Name Resolution Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.NameResolutionConfigurationImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getNameResolutionConfiguration()
	 * @generated
	 */
	int NAME_RESOLUTION_CONFIGURATION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_RESOLUTION_CONFIGURATION__NAME = APP_CONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_RESOLUTION_CONFIGURATION__DESCRIPTION = APP_CONFIGURATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_RESOLUTION_CONFIGURATION__NOTES = APP_CONFIGURATION__NOTES;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_RESOLUTION_CONFIGURATION__API_VERSION = APP_CONFIGURATION__API_VERSION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_RESOLUTION_CONFIGURATION__KIND = APP_CONFIGURATION__KIND;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_RESOLUTION_CONFIGURATION__HELP = APP_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_RESOLUTION_CONFIGURATION__COMPONENT = APP_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_RESOLUTION_CONFIGURATION__COMPONENT_VERSION = APP_CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Configuration Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_RESOLUTION_CONFIGURATION__CONFIGURATION_KEY = APP_CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Configuration Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_RESOLUTION_CONFIGURATION__CONFIGURATION_VALUE = APP_CONFIGURATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Name Resolution Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_RESOLUTION_CONFIGURATION_FEATURE_COUNT = APP_CONFIGURATION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Name Resolution Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_RESOLUTION_CONFIGURATION_OPERATION_COUNT = APP_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.SecretsAccessConfigurationImpl <em>Secrets Access Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.SecretsAccessConfigurationImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getSecretsAccessConfiguration()
	 * @generated
	 */
	int SECRETS_ACCESS_CONFIGURATION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS_ACCESS_CONFIGURATION__NAME = APP_CONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS_ACCESS_CONFIGURATION__DESCRIPTION = APP_CONFIGURATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS_ACCESS_CONFIGURATION__NOTES = APP_CONFIGURATION__NOTES;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS_ACCESS_CONFIGURATION__API_VERSION = APP_CONFIGURATION__API_VERSION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS_ACCESS_CONFIGURATION__KIND = APP_CONFIGURATION__KIND;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS_ACCESS_CONFIGURATION__HELP = APP_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS_ACCESS_CONFIGURATION__ACCESS_LIST = APP_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Secrets Access Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS_ACCESS_CONFIGURATION_FEATURE_COUNT = APP_CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Secrets Access Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS_ACCESS_CONFIGURATION_OPERATION_COUNT = APP_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.SecretsAccessListImpl <em>Secrets Access List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.SecretsAccessListImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getSecretsAccessList()
	 * @generated
	 */
	int SECRETS_ACCESS_LIST = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS_ACCESS_LIST__NAME = DAPR_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS_ACCESS_LIST__DESCRIPTION = DAPR_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS_ACCESS_LIST__NOTES = DAPR_NODE__NOTES;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS_ACCESS_LIST__HELP = DAPR_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS_ACCESS_LIST__COMPONENT = DAPR_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS_ACCESS_LIST__DEFAULT_ACCESS = DAPR_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Secrets</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS_ACCESS_LIST__SECRETS = DAPR_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS_ACCESS_LIST__ACTION = DAPR_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Secrets Access List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS_ACCESS_LIST_FEATURE_COUNT = DAPR_NODE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Secrets Access List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS_ACCESS_LIST_OPERATION_COUNT = DAPR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.MetricsConfigurationImpl <em>Metrics Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.MetricsConfigurationImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getMetricsConfiguration()
	 * @generated
	 */
	int METRICS_CONFIGURATION = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRICS_CONFIGURATION__NAME = APP_CONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRICS_CONFIGURATION__DESCRIPTION = APP_CONFIGURATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRICS_CONFIGURATION__NOTES = APP_CONFIGURATION__NOTES;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRICS_CONFIGURATION__API_VERSION = APP_CONFIGURATION__API_VERSION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRICS_CONFIGURATION__KIND = APP_CONFIGURATION__KIND;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRICS_CONFIGURATION__HELP = APP_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRICS_CONFIGURATION__ENABLED = APP_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Latency Distribution Buckets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRICS_CONFIGURATION__LATENCY_DISTRIBUTION_BUCKETS = APP_CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Http increased Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRICS_CONFIGURATION__HTTP_INCREASED_CARDINALITY = APP_CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Http path Matching</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRICS_CONFIGURATION__HTTP_PATH_MATCHING = APP_CONFIGURATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Http exclude Verbs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRICS_CONFIGURATION__HTTP_EXCLUDE_VERBS = APP_CONFIGURATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Metrics Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRICS_CONFIGURATION_FEATURE_COUNT = APP_CONFIGURATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Metrics Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRICS_CONFIGURATION_OPERATION_COUNT = APP_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.APIAccessControlImpl <em>API Access Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.APIAccessControlImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getAPIAccessControl()
	 * @generated
	 */
	int API_ACCESS_CONTROL = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_ACCESS_CONTROL__NAME = APP_CONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_ACCESS_CONTROL__DESCRIPTION = APP_CONFIGURATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_ACCESS_CONTROL__NOTES = APP_CONFIGURATION__NOTES;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_ACCESS_CONTROL__API_VERSION = APP_CONFIGURATION__API_VERSION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_ACCESS_CONTROL__KIND = APP_CONFIGURATION__KIND;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_ACCESS_CONTROL__HELP = APP_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Api List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_ACCESS_CONTROL__API_LIST = APP_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>API Access Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_ACCESS_CONTROL_FEATURE_COUNT = APP_CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>API Access Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_ACCESS_CONTROL_OPERATION_COUNT = APP_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.APIImpl <em>API</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.APIImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getAPI()
	 * @generated
	 */
	int API = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__NAME = DAPR_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__DESCRIPTION = DAPR_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__NOTES = DAPR_NODE__NOTES;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__HELP = DAPR_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Api Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__API_TYPE = DAPR_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Api version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__API_VERSION = DAPR_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__PROTOCOL = DAPR_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__ACCESS = DAPR_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>API</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_FEATURE_COUNT = DAPR_NODE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>API</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_OPERATION_COUNT = DAPR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.AppAccessControlImpl <em>App Access Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.AppAccessControlImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getAppAccessControl()
	 * @generated
	 */
	int APP_ACCESS_CONTROL = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_ACCESS_CONTROL__NAME = APP_CONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_ACCESS_CONTROL__DESCRIPTION = APP_CONFIGURATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_ACCESS_CONTROL__NOTES = APP_CONFIGURATION__NOTES;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_ACCESS_CONTROL__API_VERSION = APP_CONFIGURATION__API_VERSION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_ACCESS_CONTROL__KIND = APP_CONFIGURATION__KIND;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_ACCESS_CONTROL__HELP = APP_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_ACCESS_CONTROL__DEFAULT_ACTION = APP_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Trust Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_ACCESS_CONTROL__TRUST_DOMAIN = APP_CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Policies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_ACCESS_CONTROL__POLICIES = APP_CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>App Access Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_ACCESS_CONTROL_FEATURE_COUNT = APP_CONFIGURATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>App Access Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_ACCESS_CONTROL_OPERATION_COUNT = APP_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.AppPolicyImpl <em>App Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.AppPolicyImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getAppPolicy()
	 * @generated
	 */
	int APP_POLICY = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_POLICY__NAME = DAPR_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_POLICY__DESCRIPTION = DAPR_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_POLICY__NOTES = DAPR_NODE__NOTES;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_POLICY__HELP = DAPR_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>App</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_POLICY__APP = DAPR_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_POLICY__DEFAULT_ACTION = DAPR_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trust Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_POLICY__TRUST_DOMAIN = DAPR_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_POLICY__NAMESPACE = DAPR_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_POLICY__OPERATIONS = DAPR_NODE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>App Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_POLICY_FEATURE_COUNT = DAPR_NODE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>App Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_POLICY_OPERATION_COUNT = DAPR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.OperationImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = DAPR_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__DESCRIPTION = DAPR_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NOTES = DAPR_NODE__NOTES;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__HELP = DAPR_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PROTOCOL = DAPR_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OPERATION_NAME = DAPR_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Apply To Get</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__APPLY_TO_GET = DAPR_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Apply To Post</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__APPLY_TO_POST = DAPR_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Apply To Put</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__APPLY_TO_PUT = DAPR_NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Apply To Delete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__APPLY_TO_DELETE = DAPR_NODE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Apply To Patch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__APPLY_TO_PATCH = DAPR_NODE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ACTION = DAPR_NODE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = DAPR_NODE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = DAPR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.MiddlewareConfigurationImpl <em>Middleware Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.MiddlewareConfigurationImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getMiddlewareConfiguration()
	 * @generated
	 */
	int MIDDLEWARE_CONFIGURATION = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE_CONFIGURATION__NAME = APP_CONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE_CONFIGURATION__DESCRIPTION = APP_CONFIGURATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE_CONFIGURATION__NOTES = APP_CONFIGURATION__NOTES;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE_CONFIGURATION__API_VERSION = APP_CONFIGURATION__API_VERSION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE_CONFIGURATION__KIND = APP_CONFIGURATION__KIND;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE_CONFIGURATION__HELP = APP_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Http Handlers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE_CONFIGURATION__HTTP_HANDLERS = APP_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Middleware Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE_CONFIGURATION_FEATURE_COUNT = APP_CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Middleware Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE_CONFIGURATION_OPERATION_COUNT = APP_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.HttpHandlerImpl <em>Http Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.HttpHandlerImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getHttpHandler()
	 * @generated
	 */
	int HTTP_HANDLER = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_HANDLER__NAME = DAPR_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_HANDLER__DESCRIPTION = DAPR_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_HANDLER__NOTES = DAPR_NODE__NOTES;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_HANDLER__HELP = DAPR_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Handler Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_HANDLER__HANDLER_NAME = DAPR_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_HANDLER__TYPE = DAPR_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Handler Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_HANDLER__HANDLER_TYPE = DAPR_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Http Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_HANDLER_FEATURE_COUNT = DAPR_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Http Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_HANDLER_OPERATION_COUNT = DAPR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.TracingConfigurationImpl <em>Tracing Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.TracingConfigurationImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getTracingConfiguration()
	 * @generated
	 */
	int TRACING_CONFIGURATION = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_CONFIGURATION__NAME = APP_CONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_CONFIGURATION__DESCRIPTION = APP_CONFIGURATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_CONFIGURATION__NOTES = APP_CONFIGURATION__NOTES;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_CONFIGURATION__API_VERSION = APP_CONFIGURATION__API_VERSION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_CONFIGURATION__KIND = APP_CONFIGURATION__KIND;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_CONFIGURATION__HELP = APP_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sampling Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_CONFIGURATION__SAMPLING_RATE = APP_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Stdout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_CONFIGURATION__STDOUT = APP_CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Otel end Point Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_CONFIGURATION__OTEL_END_POINT_ADDRESS = APP_CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Otel is Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_CONFIGURATION__OTEL_IS_SECURE = APP_CONFIGURATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Otel protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_CONFIGURATION__OTEL_PROTOCOL = APP_CONFIGURATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Zipkin end Point Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_CONFIGURATION__ZIPKIN_END_POINT_ADDRESS = APP_CONFIGURATION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Tracing Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_CONFIGURATION_FEATURE_COUNT = APP_CONFIGURATION_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Tracing Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_CONFIGURATION_OPERATION_COUNT = APP_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.SubscriptionConfigurationImpl <em>Subscription Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.SubscriptionConfigurationImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getSubscriptionConfiguration()
	 * @generated
	 */
	int SUBSCRIPTION_CONFIGURATION = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_CONFIGURATION__NAME = DAPR_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_CONFIGURATION__DESCRIPTION = DAPR_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_CONFIGURATION__NOTES = DAPR_NODE__NOTES;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_CONFIGURATION__HELP = DAPR_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_CONFIGURATION__API_VERSION = DAPR_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_CONFIGURATION__KIND = DAPR_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Topic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_CONFIGURATION__TOPIC_NAME = DAPR_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Route Rules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_CONFIGURATION__ROUTE_RULES = DAPR_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Pubsub</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_CONFIGURATION__PUBSUB = DAPR_NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Dead Letter Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_CONFIGURATION__DEAD_LETTER_TOPIC = DAPR_NODE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Bulk Subscribe enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_CONFIGURATION__BULK_SUBSCRIBE_ENABLED = DAPR_NODE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Bulk Subscribe max Messages Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_CONFIGURATION__BULK_SUBSCRIBE_MAX_MESSAGES_COUNT = DAPR_NODE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Bulk Subscribe max Await Durations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_CONFIGURATION__BULK_SUBSCRIBE_MAX_AWAIT_DURATIONS = DAPR_NODE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_CONFIGURATION__SCOPES = DAPR_NODE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Subscription Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_CONFIGURATION_FEATURE_COUNT = DAPR_NODE_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Subscription Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_CONFIGURATION_OPERATION_COUNT = DAPR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.RouteRulesImpl <em>Route Rules</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.RouteRulesImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getRouteRules()
	 * @generated
	 */
	int ROUTE_RULES = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_RULES__NAME = DAPR_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_RULES__DESCRIPTION = DAPR_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_RULES__NOTES = DAPR_NODE__NOTES;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_RULES__HELP = DAPR_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_RULES__MATCH = DAPR_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_RULES__PATH = DAPR_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Route Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_RULES_FEATURE_COUNT = DAPR_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Route Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_RULES_OPERATION_COUNT = DAPR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.ResiliencyConfigurationImpl <em>Resiliency Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.ResiliencyConfigurationImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getResiliencyConfiguration()
	 * @generated
	 */
	int RESILIENCY_CONFIGURATION = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_CONFIGURATION__NAME = DAPR_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_CONFIGURATION__DESCRIPTION = DAPR_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_CONFIGURATION__NOTES = DAPR_NODE__NOTES;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_CONFIGURATION__HELP = DAPR_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_CONFIGURATION__API_VERSION = DAPR_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_CONFIGURATION__KIND = DAPR_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_CONFIGURATION__VERSION = DAPR_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_CONFIGURATION__SCOPES = DAPR_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Policy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_CONFIGURATION__POLICY = DAPR_NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Resiliency Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_CONFIGURATION__RESILIENCY_TARGETS = DAPR_NODE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Resiliency Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_CONFIGURATION_FEATURE_COUNT = DAPR_NODE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Resiliency Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_CONFIGURATION_OPERATION_COUNT = DAPR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.ResiliencyPolicyImpl <em>Resiliency Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.ResiliencyPolicyImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getResiliencyPolicy()
	 * @generated
	 */
	int RESILIENCY_POLICY = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_POLICY__NAME = DAPR_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_POLICY__DESCRIPTION = DAPR_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_POLICY__NOTES = DAPR_NODE__NOTES;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_POLICY__HELP = DAPR_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Retries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_POLICY__RETRIES = DAPR_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Circuit Breakers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_POLICY__CIRCUIT_BREAKERS = DAPR_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Timeout Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_POLICY__TIMEOUT_DEFINITIONS = DAPR_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Resiliency Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_POLICY_FEATURE_COUNT = DAPR_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Resiliency Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_POLICY_OPERATION_COUNT = DAPR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.RetryPolicyImpl <em>Retry Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.RetryPolicyImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getRetryPolicy()
	 * @generated
	 */
	int RETRY_POLICY = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_POLICY__NAME = DAPR_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_POLICY__DESCRIPTION = DAPR_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_POLICY__NOTES = DAPR_NODE__NOTES;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_POLICY__HELP = DAPR_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Policy type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_POLICY__POLICY_TYPE = DAPR_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_POLICY__DURATION = DAPR_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Retries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_POLICY__MAX_RETRIES = DAPR_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Max Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_POLICY__MAX_INTERVAL = DAPR_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Retry Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_POLICY_FEATURE_COUNT = DAPR_NODE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Retry Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_POLICY_OPERATION_COUNT = DAPR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.ResiliencyTimeoutImpl <em>Resiliency Timeout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.ResiliencyTimeoutImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getResiliencyTimeout()
	 * @generated
	 */
	int RESILIENCY_TIMEOUT = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_TIMEOUT__NAME = DAPR_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_TIMEOUT__DESCRIPTION = DAPR_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_TIMEOUT__NOTES = DAPR_NODE__NOTES;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_TIMEOUT__HELP = DAPR_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time Out In Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_TIMEOUT__TIME_OUT_IN_SECONDS = DAPR_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resiliency Timeout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_TIMEOUT_FEATURE_COUNT = DAPR_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Resiliency Timeout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_TIMEOUT_OPERATION_COUNT = DAPR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.CircuitBreakerPolicyImpl <em>Circuit Breaker Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.CircuitBreakerPolicyImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getCircuitBreakerPolicy()
	 * @generated
	 */
	int CIRCUIT_BREAKER_POLICY = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BREAKER_POLICY__NAME = DAPR_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BREAKER_POLICY__DESCRIPTION = DAPR_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BREAKER_POLICY__NOTES = DAPR_NODE__NOTES;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BREAKER_POLICY__HELP = DAPR_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Requests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BREAKER_POLICY__MAX_REQUESTS = DAPR_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BREAKER_POLICY__INTERVAL = DAPR_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BREAKER_POLICY__TIMEOUT = DAPR_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Trip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BREAKER_POLICY__TRIP = DAPR_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Circuit Breaker Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BREAKER_POLICY_FEATURE_COUNT = DAPR_NODE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Circuit Breaker Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BREAKER_POLICY_OPERATION_COUNT = DAPR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.ResiliencyTargetImpl <em>Resiliency Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.ResiliencyTargetImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getResiliencyTarget()
	 * @generated
	 */
	int RESILIENCY_TARGET = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_TARGET__NAME = DAPR_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_TARGET__DESCRIPTION = DAPR_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_TARGET__NOTES = DAPR_NODE__NOTES;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_TARGET__HELP = DAPR_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_TARGET__TYPE = DAPR_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Circuit Breaker Cache Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_TARGET__CIRCUIT_BREAKER_CACHE_SIZE = DAPR_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Circuit Breaker</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_TARGET__CIRCUIT_BREAKER = DAPR_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Retry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_TARGET__RETRY = DAPR_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_TARGET__TIMEOUT = DAPR_NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Apps Actors Or Workflows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_TARGET__APPS_ACTORS_OR_WORKFLOWS = DAPR_NODE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_TARGET__COMPONENTS = DAPR_NODE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Resiliency Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_TARGET_FEATURE_COUNT = DAPR_NODE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Resiliency Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESILIENCY_TARGET_OPERATION_COUNT = DAPR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.HTTPEndPointImpl <em>HTTP End Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.HTTPEndPointImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getHTTPEndPoint()
	 * @generated
	 */
	int HTTP_END_POINT = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_END_POINT__NAME = DAPR_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_END_POINT__DESCRIPTION = DAPR_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_END_POINT__NOTES = DAPR_NODE__NOTES;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_END_POINT__HELP = DAPR_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_END_POINT__API_VERSION = DAPR_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_END_POINT__KIND = DAPR_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Base Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_END_POINT__BASE_URL = DAPR_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Auth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_END_POINT__AUTH = DAPR_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_END_POINT__SCOPES = DAPR_NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Spec Headers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_END_POINT__SPEC_HEADERS = DAPR_NODE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Spec Root CA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_END_POINT__SPEC_ROOT_CA = DAPR_NODE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Spec Certificate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_END_POINT__SPEC_CERTIFICATE = DAPR_NODE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Spec Private Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_END_POINT__SPEC_PRIVATE_KEY = DAPR_NODE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>HTTP End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_END_POINT_FEATURE_COUNT = DAPR_NODE_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>HTTP End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_END_POINT_OPERATION_COUNT = DAPR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.ComponentImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = DAPR_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DESCRIPTION = DAPR_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NOTES = DAPR_NODE__NOTES;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__API_VERSION = DAPR_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__KIND = DAPR_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Provider Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PROVIDER_NAME = DAPR_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Auth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__AUTH = DAPR_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Metadata namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__METADATA_NAMESPACE = DAPR_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SPEC = DAPR_NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SCOPES = DAPR_NODE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = DAPR_NODE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = DAPR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.ComponentSpecImpl <em>Component Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.ComponentSpecImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getComponentSpec()
	 * @generated
	 */
	int COMPONENT_SPEC = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SPEC__NAME = DAPR_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SPEC__DESCRIPTION = DAPR_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SPEC__NOTES = DAPR_NODE__NOTES;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SPEC__HELP = DAPR_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ignore Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SPEC__IGNORE_ERRORS = DAPR_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Init Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SPEC__INIT_TIMEOUT = DAPR_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Spec metadata</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SPEC__SPEC_METADATA = DAPR_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Component Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SPEC_FEATURE_COUNT = DAPR_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Component Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SPEC_OPERATION_COUNT = DAPR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.SpecMetadataImpl <em>Spec Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.SpecMetadataImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getSpecMetadata()
	 * @generated
	 */
	int SPEC_METADATA = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_METADATA__NAME = DAPR_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_METADATA__DESCRIPTION = DAPR_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_METADATA__NOTES = DAPR_NODE__NOTES;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_METADATA__HELP = DAPR_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_METADATA__VALUE = DAPR_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Fetched From Secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_METADATA__IS_FETCHED_FROM_SECRET = DAPR_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Fetched From Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_METADATA__IS_FETCHED_FROM_ENVIRONMENT = DAPR_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Secret Key Ref Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_METADATA__SECRET_KEY_REF_NAME = DAPR_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Secret Key Ref Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_METADATA__SECRET_KEY_REF_KEY = DAPR_NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Env Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_METADATA__ENV_REF = DAPR_NODE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Spec Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_METADATA_FEATURE_COUNT = DAPR_NODE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Spec Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_METADATA_OPERATION_COUNT = DAPR_NODE_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUB_SUB__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUB_SUB__DESCRIPTION = COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUB_SUB__NOTES = COMPONENT__NOTES;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUB_SUB__API_VERSION = COMPONENT__API_VERSION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUB_SUB__KIND = COMPONENT__KIND;

	/**
	 * The feature id for the '<em><b>Provider Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUB_SUB__PROVIDER_NAME = COMPONENT__PROVIDER_NAME;

	/**
	 * The feature id for the '<em><b>Auth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUB_SUB__AUTH = COMPONENT__AUTH;

	/**
	 * The feature id for the '<em><b>Metadata namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUB_SUB__METADATA_NAMESPACE = COMPONENT__METADATA_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUB_SUB__SPEC = COMPONENT__SPEC;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUB_SUB__SCOPES = COMPONENT__SCOPES;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUB_SUB__HELP = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pub Sub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUB_SUB_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pub Sub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUB_SUB_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDINGS__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDINGS__DESCRIPTION = COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDINGS__NOTES = COMPONENT__NOTES;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDINGS__API_VERSION = COMPONENT__API_VERSION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDINGS__KIND = COMPONENT__KIND;

	/**
	 * The feature id for the '<em><b>Provider Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDINGS__PROVIDER_NAME = COMPONENT__PROVIDER_NAME;

	/**
	 * The feature id for the '<em><b>Auth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDINGS__AUTH = COMPONENT__AUTH;

	/**
	 * The feature id for the '<em><b>Metadata namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDINGS__METADATA_NAMESPACE = COMPONENT__METADATA_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDINGS__SPEC = COMPONENT__SPEC;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDINGS__SCOPES = COMPONENT__SCOPES;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDINGS__HELP = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bindings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDINGS_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bindings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDINGS_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.SecretStoreImpl <em>Secret Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.SecretStoreImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getSecretStore()
	 * @generated
	 */
	int SECRET_STORE = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET_STORE__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET_STORE__DESCRIPTION = COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET_STORE__NOTES = COMPONENT__NOTES;

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
	 * The feature id for the '<em><b>Provider Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET_STORE__PROVIDER_NAME = COMPONENT__PROVIDER_NAME;

	/**
	 * The feature id for the '<em><b>Auth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET_STORE__AUTH = COMPONENT__AUTH;

	/**
	 * The feature id for the '<em><b>Metadata namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET_STORE__METADATA_NAMESPACE = COMPONENT__METADATA_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Spec</b></em>' reference.
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
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET_STORE__HELP = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Secret Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET_STORE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Secret Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET_STORE_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.StateStoreImpl <em>State Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.StateStoreImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getStateStore()
	 * @generated
	 */
	int STATE_STORE = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_STORE__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_STORE__DESCRIPTION = COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_STORE__NOTES = COMPONENT__NOTES;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_STORE__API_VERSION = COMPONENT__API_VERSION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_STORE__KIND = COMPONENT__KIND;

	/**
	 * The feature id for the '<em><b>Provider Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_STORE__PROVIDER_NAME = COMPONENT__PROVIDER_NAME;

	/**
	 * The feature id for the '<em><b>Auth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_STORE__AUTH = COMPONENT__AUTH;

	/**
	 * The feature id for the '<em><b>Metadata namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_STORE__METADATA_NAMESPACE = COMPONENT__METADATA_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_STORE__SPEC = COMPONENT__SPEC;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_STORE__SCOPES = COMPONENT__SCOPES;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_STORE__HELP = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>State Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_STORE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>State Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_STORE_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.ConfigurationStoreImpl <em>Configuration Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.ConfigurationStoreImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getConfigurationStore()
	 * @generated
	 */
	int CONFIGURATION_STORE = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_STORE__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_STORE__DESCRIPTION = COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_STORE__NOTES = COMPONENT__NOTES;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_STORE__API_VERSION = COMPONENT__API_VERSION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_STORE__KIND = COMPONENT__KIND;

	/**
	 * The feature id for the '<em><b>Provider Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_STORE__PROVIDER_NAME = COMPONENT__PROVIDER_NAME;

	/**
	 * The feature id for the '<em><b>Auth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_STORE__AUTH = COMPONENT__AUTH;

	/**
	 * The feature id for the '<em><b>Metadata namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_STORE__METADATA_NAMESPACE = COMPONENT__METADATA_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_STORE__SPEC = COMPONENT__SPEC;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_STORE__SCOPES = COMPONENT__SCOPES;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_STORE__HELP = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Configuration Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_STORE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Configuration Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_STORE_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.LocksImpl <em>Locks</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.LocksImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getLocks()
	 * @generated
	 */
	int LOCKS = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCKS__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCKS__DESCRIPTION = COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCKS__NOTES = COMPONENT__NOTES;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCKS__API_VERSION = COMPONENT__API_VERSION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCKS__KIND = COMPONENT__KIND;

	/**
	 * The feature id for the '<em><b>Provider Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCKS__PROVIDER_NAME = COMPONENT__PROVIDER_NAME;

	/**
	 * The feature id for the '<em><b>Auth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCKS__AUTH = COMPONENT__AUTH;

	/**
	 * The feature id for the '<em><b>Metadata namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCKS__METADATA_NAMESPACE = COMPONENT__METADATA_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCKS__SPEC = COMPONENT__SPEC;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCKS__SCOPES = COMPONENT__SCOPES;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCKS__HELP = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Locks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCKS_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Locks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCKS_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.CryptographyImpl <em>Cryptography</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.CryptographyImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getCryptography()
	 * @generated
	 */
	int CRYPTOGRAPHY = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTOGRAPHY__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTOGRAPHY__DESCRIPTION = COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTOGRAPHY__NOTES = COMPONENT__NOTES;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTOGRAPHY__API_VERSION = COMPONENT__API_VERSION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTOGRAPHY__KIND = COMPONENT__KIND;

	/**
	 * The feature id for the '<em><b>Provider Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTOGRAPHY__PROVIDER_NAME = COMPONENT__PROVIDER_NAME;

	/**
	 * The feature id for the '<em><b>Auth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTOGRAPHY__AUTH = COMPONENT__AUTH;

	/**
	 * The feature id for the '<em><b>Metadata namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTOGRAPHY__METADATA_NAMESPACE = COMPONENT__METADATA_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTOGRAPHY__SPEC = COMPONENT__SPEC;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTOGRAPHY__SCOPES = COMPONENT__SCOPES;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTOGRAPHY__HELP = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cryptography</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTOGRAPHY_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cryptography</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTOGRAPHY_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.MiddlewareImpl <em>Middleware</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.MiddlewareImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getMiddleware()
	 * @generated
	 */
	int MIDDLEWARE = 44;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE__DESCRIPTION = COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE__NOTES = COMPONENT__NOTES;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE__API_VERSION = COMPONENT__API_VERSION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE__KIND = COMPONENT__KIND;

	/**
	 * The feature id for the '<em><b>Provider Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE__PROVIDER_NAME = COMPONENT__PROVIDER_NAME;

	/**
	 * The feature id for the '<em><b>Auth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE__AUTH = COMPONENT__AUTH;

	/**
	 * The feature id for the '<em><b>Metadata namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE__METADATA_NAMESPACE = COMPONENT__METADATA_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE__SPEC = COMPONENT__SPEC;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE__SCOPES = COMPONENT__SCOPES;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE__HELP = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Middleware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Middleware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.impl.NameresolutionImpl <em>Nameresolution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.impl.NameresolutionImpl
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getNameresolution()
	 * @generated
	 */
	int NAMERESOLUTION = 45;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMERESOLUTION__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMERESOLUTION__DESCRIPTION = COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMERESOLUTION__NOTES = COMPONENT__NOTES;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMERESOLUTION__API_VERSION = COMPONENT__API_VERSION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMERESOLUTION__KIND = COMPONENT__KIND;

	/**
	 * The feature id for the '<em><b>Provider Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMERESOLUTION__PROVIDER_NAME = COMPONENT__PROVIDER_NAME;

	/**
	 * The feature id for the '<em><b>Auth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMERESOLUTION__AUTH = COMPONENT__AUTH;

	/**
	 * The feature id for the '<em><b>Metadata namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMERESOLUTION__METADATA_NAMESPACE = COMPONENT__METADATA_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMERESOLUTION__SPEC = COMPONENT__SPEC;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMERESOLUTION__SCOPES = COMPONENT__SCOPES;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMERESOLUTION__HELP = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Nameresolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMERESOLUTION_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Nameresolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMERESOLUTION_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daprdesigner.AccessAction <em>Access Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.AccessAction
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getAccessAction()
	 * @generated
	 */
	int ACCESS_ACTION = 46;

	/**
	 * The meta object id for the '{@link daprdesigner.RetryPolicyType <em>Retry Policy Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.RetryPolicyType
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getRetryPolicyType()
	 * @generated
	 */
	int RETRY_POLICY_TYPE = 47;

	/**
	 * The meta object id for the '{@link daprdesigner.HttpHandlerType <em>Http Handler Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.HttpHandlerType
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getHttpHandlerType()
	 * @generated
	 */
	int HTTP_HANDLER_TYPE = 48;

	/**
	 * The meta object id for the '{@link daprdesigner.ResiliencyTargetType <em>Resiliency Target Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.ResiliencyTargetType
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getResiliencyTargetType()
	 * @generated
	 */
	int RESILIENCY_TARGET_TYPE = 49;

	/**
	 * The meta object id for the '{@link daprdesigner.BlockType <em>Block Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.BlockType
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getBlockType()
	 * @generated
	 */
	int BLOCK_TYPE = 50;

	/**
	 * The meta object id for the '{@link daprdesigner.NodeBlockType <em>Node Block Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.NodeBlockType
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getNodeBlockType()
	 * @generated
	 */
	int NODE_BLOCK_TYPE = 51;

	/**
	 * The meta object id for the '{@link daprdesigner.APIType <em>API Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.APIType
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getAPIType()
	 * @generated
	 */
	int API_TYPE = 52;

	/**
	 * The meta object id for the '{@link daprdesigner.SDKLanguage <em>SDK Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.SDKLanguage
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getSDKLanguage()
	 * @generated
	 */
	int SDK_LANGUAGE = 53;

	/**
	 * The meta object id for the '{@link daprdesigner.Protocol <em>Protocol</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.Protocol
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getProtocol()
	 * @generated
	 */
	int PROTOCOL = 54;

	/**
	 * The meta object id for the '{@link daprdesigner.Verb <em>Verb</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daprdesigner.Verb
	 * @see daprdesigner.impl.DaprdesignerPackageImpl#getVerb()
	 * @generated
	 */
	int VERB = 55;

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
	 * Returns the meta object for the containment reference list '{@link daprdesigner.DaprArchitecture#getBuildingblocks <em>Buildingblocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Buildingblocks</em>'.
	 * @see daprdesigner.DaprArchitecture#getBuildingblocks()
	 * @see #getDaprArchitecture()
	 * @generated
	 */
	EReference getDaprArchitecture_Buildingblocks();

	/**
	 * Returns the meta object for class '{@link daprdesigner.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see daprdesigner.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.Block#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see daprdesigner.Block#getName()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Name();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.Block#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see daprdesigner.Block#getDescription()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Description();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.Block#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see daprdesigner.Block#getNotes()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Notes();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.Block#getBlockType <em>Block Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block Type</em>'.
	 * @see daprdesigner.Block#getBlockType()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_BlockType();

	/**
	 * Returns the meta object for the containment reference list '{@link daprdesigner.Block#getSubblocks <em>Subblocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subblocks</em>'.
	 * @see daprdesigner.Block#getSubblocks()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Subblocks();

	/**
	 * Returns the meta object for the containment reference list '{@link daprdesigner.Block#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see daprdesigner.Block#getNodes()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Nodes();

	/**
	 * Returns the meta object for class '{@link daprdesigner.DaprNode <em>Dapr Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dapr Node</em>'.
	 * @see daprdesigner.DaprNode
	 * @generated
	 */
	EClass getDaprNode();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.DaprNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see daprdesigner.DaprNode#getName()
	 * @see #getDaprNode()
	 * @generated
	 */
	EAttribute getDaprNode_Name();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.DaprNode#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see daprdesigner.DaprNode#getDescription()
	 * @see #getDaprNode()
	 * @generated
	 */
	EAttribute getDaprNode_Description();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.DaprNode#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see daprdesigner.DaprNode#getNotes()
	 * @see #getDaprNode()
	 * @generated
	 */
	EAttribute getDaprNode_Notes();

	/**
	 * Returns the meta object for class '{@link daprdesigner.NodeBlocks <em>Node Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Blocks</em>'.
	 * @see daprdesigner.NodeBlocks
	 * @generated
	 */
	EClass getNodeBlocks();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.NodeBlocks#getNodeBlockType <em>Node Block Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Block Type</em>'.
	 * @see daprdesigner.NodeBlocks#getNodeBlockType()
	 * @see #getNodeBlocks()
	 * @generated
	 */
	EAttribute getNodeBlocks_NodeBlockType();

	/**
	 * Returns the meta object for the containment reference list '{@link daprdesigner.NodeBlocks#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see daprdesigner.NodeBlocks#getNodes()
	 * @see #getNodeBlocks()
	 * @generated
	 */
	EReference getNodeBlocks_Nodes();

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
	 * Returns the meta object for the attribute '{@link daprdesigner.Namespace#getHelp <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help</em>'.
	 * @see daprdesigner.Namespace#getHelp()
	 * @see #getNamespace()
	 * @generated
	 */
	EAttribute getNamespace_Help();

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
	 * Returns the meta object for the attribute '{@link daprdesigner.Trustdomain#getHelp <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help</em>'.
	 * @see daprdesigner.Trustdomain#getHelp()
	 * @see #getTrustdomain()
	 * @generated
	 */
	EAttribute getTrustdomain_Help();

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
	 * Returns the meta object for the attribute '{@link daprdesigner.App#getHelp <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help</em>'.
	 * @see daprdesigner.App#getHelp()
	 * @see #getApp()
	 * @generated
	 */
	EAttribute getApp_Help();

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
	 * Returns the meta object for the attribute '{@link daprdesigner.App#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repository</em>'.
	 * @see daprdesigner.App#getRepository()
	 * @see #getApp()
	 * @generated
	 */
	EAttribute getApp_Repository();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.App#getSdkLanguage <em>Sdk Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sdk Language</em>'.
	 * @see daprdesigner.App#getSdkLanguage()
	 * @see #getApp()
	 * @generated
	 */
	EAttribute getApp_SdkLanguage();

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
	 * Returns the meta object for the reference list '{@link daprdesigner.App#getConfigurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Configurations</em>'.
	 * @see daprdesigner.App#getConfigurations()
	 * @see #getApp()
	 * @generated
	 */
	EReference getApp_Configurations();

	/**
	 * Returns the meta object for class '{@link daprdesigner.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see daprdesigner.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.Actor#getAdditionalHelp <em>Additional Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Help</em>'.
	 * @see daprdesigner.Actor#getAdditionalHelp()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_AdditionalHelp();

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
	 * Returns the meta object for the attribute '{@link daprdesigner.Workflow#getAdditionalHelp <em>Additional Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Help</em>'.
	 * @see daprdesigner.Workflow#getAdditionalHelp()
	 * @see #getWorkflow()
	 * @generated
	 */
	EAttribute getWorkflow_AdditionalHelp();

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
	 * Returns the meta object for class '{@link daprdesigner.DeniedComponentsConfiguration <em>Denied Components Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Denied Components Configuration</em>'.
	 * @see daprdesigner.DeniedComponentsConfiguration
	 * @generated
	 */
	EClass getDeniedComponentsConfiguration();

	/**
	 * Returns the meta object for the reference list '{@link daprdesigner.DeniedComponentsConfiguration#getDeniedComponents <em>Denied Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Denied Components</em>'.
	 * @see daprdesigner.DeniedComponentsConfiguration#getDeniedComponents()
	 * @see #getDeniedComponentsConfiguration()
	 * @generated
	 */
	EReference getDeniedComponentsConfiguration_DeniedComponents();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.DeniedComponentsConfiguration#getHelp <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help</em>'.
	 * @see daprdesigner.DeniedComponentsConfiguration#getHelp()
	 * @see #getDeniedComponentsConfiguration()
	 * @generated
	 */
	EAttribute getDeniedComponentsConfiguration_Help();

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
	 * Returns the meta object for the attribute '{@link daprdesigner.LoggingConfiguration#isObfuscateUrls <em>Obfuscate Urls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Obfuscate Urls</em>'.
	 * @see daprdesigner.LoggingConfiguration#isObfuscateUrls()
	 * @see #getLoggingConfiguration()
	 * @generated
	 */
	EAttribute getLoggingConfiguration_ObfuscateUrls();

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
	 * Returns the meta object for the attribute '{@link daprdesigner.LoggingConfiguration#getHelp <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help</em>'.
	 * @see daprdesigner.LoggingConfiguration#getHelp()
	 * @see #getLoggingConfiguration()
	 * @generated
	 */
	EAttribute getLoggingConfiguration_Help();

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
	 * Returns the meta object for the reference '{@link daprdesigner.NameResolutionConfiguration#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see daprdesigner.NameResolutionConfiguration#getComponent()
	 * @see #getNameResolutionConfiguration()
	 * @generated
	 */
	EReference getNameResolutionConfiguration_Component();

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
	 * Returns the meta object for the attribute '{@link daprdesigner.NameResolutionConfiguration#getHelp <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help</em>'.
	 * @see daprdesigner.NameResolutionConfiguration#getHelp()
	 * @see #getNameResolutionConfiguration()
	 * @generated
	 */
	EAttribute getNameResolutionConfiguration_Help();

	/**
	 * Returns the meta object for class '{@link daprdesigner.SecretsAccessConfiguration <em>Secrets Access Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secrets Access Configuration</em>'.
	 * @see daprdesigner.SecretsAccessConfiguration
	 * @generated
	 */
	EClass getSecretsAccessConfiguration();

	/**
	 * Returns the meta object for the reference list '{@link daprdesigner.SecretsAccessConfiguration#getAccessList <em>Access List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Access List</em>'.
	 * @see daprdesigner.SecretsAccessConfiguration#getAccessList()
	 * @see #getSecretsAccessConfiguration()
	 * @generated
	 */
	EReference getSecretsAccessConfiguration_AccessList();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.SecretsAccessConfiguration#getHelp <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help</em>'.
	 * @see daprdesigner.SecretsAccessConfiguration#getHelp()
	 * @see #getSecretsAccessConfiguration()
	 * @generated
	 */
	EAttribute getSecretsAccessConfiguration_Help();

	/**
	 * Returns the meta object for class '{@link daprdesigner.SecretsAccessList <em>Secrets Access List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secrets Access List</em>'.
	 * @see daprdesigner.SecretsAccessList
	 * @generated
	 */
	EClass getSecretsAccessList();

	/**
	 * Returns the meta object for the reference '{@link daprdesigner.SecretsAccessList#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see daprdesigner.SecretsAccessList#getComponent()
	 * @see #getSecretsAccessList()
	 * @generated
	 */
	EReference getSecretsAccessList_Component();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.SecretsAccessList#isDefaultAccess <em>Default Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Access</em>'.
	 * @see daprdesigner.SecretsAccessList#isDefaultAccess()
	 * @see #getSecretsAccessList()
	 * @generated
	 */
	EAttribute getSecretsAccessList_DefaultAccess();

	/**
	 * Returns the meta object for the attribute list '{@link daprdesigner.SecretsAccessList#getSecrets <em>Secrets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Secrets</em>'.
	 * @see daprdesigner.SecretsAccessList#getSecrets()
	 * @see #getSecretsAccessList()
	 * @generated
	 */
	EAttribute getSecretsAccessList_Secrets();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.SecretsAccessList#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see daprdesigner.SecretsAccessList#getAction()
	 * @see #getSecretsAccessList()
	 * @generated
	 */
	EAttribute getSecretsAccessList_Action();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.SecretsAccessList#getHelp <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help</em>'.
	 * @see daprdesigner.SecretsAccessList#getHelp()
	 * @see #getSecretsAccessList()
	 * @generated
	 */
	EAttribute getSecretsAccessList_Help();

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
	 * Returns the meta object for the attribute '{@link daprdesigner.MetricsConfiguration#getLatencyDistributionBuckets <em>Latency Distribution Buckets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latency Distribution Buckets</em>'.
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
	 * Returns the meta object for the attribute '{@link daprdesigner.MetricsConfiguration#getHelp <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help</em>'.
	 * @see daprdesigner.MetricsConfiguration#getHelp()
	 * @see #getMetricsConfiguration()
	 * @generated
	 */
	EAttribute getMetricsConfiguration_Help();

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
	 * Returns the meta object for the attribute '{@link daprdesigner.APIAccessControl#getHelp <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help</em>'.
	 * @see daprdesigner.APIAccessControl#getHelp()
	 * @see #getAPIAccessControl()
	 * @generated
	 */
	EAttribute getAPIAccessControl_Help();

	/**
	 * Returns the meta object for the reference list '{@link daprdesigner.APIAccessControl#getApiList <em>Api List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Api List</em>'.
	 * @see daprdesigner.APIAccessControl#getApiList()
	 * @see #getAPIAccessControl()
	 * @generated
	 */
	EReference getAPIAccessControl_ApiList();

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
	 * Returns the meta object for the attribute '{@link daprdesigner.API#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see daprdesigner.API#getAccess()
	 * @see #getAPI()
	 * @generated
	 */
	EAttribute getAPI_Access();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.API#getHelp <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help</em>'.
	 * @see daprdesigner.API#getHelp()
	 * @see #getAPI()
	 * @generated
	 */
	EAttribute getAPI_Help();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.API#getApiType <em>Api Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api Type</em>'.
	 * @see daprdesigner.API#getApiType()
	 * @see #getAPI()
	 * @generated
	 */
	EAttribute getAPI_ApiType();

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
	 * Returns the meta object for the reference list '{@link daprdesigner.AppAccessControl#getPolicies <em>Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Policies</em>'.
	 * @see daprdesigner.AppAccessControl#getPolicies()
	 * @see #getAppAccessControl()
	 * @generated
	 */
	EReference getAppAccessControl_Policies();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.AppAccessControl#getHelp <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help</em>'.
	 * @see daprdesigner.AppAccessControl#getHelp()
	 * @see #getAppAccessControl()
	 * @generated
	 */
	EAttribute getAppAccessControl_Help();

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
	 * Returns the meta object for the reference list '{@link daprdesigner.AppPolicy#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operations</em>'.
	 * @see daprdesigner.AppPolicy#getOperations()
	 * @see #getAppPolicy()
	 * @generated
	 */
	EReference getAppPolicy_Operations();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.AppPolicy#getHelp <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help</em>'.
	 * @see daprdesigner.AppPolicy#getHelp()
	 * @see #getAppPolicy()
	 * @generated
	 */
	EAttribute getAppPolicy_Help();

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
	 * Returns the meta object for the attribute '{@link daprdesigner.Operation#isApplyToGet <em>Apply To Get</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apply To Get</em>'.
	 * @see daprdesigner.Operation#isApplyToGet()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_ApplyToGet();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.Operation#isApplyToPost <em>Apply To Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apply To Post</em>'.
	 * @see daprdesigner.Operation#isApplyToPost()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_ApplyToPost();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.Operation#isApplyToPut <em>Apply To Put</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apply To Put</em>'.
	 * @see daprdesigner.Operation#isApplyToPut()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_ApplyToPut();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.Operation#isApplyToDelete <em>Apply To Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apply To Delete</em>'.
	 * @see daprdesigner.Operation#isApplyToDelete()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_ApplyToDelete();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.Operation#isApplyToPatch <em>Apply To Patch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apply To Patch</em>'.
	 * @see daprdesigner.Operation#isApplyToPatch()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_ApplyToPatch();

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
	 * Returns the meta object for the attribute '{@link daprdesigner.Operation#getHelp <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help</em>'.
	 * @see daprdesigner.Operation#getHelp()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Help();

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
	 * Returns the meta object for the reference list '{@link daprdesigner.MiddlewareConfiguration#getHttpHandlers <em>Http Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Http Handlers</em>'.
	 * @see daprdesigner.MiddlewareConfiguration#getHttpHandlers()
	 * @see #getMiddlewareConfiguration()
	 * @generated
	 */
	EReference getMiddlewareConfiguration_HttpHandlers();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.MiddlewareConfiguration#getHelp <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help</em>'.
	 * @see daprdesigner.MiddlewareConfiguration#getHelp()
	 * @see #getMiddlewareConfiguration()
	 * @generated
	 */
	EAttribute getMiddlewareConfiguration_Help();

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
	 * Returns the meta object for the attribute '{@link daprdesigner.HttpHandler#getHandlerName <em>Handler Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handler Name</em>'.
	 * @see daprdesigner.HttpHandler#getHandlerName()
	 * @see #getHttpHandler()
	 * @generated
	 */
	EAttribute getHttpHandler_HandlerName();

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
	 * Returns the meta object for the attribute '{@link daprdesigner.HttpHandler#getHandlerType <em>Handler Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handler Type</em>'.
	 * @see daprdesigner.HttpHandler#getHandlerType()
	 * @see #getHttpHandler()
	 * @generated
	 */
	EAttribute getHttpHandler_HandlerType();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.HttpHandler#getHelp <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help</em>'.
	 * @see daprdesigner.HttpHandler#getHelp()
	 * @see #getHttpHandler()
	 * @generated
	 */
	EAttribute getHttpHandler_Help();

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
	 * Returns the meta object for the attribute '{@link daprdesigner.TracingConfiguration#getHelp <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help</em>'.
	 * @see daprdesigner.TracingConfiguration#getHelp()
	 * @see #getTracingConfiguration()
	 * @generated
	 */
	EAttribute getTracingConfiguration_Help();

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
	 * Returns the meta object for the reference list '{@link daprdesigner.SubscriptionConfiguration#getRouteRules <em>Route Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Route Rules</em>'.
	 * @see daprdesigner.SubscriptionConfiguration#getRouteRules()
	 * @see #getSubscriptionConfiguration()
	 * @generated
	 */
	EReference getSubscriptionConfiguration_RouteRules();

	/**
	 * Returns the meta object for the reference '{@link daprdesigner.SubscriptionConfiguration#getPubsub <em>Pubsub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pubsub</em>'.
	 * @see daprdesigner.SubscriptionConfiguration#getPubsub()
	 * @see #getSubscriptionConfiguration()
	 * @generated
	 */
	EReference getSubscriptionConfiguration_Pubsub();

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
	 * Returns the meta object for the attribute '{@link daprdesigner.SubscriptionConfiguration#getBulkSubscribe_maxAwaitDurations <em>Bulk Subscribe max Await Durations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bulk Subscribe max Await Durations</em>'.
	 * @see daprdesigner.SubscriptionConfiguration#getBulkSubscribe_maxAwaitDurations()
	 * @see #getSubscriptionConfiguration()
	 * @generated
	 */
	EAttribute getSubscriptionConfiguration_BulkSubscribe_maxAwaitDurations();

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
	 * Returns the meta object for the attribute '{@link daprdesigner.SubscriptionConfiguration#getHelp <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help</em>'.
	 * @see daprdesigner.SubscriptionConfiguration#getHelp()
	 * @see #getSubscriptionConfiguration()
	 * @generated
	 */
	EAttribute getSubscriptionConfiguration_Help();

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
	 * Returns the meta object for the attribute '{@link daprdesigner.RouteRules#getHelp <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help</em>'.
	 * @see daprdesigner.RouteRules#getHelp()
	 * @see #getRouteRules()
	 * @generated
	 */
	EAttribute getRouteRules_Help();

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
	 * Returns the meta object for the attribute '{@link daprdesigner.ResiliencyConfiguration#getHelp <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help</em>'.
	 * @see daprdesigner.ResiliencyConfiguration#getHelp()
	 * @see #getResiliencyConfiguration()
	 * @generated
	 */
	EAttribute getResiliencyConfiguration_Help();

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
	 * Returns the meta object for the attribute '{@link daprdesigner.ResiliencyConfiguration#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see daprdesigner.ResiliencyConfiguration#getVersion()
	 * @see #getResiliencyConfiguration()
	 * @generated
	 */
	EAttribute getResiliencyConfiguration_Version();

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
	 * Returns the meta object for the reference '{@link daprdesigner.ResiliencyConfiguration#getPolicy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Policy</em>'.
	 * @see daprdesigner.ResiliencyConfiguration#getPolicy()
	 * @see #getResiliencyConfiguration()
	 * @generated
	 */
	EReference getResiliencyConfiguration_Policy();

	/**
	 * Returns the meta object for the reference list '{@link daprdesigner.ResiliencyConfiguration#getResiliencyTargets <em>Resiliency Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resiliency Targets</em>'.
	 * @see daprdesigner.ResiliencyConfiguration#getResiliencyTargets()
	 * @see #getResiliencyConfiguration()
	 * @generated
	 */
	EReference getResiliencyConfiguration_ResiliencyTargets();

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
	 * Returns the meta object for the attribute '{@link daprdesigner.ResiliencyPolicy#getHelp <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help</em>'.
	 * @see daprdesigner.ResiliencyPolicy#getHelp()
	 * @see #getResiliencyPolicy()
	 * @generated
	 */
	EAttribute getResiliencyPolicy_Help();

	/**
	 * Returns the meta object for the reference list '{@link daprdesigner.ResiliencyPolicy#getRetries <em>Retries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Retries</em>'.
	 * @see daprdesigner.ResiliencyPolicy#getRetries()
	 * @see #getResiliencyPolicy()
	 * @generated
	 */
	EReference getResiliencyPolicy_Retries();

	/**
	 * Returns the meta object for the reference list '{@link daprdesigner.ResiliencyPolicy#getCircuitBreakers <em>Circuit Breakers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Circuit Breakers</em>'.
	 * @see daprdesigner.ResiliencyPolicy#getCircuitBreakers()
	 * @see #getResiliencyPolicy()
	 * @generated
	 */
	EReference getResiliencyPolicy_CircuitBreakers();

	/**
	 * Returns the meta object for the reference list '{@link daprdesigner.ResiliencyPolicy#getTimeoutDefinitions <em>Timeout Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Timeout Definitions</em>'.
	 * @see daprdesigner.ResiliencyPolicy#getTimeoutDefinitions()
	 * @see #getResiliencyPolicy()
	 * @generated
	 */
	EReference getResiliencyPolicy_TimeoutDefinitions();

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
	 * Returns the meta object for the attribute '{@link daprdesigner.RetryPolicy#getHelp <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help</em>'.
	 * @see daprdesigner.RetryPolicy#getHelp()
	 * @see #getRetryPolicy()
	 * @generated
	 */
	EAttribute getRetryPolicy_Help();

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
	 * Returns the meta object for the attribute '{@link daprdesigner.RetryPolicy#getMaxInterval <em>Max Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Interval</em>'.
	 * @see daprdesigner.RetryPolicy#getMaxInterval()
	 * @see #getRetryPolicy()
	 * @generated
	 */
	EAttribute getRetryPolicy_MaxInterval();

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
	 * Returns the meta object for the attribute '{@link daprdesigner.ResiliencyTimeout#getHelp <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help</em>'.
	 * @see daprdesigner.ResiliencyTimeout#getHelp()
	 * @see #getResiliencyTimeout()
	 * @generated
	 */
	EAttribute getResiliencyTimeout_Help();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.ResiliencyTimeout#getTimeOutInSeconds <em>Time Out In Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Out In Seconds</em>'.
	 * @see daprdesigner.ResiliencyTimeout#getTimeOutInSeconds()
	 * @see #getResiliencyTimeout()
	 * @generated
	 */
	EAttribute getResiliencyTimeout_TimeOutInSeconds();

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
	 * Returns the meta object for the attribute '{@link daprdesigner.CircuitBreakerPolicy#getHelp <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help</em>'.
	 * @see daprdesigner.CircuitBreakerPolicy#getHelp()
	 * @see #getCircuitBreakerPolicy()
	 * @generated
	 */
	EAttribute getCircuitBreakerPolicy_Help();

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
	 * Returns the meta object for the attribute '{@link daprdesigner.ResiliencyTarget#getHelp <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help</em>'.
	 * @see daprdesigner.ResiliencyTarget#getHelp()
	 * @see #getResiliencyTarget()
	 * @generated
	 */
	EAttribute getResiliencyTarget_Help();

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
	 * Returns the meta object for the reference '{@link daprdesigner.ResiliencyTarget#getCircuitBreaker <em>Circuit Breaker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Circuit Breaker</em>'.
	 * @see daprdesigner.ResiliencyTarget#getCircuitBreaker()
	 * @see #getResiliencyTarget()
	 * @generated
	 */
	EReference getResiliencyTarget_CircuitBreaker();

	/**
	 * Returns the meta object for the reference '{@link daprdesigner.ResiliencyTarget#getRetry <em>Retry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Retry</em>'.
	 * @see daprdesigner.ResiliencyTarget#getRetry()
	 * @see #getResiliencyTarget()
	 * @generated
	 */
	EReference getResiliencyTarget_Retry();

	/**
	 * Returns the meta object for the reference '{@link daprdesigner.ResiliencyTarget#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timeout</em>'.
	 * @see daprdesigner.ResiliencyTarget#getTimeout()
	 * @see #getResiliencyTarget()
	 * @generated
	 */
	EReference getResiliencyTarget_Timeout();

	/**
	 * Returns the meta object for the reference list '{@link daprdesigner.ResiliencyTarget#getAppsActorsOrWorkflows <em>Apps Actors Or Workflows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Apps Actors Or Workflows</em>'.
	 * @see daprdesigner.ResiliencyTarget#getAppsActorsOrWorkflows()
	 * @see #getResiliencyTarget()
	 * @generated
	 */
	EReference getResiliencyTarget_AppsActorsOrWorkflows();

	/**
	 * Returns the meta object for the reference list '{@link daprdesigner.ResiliencyTarget#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Components</em>'.
	 * @see daprdesigner.ResiliencyTarget#getComponents()
	 * @see #getResiliencyTarget()
	 * @generated
	 */
	EReference getResiliencyTarget_Components();

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
	 * Returns the meta object for the attribute '{@link daprdesigner.HTTPEndPoint#getHelp <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help</em>'.
	 * @see daprdesigner.HTTPEndPoint#getHelp()
	 * @see #getHTTPEndPoint()
	 * @generated
	 */
	EAttribute getHTTPEndPoint_Help();

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
	 * Returns the meta object for the reference list '{@link daprdesigner.HTTPEndPoint#getSpecHeaders <em>Spec Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Spec Headers</em>'.
	 * @see daprdesigner.HTTPEndPoint#getSpecHeaders()
	 * @see #getHTTPEndPoint()
	 * @generated
	 */
	EReference getHTTPEndPoint_SpecHeaders();

	/**
	 * Returns the meta object for the reference '{@link daprdesigner.HTTPEndPoint#getSpecRootCA <em>Spec Root CA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Spec Root CA</em>'.
	 * @see daprdesigner.HTTPEndPoint#getSpecRootCA()
	 * @see #getHTTPEndPoint()
	 * @generated
	 */
	EReference getHTTPEndPoint_SpecRootCA();

	/**
	 * Returns the meta object for the reference '{@link daprdesigner.HTTPEndPoint#getSpecCertificate <em>Spec Certificate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Spec Certificate</em>'.
	 * @see daprdesigner.HTTPEndPoint#getSpecCertificate()
	 * @see #getHTTPEndPoint()
	 * @generated
	 */
	EReference getHTTPEndPoint_SpecCertificate();

	/**
	 * Returns the meta object for the reference '{@link daprdesigner.HTTPEndPoint#getSpecPrivateKey <em>Spec Private Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Spec Private Key</em>'.
	 * @see daprdesigner.HTTPEndPoint#getSpecPrivateKey()
	 * @see #getHTTPEndPoint()
	 * @generated
	 */
	EReference getHTTPEndPoint_SpecPrivateKey();

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
	 * Returns the meta object for the attribute '{@link daprdesigner.Component#getProviderName <em>Provider Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider Name</em>'.
	 * @see daprdesigner.Component#getProviderName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_ProviderName();

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
	 * Returns the meta object for the reference '{@link daprdesigner.Component#getSpec <em>Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Spec</em>'.
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
	 * Returns the meta object for the attribute '{@link daprdesigner.ComponentSpec#getHelp <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help</em>'.
	 * @see daprdesigner.ComponentSpec#getHelp()
	 * @see #getComponentSpec()
	 * @generated
	 */
	EAttribute getComponentSpec_Help();

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
	 * Returns the meta object for the reference list '{@link daprdesigner.ComponentSpec#getSpec_metadata <em>Spec metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Spec metadata</em>'.
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
	 * Returns the meta object for the attribute '{@link daprdesigner.SpecMetadata#getHelp <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help</em>'.
	 * @see daprdesigner.SpecMetadata#getHelp()
	 * @see #getSpecMetadata()
	 * @generated
	 */
	EAttribute getSpecMetadata_Help();

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
	 * Returns the meta object for class '{@link daprdesigner.PubSub <em>Pub Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pub Sub</em>'.
	 * @see daprdesigner.PubSub
	 * @generated
	 */
	EClass getPubSub();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.PubSub#getHelp <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help</em>'.
	 * @see daprdesigner.PubSub#getHelp()
	 * @see #getPubSub()
	 * @generated
	 */
	EAttribute getPubSub_Help();

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
	 * Returns the meta object for the attribute '{@link daprdesigner.Bindings#getHelp <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help</em>'.
	 * @see daprdesigner.Bindings#getHelp()
	 * @see #getBindings()
	 * @generated
	 */
	EAttribute getBindings_Help();

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
	 * Returns the meta object for the attribute '{@link daprdesigner.SecretStore#getHelp <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help</em>'.
	 * @see daprdesigner.SecretStore#getHelp()
	 * @see #getSecretStore()
	 * @generated
	 */
	EAttribute getSecretStore_Help();

	/**
	 * Returns the meta object for class '{@link daprdesigner.StateStore <em>State Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Store</em>'.
	 * @see daprdesigner.StateStore
	 * @generated
	 */
	EClass getStateStore();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.StateStore#getHelp <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help</em>'.
	 * @see daprdesigner.StateStore#getHelp()
	 * @see #getStateStore()
	 * @generated
	 */
	EAttribute getStateStore_Help();

	/**
	 * Returns the meta object for class '{@link daprdesigner.ConfigurationStore <em>Configuration Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Store</em>'.
	 * @see daprdesigner.ConfigurationStore
	 * @generated
	 */
	EClass getConfigurationStore();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.ConfigurationStore#getHelp <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help</em>'.
	 * @see daprdesigner.ConfigurationStore#getHelp()
	 * @see #getConfigurationStore()
	 * @generated
	 */
	EAttribute getConfigurationStore_Help();

	/**
	 * Returns the meta object for class '{@link daprdesigner.Locks <em>Locks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Locks</em>'.
	 * @see daprdesigner.Locks
	 * @generated
	 */
	EClass getLocks();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.Locks#getHelp <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help</em>'.
	 * @see daprdesigner.Locks#getHelp()
	 * @see #getLocks()
	 * @generated
	 */
	EAttribute getLocks_Help();

	/**
	 * Returns the meta object for class '{@link daprdesigner.Cryptography <em>Cryptography</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cryptography</em>'.
	 * @see daprdesigner.Cryptography
	 * @generated
	 */
	EClass getCryptography();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.Cryptography#getHelp <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help</em>'.
	 * @see daprdesigner.Cryptography#getHelp()
	 * @see #getCryptography()
	 * @generated
	 */
	EAttribute getCryptography_Help();

	/**
	 * Returns the meta object for class '{@link daprdesigner.Middleware <em>Middleware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Middleware</em>'.
	 * @see daprdesigner.Middleware
	 * @generated
	 */
	EClass getMiddleware();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.Middleware#getHelp <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help</em>'.
	 * @see daprdesigner.Middleware#getHelp()
	 * @see #getMiddleware()
	 * @generated
	 */
	EAttribute getMiddleware_Help();

	/**
	 * Returns the meta object for class '{@link daprdesigner.Nameresolution <em>Nameresolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nameresolution</em>'.
	 * @see daprdesigner.Nameresolution
	 * @generated
	 */
	EClass getNameresolution();

	/**
	 * Returns the meta object for the attribute '{@link daprdesigner.Nameresolution#getHelp <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help</em>'.
	 * @see daprdesigner.Nameresolution#getHelp()
	 * @see #getNameresolution()
	 * @generated
	 */
	EAttribute getNameresolution_Help();

	/**
	 * Returns the meta object for enum '{@link daprdesigner.AccessAction <em>Access Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Access Action</em>'.
	 * @see daprdesigner.AccessAction
	 * @generated
	 */
	EEnum getAccessAction();

	/**
	 * Returns the meta object for enum '{@link daprdesigner.RetryPolicyType <em>Retry Policy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Retry Policy Type</em>'.
	 * @see daprdesigner.RetryPolicyType
	 * @generated
	 */
	EEnum getRetryPolicyType();

	/**
	 * Returns the meta object for enum '{@link daprdesigner.HttpHandlerType <em>Http Handler Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Http Handler Type</em>'.
	 * @see daprdesigner.HttpHandlerType
	 * @generated
	 */
	EEnum getHttpHandlerType();

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
	 * Returns the meta object for enum '{@link daprdesigner.BlockType <em>Block Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Block Type</em>'.
	 * @see daprdesigner.BlockType
	 * @generated
	 */
	EEnum getBlockType();

	/**
	 * Returns the meta object for enum '{@link daprdesigner.NodeBlockType <em>Node Block Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Node Block Type</em>'.
	 * @see daprdesigner.NodeBlockType
	 * @generated
	 */
	EEnum getNodeBlockType();

	/**
	 * Returns the meta object for enum '{@link daprdesigner.APIType <em>API Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>API Type</em>'.
	 * @see daprdesigner.APIType
	 * @generated
	 */
	EEnum getAPIType();

	/**
	 * Returns the meta object for enum '{@link daprdesigner.SDKLanguage <em>SDK Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SDK Language</em>'.
	 * @see daprdesigner.SDKLanguage
	 * @generated
	 */
	EEnum getSDKLanguage();

	/**
	 * Returns the meta object for enum '{@link daprdesigner.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Protocol</em>'.
	 * @see daprdesigner.Protocol
	 * @generated
	 */
	EEnum getProtocol();

	/**
	 * Returns the meta object for enum '{@link daprdesigner.Verb <em>Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Verb</em>'.
	 * @see daprdesigner.Verb
	 * @generated
	 */
	EEnum getVerb();

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
		 * The meta object literal for the '<em><b>Buildingblocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAPR_ARCHITECTURE__BUILDINGBLOCKS = eINSTANCE.getDaprArchitecture_Buildingblocks();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.BlockImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__NAME = eINSTANCE.getBlock_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__DESCRIPTION = eINSTANCE.getBlock_Description();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__NOTES = eINSTANCE.getBlock_Notes();

		/**
		 * The meta object literal for the '<em><b>Block Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__BLOCK_TYPE = eINSTANCE.getBlock_BlockType();

		/**
		 * The meta object literal for the '<em><b>Subblocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__SUBBLOCKS = eINSTANCE.getBlock_Subblocks();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__NODES = eINSTANCE.getBlock_Nodes();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.DaprNodeImpl <em>Dapr Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.DaprNodeImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getDaprNode()
		 * @generated
		 */
		EClass DAPR_NODE = eINSTANCE.getDaprNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAPR_NODE__NAME = eINSTANCE.getDaprNode_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAPR_NODE__DESCRIPTION = eINSTANCE.getDaprNode_Description();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAPR_NODE__NOTES = eINSTANCE.getDaprNode_Notes();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.NodeBlocksImpl <em>Node Blocks</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.NodeBlocksImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getNodeBlocks()
		 * @generated
		 */
		EClass NODE_BLOCKS = eINSTANCE.getNodeBlocks();

		/**
		 * The meta object literal for the '<em><b>Node Block Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_BLOCKS__NODE_BLOCK_TYPE = eINSTANCE.getNodeBlocks_NodeBlockType();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_BLOCKS__NODES = eINSTANCE.getNodeBlocks_Nodes();

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
		 * The meta object literal for the '<em><b>Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMESPACE__HELP = eINSTANCE.getNamespace_Help();

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
		 * The meta object literal for the '<em><b>Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRUSTDOMAIN__HELP = eINSTANCE.getTrustdomain_Help();

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
		 * The meta object literal for the '<em><b>Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP__HELP = eINSTANCE.getApp_Help();

		/**
		 * The meta object literal for the '<em><b>App Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP__APP_ID = eINSTANCE.getApp_AppId();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP__REPOSITORY = eINSTANCE.getApp_Repository();

		/**
		 * The meta object literal for the '<em><b>Sdk Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP__SDK_LANGUAGE = eINSTANCE.getApp_SdkLanguage();

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
		 * The meta object literal for the '<em><b>Configurations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__CONFIGURATIONS = eINSTANCE.getApp_Configurations();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.ActorImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Additional Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__ADDITIONAL_HELP = eINSTANCE.getActor_AdditionalHelp();

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
		 * The meta object literal for the '<em><b>Additional Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW__ADDITIONAL_HELP = eINSTANCE.getWorkflow_AdditionalHelp();

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
		 * The meta object literal for the '{@link daprdesigner.impl.DeniedComponentsConfigurationImpl <em>Denied Components Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.DeniedComponentsConfigurationImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getDeniedComponentsConfiguration()
		 * @generated
		 */
		EClass DENIED_COMPONENTS_CONFIGURATION = eINSTANCE.getDeniedComponentsConfiguration();

		/**
		 * The meta object literal for the '<em><b>Denied Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DENIED_COMPONENTS_CONFIGURATION__DENIED_COMPONENTS = eINSTANCE
				.getDeniedComponentsConfiguration_DeniedComponents();

		/**
		 * The meta object literal for the '<em><b>Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENIED_COMPONENTS_CONFIGURATION__HELP = eINSTANCE.getDeniedComponentsConfiguration_Help();

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
		 * The meta object literal for the '<em><b>Obfuscate Urls</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGGING_CONFIGURATION__OBFUSCATE_URLS = eINSTANCE.getLoggingConfiguration_ObfuscateUrls();

		/**
		 * The meta object literal for the '<em><b>Omit Health Checks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGGING_CONFIGURATION__OMIT_HEALTH_CHECKS = eINSTANCE.getLoggingConfiguration_OmitHealthChecks();

		/**
		 * The meta object literal for the '<em><b>Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGGING_CONFIGURATION__HELP = eINSTANCE.getLoggingConfiguration_Help();

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
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME_RESOLUTION_CONFIGURATION__COMPONENT = eINSTANCE.getNameResolutionConfiguration_Component();

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
		 * The meta object literal for the '<em><b>Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_RESOLUTION_CONFIGURATION__HELP = eINSTANCE.getNameResolutionConfiguration_Help();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.SecretsAccessConfigurationImpl <em>Secrets Access Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.SecretsAccessConfigurationImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getSecretsAccessConfiguration()
		 * @generated
		 */
		EClass SECRETS_ACCESS_CONFIGURATION = eINSTANCE.getSecretsAccessConfiguration();

		/**
		 * The meta object literal for the '<em><b>Access List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECRETS_ACCESS_CONFIGURATION__ACCESS_LIST = eINSTANCE.getSecretsAccessConfiguration_AccessList();

		/**
		 * The meta object literal for the '<em><b>Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECRETS_ACCESS_CONFIGURATION__HELP = eINSTANCE.getSecretsAccessConfiguration_Help();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.SecretsAccessListImpl <em>Secrets Access List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.SecretsAccessListImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getSecretsAccessList()
		 * @generated
		 */
		EClass SECRETS_ACCESS_LIST = eINSTANCE.getSecretsAccessList();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECRETS_ACCESS_LIST__COMPONENT = eINSTANCE.getSecretsAccessList_Component();

		/**
		 * The meta object literal for the '<em><b>Default Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECRETS_ACCESS_LIST__DEFAULT_ACCESS = eINSTANCE.getSecretsAccessList_DefaultAccess();

		/**
		 * The meta object literal for the '<em><b>Secrets</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECRETS_ACCESS_LIST__SECRETS = eINSTANCE.getSecretsAccessList_Secrets();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECRETS_ACCESS_LIST__ACTION = eINSTANCE.getSecretsAccessList_Action();

		/**
		 * The meta object literal for the '<em><b>Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECRETS_ACCESS_LIST__HELP = eINSTANCE.getSecretsAccessList_Help();

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
		 * The meta object literal for the '<em><b>Latency Distribution Buckets</b></em>' attribute feature.
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
		 * The meta object literal for the '<em><b>Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRICS_CONFIGURATION__HELP = eINSTANCE.getMetricsConfiguration_Help();

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
		 * The meta object literal for the '<em><b>Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_ACCESS_CONTROL__HELP = eINSTANCE.getAPIAccessControl_Help();

		/**
		 * The meta object literal for the '<em><b>Api List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API_ACCESS_CONTROL__API_LIST = eINSTANCE.getAPIAccessControl_ApiList();

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
		 * The meta object literal for the '<em><b>Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API__ACCESS = eINSTANCE.getAPI_Access();

		/**
		 * The meta object literal for the '<em><b>Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API__HELP = eINSTANCE.getAPI_Help();

		/**
		 * The meta object literal for the '<em><b>Api Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API__API_TYPE = eINSTANCE.getAPI_ApiType();

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
		 * The meta object literal for the '<em><b>Policies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_ACCESS_CONTROL__POLICIES = eINSTANCE.getAppAccessControl_Policies();

		/**
		 * The meta object literal for the '<em><b>Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_ACCESS_CONTROL__HELP = eINSTANCE.getAppAccessControl_Help();

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
		 * The meta object literal for the '<em><b>Operations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_POLICY__OPERATIONS = eINSTANCE.getAppPolicy_Operations();

		/**
		 * The meta object literal for the '<em><b>Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_POLICY__HELP = eINSTANCE.getAppPolicy_Help();

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
		 * The meta object literal for the '<em><b>Apply To Get</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__APPLY_TO_GET = eINSTANCE.getOperation_ApplyToGet();

		/**
		 * The meta object literal for the '<em><b>Apply To Post</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__APPLY_TO_POST = eINSTANCE.getOperation_ApplyToPost();

		/**
		 * The meta object literal for the '<em><b>Apply To Put</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__APPLY_TO_PUT = eINSTANCE.getOperation_ApplyToPut();

		/**
		 * The meta object literal for the '<em><b>Apply To Delete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__APPLY_TO_DELETE = eINSTANCE.getOperation_ApplyToDelete();

		/**
		 * The meta object literal for the '<em><b>Apply To Patch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__APPLY_TO_PATCH = eINSTANCE.getOperation_ApplyToPatch();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__ACTION = eINSTANCE.getOperation_Action();

		/**
		 * The meta object literal for the '<em><b>Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__HELP = eINSTANCE.getOperation_Help();

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
		 * The meta object literal for the '<em><b>Http Handlers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIDDLEWARE_CONFIGURATION__HTTP_HANDLERS = eINSTANCE.getMiddlewareConfiguration_HttpHandlers();

		/**
		 * The meta object literal for the '<em><b>Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIDDLEWARE_CONFIGURATION__HELP = eINSTANCE.getMiddlewareConfiguration_Help();

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
		 * The meta object literal for the '<em><b>Handler Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_HANDLER__HANDLER_NAME = eINSTANCE.getHttpHandler_HandlerName();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_HANDLER__TYPE = eINSTANCE.getHttpHandler_Type();

		/**
		 * The meta object literal for the '<em><b>Handler Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_HANDLER__HANDLER_TYPE = eINSTANCE.getHttpHandler_HandlerType();

		/**
		 * The meta object literal for the '<em><b>Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_HANDLER__HELP = eINSTANCE.getHttpHandler_Help();

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
		 * The meta object literal for the '<em><b>Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACING_CONFIGURATION__HELP = eINSTANCE.getTracingConfiguration_Help();

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
		 * The meta object literal for the '<em><b>Topic Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION_CONFIGURATION__TOPIC_NAME = eINSTANCE.getSubscriptionConfiguration_TopicName();

		/**
		 * The meta object literal for the '<em><b>Route Rules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPTION_CONFIGURATION__ROUTE_RULES = eINSTANCE.getSubscriptionConfiguration_RouteRules();

		/**
		 * The meta object literal for the '<em><b>Pubsub</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPTION_CONFIGURATION__PUBSUB = eINSTANCE.getSubscriptionConfiguration_Pubsub();

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
		 * The meta object literal for the '<em><b>Bulk Subscribe max Await Durations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION_CONFIGURATION__BULK_SUBSCRIBE_MAX_AWAIT_DURATIONS = eINSTANCE
				.getSubscriptionConfiguration_BulkSubscribe_maxAwaitDurations();

		/**
		 * The meta object literal for the '<em><b>Scopes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPTION_CONFIGURATION__SCOPES = eINSTANCE.getSubscriptionConfiguration_Scopes();

		/**
		 * The meta object literal for the '<em><b>Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION_CONFIGURATION__HELP = eINSTANCE.getSubscriptionConfiguration_Help();

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
		 * The meta object literal for the '<em><b>Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE_RULES__HELP = eINSTANCE.getRouteRules_Help();

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
		 * The meta object literal for the '<em><b>Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESILIENCY_CONFIGURATION__HELP = eINSTANCE.getResiliencyConfiguration_Help();

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
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESILIENCY_CONFIGURATION__VERSION = eINSTANCE.getResiliencyConfiguration_Version();

		/**
		 * The meta object literal for the '<em><b>Scopes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESILIENCY_CONFIGURATION__SCOPES = eINSTANCE.getResiliencyConfiguration_Scopes();

		/**
		 * The meta object literal for the '<em><b>Policy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESILIENCY_CONFIGURATION__POLICY = eINSTANCE.getResiliencyConfiguration_Policy();

		/**
		 * The meta object literal for the '<em><b>Resiliency Targets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESILIENCY_CONFIGURATION__RESILIENCY_TARGETS = eINSTANCE
				.getResiliencyConfiguration_ResiliencyTargets();

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
		 * The meta object literal for the '<em><b>Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESILIENCY_POLICY__HELP = eINSTANCE.getResiliencyPolicy_Help();

		/**
		 * The meta object literal for the '<em><b>Retries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESILIENCY_POLICY__RETRIES = eINSTANCE.getResiliencyPolicy_Retries();

		/**
		 * The meta object literal for the '<em><b>Circuit Breakers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESILIENCY_POLICY__CIRCUIT_BREAKERS = eINSTANCE.getResiliencyPolicy_CircuitBreakers();

		/**
		 * The meta object literal for the '<em><b>Timeout Definitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESILIENCY_POLICY__TIMEOUT_DEFINITIONS = eINSTANCE.getResiliencyPolicy_TimeoutDefinitions();

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
		 * The meta object literal for the '<em><b>Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETRY_POLICY__HELP = eINSTANCE.getRetryPolicy_Help();

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
		 * The meta object literal for the '<em><b>Max Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETRY_POLICY__MAX_INTERVAL = eINSTANCE.getRetryPolicy_MaxInterval();

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
		 * The meta object literal for the '<em><b>Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESILIENCY_TIMEOUT__HELP = eINSTANCE.getResiliencyTimeout_Help();

		/**
		 * The meta object literal for the '<em><b>Time Out In Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESILIENCY_TIMEOUT__TIME_OUT_IN_SECONDS = eINSTANCE.getResiliencyTimeout_TimeOutInSeconds();

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
		 * The meta object literal for the '<em><b>Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCUIT_BREAKER_POLICY__HELP = eINSTANCE.getCircuitBreakerPolicy_Help();

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
		 * The meta object literal for the '<em><b>Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESILIENCY_TARGET__HELP = eINSTANCE.getResiliencyTarget_Help();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESILIENCY_TARGET__TYPE = eINSTANCE.getResiliencyTarget_Type();

		/**
		 * The meta object literal for the '<em><b>Circuit Breaker Cache Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESILIENCY_TARGET__CIRCUIT_BREAKER_CACHE_SIZE = eINSTANCE
				.getResiliencyTarget_CircuitBreakerCacheSize();

		/**
		 * The meta object literal for the '<em><b>Circuit Breaker</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESILIENCY_TARGET__CIRCUIT_BREAKER = eINSTANCE.getResiliencyTarget_CircuitBreaker();

		/**
		 * The meta object literal for the '<em><b>Retry</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESILIENCY_TARGET__RETRY = eINSTANCE.getResiliencyTarget_Retry();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESILIENCY_TARGET__TIMEOUT = eINSTANCE.getResiliencyTarget_Timeout();

		/**
		 * The meta object literal for the '<em><b>Apps Actors Or Workflows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESILIENCY_TARGET__APPS_ACTORS_OR_WORKFLOWS = eINSTANCE.getResiliencyTarget_AppsActorsOrWorkflows();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESILIENCY_TARGET__COMPONENTS = eINSTANCE.getResiliencyTarget_Components();

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
		 * The meta object literal for the '<em><b>Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_END_POINT__HELP = eINSTANCE.getHTTPEndPoint_Help();

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
		 * The meta object literal for the '<em><b>Base Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_END_POINT__BASE_URL = eINSTANCE.getHTTPEndPoint_BaseUrl();

		/**
		 * The meta object literal for the '<em><b>Auth</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_END_POINT__AUTH = eINSTANCE.getHTTPEndPoint_Auth();

		/**
		 * The meta object literal for the '<em><b>Scopes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_END_POINT__SCOPES = eINSTANCE.getHTTPEndPoint_Scopes();

		/**
		 * The meta object literal for the '<em><b>Spec Headers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_END_POINT__SPEC_HEADERS = eINSTANCE.getHTTPEndPoint_SpecHeaders();

		/**
		 * The meta object literal for the '<em><b>Spec Root CA</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_END_POINT__SPEC_ROOT_CA = eINSTANCE.getHTTPEndPoint_SpecRootCA();

		/**
		 * The meta object literal for the '<em><b>Spec Certificate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_END_POINT__SPEC_CERTIFICATE = eINSTANCE.getHTTPEndPoint_SpecCertificate();

		/**
		 * The meta object literal for the '<em><b>Spec Private Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_END_POINT__SPEC_PRIVATE_KEY = eINSTANCE.getHTTPEndPoint_SpecPrivateKey();

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
		 * The meta object literal for the '<em><b>Provider Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__PROVIDER_NAME = eINSTANCE.getComponent_ProviderName();

		/**
		 * The meta object literal for the '<em><b>Auth</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__AUTH = eINSTANCE.getComponent_Auth();

		/**
		 * The meta object literal for the '<em><b>Metadata namespace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__METADATA_NAMESPACE = eINSTANCE.getComponent_Metadata_namespace();

		/**
		 * The meta object literal for the '<em><b>Spec</b></em>' reference feature.
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
		 * The meta object literal for the '<em><b>Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_SPEC__HELP = eINSTANCE.getComponentSpec_Help();

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
		 * The meta object literal for the '<em><b>Spec metadata</b></em>' reference list feature.
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
		 * The meta object literal for the '<em><b>Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_METADATA__HELP = eINSTANCE.getSpecMetadata_Help();

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
		 * The meta object literal for the '{@link daprdesigner.impl.PubSubImpl <em>Pub Sub</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.PubSubImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getPubSub()
		 * @generated
		 */
		EClass PUB_SUB = eINSTANCE.getPubSub();

		/**
		 * The meta object literal for the '<em><b>Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUB_SUB__HELP = eINSTANCE.getPubSub_Help();

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
		 * The meta object literal for the '<em><b>Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDINGS__HELP = eINSTANCE.getBindings_Help();

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
		 * The meta object literal for the '<em><b>Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECRET_STORE__HELP = eINSTANCE.getSecretStore_Help();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.StateStoreImpl <em>State Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.StateStoreImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getStateStore()
		 * @generated
		 */
		EClass STATE_STORE = eINSTANCE.getStateStore();

		/**
		 * The meta object literal for the '<em><b>Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_STORE__HELP = eINSTANCE.getStateStore_Help();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.ConfigurationStoreImpl <em>Configuration Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.ConfigurationStoreImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getConfigurationStore()
		 * @generated
		 */
		EClass CONFIGURATION_STORE = eINSTANCE.getConfigurationStore();

		/**
		 * The meta object literal for the '<em><b>Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_STORE__HELP = eINSTANCE.getConfigurationStore_Help();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.LocksImpl <em>Locks</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.LocksImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getLocks()
		 * @generated
		 */
		EClass LOCKS = eINSTANCE.getLocks();

		/**
		 * The meta object literal for the '<em><b>Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCKS__HELP = eINSTANCE.getLocks_Help();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.CryptographyImpl <em>Cryptography</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.CryptographyImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getCryptography()
		 * @generated
		 */
		EClass CRYPTOGRAPHY = eINSTANCE.getCryptography();

		/**
		 * The meta object literal for the '<em><b>Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRYPTOGRAPHY__HELP = eINSTANCE.getCryptography_Help();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.MiddlewareImpl <em>Middleware</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.MiddlewareImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getMiddleware()
		 * @generated
		 */
		EClass MIDDLEWARE = eINSTANCE.getMiddleware();

		/**
		 * The meta object literal for the '<em><b>Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIDDLEWARE__HELP = eINSTANCE.getMiddleware_Help();

		/**
		 * The meta object literal for the '{@link daprdesigner.impl.NameresolutionImpl <em>Nameresolution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.impl.NameresolutionImpl
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getNameresolution()
		 * @generated
		 */
		EClass NAMERESOLUTION = eINSTANCE.getNameresolution();

		/**
		 * The meta object literal for the '<em><b>Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMERESOLUTION__HELP = eINSTANCE.getNameresolution_Help();

		/**
		 * The meta object literal for the '{@link daprdesigner.AccessAction <em>Access Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.AccessAction
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getAccessAction()
		 * @generated
		 */
		EEnum ACCESS_ACTION = eINSTANCE.getAccessAction();

		/**
		 * The meta object literal for the '{@link daprdesigner.RetryPolicyType <em>Retry Policy Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.RetryPolicyType
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getRetryPolicyType()
		 * @generated
		 */
		EEnum RETRY_POLICY_TYPE = eINSTANCE.getRetryPolicyType();

		/**
		 * The meta object literal for the '{@link daprdesigner.HttpHandlerType <em>Http Handler Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.HttpHandlerType
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getHttpHandlerType()
		 * @generated
		 */
		EEnum HTTP_HANDLER_TYPE = eINSTANCE.getHttpHandlerType();

		/**
		 * The meta object literal for the '{@link daprdesigner.ResiliencyTargetType <em>Resiliency Target Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.ResiliencyTargetType
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getResiliencyTargetType()
		 * @generated
		 */
		EEnum RESILIENCY_TARGET_TYPE = eINSTANCE.getResiliencyTargetType();

		/**
		 * The meta object literal for the '{@link daprdesigner.BlockType <em>Block Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.BlockType
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getBlockType()
		 * @generated
		 */
		EEnum BLOCK_TYPE = eINSTANCE.getBlockType();

		/**
		 * The meta object literal for the '{@link daprdesigner.NodeBlockType <em>Node Block Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.NodeBlockType
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getNodeBlockType()
		 * @generated
		 */
		EEnum NODE_BLOCK_TYPE = eINSTANCE.getNodeBlockType();

		/**
		 * The meta object literal for the '{@link daprdesigner.APIType <em>API Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.APIType
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getAPIType()
		 * @generated
		 */
		EEnum API_TYPE = eINSTANCE.getAPIType();

		/**
		 * The meta object literal for the '{@link daprdesigner.SDKLanguage <em>SDK Language</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.SDKLanguage
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getSDKLanguage()
		 * @generated
		 */
		EEnum SDK_LANGUAGE = eINSTANCE.getSDKLanguage();

		/**
		 * The meta object literal for the '{@link daprdesigner.Protocol <em>Protocol</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.Protocol
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getProtocol()
		 * @generated
		 */
		EEnum PROTOCOL = eINSTANCE.getProtocol();

		/**
		 * The meta object literal for the '{@link daprdesigner.Verb <em>Verb</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daprdesigner.Verb
		 * @see daprdesigner.impl.DaprdesignerPackageImpl#getVerb()
		 * @generated
		 */
		EEnum VERB = eINSTANCE.getVerb();

	}

} //DaprdesignerPackage
