/**
 */
package daprdesigner.impl;

import daprdesigner.App;
import daprdesigner.Component;
import daprdesigner.DaprdesignerPackage;
import daprdesigner.RouteRules;
import daprdesigner.SubscriptionConfiguration;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subscription Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.impl.SubscriptionConfigurationImpl#getApiVersion <em>Api Version</em>}</li>
 *   <li>{@link daprdesigner.impl.SubscriptionConfigurationImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link daprdesigner.impl.SubscriptionConfigurationImpl#getTopicName <em>Topic Name</em>}</li>
 *   <li>{@link daprdesigner.impl.SubscriptionConfigurationImpl#getRouteRules <em>Route Rules</em>}</li>
 *   <li>{@link daprdesigner.impl.SubscriptionConfigurationImpl#getPubsub <em>Pubsub</em>}</li>
 *   <li>{@link daprdesigner.impl.SubscriptionConfigurationImpl#getDeadLetterTopic <em>Dead Letter Topic</em>}</li>
 *   <li>{@link daprdesigner.impl.SubscriptionConfigurationImpl#isBulkSubscribe_enabled <em>Bulk Subscribe enabled</em>}</li>
 *   <li>{@link daprdesigner.impl.SubscriptionConfigurationImpl#getBulkSubscribe_maxMessagesCount <em>Bulk Subscribe max Messages Count</em>}</li>
 *   <li>{@link daprdesigner.impl.SubscriptionConfigurationImpl#getBulkSubscribe_maxAwaitDurationMs <em>Bulk Subscribe max Await Duration Ms</em>}</li>
 *   <li>{@link daprdesigner.impl.SubscriptionConfigurationImpl#getScopes <em>Scopes</em>}</li>
 *   <li>{@link daprdesigner.impl.SubscriptionConfigurationImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubscriptionConfigurationImpl extends DaprNodeImpl implements SubscriptionConfiguration {
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
	protected static final String KIND_EDEFAULT = "Subscription";

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
	 * The default value of the '{@link #getTopicName() <em>Topic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicName()
	 * @generated
	 * @ordered
	 */
	protected static final String TOPIC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTopicName() <em>Topic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicName()
	 * @generated
	 * @ordered
	 */
	protected String topicName = TOPIC_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRouteRules() <em>Route Rules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteRules()
	 * @generated
	 * @ordered
	 */
	protected EList<RouteRules> routeRules;

	/**
	 * The cached value of the '{@link #getPubsub() <em>Pubsub</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPubsub()
	 * @generated
	 * @ordered
	 */
	protected Component pubsub;

	/**
	 * The default value of the '{@link #getDeadLetterTopic() <em>Dead Letter Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadLetterTopic()
	 * @generated
	 * @ordered
	 */
	protected static final String DEAD_LETTER_TOPIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeadLetterTopic() <em>Dead Letter Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadLetterTopic()
	 * @generated
	 * @ordered
	 */
	protected String deadLetterTopic = DEAD_LETTER_TOPIC_EDEFAULT;

	/**
	 * The default value of the '{@link #isBulkSubscribe_enabled() <em>Bulk Subscribe enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBulkSubscribe_enabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BULK_SUBSCRIBE_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBulkSubscribe_enabled() <em>Bulk Subscribe enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBulkSubscribe_enabled()
	 * @generated
	 * @ordered
	 */
	protected boolean bulkSubscribe_enabled = BULK_SUBSCRIBE_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getBulkSubscribe_maxMessagesCount() <em>Bulk Subscribe max Messages Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBulkSubscribe_maxMessagesCount()
	 * @generated
	 * @ordered
	 */
	protected static final String BULK_SUBSCRIBE_MAX_MESSAGES_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBulkSubscribe_maxMessagesCount() <em>Bulk Subscribe max Messages Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBulkSubscribe_maxMessagesCount()
	 * @generated
	 * @ordered
	 */
	protected String bulkSubscribe_maxMessagesCount = BULK_SUBSCRIBE_MAX_MESSAGES_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBulkSubscribe_maxAwaitDurationMs() <em>Bulk Subscribe max Await Duration Ms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBulkSubscribe_maxAwaitDurationMs()
	 * @generated
	 * @ordered
	 */
	protected static final String BULK_SUBSCRIBE_MAX_AWAIT_DURATION_MS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBulkSubscribe_maxAwaitDurationMs() <em>Bulk Subscribe max Await Duration Ms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBulkSubscribe_maxAwaitDurationMs()
	 * @generated
	 * @ordered
	 */
	protected String bulkSubscribe_maxAwaitDurationMs = BULK_SUBSCRIBE_MAX_AWAIT_DURATION_MS_EDEFAULT;

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
	protected SubscriptionConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaprdesignerPackage.Literals.SUBSCRIPTION_CONFIGURATION;
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
	public String getTopicName() {
		return topicName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopicName(String newTopicName) {
		String oldTopicName = topicName;
		topicName = newTopicName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__TOPIC_NAME, oldTopicName, topicName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RouteRules> getRouteRules() {
		if (routeRules == null) {
			routeRules = new EObjectResolvingEList<RouteRules>(RouteRules.class, this,
					DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__ROUTE_RULES);
		}
		return routeRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getPubsub() {
		if (pubsub != null && pubsub.eIsProxy()) {
			InternalEObject oldPubsub = (InternalEObject) pubsub;
			pubsub = (Component) eResolveProxy(oldPubsub);
			if (pubsub != oldPubsub) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__PUBSUB, oldPubsub, pubsub));
			}
		}
		return pubsub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetPubsub() {
		return pubsub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPubsub(Component newPubsub) {
		Component oldPubsub = pubsub;
		pubsub = newPubsub;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__PUBSUB, oldPubsub, pubsub));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeadLetterTopic() {
		return deadLetterTopic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeadLetterTopic(String newDeadLetterTopic) {
		String oldDeadLetterTopic = deadLetterTopic;
		deadLetterTopic = newDeadLetterTopic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__DEAD_LETTER_TOPIC, oldDeadLetterTopic,
					deadLetterTopic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBulkSubscribe_enabled() {
		return bulkSubscribe_enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBulkSubscribe_enabled(boolean newBulkSubscribe_enabled) {
		boolean oldBulkSubscribe_enabled = bulkSubscribe_enabled;
		bulkSubscribe_enabled = newBulkSubscribe_enabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__BULK_SUBSCRIBE_ENABLED, oldBulkSubscribe_enabled,
					bulkSubscribe_enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBulkSubscribe_maxMessagesCount() {
		return bulkSubscribe_maxMessagesCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBulkSubscribe_maxMessagesCount(String newBulkSubscribe_maxMessagesCount) {
		String oldBulkSubscribe_maxMessagesCount = bulkSubscribe_maxMessagesCount;
		bulkSubscribe_maxMessagesCount = newBulkSubscribe_maxMessagesCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__BULK_SUBSCRIBE_MAX_MESSAGES_COUNT,
					oldBulkSubscribe_maxMessagesCount, bulkSubscribe_maxMessagesCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBulkSubscribe_maxAwaitDurationMs() {
		return bulkSubscribe_maxAwaitDurationMs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBulkSubscribe_maxAwaitDurationMs(String newBulkSubscribe_maxAwaitDurationMs) {
		String oldBulkSubscribe_maxAwaitDurationMs = bulkSubscribe_maxAwaitDurationMs;
		bulkSubscribe_maxAwaitDurationMs = newBulkSubscribe_maxAwaitDurationMs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__BULK_SUBSCRIBE_MAX_AWAIT_DURATION_MS,
					oldBulkSubscribe_maxAwaitDurationMs, bulkSubscribe_maxAwaitDurationMs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<App> getScopes() {
		if (scopes == null) {
			scopes = new EObjectResolvingEList<App>(App.class, this,
					DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__SCOPES);
		}
		return scopes;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__API_VERSION:
			return getApiVersion();
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__KIND:
			return getKind();
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__TOPIC_NAME:
			return getTopicName();
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__ROUTE_RULES:
			return getRouteRules();
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__PUBSUB:
			if (resolve)
				return getPubsub();
			return basicGetPubsub();
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__DEAD_LETTER_TOPIC:
			return getDeadLetterTopic();
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__BULK_SUBSCRIBE_ENABLED:
			return isBulkSubscribe_enabled();
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__BULK_SUBSCRIBE_MAX_MESSAGES_COUNT:
			return getBulkSubscribe_maxMessagesCount();
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__BULK_SUBSCRIBE_MAX_AWAIT_DURATION_MS:
			return getBulkSubscribe_maxAwaitDurationMs();
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__SCOPES:
			return getScopes();
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__NAME:
			return getName();
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
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__TOPIC_NAME:
			setTopicName((String) newValue);
			return;
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__ROUTE_RULES:
			getRouteRules().clear();
			getRouteRules().addAll((Collection<? extends RouteRules>) newValue);
			return;
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__PUBSUB:
			setPubsub((Component) newValue);
			return;
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__DEAD_LETTER_TOPIC:
			setDeadLetterTopic((String) newValue);
			return;
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__BULK_SUBSCRIBE_ENABLED:
			setBulkSubscribe_enabled((Boolean) newValue);
			return;
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__BULK_SUBSCRIBE_MAX_MESSAGES_COUNT:
			setBulkSubscribe_maxMessagesCount((String) newValue);
			return;
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__BULK_SUBSCRIBE_MAX_AWAIT_DURATION_MS:
			setBulkSubscribe_maxAwaitDurationMs((String) newValue);
			return;
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__SCOPES:
			getScopes().clear();
			getScopes().addAll((Collection<? extends App>) newValue);
			return;
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__NAME:
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
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__TOPIC_NAME:
			setTopicName(TOPIC_NAME_EDEFAULT);
			return;
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__ROUTE_RULES:
			getRouteRules().clear();
			return;
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__PUBSUB:
			setPubsub((Component) null);
			return;
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__DEAD_LETTER_TOPIC:
			setDeadLetterTopic(DEAD_LETTER_TOPIC_EDEFAULT);
			return;
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__BULK_SUBSCRIBE_ENABLED:
			setBulkSubscribe_enabled(BULK_SUBSCRIBE_ENABLED_EDEFAULT);
			return;
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__BULK_SUBSCRIBE_MAX_MESSAGES_COUNT:
			setBulkSubscribe_maxMessagesCount(BULK_SUBSCRIBE_MAX_MESSAGES_COUNT_EDEFAULT);
			return;
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__BULK_SUBSCRIBE_MAX_AWAIT_DURATION_MS:
			setBulkSubscribe_maxAwaitDurationMs(BULK_SUBSCRIBE_MAX_AWAIT_DURATION_MS_EDEFAULT);
			return;
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__SCOPES:
			getScopes().clear();
			return;
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__NAME:
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
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__API_VERSION:
			return API_VERSION_EDEFAULT == null ? apiVersion != null : !API_VERSION_EDEFAULT.equals(apiVersion);
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__KIND:
			return KIND_EDEFAULT == null ? kind != null : !KIND_EDEFAULT.equals(kind);
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__TOPIC_NAME:
			return TOPIC_NAME_EDEFAULT == null ? topicName != null : !TOPIC_NAME_EDEFAULT.equals(topicName);
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__ROUTE_RULES:
			return routeRules != null && !routeRules.isEmpty();
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__PUBSUB:
			return pubsub != null;
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__DEAD_LETTER_TOPIC:
			return DEAD_LETTER_TOPIC_EDEFAULT == null ? deadLetterTopic != null
					: !DEAD_LETTER_TOPIC_EDEFAULT.equals(deadLetterTopic);
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__BULK_SUBSCRIBE_ENABLED:
			return bulkSubscribe_enabled != BULK_SUBSCRIBE_ENABLED_EDEFAULT;
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__BULK_SUBSCRIBE_MAX_MESSAGES_COUNT:
			return BULK_SUBSCRIBE_MAX_MESSAGES_COUNT_EDEFAULT == null ? bulkSubscribe_maxMessagesCount != null
					: !BULK_SUBSCRIBE_MAX_MESSAGES_COUNT_EDEFAULT.equals(bulkSubscribe_maxMessagesCount);
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__BULK_SUBSCRIBE_MAX_AWAIT_DURATION_MS:
			return BULK_SUBSCRIBE_MAX_AWAIT_DURATION_MS_EDEFAULT == null ? bulkSubscribe_maxAwaitDurationMs != null
					: !BULK_SUBSCRIBE_MAX_AWAIT_DURATION_MS_EDEFAULT.equals(bulkSubscribe_maxAwaitDurationMs);
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__SCOPES:
			return scopes != null && !scopes.isEmpty();
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__NAME:
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
		result.append(" (apiVersion: ");
		result.append(apiVersion);
		result.append(", kind: ");
		result.append(kind);
		result.append(", topicName: ");
		result.append(topicName);
		result.append(", deadLetterTopic: ");
		result.append(deadLetterTopic);
		result.append(", bulkSubscribe_enabled: ");
		result.append(bulkSubscribe_enabled);
		result.append(", bulkSubscribe_maxMessagesCount: ");
		result.append(bulkSubscribe_maxMessagesCount);
		result.append(", bulkSubscribe_maxAwaitDurationMs: ");
		result.append(bulkSubscribe_maxAwaitDurationMs);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SubscriptionConfigurationImpl
