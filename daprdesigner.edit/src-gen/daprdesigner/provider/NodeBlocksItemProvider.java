/**
 */
package daprdesigner.provider;

import daprdesigner.DaprdesignerFactory;
import daprdesigner.DaprdesignerPackage;
import daprdesigner.NodeBlockType;
import daprdesigner.NodeBlocks;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link daprdesigner.NodeBlocks} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NodeBlocksItemProvider extends DaprNodeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeBlocksItemProvider(AdapterFactory adapterFactory) {
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

			addNodeBlockTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Node Block Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNodeBlockTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_NodeBlocks_nodeBlockType_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_NodeBlocks_nodeBlockType_feature",
								"_UI_NodeBlocks_type"),
						DaprdesignerPackage.Literals.NODE_BLOCKS__NODE_BLOCK_TYPE, true, false, false,
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
			childrenFeatures.add(DaprdesignerPackage.Literals.NODE_BLOCKS__NODES);
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
	 * This returns NodeBlocks.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	@Override
	public Object getImage(Object object) {
		NodeBlocks nb = (NodeBlocks) object;
		NodeBlockType nbt = nb.getNodeBlockType();
		switch (nbt) {
		case ACTOR:
			return overlayImage(object, getResourceLocator().getImage("full/obj16/Actor"));
		case BINDING:
			return overlayImage(object, getResourceLocator().getImage("full/obj16/Bindings"));
		case APP:
			return overlayImage(object, getResourceLocator().getImage("full/obj16/App2"));
		case CRYPTOGRAPHY:
			return overlayImage(object, getResourceLocator().getImage("full/obj16/Cryptography"));
		case DISTRIBUTEDLOCK:
			return overlayImage(object, getResourceLocator().getImage("full/obj16/Locks"));
		case HTTPENDPOINT:
			return overlayImage(object, getResourceLocator().getImage("full/obj16/HTTPEndPoint"));
		case PUBSUB:
			return overlayImage(object, getResourceLocator().getImage("full/obj16/PubSub"));
		case RESILIENCY:
			return overlayImage(object, getResourceLocator().getImage("full/obj16/ResiliencyConfiguration"));
		case SECRETSTORE:
			return overlayImage(object, getResourceLocator().getImage("full/obj16/SecretStore"));
		case STATESTORE:
			return overlayImage(object, getResourceLocator().getImage("full/obj16/StateStore"));
		case SUBSCRIPTION:
			return overlayImage(object, getResourceLocator().getImage("full/obj16/SubscriptionConfiguration"));
		case WORKFLOW:
			return overlayImage(object, getResourceLocator().getImage("full/obj16/Workflow"));
		case JOBS:
			return overlayImage(object, getResourceLocator().getImage("full/obj16/Jobs"));	
		case CONFIGURATIONSTORE:
			return overlayImage(object, getResourceLocator().getImage("full/obj16/ConfigurationStore"));	

		}
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NodeBlocks"));
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
		String label = ((NodeBlocks) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_NodeBlocks_type")
				: getString("_UI_NodeBlocks_type") + " " + label;
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

		switch (notification.getFeatureID(NodeBlocks.class)) {
		case DaprdesignerPackage.NODE_BLOCKS__NODE_BLOCK_TYPE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case DaprdesignerPackage.NODE_BLOCKS__NODES:
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

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.NODE_BLOCKS__NODES,
				DaprdesignerFactory.eINSTANCE.createNodeBlocks()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.NODE_BLOCKS__NODES,
				DaprdesignerFactory.eINSTANCE.createNamespace()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.NODE_BLOCKS__NODES,
				DaprdesignerFactory.eINSTANCE.createTrustdomain()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.NODE_BLOCKS__NODES,
				DaprdesignerFactory.eINSTANCE.createApp()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.NODE_BLOCKS__NODES,
				DaprdesignerFactory.eINSTANCE.createActor()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.NODE_BLOCKS__NODES,
				DaprdesignerFactory.eINSTANCE.createJobs()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.NODE_BLOCKS__NODES,
				DaprdesignerFactory.eINSTANCE.createWorkflow()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.NODE_BLOCKS__NODES,
				DaprdesignerFactory.eINSTANCE.createDeniedComponentsConfiguration()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.NODE_BLOCKS__NODES,
				DaprdesignerFactory.eINSTANCE.createLoggingConfiguration()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.NODE_BLOCKS__NODES,
				DaprdesignerFactory.eINSTANCE.createNameResolutionConfiguration()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.NODE_BLOCKS__NODES,
				DaprdesignerFactory.eINSTANCE.createSecretsAccessConfiguration()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.NODE_BLOCKS__NODES,
				DaprdesignerFactory.eINSTANCE.createSecretsAccessList()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.NODE_BLOCKS__NODES,
				DaprdesignerFactory.eINSTANCE.createMetricsConfiguration()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.NODE_BLOCKS__NODES,
				DaprdesignerFactory.eINSTANCE.createAPIAccessControl()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.NODE_BLOCKS__NODES,
				DaprdesignerFactory.eINSTANCE.createAPI()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.NODE_BLOCKS__NODES,
				DaprdesignerFactory.eINSTANCE.createAppAccessControl()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.NODE_BLOCKS__NODES,
				DaprdesignerFactory.eINSTANCE.createAppPolicy()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.NODE_BLOCKS__NODES,
				DaprdesignerFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.NODE_BLOCKS__NODES,
				DaprdesignerFactory.eINSTANCE.createMiddlewareConfiguration()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.NODE_BLOCKS__NODES,
				DaprdesignerFactory.eINSTANCE.createHttpHandler()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.NODE_BLOCKS__NODES,
				DaprdesignerFactory.eINSTANCE.createTracingConfiguration()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.NODE_BLOCKS__NODES,
				DaprdesignerFactory.eINSTANCE.createSubscriptionConfiguration()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.NODE_BLOCKS__NODES,
				DaprdesignerFactory.eINSTANCE.createRouteRules()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.NODE_BLOCKS__NODES,
				DaprdesignerFactory.eINSTANCE.createResiliencyConfiguration()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.NODE_BLOCKS__NODES,
				DaprdesignerFactory.eINSTANCE.createResiliencyPolicy()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.NODE_BLOCKS__NODES,
				DaprdesignerFactory.eINSTANCE.createRetryPolicy()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.NODE_BLOCKS__NODES,
				DaprdesignerFactory.eINSTANCE.createResiliencyTimeout()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.NODE_BLOCKS__NODES,
				DaprdesignerFactory.eINSTANCE.createCircuitBreakerPolicy()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.NODE_BLOCKS__NODES,
				DaprdesignerFactory.eINSTANCE.createResiliencyTarget()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.NODE_BLOCKS__NODES,
				DaprdesignerFactory.eINSTANCE.createHTTPEndPoint()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.NODE_BLOCKS__NODES,
				DaprdesignerFactory.eINSTANCE.createComponentSpec()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.NODE_BLOCKS__NODES,
				DaprdesignerFactory.eINSTANCE.createSpecMetadata()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.NODE_BLOCKS__NODES,
				DaprdesignerFactory.eINSTANCE.createPubSub()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.NODE_BLOCKS__NODES,
				DaprdesignerFactory.eINSTANCE.createBindings()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.NODE_BLOCKS__NODES,
				DaprdesignerFactory.eINSTANCE.createSecretStore()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.NODE_BLOCKS__NODES,
				DaprdesignerFactory.eINSTANCE.createStateStore()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.NODE_BLOCKS__NODES,
				DaprdesignerFactory.eINSTANCE.createConfigurationStore()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.NODE_BLOCKS__NODES,
				DaprdesignerFactory.eINSTANCE.createLocks()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.NODE_BLOCKS__NODES,
				DaprdesignerFactory.eINSTANCE.createCryptography()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.NODE_BLOCKS__NODES,
				DaprdesignerFactory.eINSTANCE.createMiddleware()));

		newChildDescriptors.add(createChildParameter(DaprdesignerPackage.Literals.NODE_BLOCKS__NODES,
				DaprdesignerFactory.eINSTANCE.createNameresolution()));
	}

}
