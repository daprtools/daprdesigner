/**
 */
package daprdesigner.provider;

import daprdesigner.DaprdesignerFactory;
import daprdesigner.DaprdesignerPackage;
import daprdesigner.SubscriptionConfiguration;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link daprdesigner.SubscriptionConfiguration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SubscriptionConfigurationItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
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

			addApiVersionPropertyDescriptor(object);
			addKindPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addTopicNamePropertyDescriptor(object);
			addPubsubnamePropertyDescriptor(object);
			addDeadLetterTopicPropertyDescriptor(object);
			addBulkSubscribe_enabledPropertyDescriptor(object);
			addBulkSubscribe_maxMessagesCountPropertyDescriptor(object);
			addBulkSubscribe_maxAwaitDurationMsPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SubscriptionConfiguration_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_SubscriptionConfiguration_name_feature",
								"_UI_SubscriptionConfiguration_type"),
						DaprdesignerPackage.Literals.SUBSCRIPTION_CONFIGURATION__NAME, true, false, false,
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
	 * This adds a property descriptor for the Pubsubname feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPubsubnamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_SubscriptionConfiguration_pubsubname_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_SubscriptionConfiguration_pubsubname_feature",
						"_UI_SubscriptionConfiguration_type"),
				DaprdesignerPackage.Literals.SUBSCRIPTION_CONFIGURATION__PUBSUBNAME, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
	 * This adds a property descriptor for the Bulk Subscribe max Await Duration Ms feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBulkSubscribe_maxAwaitDurationMsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_SubscriptionConfiguration_bulkSubscribe_maxAwaitDurationMs_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SubscriptionConfiguration_bulkSubscribe_maxAwaitDurationMs_feature",
						"_UI_SubscriptionConfiguration_type"),
				DaprdesignerPackage.Literals.SUBSCRIPTION_CONFIGURATION__BULK_SUBSCRIBE_MAX_AWAIT_DURATION_MS, true,
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
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DaprdesignerPackage.Literals.SUBSCRIPTION_CONFIGURATION__ROUTE_RULES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
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
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__API_VERSION:
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__KIND:
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__NAME:
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__TOPIC_NAME:
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__PUBSUBNAME:
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__DEAD_LETTER_TOPIC:
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__BULK_SUBSCRIBE_ENABLED:
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__BULK_SUBSCRIBE_MAX_MESSAGES_COUNT:
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__BULK_SUBSCRIBE_MAX_AWAIT_DURATION_MS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case DaprdesignerPackage.SUBSCRIPTION_CONFIGURATION__ROUTE_RULES:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add(createChildParameter(
				DaprdesignerPackage.Literals.SUBSCRIPTION_CONFIGURATION__ROUTE_RULES,
				DaprdesignerFactory.eINSTANCE.create(DaprdesignerPackage.Literals.ESTRING_TO_STRING_MAP_ENTRY)));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DaprdesignerEditPlugin.INSTANCE;
	}

}
