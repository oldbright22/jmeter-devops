package com.jmeter.devops.properties;

/**
 * An Enum holding a list of reserved properties.
 * Properties configured here may not be set by client configuration.
 *
 * @author Mark Collin
 */
public enum ReservedProperties {

    JAVA_CLASS_PATH("java.class.path"),
    USER_DIR("user.dir"),
    JMETERENGINE_REMOTE_SYSTEM_EXIT("jmeterengine.remote.system.exit"),
    JMETERENGINE_STOPFAIL_SYSTEM_EXIT("jmeterengine.stopfail.system.exit");

    private final String propertyKey;

    ReservedProperties(String propertyKey) {
        this.propertyKey = propertyKey;
    }

    public String getPropertyKey() {
        return propertyKey;
    }
}
