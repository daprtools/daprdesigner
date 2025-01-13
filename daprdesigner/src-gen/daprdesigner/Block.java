/**
 */
package daprdesigner;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.Block#getName <em>Name</em>}</li>
 *   <li>{@link daprdesigner.Block#getDescription <em>Description</em>}</li>
 *   <li>{@link daprdesigner.Block#getNotes <em>Notes</em>}</li>
 *   <li>{@link daprdesigner.Block#getBlockType <em>Block Type</em>}</li>
 *   <li>{@link daprdesigner.Block#getSubblocks <em>Subblocks</em>}</li>
 *   <li>{@link daprdesigner.Block#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see daprdesigner.DaprdesignerPackage#getBlock_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link daprdesigner.Block#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see daprdesigner.DaprdesignerPackage#getBlock_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link daprdesigner.Block#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' attribute.
	 * @see #setNotes(String)
	 * @see daprdesigner.DaprdesignerPackage#getBlock_Notes()
	 * @model
	 * @generated
	 */
	String getNotes();

	/**
	 * Sets the value of the '{@link daprdesigner.Block#getNotes <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' attribute.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(String value);

	/**
	 * Returns the value of the '<em><b>Block Type</b></em>' attribute.
	 * The literals are from the enumeration {@link daprdesigner.BlockType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Type</em>' attribute.
	 * @see daprdesigner.BlockType
	 * @see #setBlockType(BlockType)
	 * @see daprdesigner.DaprdesignerPackage#getBlock_BlockType()
	 * @model
	 * @generated
	 */
	BlockType getBlockType();

	/**
	 * Sets the value of the '{@link daprdesigner.Block#getBlockType <em>Block Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Type</em>' attribute.
	 * @see daprdesigner.BlockType
	 * @see #getBlockType()
	 * @generated
	 */
	void setBlockType(BlockType value);

	/**
	 * Returns the value of the '<em><b>Subblocks</b></em>' containment reference list.
	 * The list contents are of type {@link daprdesigner.Block}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subblocks</em>' containment reference list.
	 * @see daprdesigner.DaprdesignerPackage#getBlock_Subblocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Block> getSubblocks();

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link daprdesigner.DaprNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see daprdesigner.DaprdesignerPackage#getBlock_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DaprNode> getNodes();

} // Block
