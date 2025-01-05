/**
 */
package daprdesigner;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.Environment#getName <em>Name</em>}</li>
 *   <li>{@link daprdesigner.Environment#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link daprdesigner.Environment#getTrustdomain <em>Trustdomain</em>}</li>
 *   <li>{@link daprdesigner.Environment#getBuildingblocks <em>Buildingblocks</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getEnvironment()
 * @model
 * @generated
 */
public interface Environment extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see daprdesigner.DaprdesignerPackage#getEnvironment_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link daprdesigner.Environment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' containment reference.
	 * @see #setNamespace(Namespace)
	 * @see daprdesigner.DaprdesignerPackage#getEnvironment_Namespace()
	 * @model containment="true"
	 * @generated
	 */
	Namespace getNamespace();

	/**
	 * Sets the value of the '{@link daprdesigner.Environment#getNamespace <em>Namespace</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' containment reference.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(Namespace value);

	/**
	 * Returns the value of the '<em><b>Trustdomain</b></em>' containment reference list.
	 * The list contents are of type {@link daprdesigner.Trustdomain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trustdomain</em>' containment reference list.
	 * @see daprdesigner.DaprdesignerPackage#getEnvironment_Trustdomain()
	 * @model containment="true"
	 * @generated
	 */
	EList<Trustdomain> getTrustdomain();

	/**
	 * Returns the value of the '<em><b>Buildingblocks</b></em>' containment reference list.
	 * The list contents are of type {@link daprdesigner.BuildingBlock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buildingblocks</em>' containment reference list.
	 * @see daprdesigner.DaprdesignerPackage#getEnvironment_Buildingblocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<BuildingBlock> getBuildingblocks();

} // Environment
