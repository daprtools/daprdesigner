/**
 */
package daprdesigner.provider;

import daprdesigner.DaprdesignerPackage;
import daprdesigner.ResiliencyPolicy;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link daprdesigner.ResiliencyPolicy} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ResiliencyPolicyItemProvider extends DaprNodeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResiliencyPolicyItemProvider(AdapterFactory adapterFactory) {
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
			addRetriesPropertyDescriptor(object);
			addCircuitBreakersPropertyDescriptor(object);
			addTimeoutDefinitionsPropertyDescriptor(object);
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
						getResourceLocator(), getString("_UI_ResiliencyPolicy_help_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ResiliencyPolicy_help_feature",
								"_UI_ResiliencyPolicy_type"),
						DaprdesignerPackage.Literals.RESILIENCY_POLICY__HELP, false, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Retries feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRetriesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ResiliencyPolicy_retries_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ResiliencyPolicy_retries_feature",
								"_UI_ResiliencyPolicy_type"),
						DaprdesignerPackage.Literals.RESILIENCY_POLICY__RETRIES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Circuit Breakers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCircuitBreakersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ResiliencyPolicy_circuitBreakers_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ResiliencyPolicy_circuitBreakers_feature",
						"_UI_ResiliencyPolicy_type"),
				DaprdesignerPackage.Literals.RESILIENCY_POLICY__CIRCUIT_BREAKERS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Timeout Definitions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeoutDefinitionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ResiliencyPolicy_timeoutDefinitions_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_ResiliencyPolicy_timeoutDefinitions_feature", "_UI_ResiliencyPolicy_type"),
						DaprdesignerPackage.Literals.RESILIENCY_POLICY__TIMEOUT_DEFINITIONS, true, false, true, null,
						null, null));
	}

	/**
	 * This returns ResiliencyPolicy.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ResiliencyPolicy"));
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
		String label = ((ResiliencyPolicy) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_ResiliencyPolicy_type")
				: getString("_UI_ResiliencyPolicy_type") + " " + label;
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

		switch (notification.getFeatureID(ResiliencyPolicy.class)) {
		case DaprdesignerPackage.RESILIENCY_POLICY__HELP:
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
