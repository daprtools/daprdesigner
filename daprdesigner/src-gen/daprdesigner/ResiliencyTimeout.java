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
 *   <li>{@link daprdesigner.ResiliencyTimeout#getHelp <em>Help</em>}</li>
 *   <li>{@link daprdesigner.ResiliencyTimeout#getTimeOutinSeconds <em>Time Outin Seconds</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getResiliencyTimeout()
 * @model
 * @generated
 */
public interface ResiliencyTimeout extends DaprNode {
	/**
	 * Returns the value of the '<em><b>Help</b></em>' attribute.
	 * The default value is <code>"https://docs.dapr.io/operations/resiliency/policies/#timeouts"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Help</em>' attribute.
	 * @see daprdesigner.DaprdesignerPackage#getResiliencyTimeout_Help()
	 * @model default="https://docs.dapr.io/operations/resiliency/policies/#timeouts" changeable="false"
	 * @generated
	 */
	String getHelp();

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

} // ResiliencyTimeout
