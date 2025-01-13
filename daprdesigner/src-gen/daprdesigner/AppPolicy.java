/**
 */
package daprdesigner;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>App Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.AppPolicy#getApp <em>App</em>}</li>
 *   <li>{@link daprdesigner.AppPolicy#getDefaultAction <em>Default Action</em>}</li>
 *   <li>{@link daprdesigner.AppPolicy#getTrustDomain <em>Trust Domain</em>}</li>
 *   <li>{@link daprdesigner.AppPolicy#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link daprdesigner.AppPolicy#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getAppPolicy()
 * @model
 * @generated
 */
public interface AppPolicy extends DaprNode {
	/**
	 * Returns the value of the '<em><b>App</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App</em>' reference.
	 * @see #setApp(App)
	 * @see daprdesigner.DaprdesignerPackage#getAppPolicy_App()
	 * @model
	 * @generated
	 */
	App getApp();

	/**
	 * Sets the value of the '{@link daprdesigner.AppPolicy#getApp <em>App</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App</em>' reference.
	 * @see #getApp()
	 * @generated
	 */
	void setApp(App value);

	/**
	 * Returns the value of the '<em><b>Default Action</b></em>' attribute.
	 * The literals are from the enumeration {@link daprdesigner.AccessAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Action</em>' attribute.
	 * @see daprdesigner.AccessAction
	 * @see #setDefaultAction(AccessAction)
	 * @see daprdesigner.DaprdesignerPackage#getAppPolicy_DefaultAction()
	 * @model
	 * @generated
	 */
	AccessAction getDefaultAction();

	/**
	 * Sets the value of the '{@link daprdesigner.AppPolicy#getDefaultAction <em>Default Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Action</em>' attribute.
	 * @see daprdesigner.AccessAction
	 * @see #getDefaultAction()
	 * @generated
	 */
	void setDefaultAction(AccessAction value);

	/**
	 * Returns the value of the '<em><b>Trust Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trust Domain</em>' reference.
	 * @see #setTrustDomain(Trustdomain)
	 * @see daprdesigner.DaprdesignerPackage#getAppPolicy_TrustDomain()
	 * @model
	 * @generated
	 */
	Trustdomain getTrustDomain();

	/**
	 * Sets the value of the '{@link daprdesigner.AppPolicy#getTrustDomain <em>Trust Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trust Domain</em>' reference.
	 * @see #getTrustDomain()
	 * @generated
	 */
	void setTrustDomain(Trustdomain value);

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' reference.
	 * @see #setNamespace(Namespace)
	 * @see daprdesigner.DaprdesignerPackage#getAppPolicy_Namespace()
	 * @model
	 * @generated
	 */
	Namespace getNamespace();

	/**
	 * Sets the value of the '{@link daprdesigner.AppPolicy#getNamespace <em>Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' reference.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(Namespace value);

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' reference list.
	 * The list contents are of type {@link daprdesigner.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' reference list.
	 * @see daprdesigner.DaprdesignerPackage#getAppPolicy_Operations()
	 * @model
	 * @generated
	 */
	EList<Operation> getOperations();

} // AppPolicy
