/**
 */
package daprdesigner;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.Operation#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link daprdesigner.Operation#getOperationName <em>Operation Name</em>}</li>
 *   <li>{@link daprdesigner.Operation#getVerbs <em>Verbs</em>}</li>
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
	 * Returns the value of the '<em><b>Verbs</b></em>' attribute list.
	 * The list contents are of type {@link daprdesigner.Verb}.
	 * The literals are from the enumeration {@link daprdesigner.Verb}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verbs</em>' attribute list.
	 * @see daprdesigner.Verb
	 * @see daprdesigner.DaprdesignerPackage#getOperation_Verbs()
	 * @model
	 * @generated
	 */
	EList<Verb> getVerbs();

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

} // Operation
