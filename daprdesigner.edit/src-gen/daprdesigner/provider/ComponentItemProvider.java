/**
 */
package daprdesigner.provider;

import daprdesigner.Component;
import daprdesigner.DaprdesignerPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link daprdesigner.Component} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentItemProvider extends DaprNodeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentItemProvider(AdapterFactory adapterFactory) {
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

			addRequiredFieldsPropertyDescriptor(object);
			addApiVersionPropertyDescriptor(object);
			addKindPropertyDescriptor(object);
			addProviderNamePropertyDescriptor(object);
			addProviderVersionPropertyDescriptor(object);
			addAuthPropertyDescriptor(object);
			addMetadata_namespacePropertyDescriptor(object);
			addIgnoreErrorsPropertyDescriptor(object);
			addInitTimeoutPropertyDescriptor(object);
			addSpecMetadataPropertyDescriptor(object);
			addScopesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Required Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiredFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_requiredFields_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_requiredFields_feature",
								"_UI_Component_type"),
						DaprdesignerPackage.Literals.COMPONENT__REQUIRED_FIELDS, false, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Api Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addApiVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_apiVersion_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_apiVersion_feature",
								"_UI_Component_type"),
						DaprdesignerPackage.Literals.COMPONENT__API_VERSION, false, false, false,
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
						getResourceLocator(), getString("_UI_Component_kind_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_kind_feature",
								"_UI_Component_type"),
						DaprdesignerPackage.Literals.COMPONENT__KIND, false, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Provider Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProviderNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_providerName_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_providerName_feature",
								"_UI_Component_type"),
						DaprdesignerPackage.Literals.COMPONENT__PROVIDER_NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Provider Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProviderVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_providerVersion_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_providerVersion_feature",
								"_UI_Component_type"),
						DaprdesignerPackage.Literals.COMPONENT__PROVIDER_VERSION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Auth feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_auth_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_auth_feature",
								"_UI_Component_type"),
						DaprdesignerPackage.Literals.COMPONENT__AUTH, true, false, true, null, null, null));
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
						getResourceLocator(), getString("_UI_Component_metadata_namespace_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_metadata_namespace_feature",
								"_UI_Component_type"),
						DaprdesignerPackage.Literals.COMPONENT__METADATA_NAMESPACE, true, false, true, null, null,
						null));
	}

	/**
	 * This adds a property descriptor for the Ignore Errors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIgnoreErrorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_ignoreErrors_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_ignoreErrors_feature",
								"_UI_Component_type"),
						DaprdesignerPackage.Literals.COMPONENT__IGNORE_ERRORS, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Init Timeout feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitTimeoutPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_initTimeout_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_initTimeout_feature",
								"_UI_Component_type"),
						DaprdesignerPackage.Literals.COMPONENT__INIT_TIMEOUT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Spec Metadata feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpecMetadataPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_specMetadata_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_specMetadata_feature",
								"_UI_Component_type"),
						DaprdesignerPackage.Literals.COMPONENT__SPEC_METADATA, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Scopes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScopesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_scopes_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_scopes_feature",
								"_UI_Component_type"),
						DaprdesignerPackage.Literals.COMPONENT__SCOPES, true, false, true, null, null, null));
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
		String label = ((Component) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Component_type")
				: getString("_UI_Component_type") + " " + label;
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

		switch (notification.getFeatureID(Component.class)) {
		case DaprdesignerPackage.COMPONENT__REQUIRED_FIELDS:
		case DaprdesignerPackage.COMPONENT__API_VERSION:
		case DaprdesignerPackage.COMPONENT__KIND:
		case DaprdesignerPackage.COMPONENT__PROVIDER_NAME:
		case DaprdesignerPackage.COMPONENT__PROVIDER_VERSION:
		case DaprdesignerPackage.COMPONENT__IGNORE_ERRORS:
		case DaprdesignerPackage.COMPONENT__INIT_TIMEOUT:
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
