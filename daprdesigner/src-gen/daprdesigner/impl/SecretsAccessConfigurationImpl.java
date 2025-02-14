/**
 */
package daprdesigner.impl;

import daprdesigner.DaprdesignerPackage;
import daprdesigner.SecretsAccessConfiguration;
import daprdesigner.SecretsAccessList;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Secrets Access Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.impl.SecretsAccessConfigurationImpl#getHelp <em>Help</em>}</li>
 *   <li>{@link daprdesigner.impl.SecretsAccessConfigurationImpl#getAccessList <em>Access List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecretsAccessConfigurationImpl extends AppConfigurationImpl implements SecretsAccessConfiguration {
	/**
	 * The default value of the '{@link #getHelp() <em>Help</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelp()
	 * @generated
	 * @ordered
	 */
	protected static final String HELP_EDEFAULT = "https://docs.dapr.io/operations/configuration/secret-scope/";

	/**
	 * The cached value of the '{@link #getHelp() <em>Help</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelp()
	 * @generated
	 * @ordered
	 */
	protected String help = HELP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAccessList() <em>Access List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessList()
	 * @generated
	 * @ordered
	 */
	protected EList<SecretsAccessList> accessList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecretsAccessConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaprdesignerPackage.Literals.SECRETS_ACCESS_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecretsAccessList> getAccessList() {
		if (accessList == null) {
			accessList = new EObjectResolvingEList<SecretsAccessList>(SecretsAccessList.class, this,
					DaprdesignerPackage.SECRETS_ACCESS_CONFIGURATION__ACCESS_LIST);
		}
		return accessList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHelp() {
		return help;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DaprdesignerPackage.SECRETS_ACCESS_CONFIGURATION__HELP:
			return getHelp();
		case DaprdesignerPackage.SECRETS_ACCESS_CONFIGURATION__ACCESS_LIST:
			return getAccessList();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DaprdesignerPackage.SECRETS_ACCESS_CONFIGURATION__ACCESS_LIST:
			getAccessList().clear();
			getAccessList().addAll((Collection<? extends SecretsAccessList>) newValue);
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
		case DaprdesignerPackage.SECRETS_ACCESS_CONFIGURATION__ACCESS_LIST:
			getAccessList().clear();
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
		case DaprdesignerPackage.SECRETS_ACCESS_CONFIGURATION__HELP:
			return HELP_EDEFAULT == null ? help != null : !HELP_EDEFAULT.equals(help);
		case DaprdesignerPackage.SECRETS_ACCESS_CONFIGURATION__ACCESS_LIST:
			return accessList != null && !accessList.isEmpty();
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
		result.append(" (help: ");
		result.append(help);
		result.append(')');
		return result.toString();
	}

} //SecretsAccessConfigurationImpl
