/**
 */
package daprdesigner;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.Actor#getAdditionalHelp <em>Additional Help</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends App {

	/**
	 * Returns the value of the '<em><b>Additional Help</b></em>' attribute.
	 * The default value is <code>"https://docs.dapr.io/developing-applications/building-blocks/actors/actors-overview/"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Help</em>' attribute.
	 * @see daprdesigner.DaprdesignerPackage#getActor_AdditionalHelp()
	 * @model default="https://docs.dapr.io/developing-applications/building-blocks/actors/actors-overview/" changeable="false"
	 * @generated
	 */
	String getAdditionalHelp();
} // Actor
