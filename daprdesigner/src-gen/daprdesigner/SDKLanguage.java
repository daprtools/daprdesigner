/**
 */
package daprdesigner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>SDK Language</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see daprdesigner.DaprdesignerPackage#getSDKLanguage()
 * @model
 * @generated
 */
public enum SDKLanguage implements Enumerator {
	/**
	 * The '<em><b>JAVA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JAVA_VALUE
	 * @generated
	 * @ordered
	 */
	JAVA(0, "JAVA", "JAVA"),

	/**
	 * The '<em><b>CSHARP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSHARP_VALUE
	 * @generated
	 * @ordered
	 */
	CSHARP(1, "CSHARP", "CSHARP"),

	/**
	 * The '<em><b>PYTHON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PYTHON_VALUE
	 * @generated
	 * @ordered
	 */
	PYTHON(2, "PYTHON", "PYTHON"),

	/**
	 * The '<em><b>NODE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NODE_VALUE
	 * @generated
	 * @ordered
	 */
	NODE(3, "NODE", "NODE"),

	/**
	 * The '<em><b>RUST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUST_VALUE
	 * @generated
	 * @ordered
	 */
	RUST(4, "RUST", "RUST");

	/**
	 * The '<em><b>JAVA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JAVA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_VALUE = 0;

	/**
	 * The '<em><b>CSHARP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSHARP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CSHARP_VALUE = 1;

	/**
	 * The '<em><b>PYTHON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PYTHON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PYTHON_VALUE = 2;

	/**
	 * The '<em><b>NODE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NODE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NODE_VALUE = 3;

	/**
	 * The '<em><b>RUST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RUST_VALUE = 4;

	/**
	 * An array of all the '<em><b>SDK Language</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SDKLanguage[] VALUES_ARRAY = new SDKLanguage[] { JAVA, CSHARP, PYTHON, NODE, RUST, };

	/**
	 * A public read-only list of all the '<em><b>SDK Language</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SDKLanguage> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>SDK Language</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SDKLanguage get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SDKLanguage result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SDK Language</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SDKLanguage getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SDKLanguage result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SDK Language</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SDKLanguage get(int value) {
		switch (value) {
		case JAVA_VALUE:
			return JAVA;
		case CSHARP_VALUE:
			return CSHARP;
		case PYTHON_VALUE:
			return PYTHON;
		case NODE_VALUE:
			return NODE;
		case RUST_VALUE:
			return RUST;
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
	private SDKLanguage(int value, String name, String literal) {
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

} //SDKLanguage
