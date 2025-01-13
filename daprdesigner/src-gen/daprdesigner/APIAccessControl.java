/**
 */
package daprdesigner;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>API Access Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.APIAccessControl#getApiList <em>Api List</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getAPIAccessControl()
 * @model
 * @generated
 */
public interface APIAccessControl extends AppConfiguration {
	/**
	 * Returns the value of the '<em><b>Api List</b></em>' reference list.
	 * The list contents are of type {@link daprdesigner.API}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api List</em>' reference list.
	 * @see daprdesigner.DaprdesignerPackage#getAPIAccessControl_ApiList()
	 * @model
	 * @generated
	 */
	EList<API> getApiList();

} // APIAccessControl
