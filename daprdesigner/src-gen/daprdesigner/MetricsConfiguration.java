/**
 */
package daprdesigner;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metrics Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.MetricsConfiguration#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link daprdesigner.MetricsConfiguration#getLatencyDistributionBuckets <em>Latency Distribution Buckets</em>}</li>
 *   <li>{@link daprdesigner.MetricsConfiguration#isHttp_increasedCardinality <em>Http increased Cardinality</em>}</li>
 *   <li>{@link daprdesigner.MetricsConfiguration#getHttp_pathMatching <em>Http path Matching</em>}</li>
 *   <li>{@link daprdesigner.MetricsConfiguration#isHttp_excludeVerbs <em>Http exclude Verbs</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getMetricsConfiguration()
 * @model
 * @generated
 */
public interface MetricsConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(boolean)
	 * @see daprdesigner.DaprdesignerPackage#getMetricsConfiguration_Enabled()
	 * @model
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * Sets the value of the '{@link daprdesigner.MetricsConfiguration#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #isEnabled()
	 * @generated
	 */
	void setEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Latency Distribution Buckets</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latency Distribution Buckets</em>' attribute list.
	 * @see daprdesigner.DaprdesignerPackage#getMetricsConfiguration_LatencyDistributionBuckets()
	 * @model
	 * @generated
	 */
	EList<Integer> getLatencyDistributionBuckets();

	/**
	 * Returns the value of the '<em><b>Http increased Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http increased Cardinality</em>' attribute.
	 * @see #setHttp_increasedCardinality(boolean)
	 * @see daprdesigner.DaprdesignerPackage#getMetricsConfiguration_Http_increasedCardinality()
	 * @model
	 * @generated
	 */
	boolean isHttp_increasedCardinality();

	/**
	 * Sets the value of the '{@link daprdesigner.MetricsConfiguration#isHttp_increasedCardinality <em>Http increased Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http increased Cardinality</em>' attribute.
	 * @see #isHttp_increasedCardinality()
	 * @generated
	 */
	void setHttp_increasedCardinality(boolean value);

	/**
	 * Returns the value of the '<em><b>Http path Matching</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http path Matching</em>' attribute list.
	 * @see daprdesigner.DaprdesignerPackage#getMetricsConfiguration_Http_pathMatching()
	 * @model
	 * @generated
	 */
	EList<String> getHttp_pathMatching();

	/**
	 * Returns the value of the '<em><b>Http exclude Verbs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http exclude Verbs</em>' attribute.
	 * @see #setHttp_excludeVerbs(boolean)
	 * @see daprdesigner.DaprdesignerPackage#getMetricsConfiguration_Http_excludeVerbs()
	 * @model
	 * @generated
	 */
	boolean isHttp_excludeVerbs();

	/**
	 * Sets the value of the '{@link daprdesigner.MetricsConfiguration#isHttp_excludeVerbs <em>Http exclude Verbs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http exclude Verbs</em>' attribute.
	 * @see #isHttp_excludeVerbs()
	 * @generated
	 */
	void setHttp_excludeVerbs(boolean value);

} // MetricsConfiguration
