/**
 */
package daprdesigner;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>App</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.App#getRequiredFields <em>Required Fields</em>}</li>
 *   <li>{@link daprdesigner.App#getHelp <em>Help</em>}</li>
 *   <li>{@link daprdesigner.App#getAppId <em>App Id</em>}</li>
 *   <li>{@link daprdesigner.App#getAppDirPath <em>App Dir Path</em>}</li>
 *   <li>{@link daprdesigner.App#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link daprdesigner.App#getTrustDomain <em>Trust Domain</em>}</li>
 *   <li>{@link daprdesigner.App#getCommand <em>Command</em>}</li>
 *   <li>{@link daprdesigner.App#getAppHealthCheckPath <em>App Health Check Path</em>}</li>
 *   <li>{@link daprdesigner.App#getContainerImage <em>Container Image</em>}</li>
 *   <li>{@link daprdesigner.App#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link daprdesigner.App#getSdkLanguage <em>Sdk Language</em>}</li>
 *   <li>{@link daprdesigner.App#getRepository <em>Repository</em>}</li>
 *   <li>{@link daprdesigner.App#getSwaggerLink <em>Swagger Link</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getApp()
 * @model
 * @generated
 */
public interface App extends DaprNode {
	/**
	 * Returns the value of the '<em><b>Required Fields</b></em>' attribute.
	 * The default value is <code>"Name, App Id, App Dir Path, Namespace, Trustdomain"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Fields</em>' attribute.
	 * @see daprdesigner.DaprdesignerPackage#getApp_RequiredFields()
	 * @model default="Name, App Id, App Dir Path, Namespace, Trustdomain" changeable="false"
	 * @generated
	 */
	String getRequiredFields();

	/**
	 * Returns the value of the '<em><b>Help</b></em>' attribute.
	 * The default value is <code>"https://docs.dapr.io/developing-applications/building-blocks/service-invocation/service-invocation-overview/"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Help</em>' attribute.
	 * @see daprdesigner.DaprdesignerPackage#getApp_Help()
	 * @model default="https://docs.dapr.io/developing-applications/building-blocks/service-invocation/service-invocation-overview/" changeable="false"
	 * @generated
	 */
	String getHelp();

	/**
	 * Returns the value of the '<em><b>App Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App Id</em>' attribute.
	 * @see #setAppId(String)
	 * @see daprdesigner.DaprdesignerPackage#getApp_AppId()
	 * @model
	 * @generated
	 */
	String getAppId();

	/**
	 * Sets the value of the '{@link daprdesigner.App#getAppId <em>App Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App Id</em>' attribute.
	 * @see #getAppId()
	 * @generated
	 */
	void setAppId(String value);

	/**
	 * Returns the value of the '<em><b>App Dir Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App Dir Path</em>' attribute.
	 * @see #setAppDirPath(String)
	 * @see daprdesigner.DaprdesignerPackage#getApp_AppDirPath()
	 * @model
	 * @generated
	 */
	String getAppDirPath();

	/**
	 * Sets the value of the '{@link daprdesigner.App#getAppDirPath <em>App Dir Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App Dir Path</em>' attribute.
	 * @see #getAppDirPath()
	 * @generated
	 */
	void setAppDirPath(String value);

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' attribute.
	 * @see #setRepository(String)
	 * @see daprdesigner.DaprdesignerPackage#getApp_Repository()
	 * @model
	 * @generated
	 */
	String getRepository();

	/**
	 * Sets the value of the '{@link daprdesigner.App#getRepository <em>Repository</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' attribute.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(String value);

	/**
	 * Returns the value of the '<em><b>Swagger Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swagger Link</em>' attribute.
	 * @see #setSwaggerLink(String)
	 * @see daprdesigner.DaprdesignerPackage#getApp_SwaggerLink()
	 * @model
	 * @generated
	 */
	String getSwaggerLink();

	/**
	 * Sets the value of the '{@link daprdesigner.App#getSwaggerLink <em>Swagger Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swagger Link</em>' attribute.
	 * @see #getSwaggerLink()
	 * @generated
	 */
	void setSwaggerLink(String value);

	/**
	 * Returns the value of the '<em><b>Sdk Language</b></em>' attribute.
	 * The literals are from the enumeration {@link daprdesigner.SDKLanguage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sdk Language</em>' attribute.
	 * @see daprdesigner.SDKLanguage
	 * @see #setSdkLanguage(SDKLanguage)
	 * @see daprdesigner.DaprdesignerPackage#getApp_SdkLanguage()
	 * @model
	 * @generated
	 */
	SDKLanguage getSdkLanguage();

	/**
	 * Sets the value of the '{@link daprdesigner.App#getSdkLanguage <em>Sdk Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sdk Language</em>' attribute.
	 * @see daprdesigner.SDKLanguage
	 * @see #getSdkLanguage()
	 * @generated
	 */
	void setSdkLanguage(SDKLanguage value);

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' reference.
	 * @see #setNamespace(Namespace)
	 * @see daprdesigner.DaprdesignerPackage#getApp_Namespace()
	 * @model
	 * @generated
	 */
	Namespace getNamespace();

	/**
	 * Sets the value of the '{@link daprdesigner.App#getNamespace <em>Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' reference.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(Namespace value);

	/**
	 * Returns the value of the '<em><b>Trust Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trust Domain</em>' reference.
	 * @see #setTrustDomain(Trustdomain)
	 * @see daprdesigner.DaprdesignerPackage#getApp_TrustDomain()
	 * @model
	 * @generated
	 */
	Trustdomain getTrustDomain();

	/**
	 * Sets the value of the '{@link daprdesigner.App#getTrustDomain <em>Trust Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trust Domain</em>' reference.
	 * @see #getTrustDomain()
	 * @generated
	 */
	void setTrustDomain(Trustdomain value);

	/**
	 * Returns the value of the '<em><b>Command</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' attribute list.
	 * @see daprdesigner.DaprdesignerPackage#getApp_Command()
	 * @model
	 * @generated
	 */
	EList<String> getCommand();

	/**
	 * Returns the value of the '<em><b>App Health Check Path</b></em>' attribute.
	 * The default value is <code>"/healthz"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App Health Check Path</em>' attribute.
	 * @see #setAppHealthCheckPath(String)
	 * @see daprdesigner.DaprdesignerPackage#getApp_AppHealthCheckPath()
	 * @model default="/healthz"
	 * @generated
	 */
	String getAppHealthCheckPath();

	/**
	 * Sets the value of the '{@link daprdesigner.App#getAppHealthCheckPath <em>App Health Check Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App Health Check Path</em>' attribute.
	 * @see #getAppHealthCheckPath()
	 * @generated
	 */
	void setAppHealthCheckPath(String value);

	/**
	 * Returns the value of the '<em><b>Container Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Image</em>' attribute.
	 * @see #setContainerImage(String)
	 * @see daprdesigner.DaprdesignerPackage#getApp_ContainerImage()
	 * @model
	 * @generated
	 */
	String getContainerImage();

	/**
	 * Sets the value of the '{@link daprdesigner.App#getContainerImage <em>Container Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Image</em>' attribute.
	 * @see #getContainerImage()
	 * @generated
	 */
	void setContainerImage(String value);

	/**
	 * Returns the value of the '<em><b>Configurations</b></em>' reference list.
	 * The list contents are of type {@link daprdesigner.AppConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations</em>' reference list.
	 * @see daprdesigner.DaprdesignerPackage#getApp_Configurations()
	 * @model
	 * @generated
	 */
	EList<AppConfiguration> getConfigurations();

} // App
