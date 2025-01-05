/**
 */
package daprdesigner;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>API</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.API#getApi_name <em>Api name</em>}</li>
 *   <li>{@link daprdesigner.API#getApi_version <em>Api version</em>}</li>
 *   <li>{@link daprdesigner.API#getProtocol <em>Protocol</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getAPI()
 * @model
 * @generated
 */
public interface API extends EObject {
	/**
	 * Returns the value of the '<em><b>Api name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api name</em>' attribute.
	 * @see #setApi_name(String)
	 * @see daprdesigner.DaprdesignerPackage#getAPI_Api_name()
	 * @model
	 * @generated
	 */
	String getApi_name();

	/**
	 * Sets the value of the '{@link daprdesigner.API#getApi_name <em>Api name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api name</em>' attribute.
	 * @see #getApi_name()
	 * @generated
	 */
	void setApi_name(String value);

	/**
	 * Returns the value of the '<em><b>Api version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api version</em>' attribute.
	 * @see #setApi_version(String)
	 * @see daprdesigner.DaprdesignerPackage#getAPI_Api_version()
	 * @model
	 * @generated
	 */
	String getApi_version();

	/**
	 * Sets the value of the '{@link daprdesigner.API#getApi_version <em>Api version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api version</em>' attribute.
	 * @see #getApi_version()
	 * @generated
	 */
	void setApi_version(String value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see #setProtocol(String)
	 * @see daprdesigner.DaprdesignerPackage#getAPI_Protocol()
	 * @model
	 * @generated
	 */
	String getProtocol();

	/**
	 * Sets the value of the '{@link daprdesigner.API#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(String value);

} // API
