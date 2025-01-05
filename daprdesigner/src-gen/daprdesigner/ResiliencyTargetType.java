/**
 */
package daprdesigner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Resiliency Target Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see daprdesigner.DaprdesignerPackage#getResiliencyTargetType()
 * @model
 * @generated
 */
public enum ResiliencyTargetType implements Enumerator {
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
	 * The '<em><b>ACTOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTOR_VALUE
	 * @generated
	 * @ordered
	 */
	ACTOR(2, "ACTOR", "ACTOR"),

	/**
	 * The '<em><b>COMPONENT INBOUND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPONENT_INBOUND_VALUE
	 * @generated
	 * @ordered
	 */
	COMPONENT_INBOUND(3, "COMPONENT_INBOUND", "COMPONENT_INBOUND"),

	/**
	 * The '<em><b>COMPONENT OUTBOUND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPONENT_OUTBOUND_VALUE
	 * @generated
	 * @ordered
	 */
	COMPONENT_OUTBOUND(4, "COMPONENT_OUTBOUND", "COMPONENT_OUTBOUND");

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
	 * The '<em><b>ACTOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACTOR_VALUE = 2;

	/**
	 * The '<em><b>COMPONENT INBOUND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPONENT_INBOUND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT_INBOUND_VALUE = 3;

	/**
	 * The '<em><b>COMPONENT OUTBOUND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPONENT_OUTBOUND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT_OUTBOUND_VALUE = 4;

	/**
	 * An array of all the '<em><b>Resiliency Target Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ResiliencyTargetType[] VALUES_ARRAY = new ResiliencyTargetType[] { APP, ACTOR,
			COMPONENT_INBOUND, COMPONENT_OUTBOUND, };

	/**
	 * A public read-only list of all the '<em><b>Resiliency Target Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ResiliencyTargetType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Resiliency Target Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResiliencyTargetType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResiliencyTargetType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resiliency Target Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResiliencyTargetType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResiliencyTargetType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resiliency Target Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResiliencyTargetType get(int value) {
		switch (value) {
		case APP_VALUE:
			return APP;
		case ACTOR_VALUE:
			return ACTOR;
		case COMPONENT_INBOUND_VALUE:
			return COMPONENT_INBOUND;
		case COMPONENT_OUTBOUND_VALUE:
			return COMPONENT_OUTBOUND;
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
	private ResiliencyTargetType(int value, String name, String literal) {
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

} //ResiliencyTargetType
