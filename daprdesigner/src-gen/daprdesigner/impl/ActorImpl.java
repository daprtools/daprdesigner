/**
 */
package daprdesigner.impl;

import daprdesigner.Actor;
import daprdesigner.DaprdesignerPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.impl.ActorImpl#getAdditionalHelp <em>Additional Help</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActorImpl extends AppImpl implements Actor {
	/**
	 * The default value of the '{@link #getAdditionalHelp() <em>Additional Help</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalHelp()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_HELP_EDEFAULT = "https://docs.dapr.io/developing-applications/building-blocks/actors/actors-overview/";
	/**
	 * The cached value of the '{@link #getAdditionalHelp() <em>Additional Help</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalHelp()
	 * @generated
	 * @ordered
	 */
	protected String additionalHelp = ADDITIONAL_HELP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaprdesignerPackage.Literals.ACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdditionalHelp() {
		return additionalHelp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DaprdesignerPackage.ACTOR__ADDITIONAL_HELP:
			return getAdditionalHelp();
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
		case DaprdesignerPackage.ACTOR__ADDITIONAL_HELP:
			return ADDITIONAL_HELP_EDEFAULT == null ? additionalHelp != null
					: !ADDITIONAL_HELP_EDEFAULT.equals(additionalHelp);
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
		result.append(" (additionalHelp: ");
		result.append(additionalHelp);
		result.append(')');
		return result.toString();
	}

} //ActorImpl
