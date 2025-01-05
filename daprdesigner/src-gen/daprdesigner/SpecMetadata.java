/**
 */
package daprdesigner;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spec Metadata</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.SpecMetadata#getName <em>Name</em>}</li>
 *   <li>{@link daprdesigner.SpecMetadata#getValue <em>Value</em>}</li>
 *   <li>{@link daprdesigner.SpecMetadata#isIsFetchedFromSecret <em>Is Fetched From Secret</em>}</li>
 *   <li>{@link daprdesigner.SpecMetadata#isIsFetchedFromEnvironment <em>Is Fetched From Environment</em>}</li>
 *   <li>{@link daprdesigner.SpecMetadata#getSecretKeyRefName <em>Secret Key Ref Name</em>}</li>
 *   <li>{@link daprdesigner.SpecMetadata#getSecretKeyRefKey <em>Secret Key Ref Key</em>}</li>
 *   <li>{@link daprdesigner.SpecMetadata#getEnvRef <em>Env Ref</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getSpecMetadata()
 * @model
 * @generated
 */
public interface SpecMetadata extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see daprdesigner.DaprdesignerPackage#getSpecMetadata_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link daprdesigner.SpecMetadata#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see daprdesigner.DaprdesignerPackage#getSpecMetadata_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link daprdesigner.SpecMetadata#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Is Fetched From Secret</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Fetched From Secret</em>' attribute.
	 * @see #setIsFetchedFromSecret(boolean)
	 * @see daprdesigner.DaprdesignerPackage#getSpecMetadata_IsFetchedFromSecret()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsFetchedFromSecret();

	/**
	 * Sets the value of the '{@link daprdesigner.SpecMetadata#isIsFetchedFromSecret <em>Is Fetched From Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Fetched From Secret</em>' attribute.
	 * @see #isIsFetchedFromSecret()
	 * @generated
	 */
	void setIsFetchedFromSecret(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Fetched From Environment</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Fetched From Environment</em>' attribute.
	 * @see #setIsFetchedFromEnvironment(boolean)
	 * @see daprdesigner.DaprdesignerPackage#getSpecMetadata_IsFetchedFromEnvironment()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsFetchedFromEnvironment();

	/**
	 * Sets the value of the '{@link daprdesigner.SpecMetadata#isIsFetchedFromEnvironment <em>Is Fetched From Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Fetched From Environment</em>' attribute.
	 * @see #isIsFetchedFromEnvironment()
	 * @generated
	 */
	void setIsFetchedFromEnvironment(boolean value);

	/**
	 * Returns the value of the '<em><b>Secret Key Ref Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secret Key Ref Name</em>' attribute.
	 * @see #setSecretKeyRefName(String)
	 * @see daprdesigner.DaprdesignerPackage#getSpecMetadata_SecretKeyRefName()
	 * @model
	 * @generated
	 */
	String getSecretKeyRefName();

	/**
	 * Sets the value of the '{@link daprdesigner.SpecMetadata#getSecretKeyRefName <em>Secret Key Ref Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secret Key Ref Name</em>' attribute.
	 * @see #getSecretKeyRefName()
	 * @generated
	 */
	void setSecretKeyRefName(String value);

	/**
	 * Returns the value of the '<em><b>Secret Key Ref Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secret Key Ref Key</em>' attribute.
	 * @see #setSecretKeyRefKey(String)
	 * @see daprdesigner.DaprdesignerPackage#getSpecMetadata_SecretKeyRefKey()
	 * @model
	 * @generated
	 */
	String getSecretKeyRefKey();

	/**
	 * Sets the value of the '{@link daprdesigner.SpecMetadata#getSecretKeyRefKey <em>Secret Key Ref Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secret Key Ref Key</em>' attribute.
	 * @see #getSecretKeyRefKey()
	 * @generated
	 */
	void setSecretKeyRefKey(String value);

	/**
	 * Returns the value of the '<em><b>Env Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env Ref</em>' attribute.
	 * @see #setEnvRef(String)
	 * @see daprdesigner.DaprdesignerPackage#getSpecMetadata_EnvRef()
	 * @model
	 * @generated
	 */
	String getEnvRef();

	/**
	 * Sets the value of the '{@link daprdesigner.SpecMetadata#getEnvRef <em>Env Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Env Ref</em>' attribute.
	 * @see #getEnvRef()
	 * @generated
	 */
	void setEnvRef(String value);

} // SpecMetadata
