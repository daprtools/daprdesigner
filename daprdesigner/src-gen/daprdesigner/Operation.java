/**
 */
package daprdesigner;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.Operation#getHelp <em>Help</em>}</li>
 *   <li>{@link daprdesigner.Operation#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link daprdesigner.Operation#getOperationName <em>Operation Name</em>}</li>
 *   <li>{@link daprdesigner.Operation#isApplyToGet <em>Apply To Get</em>}</li>
 *   <li>{@link daprdesigner.Operation#isApplyToPost <em>Apply To Post</em>}</li>
 *   <li>{@link daprdesigner.Operation#isApplyToPut <em>Apply To Put</em>}</li>
 *   <li>{@link daprdesigner.Operation#isApplyToDelete <em>Apply To Delete</em>}</li>
 *   <li>{@link daprdesigner.Operation#isApplyToPatch <em>Apply To Patch</em>}</li>
 *   <li>{@link daprdesigner.Operation#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends DaprNode {
	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link daprdesigner.Protocol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see daprdesigner.Protocol
	 * @see #setProtocol(Protocol)
	 * @see daprdesigner.DaprdesignerPackage#getOperation_Protocol()
	 * @model
	 * @generated
	 */
	Protocol getProtocol();

	/**
	 * Sets the value of the '{@link daprdesigner.Operation#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see daprdesigner.Protocol
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(Protocol value);

	/**
	 * Returns the value of the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Name</em>' attribute.
	 * @see #setOperationName(String)
	 * @see daprdesigner.DaprdesignerPackage#getOperation_OperationName()
	 * @model
	 * @generated
	 */
	String getOperationName();

	/**
	 * Sets the value of the '{@link daprdesigner.Operation#getOperationName <em>Operation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Name</em>' attribute.
	 * @see #getOperationName()
	 * @generated
	 */
	void setOperationName(String value);

	/**
	 * Returns the value of the '<em><b>Apply To Get</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply To Get</em>' attribute.
	 * @see #setApplyToGet(boolean)
	 * @see daprdesigner.DaprdesignerPackage#getOperation_ApplyToGet()
	 * @model
	 * @generated
	 */
	boolean isApplyToGet();

	/**
	 * Sets the value of the '{@link daprdesigner.Operation#isApplyToGet <em>Apply To Get</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apply To Get</em>' attribute.
	 * @see #isApplyToGet()
	 * @generated
	 */
	void setApplyToGet(boolean value);

	/**
	 * Returns the value of the '<em><b>Apply To Post</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply To Post</em>' attribute.
	 * @see #setApplyToPost(boolean)
	 * @see daprdesigner.DaprdesignerPackage#getOperation_ApplyToPost()
	 * @model
	 * @generated
	 */
	boolean isApplyToPost();

	/**
	 * Sets the value of the '{@link daprdesigner.Operation#isApplyToPost <em>Apply To Post</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apply To Post</em>' attribute.
	 * @see #isApplyToPost()
	 * @generated
	 */
	void setApplyToPost(boolean value);

	/**
	 * Returns the value of the '<em><b>Apply To Put</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply To Put</em>' attribute.
	 * @see #setApplyToPut(boolean)
	 * @see daprdesigner.DaprdesignerPackage#getOperation_ApplyToPut()
	 * @model
	 * @generated
	 */
	boolean isApplyToPut();

	/**
	 * Sets the value of the '{@link daprdesigner.Operation#isApplyToPut <em>Apply To Put</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apply To Put</em>' attribute.
	 * @see #isApplyToPut()
	 * @generated
	 */
	void setApplyToPut(boolean value);

	/**
	 * Returns the value of the '<em><b>Apply To Delete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply To Delete</em>' attribute.
	 * @see #setApplyToDelete(boolean)
	 * @see daprdesigner.DaprdesignerPackage#getOperation_ApplyToDelete()
	 * @model
	 * @generated
	 */
	boolean isApplyToDelete();

	/**
	 * Sets the value of the '{@link daprdesigner.Operation#isApplyToDelete <em>Apply To Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apply To Delete</em>' attribute.
	 * @see #isApplyToDelete()
	 * @generated
	 */
	void setApplyToDelete(boolean value);

	/**
	 * Returns the value of the '<em><b>Apply To Patch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply To Patch</em>' attribute.
	 * @see #setApplyToPatch(boolean)
	 * @see daprdesigner.DaprdesignerPackage#getOperation_ApplyToPatch()
	 * @model
	 * @generated
	 */
	boolean isApplyToPatch();

	/**
	 * Sets the value of the '{@link daprdesigner.Operation#isApplyToPatch <em>Apply To Patch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apply To Patch</em>' attribute.
	 * @see #isApplyToPatch()
	 * @generated
	 */
	void setApplyToPatch(boolean value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * The literals are from the enumeration {@link daprdesigner.AccessAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see daprdesigner.AccessAction
	 * @see #setAction(AccessAction)
	 * @see daprdesigner.DaprdesignerPackage#getOperation_Action()
	 * @model
	 * @generated
	 */
	AccessAction getAction();

	/**
	 * Sets the value of the '{@link daprdesigner.Operation#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see daprdesigner.AccessAction
	 * @see #getAction()
	 * @generated
	 */
	void setAction(AccessAction value);

	/**
	 * Returns the value of the '<em><b>Help</b></em>' attribute.
	 * The default value is <code>"https://docs.dapr.io/operations/configuration/invoke-allowlist/#operations"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Help</em>' attribute.
	 * @see daprdesigner.DaprdesignerPackage#getOperation_Help()
	 * @model default="https://docs.dapr.io/operations/configuration/invoke-allowlist/#operations" changeable="false"
	 * @generated
	 */
	String getHelp();

} // Operation
