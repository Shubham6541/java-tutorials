package com.nklkarthi;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class OtherDefsIntegrationTest extends SpringIntegrationTest {
    @When("^the client calls /nklkarthi$")
    public void the_client_issues_POST_hello() throws Throwable {
        executePost("http://localhost:8080/nklkarthi");
    }

    @Given("^the client calls /hello$")
    public void the_client_issues_GET_hello() throws Throwable {
        executeGet("http://localhost:8080/hello");
    }
}