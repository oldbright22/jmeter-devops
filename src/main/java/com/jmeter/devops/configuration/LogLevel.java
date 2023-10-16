package com.jmeter.devops.configuration;

/**
 * Enum containing the log levels supported by JMeter
 */
public enum LogLevel {
	ERROR,
	WARN,
	INFO,
	DEBUG;

	@Override
	public String toString() {
		return super.toString().toUpperCase();
	}
}
