package awesomecucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class MyStepdefs {

    @Given("I'm dummy")
    public void i_m_dummy() {
        System.out.println("Given step executed");
    }

    @When("I do dummy things")
    public void i_do_dummy_things() {
        System.out.println("When step executed");
    }

    @Then("dummy things happen")
    public void dummy_things_happen() {
        System.out.println("Then step executed");
    }
}

