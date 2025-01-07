/**
 */
package daprdesigner;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distributed Locks</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.DistributedLocks#getName <em>Name</em>}</li>
 *   <li>{@link daprdesigner.DistributedLocks#getAppID <em>App ID</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getDistributedLocks()
 * @model
 * @generated
 */
public interface DistributedLocks extends BuildingBlock {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Distributed Locks"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see daprdesigner.DaprdesignerPackage#getDistributedLocks_Name()
	 * @model default="Distributed Locks" changeable="false"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>App ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App ID</em>' attribute.
	 * @see #setAppID(String)
	 * @see daprdesigner.DaprdesignerPackage#getDistributedLocks_AppID()
	 * @model
	 * @generated
	 */
	String getAppID();

	/**
	 * Sets the value of the '{@link daprdesigner.DistributedLocks#getAppID <em>App ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App ID</em>' attribute.
	 * @see #getAppID()
	 * @generated
	 */
	void setAppID(String value);

} // DistributedLocks
