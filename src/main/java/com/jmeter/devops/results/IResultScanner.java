package com.jmeter.devops.results;

public interface IResultScanner {

    int getSuccessCount();

    int getFailureCount();

    int getTotalCount();

}
