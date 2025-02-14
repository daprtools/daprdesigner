/**
 */
package daprdesigner.provider;

import daprdesigner.DaprdesignerPackage;
import daprdesigner.ResiliencyTarget;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link daprdesigner.ResiliencyTarget} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ResiliencyTargetItemProvider extends DaprNodeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResiliencyTargetItemProvider(AdapterFactory adapterFactory) {
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
			addTypePropertyDescriptor(object);
			addCircuitBreakerCacheSizePropertyDescriptor(object);
			addCircuitBreakerPropertyDescriptor(object);
			addRetryPropertyDescriptor(object);
			addTimeoutPropertyDescriptor(object);
			addAppsActorsOrWorkflowsPropertyDescriptor(object);
			addComponentsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
						getResourceLocator(), getString("_UI_ResiliencyTarget_help_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ResiliencyTarget_help_feature",
								"_UI_ResiliencyTarget_type"),
						DaprdesignerPackage.Literals.RESILIENCY_TARGET__HELP, false, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ResiliencyTarget_type_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ResiliencyTarget_type_feature",
								"_UI_ResiliencyTarget_type"),
						DaprdesignerPackage.Literals.RESILIENCY_TARGET__TYPE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Circuit Breaker Cache Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCircuitBreakerCacheSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ResiliencyTarget_circuitBreakerCacheSize_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_ResiliencyTarget_circuitBreakerCacheSize_feature", "_UI_ResiliencyTarget_type"),
						DaprdesignerPackage.Literals.RESILIENCY_TARGET__CIRCUIT_BREAKER_CACHE_SIZE, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Circuit Breaker feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCircuitBreakerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ResiliencyTarget_circuitBreaker_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ResiliencyTarget_circuitBreaker_feature",
						"_UI_ResiliencyTarget_type"),
				DaprdesignerPackage.Literals.RESILIENCY_TARGET__CIRCUIT_BREAKER, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Retry feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRetryPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ResiliencyTarget_retry_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ResiliencyTarget_retry_feature",
								"_UI_ResiliencyTarget_type"),
						DaprdesignerPackage.Literals.RESILIENCY_TARGET__RETRY, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Timeout feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeoutPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ResiliencyTarget_timeout_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ResiliencyTarget_timeout_feature",
								"_UI_ResiliencyTarget_type"),
						DaprdesignerPackage.Literals.RESILIENCY_TARGET__TIMEOUT, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Apps Actors Or Workflows feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAppsActorsOrWorkflowsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ResiliencyTarget_appsActorsOrWorkflows_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_ResiliencyTarget_appsActorsOrWorkflows_feature", "_UI_ResiliencyTarget_type"),
						DaprdesignerPackage.Literals.RESILIENCY_TARGET__APPS_ACTORS_OR_WORKFLOWS, true, false, true,
						null, null, null));
	}

	/**
	 * This adds a property descriptor for the Components feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComponentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ResiliencyTarget_components_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ResiliencyTarget_components_feature",
						"_UI_ResiliencyTarget_type"),
				DaprdesignerPackage.Literals.RESILIENCY_TARGET__COMPONENTS, true, false, true, null, null, null));
	}

	/**
	 * This returns ResiliencyTarget.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ResiliencyTarget"));
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
		String label = ((ResiliencyTarget) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_ResiliencyTarget_type")
				: getString("_UI_ResiliencyTarget_type") + " " + label;
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

		switch (notification.getFeatureID(ResiliencyTarget.class)) {
		case DaprdesignerPackage.RESILIENCY_TARGET__HELP:
		case DaprdesignerPackage.RESILIENCY_TARGET__TYPE:
		case DaprdesignerPackage.RESILIENCY_TARGET__CIRCUIT_BREAKER_CACHE_SIZE:
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
