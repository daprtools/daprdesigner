/**
 */
package daprdesigner;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resiliency Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.ResiliencyConfiguration#getRequiredFields <em>Required Fields</em>}</li>
 *   <li>{@link daprdesigner.ResiliencyConfiguration#getHelp <em>Help</em>}</li>
 *   <li>{@link daprdesigner.ResiliencyConfiguration#getApiVersion <em>Api Version</em>}</li>
 *   <li>{@link daprdesigner.ResiliencyConfiguration#getKind <em>Kind</em>}</li>
 *   <li>{@link daprdesigner.ResiliencyConfiguration#getVersion <em>Version</em>}</li>
 *   <li>{@link daprdesigner.ResiliencyConfiguration#getScopes <em>Scopes</em>}</li>
 *   <li>{@link daprdesigner.ResiliencyConfiguration#getPolicy <em>Policy</em>}</li>
 *   <li>{@link daprdesigner.ResiliencyConfiguration#getResiliencyTargets <em>Resiliency Targets</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getResiliencyConfiguration()
 * @model
 * @generated
 */
public interface ResiliencyConfiguration extends DaprNode {
	/**
	 * Returns the value of the '<em><b>Required Fields</b></em>' attribute.
	 * The default value is <code>"Name, Scopes"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Fields</em>' attribute.
	 * @see daprdesigner.DaprdesignerPackage#getResiliencyConfiguration_RequiredFields()
	 * @model default="Name, Scopes" changeable="false"
	 * @generated
	 */
	String getRequiredFields();

	/**
	 * Returns the value of the '<em><b>Help</b></em>' attribute.
	 * The default value is <code>"https://docs.dapr.io/reference/resource-specs/resiliency-schema/"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Help</em>' attribute.
	 * @see daprdesigner.DaprdesignerPackage#getResiliencyConfiguration_Help()
	 * @model default="https://docs.dapr.io/reference/resource-specs/resiliency-schema/" changeable="false"
	 * @generated
	 */
	String getHelp();

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
	 * The default value is <code>"Resiliency"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see daprdesigner.DaprdesignerPackage#getResiliencyConfiguration_Kind()
	 * @model default="Resiliency" changeable="false"
	 * @generated
	 */
	String getKind();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"v1alpha1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see daprdesigner.DaprdesignerPackage#getResiliencyConfiguration_Version()
	 * @model default="v1alpha1" changeable="false"
	 * @generated
	 */
	String getVersion();

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
	 * Returns the value of the '<em><b>Policy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy</em>' reference.
	 * @see #setPolicy(ResiliencyPolicy)
	 * @see daprdesigner.DaprdesignerPackage#getResiliencyConfiguration_Policy()
	 * @model
	 * @generated
	 */
	ResiliencyPolicy getPolicy();

	/**
	 * Sets the value of the '{@link daprdesigner.ResiliencyConfiguration#getPolicy <em>Policy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy</em>' reference.
	 * @see #getPolicy()
	 * @generated
	 */
	void setPolicy(ResiliencyPolicy value);

	/**
	 * Returns the value of the '<em><b>Resiliency Targets</b></em>' reference list.
	 * The list contents are of type {@link daprdesigner.ResiliencyTarget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resiliency Targets</em>' reference list.
	 * @see daprdesigner.DaprdesignerPackage#getResiliencyConfiguration_ResiliencyTargets()
	 * @model
	 * @generated
	 */
	EList<ResiliencyTarget> getResiliencyTargets();

} // ResiliencyConfiguration
