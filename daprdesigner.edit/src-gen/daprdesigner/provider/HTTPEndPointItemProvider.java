/**
 */
package daprdesigner.provider;

import daprdesigner.DaprdesignerPackage;
import daprdesigner.HTTPEndPoint;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link daprdesigner.HTTPEndPoint} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HTTPEndPointItemProvider extends DaprNodeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPEndPointItemProvider(AdapterFactory adapterFactory) {
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
			addBaseUrlPropertyDescriptor(object);
			addAuthPropertyDescriptor(object);
			addScopesPropertyDescriptor(object);
			addSpecHeadersPropertyDescriptor(object);
			addSpecRootCAPropertyDescriptor(object);
			addSpecCertificatePropertyDescriptor(object);
			addSpecPrivateKeyPropertyDescriptor(object);
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
						getResourceLocator(), getString("_UI_HTTPEndPoint_help_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_HTTPEndPoint_help_feature",
								"_UI_HTTPEndPoint_type"),
						DaprdesignerPackage.Literals.HTTP_END_POINT__HELP, false, false, false,
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
						getResourceLocator(), getString("_UI_HTTPEndPoint_apiVersion_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_HTTPEndPoint_apiVersion_feature",
								"_UI_HTTPEndPoint_type"),
						DaprdesignerPackage.Literals.HTTP_END_POINT__API_VERSION, false, false, false,
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
						getResourceLocator(), getString("_UI_HTTPEndPoint_kind_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_HTTPEndPoint_kind_feature",
								"_UI_HTTPEndPoint_type"),
						DaprdesignerPackage.Literals.HTTP_END_POINT__KIND, false, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Base Url feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseUrlPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_HTTPEndPoint_baseUrl_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_HTTPEndPoint_baseUrl_feature",
								"_UI_HTTPEndPoint_type"),
						DaprdesignerPackage.Literals.HTTP_END_POINT__BASE_URL, true, false, false,
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
						getResourceLocator(), getString("_UI_HTTPEndPoint_auth_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_HTTPEndPoint_auth_feature",
								"_UI_HTTPEndPoint_type"),
						DaprdesignerPackage.Literals.HTTP_END_POINT__AUTH, true, false, true, null, null, null));
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
						getResourceLocator(), getString("_UI_HTTPEndPoint_scopes_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_HTTPEndPoint_scopes_feature",
								"_UI_HTTPEndPoint_type"),
						DaprdesignerPackage.Literals.HTTP_END_POINT__SCOPES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Spec Headers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpecHeadersPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_HTTPEndPoint_specHeaders_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_HTTPEndPoint_specHeaders_feature",
								"_UI_HTTPEndPoint_type"),
						DaprdesignerPackage.Literals.HTTP_END_POINT__SPEC_HEADERS, true, false, true, null, null,
						null));
	}

	/**
	 * This adds a property descriptor for the Spec Root CA feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpecRootCAPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_HTTPEndPoint_specRootCA_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_HTTPEndPoint_specRootCA_feature",
								"_UI_HTTPEndPoint_type"),
						DaprdesignerPackage.Literals.HTTP_END_POINT__SPEC_ROOT_CA, true, false, true, null, null,
						null));
	}

	/**
	 * This adds a property descriptor for the Spec Certificate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpecCertificatePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_HTTPEndPoint_specCertificate_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_HTTPEndPoint_specCertificate_feature",
								"_UI_HTTPEndPoint_type"),
						DaprdesignerPackage.Literals.HTTP_END_POINT__SPEC_CERTIFICATE, true, false, true, null, null,
						null));
	}

	/**
	 * This adds a property descriptor for the Spec Private Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpecPrivateKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_HTTPEndPoint_specPrivateKey_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_HTTPEndPoint_specPrivateKey_feature",
								"_UI_HTTPEndPoint_type"),
						DaprdesignerPackage.Literals.HTTP_END_POINT__SPEC_PRIVATE_KEY, true, false, true, null, null,
						null));
	}

	/**
	 * This returns HTTPEndPoint.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HTTPEndPoint"));
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
		String label = ((HTTPEndPoint) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_HTTPEndPoint_type")
				: getString("_UI_HTTPEndPoint_type") + " " + label;
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

		switch (notification.getFeatureID(HTTPEndPoint.class)) {
		case DaprdesignerPackage.HTTP_END_POINT__HELP:
		case DaprdesignerPackage.HTTP_END_POINT__API_VERSION:
		case DaprdesignerPackage.HTTP_END_POINT__KIND:
		case DaprdesignerPackage.HTTP_END_POINT__BASE_URL:
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
