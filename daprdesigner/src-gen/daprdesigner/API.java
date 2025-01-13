/**
 */
package daprdesigner;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>API</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.API#getComponent <em>Component</em>}</li>
 *   <li>{@link daprdesigner.API#getApi_version <em>Api version</em>}</li>
 *   <li>{@link daprdesigner.API#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link daprdesigner.API#getAccess <em>Access</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getAPI()
 * @model
 * @generated
 */
public interface API extends DaprNode {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(Component)
	 * @see daprdesigner.DaprdesignerPackage#getAPI_Component()
	 * @model
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the '{@link daprdesigner.API#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);

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
	 * The literals are from the enumeration {@link daprdesigner.Protocol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see daprdesigner.Protocol
	 * @see #setProtocol(Protocol)
	 * @see daprdesigner.DaprdesignerPackage#getAPI_Protocol()
	 * @model
	 * @generated
	 */
	Protocol getProtocol();

	/**
	 * Sets the value of the '{@link daprdesigner.API#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see daprdesigner.Protocol
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(Protocol value);

	/**
	 * Returns the value of the '<em><b>Access</b></em>' attribute.
	 * The literals are from the enumeration {@link daprdesigner.AccessAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access</em>' attribute.
	 * @see daprdesigner.AccessAction
	 * @see #setAccess(AccessAction)
	 * @see daprdesigner.DaprdesignerPackage#getAPI_Access()
	 * @model
	 * @generated
	 */
	AccessAction getAccess();

	/**
	 * Sets the value of the '{@link daprdesigner.API#getAccess <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access</em>' attribute.
	 * @see daprdesigner.AccessAction
	 * @see #getAccess()
	 * @generated
	 */
	void setAccess(AccessAction value);

} // API
