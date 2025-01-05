/**
 */
package daprdesigner;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.Component#getApiVersion <em>Api Version</em>}</li>
 *   <li>{@link daprdesigner.Component#getKind <em>Kind</em>}</li>
 *   <li>{@link daprdesigner.Component#getAuth <em>Auth</em>}</li>
 *   <li>{@link daprdesigner.Component#getMetadata_name <em>Metadata name</em>}</li>
 *   <li>{@link daprdesigner.Component#getMetadata_namespace <em>Metadata namespace</em>}</li>
 *   <li>{@link daprdesigner.Component#getSpec <em>Spec</em>}</li>
 *   <li>{@link daprdesigner.Component#getScopes <em>Scopes</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getComponent()
 * @model abstract="true"
 * @generated
 */
public interface Component extends EObject {
	/**
	 * Returns the value of the '<em><b>Api Version</b></em>' attribute.
	 * The default value is <code>"dapr.io/v1alpha1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Version</em>' attribute.
	 * @see daprdesigner.DaprdesignerPackage#getComponent_ApiVersion()
	 * @model default="dapr.io/v1alpha1" changeable="false"
	 * @generated
	 */
	String getApiVersion();

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"Component"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see daprdesigner.DaprdesignerPackage#getComponent_Kind()
	 * @model default="Component" changeable="false"
	 * @generated
	 */
	String getKind();

	/**
	 * Returns the value of the '<em><b>Auth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auth</em>' reference.
	 * @see #setAuth(SecretStore)
	 * @see daprdesigner.DaprdesignerPackage#getComponent_Auth()
	 * @model
	 * @generated
	 */
	SecretStore getAuth();

	/**
	 * Sets the value of the '{@link daprdesigner.Component#getAuth <em>Auth</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auth</em>' reference.
	 * @see #getAuth()
	 * @generated
	 */
	void setAuth(SecretStore value);

	/**
	 * Returns the value of the '<em><b>Metadata name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata name</em>' attribute.
	 * @see #setMetadata_name(String)
	 * @see daprdesigner.DaprdesignerPackage#getComponent_Metadata_name()
	 * @model
	 * @generated
	 */
	String getMetadata_name();

	/**
	 * Sets the value of the '{@link daprdesigner.Component#getMetadata_name <em>Metadata name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata name</em>' attribute.
	 * @see #getMetadata_name()
	 * @generated
	 */
	void setMetadata_name(String value);

	/**
	 * Returns the value of the '<em><b>Metadata namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata namespace</em>' reference.
	 * @see #setMetadata_namespace(Namespace)
	 * @see daprdesigner.DaprdesignerPackage#getComponent_Metadata_namespace()
	 * @model
	 * @generated
	 */
	Namespace getMetadata_namespace();

	/**
	 * Sets the value of the '{@link daprdesigner.Component#getMetadata_namespace <em>Metadata namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata namespace</em>' reference.
	 * @see #getMetadata_namespace()
	 * @generated
	 */
	void setMetadata_namespace(Namespace value);

	/**
	 * Returns the value of the '<em><b>Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec</em>' containment reference.
	 * @see #setSpec(ComponentSpec)
	 * @see daprdesigner.DaprdesignerPackage#getComponent_Spec()
	 * @model containment="true"
	 * @generated
	 */
	ComponentSpec getSpec();

	/**
	 * Sets the value of the '{@link daprdesigner.Component#getSpec <em>Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spec</em>' containment reference.
	 * @see #getSpec()
	 * @generated
	 */
	void setSpec(ComponentSpec value);

	/**
	 * Returns the value of the '<em><b>Scopes</b></em>' reference list.
	 * The list contents are of type {@link daprdesigner.App}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scopes</em>' reference list.
	 * @see daprdesigner.DaprdesignerPackage#getComponent_Scopes()
	 * @model
	 * @generated
	 */
	EList<App> getScopes();

} // Component
