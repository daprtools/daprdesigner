/**
 */
package daprdesigner;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Retry Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.RetryPolicy#getPolicy_type <em>Policy type</em>}</li>
 *   <li>{@link daprdesigner.RetryPolicy#getDuration <em>Duration</em>}</li>
 *   <li>{@link daprdesigner.RetryPolicy#getMaxRetries <em>Max Retries</em>}</li>
 *   <li>{@link daprdesigner.RetryPolicy#getMaxInterval <em>Max Interval</em>}</li>
 *   <li>{@link daprdesigner.RetryPolicy#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getRetryPolicy()
 * @model
 * @generated
 */
public interface RetryPolicy extends DaprNode {
	/**
	 * Returns the value of the '<em><b>Policy type</b></em>' attribute.
	 * The literals are from the enumeration {@link daprdesigner.RetryPolicyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy type</em>' attribute.
	 * @see daprdesigner.RetryPolicyType
	 * @see #setPolicy_type(RetryPolicyType)
	 * @see daprdesigner.DaprdesignerPackage#getRetryPolicy_Policy_type()
	 * @model
	 * @generated
	 */
	RetryPolicyType getPolicy_type();

	/**
	 * Sets the value of the '{@link daprdesigner.RetryPolicy#getPolicy_type <em>Policy type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy type</em>' attribute.
	 * @see daprdesigner.RetryPolicyType
	 * @see #getPolicy_type()
	 * @generated
	 */
	void setPolicy_type(RetryPolicyType value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see daprdesigner.DaprdesignerPackage#getRetryPolicy_Duration()
	 * @model
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link daprdesigner.RetryPolicy#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

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

	/**
	 * Returns the value of the '<em><b>Max Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Interval</em>' attribute.
	 * @see #setMaxInterval(int)
	 * @see daprdesigner.DaprdesignerPackage#getRetryPolicy_MaxInterval()
	 * @model
	 * @generated
	 */
	int getMaxInterval();

	/**
	 * Sets the value of the '{@link daprdesigner.RetryPolicy#getMaxInterval <em>Max Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Interval</em>' attribute.
	 * @see #getMaxInterval()
	 * @generated
	 */
	void setMaxInterval(int value);

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

} // RetryPolicy
