package com.bookit.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        System.out.println("user is on the login page");
    }

    @When("I enter my valid credentials")
    public void i_enter_my_valid_credentials() {
        System.out.println("user enter credentials");
    }
    @Then("I will log in")
    public void i_will_log_in() {
        System.out.println("user logs in");
    }
    @Then("I will see my dashboard")
    public void i_will_see_my_dashboard() {
        System.out.println("user sees dashboard");
    }

    @When("I enter as a {string}")
    public void i_enter_as_a(String string) {
        System.out.println("user enter as a store manager");
    }


}
