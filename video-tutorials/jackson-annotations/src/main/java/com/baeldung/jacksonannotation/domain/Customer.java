package com.nklkarthi.jacksonannotation.domain;

/**
 * Source code github.com/eugenp/tutorials
 *
 * @author Alex Theedom www.nklkarthi.com
 * @version 1.0
 */
public class Customer extends Person {

    private String configuration;

    public Customer(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }
}
