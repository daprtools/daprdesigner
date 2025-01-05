/**
 */
package daprdesigner;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Retry Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.RetryPolicy#getName <em>Name</em>}</li>
 *   <li>{@link daprdesigner.RetryPolicy#getPolicy_type <em>Policy type</em>}</li>
 *   <li>{@link daprdesigner.RetryPolicy#getDuration <em>Duration</em>}</li>
 *   <li>{@link daprdesigner.RetryPolicy#getMaxRetries <em>Max Retries</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getRetryPolicy()
 * @model
 * @generated
 */
public interface RetryPolicy extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see daprdesigner.DaprdesignerPackage#getRetryPolicy_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link daprdesigner.RetryPolicy#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Policy type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy type</em>' attribute.
	 * @see #setPolicy_type(String)
	 * @see daprdesigner.DaprdesignerPackage#getRetryPolicy_Policy_type()
	 * @model
	 * @generated
	 */
	String getPolicy_type();

	/**
	 * Sets the value of the '{@link daprdesigner.RetryPolicy#getPolicy_type <em>Policy type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy type</em>' attribute.
	 * @see #getPolicy_type()
	 * @generated
	 */
	void setPolicy_type(String value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(String)
	 * @see daprdesigner.DaprdesignerPackage#getRetryPolicy_Duration()
	 * @model
	 * @generated
	 */
	String getDuration();

	/**
	 * Sets the value of the '{@link daprdesigner.RetryPolicy#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(String value);

	/**
	 * Returns the value of the '<em><b>Max Retries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Retries</em>' attribute.
	 * @see #setMaxRetries(int)
	 * @see daprdesigner.DaprdesignerPackage#getRetryPolicy_MaxRetries()
	 * @model
	 * @generated
	 */
	int getMaxRetries();

	/**
	 * Sets the value of the '{@link daprdesigner.RetryPolicy#getMaxRetries <em>Max Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Retries</em>' attribute.
	 * @see #getMaxRetries()
	 * @generated
	 */
	void setMaxRetries(int value);

} // RetryPolicy
