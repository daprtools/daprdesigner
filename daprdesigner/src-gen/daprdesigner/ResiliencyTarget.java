/**
 */
package daprdesigner;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resiliency Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.ResiliencyTarget#getType <em>Type</em>}</li>
 *   <li>{@link daprdesigner.ResiliencyTarget#getName <em>Name</em>}</li>
 *   <li>{@link daprdesigner.ResiliencyTarget#getCircuitBreaker <em>Circuit Breaker</em>}</li>
 *   <li>{@link daprdesigner.ResiliencyTarget#getRetry <em>Retry</em>}</li>
 *   <li>{@link daprdesigner.ResiliencyTarget#getCircuitBreakerCacheSize <em>Circuit Breaker Cache Size</em>}</li>
 *   <li>{@link daprdesigner.ResiliencyTarget#getTimeout <em>Timeout</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getResiliencyTarget()
 * @model
 * @generated
 */
public interface ResiliencyTarget extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link daprdesigner.ResiliencyTargetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see daprdesigner.ResiliencyTargetType
	 * @see #setType(ResiliencyTargetType)
	 * @see daprdesigner.DaprdesignerPackage#getResiliencyTarget_Type()
	 * @model
	 * @generated
	 */
	ResiliencyTargetType getType();

	/**
	 * Sets the value of the '{@link daprdesigner.ResiliencyTarget#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see daprdesigner.ResiliencyTargetType
	 * @see #getType()
	 * @generated
	 */
	void setType(ResiliencyTargetType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see daprdesigner.DaprdesignerPackage#getResiliencyTarget_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link daprdesigner.ResiliencyTarget#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Circuit Breaker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circuit Breaker</em>' containment reference.
	 * @see #setCircuitBreaker(CircuitBreakerPolicy)
	 * @see daprdesigner.DaprdesignerPackage#getResiliencyTarget_CircuitBreaker()
	 * @model containment="true"
	 * @generated
	 */
	CircuitBreakerPolicy getCircuitBreaker();

	/**
	 * Sets the value of the '{@link daprdesigner.ResiliencyTarget#getCircuitBreaker <em>Circuit Breaker</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Circuit Breaker</em>' containment reference.
	 * @see #getCircuitBreaker()
	 * @generated
	 */
	void setCircuitBreaker(CircuitBreakerPolicy value);

	/**
	 * Returns the value of the '<em><b>Retry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retry</em>' containment reference.
	 * @see #setRetry(RetryPolicy)
	 * @see daprdesigner.DaprdesignerPackage#getResiliencyTarget_Retry()
	 * @model containment="true"
	 * @generated
	 */
	RetryPolicy getRetry();

	/**
	 * Sets the value of the '{@link daprdesigner.ResiliencyTarget#getRetry <em>Retry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retry</em>' containment reference.
	 * @see #getRetry()
	 * @generated
	 */
	void setRetry(RetryPolicy value);

	/**
	 * Returns the value of the '<em><b>Circuit Breaker Cache Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circuit Breaker Cache Size</em>' attribute.
	 * @see #setCircuitBreakerCacheSize(int)
	 * @see daprdesigner.DaprdesignerPackage#getResiliencyTarget_CircuitBreakerCacheSize()
	 * @model
	 * @generated
	 */
	int getCircuitBreakerCacheSize();

	/**
	 * Sets the value of the '{@link daprdesigner.ResiliencyTarget#getCircuitBreakerCacheSize <em>Circuit Breaker Cache Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Circuit Breaker Cache Size</em>' attribute.
	 * @see #getCircuitBreakerCacheSize()
	 * @generated
	 */
	void setCircuitBreakerCacheSize(int value);

	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout</em>' containment reference.
	 * @see #setTimeout(ResiliencyTimeout)
	 * @see daprdesigner.DaprdesignerPackage#getResiliencyTarget_Timeout()
	 * @model containment="true"
	 * @generated
	 */
	ResiliencyTimeout getTimeout();

	/**
	 * Sets the value of the '{@link daprdesigner.ResiliencyTarget#getTimeout <em>Timeout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' containment reference.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(ResiliencyTimeout value);

} // ResiliencyTarget
