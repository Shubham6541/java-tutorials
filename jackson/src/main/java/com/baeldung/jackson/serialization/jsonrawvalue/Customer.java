package com.nklkarthi.jackson.serialization.jsonrawvalue;

import com.nklkarthi.jackson.domain.Person;
import com.fasterxml.jackson.annotation.JsonRawValue;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class Customer extends Person {

    @JsonRawValue
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
