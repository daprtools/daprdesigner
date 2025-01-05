/**
 */
package daprdesigner;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Middleware Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.MiddlewareConfiguration#getIncomingHandler <em>Incoming Handler</em>}</li>
 *   <li>{@link daprdesigner.MiddlewareConfiguration#getOutgoingHandler <em>Outgoing Handler</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getMiddlewareConfiguration()
 * @model
 * @generated
 */
public interface MiddlewareConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Incoming Handler</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Handler</em>' map.
	 * @see daprdesigner.DaprdesignerPackage#getMiddlewareConfiguration_IncomingHandler()
	 * @model mapType="daprdesigner.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	EMap<String, String> getIncomingHandler();

	/**
	 * Returns the value of the '<em><b>Outgoing Handler</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Handler</em>' map.
	 * @see daprdesigner.DaprdesignerPackage#getMiddlewareConfiguration_OutgoingHandler()
	 * @model mapType="daprdesigner.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	EMap<String, String> getOutgoingHandler();

} // MiddlewareConfiguration
