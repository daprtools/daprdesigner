/**
 */
package daprdesigner.provider;

import daprdesigner.AppConfiguration;
import daprdesigner.DaprdesignerFactory;
import daprdesigner.DaprdesignerPackage;

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
 * This is the item provider adapter for a {@link daprdesigner.AppConfiguration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AppConfigurationItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppConfigurationItemProvider(AdapterFactory adapterFactory) {
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
			addMetadata_namePropertyDescriptor(object);
			addMetadata_namespacePropertyDescriptor(object);
			addComponentsDenyListPropertyDescriptor(object);
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
				getString("_UI_AppConfiguration_apiVersion_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_AppConfiguration_apiVersion_feature",
						"_UI_AppConfiguration_type"),
				DaprdesignerPackage.Literals.APP_CONFIGURATION__API_VERSION, false, false, false,
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
						getResourceLocator(), getString("_UI_AppConfiguration_kind_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_AppConfiguration_kind_feature",
								"_UI_AppConfiguration_type"),
						DaprdesignerPackage.Literals.APP_CONFIGURATION__KIND, false, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Metadata name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMetadata_namePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AppConfiguration_metadata_name_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_AppConfiguration_metadata_name_feature",
						"_UI_AppConfiguration_type"),
				DaprdesignerPackage.Literals.APP_CONFIGURATION__METADATA_NAME, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Metadata namespace feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMetadata_namespacePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_AppConfiguration_metadata_namespace_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_AppConfiguration_metadata_namespace_feature", "_UI_AppConfiguration_type"),
						DaprdesignerPackage.Literals.APP_CONFIGURATION__METADATA_NAMESPACE, true, false, true, null,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Components Deny List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComponentsDenyListPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_AppConfiguration_componentsDenyList_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_AppConfiguration_componentsDenyList_feature", "_UI_AppConfiguration_type"),
						DaprdesignerPackage.Literals.APP_CONFIGURATION__COMPONENTS_DENY_LIST, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(DaprdesignerPackage.Literals.APP_CONFIGURATION__ACCESS_CONTROL);
			childrenFeatures.add(DaprdesignerPackage.Literals.APP_CONFIGURATION__API_CONTROL);
			childrenFeatures.add(DaprdesignerPackage.Literals.APP_CONFIGURATION__MIDDLEWARE_CONFIGURATION);
			childrenFeatures.add(DaprdesignerPackage.Literals.APP_CONFIGURATION__LOGGING_CONFIGURATION);
			childrenFeatures.add(DaprdesignerPackage.Literals.APP_CONFIGURATION__NAME_RESOLUTION_CONFIGURATION);
			childrenFeatures.add(DaprdesignerPackage.Literals.APP_CONFIGURATION__SECRETS_CONFIGURATION);
			childrenFeatures.add(DaprdesignerPackage.Literals.APP_CONFIGURATION__METRICS_CONFIGURATION);
			childrenFeatures.add(DaprdesignerPackage.Literals.APP_CONFIGURATION__TRACING_CONFIGURATION);
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
	 * This returns AppConfiguration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AppConfiguration"));
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
		String label = ((AppConfiguration) object).getMetadata_name();
		return label == null || label.length() == 0 ? getString("_UI_AppConfiguration_type")
				: getString("_UI_AppConfiguration_type") + " " + label;
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

		switch (notification.getFeatureID(AppConfiguration.class)) {
		case DaprdesignerPackage.APP_CONFIGURATION__API_VERSION:
		case DaprdesignerPackage.APP_CONFIGURATION__KIND:
		case DaprdesignerPackage.APP_CONFIGURATION__METADATA_NAME:
		case DaprdesignerPackage.APP_CONFIGURATION__COMPONENTS_DENY_LIST:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case DaprdesignerPackage.APP_CONFIGURATION__ACCESS_CONTROL:
		case DaprdesignerPackage.APP_CONFIGURATION__API_CONTROL:
		case DaprdesignerPackage.APP_CONFIGURATION__MIDDLEWARE_CONFIGURATION:
		case DaprdesignerPackage.APP_CONFIGURATION__LOGGING_CONFIGURATION:
		case DaprdesignerPackage.APP_CONFIGURATION__NAME_RESOLUTION_CONFIGURATION:
		case DaprdesignerPackage.APP_CONFIGURATION__SECRETS_CONFIGURATION:
		case DaprdesignerPackage.APP_CONFIGURATION__METRICS_CONFIGURATION:
		case DaprdesignerPackage.APP_CONFIGURATION__TRACING_CONFIGURATION:
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

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.APP_CONFIGURATION__ACCESS_CONTROL,
				DaprdesignerFactory.eINSTANCE.createAppAccessControl()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.APP_CONFIGURATION__API_CONTROL,
				DaprdesignerFactory.eINSTANCE.createAPIAccessControl()));

		newChildDescriptors
				.add(createChildParameter(DaprdesignerPackage.Literals.APP_CONFIGURATION__MIDDLEWARE_CONFIGURATION,
						DaprdesignerFactory.eINSTANCE.createMiddlewareConfiguration()));

		newChildDescriptors
				.add(createChildParameter(DaprdesignerPackage.Literals.APP_CONFIGURATION__LOGGING_CONFIGURATION,
						DaprdesignerFactory.eINSTANCE.createLoggingConfiguration()));

		newChildDescriptors
				.add(createChildParameter(DaprdesignerPackage.Literals.APP_CONFIGURATION__NAME_RESOLUTION_CONFIGURATION,
						DaprdesignerFactory.eINSTANCE.createNameResolutionConfiguration()));

		newChildDescriptors
				.add(createChildParameter(DaprdesignerPackage.Literals.APP_CONFIGURATION__SECRETS_CONFIGURATION,
						DaprdesignerFactory.eINSTANCE.createSecretsConfiguration()));

		newChildDescriptors
				.add(createChildParameter(DaprdesignerPackage.Literals.APP_CONFIGURATION__METRICS_CONFIGURATION,
						DaprdesignerFactory.eINSTANCE.createMetricsConfiguration()));

		newChildDescriptors
				.add(createChildParameter(DaprdesignerPackage.Literals.APP_CONFIGURATION__TRACING_CONFIGURATION,
						DaprdesignerFactory.eINSTANCE.createTracingConfiguration()));
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
