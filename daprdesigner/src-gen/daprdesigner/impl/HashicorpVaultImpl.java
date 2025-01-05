/**
 */
package daprdesigner.impl;

import daprdesigner.DaprdesignerPackage;
import daprdesigner.HashicorpVault;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hashicorp Vault</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.impl.HashicorpVaultImpl#getSpec_type <em>Spec type</em>}</li>
 *   <li>{@link daprdesigner.impl.HashicorpVaultImpl#getSpec_version <em>Spec version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HashicorpVaultImpl extends SecretStoreImpl implements HashicorpVault {
	/**
	 * The default value of the '{@link #getSpec_type() <em>Spec type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpec_type()
	 * @generated
	 * @ordered
	 */
	protected static final String SPEC_TYPE_EDEFAULT = "secretstores.aws.parameterstore";

	/**
	 * The cached value of the '{@link #getSpec_type() <em>Spec type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpec_type()
	 * @generated
	 * @ordered
	 */
	protected String spec_type = SPEC_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpec_version() <em>Spec version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpec_version()
	 * @generated
	 * @ordered
	 */
	protected static final String SPEC_VERSION_EDEFAULT = "v1";

	/**
	 * The cached value of the '{@link #getSpec_version() <em>Spec version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpec_version()
	 * @generated
	 * @ordered
	 */
	protected String spec_version = SPEC_VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HashicorpVaultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaprdesignerPackage.Literals.HASHICORP_VAULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpec_type() {
		return spec_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpec_version() {
		return spec_version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DaprdesignerPackage.HASHICORP_VAULT__SPEC_TYPE:
			return getSpec_type();
		case DaprdesignerPackage.HASHICORP_VAULT__SPEC_VERSION:
			return getSpec_version();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case DaprdesignerPackage.HASHICORP_VAULT__SPEC_TYPE:
			return SPEC_TYPE_EDEFAULT == null ? spec_type != null : !SPEC_TYPE_EDEFAULT.equals(spec_type);
		case DaprdesignerPackage.HASHICORP_VAULT__SPEC_VERSION:
			return SPEC_VERSION_EDEFAULT == null ? spec_version != null : !SPEC_VERSION_EDEFAULT.equals(spec_version);
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
		result.append(" (spec_type: ");
		result.append(spec_type);
		result.append(", spec_version: ");
		result.append(spec_version);
		result.append(')');
		return result.toString();
	}

} //HashicorpVaultImpl
