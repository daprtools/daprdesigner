/**
 */
package daprdesigner;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pub Sub</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.PubSub#getName <em>Name</em>}</li>
 *   <li>{@link daprdesigner.PubSub#getMbrokers <em>Mbrokers</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getPubSub()
 * @model
 * @generated
 */
public interface PubSub extends BuildingBlock {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Message Brokers"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see daprdesigner.DaprdesignerPackage#getPubSub_Name()
	 * @model default="Message Brokers" changeable="false"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Mbrokers</b></em>' reference list.
	 * The list contents are of type {@link daprdesigner.MessageBroker}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mbrokers</em>' reference list.
	 * @see daprdesigner.DaprdesignerPackage#getPubSub_Mbrokers()
	 * @model
	 * @generated
	 */
	EList<MessageBroker> getMbrokers();

} // PubSub
