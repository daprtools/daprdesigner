/**
 */
package daprdesigner;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Circuit Breaker Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.CircuitBreakerPolicy#getMaxRequests <em>Max Requests</em>}</li>
 *   <li>{@link daprdesigner.CircuitBreakerPolicy#getInterval <em>Interval</em>}</li>
 *   <li>{@link daprdesigner.CircuitBreakerPolicy#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link daprdesigner.CircuitBreakerPolicy#getTrip <em>Trip</em>}</li>
 *   <li>{@link daprdesigner.CircuitBreakerPolicy#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getCircuitBreakerPolicy()
 * @model
 * @generated
 */
public interface CircuitBreakerPolicy extends DaprNode {
	/**
	 * Returns the value of the '<em><b>Max Requests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Requests</em>' attribute.
	 * @see #setMaxRequests(int)
	 * @see daprdesigner.DaprdesignerPackage#getCircuitBreakerPolicy_MaxRequests()
	 * @model
	 * @generated
	 */
	int getMaxRequests();

	/**
	 * Sets the value of the '{@link daprdesigner.CircuitBreakerPolicy#getMaxRequests <em>Max Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Requests</em>' attribute.
	 * @see #getMaxRequests()
	 * @generated
	 */
	void setMaxRequests(int value);

	/**
	 * Returns the value of the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval</em>' attribute.
	 * @see #setInterval(int)
	 * @see daprdesigner.DaprdesignerPackage#getCircuitBreakerPolicy_Interval()
	 * @model
	 * @generated
	 */
	int getInterval();

	/**
	 * Sets the value of the '{@link daprdesigner.CircuitBreakerPolicy#getInterval <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval</em>' attribute.
	 * @see #getInterval()
	 * @generated
	 */
	void setInterval(int value);

	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #setTimeout(int)
	 * @see daprdesigner.DaprdesignerPackage#getCircuitBreakerPolicy_Timeout()
	 * @model
	 * @generated
	 */
	int getTimeout();

	/**
	 * Sets the value of the '{@link daprdesigner.CircuitBreakerPolicy#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(int value);

	/**
	 * Returns the value of the '<em><b>Trip</b></em>' attribute.
	 * The default value is <code>"consecutiveFailures > 5"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trip</em>' attribute.
	 * @see #setTrip(String)
	 * @see daprdesigner.DaprdesignerPackage#getCircuitBreakerPolicy_Trip()
	 * @model default="consecutiveFailures &gt; 5"
	 * @generated
	 */
	String getTrip();

	/**
	 * Sets the value of the '{@link daprdesigner.CircuitBreakerPolicy#getTrip <em>Trip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trip</em>' attribute.
	 * @see #getTrip()
	 * @generated
	 */
	void setTrip(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see daprdesigner.DaprdesignerPackage#getCircuitBreakerPolicy_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link daprdesigner.CircuitBreakerPolicy#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CircuitBreakerPolicy
