/**
 */
package daprdesigner.impl;

import daprdesigner.DaprdesignerPackage;
import daprdesigner.MetricsConfiguration;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metrics Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.impl.MetricsConfigurationImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link daprdesigner.impl.MetricsConfigurationImpl#getLatencyDistributionBuckets <em>Latency Distribution Buckets</em>}</li>
 *   <li>{@link daprdesigner.impl.MetricsConfigurationImpl#isHttp_increasedCardinality <em>Http increased Cardinality</em>}</li>
 *   <li>{@link daprdesigner.impl.MetricsConfigurationImpl#getHttp_pathMatching <em>Http path Matching</em>}</li>
 *   <li>{@link daprdesigner.impl.MetricsConfigurationImpl#isHttp_excludeVerbs <em>Http exclude Verbs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetricsConfigurationImpl extends MinimalEObjectImpl.Container implements MetricsConfiguration {
	/**
	 * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean enabled = ENABLED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLatencyDistributionBuckets() <em>Latency Distribution Buckets</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatencyDistributionBuckets()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> latencyDistributionBuckets;

	/**
	 * The default value of the '{@link #isHttp_increasedCardinality() <em>Http increased Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHttp_increasedCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HTTP_INCREASED_CARDINALITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHttp_increasedCardinality() <em>Http increased Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHttp_increasedCardinality()
	 * @generated
	 * @ordered
	 */
	protected boolean http_increasedCardinality = HTTP_INCREASED_CARDINALITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHttp_pathMatching() <em>Http path Matching</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttp_pathMatching()
	 * @generated
	 * @ordered
	 */
	protected EList<String> http_pathMatching;

	/**
	 * The default value of the '{@link #isHttp_excludeVerbs() <em>Http exclude Verbs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHttp_excludeVerbs()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HTTP_EXCLUDE_VERBS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHttp_excludeVerbs() <em>Http exclude Verbs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHttp_excludeVerbs()
	 * @generated
	 * @ordered
	 */
	protected boolean http_excludeVerbs = HTTP_EXCLUDE_VERBS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetricsConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaprdesignerPackage.Literals.METRICS_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(boolean newEnabled) {
		boolean oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.METRICS_CONFIGURATION__ENABLED,
					oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getLatencyDistributionBuckets() {
		if (latencyDistributionBuckets == null) {
			latencyDistributionBuckets = new EDataTypeUniqueEList<Integer>(Integer.class, this,
					DaprdesignerPackage.METRICS_CONFIGURATION__LATENCY_DISTRIBUTION_BUCKETS);
		}
		return latencyDistributionBuckets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHttp_increasedCardinality() {
		return http_increasedCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHttp_increasedCardinality(boolean newHttp_increasedCardinality) {
		boolean oldHttp_increasedCardinality = http_increasedCardinality;
		http_increasedCardinality = newHttp_increasedCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.METRICS_CONFIGURATION__HTTP_INCREASED_CARDINALITY, oldHttp_increasedCardinality,
					http_increasedCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getHttp_pathMatching() {
		if (http_pathMatching == null) {
			http_pathMatching = new EDataTypeUniqueEList<String>(String.class, this,
					DaprdesignerPackage.METRICS_CONFIGURATION__HTTP_PATH_MATCHING);
		}
		return http_pathMatching;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHttp_excludeVerbs() {
		return http_excludeVerbs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHttp_excludeVerbs(boolean newHttp_excludeVerbs) {
		boolean oldHttp_excludeVerbs = http_excludeVerbs;
		http_excludeVerbs = newHttp_excludeVerbs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.METRICS_CONFIGURATION__HTTP_EXCLUDE_VERBS, oldHttp_excludeVerbs,
					http_excludeVerbs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DaprdesignerPackage.METRICS_CONFIGURATION__ENABLED:
			return isEnabled();
		case DaprdesignerPackage.METRICS_CONFIGURATION__LATENCY_DISTRIBUTION_BUCKETS:
			return getLatencyDistributionBuckets();
		case DaprdesignerPackage.METRICS_CONFIGURATION__HTTP_INCREASED_CARDINALITY:
			return isHttp_increasedCardinality();
		case DaprdesignerPackage.METRICS_CONFIGURATION__HTTP_PATH_MATCHING:
			return getHttp_pathMatching();
		case DaprdesignerPackage.METRICS_CONFIGURATION__HTTP_EXCLUDE_VERBS:
			return isHttp_excludeVerbs();
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
		case DaprdesignerPackage.METRICS_CONFIGURATION__ENABLED:
			setEnabled((Boolean) newValue);
			return;
		case DaprdesignerPackage.METRICS_CONFIGURATION__LATENCY_DISTRIBUTION_BUCKETS:
			getLatencyDistributionBuckets().clear();
			getLatencyDistributionBuckets().addAll((Collection<? extends Integer>) newValue);
			return;
		case DaprdesignerPackage.METRICS_CONFIGURATION__HTTP_INCREASED_CARDINALITY:
			setHttp_increasedCardinality((Boolean) newValue);
			return;
		case DaprdesignerPackage.METRICS_CONFIGURATION__HTTP_PATH_MATCHING:
			getHttp_pathMatching().clear();
			getHttp_pathMatching().addAll((Collection<? extends String>) newValue);
			return;
		case DaprdesignerPackage.METRICS_CONFIGURATION__HTTP_EXCLUDE_VERBS:
			setHttp_excludeVerbs((Boolean) newValue);
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
		case DaprdesignerPackage.METRICS_CONFIGURATION__ENABLED:
			setEnabled(ENABLED_EDEFAULT);
			return;
		case DaprdesignerPackage.METRICS_CONFIGURATION__LATENCY_DISTRIBUTION_BUCKETS:
			getLatencyDistributionBuckets().clear();
			return;
		case DaprdesignerPackage.METRICS_CONFIGURATION__HTTP_INCREASED_CARDINALITY:
			setHttp_increasedCardinality(HTTP_INCREASED_CARDINALITY_EDEFAULT);
			return;
		case DaprdesignerPackage.METRICS_CONFIGURATION__HTTP_PATH_MATCHING:
			getHttp_pathMatching().clear();
			return;
		case DaprdesignerPackage.METRICS_CONFIGURATION__HTTP_EXCLUDE_VERBS:
			setHttp_excludeVerbs(HTTP_EXCLUDE_VERBS_EDEFAULT);
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
		case DaprdesignerPackage.METRICS_CONFIGURATION__ENABLED:
			return enabled != ENABLED_EDEFAULT;
		case DaprdesignerPackage.METRICS_CONFIGURATION__LATENCY_DISTRIBUTION_BUCKETS:
			return latencyDistributionBuckets != null && !latencyDistributionBuckets.isEmpty();
		case DaprdesignerPackage.METRICS_CONFIGURATION__HTTP_INCREASED_CARDINALITY:
			return http_increasedCardinality != HTTP_INCREASED_CARDINALITY_EDEFAULT;
		case DaprdesignerPackage.METRICS_CONFIGURATION__HTTP_PATH_MATCHING:
			return http_pathMatching != null && !http_pathMatching.isEmpty();
		case DaprdesignerPackage.METRICS_CONFIGURATION__HTTP_EXCLUDE_VERBS:
			return http_excludeVerbs != HTTP_EXCLUDE_VERBS_EDEFAULT;
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
		result.append(" (enabled: ");
		result.append(enabled);
		result.append(", latencyDistributionBuckets: ");
		result.append(latencyDistributionBuckets);
		result.append(", http_increasedCardinality: ");
		result.append(http_increasedCardinality);
		result.append(", http_pathMatching: ");
		result.append(http_pathMatching);
		result.append(", http_excludeVerbs: ");
		result.append(http_excludeVerbs);
		result.append(')');
		return result.toString();
	}

} //MetricsConfigurationImpl
