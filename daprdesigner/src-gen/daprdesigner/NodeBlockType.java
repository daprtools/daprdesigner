/**
 */
package daprdesigner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Node Block Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see daprdesigner.DaprdesignerPackage#getNodeBlockType()
 * @model
 * @generated
 */
public enum NodeBlockType implements Enumerator {
	/**
	 * The '<em><b>ACTOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTOR_VALUE
	 * @generated
	 * @ordered
	 */
	ACTOR(0, "ACTOR", "ACTOR"),
	/**
	* The '<em><b>APP</b></em>' literal object.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #APP_VALUE
	* @generated
	* @ordered
	*/
	APP(1, "APP", "APP"),

	/**
	 * The '<em><b>BINDING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BINDING_VALUE
	 * @generated
	 * @ordered
	 */
	BINDING(2, "BINDING", "BINDING"),

	/**
	 * The '<em><b>CONFIGURATIONSTORE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #CONFIGURATIONSTORE_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIGURATIONSTORE(3, "CONFIGURATIONSTORE", "CONFIGURATIONSTORE"),
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
	* The '<em><b>HTTPENDPOINT</b></em>' literal object.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #HTTPENDPOINT_VALUE
	* @generated
	* @ordered
	*/
	HTTPENDPOINT(7, "HTTPENDPOINT", "HTTPENDPOINT"),
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
	* The '<em><b>MIDDLEWARE</b></em>' literal object.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #MIDDLEWARE_VALUE
	* @generated
	* @ordered
	*/
	MIDDLEWARE(9, "MIDDLEWARE", "MIDDLEWARE"),
	/**
	* The '<em><b>PUBSUB</b></em>' literal object.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #PUBSUB_VALUE
	* @generated
	* @ordered
	*/
	PUBSUB(10, "PUBSUB", "PUBSUB"),
	/**
	* The '<em><b>RESILIENCY</b></em>' literal object.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #RESILIENCY_VALUE
	* @generated
	* @ordered
	*/
	RESILIENCY(11, "RESILIENCY", "RESILIENCY"),
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
	* The '<em><b>SUBSCRIPTION</b></em>' literal object.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #SUBSCRIPTION_VALUE
	* @generated
	* @ordered
	*/
	SUBSCRIPTION(14, "SUBSCRIPTION", "SUBSCRIPTION"),
	/**
	* The '<em><b>WORKFLOW</b></em>' literal object.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #WORKFLOW_VALUE
	* @generated
	* @ordered
	*/
	WORKFLOW(15, "WORKFLOW", "WORKFLOW");

	/**
	 * The '<em><b>ACTOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACTOR_VALUE = 0;

	/**
	 * The '<em><b>APP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int APP_VALUE = 1;

	/**
	 * The '<em><b>BINDING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BINDING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BINDING_VALUE = 2;

	/**
	 * The '<em><b>CONFIGURATIONSTORE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIGURATIONSTORE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONFIGURATIONSTORE_VALUE = 3;

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
	 * The '<em><b>HTTPENDPOINT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTPENDPOINT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HTTPENDPOINT_VALUE = 7;

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
	 * The '<em><b>MIDDLEWARE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIDDLEWARE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MIDDLEWARE_VALUE = 9;

	/**
	 * The '<em><b>PUBSUB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBSUB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PUBSUB_VALUE = 10;

	/**
	 * The '<em><b>RESILIENCY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESILIENCY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESILIENCY_VALUE = 11;

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
	 * The '<em><b>SUBSCRIPTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSCRIPTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUBSCRIPTION_VALUE = 14;

	/**
	 * The '<em><b>WORKFLOW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORKFLOW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_VALUE = 15;

	/**
	 * An array of all the '<em><b>Node Block Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NodeBlockType[] VALUES_ARRAY = new NodeBlockType[] { ACTOR, APP, BINDING, CONFIGURATIONSTORE,
			CONVERSATION, CRYPTOGRAPHY, DISTRIBUTEDLOCK, HTTPENDPOINT, JOBS, MIDDLEWARE, PUBSUB, RESILIENCY,
			SECRETSTORE, STATESTORE, SUBSCRIPTION, WORKFLOW, };

	/**
	 * A public read-only list of all the '<em><b>Node Block Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NodeBlockType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Node Block Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NodeBlockType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NodeBlockType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Node Block Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NodeBlockType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NodeBlockType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Node Block Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NodeBlockType get(int value) {
		switch (value) {
		case ACTOR_VALUE:
			return ACTOR;
		case APP_VALUE:
			return APP;
		case BINDING_VALUE:
			return BINDING;
		case CONFIGURATIONSTORE_VALUE:
			return CONFIGURATIONSTORE;
		case CONVERSATION_VALUE:
			return CONVERSATION;
		case CRYPTOGRAPHY_VALUE:
			return CRYPTOGRAPHY;
		case DISTRIBUTEDLOCK_VALUE:
			return DISTRIBUTEDLOCK;
		case HTTPENDPOINT_VALUE:
			return HTTPENDPOINT;
		case JOBS_VALUE:
			return JOBS;
		case MIDDLEWARE_VALUE:
			return MIDDLEWARE;
		case PUBSUB_VALUE:
			return PUBSUB;
		case RESILIENCY_VALUE:
			return RESILIENCY;
		case SECRETSTORE_VALUE:
			return SECRETSTORE;
		case STATESTORE_VALUE:
			return STATESTORE;
		case SUBSCRIPTION_VALUE:
			return SUBSCRIPTION;
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
	private NodeBlockType(int value, String name, String literal) {
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

} //NodeBlockType
