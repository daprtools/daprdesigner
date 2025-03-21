/**
 */
package daprdesigner.impl;

import daprdesigner.DaprNode;
import daprdesigner.DaprdesignerPackage;
import daprdesigner.NodeBlockType;
import daprdesigner.NodeBlocks;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Blocks</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.impl.NodeBlocksImpl#getRequiredFields <em>Required Fields</em>}</li>
 *   <li>{@link daprdesigner.impl.NodeBlocksImpl#getNodeBlockType <em>Node Block Type</em>}</li>
 *   <li>{@link daprdesigner.impl.NodeBlocksImpl#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeBlocksImpl extends DaprNodeImpl implements NodeBlocks {
	/**
	 * The default value of the '{@link #getRequiredFields() <em>Required Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredFields()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUIRED_FIELDS_EDEFAULT = "Name";

	/**
	 * The cached value of the '{@link #getRequiredFields() <em>Required Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredFields()
	 * @generated
	 * @ordered
	 */
	protected String requiredFields = REQUIRED_FIELDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNodeBlockType() <em>Node Block Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeBlockType()
	 * @generated
	 * @ordered
	 */
	protected static final NodeBlockType NODE_BLOCK_TYPE_EDEFAULT = NodeBlockType.ACTOR;

	/**
	 * The cached value of the '{@link #getNodeBlockType() <em>Node Block Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeBlockType()
	 * @generated
	 * @ordered
	 */
	protected NodeBlockType nodeBlockType = NODE_BLOCK_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<DaprNode> nodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeBlocksImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaprdesignerPackage.Literals.NODE_BLOCKS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRequiredFields() {
		return requiredFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeBlockType getNodeBlockType() {
		return nodeBlockType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeBlockType(NodeBlockType newNodeBlockType) {
		NodeBlockType oldNodeBlockType = nodeBlockType;
		nodeBlockType = newNodeBlockType == null ? NODE_BLOCK_TYPE_EDEFAULT : newNodeBlockType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.NODE_BLOCKS__NODE_BLOCK_TYPE,
					oldNodeBlockType, nodeBlockType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DaprNode> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<DaprNode>(DaprNode.class, this, DaprdesignerPackage.NODE_BLOCKS__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DaprdesignerPackage.NODE_BLOCKS__NODES:
			return ((InternalEList<?>) getNodes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DaprdesignerPackage.NODE_BLOCKS__REQUIRED_FIELDS:
			return getRequiredFields();
		case DaprdesignerPackage.NODE_BLOCKS__NODE_BLOCK_TYPE:
			return getNodeBlockType();
		case DaprdesignerPackage.NODE_BLOCKS__NODES:
			return getNodes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DaprdesignerPackage.NODE_BLOCKS__NODE_BLOCK_TYPE:
			setNodeBlockType((NodeBlockType) newValue);
			return;
		case DaprdesignerPackage.NODE_BLOCKS__NODES:
			getNodes().clear();
			getNodes().addAll((Collection<? extends DaprNode>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case DaprdesignerPackage.NODE_BLOCKS__NODE_BLOCK_TYPE:
			setNodeBlockType(NODE_BLOCK_TYPE_EDEFAULT);
			return;
		case DaprdesignerPackage.NODE_BLOCKS__NODES:
			getNodes().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case DaprdesignerPackage.NODE_BLOCKS__REQUIRED_FIELDS:
			return REQUIRED_FIELDS_EDEFAULT == null ? requiredFields != null
					: !REQUIRED_FIELDS_EDEFAULT.equals(requiredFields);
		case DaprdesignerPackage.NODE_BLOCKS__NODE_BLOCK_TYPE:
			return nodeBlockType != NODE_BLOCK_TYPE_EDEFAULT;
		case DaprdesignerPackage.NODE_BLOCKS__NODES:
			return nodes != null && !nodes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (requiredFields: ");
		result.append(requiredFields);
		result.append(", nodeBlockType: ");
		result.append(nodeBlockType);
		result.append(')');
		return result.toString();
	}

} //NodeBlocksImpl
