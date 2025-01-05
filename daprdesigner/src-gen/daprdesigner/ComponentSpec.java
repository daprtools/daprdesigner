/**
 */
package daprdesigner;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.ComponentSpec#isIgnoreErrors <em>Ignore Errors</em>}</li>
 *   <li>{@link daprdesigner.ComponentSpec#getInitTimeout <em>Init Timeout</em>}</li>
 *   <li>{@link daprdesigner.ComponentSpec#getSpec_metadata <em>Spec metadata</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getComponentSpec()
 * @model
 * @generated
 */
public interface ComponentSpec extends EObject {
	/**
	 * Returns the value of the '<em><b>Ignore Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore Errors</em>' attribute.
	 * @see #setIgnoreErrors(boolean)
	 * @see daprdesigner.DaprdesignerPackage#getComponentSpec_IgnoreErrors()
	 * @model
	 * @generated
	 */
	boolean isIgnoreErrors();

	/**
	 * Sets the value of the '{@link daprdesigner.ComponentSpec#isIgnoreErrors <em>Ignore Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Errors</em>' attribute.
	 * @see #isIgnoreErrors()
	 * @generated
	 */
	void setIgnoreErrors(boolean value);

	/**
	 * Returns the value of the '<em><b>Init Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Timeout</em>' attribute.
	 * @see #setInitTimeout(String)
	 * @see daprdesigner.DaprdesignerPackage#getComponentSpec_InitTimeout()
	 * @model
	 * @generated
	 */
	String getInitTimeout();

	/**
	 * Sets the value of the '{@link daprdesigner.ComponentSpec#getInitTimeout <em>Init Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Timeout</em>' attribute.
	 * @see #getInitTimeout()
	 * @generated
	 */
	void setInitTimeout(String value);

	/**
	 * Returns the value of the '<em><b>Spec metadata</b></em>' containment reference list.
	 * The list contents are of type {@link daprdesigner.SpecMetadata}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec metadata</em>' containment reference list.
	 * @see daprdesigner.DaprdesignerPackage#getComponentSpec_Spec_metadata()
	 * @model containment="true"
	 * @generated
	 */
	EList<SpecMetadata> getSpec_metadata();

} // ComponentSpec
