package com.nklkarthi.jaxws.config;

import javax.xml.ws.Endpoint;

import com.nklkarthi.jaxws.EmployeeServiceImpl;

public class EmployeeServicePublisher {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/employeeservice", new EmployeeServiceImpl());
    }
}
