package starter.UserCustomer;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import starter.BaseTest;

public class UserCustomer extends BaseTest {

    //Validate Success Login
    @And("Show success message {string} going to Home Page")
    public void showSuccessMessageGoingToHomePage(String message) {
        loginPage.validatePopUpMessageBooking(message);
    }

    @And("I am click ok button")
    public void iAmClickOkButton() {
        loginPage.ClickIconOK();
    }

    @And("I am click LoadMore")
    public void iAmClickLoadMore() {
        loginPage.ClickLoadMore();
    }

    // Select Product
    @And("I am select Product")
    public void iAmSelectProduct() {
        loginPage.ClickProduct();
    }

    @And("I am click rental")
    public void iAmClickRental() {
        loginPage.ClickRentalButton();
    }

    @And("I click add product")
    public void iClickAddProduct() {
        loginPage.ClickAddCart();
    }

    @Then("I am success take product to cart")
    public void iAmSuccessTakeProductToCart() {
    }

    @And("Show success message {string} on page detail")
    public void showSuccessMessageOnPageDetail(String message) {
        loginPage.validatePopUpMessageBooking(message);
    }


    //Checkout Product
    @And("I am click cart on home page")
    public void iAmClickCartOnHomePage() {
        loginPage.ClickIconCart();
    }

    @And("I am select checkmark product")
    public void iAmSelectCheckmarkProduct() {
        loginPage.ClickCheckmark();
    }

    @And("I am click checkout button")
    public void iAmClickCheckoutButton() {
        loginPage.ClickCheckout();
    }

    @And("I am select Metode Payment COD")
    public void iAmSelectMetodePaymentCOD() {
        loginPage.ClickCODPayment();
    }

    @And("I click Pay button")
    public void iClickPayButton() {
        loginPage.ClickPayment();
    }

    @Then("I am success Checkout Product")
    public void iAmSuccessCheckoutProduct() {;
    }

    @And("Show success message {string} and payment page")
    public void showSuccessMessageAndPaymentPage(String message) {
        loginPage.validatePopUpMessageCODPayment(message);
    }

}
