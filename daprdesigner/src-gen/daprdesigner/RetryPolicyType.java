/**
 */
package daprdesigner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Retry Policy Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see daprdesigner.DaprdesignerPackage#getRetryPolicyType()
 * @model
 * @generated
 */
public enum RetryPolicyType implements Enumerator {
	/**
	 * The '<em><b>CONSTANT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSTANT_VALUE
	 * @generated
	 * @ordered
	 */
	CONSTANT(0, "CONSTANT", "CONSTANT"),

	/**
	 * The '<em><b>EXPONENTIAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPONENTIAL_VALUE
	 * @generated
	 * @ordered
	 */
	EXPONENTIAL(1, "EXPONENTIAL", "EXPONENTIAL");

	/**
	 * The '<em><b>CONSTANT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSTANT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONSTANT_VALUE = 0;

	/**
	 * The '<em><b>EXPONENTIAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPONENTIAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXPONENTIAL_VALUE = 1;

	/**
	 * An array of all the '<em><b>Retry Policy Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RetryPolicyType[] VALUES_ARRAY = new RetryPolicyType[] { CONSTANT, EXPONENTIAL, };

	/**
	 * A public read-only list of all the '<em><b>Retry Policy Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RetryPolicyType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Retry Policy Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RetryPolicyType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RetryPolicyType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Retry Policy Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RetryPolicyType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RetryPolicyType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Retry Policy Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RetryPolicyType get(int value) {
		switch (value) {
		case CONSTANT_VALUE:
			return CONSTANT;
		case EXPONENTIAL_VALUE:
			return EXPONENTIAL;
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
	private RetryPolicyType(int value, String name, String literal) {
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

} //RetryPolicyType
