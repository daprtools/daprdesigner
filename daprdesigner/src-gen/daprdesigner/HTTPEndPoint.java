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
 *   <li>{@link daprdesigner.HTTPEndPoint#getHelp <em>Help</em>}</li>
 *   <li>{@link daprdesigner.HTTPEndPoint#getApiVersion <em>Api Version</em>}</li>
 *   <li>{@link daprdesigner.HTTPEndPoint#getKind <em>Kind</em>}</li>
 *   <li>{@link daprdesigner.HTTPEndPoint#getBaseUrl <em>Base Url</em>}</li>
 *   <li>{@link daprdesigner.HTTPEndPoint#getAuth <em>Auth</em>}</li>
 *   <li>{@link daprdesigner.HTTPEndPoint#getScopes <em>Scopes</em>}</li>
 *   <li>{@link daprdesigner.HTTPEndPoint#getSpecHeaders <em>Spec Headers</em>}</li>
 *   <li>{@link daprdesigner.HTTPEndPoint#getSpecRootCA <em>Spec Root CA</em>}</li>
 *   <li>{@link daprdesigner.HTTPEndPoint#getSpecCertificate <em>Spec Certificate</em>}</li>
 *   <li>{@link daprdesigner.HTTPEndPoint#getSpecPrivateKey <em>Spec Private Key</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getHTTPEndPoint()
 * @model
 * @generated
 */
public interface HTTPEndPoint extends DaprNode {
	/**
	 * Returns the value of the '<em><b>Help</b></em>' attribute.
	 * The default value is <code>"https://docs.dapr.io/reference/resource-specs/httpendpoints-schema/"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Help</em>' attribute.
	 * @see daprdesigner.DaprdesignerPackage#getHTTPEndPoint_Help()
	 * @model default="https://docs.dapr.io/reference/resource-specs/httpendpoints-schema/" changeable="false"
	 * @generated
	 */
	String getHelp();

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
	 * Returns the value of the '<em><b>Spec Headers</b></em>' reference list.
	 * The list contents are of type {@link daprdesigner.SpecMetadata}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Headers</em>' reference list.
	 * @see daprdesigner.DaprdesignerPackage#getHTTPEndPoint_SpecHeaders()
	 * @model
	 * @generated
	 */
	EList<SpecMetadata> getSpecHeaders();

	/**
	 * Returns the value of the '<em><b>Spec Root CA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Root CA</em>' reference.
	 * @see #setSpecRootCA(SpecMetadata)
	 * @see daprdesigner.DaprdesignerPackage#getHTTPEndPoint_SpecRootCA()
	 * @model
	 * @generated
	 */
	SpecMetadata getSpecRootCA();

	/**
	 * Sets the value of the '{@link daprdesigner.HTTPEndPoint#getSpecRootCA <em>Spec Root CA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spec Root CA</em>' reference.
	 * @see #getSpecRootCA()
	 * @generated
	 */
	void setSpecRootCA(SpecMetadata value);

	/**
	 * Returns the value of the '<em><b>Spec Certificate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Certificate</em>' reference.
	 * @see #setSpecCertificate(SpecMetadata)
	 * @see daprdesigner.DaprdesignerPackage#getHTTPEndPoint_SpecCertificate()
	 * @model
	 * @generated
	 */
	SpecMetadata getSpecCertificate();

	/**
	 * Sets the value of the '{@link daprdesigner.HTTPEndPoint#getSpecCertificate <em>Spec Certificate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spec Certificate</em>' reference.
	 * @see #getSpecCertificate()
	 * @generated
	 */
	void setSpecCertificate(SpecMetadata value);

	/**
	 * Returns the value of the '<em><b>Spec Private Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Private Key</em>' reference.
	 * @see #setSpecPrivateKey(SpecMetadata)
	 * @see daprdesigner.DaprdesignerPackage#getHTTPEndPoint_SpecPrivateKey()
	 * @model
	 * @generated
	 */
	SpecMetadata getSpecPrivateKey();

	/**
	 * Sets the value of the '{@link daprdesigner.HTTPEndPoint#getSpecPrivateKey <em>Spec Private Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spec Private Key</em>' reference.
	 * @see #getSpecPrivateKey()
	 * @generated
	 */
	void setSpecPrivateKey(SpecMetadata value);

} // HTTPEndPoint
