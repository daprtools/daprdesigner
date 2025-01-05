/**
 */
package daprdesigner;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>API Access Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.APIAccessControl#getAllowedAPIs <em>Allowed AP Is</em>}</li>
 *   <li>{@link daprdesigner.APIAccessControl#getDeniedAPIs <em>Denied AP Is</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getAPIAccessControl()
 * @model
 * @generated
 */
public interface APIAccessControl extends EObject {
	/**
	 * Returns the value of the '<em><b>Allowed AP Is</b></em>' containment reference list.
	 * The list contents are of type {@link daprdesigner.API}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed AP Is</em>' containment reference list.
	 * @see daprdesigner.DaprdesignerPackage#getAPIAccessControl_AllowedAPIs()
	 * @model containment="true"
	 * @generated
	 */
	EList<API> getAllowedAPIs();

	/**
	 * Returns the value of the '<em><b>Denied AP Is</b></em>' containment reference list.
	 * The list contents are of type {@link daprdesigner.API}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Denied AP Is</em>' containment reference list.
	 * @see daprdesigner.DaprdesignerPackage#getAPIAccessControl_DeniedAPIs()
	 * @model containment="true"
	 * @generated
	 */
	EList<API> getDeniedAPIs();

} // APIAccessControl
