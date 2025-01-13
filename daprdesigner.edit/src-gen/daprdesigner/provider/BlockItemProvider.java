/**
 */
package daprdesigner.provider;

import daprdesigner.Block;
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
 * This is the item provider adapter for a {@link daprdesigner.Block} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BlockItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockItemProvider(AdapterFactory adapterFactory) {
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
			addDescriptionPropertyDescriptor(object);
			addNotesPropertyDescriptor(object);
			addBlockTypePropertyDescriptor(object);
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
						getResourceLocator(), getString("_UI_Block_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Block_name_feature", "_UI_Block_type"),
						DaprdesignerPackage.Literals.BLOCK__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Block_description_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Block_description_feature",
								"_UI_Block_type"),
						DaprdesignerPackage.Literals.BLOCK__DESCRIPTION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Notes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNotesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Block_notes_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Block_notes_feature", "_UI_Block_type"),
						DaprdesignerPackage.Literals.BLOCK__NOTES, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Block Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBlockTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Block_blockType_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Block_blockType_feature",
								"_UI_Block_type"),
						DaprdesignerPackage.Literals.BLOCK__BLOCK_TYPE, true, false, false,
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
			childrenFeatures.add(DaprdesignerPackage.Literals.BLOCK__SUBBLOCKS);
			childrenFeatures.add(DaprdesignerPackage.Literals.BLOCK__NODES);
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
	 * This returns Block.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Block"));
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
		String label = ((Block) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Block_type")
				: getString("_UI_Block_type") + " " + label;
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

		switch (notification.getFeatureID(Block.class)) {
		case DaprdesignerPackage.BLOCK__NAME:
		case DaprdesignerPackage.BLOCK__DESCRIPTION:
		case DaprdesignerPackage.BLOCK__NOTES:
		case DaprdesignerPackage.BLOCK__BLOCK_TYPE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case DaprdesignerPackage.BLOCK__SUBBLOCKS:
		case DaprdesignerPackage.BLOCK__NODES:
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

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.BLOCK__SUBBLOCKS,
				DaprdesignerFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.BLOCK__NODES,
				DaprdesignerFactory.eINSTANCE.createNamespace()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.BLOCK__NODES,
				DaprdesignerFactory.eINSTANCE.createTrustdomain()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.BLOCK__NODES,
				DaprdesignerFactory.eINSTANCE.createApp()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.BLOCK__NODES,
				DaprdesignerFactory.eINSTANCE.createDeniedComponentsConfiguration()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.BLOCK__NODES,
				DaprdesignerFactory.eINSTANCE.createLoggingConfiguration()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.BLOCK__NODES,
				DaprdesignerFactory.eINSTANCE.createNameResolutionConfiguration()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.BLOCK__NODES,
				DaprdesignerFactory.eINSTANCE.createSecretsAccessConfiguration()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.BLOCK__NODES,
				DaprdesignerFactory.eINSTANCE.createSecretsAccessList()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.BLOCK__NODES,
				DaprdesignerFactory.eINSTANCE.createMetricsConfiguration()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.BLOCK__NODES,
				DaprdesignerFactory.eINSTANCE.createAPIAccessControl()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.BLOCK__NODES,
				DaprdesignerFactory.eINSTANCE.createAPI()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.BLOCK__NODES,
				DaprdesignerFactory.eINSTANCE.createAppAccessControl()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.BLOCK__NODES,
				DaprdesignerFactory.eINSTANCE.createAppPolicy()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.BLOCK__NODES,
				DaprdesignerFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.BLOCK__NODES,
				DaprdesignerFactory.eINSTANCE.createMiddlewareConfiguration()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.BLOCK__NODES,
				DaprdesignerFactory.eINSTANCE.createHttpHandler()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.BLOCK__NODES,
				DaprdesignerFactory.eINSTANCE.createTracingConfiguration()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.BLOCK__NODES,
				DaprdesignerFactory.eINSTANCE.createSubscriptionConfiguration()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.BLOCK__NODES,
				DaprdesignerFactory.eINSTANCE.createRouteRules()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.BLOCK__NODES,
				DaprdesignerFactory.eINSTANCE.createResiliencyConfiguration()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.BLOCK__NODES,
				DaprdesignerFactory.eINSTANCE.createResiliencyPolicy()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.BLOCK__NODES,
				DaprdesignerFactory.eINSTANCE.createRetryPolicy()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.BLOCK__NODES,
				DaprdesignerFactory.eINSTANCE.createResiliencyTimeout()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.BLOCK__NODES,
				DaprdesignerFactory.eINSTANCE.createCircuitBreakerPolicy()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.BLOCK__NODES,
				DaprdesignerFactory.eINSTANCE.createResiliencyTarget()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.BLOCK__NODES,
				DaprdesignerFactory.eINSTANCE.createHTTPEndPoint()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.BLOCK__NODES,
				DaprdesignerFactory.eINSTANCE.createComponentSpec()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.BLOCK__NODES,
				DaprdesignerFactory.eINSTANCE.createSpecMetadata()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.BLOCK__NODES,
				DaprdesignerFactory.eINSTANCE.createHashicorpVault()));
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
