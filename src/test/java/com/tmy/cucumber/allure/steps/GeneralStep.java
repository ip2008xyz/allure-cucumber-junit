package com.tmy.cucumber.allure.steps;


import com.tmy.cucumber.allure.Storage;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class GeneralStep {

    Storage storage;

    @Given("{int} and {int}")
    public void value_and_value(int a, int b) {
        storage.store(a, b);
    }

    @When("sum")
    public void sum() {
        storage.sum();
    }

    @When("multiply")
    public void multiply() {
        storage.multiply();
    }

    @Then("result is {int}")
    public void result_is_int(int result) {
        assertEquals(Integer.valueOf(result), storage.getResult());
    }

    @Before
    public void before() {
        storage = new Storage();
    }

}
