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
 *   <li>{@link daprdesigner.RetryPolicy#getHelp <em>Help</em>}</li>
 *   <li>{@link daprdesigner.RetryPolicy#getPolicy_type <em>Policy type</em>}</li>
 *   <li>{@link daprdesigner.RetryPolicy#getDuration <em>Duration</em>}</li>
 *   <li>{@link daprdesigner.RetryPolicy#getMaxRetries <em>Max Retries</em>}</li>
 *   <li>{@link daprdesigner.RetryPolicy#getMaxInterval <em>Max Interval</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getRetryPolicy()
 * @model
 * @generated
 */
public interface RetryPolicy extends DaprNode {
	/**
	 * Returns the value of the '<em><b>Help</b></em>' attribute.
	 * The default value is <code>"https://docs.dapr.io/operations/resiliency/policies/#retries"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Help</em>' attribute.
	 * @see daprdesigner.DaprdesignerPackage#getRetryPolicy_Help()
	 * @model default="https://docs.dapr.io/operations/resiliency/policies/#retries" changeable="false"
	 * @generated
	 */
	String getHelp();

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

} // RetryPolicy
