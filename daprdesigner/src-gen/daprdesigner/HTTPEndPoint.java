/**
 */
package daprdesigner;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HTTP End Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.HTTPEndPoint#getApiVersion <em>Api Version</em>}</li>
 *   <li>{@link daprdesigner.HTTPEndPoint#getKind <em>Kind</em>}</li>
 *   <li>{@link daprdesigner.HTTPEndPoint#getAuth <em>Auth</em>}</li>
 *   <li>{@link daprdesigner.HTTPEndPoint#getBaseUrl <em>Base Url</em>}</li>
 *   <li>{@link daprdesigner.HTTPEndPoint#getScopes <em>Scopes</em>}</li>
 *   <li>{@link daprdesigner.HTTPEndPoint#getHeaders <em>Headers</em>}</li>
 *   <li>{@link daprdesigner.HTTPEndPoint#getClientTLS_rootCA <em>Client TLS root CA</em>}</li>
 *   <li>{@link daprdesigner.HTTPEndPoint#getClientTLS_certificate <em>Client TLS certificate</em>}</li>
 *   <li>{@link daprdesigner.HTTPEndPoint#getClientTLS_privateKey <em>Client TLS private Key</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getHTTPEndPoint()
 * @model
 * @generated
 */
public interface HTTPEndPoint extends DaprNode {
	/**
	 * Returns the value of the '<em><b>Api Version</b></em>' attribute.
	 * The default value is <code>"dapr.io/v1alpha1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Version</em>' attribute.
	 * @see daprdesigner.DaprdesignerPackage#getHTTPEndPoint_ApiVersion()
	 * @model default="dapr.io/v1alpha1" changeable="false"
	 * @generated
	 */
	String getApiVersion();

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"HTTPEndpoint"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see daprdesigner.DaprdesignerPackage#getHTTPEndPoint_Kind()
	 * @model default="HTTPEndpoint" changeable="false"
	 * @generated
	 */
	String getKind();

	/**
	 * Returns the value of the '<em><b>Auth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auth</em>' reference.
	 * @see #setAuth(SecretStore)
	 * @see daprdesigner.DaprdesignerPackage#getHTTPEndPoint_Auth()
	 * @model
	 * @generated
	 */
	SecretStore getAuth();

	/**
	 * Sets the value of the '{@link daprdesigner.HTTPEndPoint#getAuth <em>Auth</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auth</em>' reference.
	 * @see #getAuth()
	 * @generated
	 */
	void setAuth(SecretStore value);

	/**
	 * Returns the value of the '<em><b>Base Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Url</em>' attribute.
	 * @see #setBaseUrl(String)
	 * @see daprdesigner.DaprdesignerPackage#getHTTPEndPoint_BaseUrl()
	 * @model
	 * @generated
	 */
	String getBaseUrl();

	/**
	 * Sets the value of the '{@link daprdesigner.HTTPEndPoint#getBaseUrl <em>Base Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Url</em>' attribute.
	 * @see #getBaseUrl()
	 * @generated
	 */
	void setBaseUrl(String value);

	/**
	 * Returns the value of the '<em><b>Scopes</b></em>' reference list.
	 * The list contents are of type {@link daprdesigner.App}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scopes</em>' reference list.
	 * @see daprdesigner.DaprdesignerPackage#getHTTPEndPoint_Scopes()
	 * @model
	 * @generated
	 */
	EList<App> getScopes();

	/**
	 * Returns the value of the '<em><b>Headers</b></em>' containment reference list.
	 * The list contents are of type {@link daprdesigner.SpecMetadata}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Headers</em>' containment reference list.
	 * @see daprdesigner.DaprdesignerPackage#getHTTPEndPoint_Headers()
	 * @model containment="true"
	 * @generated
	 */
	EList<SpecMetadata> getHeaders();

	/**
	 * Returns the value of the '<em><b>Client TLS root CA</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client TLS root CA</em>' containment reference.
	 * @see #setClientTLS_rootCA(SpecMetadata)
	 * @see daprdesigner.DaprdesignerPackage#getHTTPEndPoint_ClientTLS_rootCA()
	 * @model containment="true"
	 * @generated
	 */
	SpecMetadata getClientTLS_rootCA();

	/**
	 * Sets the value of the '{@link daprdesigner.HTTPEndPoint#getClientTLS_rootCA <em>Client TLS root CA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client TLS root CA</em>' containment reference.
	 * @see #getClientTLS_rootCA()
	 * @generated
	 */
	void setClientTLS_rootCA(SpecMetadata value);

	/**
	 * Returns the value of the '<em><b>Client TLS certificate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client TLS certificate</em>' containment reference.
	 * @see #setClientTLS_certificate(SpecMetadata)
	 * @see daprdesigner.DaprdesignerPackage#getHTTPEndPoint_ClientTLS_certificate()
	 * @model containment="true"
	 * @generated
	 */
	SpecMetadata getClientTLS_certificate();

	/**
	 * Sets the value of the '{@link daprdesigner.HTTPEndPoint#getClientTLS_certificate <em>Client TLS certificate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client TLS certificate</em>' containment reference.
	 * @see #getClientTLS_certificate()
	 * @generated
	 */
	void setClientTLS_certificate(SpecMetadata value);

	/**
	 * Returns the value of the '<em><b>Client TLS private Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client TLS private Key</em>' containment reference.
	 * @see #setClientTLS_privateKey(SpecMetadata)
	 * @see daprdesigner.DaprdesignerPackage#getHTTPEndPoint_ClientTLS_privateKey()
	 * @model containment="true"
	 * @generated
	 */
	SpecMetadata getClientTLS_privateKey();

	/**
	 * Sets the value of the '{@link daprdesigner.HTTPEndPoint#getClientTLS_privateKey <em>Client TLS private Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client TLS private Key</em>' containment reference.
	 * @see #getClientTLS_privateKey()
	 * @generated
	 */
	void setClientTLS_privateKey(SpecMetadata value);

} // HTTPEndPoint
