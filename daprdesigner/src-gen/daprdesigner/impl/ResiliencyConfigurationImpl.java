/**
 */
package daprdesigner.impl;

import daprdesigner.App;
import daprdesigner.DaprdesignerPackage;
import daprdesigner.ResiliencyConfiguration;
import daprdesigner.ResiliencyPolicy;
import daprdesigner.ResiliencyTarget;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resiliency Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.impl.ResiliencyConfigurationImpl#getRequiredFields <em>Required Fields</em>}</li>
 *   <li>{@link daprdesigner.impl.ResiliencyConfigurationImpl#getHelp <em>Help</em>}</li>
 *   <li>{@link daprdesigner.impl.ResiliencyConfigurationImpl#getApiVersion <em>Api Version</em>}</li>
 *   <li>{@link daprdesigner.impl.ResiliencyConfigurationImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link daprdesigner.impl.ResiliencyConfigurationImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link daprdesigner.impl.ResiliencyConfigurationImpl#getScopes <em>Scopes</em>}</li>
 *   <li>{@link daprdesigner.impl.ResiliencyConfigurationImpl#getPolicy <em>Policy</em>}</li>
 *   <li>{@link daprdesigner.impl.ResiliencyConfigurationImpl#getResiliencyTargets <em>Resiliency Targets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResiliencyConfigurationImpl extends DaprNodeImpl implements ResiliencyConfiguration {
	/**
	 * The default value of the '{@link #getRequiredFields() <em>Required Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredFields()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUIRED_FIELDS_EDEFAULT = "Name, Scopes";

	/**
	 * The cached value of the '{@link #getRequiredFields() <em>Required Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredFields()
	 * @generated
	 * @ordered
	 */
	protected String requiredFields = REQUIRED_FIELDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getHelp() <em>Help</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelp()
	 * @generated
	 * @ordered
	 */
	protected static final String HELP_EDEFAULT = "https://docs.dapr.io/reference/resource-specs/resiliency-schema/";

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
	 * The default value of the '{@link #getApiVersion() <em>Api Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String API_VERSION_EDEFAULT = "dapr.io/v2alpha1";

	/**
	 * The cached value of the '{@link #getApiVersion() <em>Api Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiVersion()
	 * @generated
	 * @ordered
	 */
	protected String apiVersion = API_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final String KIND_EDEFAULT = "Resiliency";

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected String kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = "v1alpha1";

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getScopes() <em>Scopes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopes()
	 * @generated
	 * @ordered
	 */
	protected EList<App> scopes;

	/**
	 * The cached value of the '{@link #getPolicy() <em>Policy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicy()
	 * @generated
	 * @ordered
	 */
	protected ResiliencyPolicy policy;

	/**
	 * The cached value of the '{@link #getResiliencyTargets() <em>Resiliency Targets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResiliencyTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<ResiliencyTarget> resiliencyTargets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResiliencyConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaprdesignerPackage.Literals.RESILIENCY_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRequiredFields() {
		return requiredFields;
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
	public String getApiVersion() {
		return apiVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<App> getScopes() {
		if (scopes == null) {
			scopes = new EObjectResolvingEList<App>(App.class, this,
					DaprdesignerPackage.RESILIENCY_CONFIGURATION__SCOPES);
		}
		return scopes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResiliencyPolicy getPolicy() {
		if (policy != null && policy.eIsProxy()) {
			InternalEObject oldPolicy = (InternalEObject) policy;
			policy = (ResiliencyPolicy) eResolveProxy(oldPolicy);
			if (policy != oldPolicy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DaprdesignerPackage.RESILIENCY_CONFIGURATION__POLICY, oldPolicy, policy));
			}
		}
		return policy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResiliencyPolicy basicGetPolicy() {
		return policy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicy(ResiliencyPolicy newPolicy) {
		ResiliencyPolicy oldPolicy = policy;
		policy = newPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.RESILIENCY_CONFIGURATION__POLICY,
					oldPolicy, policy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResiliencyTarget> getResiliencyTargets() {
		if (resiliencyTargets == null) {
			resiliencyTargets = new EObjectResolvingEList<ResiliencyTarget>(ResiliencyTarget.class, this,
					DaprdesignerPackage.RESILIENCY_CONFIGURATION__RESILIENCY_TARGETS);
		}
		return resiliencyTargets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DaprdesignerPackage.RESILIENCY_CONFIGURATION__REQUIRED_FIELDS:
			return getRequiredFields();
		case DaprdesignerPackage.RESILIENCY_CONFIGURATION__HELP:
			return getHelp();
		case DaprdesignerPackage.RESILIENCY_CONFIGURATION__API_VERSION:
			return getApiVersion();
		case DaprdesignerPackage.RESILIENCY_CONFIGURATION__KIND:
			return getKind();
		case DaprdesignerPackage.RESILIENCY_CONFIGURATION__VERSION:
			return getVersion();
		case DaprdesignerPackage.RESILIENCY_CONFIGURATION__SCOPES:
			return getScopes();
		case DaprdesignerPackage.RESILIENCY_CONFIGURATION__POLICY:
			if (resolve)
				return getPolicy();
			return basicGetPolicy();
		case DaprdesignerPackage.RESILIENCY_CONFIGURATION__RESILIENCY_TARGETS:
			return getResiliencyTargets();
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
		case DaprdesignerPackage.RESILIENCY_CONFIGURATION__SCOPES:
			getScopes().clear();
			getScopes().addAll((Collection<? extends App>) newValue);
			return;
		case DaprdesignerPackage.RESILIENCY_CONFIGURATION__POLICY:
			setPolicy((ResiliencyPolicy) newValue);
			return;
		case DaprdesignerPackage.RESILIENCY_CONFIGURATION__RESILIENCY_TARGETS:
			getResiliencyTargets().clear();
			getResiliencyTargets().addAll((Collection<? extends ResiliencyTarget>) newValue);
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
		case DaprdesignerPackage.RESILIENCY_CONFIGURATION__SCOPES:
			getScopes().clear();
			return;
		case DaprdesignerPackage.RESILIENCY_CONFIGURATION__POLICY:
			setPolicy((ResiliencyPolicy) null);
			return;
		case DaprdesignerPackage.RESILIENCY_CONFIGURATION__RESILIENCY_TARGETS:
			getResiliencyTargets().clear();
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
		case DaprdesignerPackage.RESILIENCY_CONFIGURATION__REQUIRED_FIELDS:
			return REQUIRED_FIELDS_EDEFAULT == null ? requiredFields != null
					: !REQUIRED_FIELDS_EDEFAULT.equals(requiredFields);
		case DaprdesignerPackage.RESILIENCY_CONFIGURATION__HELP:
			return HELP_EDEFAULT == null ? help != null : !HELP_EDEFAULT.equals(help);
		case DaprdesignerPackage.RESILIENCY_CONFIGURATION__API_VERSION:
			return API_VERSION_EDEFAULT == null ? apiVersion != null : !API_VERSION_EDEFAULT.equals(apiVersion);
		case DaprdesignerPackage.RESILIENCY_CONFIGURATION__KIND:
			return KIND_EDEFAULT == null ? kind != null : !KIND_EDEFAULT.equals(kind);
		case DaprdesignerPackage.RESILIENCY_CONFIGURATION__VERSION:
			return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
		case DaprdesignerPackage.RESILIENCY_CONFIGURATION__SCOPES:
			return scopes != null && !scopes.isEmpty();
		case DaprdesignerPackage.RESILIENCY_CONFIGURATION__POLICY:
			return policy != null;
		case DaprdesignerPackage.RESILIENCY_CONFIGURATION__RESILIENCY_TARGETS:
			return resiliencyTargets != null && !resiliencyTargets.isEmpty();
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
		result.append(" (requiredFields: ");
		result.append(requiredFields);
		result.append(", help: ");
		result.append(help);
		result.append(", apiVersion: ");
		result.append(apiVersion);
		result.append(", kind: ");
		result.append(kind);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //ResiliencyConfigurationImpl
