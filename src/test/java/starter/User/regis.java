package starter.User;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.BaseTest;

public class regis extends BaseTest {
    @Given("Given I am open regis page in Rentz.ID")
    public void givenIAmOpenRegisPageInRentzID() {
        regisPage.open();
        regisPage.clickIconAccount();
        regisPage.ClickTextButtonRegis();
    }

    @When("I am enter name {string}")
    public void iAmEnterName(String name) {
        regisPage.InputName(name);
    }

    @And("I am enter new email {string}")
    public void iAmEnterNewEmail(String email) {
        regisPage.InputEmail(email);
    }

    @And("I am enter NumberHP {string}")
    public void iAmEnterNumberHP(String number) {
      regisPage.InputNumberHP(number);
    }

    @And("I am enter new password {string}")
    public void iAmEnterNewPassword(String password) {
        regisPage.InputPassword(password);
    }

    @And("I am click button Registration")
    public void iAmClickButtonRegistration() {
        regisPage.ClickRegisButton();
    }

    @Then("I am success Registration")
    public void iAmSuccessRegistration() {
    }

    @And("Show success message {string} Regis")
    public void showSuccessMessageRegis(String message) {
        regisPage.validateMessageRegisFail(message);
    }
}
