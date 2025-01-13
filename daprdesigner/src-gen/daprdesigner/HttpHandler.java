/**
 */
package daprdesigner;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Http Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.HttpHandler#getHandlerName <em>Handler Name</em>}</li>
 *   <li>{@link daprdesigner.HttpHandler#getType <em>Type</em>}</li>
 *   <li>{@link daprdesigner.HttpHandler#getHandlerType <em>Handler Type</em>}</li>
 *   <li>{@link daprdesigner.HttpHandler#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getHttpHandler()
 * @model
 * @generated
 */
public interface HttpHandler extends DaprNode {
	/**
	 * Returns the value of the '<em><b>Handler Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handler Name</em>' attribute.
	 * @see #setHandlerName(String)
	 * @see daprdesigner.DaprdesignerPackage#getHttpHandler_HandlerName()
	 * @model
	 * @generated
	 */
	String getHandlerName();

	/**
	 * Sets the value of the '{@link daprdesigner.HttpHandler#getHandlerName <em>Handler Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handler Name</em>' attribute.
	 * @see #getHandlerName()
	 * @generated
	 */
	void setHandlerName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see daprdesigner.DaprdesignerPackage#getHttpHandler_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link daprdesigner.HttpHandler#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Handler Type</b></em>' attribute.
	 * The literals are from the enumeration {@link daprdesigner.HttpHandlerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handler Type</em>' attribute.
	 * @see daprdesigner.HttpHandlerType
	 * @see #setHandlerType(HttpHandlerType)
	 * @see daprdesigner.DaprdesignerPackage#getHttpHandler_HandlerType()
	 * @model
	 * @generated
	 */
	HttpHandlerType getHandlerType();

	/**
	 * Sets the value of the '{@link daprdesigner.HttpHandler#getHandlerType <em>Handler Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handler Type</em>' attribute.
	 * @see daprdesigner.HttpHandlerType
	 * @see #getHandlerType()
	 * @generated
	 */
	void setHandlerType(HttpHandlerType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see daprdesigner.DaprdesignerPackage#getHttpHandler_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link daprdesigner.HttpHandler#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // HttpHandler
