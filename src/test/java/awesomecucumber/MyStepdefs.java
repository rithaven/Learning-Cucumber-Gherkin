package awesomecucumber;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;

public class MyStepdefs {
    @Given("I'm an existing customer of xyz app")
    public void iMAnExistingCustomerOfXyzApp() {

    }

    @When("I provide my credentials")
    public void iProvideMyCredentials() {

    }

    @Then("I'm logged in")
    public void iMLoggedIn() {

    }

    @Then("I'm logged in and greeted with a message {string}")
    public void iMLoggedInAndGreetedWithAMessage(String arg0) {

    }

    @Given("My username is {string} and password is {string}")
    public void myUsernameIsAndPasswordIs(String arg0, String arg1) {
    }


    private int balance; // must be class-level

    @Given("my account balance is ${int}")
    public void my_account_balance_is(int openingBalance) {
        balance = openingBalance;
    }

    @When("I withdraw ${int}")
    public void i_withdraw(int withdrawalAmount) {
        balance -= withdrawalAmount;
    }

    @Then("the account balance should be ${int}")
    public void the_account_balance_should_be(int expectedBalance) {
        assertEquals(expectedBalance, balance);
    }
}
