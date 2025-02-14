/**
 */
package daprdesigner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>API Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see daprdesigner.DaprdesignerPackage#getAPIType()
 * @model
 * @generated
 */
public enum APIType implements Enumerator {
	/**
	 * The '<em><b>INVOKE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVOKE_VALUE
	 * @generated
	 * @ordered
	 */
	INVOKE(0, "INVOKE", "INVOKE"),

	/**
	 * The '<em><b>STATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATE_VALUE
	 * @generated
	 * @ordered
	 */
	STATE(1, "STATE", "STATE"),

	/**
	 * The '<em><b>PUBLISH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLISH_VALUE
	 * @generated
	 * @ordered
	 */
	PUBLISH(2, "PUBLISH", "PUBLISH"),

	/**
	 * The '<em><b>SUBSCRIBE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSCRIBE_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSCRIBE(3, "SUBSCRIBE", "SUBSCRIBE"),

	/**
	 * The '<em><b>BINDINGS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BINDINGS_VALUE
	 * @generated
	 * @ordered
	 */
	BINDINGS(4, "BINDINGS", "BINDINGS"),

	/**
	 * The '<em><b>SECRETS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECRETS_VALUE
	 * @generated
	 * @ordered
	 */
	SECRETS(5, "SECRETS", "SECRETS"),

	/**
	 * The '<em><b>ACTORS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTORS_VALUE
	 * @generated
	 * @ordered
	 */
	ACTORS(6, "ACTORS", "ACTORS"),

	/**
	 * The '<em><b>METADATA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METADATA_VALUE
	 * @generated
	 * @ordered
	 */
	METADATA(7, "METADATA", "METADATA"),

	/**
	 * The '<em><b>CONFIGURATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIGURATION_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIGURATION(8, "CONFIGURATION", "CONFIGURATION"),

	/**
	 * The '<em><b>LOCK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCK_VALUE
	 * @generated
	 * @ordered
	 */
	LOCK(9, "LOCK", "LOCK"),

	/**
	 * The '<em><b>UNLOCK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNLOCK_VALUE
	 * @generated
	 * @ordered
	 */
	UNLOCK(10, "UNLOCK", "UNLOCK"),

	/**
	 * The '<em><b>CRYPTO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRYPTO_VALUE
	 * @generated
	 * @ordered
	 */
	CRYPTO(11, "CRYPTO", "CRYPTO"),

	/**
	 * The '<em><b>WORKFLOWS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORKFLOWS_VALUE
	 * @generated
	 * @ordered
	 */
	WORKFLOWS(12, "WORKFLOWS", "WORKFLOWS"),

	/**
	 * The '<em><b>HEALTHZ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEALTHZ_VALUE
	 * @generated
	 * @ordered
	 */
	HEALTHZ(13, "HEALTHZ", "HEALTHZ"),

	/**
	 * The '<em><b>SHUTDOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHUTDOWN_VALUE
	 * @generated
	 * @ordered
	 */
	SHUTDOWN(14, "SHUTDOWN", "SHUTDOWN");

	/**
	 * The '<em><b>INVOKE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVOKE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INVOKE_VALUE = 0;

	/**
	 * The '<em><b>STATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STATE_VALUE = 1;

	/**
	 * The '<em><b>PUBLISH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLISH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PUBLISH_VALUE = 2;

	/**
	 * The '<em><b>SUBSCRIBE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSCRIBE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUBSCRIBE_VALUE = 3;

	/**
	 * The '<em><b>BINDINGS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BINDINGS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BINDINGS_VALUE = 4;

	/**
	 * The '<em><b>SECRETS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECRETS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SECRETS_VALUE = 5;

	/**
	 * The '<em><b>ACTORS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTORS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACTORS_VALUE = 6;

	/**
	 * The '<em><b>METADATA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METADATA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int METADATA_VALUE = 7;

	/**
	 * The '<em><b>CONFIGURATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIGURATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONFIGURATION_VALUE = 8;

	/**
	 * The '<em><b>LOCK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOCK_VALUE = 9;

	/**
	 * The '<em><b>UNLOCK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNLOCK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNLOCK_VALUE = 10;

	/**
	 * The '<em><b>CRYPTO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRYPTO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CRYPTO_VALUE = 11;

	/**
	 * The '<em><b>WORKFLOWS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORKFLOWS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOWS_VALUE = 12;

	/**
	 * The '<em><b>HEALTHZ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEALTHZ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEALTHZ_VALUE = 13;

	/**
	 * The '<em><b>SHUTDOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHUTDOWN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHUTDOWN_VALUE = 14;

	/**
	 * An array of all the '<em><b>API Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final APIType[] VALUES_ARRAY = new APIType[] { INVOKE, STATE, PUBLISH, SUBSCRIBE, BINDINGS, SECRETS,
			ACTORS, METADATA, CONFIGURATION, LOCK, UNLOCK, CRYPTO, WORKFLOWS, HEALTHZ, SHUTDOWN, };

	/**
	 * A public read-only list of all the '<em><b>API Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<APIType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>API Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static APIType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			APIType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>API Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static APIType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			APIType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>API Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static APIType get(int value) {
		switch (value) {
		case INVOKE_VALUE:
			return INVOKE;
		case STATE_VALUE:
			return STATE;
		case PUBLISH_VALUE:
			return PUBLISH;
		case SUBSCRIBE_VALUE:
			return SUBSCRIBE;
		case BINDINGS_VALUE:
			return BINDINGS;
		case SECRETS_VALUE:
			return SECRETS;
		case ACTORS_VALUE:
			return ACTORS;
		case METADATA_VALUE:
			return METADATA;
		case CONFIGURATION_VALUE:
			return CONFIGURATION;
		case LOCK_VALUE:
			return LOCK;
		case UNLOCK_VALUE:
			return UNLOCK;
		case CRYPTO_VALUE:
			return CRYPTO;
		case WORKFLOWS_VALUE:
			return WORKFLOWS;
		case HEALTHZ_VALUE:
			return HEALTHZ;
		case SHUTDOWN_VALUE:
			return SHUTDOWN;
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
	private APIType(int value, String name, String literal) {
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

} //APIType
