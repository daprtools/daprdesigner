/**
 */
package daprdesigner;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tracing Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.TracingConfiguration#getSamplingRate <em>Sampling Rate</em>}</li>
 *   <li>{@link daprdesigner.TracingConfiguration#isStdout <em>Stdout</em>}</li>
 *   <li>{@link daprdesigner.TracingConfiguration#getOtel_endPointAddress <em>Otel end Point Address</em>}</li>
 *   <li>{@link daprdesigner.TracingConfiguration#isOtel_isSecure <em>Otel is Secure</em>}</li>
 *   <li>{@link daprdesigner.TracingConfiguration#getOtel_protocol <em>Otel protocol</em>}</li>
 *   <li>{@link daprdesigner.TracingConfiguration#getZipkin_endPointAddress <em>Zipkin end Point Address</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getTracingConfiguration()
 * @model
 * @generated
 */
public interface TracingConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Sampling Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sampling Rate</em>' attribute.
	 * @see #setSamplingRate(String)
	 * @see daprdesigner.DaprdesignerPackage#getTracingConfiguration_SamplingRate()
	 * @model
	 * @generated
	 */
	String getSamplingRate();

	/**
	 * Sets the value of the '{@link daprdesigner.TracingConfiguration#getSamplingRate <em>Sampling Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sampling Rate</em>' attribute.
	 * @see #getSamplingRate()
	 * @generated
	 */
	void setSamplingRate(String value);

	/**
	 * Returns the value of the '<em><b>Stdout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stdout</em>' attribute.
	 * @see #setStdout(boolean)
	 * @see daprdesigner.DaprdesignerPackage#getTracingConfiguration_Stdout()
	 * @model
	 * @generated
	 */
	boolean isStdout();

	/**
	 * Sets the value of the '{@link daprdesigner.TracingConfiguration#isStdout <em>Stdout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stdout</em>' attribute.
	 * @see #isStdout()
	 * @generated
	 */
	void setStdout(boolean value);

	/**
	 * Returns the value of the '<em><b>Otel end Point Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Otel end Point Address</em>' attribute.
	 * @see #setOtel_endPointAddress(String)
	 * @see daprdesigner.DaprdesignerPackage#getTracingConfiguration_Otel_endPointAddress()
	 * @model
	 * @generated
	 */
	String getOtel_endPointAddress();

	/**
	 * Sets the value of the '{@link daprdesigner.TracingConfiguration#getOtel_endPointAddress <em>Otel end Point Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Otel end Point Address</em>' attribute.
	 * @see #getOtel_endPointAddress()
	 * @generated
	 */
	void setOtel_endPointAddress(String value);

	/**
	 * Returns the value of the '<em><b>Otel is Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Otel is Secure</em>' attribute.
	 * @see #setOtel_isSecure(boolean)
	 * @see daprdesigner.DaprdesignerPackage#getTracingConfiguration_Otel_isSecure()
	 * @model
	 * @generated
	 */
	boolean isOtel_isSecure();

	/**
	 * Sets the value of the '{@link daprdesigner.TracingConfiguration#isOtel_isSecure <em>Otel is Secure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Otel is Secure</em>' attribute.
	 * @see #isOtel_isSecure()
	 * @generated
	 */
	void setOtel_isSecure(boolean value);

	/**
	 * Returns the value of the '<em><b>Otel protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Otel protocol</em>' attribute.
	 * @see #setOtel_protocol(String)
	 * @see daprdesigner.DaprdesignerPackage#getTracingConfiguration_Otel_protocol()
	 * @model
	 * @generated
	 */
	String getOtel_protocol();

	/**
	 * Sets the value of the '{@link daprdesigner.TracingConfiguration#getOtel_protocol <em>Otel protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Otel protocol</em>' attribute.
	 * @see #getOtel_protocol()
	 * @generated
	 */
	void setOtel_protocol(String value);

	/**
	 * Returns the value of the '<em><b>Zipkin end Point Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zipkin end Point Address</em>' attribute.
	 * @see #setZipkin_endPointAddress(String)
	 * @see daprdesigner.DaprdesignerPackage#getTracingConfiguration_Zipkin_endPointAddress()
	 * @model
	 * @generated
	 */
	String getZipkin_endPointAddress();

	/**
	 * Sets the value of the '{@link daprdesigner.TracingConfiguration#getZipkin_endPointAddress <em>Zipkin end Point Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zipkin end Point Address</em>' attribute.
	 * @see #getZipkin_endPointAddress()
	 * @generated
	 */
	void setZipkin_endPointAddress(String value);

} // TracingConfiguration
