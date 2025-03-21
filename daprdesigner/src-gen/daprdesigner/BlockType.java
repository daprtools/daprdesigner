/**
 */
package daprdesigner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Block Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see daprdesigner.DaprdesignerPackage#getBlockType()
 * @model
 * @generated
 */
public enum BlockType implements Enumerator {
	/**
	 * The '<em><b>ACTORS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTORS_VALUE
	 * @generated
	 * @ordered
	 */
	ACTORS(0, "ACTORS", "ACTORS"),
	/**
	* The '<em><b>BINDINGS</b></em>' literal object.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #BINDINGS_VALUE
	* @generated
	* @ordered
	*/
	BINDINGS(1, "BINDINGS", "BINDINGS"),

	/**
	 * The '<em><b>CONFIGURATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIGURATION_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIGURATION(2, "CONFIGURATION", "CONFIGURATION"),

	/**
	 * The '<em><b>CONFIGURATIONGROUP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIGURATIONGROUP_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIGURATIONGROUP(3, "CONFIGURATIONGROUP", "CONFIGURATIONGROUP"),
	/**
	 * The '<em><b>CONVERSATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONVERSATION_VALUE
	 * @generated
	 * @ordered
	 */
	CONVERSATION(4, "CONVERSATION", "CONVERSATION"),
	/**
	* The '<em><b>CRYPTOGRAPHY</b></em>' literal object.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #CRYPTOGRAPHY_VALUE
	* @generated
	* @ordered
	*/
	CRYPTOGRAPHY(5, "CRYPTOGRAPHY", "CRYPTOGRAPHY"),
	/**
	* The '<em><b>DISTRIBUTEDLOCK</b></em>' literal object.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #DISTRIBUTEDLOCK_VALUE
	* @generated
	* @ordered
	*/
	DISTRIBUTEDLOCK(6, "DISTRIBUTEDLOCK", "DISTRIBUTEDLOCK"),
	/**
	* The '<em><b>ENVIRONMENT</b></em>' literal object.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #ENVIRONMENT_VALUE
	* @generated
	* @ordered
	*/
	ENVIRONMENT(7, "ENVIRONMENT", "ENVIRONMENT"),
	/**
	* The '<em><b>JOBS</b></em>' literal object.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #JOBS_VALUE
	* @generated
	* @ordered
	*/
	JOBS(8, "JOBS", "JOBS"),
	/**
	* The '<em><b>MICROSERVICES</b></em>' literal object.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #MICROSERVICES_VALUE
	* @generated
	* @ordered
	*/
	MICROSERVICES(9, "MICROSERVICES", "MICROSERVICES"),
	/**
	* The '<em><b>MIDDLEWARE</b></em>' literal object.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #MIDDLEWARE_VALUE
	* @generated
	* @ordered
	*/
	MIDDLEWARE(10, "MIDDLEWARE", "MIDDLEWARE"),
	/**
	* The '<em><b>PUBSUB</b></em>' literal object.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #PUBSUB_VALUE
	* @generated
	* @ordered
	*/
	PUBSUB(11, "PUBSUB", "PUBSUB"),
	/**
	* The '<em><b>SECRETSTORE</b></em>' literal object.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #SECRETSTORE_VALUE
	* @generated
	* @ordered
	*/
	SECRETSTORE(12, "SECRETSTORE", "SECRETSTORE"),
	/**
	* The '<em><b>STATESTORE</b></em>' literal object.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #STATESTORE_VALUE
	* @generated
	* @ordered
	*/
	STATESTORE(13, "STATESTORE", "STATESTORE"),
	/**
	* The '<em><b>WORKFLOW</b></em>' literal object.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #WORKFLOW_VALUE
	* @generated
	* @ordered
	*/
	WORKFLOW(14, "WORKFLOW", "WORKFLOW");

	/**
	 * The '<em><b>ACTORS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTORS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACTORS_VALUE = 0;

	/**
	 * The '<em><b>BINDINGS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BINDINGS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BINDINGS_VALUE = 1;

	/**
	 * The '<em><b>CONFIGURATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIGURATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONFIGURATION_VALUE = 2;

	/**
	 * The '<em><b>CONFIGURATIONGROUP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIGURATIONGROUP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONFIGURATIONGROUP_VALUE = 3;

	/**
	 * The '<em><b>CONVERSATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONVERSATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONVERSATION_VALUE = 4;

	/**
	 * The '<em><b>CRYPTOGRAPHY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRYPTOGRAPHY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CRYPTOGRAPHY_VALUE = 5;

	/**
	 * The '<em><b>DISTRIBUTEDLOCK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTRIBUTEDLOCK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DISTRIBUTEDLOCK_VALUE = 6;

	/**
	 * The '<em><b>ENVIRONMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENVIRONMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ENVIRONMENT_VALUE = 7;

	/**
	 * The '<em><b>JOBS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JOBS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JOBS_VALUE = 8;

	/**
	 * The '<em><b>MICROSERVICES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MICROSERVICES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MICROSERVICES_VALUE = 9;

	/**
	 * The '<em><b>MIDDLEWARE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIDDLEWARE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MIDDLEWARE_VALUE = 10;

	/**
	 * The '<em><b>PUBSUB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBSUB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PUBSUB_VALUE = 11;

	/**
	 * The '<em><b>SECRETSTORE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECRETSTORE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SECRETSTORE_VALUE = 12;

	/**
	 * The '<em><b>STATESTORE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATESTORE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STATESTORE_VALUE = 13;

	/**
	 * The '<em><b>WORKFLOW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORKFLOW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_VALUE = 14;

	/**
	 * An array of all the '<em><b>Block Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BlockType[] VALUES_ARRAY = new BlockType[] { ACTORS, BINDINGS, CONFIGURATION,
			CONFIGURATIONGROUP, CONVERSATION, CRYPTOGRAPHY, DISTRIBUTEDLOCK, ENVIRONMENT, JOBS, MICROSERVICES,
			MIDDLEWARE, PUBSUB, SECRETSTORE, STATESTORE, WORKFLOW, };

	/**
	 * A public read-only list of all the '<em><b>Block Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BlockType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Block Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BlockType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BlockType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Block Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BlockType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BlockType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Block Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BlockType get(int value) {
		switch (value) {
		case ACTORS_VALUE:
			return ACTORS;
		case BINDINGS_VALUE:
			return BINDINGS;
		case CONFIGURATION_VALUE:
			return CONFIGURATION;
		case CONFIGURATIONGROUP_VALUE:
			return CONFIGURATIONGROUP;
		case CONVERSATION_VALUE:
			return CONVERSATION;
		case CRYPTOGRAPHY_VALUE:
			return CRYPTOGRAPHY;
		case DISTRIBUTEDLOCK_VALUE:
			return DISTRIBUTEDLOCK;
		case ENVIRONMENT_VALUE:
			return ENVIRONMENT;
		case JOBS_VALUE:
			return JOBS;
		case MICROSERVICES_VALUE:
			return MICROSERVICES;
		case MIDDLEWARE_VALUE:
			return MIDDLEWARE;
		case PUBSUB_VALUE:
			return PUBSUB;
		case SECRETSTORE_VALUE:
			return SECRETSTORE;
		case STATESTORE_VALUE:
			return STATESTORE;
		case WORKFLOW_VALUE:
			return WORKFLOW;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private BlockType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //BlockType
