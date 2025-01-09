/**
 */
package daprdesigner;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Services</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.Services#getName <em>Name</em>}</li>
 *   <li>{@link daprdesigner.Services#getApps <em>Apps</em>}</li>
 * </ul>
 *
 * @see daprdesigner.DaprdesignerPackage#getServices()
 * @model
 * @generated
 */
public interface Services extends BuildingBlock {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Services Group"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see daprdesigner.DaprdesignerPackage#getServices_Name()
	 * @model default="Services Group" changeable="false"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Apps</b></em>' reference list.
	 * The list contents are of type {@link daprdesigner.App}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apps</em>' reference list.
	 * @see daprdesigner.DaprdesignerPackage#getServices_Apps()
	 * @model
	 * @generated
	 */
	EList<App> getApps();

} // Services
