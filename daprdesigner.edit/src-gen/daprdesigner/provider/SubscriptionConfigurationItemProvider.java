/**
 */
package daprdesigner.provider;

import daprdesigner.DaprdesignerPackage;
import daprdesigner.SubscriptionConfiguration;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link daprdesigner.SubscriptionConfiguration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SubscriptionConfigurationItemProvider extends DaprNodeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionConfigurationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addHelpPropertyDescriptor(object);
			addApiVersionPropertyDescriptor(object);
			addKindPropertyDescriptor(object);
			addTopicNamePropertyDescriptor(object);
			addRouteRulesPropertyDescriptor(object);
			addPubsubPropertyDescriptor(object);
			addDeadLetterTopicPropertyDescriptor(object);
			addBulkSubscribe_enabledPropertyDescriptor(object);
			addBulkSubscribe_maxMessagesCountPropertyDescriptor(object);
			addBulkSubscribe_maxAwaitDurationsPropertyDescriptor(object);
			addScopesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Api Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addApiVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_SubscriptionConfiguration_apiVersion_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_SubscriptionConfiguration_apiVersion_feature",
						"_UI_SubscriptionConfiguration_type"),
				DaprdesignerPackage.Literals.SUBSCRIPTION_CONFIGURATION__API_VERSION, false, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Kind feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKindPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SubscriptionConfiguration_kind_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_SubscriptionConfiguration_kind_feature",
								"_UI_SubscriptionConfiguration_type"),
						DaprdesignerPackage.Literals.SUBSCRIPTION_CONFIGURATION__KIND, false, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Topic Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTopicNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_SubscriptionConfiguration_topicName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_SubscriptionConfiguration_topicName_feature",
						"_UI_SubscriptionConfiguration_type"),
				DaprdesignerPackage.Literals.SUBSCRIPTION_CONFIGURATION__TOPIC_NAME, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Route Rules feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRouteRulesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_SubscriptionConfiguration_routeRules_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_SubscriptionConfiguration_routeRules_feature",
						"_UI_SubscriptionConfiguration_type"),
				DaprdesignerPackage.Literals.SUBSCRIPTION_CONFIGURATION__ROUTE_RULES, true, false, true, null, null,
				null));
	}

	/**
	 * This adds a property descriptor for the Pubsub feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPubsubPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_SubscriptionConfiguration_pubsub_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_SubscriptionConfiguration_pubsub_feature",
						"_UI_SubscriptionConfiguration_type"),
				DaprdesignerPackage.Literals.SUBSCRIPTION_CONFIGURATION__PUBSUB, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Dead Letter Topic feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeadLetterTopicPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_SubscriptionConfiguration_deadLetterTopic_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_SubscriptionConfiguration_deadLetterTopic_feature",
						"_UI_SubscriptionConfiguration_type"),
				DaprdesignerPackage.Literals.SUBSCRIPTION_CONFIGURATION__DEAD_LETTER_TOPIC, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Bulk Subscribe enabled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBulkSubscribe_enabledPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SubscriptionConfiguration_bulkSubscribe_enabled_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_SubscriptionConfiguration_bulkSubscribe_enabled_feature",
								"_UI_SubscriptionConfiguration_type"),
						DaprdesignerPackage.Literals.SUBSCRIPTION_CONFIGURATION__BULK_SUBSCRIBE_ENABLED, true, false,
						false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Bulk Subscribe max Messages Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBulkSubscribe_maxMessagesCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_SubscriptionConfiguration_bulkSubscribe_maxMessagesCount_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SubscriptionConfiguration_bulkSubscribe_maxMessagesCount_feature",
						"_UI_SubscriptionConfiguration_type"),
				DaprdesignerPackage.Literals.SUBSCRIPTION_CONFIGURATION__BULK_SUBSCRIBE_MAX_MESSAGES_COUNT, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Bulk Subscribe max Await Durations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBulkSubscribe_maxAwaitDurationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_SubscriptionConfiguration_bulkSubscribe_maxAwaitDurations_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SubscriptionConfiguration_bulkSubscribe_maxAwaitDurations_feature",
						"_UI_SubscriptionConfiguration_type"),
				DaprdesignerPackage.Literals.SUBSCRIPTION_CONFIGURATION__BULK_SUBSCRIBE_MAX_AWAIT_DURATIONS, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Scopes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScopesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_SubscriptionConfiguration_scopes_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_SubscriptionConfiguration_scopes_feature",
						"_UI_SubscriptionConfiguration_type"),
				DaprdesignerPackage.Literals.SUBSCRIPTION_CONFIGURATION__SCOPES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Help feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHelpPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SubscriptionConfiguration_help_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_SubscriptionConfiguration_help_feature",
								"_UI_SubscriptionConfiguration_type"),
						DaprdesignerPackage.Literals.SUBSCRIPTION_CONFIGURATION__HELP, false, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns SubscriptionConfiguration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SubscriptionConfiguration"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SubscriptionConfiguration) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_SubscriptionConfiguration_type")
				: getString("_UI_SubscriptionConfiguration_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(SubscriptionConfiguration.class)) {
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__HELP:
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__API_VERSION:
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__KIND:
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__TOPIC_NAME:
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__DEAD_LETTER_TOPIC:
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__BULK_SUBSCRIBE_ENABLED:
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__BULK_SUBSCRIBE_MAX_MESSAGES_COUNT:
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__BULK_SUBSCRIBE_MAX_AWAIT_DURATIONS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
