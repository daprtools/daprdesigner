/**
 */
package daprdesigner.impl;

import daprdesigner.AccessAction;
import daprdesigner.DaprdesignerPackage;
import daprdesigner.Operation;
import daprdesigner.Protocol;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.impl.OperationImpl#getHelp <em>Help</em>}</li>
 *   <li>{@link daprdesigner.impl.OperationImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link daprdesigner.impl.OperationImpl#getOperationName <em>Operation Name</em>}</li>
 *   <li>{@link daprdesigner.impl.OperationImpl#isApplyToGet <em>Apply To Get</em>}</li>
 *   <li>{@link daprdesigner.impl.OperationImpl#isApplyToPost <em>Apply To Post</em>}</li>
 *   <li>{@link daprdesigner.impl.OperationImpl#isApplyToPut <em>Apply To Put</em>}</li>
 *   <li>{@link daprdesigner.impl.OperationImpl#isApplyToDelete <em>Apply To Delete</em>}</li>
 *   <li>{@link daprdesigner.impl.OperationImpl#isApplyToPatch <em>Apply To Patch</em>}</li>
 *   <li>{@link daprdesigner.impl.OperationImpl#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationImpl extends DaprNodeImpl implements Operation {
	/**
	 * The default value of the '{@link #getHelp() <em>Help</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelp()
	 * @generated
	 * @ordered
	 */
	protected static final String HELP_EDEFAULT = "https://docs.dapr.io/operations/configuration/invoke-allowlist/#operations";

	/**
	 * The cached value of the '{@link #getHelp() <em>Help</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelp()
	 * @generated
	 * @ordered
	 */
	protected String help = HELP_EDEFAULT;

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
	 * The default value of the '{@link #isApplyToGet() <em>Apply To Get</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplyToGet()
	 * @generated
	 * @ordered
	 */
	protected static final boolean APPLY_TO_GET_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isApplyToGet() <em>Apply To Get</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplyToGet()
	 * @generated
	 * @ordered
	 */
	protected boolean applyToGet = APPLY_TO_GET_EDEFAULT;

	/**
	 * The default value of the '{@link #isApplyToPost() <em>Apply To Post</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplyToPost()
	 * @generated
	 * @ordered
	 */
	protected static final boolean APPLY_TO_POST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isApplyToPost() <em>Apply To Post</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplyToPost()
	 * @generated
	 * @ordered
	 */
	protected boolean applyToPost = APPLY_TO_POST_EDEFAULT;

	/**
	 * The default value of the '{@link #isApplyToPut() <em>Apply To Put</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplyToPut()
	 * @generated
	 * @ordered
	 */
	protected static final boolean APPLY_TO_PUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isApplyToPut() <em>Apply To Put</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplyToPut()
	 * @generated
	 * @ordered
	 */
	protected boolean applyToPut = APPLY_TO_PUT_EDEFAULT;

	/**
	 * The default value of the '{@link #isApplyToDelete() <em>Apply To Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplyToDelete()
	 * @generated
	 * @ordered
	 */
	protected static final boolean APPLY_TO_DELETE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isApplyToDelete() <em>Apply To Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplyToDelete()
	 * @generated
	 * @ordered
	 */
	protected boolean applyToDelete = APPLY_TO_DELETE_EDEFAULT;

	/**
	 * The default value of the '{@link #isApplyToPatch() <em>Apply To Patch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplyToPatch()
	 * @generated
	 * @ordered
	 */
	protected static final boolean APPLY_TO_PATCH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isApplyToPatch() <em>Apply To Patch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplyToPatch()
	 * @generated
	 * @ordered
	 */
	protected boolean applyToPatch = APPLY_TO_PATCH_EDEFAULT;

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
	public boolean isApplyToGet() {
		return applyToGet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplyToGet(boolean newApplyToGet) {
		boolean oldApplyToGet = applyToGet;
		applyToGet = newApplyToGet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.OPERATION__APPLY_TO_GET,
					oldApplyToGet, applyToGet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplyToPost() {
		return applyToPost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplyToPost(boolean newApplyToPost) {
		boolean oldApplyToPost = applyToPost;
		applyToPost = newApplyToPost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.OPERATION__APPLY_TO_POST,
					oldApplyToPost, applyToPost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplyToPut() {
		return applyToPut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplyToPut(boolean newApplyToPut) {
		boolean oldApplyToPut = applyToPut;
		applyToPut = newApplyToPut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.OPERATION__APPLY_TO_PUT,
					oldApplyToPut, applyToPut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplyToDelete() {
		return applyToDelete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplyToDelete(boolean newApplyToDelete) {
		boolean oldApplyToDelete = applyToDelete;
		applyToDelete = newApplyToDelete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.OPERATION__APPLY_TO_DELETE,
					oldApplyToDelete, applyToDelete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplyToPatch() {
		return applyToPatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplyToPatch(boolean newApplyToPatch) {
		boolean oldApplyToPatch = applyToPatch;
		applyToPatch = newApplyToPatch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.OPERATION__APPLY_TO_PATCH,
					oldApplyToPatch, applyToPatch));
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
	public String getHelp() {
		return help;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DaprdesignerPackage.OPERATION__HELP:
			return getHelp();
		case DaprdesignerPackage.OPERATION__PROTOCOL:
			return getProtocol();
		case DaprdesignerPackage.OPERATION__OPERATION_NAME:
			return getOperationName();
		case DaprdesignerPackage.OPERATION__APPLY_TO_GET:
			return isApplyToGet();
		case DaprdesignerPackage.OPERATION__APPLY_TO_POST:
			return isApplyToPost();
		case DaprdesignerPackage.OPERATION__APPLY_TO_PUT:
			return isApplyToPut();
		case DaprdesignerPackage.OPERATION__APPLY_TO_DELETE:
			return isApplyToDelete();
		case DaprdesignerPackage.OPERATION__APPLY_TO_PATCH:
			return isApplyToPatch();
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

	//@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DaprdesignerPackage.OPERATION__PROTOCOL:
			setProtocol((Protocol) newValue);
			return;
		case DaprdesignerPackage.OPERATION__OPERATION_NAME:
			setOperationName((String) newValue);
			return;
		case DaprdesignerPackage.OPERATION__APPLY_TO_GET:
			setApplyToGet((Boolean) newValue);
			return;
		case DaprdesignerPackage.OPERATION__APPLY_TO_POST:
			setApplyToPost((Boolean) newValue);
			return;
		case DaprdesignerPackage.OPERATION__APPLY_TO_PUT:
			setApplyToPut((Boolean) newValue);
			return;
		case DaprdesignerPackage.OPERATION__APPLY_TO_DELETE:
			setApplyToDelete((Boolean) newValue);
			return;
		case DaprdesignerPackage.OPERATION__APPLY_TO_PATCH:
			setApplyToPatch((Boolean) newValue);
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
		case DaprdesignerPackage.OPERATION__APPLY_TO_GET:
			setApplyToGet(APPLY_TO_GET_EDEFAULT);
			return;
		case DaprdesignerPackage.OPERATION__APPLY_TO_POST:
			setApplyToPost(APPLY_TO_POST_EDEFAULT);
			return;
		case DaprdesignerPackage.OPERATION__APPLY_TO_PUT:
			setApplyToPut(APPLY_TO_PUT_EDEFAULT);
			return;
		case DaprdesignerPackage.OPERATION__APPLY_TO_DELETE:
			setApplyToDelete(APPLY_TO_DELETE_EDEFAULT);
			return;
		case DaprdesignerPackage.OPERATION__APPLY_TO_PATCH:
			setApplyToPatch(APPLY_TO_PATCH_EDEFAULT);
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
		case DaprdesignerPackage.OPERATION__HELP:
			return HELP_EDEFAULT == null ? help != null : !HELP_EDEFAULT.equals(help);
		case DaprdesignerPackage.OPERATION__PROTOCOL:
			return protocol != PROTOCOL_EDEFAULT;
		case DaprdesignerPackage.OPERATION__OPERATION_NAME:
			return OPERATION_NAME_EDEFAULT == null ? operationName != null
					: !OPERATION_NAME_EDEFAULT.equals(operationName);
		case DaprdesignerPackage.OPERATION__APPLY_TO_GET:
			return applyToGet != APPLY_TO_GET_EDEFAULT;
		case DaprdesignerPackage.OPERATION__APPLY_TO_POST:
			return applyToPost != APPLY_TO_POST_EDEFAULT;
		case DaprdesignerPackage.OPERATION__APPLY_TO_PUT:
			return applyToPut != APPLY_TO_PUT_EDEFAULT;
		case DaprdesignerPackage.OPERATION__APPLY_TO_DELETE:
			return applyToDelete != APPLY_TO_DELETE_EDEFAULT;
		case DaprdesignerPackage.OPERATION__APPLY_TO_PATCH:
			return applyToPatch != APPLY_TO_PATCH_EDEFAULT;
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
		result.append(" (help: ");
		result.append(help);
		result.append(", protocol: ");
		result.append(protocol);
		result.append(", operationName: ");
		result.append(operationName);
		result.append(", applyToGet: ");
		result.append(applyToGet);
		result.append(", applyToPost: ");
		result.append(applyToPost);
		result.append(", applyToPut: ");
		result.append(applyToPut);
		result.append(", applyToDelete: ");
		result.append(applyToDelete);
		result.append(", applyToPatch: ");
		result.append(applyToPatch);
		result.append(", action: ");
		result.append(action);
		result.append(')');
		return result.toString();
	}

} //OperationImpl
