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
 *   <li>{@link daprdesigner.HttpHandler#getHelp <em>Help</em>}</li>
 *   <li>{@link daprdesigner.HttpHandler#getMiddlewareComponent <em>Middleware Component</em>}</li>
 *   <li>{@link daprdesigner.HttpHandler#getHandlerType <em>Handler Type</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getHttpHandler()
 * @model
 * @generated
 */
public interface HttpHandler extends DaprNode {
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
	 * Returns the value of the '<em><b>Help</b></em>' attribute.
	 * The default value is <code>"https://docs.dapr.io/operations/configuration/configuration-overview/#middleware"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Help</em>' attribute.
	 * @see daprdesigner.DaprdesignerPackage#getHttpHandler_Help()
	 * @model default="https://docs.dapr.io/operations/configuration/configuration-overview/#middleware" changeable="false"
	 * @generated
	 */
	String getHelp();

	/**
	 * Returns the value of the '<em><b>Middleware Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Middleware Component</em>' reference.
	 * @see #setMiddlewareComponent(Middleware)
	 * @see daprdesigner.DaprdesignerPackage#getHttpHandler_MiddlewareComponent()
	 * @model
	 * @generated
	 */
	Middleware getMiddlewareComponent();

	/**
	 * Sets the value of the '{@link daprdesigner.HttpHandler#getMiddlewareComponent <em>Middleware Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Middleware Component</em>' reference.
	 * @see #getMiddlewareComponent()
	 * @generated
	 */
	void setMiddlewareComponent(Middleware value);

} // HttpHandler
