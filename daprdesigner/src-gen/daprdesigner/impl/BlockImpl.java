/**
 */
package daprdesigner.impl;

import daprdesigner.Block;
import daprdesigner.BlockType;
import daprdesigner.DaprNode;
import daprdesigner.DaprdesignerPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.impl.BlockImpl#getName <em>Name</em>}</li>
 *   <li>{@link daprdesigner.impl.BlockImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link daprdesigner.impl.BlockImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link daprdesigner.impl.BlockImpl#getBlockType <em>Block Type</em>}</li>
 *   <li>{@link daprdesigner.impl.BlockImpl#getSubblocks <em>Subblocks</em>}</li>
 *   <li>{@link daprdesigner.impl.BlockImpl#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockImpl extends MinimalEObjectImpl.Container implements Block {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected String notes = NOTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlockType() <em>Block Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockType()
	 * @generated
	 * @ordered
	 */
	protected static final BlockType BLOCK_TYPE_EDEFAULT = BlockType.ENVIRONMENT;

	/**
	 * The cached value of the '{@link #getBlockType() <em>Block Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockType()
	 * @generated
	 * @ordered
	 */
	protected BlockType blockType = BLOCK_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubblocks() <em>Subblocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubblocks()
	 * @generated
	 * @ordered
	 */
	protected EList<Block> subblocks;

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
	protected BlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaprdesignerPackage.Literals.BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.BLOCK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.BLOCK__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotes(String newNotes) {
		String oldNotes = notes;
		notes = newNotes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.BLOCK__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockType getBlockType() {
		return blockType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockType(BlockType newBlockType) {
		BlockType oldBlockType = blockType;
		blockType = newBlockType == null ? BLOCK_TYPE_EDEFAULT : newBlockType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.BLOCK__BLOCK_TYPE, oldBlockType,
					blockType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Block> getSubblocks() {
		if (subblocks == null) {
			subblocks = new EObjectContainmentEList<Block>(Block.class, this, DaprdesignerPackage.BLOCK__SUBBLOCKS);
		}
		return subblocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DaprNode> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<DaprNode>(DaprNode.class, this, DaprdesignerPackage.BLOCK__NODES);
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
		case DaprdesignerPackage.BLOCK__SUBBLOCKS:
			return ((InternalEList<?>) getSubblocks()).basicRemove(otherEnd, msgs);
		case DaprdesignerPackage.BLOCK__NODES:
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
		case DaprdesignerPackage.BLOCK__NAME:
			return getName();
		case DaprdesignerPackage.BLOCK__DESCRIPTION:
			return getDescription();
		case DaprdesignerPackage.BLOCK__NOTES:
			return getNotes();
		case DaprdesignerPackage.BLOCK__BLOCK_TYPE:
			return getBlockType();
		case DaprdesignerPackage.BLOCK__SUBBLOCKS:
			return getSubblocks();
		case DaprdesignerPackage.BLOCK__NODES:
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
		case DaprdesignerPackage.BLOCK__NAME:
			setName((String) newValue);
			return;
		case DaprdesignerPackage.BLOCK__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case DaprdesignerPackage.BLOCK__NOTES:
			setNotes((String) newValue);
			return;
		case DaprdesignerPackage.BLOCK__BLOCK_TYPE:
			setBlockType((BlockType) newValue);
			return;
		case DaprdesignerPackage.BLOCK__SUBBLOCKS:
			getSubblocks().clear();
			getSubblocks().addAll((Collection<? extends Block>) newValue);
			return;
		case DaprdesignerPackage.BLOCK__NODES:
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
		case DaprdesignerPackage.BLOCK__NAME:
			setName(NAME_EDEFAULT);
			return;
		case DaprdesignerPackage.BLOCK__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case DaprdesignerPackage.BLOCK__NOTES:
			setNotes(NOTES_EDEFAULT);
			return;
		case DaprdesignerPackage.BLOCK__BLOCK_TYPE:
			setBlockType(BLOCK_TYPE_EDEFAULT);
			return;
		case DaprdesignerPackage.BLOCK__SUBBLOCKS:
			getSubblocks().clear();
			return;
		case DaprdesignerPackage.BLOCK__NODES:
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
		case DaprdesignerPackage.BLOCK__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case DaprdesignerPackage.BLOCK__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case DaprdesignerPackage.BLOCK__NOTES:
			return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
		case DaprdesignerPackage.BLOCK__BLOCK_TYPE:
			return blockType != BLOCK_TYPE_EDEFAULT;
		case DaprdesignerPackage.BLOCK__SUBBLOCKS:
			return subblocks != null && !subblocks.isEmpty();
		case DaprdesignerPackage.BLOCK__NODES:
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", notes: ");
		result.append(notes);
		result.append(", blockType: ");
		result.append(blockType);
		result.append(')');
		return result.toString();
	}

} //BlockImpl
