package starter.page.User;

import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends PageObject {
    //Click Icon Account
    @FindBy(id = "dropdown-basic")
    WebElement IconAccount;
    public void clickIconAccount() {
        IconAccount.click();
    }

    //Click Text Login
    @FindBy(id = "masuk")
    WebElement TextButtonLogin;
    public void clickTextButtonLogin() {
        TextButtonLogin.click();
    }

    //Input Email in Field Email
    @FindBy(id="email")
    WebElement FieldEmail;
    public void InputEmail(String email) {
        FieldEmail.sendKeys(email);
    }

    //Input Password in Field Password
    @FindBy(id="password")
    WebElement FieldPassword;
    public void InputPassword(String password) {
        FieldPassword.sendKeys(password);
    }

    //Click Icon Button Login
    @FindBy(id="btn-masuk")
    WebElement ButtonLogin;
    public void clickButtonLogin() {
        ButtonLogin.click();
    }

    //Validate Login
    @FindBy(id = "swal2-html-container")
    WebElement PopUpMessageLogin;
    //validate message login success
    public void validateLoginSuccess(String message){
        element(PopUpMessageLogin).waitUntilVisible();
        Assert.assertEquals(message,PopUpMessageLogin.getText());
    }

    //validate message login failed
    @FindBy(id = "swal2-html-container")
    WebElement PopUpMessageLoginFailed;
    public void validateLoginFailed(String message){
        element(PopUpMessageLoginFailed).waitUntilVisible();
        Assert.assertEquals(message,PopUpMessageLoginFailed.getText());
    }

    //Click OK Validate Message
    @FindBy(xpath = "/html/body/div[2]/div/div[6]/button[1]")
    WebElement IconOk;
    public void ClickIconOK() {
        IconOk.click();
    }

    //Click Cart Icon
    @FindBy(id = "cart-login")
    WebElement IconCart;
    public void ClickIconCart() {
        IconCart.click();
    }

    //Click Checkmark
    @FindBy(id = "0")
    WebElement Checkmark;
    public void ClickCheckmark() {
        Checkmark.click();
    }

    //Click Checkout
    @FindBy(id = "checkout")
    WebElement Checkout;
    public void ClickCheckout(){
        Checkout.click();
    }

    //Select Metode Payment COD
    @FindBy(id = "cod")
    WebElement CODPayment;
    public void ClickCODPayment() {
        CODPayment.click();
    }

    //Select Metode Payment DANA
    @FindBy(id = "dana")
    WebElement DANAPayment;
    public void ClickDANAPayment() {
        DANAPayment.click();
    }

    //Select Metode Payment ShopeePay
    @FindBy(id = "shopee")
    WebElement ShopeePayPayment;
    public void ClickShopeePayPayment() {
        ShopeePayPayment.click();
    }

    //Select Metode Payment LinkAja
    @FindBy(id = "linkaja")
    WebElement LinkAjaPayment;
    public void ClickLinkAjaPayment() {
        LinkAjaPayment.click();
    }

    //Select Metode Payment OVO
    @FindBy(id = "ovo")
    WebElement OVOPayment;
    public void ClickOVOPayment() {
        OVOPayment.click();
    }

    //Select Payment Checkout
    @FindBy(id = "pay")
    WebElement Payment;
    public void ClickPayment() {
        Payment.click();
    }


    //Validate Payment COD
    @FindBy(id = "swal2-html-container")
    WebElement PopUpMessageCODPayment;
    public void validatePopUpMessageCODPayment(String message){
        element(PopUpMessageCODPayment).waitUntilVisible();
        Assert.assertEquals(message,PopUpMessageCODPayment.getText());
    }

    //Click Load More
    @FindBy(id = "muat")
    WebElement LoadMore;
    public void ClickLoadMore() {
        LoadMore.click();
    }

    //Select Product
    @FindBy(id = "0")
    WebElement Product;
    public void ClickProduct() {
        Product.click();
    }

    //Click Rental Button
    @FindBy(id = "rent-cartNull")
    WebElement RentalButton;
    public void ClickRentalButton() {
        RentalButton.click();
    }

    //Click Add Cart
    @FindBy(id = "add-cart")
    WebElement AddCart;
    public void ClickAddCart() {
        AddCart.click();
    }

    //Validate Booking Product
    @FindBy(id = "swal2-html-container")
    WebElement PopUpMessageBooking;
    public void validatePopUpMessageBooking(String message){
        element(PopUpMessageBooking).waitUntilVisible();
        Assert.assertEquals(message,PopUpMessageBooking.getText());
    }
}
