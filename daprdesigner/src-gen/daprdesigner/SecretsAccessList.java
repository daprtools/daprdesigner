/**
 */
package daprdesigner;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Secrets Access List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.SecretsAccessList#getComponent <em>Component</em>}</li>
 *   <li>{@link daprdesigner.SecretsAccessList#isDefaultAccess <em>Default Access</em>}</li>
 *   <li>{@link daprdesigner.SecretsAccessList#getSecrets <em>Secrets</em>}</li>
 *   <li>{@link daprdesigner.SecretsAccessList#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getSecretsAccessList()
 * @model
 * @generated
 */
public interface SecretsAccessList extends DaprNode {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(Component)
	 * @see daprdesigner.DaprdesignerPackage#getSecretsAccessList_Component()
	 * @model
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the '{@link daprdesigner.SecretsAccessList#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Default Access</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Access</em>' attribute.
	 * @see #setDefaultAccess(boolean)
	 * @see daprdesigner.DaprdesignerPackage#getSecretsAccessList_DefaultAccess()
	 * @model default="true"
	 * @generated
	 */
	boolean isDefaultAccess();

	/**
	 * Sets the value of the '{@link daprdesigner.SecretsAccessList#isDefaultAccess <em>Default Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Access</em>' attribute.
	 * @see #isDefaultAccess()
	 * @generated
	 */
	void setDefaultAccess(boolean value);

	/**
	 * Returns the value of the '<em><b>Secrets</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secrets</em>' attribute list.
	 * @see daprdesigner.DaprdesignerPackage#getSecretsAccessList_Secrets()
	 * @model
	 * @generated
	 */
	EList<String> getSecrets();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * The literals are from the enumeration {@link daprdesigner.AccessAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see daprdesigner.AccessAction
	 * @see #setAction(AccessAction)
	 * @see daprdesigner.DaprdesignerPackage#getSecretsAccessList_Action()
	 * @model
	 * @generated
	 */
	AccessAction getAction();

	/**
	 * Sets the value of the '{@link daprdesigner.SecretsAccessList#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see daprdesigner.AccessAction
	 * @see #getAction()
	 * @generated
	 */
	void setAction(AccessAction value);

} // SecretsAccessList
