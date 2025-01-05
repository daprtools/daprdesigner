/**
 */
package daprdesigner;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Secrets List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.SecretsList#getStoreName <em>Store Name</em>}</li>
 *   <li>{@link daprdesigner.SecretsList#isDefaultAccess <em>Default Access</em>}</li>
 *   <li>{@link daprdesigner.SecretsList#getSecrets <em>Secrets</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getSecretsList()
 * @model
 * @generated
 */
public interface SecretsList extends EObject {
	/**
	 * Returns the value of the '<em><b>Store Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store Name</em>' attribute.
	 * @see #setStoreName(String)
	 * @see daprdesigner.DaprdesignerPackage#getSecretsList_StoreName()
	 * @model
	 * @generated
	 */
	String getStoreName();

	/**
	 * Sets the value of the '{@link daprdesigner.SecretsList#getStoreName <em>Store Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Store Name</em>' attribute.
	 * @see #getStoreName()
	 * @generated
	 */
	void setStoreName(String value);

	/**
	 * Returns the value of the '<em><b>Default Access</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Access</em>' attribute.
	 * @see #setDefaultAccess(boolean)
	 * @see daprdesigner.DaprdesignerPackage#getSecretsList_DefaultAccess()
	 * @model default="true"
	 * @generated
	 */
	boolean isDefaultAccess();

	/**
	 * Sets the value of the '{@link daprdesigner.SecretsList#isDefaultAccess <em>Default Access</em>}' attribute.
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
	 * @see daprdesigner.DaprdesignerPackage#getSecretsList_Secrets()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getSecrets();

} // SecretsList
