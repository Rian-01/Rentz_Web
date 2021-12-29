package starter.User;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.BaseTest;

public class login extends BaseTest {
    @Given("I am open login page in Rentz")
    public void iAmOpenLoginPageInRentz() {
        loginPage.open();
        loginPage.clickIconAccount();
        loginPage.clickTextButtonLogin();
    }

    @When("I am enter email {string}")
    public void iAmEnterEmail(String message) {
        loginPage.InputEmail(message);
    }

    @And("I am enter password {string}")
    public void iAmEnterPassword(String message) {
        loginPage.InputPassword(message);
    }

    @And("I am click button Login")
    public void iAmClickButtonLogin() {
        loginPage.clickButtonLogin();
    }

    @Then("I am success login")
    public void iAmSuccessLogin() {
    }

    @And("Show success message {string}")
    public void showSuccessMessage(String message) {
        loginPage.validateLoginSuccess(message);
    }

    @And("Show Failed message {string}")
    public void showFailedMessage(String message) {
        loginPage.validateLoginFailed(message);
    }
}
