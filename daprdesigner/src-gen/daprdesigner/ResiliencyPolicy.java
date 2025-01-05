/**
 */
package daprdesigner;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

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
 *   <li>{@link daprdesigner.ResiliencyPolicy#getTimeouts <em>Timeouts</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getResiliencyPolicy()
 * @model
 * @generated
 */
public interface ResiliencyPolicy extends EObject {
	/**
	 * Returns the value of the '<em><b>Retries</b></em>' containment reference list.
	 * The list contents are of type {@link daprdesigner.RetryPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retries</em>' containment reference list.
	 * @see daprdesigner.DaprdesignerPackage#getResiliencyPolicy_Retries()
	 * @model containment="true"
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
	 * Returns the value of the '<em><b>Timeouts</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeouts</em>' map.
	 * @see daprdesigner.DaprdesignerPackage#getResiliencyPolicy_Timeouts()
	 * @model mapType="daprdesigner.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	EMap<String, String> getTimeouts();

} // ResiliencyPolicy
