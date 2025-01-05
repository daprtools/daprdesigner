/**
 */
package daprdesigner.provider;

import daprdesigner.DaprdesignerFactory;
import daprdesigner.DaprdesignerPackage;
import daprdesigner.Environment;

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
 * This is the item provider adapter for a {@link daprdesigner.Environment} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EnvironmentItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
						getResourceLocator(), getString("_UI_Environment_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Environment_name_feature",
								"_UI_Environment_type"),
						DaprdesignerPackage.Literals.ENVIRONMENT__NAME, true, false, false,
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
			childrenFeatures.add(DaprdesignerPackage.Literals.ENVIRONMENT__NAMESPACE);
			childrenFeatures.add(DaprdesignerPackage.Literals.ENVIRONMENT__TRUSTDOMAIN);
			childrenFeatures.add(DaprdesignerPackage.Literals.ENVIRONMENT__BUILDINGBLOCKS);
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
	 * This returns Environment.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Environment"));
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
		String label = ((Environment) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Environment_type")
				: getString("_UI_Environment_type") + " " + label;
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

		switch (notification.getFeatureID(Environment.class)) {
		case DaprdesignerPackage.ENVIRONMENT__NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case DaprdesignerPackage.ENVIRONMENT__NAMESPACE:
		case DaprdesignerPackage.ENVIRONMENT__TRUSTDOMAIN:
		case DaprdesignerPackage.ENVIRONMENT__BUILDINGBLOCKS:
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

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.ENVIRONMENT__NAMESPACE,
				DaprdesignerFactory.eINSTANCE.createNamespace()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.ENVIRONMENT__TRUSTDOMAIN,
				DaprdesignerFactory.eINSTANCE.createTrustdomain()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.ENVIRONMENT__BUILDINGBLOCKS,
				DaprdesignerFactory.eINSTANCE.createServices()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.ENVIRONMENT__BUILDINGBLOCKS,
				DaprdesignerFactory.eINSTANCE.createPubSub()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.ENVIRONMENT__BUILDINGBLOCKS,
				DaprdesignerFactory.eINSTANCE.createBindings()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.ENVIRONMENT__BUILDINGBLOCKS,
				DaprdesignerFactory.eINSTANCE.createJobs()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.ENVIRONMENT__BUILDINGBLOCKS,
				DaprdesignerFactory.eINSTANCE.createConfiguration()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.ENVIRONMENT__BUILDINGBLOCKS,
				DaprdesignerFactory.eINSTANCE.createWorkflow()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.ENVIRONMENT__BUILDINGBLOCKS,
				DaprdesignerFactory.eINSTANCE.createActors()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.ENVIRONMENT__BUILDINGBLOCKS,
				DaprdesignerFactory.eINSTANCE.createSecrets()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.ENVIRONMENT__BUILDINGBLOCKS,
				DaprdesignerFactory.eINSTANCE.createStateManagement()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.ENVIRONMENT__BUILDINGBLOCKS,
				DaprdesignerFactory.eINSTANCE.createDistributedLocks()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.ENVIRONMENT__BUILDINGBLOCKS,
				DaprdesignerFactory.eINSTANCE.createCryptoGraphy()));
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
