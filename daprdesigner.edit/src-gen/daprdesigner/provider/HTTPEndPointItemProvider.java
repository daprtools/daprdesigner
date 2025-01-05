/**
 */
package daprdesigner.provider;

import daprdesigner.DaprdesignerFactory;
import daprdesigner.DaprdesignerPackage;
import daprdesigner.HTTPEndPoint;

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
 * This is the item provider adapter for a {@link daprdesigner.HTTPEndPoint} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HTTPEndPointItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
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

			addApiVersionPropertyDescriptor(object);
			addKindPropertyDescriptor(object);
			addAuthPropertyDescriptor(object);
			addMetadata_namePropertyDescriptor(object);
			addBaseUrlPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Metadata name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMetadata_namePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_HTTPEndPoint_metadata_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_HTTPEndPoint_metadata_name_feature",
								"_UI_HTTPEndPoint_type"),
						DaprdesignerPackage.Literals.HTTP_END_POINT__METADATA_NAME, true, false, false,
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
			childrenFeatures.add(DaprdesignerPackage.Literals.HTTP_END_POINT__HEADERS);
			childrenFeatures.add(DaprdesignerPackage.Literals.HTTP_END_POINT__CLIENT_TLS_ROOT_CA);
			childrenFeatures.add(DaprdesignerPackage.Literals.HTTP_END_POINT__CLIENT_TLS_CERTIFICATE);
			childrenFeatures.add(DaprdesignerPackage.Literals.HTTP_END_POINT__CLIENT_TLS_PRIVATE_KEY);
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
		String label = ((HTTPEndPoint) object).getMetadata_name();
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
		case DaprdesignerPackage.HTTP_END_POINT__API_VERSION:
		case DaprdesignerPackage.HTTP_END_POINT__KIND:
		case DaprdesignerPackage.HTTP_END_POINT__METADATA_NAME:
		case DaprdesignerPackage.HTTP_END_POINT__BASE_URL:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case DaprdesignerPackage.HTTP_END_POINT__HEADERS:
		case DaprdesignerPackage.HTTP_END_POINT__CLIENT_TLS_ROOT_CA:
		case DaprdesignerPackage.HTTP_END_POINT__CLIENT_TLS_CERTIFICATE:
		case DaprdesignerPackage.HTTP_END_POINT__CLIENT_TLS_PRIVATE_KEY:
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

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.HTTP_END_POINT__HEADERS,
				DaprdesignerFactory.eINSTANCE.createSpecMetadata()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.HTTP_END_POINT__CLIENT_TLS_ROOT_CA,
				DaprdesignerFactory.eINSTANCE.createSpecMetadata()));

		newChildDescriptors
				.add(createChildParameter(DaprdesignerPackage.Literals.HTTP_END_POINT__CLIENT_TLS_CERTIFICATE,
						DaprdesignerFactory.eINSTANCE.createSpecMetadata()));

		newChildDescriptors
				.add(createChildParameter(DaprdesignerPackage.Literals.HTTP_END_POINT__CLIENT_TLS_PRIVATE_KEY,
						DaprdesignerFactory.eINSTANCE.createSpecMetadata()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == DaprdesignerPackage.Literals.HTTP_END_POINT__HEADERS
				|| childFeature == DaprdesignerPackage.Literals.HTTP_END_POINT__CLIENT_TLS_ROOT_CA
				|| childFeature == DaprdesignerPackage.Literals.HTTP_END_POINT__CLIENT_TLS_CERTIFICATE
				|| childFeature == DaprdesignerPackage.Literals.HTTP_END_POINT__CLIENT_TLS_PRIVATE_KEY;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
