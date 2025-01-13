/**
 */
package daprdesigner;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resiliency Timeout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.ResiliencyTimeout#getTimeOutinSeconds <em>Time Outin Seconds</em>}</li>
 *   <li>{@link daprdesigner.ResiliencyTimeout#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getResiliencyTimeout()
 * @model
 * @generated
 */
public interface ResiliencyTimeout extends DaprNode {
	/**
	 * Returns the value of the '<em><b>Time Outin Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Outin Seconds</em>' attribute.
	 * @see #setTimeOutinSeconds(int)
	 * @see daprdesigner.DaprdesignerPackage#getResiliencyTimeout_TimeOutinSeconds()
	 * @model
	 * @generated
	 */
	int getTimeOutinSeconds();

	/**
	 * Sets the value of the '{@link daprdesigner.ResiliencyTimeout#getTimeOutinSeconds <em>Time Outin Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Outin Seconds</em>' attribute.
	 * @see #getTimeOutinSeconds()
	 * @generated
	 */
	void setTimeOutinSeconds(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see daprdesigner.DaprdesignerPackage#getResiliencyTimeout_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link daprdesigner.ResiliencyTimeout#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ResiliencyTimeout
