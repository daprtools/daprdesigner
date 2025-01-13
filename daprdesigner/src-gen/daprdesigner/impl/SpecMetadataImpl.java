/**
 */
package daprdesigner.impl;

import daprdesigner.DaprdesignerPackage;
import daprdesigner.SpecMetadata;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spec Metadata</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.impl.SpecMetadataImpl#getValue <em>Value</em>}</li>
 *   <li>{@link daprdesigner.impl.SpecMetadataImpl#isIsFetchedFromSecret <em>Is Fetched From Secret</em>}</li>
 *   <li>{@link daprdesigner.impl.SpecMetadataImpl#isIsFetchedFromEnvironment <em>Is Fetched From Environment</em>}</li>
 *   <li>{@link daprdesigner.impl.SpecMetadataImpl#getSecretKeyRefName <em>Secret Key Ref Name</em>}</li>
 *   <li>{@link daprdesigner.impl.SpecMetadataImpl#getSecretKeyRefKey <em>Secret Key Ref Key</em>}</li>
 *   <li>{@link daprdesigner.impl.SpecMetadataImpl#getEnvRef <em>Env Ref</em>}</li>
 *   <li>{@link daprdesigner.impl.SpecMetadataImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecMetadataImpl extends DaprNodeImpl implements SpecMetadata {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsFetchedFromSecret() <em>Is Fetched From Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFetchedFromSecret()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FETCHED_FROM_SECRET_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsFetchedFromSecret() <em>Is Fetched From Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFetchedFromSecret()
	 * @generated
	 * @ordered
	 */
	protected boolean isFetchedFromSecret = IS_FETCHED_FROM_SECRET_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsFetchedFromEnvironment() <em>Is Fetched From Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFetchedFromEnvironment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FETCHED_FROM_ENVIRONMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsFetchedFromEnvironment() <em>Is Fetched From Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFetchedFromEnvironment()
	 * @generated
	 * @ordered
	 */
	protected boolean isFetchedFromEnvironment = IS_FETCHED_FROM_ENVIRONMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecretKeyRefName() <em>Secret Key Ref Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecretKeyRefName()
	 * @generated
	 * @ordered
	 */
	protected static final String SECRET_KEY_REF_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecretKeyRefName() <em>Secret Key Ref Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecretKeyRefName()
	 * @generated
	 * @ordered
	 */
	protected String secretKeyRefName = SECRET_KEY_REF_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecretKeyRefKey() <em>Secret Key Ref Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecretKeyRefKey()
	 * @generated
	 * @ordered
	 */
	protected static final String SECRET_KEY_REF_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecretKeyRefKey() <em>Secret Key Ref Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecretKeyRefKey()
	 * @generated
	 * @ordered
	 */
	protected String secretKeyRefKey = SECRET_KEY_REF_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnvRef() <em>Env Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvRef()
	 * @generated
	 * @ordered
	 */
	protected static final String ENV_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnvRef() <em>Env Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvRef()
	 * @generated
	 * @ordered
	 */
	protected String envRef = ENV_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecMetadataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaprdesignerPackage.Literals.SPEC_METADATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.SPEC_METADATA__VALUE, oldValue,
					value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsFetchedFromSecret() {
		return isFetchedFromSecret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFetchedFromSecret(boolean newIsFetchedFromSecret) {
		boolean oldIsFetchedFromSecret = isFetchedFromSecret;
		isFetchedFromSecret = newIsFetchedFromSecret;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.SPEC_METADATA__IS_FETCHED_FROM_SECRET, oldIsFetchedFromSecret,
					isFetchedFromSecret));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsFetchedFromEnvironment() {
		return isFetchedFromEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFetchedFromEnvironment(boolean newIsFetchedFromEnvironment) {
		boolean oldIsFetchedFromEnvironment = isFetchedFromEnvironment;
		isFetchedFromEnvironment = newIsFetchedFromEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.SPEC_METADATA__IS_FETCHED_FROM_ENVIRONMENT, oldIsFetchedFromEnvironment,
					isFetchedFromEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecretKeyRefName() {
		return secretKeyRefName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecretKeyRefName(String newSecretKeyRefName) {
		String oldSecretKeyRefName = secretKeyRefName;
		secretKeyRefName = newSecretKeyRefName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.SPEC_METADATA__SECRET_KEY_REF_NAME, oldSecretKeyRefName, secretKeyRefName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecretKeyRefKey() {
		return secretKeyRefKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecretKeyRefKey(String newSecretKeyRefKey) {
		String oldSecretKeyRefKey = secretKeyRefKey;
		secretKeyRefKey = newSecretKeyRefKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.SPEC_METADATA__SECRET_KEY_REF_KEY,
					oldSecretKeyRefKey, secretKeyRefKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnvRef() {
		return envRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvRef(String newEnvRef) {
		String oldEnvRef = envRef;
		envRef = newEnvRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.SPEC_METADATA__ENV_REF, oldEnvRef,
					envRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.SPEC_METADATA__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DaprdesignerPackage.SPEC_METADATA__VALUE:
			return getValue();
		case DaprdesignerPackage.SPEC_METADATA__IS_FETCHED_FROM_SECRET:
			return isIsFetchedFromSecret();
		case DaprdesignerPackage.SPEC_METADATA__IS_FETCHED_FROM_ENVIRONMENT:
			return isIsFetchedFromEnvironment();
		case DaprdesignerPackage.SPEC_METADATA__SECRET_KEY_REF_NAME:
			return getSecretKeyRefName();
		case DaprdesignerPackage.SPEC_METADATA__SECRET_KEY_REF_KEY:
			return getSecretKeyRefKey();
		case DaprdesignerPackage.SPEC_METADATA__ENV_REF:
			return getEnvRef();
		case DaprdesignerPackage.SPEC_METADATA__NAME:
			return getName();
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
		case DaprdesignerPackage.SPEC_METADATA__VALUE:
			setValue((String) newValue);
			return;
		case DaprdesignerPackage.SPEC_METADATA__IS_FETCHED_FROM_SECRET:
			setIsFetchedFromSecret((Boolean) newValue);
			return;
		case DaprdesignerPackage.SPEC_METADATA__IS_FETCHED_FROM_ENVIRONMENT:
			setIsFetchedFromEnvironment((Boolean) newValue);
			return;
		case DaprdesignerPackage.SPEC_METADATA__SECRET_KEY_REF_NAME:
			setSecretKeyRefName((String) newValue);
			return;
		case DaprdesignerPackage.SPEC_METADATA__SECRET_KEY_REF_KEY:
			setSecretKeyRefKey((String) newValue);
			return;
		case DaprdesignerPackage.SPEC_METADATA__ENV_REF:
			setEnvRef((String) newValue);
			return;
		case DaprdesignerPackage.SPEC_METADATA__NAME:
			setName((String) newValue);
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
		case DaprdesignerPackage.SPEC_METADATA__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case DaprdesignerPackage.SPEC_METADATA__IS_FETCHED_FROM_SECRET:
			setIsFetchedFromSecret(IS_FETCHED_FROM_SECRET_EDEFAULT);
			return;
		case DaprdesignerPackage.SPEC_METADATA__IS_FETCHED_FROM_ENVIRONMENT:
			setIsFetchedFromEnvironment(IS_FETCHED_FROM_ENVIRONMENT_EDEFAULT);
			return;
		case DaprdesignerPackage.SPEC_METADATA__SECRET_KEY_REF_NAME:
			setSecretKeyRefName(SECRET_KEY_REF_NAME_EDEFAULT);
			return;
		case DaprdesignerPackage.SPEC_METADATA__SECRET_KEY_REF_KEY:
			setSecretKeyRefKey(SECRET_KEY_REF_KEY_EDEFAULT);
			return;
		case DaprdesignerPackage.SPEC_METADATA__ENV_REF:
			setEnvRef(ENV_REF_EDEFAULT);
			return;
		case DaprdesignerPackage.SPEC_METADATA__NAME:
			setName(NAME_EDEFAULT);
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
		case DaprdesignerPackage.SPEC_METADATA__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		case DaprdesignerPackage.SPEC_METADATA__IS_FETCHED_FROM_SECRET:
			return isFetchedFromSecret != IS_FETCHED_FROM_SECRET_EDEFAULT;
		case DaprdesignerPackage.SPEC_METADATA__IS_FETCHED_FROM_ENVIRONMENT:
			return isFetchedFromEnvironment != IS_FETCHED_FROM_ENVIRONMENT_EDEFAULT;
		case DaprdesignerPackage.SPEC_METADATA__SECRET_KEY_REF_NAME:
			return SECRET_KEY_REF_NAME_EDEFAULT == null ? secretKeyRefName != null
					: !SECRET_KEY_REF_NAME_EDEFAULT.equals(secretKeyRefName);
		case DaprdesignerPackage.SPEC_METADATA__SECRET_KEY_REF_KEY:
			return SECRET_KEY_REF_KEY_EDEFAULT == null ? secretKeyRefKey != null
					: !SECRET_KEY_REF_KEY_EDEFAULT.equals(secretKeyRefKey);
		case DaprdesignerPackage.SPEC_METADATA__ENV_REF:
			return ENV_REF_EDEFAULT == null ? envRef != null : !ENV_REF_EDEFAULT.equals(envRef);
		case DaprdesignerPackage.SPEC_METADATA__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (value: ");
		result.append(value);
		result.append(", isFetchedFromSecret: ");
		result.append(isFetchedFromSecret);
		result.append(", isFetchedFromEnvironment: ");
		result.append(isFetchedFromEnvironment);
		result.append(", secretKeyRefName: ");
		result.append(secretKeyRefName);
		result.append(", secretKeyRefKey: ");
		result.append(secretKeyRefKey);
		result.append(", envRef: ");
		result.append(envRef);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SpecMetadataImpl
