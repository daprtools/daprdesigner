/**
 */
package daprdesigner;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>App Access Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.AppAccessControl#getDefaultAction <em>Default Action</em>}</li>
 *   <li>{@link daprdesigner.AppAccessControl#getTrustDomain <em>Trust Domain</em>}</li>
 *   <li>{@link daprdesigner.AppAccessControl#getPolicies <em>Policies</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getAppAccessControl()
 * @model
 * @generated
 */
public interface AppAccessControl extends EObject {
	/**
	 * Returns the value of the '<em><b>Default Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Action</em>' attribute.
	 * @see #setDefaultAction(String)
	 * @see daprdesigner.DaprdesignerPackage#getAppAccessControl_DefaultAction()
	 * @model
	 * @generated
	 */
	String getDefaultAction();

	/**
	 * Sets the value of the '{@link daprdesigner.AppAccessControl#getDefaultAction <em>Default Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Action</em>' attribute.
	 * @see #getDefaultAction()
	 * @generated
	 */
	void setDefaultAction(String value);

	/**
	 * Returns the value of the '<em><b>Trust Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trust Domain</em>' reference.
	 * @see #setTrustDomain(Trustdomain)
	 * @see daprdesigner.DaprdesignerPackage#getAppAccessControl_TrustDomain()
	 * @model
	 * @generated
	 */
	Trustdomain getTrustDomain();

	/**
	 * Sets the value of the '{@link daprdesigner.AppAccessControl#getTrustDomain <em>Trust Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trust Domain</em>' reference.
	 * @see #getTrustDomain()
	 * @generated
	 */
	void setTrustDomain(Trustdomain value);

	/**
	 * Returns the value of the '<em><b>Policies</b></em>' containment reference list.
	 * The list contents are of type {@link daprdesigner.AppPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policies</em>' containment reference list.
	 * @see daprdesigner.DaprdesignerPackage#getAppAccessControl_Policies()
	 * @model containment="true"
	 * @generated
	 */
	EList<AppPolicy> getPolicies();

} // AppAccessControl
