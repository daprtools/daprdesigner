/**
 */
package daprdesigner;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resiliency Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.ResiliencyConfiguration#getApiVersion <em>Api Version</em>}</li>
 *   <li>{@link daprdesigner.ResiliencyConfiguration#getKind <em>Kind</em>}</li>
 *   <li>{@link daprdesigner.ResiliencyConfiguration#getName <em>Name</em>}</li>
 *   <li>{@link daprdesigner.ResiliencyConfiguration#getScopes <em>Scopes</em>}</li>
 *   <li>{@link daprdesigner.ResiliencyConfiguration#getPolicy <em>Policy</em>}</li>
 *   <li>{@link daprdesigner.ResiliencyConfiguration#getTargets <em>Targets</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getResiliencyConfiguration()
 * @model
 * @generated
 */
public interface ResiliencyConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Api Version</b></em>' attribute.
	 * The default value is <code>"dapr.io/v2alpha1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Version</em>' attribute.
	 * @see daprdesigner.DaprdesignerPackage#getResiliencyConfiguration_ApiVersion()
	 * @model default="dapr.io/v2alpha1" changeable="false"
	 * @generated
	 */
	String getApiVersion();

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"Subscription"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see daprdesigner.DaprdesignerPackage#getResiliencyConfiguration_Kind()
	 * @model default="Subscription" changeable="false"
	 * @generated
	 */
	String getKind();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see daprdesigner.DaprdesignerPackage#getResiliencyConfiguration_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link daprdesigner.ResiliencyConfiguration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Scopes</b></em>' reference list.
	 * The list contents are of type {@link daprdesigner.App}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scopes</em>' reference list.
	 * @see daprdesigner.DaprdesignerPackage#getResiliencyConfiguration_Scopes()
	 * @model
	 * @generated
	 */
	EList<App> getScopes();

	/**
	 * Returns the value of the '<em><b>Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy</em>' containment reference.
	 * @see #setPolicy(ResiliencyPolicy)
	 * @see daprdesigner.DaprdesignerPackage#getResiliencyConfiguration_Policy()
	 * @model containment="true"
	 * @generated
	 */
	ResiliencyPolicy getPolicy();

	/**
	 * Sets the value of the '{@link daprdesigner.ResiliencyConfiguration#getPolicy <em>Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy</em>' containment reference.
	 * @see #getPolicy()
	 * @generated
	 */
	void setPolicy(ResiliencyPolicy value);

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' containment reference list.
	 * The list contents are of type {@link daprdesigner.ResiliencyTarget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' containment reference list.
	 * @see daprdesigner.DaprdesignerPackage#getResiliencyConfiguration_Targets()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResiliencyTarget> getTargets();

} // ResiliencyConfiguration
