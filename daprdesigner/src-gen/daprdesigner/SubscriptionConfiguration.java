/**
 */
package daprdesigner;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subscription Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.SubscriptionConfiguration#getApiVersion <em>Api Version</em>}</li>
 *   <li>{@link daprdesigner.SubscriptionConfiguration#getKind <em>Kind</em>}</li>
 *   <li>{@link daprdesigner.SubscriptionConfiguration#getName <em>Name</em>}</li>
 *   <li>{@link daprdesigner.SubscriptionConfiguration#getTopicName <em>Topic Name</em>}</li>
 *   <li>{@link daprdesigner.SubscriptionConfiguration#getRouteRules <em>Route Rules</em>}</li>
 *   <li>{@link daprdesigner.SubscriptionConfiguration#getPubsubname <em>Pubsubname</em>}</li>
 *   <li>{@link daprdesigner.SubscriptionConfiguration#getDeadLetterTopic <em>Dead Letter Topic</em>}</li>
 *   <li>{@link daprdesigner.SubscriptionConfiguration#isBulkSubscribe_enabled <em>Bulk Subscribe enabled</em>}</li>
 *   <li>{@link daprdesigner.SubscriptionConfiguration#getBulkSubscribe_maxMessagesCount <em>Bulk Subscribe max Messages Count</em>}</li>
 *   <li>{@link daprdesigner.SubscriptionConfiguration#getBulkSubscribe_maxAwaitDurationMs <em>Bulk Subscribe max Await Duration Ms</em>}</li>
 *   <li>{@link daprdesigner.SubscriptionConfiguration#getScopes <em>Scopes</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getSubscriptionConfiguration()
 * @model
 * @generated
 */
public interface SubscriptionConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Api Version</b></em>' attribute.
	 * The default value is <code>"dapr.io/v2alpha1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Version</em>' attribute.
	 * @see daprdesigner.DaprdesignerPackage#getSubscriptionConfiguration_ApiVersion()
	 * @model default="dapr.io/v2alpha1" changeable="false"
	 * @generated
	 */
	String getApiVersion();

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"Subscription"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see daprdesigner.DaprdesignerPackage#getSubscriptionConfiguration_Kind()
	 * @model default="Subscription" changeable="false"
	 * @generated
	 */
	String getKind();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see daprdesigner.DaprdesignerPackage#getSubscriptionConfiguration_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link daprdesigner.SubscriptionConfiguration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Topic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic Name</em>' attribute.
	 * @see #setTopicName(String)
	 * @see daprdesigner.DaprdesignerPackage#getSubscriptionConfiguration_TopicName()
	 * @model
	 * @generated
	 */
	String getTopicName();

	/**
	 * Sets the value of the '{@link daprdesigner.SubscriptionConfiguration#getTopicName <em>Topic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic Name</em>' attribute.
	 * @see #getTopicName()
	 * @generated
	 */
	void setTopicName(String value);

	/**
	 * Returns the value of the '<em><b>Route Rules</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route Rules</em>' map.
	 * @see daprdesigner.DaprdesignerPackage#getSubscriptionConfiguration_RouteRules()
	 * @model mapType="daprdesigner.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	EMap<String, String> getRouteRules();

	/**
	 * Returns the value of the '<em><b>Pubsubname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pubsubname</em>' attribute.
	 * @see #setPubsubname(String)
	 * @see daprdesigner.DaprdesignerPackage#getSubscriptionConfiguration_Pubsubname()
	 * @model
	 * @generated
	 */
	String getPubsubname();

	/**
	 * Sets the value of the '{@link daprdesigner.SubscriptionConfiguration#getPubsubname <em>Pubsubname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pubsubname</em>' attribute.
	 * @see #getPubsubname()
	 * @generated
	 */
	void setPubsubname(String value);

	/**
	 * Returns the value of the '<em><b>Dead Letter Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dead Letter Topic</em>' attribute.
	 * @see #setDeadLetterTopic(String)
	 * @see daprdesigner.DaprdesignerPackage#getSubscriptionConfiguration_DeadLetterTopic()
	 * @model
	 * @generated
	 */
	String getDeadLetterTopic();

	/**
	 * Sets the value of the '{@link daprdesigner.SubscriptionConfiguration#getDeadLetterTopic <em>Dead Letter Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dead Letter Topic</em>' attribute.
	 * @see #getDeadLetterTopic()
	 * @generated
	 */
	void setDeadLetterTopic(String value);

	/**
	 * Returns the value of the '<em><b>Bulk Subscribe enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bulk Subscribe enabled</em>' attribute.
	 * @see #setBulkSubscribe_enabled(boolean)
	 * @see daprdesigner.DaprdesignerPackage#getSubscriptionConfiguration_BulkSubscribe_enabled()
	 * @model
	 * @generated
	 */
	boolean isBulkSubscribe_enabled();

	/**
	 * Sets the value of the '{@link daprdesigner.SubscriptionConfiguration#isBulkSubscribe_enabled <em>Bulk Subscribe enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bulk Subscribe enabled</em>' attribute.
	 * @see #isBulkSubscribe_enabled()
	 * @generated
	 */
	void setBulkSubscribe_enabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Bulk Subscribe max Messages Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bulk Subscribe max Messages Count</em>' attribute.
	 * @see #setBulkSubscribe_maxMessagesCount(String)
	 * @see daprdesigner.DaprdesignerPackage#getSubscriptionConfiguration_BulkSubscribe_maxMessagesCount()
	 * @model
	 * @generated
	 */
	String getBulkSubscribe_maxMessagesCount();

	/**
	 * Sets the value of the '{@link daprdesigner.SubscriptionConfiguration#getBulkSubscribe_maxMessagesCount <em>Bulk Subscribe max Messages Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bulk Subscribe max Messages Count</em>' attribute.
	 * @see #getBulkSubscribe_maxMessagesCount()
	 * @generated
	 */
	void setBulkSubscribe_maxMessagesCount(String value);

	/**
	 * Returns the value of the '<em><b>Bulk Subscribe max Await Duration Ms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bulk Subscribe max Await Duration Ms</em>' attribute.
	 * @see #setBulkSubscribe_maxAwaitDurationMs(String)
	 * @see daprdesigner.DaprdesignerPackage#getSubscriptionConfiguration_BulkSubscribe_maxAwaitDurationMs()
	 * @model
	 * @generated
	 */
	String getBulkSubscribe_maxAwaitDurationMs();

	/**
	 * Sets the value of the '{@link daprdesigner.SubscriptionConfiguration#getBulkSubscribe_maxAwaitDurationMs <em>Bulk Subscribe max Await Duration Ms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bulk Subscribe max Await Duration Ms</em>' attribute.
	 * @see #getBulkSubscribe_maxAwaitDurationMs()
	 * @generated
	 */
	void setBulkSubscribe_maxAwaitDurationMs(String value);

	/**
	 * Returns the value of the '<em><b>Scopes</b></em>' reference list.
	 * The list contents are of type {@link daprdesigner.App}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scopes</em>' reference list.
	 * @see daprdesigner.DaprdesignerPackage#getSubscriptionConfiguration_Scopes()
	 * @model
	 * @generated
	 */
	EList<App> getScopes();

} // SubscriptionConfiguration
