/**
 */
package daprdesigner.impl;

import daprdesigner.AccessAction;
import daprdesigner.DaprdesignerPackage;
import daprdesigner.Operation;
import daprdesigner.Protocol;
import daprdesigner.Verb;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.impl.OperationImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link daprdesigner.impl.OperationImpl#getOperationName <em>Operation Name</em>}</li>
 *   <li>{@link daprdesigner.impl.OperationImpl#getVerbs <em>Verbs</em>}</li>
 *   <li>{@link daprdesigner.impl.OperationImpl#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationImpl extends DaprNodeImpl implements Operation {
	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final Protocol PROTOCOL_EDEFAULT = Protocol.HTTP;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected Protocol protocol = PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperationName() <em>Operation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationName()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperationName() <em>Operation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationName()
	 * @generated
	 * @ordered
	 */
	protected String operationName = OPERATION_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVerbs() <em>Verbs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerbs()
	 * @generated
	 * @ordered
	 */
	protected EList<Verb> verbs;

	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final AccessAction ACTION_EDEFAULT = AccessAction.ALLOW;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected AccessAction action = ACTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaprdesignerPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Protocol getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(Protocol newProtocol) {
		Protocol oldProtocol = protocol;
		protocol = newProtocol == null ? PROTOCOL_EDEFAULT : newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.OPERATION__PROTOCOL, oldProtocol,
					protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperationName() {
		return operationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationName(String newOperationName) {
		String oldOperationName = operationName;
		operationName = newOperationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.OPERATION__OPERATION_NAME,
					oldOperationName, operationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Verb> getVerbs() {
		if (verbs == null) {
			verbs = new EDataTypeUniqueEList<Verb>(Verb.class, this, DaprdesignerPackage.OPERATION__VERBS);
		}
		return verbs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessAction getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(AccessAction newAction) {
		AccessAction oldAction = action;
		action = newAction == null ? ACTION_EDEFAULT : newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.OPERATION__ACTION, oldAction,
					action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DaprdesignerPackage.OPERATION__PROTOCOL:
			return getProtocol();
		case DaprdesignerPackage.OPERATION__OPERATION_NAME:
			return getOperationName();
		case DaprdesignerPackage.OPERATION__VERBS:
			return getVerbs();
		case DaprdesignerPackage.OPERATION__ACTION:
			return getAction();
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
		case DaprdesignerPackage.OPERATION__PROTOCOL:
			setProtocol((Protocol) newValue);
			return;
		case DaprdesignerPackage.OPERATION__OPERATION_NAME:
			setOperationName((String) newValue);
			return;
		case DaprdesignerPackage.OPERATION__VERBS:
			getVerbs().clear();
			getVerbs().addAll((Collection<? extends Verb>) newValue);
			return;
		case DaprdesignerPackage.OPERATION__ACTION:
			setAction((AccessAction) newValue);
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
		case DaprdesignerPackage.OPERATION__PROTOCOL:
			setProtocol(PROTOCOL_EDEFAULT);
			return;
		case DaprdesignerPackage.OPERATION__OPERATION_NAME:
			setOperationName(OPERATION_NAME_EDEFAULT);
			return;
		case DaprdesignerPackage.OPERATION__VERBS:
			getVerbs().clear();
			return;
		case DaprdesignerPackage.OPERATION__ACTION:
			setAction(ACTION_EDEFAULT);
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
		case DaprdesignerPackage.OPERATION__PROTOCOL:
			return protocol != PROTOCOL_EDEFAULT;
		case DaprdesignerPackage.OPERATION__OPERATION_NAME:
			return OPERATION_NAME_EDEFAULT == null ? operationName != null
					: !OPERATION_NAME_EDEFAULT.equals(operationName);
		case DaprdesignerPackage.OPERATION__VERBS:
			return verbs != null && !verbs.isEmpty();
		case DaprdesignerPackage.OPERATION__ACTION:
			return action != ACTION_EDEFAULT;
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
		result.append(" (protocol: ");
		result.append(protocol);
		result.append(", operationName: ");
		result.append(operationName);
		result.append(", verbs: ");
		result.append(verbs);
		result.append(", action: ");
		result.append(action);
		result.append(')');
		return result.toString();
	}

} //OperationImpl
