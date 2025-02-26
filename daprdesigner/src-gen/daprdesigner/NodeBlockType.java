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
	 * The '<em><b>APP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APP_VALUE
	 * @generated
	 * @ordered
	 */
	APP(0, "APP", "APP"),

	/**
	 * The '<em><b>ACTOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTOR_VALUE
	 * @generated
	 * @ordered
	 */
	ACTOR(1, "ACTOR", "ACTOR"),

	/**
	 * The '<em><b>WORKFLOW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORKFLOW_VALUE
	 * @generated
	 * @ordered
	 */
	WORKFLOW(2, "WORKFLOW", "WORKFLOW"),

	/**
	 * The '<em><b>PUBSUB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBSUB_VALUE
	 * @generated
	 * @ordered
	 */
	PUBSUB(3, "PUBSUB", "PUBSUB"),

	/**
	 * The '<em><b>BINDING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BINDING_VALUE
	 * @generated
	 * @ordered
	 */
	BINDING(4, "BINDING", "BINDING"),

	/**
	 * The '<em><b>SECRETSTORE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECRETSTORE_VALUE
	 * @generated
	 * @ordered
	 */
	SECRETSTORE(5, "SECRETSTORE", "SECRETSTORE"),

	/**
	 * The '<em><b>STATESTORE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATESTORE_VALUE
	 * @generated
	 * @ordered
	 */
	STATESTORE(6, "STATESTORE", "STATESTORE"),

	/**
	 * The '<em><b>DISTRIBUTEDLOCK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTRIBUTEDLOCK_VALUE
	 * @generated
	 * @ordered
	 */
	DISTRIBUTEDLOCK(7, "DISTRIBUTEDLOCK", "DISTRIBUTEDLOCK"),

	/**
	 * The '<em><b>CRYPTOGRAPHY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRYPTOGRAPHY_VALUE
	 * @generated
	 * @ordered
	 */
	CRYPTOGRAPHY(8, "CRYPTOGRAPHY", "CRYPTOGRAPHY"),

	/**
	 * The '<em><b>SUBSCRIPTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSCRIPTION_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSCRIPTION(9, "SUBSCRIPTION", "SUBSCRIPTION"),

	/**
	 * The '<em><b>RESILIENCY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESILIENCY_VALUE
	 * @generated
	 * @ordered
	 */
	RESILIENCY(10, "RESILIENCY", "RESILIENCY"),

	/**
	 * The '<em><b>HTTPENDPOINT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTPENDPOINT_VALUE
	 * @generated
	 * @ordered
	 */
	HTTPENDPOINT(11, "HTTPENDPOINT", "HTTPENDPOINT"),
	/**
	 * The '<em><b>JOBS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #JOBS_VALUE
	 * @generated
	 * @ordered
	 */
	JOBS(12, "JOBS", "JOBS"),
	/**
	 * The '<em><b>CONFIGURATIONSTORE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #CONFIGURATIONSTORE_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIGURATIONSTORE(13, "CONFIGURATIONSTORE", "CONFIGURATIONSTORE"),
	/**
	 * The '<em><b>MIDDLEWARE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #MIDDLEWARE_VALUE
	 * @generated
	 * @ordered
	 */
	MIDDLEWARE(14, "MIDDLEWARE", "MIDDLEWARE");

	/**
	 * The '<em><b>APP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int APP_VALUE = 0;

	/**
	 * The '<em><b>ACTOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACTOR_VALUE = 1;

	/**
	 * The '<em><b>WORKFLOW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORKFLOW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_VALUE = 2;

	/**
	 * The '<em><b>PUBSUB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBSUB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PUBSUB_VALUE = 3;

	/**
	 * The '<em><b>BINDING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BINDING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BINDING_VALUE = 4;

	/**
	 * The '<em><b>SECRETSTORE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECRETSTORE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SECRETSTORE_VALUE = 5;

	/**
	 * The '<em><b>STATESTORE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATESTORE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STATESTORE_VALUE = 6;

	/**
	 * The '<em><b>DISTRIBUTEDLOCK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTRIBUTEDLOCK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DISTRIBUTEDLOCK_VALUE = 7;

	/**
	 * The '<em><b>CRYPTOGRAPHY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRYPTOGRAPHY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CRYPTOGRAPHY_VALUE = 8;

	/**
	 * The '<em><b>SUBSCRIPTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSCRIPTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUBSCRIPTION_VALUE = 9;

	/**
	 * The '<em><b>RESILIENCY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESILIENCY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESILIENCY_VALUE = 10;

	/**
	 * The '<em><b>HTTPENDPOINT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTPENDPOINT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HTTPENDPOINT_VALUE = 11;

	/**
	 * The '<em><b>JOBS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JOBS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JOBS_VALUE = 12;

	/**
	 * The '<em><b>CONFIGURATIONSTORE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIGURATIONSTORE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONFIGURATIONSTORE_VALUE = 13;

	/**
	 * The '<em><b>MIDDLEWARE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIDDLEWARE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MIDDLEWARE_VALUE = 14;

	/**
	 * An array of all the '<em><b>Node Block Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NodeBlockType[] VALUES_ARRAY = new NodeBlockType[] { APP, ACTOR, WORKFLOW, PUBSUB, BINDING,
			SECRETSTORE, STATESTORE, DISTRIBUTEDLOCK, CRYPTOGRAPHY, SUBSCRIPTION, RESILIENCY, HTTPENDPOINT, JOBS,
			CONFIGURATIONSTORE, MIDDLEWARE, };

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
		case APP_VALUE:
			return APP;
		case ACTOR_VALUE:
			return ACTOR;
		case WORKFLOW_VALUE:
			return WORKFLOW;
		case PUBSUB_VALUE:
			return PUBSUB;
		case BINDING_VALUE:
			return BINDING;
		case SECRETSTORE_VALUE:
			return SECRETSTORE;
		case STATESTORE_VALUE:
			return STATESTORE;
		case DISTRIBUTEDLOCK_VALUE:
			return DISTRIBUTEDLOCK;
		case CRYPTOGRAPHY_VALUE:
			return CRYPTOGRAPHY;
		case SUBSCRIPTION_VALUE:
			return SUBSCRIPTION;
		case RESILIENCY_VALUE:
			return RESILIENCY;
		case HTTPENDPOINT_VALUE:
			return HTTPENDPOINT;
		case JOBS_VALUE:
			return JOBS;
		case CONFIGURATIONSTORE_VALUE:
			return CONFIGURATIONSTORE;
		case MIDDLEWARE_VALUE:
			return MIDDLEWARE;
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
