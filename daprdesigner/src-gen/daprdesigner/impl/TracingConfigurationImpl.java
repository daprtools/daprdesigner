/**
 */
package daprdesigner.impl;

import daprdesigner.DaprdesignerPackage;
import daprdesigner.TracingConfiguration;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tracing Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.impl.TracingConfigurationImpl#getSamplingRate <em>Sampling Rate</em>}</li>
 *   <li>{@link daprdesigner.impl.TracingConfigurationImpl#isStdout <em>Stdout</em>}</li>
 *   <li>{@link daprdesigner.impl.TracingConfigurationImpl#getOtel_endPointAddress <em>Otel end Point Address</em>}</li>
 *   <li>{@link daprdesigner.impl.TracingConfigurationImpl#isOtel_isSecure <em>Otel is Secure</em>}</li>
 *   <li>{@link daprdesigner.impl.TracingConfigurationImpl#getOtel_protocol <em>Otel protocol</em>}</li>
 *   <li>{@link daprdesigner.impl.TracingConfigurationImpl#getZipkin_endPointAddress <em>Zipkin end Point Address</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracingConfigurationImpl extends AppConfigurationImpl implements TracingConfiguration {
	/**
	 * The default value of the '{@link #getSamplingRate() <em>Sampling Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplingRate()
	 * @generated
	 * @ordered
	 */
	protected static final String SAMPLING_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSamplingRate() <em>Sampling Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplingRate()
	 * @generated
	 * @ordered
	 */
	protected String samplingRate = SAMPLING_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isStdout() <em>Stdout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStdout()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STDOUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStdout() <em>Stdout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStdout()
	 * @generated
	 * @ordered
	 */
	protected boolean stdout = STDOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtel_endPointAddress() <em>Otel end Point Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtel_endPointAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String OTEL_END_POINT_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtel_endPointAddress() <em>Otel end Point Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtel_endPointAddress()
	 * @generated
	 * @ordered
	 */
	protected String otel_endPointAddress = OTEL_END_POINT_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #isOtel_isSecure() <em>Otel is Secure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOtel_isSecure()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OTEL_IS_SECURE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOtel_isSecure() <em>Otel is Secure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOtel_isSecure()
	 * @generated
	 * @ordered
	 */
	protected boolean otel_isSecure = OTEL_IS_SECURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtel_protocol() <em>Otel protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtel_protocol()
	 * @generated
	 * @ordered
	 */
	protected static final String OTEL_PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtel_protocol() <em>Otel protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtel_protocol()
	 * @generated
	 * @ordered
	 */
	protected String otel_protocol = OTEL_PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getZipkin_endPointAddress() <em>Zipkin end Point Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZipkin_endPointAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ZIPKIN_END_POINT_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZipkin_endPointAddress() <em>Zipkin end Point Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZipkin_endPointAddress()
	 * @generated
	 * @ordered
	 */
	protected String zipkin_endPointAddress = ZIPKIN_END_POINT_ADDRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracingConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaprdesignerPackage.Literals.TRACING_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSamplingRate() {
		return samplingRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSamplingRate(String newSamplingRate) {
		String oldSamplingRate = samplingRate;
		samplingRate = newSamplingRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.TRACING_CONFIGURATION__SAMPLING_RATE, oldSamplingRate, samplingRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStdout() {
		return stdout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStdout(boolean newStdout) {
		boolean oldStdout = stdout;
		stdout = newStdout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.TRACING_CONFIGURATION__STDOUT,
					oldStdout, stdout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOtel_endPointAddress() {
		return otel_endPointAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtel_endPointAddress(String newOtel_endPointAddress) {
		String oldOtel_endPointAddress = otel_endPointAddress;
		otel_endPointAddress = newOtel_endPointAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.TRACING_CONFIGURATION__OTEL_END_POINT_ADDRESS, oldOtel_endPointAddress,
					otel_endPointAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOtel_isSecure() {
		return otel_isSecure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtel_isSecure(boolean newOtel_isSecure) {
		boolean oldOtel_isSecure = otel_isSecure;
		otel_isSecure = newOtel_isSecure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.TRACING_CONFIGURATION__OTEL_IS_SECURE, oldOtel_isSecure, otel_isSecure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOtel_protocol() {
		return otel_protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtel_protocol(String newOtel_protocol) {
		String oldOtel_protocol = otel_protocol;
		otel_protocol = newOtel_protocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.TRACING_CONFIGURATION__OTEL_PROTOCOL, oldOtel_protocol, otel_protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZipkin_endPointAddress() {
		return zipkin_endPointAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZipkin_endPointAddress(String newZipkin_endPointAddress) {
		String oldZipkin_endPointAddress = zipkin_endPointAddress;
		zipkin_endPointAddress = newZipkin_endPointAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.TRACING_CONFIGURATION__ZIPKIN_END_POINT_ADDRESS, oldZipkin_endPointAddress,
					zipkin_endPointAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DaprdesignerPackage.TRACING_CONFIGURATION__SAMPLING_RATE:
			return getSamplingRate();
		case DaprdesignerPackage.TRACING_CONFIGURATION__STDOUT:
			return isStdout();
		case DaprdesignerPackage.TRACING_CONFIGURATION__OTEL_END_POINT_ADDRESS:
			return getOtel_endPointAddress();
		case DaprdesignerPackage.TRACING_CONFIGURATION__OTEL_IS_SECURE:
			return isOtel_isSecure();
		case DaprdesignerPackage.TRACING_CONFIGURATION__OTEL_PROTOCOL:
			return getOtel_protocol();
		case DaprdesignerPackage.TRACING_CONFIGURATION__ZIPKIN_END_POINT_ADDRESS:
			return getZipkin_endPointAddress();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DaprdesignerPackage.TRACING_CONFIGURATION__SAMPLING_RATE:
			setSamplingRate((String) newValue);
			return;
		case DaprdesignerPackage.TRACING_CONFIGURATION__STDOUT:
			setStdout((Boolean) newValue);
			return;
		case DaprdesignerPackage.TRACING_CONFIGURATION__OTEL_END_POINT_ADDRESS:
			setOtel_endPointAddress((String) newValue);
			return;
		case DaprdesignerPackage.TRACING_CONFIGURATION__OTEL_IS_SECURE:
			setOtel_isSecure((Boolean) newValue);
			return;
		case DaprdesignerPackage.TRACING_CONFIGURATION__OTEL_PROTOCOL:
			setOtel_protocol((String) newValue);
			return;
		case DaprdesignerPackage.TRACING_CONFIGURATION__ZIPKIN_END_POINT_ADDRESS:
			setZipkin_endPointAddress((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case DaprdesignerPackage.TRACING_CONFIGURATION__SAMPLING_RATE:
			setSamplingRate(SAMPLING_RATE_EDEFAULT);
			return;
		case DaprdesignerPackage.TRACING_CONFIGURATION__STDOUT:
			setStdout(STDOUT_EDEFAULT);
			return;
		case DaprdesignerPackage.TRACING_CONFIGURATION__OTEL_END_POINT_ADDRESS:
			setOtel_endPointAddress(OTEL_END_POINT_ADDRESS_EDEFAULT);
			return;
		case DaprdesignerPackage.TRACING_CONFIGURATION__OTEL_IS_SECURE:
			setOtel_isSecure(OTEL_IS_SECURE_EDEFAULT);
			return;
		case DaprdesignerPackage.TRACING_CONFIGURATION__OTEL_PROTOCOL:
			setOtel_protocol(OTEL_PROTOCOL_EDEFAULT);
			return;
		case DaprdesignerPackage.TRACING_CONFIGURATION__ZIPKIN_END_POINT_ADDRESS:
			setZipkin_endPointAddress(ZIPKIN_END_POINT_ADDRESS_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case DaprdesignerPackage.TRACING_CONFIGURATION__SAMPLING_RATE:
			return SAMPLING_RATE_EDEFAULT == null ? samplingRate != null : !SAMPLING_RATE_EDEFAULT.equals(samplingRate);
		case DaprdesignerPackage.TRACING_CONFIGURATION__STDOUT:
			return stdout != STDOUT_EDEFAULT;
		case DaprdesignerPackage.TRACING_CONFIGURATION__OTEL_END_POINT_ADDRESS:
			return OTEL_END_POINT_ADDRESS_EDEFAULT == null ? otel_endPointAddress != null
					: !OTEL_END_POINT_ADDRESS_EDEFAULT.equals(otel_endPointAddress);
		case DaprdesignerPackage.TRACING_CONFIGURATION__OTEL_IS_SECURE:
			return otel_isSecure != OTEL_IS_SECURE_EDEFAULT;
		case DaprdesignerPackage.TRACING_CONFIGURATION__OTEL_PROTOCOL:
			return OTEL_PROTOCOL_EDEFAULT == null ? otel_protocol != null
					: !OTEL_PROTOCOL_EDEFAULT.equals(otel_protocol);
		case DaprdesignerPackage.TRACING_CONFIGURATION__ZIPKIN_END_POINT_ADDRESS:
			return ZIPKIN_END_POINT_ADDRESS_EDEFAULT == null ? zipkin_endPointAddress != null
					: !ZIPKIN_END_POINT_ADDRESS_EDEFAULT.equals(zipkin_endPointAddress);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (samplingRate: ");
		result.append(samplingRate);
		result.append(", stdout: ");
		result.append(stdout);
		result.append(", otel_endPointAddress: ");
		result.append(otel_endPointAddress);
		result.append(", otel_isSecure: ");
		result.append(otel_isSecure);
		result.append(", otel_protocol: ");
		result.append(otel_protocol);
		result.append(", zipkin_endPointAddress: ");
		result.append(zipkin_endPointAddress);
		result.append(')');
		return result.toString();
	}

} //TracingConfigurationImpl
