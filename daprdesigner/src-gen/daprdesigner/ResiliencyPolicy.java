/**
 */
package daprdesigner;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resiliency Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.ResiliencyPolicy#getRetries <em>Retries</em>}</li>
 *   <li>{@link daprdesigner.ResiliencyPolicy#getCircuitbreakers <em>Circuitbreakers</em>}</li>
 *   <li>{@link daprdesigner.ResiliencyPolicy#getTimeoutDefinitions <em>Timeout Definitions</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getResiliencyPolicy()
 * @model
 * @generated
 */
public interface ResiliencyPolicy extends DaprNode {
	/**
	 * Returns the value of the '<em><b>Retries</b></em>' reference list.
	 * The list contents are of type {@link daprdesigner.RetryPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retries</em>' reference list.
	 * @see daprdesigner.DaprdesignerPackage#getResiliencyPolicy_Retries()
	 * @model
	 * @generated
	 */
	EList<RetryPolicy> getRetries();

	/**
	 * Returns the value of the '<em><b>Circuitbreakers</b></em>' containment reference list.
	 * The list contents are of type {@link daprdesigner.CircuitBreakerPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circuitbreakers</em>' containment reference list.
	 * @see daprdesigner.DaprdesignerPackage#getResiliencyPolicy_Circuitbreakers()
	 * @model containment="true"
	 * @generated
	 */
	EList<CircuitBreakerPolicy> getCircuitbreakers();

	/**
	 * Returns the value of the '<em><b>Timeout Definitions</b></em>' reference list.
	 * The list contents are of type {@link daprdesigner.ResiliencyTimeout}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout Definitions</em>' reference list.
	 * @see daprdesigner.DaprdesignerPackage#getResiliencyPolicy_TimeoutDefinitions()
	 * @model
	 * @generated
	 */
	EList<ResiliencyTimeout> getTimeoutDefinitions();

} // ResiliencyPolicy
