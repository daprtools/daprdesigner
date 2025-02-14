/**
 */
package daprdesigner.provider;

import daprdesigner.DaprdesignerPackage;
import daprdesigner.Operation;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link daprdesigner.Operation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OperationItemProvider extends DaprNodeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationItemProvider(AdapterFactory adapterFactory) {
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
			addProtocolPropertyDescriptor(object);
			addOperationNamePropertyDescriptor(object);
			addApplyToGetPropertyDescriptor(object);
			addApplyToPostPropertyDescriptor(object);
			addApplyToPutPropertyDescriptor(object);
			addApplyToDeletePropertyDescriptor(object);
			addApplyToPatchPropertyDescriptor(object);
			addActionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Protocol feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProtocolPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Operation_protocol_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Operation_protocol_feature",
								"_UI_Operation_type"),
						DaprdesignerPackage.Literals.OPERATION__PROTOCOL, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Operation Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperationNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Operation_operationName_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Operation_operationName_feature",
								"_UI_Operation_type"),
						DaprdesignerPackage.Literals.OPERATION__OPERATION_NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Apply To Get feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addApplyToGetPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Operation_applyToGet_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Operation_applyToGet_feature",
								"_UI_Operation_type"),
						DaprdesignerPackage.Literals.OPERATION__APPLY_TO_GET, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Apply To Post feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addApplyToPostPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Operation_applyToPost_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Operation_applyToPost_feature",
								"_UI_Operation_type"),
						DaprdesignerPackage.Literals.OPERATION__APPLY_TO_POST, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Apply To Put feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addApplyToPutPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Operation_applyToPut_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Operation_applyToPut_feature",
								"_UI_Operation_type"),
						DaprdesignerPackage.Literals.OPERATION__APPLY_TO_PUT, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Apply To Delete feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addApplyToDeletePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Operation_applyToDelete_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Operation_applyToDelete_feature",
								"_UI_Operation_type"),
						DaprdesignerPackage.Literals.OPERATION__APPLY_TO_DELETE, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Apply To Patch feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addApplyToPatchPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Operation_applyToPatch_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Operation_applyToPatch_feature",
								"_UI_Operation_type"),
						DaprdesignerPackage.Literals.OPERATION__APPLY_TO_PATCH, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Operation_action_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Operation_action_feature",
								"_UI_Operation_type"),
						DaprdesignerPackage.Literals.OPERATION__ACTION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_Operation_help_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Operation_help_feature",
								"_UI_Operation_type"),
						DaprdesignerPackage.Literals.OPERATION__HELP, false, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns Operation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Operation"));
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
		String label = ((Operation) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Operation_type")
				: getString("_UI_Operation_type") + " " + label;
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

		switch (notification.getFeatureID(Operation.class)) {
		case DaprdesignerPackage.OPERATION__HELP:
		case DaprdesignerPackage.OPERATION__PROTOCOL:
		case DaprdesignerPackage.OPERATION__OPERATION_NAME:
		case DaprdesignerPackage.OPERATION__APPLY_TO_GET:
		case DaprdesignerPackage.OPERATION__APPLY_TO_POST:
		case DaprdesignerPackage.OPERATION__APPLY_TO_PUT:
		case DaprdesignerPackage.OPERATION__APPLY_TO_DELETE:
		case DaprdesignerPackage.OPERATION__APPLY_TO_PATCH:
		case DaprdesignerPackage.OPERATION__ACTION:
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
