/**
 */
package daprdesigner;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Blocks</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.NodeBlocks#getRequiredFields <em>Required Fields</em>}</li>
 *   <li>{@link daprdesigner.NodeBlocks#getNodeBlockType <em>Node Block Type</em>}</li>
 *   <li>{@link daprdesigner.NodeBlocks#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getNodeBlocks()
 * @model
 * @generated
 */
public interface NodeBlocks extends DaprNode {
	/**
	 * Returns the value of the '<em><b>Required Fields</b></em>' attribute.
	 * The default value is <code>"Name"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Fields</em>' attribute.
	 * @see daprdesigner.DaprdesignerPackage#getNodeBlocks_RequiredFields()
	 * @model default="Name" changeable="false"
	 * @generated
	 */
	String getRequiredFields();

	/**
	 * Returns the value of the '<em><b>Node Block Type</b></em>' attribute.
	 * The literals are from the enumeration {@link daprdesigner.NodeBlockType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Block Type</em>' attribute.
	 * @see daprdesigner.NodeBlockType
	 * @see #setNodeBlockType(NodeBlockType)
	 * @see daprdesigner.DaprdesignerPackage#getNodeBlocks_NodeBlockType()
	 * @model
	 * @generated
	 */
	NodeBlockType getNodeBlockType();

	/**
	 * Sets the value of the '{@link daprdesigner.NodeBlocks#getNodeBlockType <em>Node Block Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Block Type</em>' attribute.
	 * @see daprdesigner.NodeBlockType
	 * @see #getNodeBlockType()
	 * @generated
	 */
	void setNodeBlockType(NodeBlockType value);

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link daprdesigner.DaprNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see daprdesigner.DaprdesignerPackage#getNodeBlocks_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DaprNode> getNodes();

} // NodeBlocks
