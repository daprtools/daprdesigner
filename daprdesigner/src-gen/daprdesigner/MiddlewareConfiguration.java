/**
 */
package daprdesigner;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Middleware Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.MiddlewareConfiguration#getHttpHandlers <em>Http Handlers</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getMiddlewareConfiguration()
 * @model
 * @generated
 */
public interface MiddlewareConfiguration extends AppConfiguration {
	/**
	 * Returns the value of the '<em><b>Http Handlers</b></em>' reference list.
	 * The list contents are of type {@link daprdesigner.HttpHandler}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http Handlers</em>' reference list.
	 * @see daprdesigner.DaprdesignerPackage#getMiddlewareConfiguration_HttpHandlers()
	 * @model
	 * @generated
	 */
	EList<HttpHandler> getHttpHandlers();

} // MiddlewareConfiguration
