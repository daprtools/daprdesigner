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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

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
public abstract class AppConfigurationImpl extends DaprNodeImpl implements AppConfiguration {
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
	 * The cached value of the '{@link #getMetadata_namespace() <em>Metadata namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata_namespace()
	 * @generated
	 * @ordered
	 */
	protected Namespace metadata_namespace;

	/**
	 * The cached value of the '{@link #getAccessControl() <em>Access Control</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessControl()
	 * @generated
	 * @ordered
	 */
	protected EList<AppAccessControl> accessControl;

	/**
	 * The cached value of the '{@link #getApiControl() <em>Api Control</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiControl()
	 * @generated
	 * @ordered
	 */
	protected EList<APIAccessControl> apiControl;

	/**
	 * The cached value of the '{@link #getMiddlewareConfiguration() <em>Middleware Configuration</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiddlewareConfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList<MiddlewareConfiguration> middlewareConfiguration;

	/**
	 * The cached value of the '{@link #getLoggingConfiguration() <em>Logging Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoggingConfiguration()
	 * @generated
	 * @ordered
	 */
	protected LoggingConfiguration loggingConfiguration;

	/**
	 * The cached value of the '{@link #getNameResolutionConfiguration() <em>Name Resolution Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameResolutionConfiguration()
	 * @generated
	 * @ordered
	 */
	protected NameResolutionConfiguration nameResolutionConfiguration;

	/**
	 * The cached value of the '{@link #getSecretsConfiguration() <em>Secrets Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecretsConfiguration()
	 * @generated
	 * @ordered
	 */
	protected SecretsConfiguration secretsConfiguration;

	/**
	 * The cached value of the '{@link #getMetricsConfiguration() <em>Metrics Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetricsConfiguration()
	 * @generated
	 * @ordered
	 */
	protected MetricsConfiguration metricsConfiguration;

	/**
	 * The cached value of the '{@link #getTracingConfiguration() <em>Tracing Configuration</em>}' reference.
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
	public EList<AppAccessControl> getAccessControl() {
		if (accessControl == null) {
			accessControl = new EObjectResolvingEList<AppAccessControl>(AppAccessControl.class, this,
					DaprdesignerPackage.APP_CONFIGURATION__ACCESS_CONTROL);
		}
		return accessControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<APIAccessControl> getApiControl() {
		if (apiControl == null) {
			apiControl = new EObjectResolvingEList<APIAccessControl>(APIAccessControl.class, this,
					DaprdesignerPackage.APP_CONFIGURATION__API_CONTROL);
		}
		return apiControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MiddlewareConfiguration> getMiddlewareConfiguration() {
		if (middlewareConfiguration == null) {
			middlewareConfiguration = new EObjectResolvingEList<MiddlewareConfiguration>(MiddlewareConfiguration.class,
					this, DaprdesignerPackage.APP_CONFIGURATION__MIDDLEWARE_CONFIGURATION);
		}
		return middlewareConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoggingConfiguration getLoggingConfiguration() {
		if (loggingConfiguration != null && loggingConfiguration.eIsProxy()) {
			InternalEObject oldLoggingConfiguration = (InternalEObject) loggingConfiguration;
			loggingConfiguration = (LoggingConfiguration) eResolveProxy(oldLoggingConfiguration);
			if (loggingConfiguration != oldLoggingConfiguration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DaprdesignerPackage.APP_CONFIGURATION__LOGGING_CONFIGURATION, oldLoggingConfiguration,
							loggingConfiguration));
			}
		}
		return loggingConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoggingConfiguration basicGetLoggingConfiguration() {
		return loggingConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoggingConfiguration(LoggingConfiguration newLoggingConfiguration) {
		LoggingConfiguration oldLoggingConfiguration = loggingConfiguration;
		loggingConfiguration = newLoggingConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.APP_CONFIGURATION__LOGGING_CONFIGURATION, oldLoggingConfiguration,
					loggingConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameResolutionConfiguration getNameResolutionConfiguration() {
		if (nameResolutionConfiguration != null && nameResolutionConfiguration.eIsProxy()) {
			InternalEObject oldNameResolutionConfiguration = (InternalEObject) nameResolutionConfiguration;
			nameResolutionConfiguration = (NameResolutionConfiguration) eResolveProxy(oldNameResolutionConfiguration);
			if (nameResolutionConfiguration != oldNameResolutionConfiguration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DaprdesignerPackage.APP_CONFIGURATION__NAME_RESOLUTION_CONFIGURATION,
							oldNameResolutionConfiguration, nameResolutionConfiguration));
			}
		}
		return nameResolutionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameResolutionConfiguration basicGetNameResolutionConfiguration() {
		return nameResolutionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameResolutionConfiguration(NameResolutionConfiguration newNameResolutionConfiguration) {
		NameResolutionConfiguration oldNameResolutionConfiguration = nameResolutionConfiguration;
		nameResolutionConfiguration = newNameResolutionConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.APP_CONFIGURATION__NAME_RESOLUTION_CONFIGURATION,
					oldNameResolutionConfiguration, nameResolutionConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecretsConfiguration getSecretsConfiguration() {
		if (secretsConfiguration != null && secretsConfiguration.eIsProxy()) {
			InternalEObject oldSecretsConfiguration = (InternalEObject) secretsConfiguration;
			secretsConfiguration = (SecretsConfiguration) eResolveProxy(oldSecretsConfiguration);
			if (secretsConfiguration != oldSecretsConfiguration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DaprdesignerPackage.APP_CONFIGURATION__SECRETS_CONFIGURATION, oldSecretsConfiguration,
							secretsConfiguration));
			}
		}
		return secretsConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecretsConfiguration basicGetSecretsConfiguration() {
		return secretsConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecretsConfiguration(SecretsConfiguration newSecretsConfiguration) {
		SecretsConfiguration oldSecretsConfiguration = secretsConfiguration;
		secretsConfiguration = newSecretsConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.APP_CONFIGURATION__SECRETS_CONFIGURATION, oldSecretsConfiguration,
					secretsConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricsConfiguration getMetricsConfiguration() {
		if (metricsConfiguration != null && metricsConfiguration.eIsProxy()) {
			InternalEObject oldMetricsConfiguration = (InternalEObject) metricsConfiguration;
			metricsConfiguration = (MetricsConfiguration) eResolveProxy(oldMetricsConfiguration);
			if (metricsConfiguration != oldMetricsConfiguration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DaprdesignerPackage.APP_CONFIGURATION__METRICS_CONFIGURATION, oldMetricsConfiguration,
							metricsConfiguration));
			}
		}
		return metricsConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricsConfiguration basicGetMetricsConfiguration() {
		return metricsConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetricsConfiguration(MetricsConfiguration newMetricsConfiguration) {
		MetricsConfiguration oldMetricsConfiguration = metricsConfiguration;
		metricsConfiguration = newMetricsConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.APP_CONFIGURATION__METRICS_CONFIGURATION, oldMetricsConfiguration,
					metricsConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracingConfiguration getTracingConfiguration() {
		if (tracingConfiguration != null && tracingConfiguration.eIsProxy()) {
			InternalEObject oldTracingConfiguration = (InternalEObject) tracingConfiguration;
			tracingConfiguration = (TracingConfiguration) eResolveProxy(oldTracingConfiguration);
			if (tracingConfiguration != oldTracingConfiguration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DaprdesignerPackage.APP_CONFIGURATION__TRACING_CONFIGURATION, oldTracingConfiguration,
							tracingConfiguration));
			}
		}
		return tracingConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracingConfiguration basicGetTracingConfiguration() {
		return tracingConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTracingConfiguration(TracingConfiguration newTracingConfiguration) {
		TracingConfiguration oldTracingConfiguration = tracingConfiguration;
		tracingConfiguration = newTracingConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DaprdesignerPackage.APP_CONFIGURATION__TRACING_CONFIGURATION, oldTracingConfiguration,
					tracingConfiguration));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DaprdesignerPackage.APP_CONFIGURATION__API_VERSION:
			return getApiVersion();
		case DaprdesignerPackage.APP_CONFIGURATION__KIND:
			return getKind();
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
			if (resolve)
				return getLoggingConfiguration();
			return basicGetLoggingConfiguration();
		case DaprdesignerPackage.APP_CONFIGURATION__NAME_RESOLUTION_CONFIGURATION:
			if (resolve)
				return getNameResolutionConfiguration();
			return basicGetNameResolutionConfiguration();
		case DaprdesignerPackage.APP_CONFIGURATION__SECRETS_CONFIGURATION:
			if (resolve)
				return getSecretsConfiguration();
			return basicGetSecretsConfiguration();
		case DaprdesignerPackage.APP_CONFIGURATION__METRICS_CONFIGURATION:
			if (resolve)
				return getMetricsConfiguration();
			return basicGetMetricsConfiguration();
		case DaprdesignerPackage.APP_CONFIGURATION__TRACING_CONFIGURATION:
			if (resolve)
				return getTracingConfiguration();
			return basicGetTracingConfiguration();
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
		case DaprdesignerPackage.APP_CONFIGURATION__METADATA_NAMESPACE:
			setMetadata_namespace((Namespace) newValue);
			return;
		case DaprdesignerPackage.APP_CONFIGURATION__ACCESS_CONTROL:
			getAccessControl().clear();
			getAccessControl().addAll((Collection<? extends AppAccessControl>) newValue);
			return;
		case DaprdesignerPackage.APP_CONFIGURATION__API_CONTROL:
			getApiControl().clear();
			getApiControl().addAll((Collection<? extends APIAccessControl>) newValue);
			return;
		case DaprdesignerPackage.APP_CONFIGURATION__MIDDLEWARE_CONFIGURATION:
			getMiddlewareConfiguration().clear();
			getMiddlewareConfiguration().addAll((Collection<? extends MiddlewareConfiguration>) newValue);
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
		case DaprdesignerPackage.APP_CONFIGURATION__METADATA_NAMESPACE:
			setMetadata_namespace((Namespace) null);
			return;
		case DaprdesignerPackage.APP_CONFIGURATION__ACCESS_CONTROL:
			getAccessControl().clear();
			return;
		case DaprdesignerPackage.APP_CONFIGURATION__API_CONTROL:
			getApiControl().clear();
			return;
		case DaprdesignerPackage.APP_CONFIGURATION__MIDDLEWARE_CONFIGURATION:
			getMiddlewareConfiguration().clear();
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
		case DaprdesignerPackage.APP_CONFIGURATION__METADATA_NAMESPACE:
			return metadata_namespace != null;
		case DaprdesignerPackage.APP_CONFIGURATION__ACCESS_CONTROL:
			return accessControl != null && !accessControl.isEmpty();
		case DaprdesignerPackage.APP_CONFIGURATION__API_CONTROL:
			return apiControl != null && !apiControl.isEmpty();
		case DaprdesignerPackage.APP_CONFIGURATION__MIDDLEWARE_CONFIGURATION:
			return middlewareConfiguration != null && !middlewareConfiguration.isEmpty();
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
		result.append(", componentsDenyList: ");
		result.append(componentsDenyList);
		result.append(')');
		return result.toString();
	}

} //AppConfigurationImpl
