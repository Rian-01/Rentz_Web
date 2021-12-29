package starter.Checkout;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import starter.BaseTest;

public class Checkout extends BaseTest {
    @Then("I am failed Checkout Product")
    public void iAmFailedCheckoutProduct() {
    }

    @And("Show success message {string} on payment page")
    public void showSuccessMessageOnPaymentPage(String arg0) {
    }
}
