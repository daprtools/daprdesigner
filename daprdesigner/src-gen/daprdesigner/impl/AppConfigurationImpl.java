/**
 */
package daprdesigner.impl;

import daprdesigner.APIAccessControl;
import daprdesigner.AppAccessControl;
import daprdesigner.AppConfiguration;
import daprdesigner.DaprdesignerPackage;
import daprdesigner.LoggingConfiguration;
import daprdesigner.MetricsConfiguration;
import daprdesigner.MiddlewareConfiguration;
import daprdesigner.NameResolutionConfiguration;
import daprdesigner.Namespace;
import daprdesigner.SecretsConfiguration;
import daprdesigner.TracingConfiguration;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>App Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daprdesigner.impl.AppConfigurationImpl#getApiVersion <em>Api Version</em>}</li>
 *   <li>{@link daprdesigner.impl.AppConfigurationImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link daprdesigner.impl.AppConfigurationImpl#getMetadata_name <em>Metadata name</em>}</li>
 *   <li>{@link daprdesigner.impl.AppConfigurationImpl#getMetadata_namespace <em>Metadata namespace</em>}</li>
 *   <li>{@link daprdesigner.impl.AppConfigurationImpl#getAccessControl <em>Access Control</em>}</li>
 *   <li>{@link daprdesigner.impl.AppConfigurationImpl#getApiControl <em>Api Control</em>}</li>
 *   <li>{@link daprdesigner.impl.AppConfigurationImpl#getMiddlewareConfiguration <em>Middleware Configuration</em>}</li>
 *   <li>{@link daprdesigner.impl.AppConfigurationImpl#getLoggingConfiguration <em>Logging Configuration</em>}</li>
 *   <li>{@link daprdesigner.impl.AppConfigurationImpl#getNameResolutionConfiguration <em>Name Resolution Configuration</em>}</li>
 *   <li>{@link daprdesigner.impl.AppConfigurationImpl#getSecretsConfiguration <em>Secrets Configuration</em>}</li>
 *   <li>{@link daprdesigner.impl.AppConfigurationImpl#getMetricsConfiguration <em>Metrics Configuration</em>}</li>
 *   <li>{@link daprdesigner.impl.AppConfigurationImpl#getTracingConfiguration <em>Tracing Configuration</em>}</li>
 *   <li>{@link daprdesigner.impl.AppConfigurationImpl#getComponentsDenyList <em>Components Deny List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AppConfigurationImpl extends MinimalEObjectImpl.Container implements AppConfiguration {
	/**
	 * The default value of the '{@link #getApiVersion() <em>Api Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String API_VERSION_EDEFAULT = "dapr.io/v1alpha1";

	/**
	 * The cached value of the '{@link #getApiVersion() <em>Api Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiVersion()
	 * @generated
	 * @ordered
	 */
	protected String apiVersion = API_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final String KIND_EDEFAULT = "Configuration";

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected String kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetadata_name() <em>Metadata name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata_name()
	 * @generated
	 * @ordered
	 */
	protected static final String METADATA_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetadata_name() <em>Metadata name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata_name()
	 * @generated
	 * @ordered
	 */
	protected String metadata_name = METADATA_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMetadata_namespace() <em>Metadata namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata_namespace()
	 * @generated
	 * @ordered
	 */
	protected Namespace metadata_namespace;

	/**
	 * The cached value of the '{@link #getAccessControl() <em>Access Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessControl()
	 * @generated
	 * @ordered
	 */
	protected AppAccessControl accessControl;

	/**
	 * The cached value of the '{@link #getApiControl() <em>Api Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiControl()
	 * @generated
	 * @ordered
	 */
	protected APIAccessControl apiControl;

	/**
	 * The cached value of the '{@link #getMiddlewareConfiguration() <em>Middleware Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiddlewareConfiguration()
	 * @generated
	 * @ordered
	 */
	protected MiddlewareConfiguration middlewareConfiguration;

	/**
	 * The cached value of the '{@link #getLoggingConfiguration() <em>Logging Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoggingConfiguration()
	 * @generated
	 * @ordered
	 */
	protected LoggingConfiguration loggingConfiguration;

	/**
	 * The cached value of the '{@link #getNameResolutionConfiguration() <em>Name Resolution Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameResolutionConfiguration()
	 * @generated
	 * @ordered
	 */
	protected NameResolutionConfiguration nameResolutionConfiguration;

	/**
	 * The cached value of the '{@link #getSecretsConfiguration() <em>Secrets Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecretsConfiguration()
	 * @generated
	 * @ordered
	 */
	protected SecretsConfiguration secretsConfiguration;

	/**
	 * The cached value of the '{@link #getMetricsConfiguration() <em>Metrics Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetricsConfiguration()
	 * @generated
	 * @ordered
	 */
	protected MetricsConfiguration metricsConfiguration;

	/**
	 * The cached value of the '{@link #getTracingConfiguration() <em>Tracing Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTracingConfiguration()
	 * @generated
	 * @ordered
	 */
	protected TracingConfiguration tracingConfiguration;

	/**
	 * The cached value of the '{@link #getComponentsDenyList() <em>Components Deny List</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentsDenyList()
	 * @generated
	 * @ordered
	 */
	protected EList<String> componentsDenyList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaprdesignerPackage.Literals.APP_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApiVersion() {
		return apiVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetadata_name() {
		return metadata_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetadata_name(String newMetadata_name) {
		String oldMetadata_name = metadata_name;
		metadata_name = newMetadata_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.APP_CONFIGURATION__METADATA_NAME,
					oldMetadata_name, metadata_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getMetadata_namespace() {
		if (metadata_namespace != null && metadata_namespace.eIsProxy()) {
			InternalEObject oldMetadata_namespace = (InternalEObject) metadata_namespace;
			metadata_namespace = (Namespace) eResolveProxy(oldMetadata_namespace);
			if (metadata_namespace != oldMetadata_namespace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DaprdesignerPackage.APP_CONFIGURATION__METADATA_NAMESPACE, oldMetadata_namespace,
							metadata_namespace));
			}
		}
		return metadata_namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetMetadata_namespace() {
		return metadata_namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetadata_namespace(Namespace newMetadata_namespace) {
		Namespace oldMetadata_namespace = metadata_namespace;
		metadata_namespace = newMetadata_namespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.APP_CONFIGURATION__METADATA_NAMESPACE, oldMetadata_namespace,
					metadata_namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppAccessControl getAccessControl() {
		return accessControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccessControl(AppAccessControl newAccessControl, NotificationChain msgs) {
		AppAccessControl oldAccessControl = accessControl;
		accessControl = newAccessControl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.APP_CONFIGURATION__ACCESS_CONTROL, oldAccessControl, newAccessControl);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessControl(AppAccessControl newAccessControl) {
		if (newAccessControl != accessControl) {
			NotificationChain msgs = null;
			if (accessControl != null)
				msgs = ((InternalEObject) accessControl).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DaprdesignerPackage.APP_CONFIGURATION__ACCESS_CONTROL, null, msgs);
			if (newAccessControl != null)
				msgs = ((InternalEObject) newAccessControl).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DaprdesignerPackage.APP_CONFIGURATION__ACCESS_CONTROL, null, msgs);
			msgs = basicSetAccessControl(newAccessControl, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.APP_CONFIGURATION__ACCESS_CONTROL,
					newAccessControl, newAccessControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APIAccessControl getApiControl() {
		return apiControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApiControl(APIAccessControl newApiControl, NotificationChain msgs) {
		APIAccessControl oldApiControl = apiControl;
		apiControl = newApiControl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.APP_CONFIGURATION__API_CONTROL, oldApiControl, newApiControl);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiControl(APIAccessControl newApiControl) {
		if (newApiControl != apiControl) {
			NotificationChain msgs = null;
			if (apiControl != null)
				msgs = ((InternalEObject) apiControl).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DaprdesignerPackage.APP_CONFIGURATION__API_CONTROL, null, msgs);
			if (newApiControl != null)
				msgs = ((InternalEObject) newApiControl).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DaprdesignerPackage.APP_CONFIGURATION__API_CONTROL, null, msgs);
			msgs = basicSetApiControl(newApiControl, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaprdesignerPackage.APP_CONFIGURATION__API_CONTROL,
					newApiControl, newApiControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiddlewareConfiguration getMiddlewareConfiguration() {
		return middlewareConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMiddlewareConfiguration(MiddlewareConfiguration newMiddlewareConfiguration,
			NotificationChain msgs) {
		MiddlewareConfiguration oldMiddlewareConfiguration = middlewareConfiguration;
		middlewareConfiguration = newMiddlewareConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.APP_CONFIGURATION__MIDDLEWARE_CONFIGURATION, oldMiddlewareConfiguration,
					newMiddlewareConfiguration);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMiddlewareConfiguration(MiddlewareConfiguration newMiddlewareConfiguration) {
		if (newMiddlewareConfiguration != middlewareConfiguration) {
			NotificationChain msgs = null;
			if (middlewareConfiguration != null)
				msgs = ((InternalEObject) middlewareConfiguration).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DaprdesignerPackage.APP_CONFIGURATION__MIDDLEWARE_CONFIGURATION, null,
						msgs);
			if (newMiddlewareConfiguration != null)
				msgs = ((InternalEObject) newMiddlewareConfiguration).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DaprdesignerPackage.APP_CONFIGURATION__MIDDLEWARE_CONFIGURATION, null,
						msgs);
			msgs = basicSetMiddlewareConfiguration(newMiddlewareConfiguration, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.APP_CONFIGURATION__MIDDLEWARE_CONFIGURATION, newMiddlewareConfiguration,
					newMiddlewareConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoggingConfiguration getLoggingConfiguration() {
		return loggingConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoggingConfiguration(LoggingConfiguration newLoggingConfiguration,
			NotificationChain msgs) {
		LoggingConfiguration oldLoggingConfiguration = loggingConfiguration;
		loggingConfiguration = newLoggingConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.APP_CONFIGURATION__LOGGING_CONFIGURATION, oldLoggingConfiguration,
					newLoggingConfiguration);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoggingConfiguration(LoggingConfiguration newLoggingConfiguration) {
		if (newLoggingConfiguration != loggingConfiguration) {
			NotificationChain msgs = null;
			if (loggingConfiguration != null)
				msgs = ((InternalEObject) loggingConfiguration).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DaprdesignerPackage.APP_CONFIGURATION__LOGGING_CONFIGURATION, null,
						msgs);
			if (newLoggingConfiguration != null)
				msgs = ((InternalEObject) newLoggingConfiguration).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DaprdesignerPackage.APP_CONFIGURATION__LOGGING_CONFIGURATION, null,
						msgs);
			msgs = basicSetLoggingConfiguration(newLoggingConfiguration, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.APP_CONFIGURATION__LOGGING_CONFIGURATION, newLoggingConfiguration,
					newLoggingConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameResolutionConfiguration getNameResolutionConfiguration() {
		return nameResolutionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameResolutionConfiguration(
			NameResolutionConfiguration newNameResolutionConfiguration, NotificationChain msgs) {
		NameResolutionConfiguration oldNameResolutionConfiguration = nameResolutionConfiguration;
		nameResolutionConfiguration = newNameResolutionConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.APP_CONFIGURATION__NAME_RESOLUTION_CONFIGURATION,
					oldNameResolutionConfiguration, newNameResolutionConfiguration);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameResolutionConfiguration(NameResolutionConfiguration newNameResolutionConfiguration) {
		if (newNameResolutionConfiguration != nameResolutionConfiguration) {
			NotificationChain msgs = null;
			if (nameResolutionConfiguration != null)
				msgs = ((InternalEObject) nameResolutionConfiguration).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DaprdesignerPackage.APP_CONFIGURATION__NAME_RESOLUTION_CONFIGURATION,
						null, msgs);
			if (newNameResolutionConfiguration != null)
				msgs = ((InternalEObject) newNameResolutionConfiguration).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DaprdesignerPackage.APP_CONFIGURATION__NAME_RESOLUTION_CONFIGURATION,
						null, msgs);
			msgs = basicSetNameResolutionConfiguration(newNameResolutionConfiguration, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.APP_CONFIGURATION__NAME_RESOLUTION_CONFIGURATION,
					newNameResolutionConfiguration, newNameResolutionConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecretsConfiguration getSecretsConfiguration() {
		return secretsConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecretsConfiguration(SecretsConfiguration newSecretsConfiguration,
			NotificationChain msgs) {
		SecretsConfiguration oldSecretsConfiguration = secretsConfiguration;
		secretsConfiguration = newSecretsConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.APP_CONFIGURATION__SECRETS_CONFIGURATION, oldSecretsConfiguration,
					newSecretsConfiguration);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecretsConfiguration(SecretsConfiguration newSecretsConfiguration) {
		if (newSecretsConfiguration != secretsConfiguration) {
			NotificationChain msgs = null;
			if (secretsConfiguration != null)
				msgs = ((InternalEObject) secretsConfiguration).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DaprdesignerPackage.APP_CONFIGURATION__SECRETS_CONFIGURATION, null,
						msgs);
			if (newSecretsConfiguration != null)
				msgs = ((InternalEObject) newSecretsConfiguration).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DaprdesignerPackage.APP_CONFIGURATION__SECRETS_CONFIGURATION, null,
						msgs);
			msgs = basicSetSecretsConfiguration(newSecretsConfiguration, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.APP_CONFIGURATION__SECRETS_CONFIGURATION, newSecretsConfiguration,
					newSecretsConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricsConfiguration getMetricsConfiguration() {
		return metricsConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetricsConfiguration(MetricsConfiguration newMetricsConfiguration,
			NotificationChain msgs) {
		MetricsConfiguration oldMetricsConfiguration = metricsConfiguration;
		metricsConfiguration = newMetricsConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.APP_CONFIGURATION__METRICS_CONFIGURATION, oldMetricsConfiguration,
					newMetricsConfiguration);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetricsConfiguration(MetricsConfiguration newMetricsConfiguration) {
		if (newMetricsConfiguration != metricsConfiguration) {
			NotificationChain msgs = null;
			if (metricsConfiguration != null)
				msgs = ((InternalEObject) metricsConfiguration).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DaprdesignerPackage.APP_CONFIGURATION__METRICS_CONFIGURATION, null,
						msgs);
			if (newMetricsConfiguration != null)
				msgs = ((InternalEObject) newMetricsConfiguration).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DaprdesignerPackage.APP_CONFIGURATION__METRICS_CONFIGURATION, null,
						msgs);
			msgs = basicSetMetricsConfiguration(newMetricsConfiguration, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.APP_CONFIGURATION__METRICS_CONFIGURATION, newMetricsConfiguration,
					newMetricsConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracingConfiguration getTracingConfiguration() {
		return tracingConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTracingConfiguration(TracingConfiguration newTracingConfiguration,
			NotificationChain msgs) {
		TracingConfiguration oldTracingConfiguration = tracingConfiguration;
		tracingConfiguration = newTracingConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.APP_CONFIGURATION__TRACING_CONFIGURATION, oldTracingConfiguration,
					newTracingConfiguration);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTracingConfiguration(TracingConfiguration newTracingConfiguration) {
		if (newTracingConfiguration != tracingConfiguration) {
			NotificationChain msgs = null;
			if (tracingConfiguration != null)
				msgs = ((InternalEObject) tracingConfiguration).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DaprdesignerPackage.APP_CONFIGURATION__TRACING_CONFIGURATION, null,
						msgs);
			if (newTracingConfiguration != null)
				msgs = ((InternalEObject) newTracingConfiguration).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DaprdesignerPackage.APP_CONFIGURATION__TRACING_CONFIGURATION, null,
						msgs);
			msgs = basicSetTracingConfiguration(newTracingConfiguration, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.APP_CONFIGURATION__TRACING_CONFIGURATION, newTracingConfiguration,
					newTracingConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getComponentsDenyList() {
		if (componentsDenyList == null) {
			componentsDenyList = new EDataTypeUniqueEList<String>(String.class, this,
					DaprdesignerPackage.APP_CONFIGURATION__COMPONENTS_DENY_LIST);
		}
		return componentsDenyList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DaprdesignerPackage.APP_CONFIGURATION__ACCESS_CONTROL:
			return basicSetAccessControl(null, msgs);
		case DaprdesignerPackage.APP_CONFIGURATION__API_CONTROL:
			return basicSetApiControl(null, msgs);
		case DaprdesignerPackage.APP_CONFIGURATION__MIDDLEWARE_CONFIGURATION:
			return basicSetMiddlewareConfiguration(null, msgs);
		case DaprdesignerPackage.APP_CONFIGURATION__LOGGING_CONFIGURATION:
			return basicSetLoggingConfiguration(null, msgs);
		case DaprdesignerPackage.APP_CONFIGURATION__NAME_RESOLUTION_CONFIGURATION:
			return basicSetNameResolutionConfiguration(null, msgs);
		case DaprdesignerPackage.APP_CONFIGURATION__SECRETS_CONFIGURATION:
			return basicSetSecretsConfiguration(null, msgs);
		case DaprdesignerPackage.APP_CONFIGURATION__METRICS_CONFIGURATION:
			return basicSetMetricsConfiguration(null, msgs);
		case DaprdesignerPackage.APP_CONFIGURATION__TRACING_CONFIGURATION:
			return basicSetTracingConfiguration(null, msgs);
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
		case DaprdesignerPackage.APP_CONFIGURATION__API_VERSION:
			return getApiVersion();
		case DaprdesignerPackage.APP_CONFIGURATION__KIND:
			return getKind();
		case DaprdesignerPackage.APP_CONFIGURATION__METADATA_NAME:
			return getMetadata_name();
		case DaprdesignerPackage.APP_CONFIGURATION__METADATA_NAMESPACE:
			if (resolve)
				return getMetadata_namespace();
			return basicGetMetadata_namespace();
		case DaprdesignerPackage.APP_CONFIGURATION__ACCESS_CONTROL:
			return getAccessControl();
		case DaprdesignerPackage.APP_CONFIGURATION__API_CONTROL:
			return getApiControl();
		case DaprdesignerPackage.APP_CONFIGURATION__MIDDLEWARE_CONFIGURATION:
			return getMiddlewareConfiguration();
		case DaprdesignerPackage.APP_CONFIGURATION__LOGGING_CONFIGURATION:
			return getLoggingConfiguration();
		case DaprdesignerPackage.APP_CONFIGURATION__NAME_RESOLUTION_CONFIGURATION:
			return getNameResolutionConfiguration();
		case DaprdesignerPackage.APP_CONFIGURATION__SECRETS_CONFIGURATION:
			return getSecretsConfiguration();
		case DaprdesignerPackage.APP_CONFIGURATION__METRICS_CONFIGURATION:
			return getMetricsConfiguration();
		case DaprdesignerPackage.APP_CONFIGURATION__TRACING_CONFIGURATION:
			return getTracingConfiguration();
		case DaprdesignerPackage.APP_CONFIGURATION__COMPONENTS_DENY_LIST:
			return getComponentsDenyList();
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
		case DaprdesignerPackage.APP_CONFIGURATION__METADATA_NAME:
			setMetadata_name((String) newValue);
			return;
		case DaprdesignerPackage.APP_CONFIGURATION__METADATA_NAMESPACE:
			setMetadata_namespace((Namespace) newValue);
			return;
		case DaprdesignerPackage.APP_CONFIGURATION__ACCESS_CONTROL:
			setAccessControl((AppAccessControl) newValue);
			return;
		case DaprdesignerPackage.APP_CONFIGURATION__API_CONTROL:
			setApiControl((APIAccessControl) newValue);
			return;
		case DaprdesignerPackage.APP_CONFIGURATION__MIDDLEWARE_CONFIGURATION:
			setMiddlewareConfiguration((MiddlewareConfiguration) newValue);
			return;
		case DaprdesignerPackage.APP_CONFIGURATION__LOGGING_CONFIGURATION:
			setLoggingConfiguration((LoggingConfiguration) newValue);
			return;
		case DaprdesignerPackage.APP_CONFIGURATION__NAME_RESOLUTION_CONFIGURATION:
			setNameResolutionConfiguration((NameResolutionConfiguration) newValue);
			return;
		case DaprdesignerPackage.APP_CONFIGURATION__SECRETS_CONFIGURATION:
			setSecretsConfiguration((SecretsConfiguration) newValue);
			return;
		case DaprdesignerPackage.APP_CONFIGURATION__METRICS_CONFIGURATION:
			setMetricsConfiguration((MetricsConfiguration) newValue);
			return;
		case DaprdesignerPackage.APP_CONFIGURATION__TRACING_CONFIGURATION:
			setTracingConfiguration((TracingConfiguration) newValue);
			return;
		case DaprdesignerPackage.APP_CONFIGURATION__COMPONENTS_DENY_LIST:
			getComponentsDenyList().clear();
			getComponentsDenyList().addAll((Collection<? extends String>) newValue);
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
		case DaprdesignerPackage.APP_CONFIGURATION__METADATA_NAME:
			setMetadata_name(METADATA_NAME_EDEFAULT);
			return;
		case DaprdesignerPackage.APP_CONFIGURATION__METADATA_NAMESPACE:
			setMetadata_namespace((Namespace) null);
			return;
		case DaprdesignerPackage.APP_CONFIGURATION__ACCESS_CONTROL:
			setAccessControl((AppAccessControl) null);
			return;
		case DaprdesignerPackage.APP_CONFIGURATION__API_CONTROL:
			setApiControl((APIAccessControl) null);
			return;
		case DaprdesignerPackage.APP_CONFIGURATION__MIDDLEWARE_CONFIGURATION:
			setMiddlewareConfiguration((MiddlewareConfiguration) null);
			return;
		case DaprdesignerPackage.APP_CONFIGURATION__LOGGING_CONFIGURATION:
			setLoggingConfiguration((LoggingConfiguration) null);
			return;
		case DaprdesignerPackage.APP_CONFIGURATION__NAME_RESOLUTION_CONFIGURATION:
			setNameResolutionConfiguration((NameResolutionConfiguration) null);
			return;
		case DaprdesignerPackage.APP_CONFIGURATION__SECRETS_CONFIGURATION:
			setSecretsConfiguration((SecretsConfiguration) null);
			return;
		case DaprdesignerPackage.APP_CONFIGURATION__METRICS_CONFIGURATION:
			setMetricsConfiguration((MetricsConfiguration) null);
			return;
		case DaprdesignerPackage.APP_CONFIGURATION__TRACING_CONFIGURATION:
			setTracingConfiguration((TracingConfiguration) null);
			return;
		case DaprdesignerPackage.APP_CONFIGURATION__COMPONENTS_DENY_LIST:
			getComponentsDenyList().clear();
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
		case DaprdesignerPackage.APP_CONFIGURATION__API_VERSION:
			return API_VERSION_EDEFAULT == null ? apiVersion != null : !API_VERSION_EDEFAULT.equals(apiVersion);
		case DaprdesignerPackage.APP_CONFIGURATION__KIND:
			return KIND_EDEFAULT == null ? kind != null : !KIND_EDEFAULT.equals(kind);
		case DaprdesignerPackage.APP_CONFIGURATION__METADATA_NAME:
			return METADATA_NAME_EDEFAULT == null ? metadata_name != null
					: !METADATA_NAME_EDEFAULT.equals(metadata_name);
		case DaprdesignerPackage.APP_CONFIGURATION__METADATA_NAMESPACE:
			return metadata_namespace != null;
		case DaprdesignerPackage.APP_CONFIGURATION__ACCESS_CONTROL:
			return accessControl != null;
		case DaprdesignerPackage.APP_CONFIGURATION__API_CONTROL:
			return apiControl != null;
		case DaprdesignerPackage.APP_CONFIGURATION__MIDDLEWARE_CONFIGURATION:
			return middlewareConfiguration != null;
		case DaprdesignerPackage.APP_CONFIGURATION__LOGGING_CONFIGURATION:
			return loggingConfiguration != null;
		case DaprdesignerPackage.APP_CONFIGURATION__NAME_RESOLUTION_CONFIGURATION:
			return nameResolutionConfiguration != null;
		case DaprdesignerPackage.APP_CONFIGURATION__SECRETS_CONFIGURATION:
			return secretsConfiguration != null;
		case DaprdesignerPackage.APP_CONFIGURATION__METRICS_CONFIGURATION:
			return metricsConfiguration != null;
		case DaprdesignerPackage.APP_CONFIGURATION__TRACING_CONFIGURATION:
			return tracingConfiguration != null;
		case DaprdesignerPackage.APP_CONFIGURATION__COMPONENTS_DENY_LIST:
			return componentsDenyList != null && !componentsDenyList.isEmpty();
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
		result.append(" (apiVersion: ");
		result.append(apiVersion);
		result.append(", kind: ");
		result.append(kind);
		result.append(", metadata_name: ");
		result.append(metadata_name);
		result.append(", componentsDenyList: ");
		result.append(componentsDenyList);
		result.append(')');
		return result.toString();
	}

} //AppConfigurationImpl
