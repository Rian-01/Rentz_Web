package starter.page.Booking;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class bookingPage extends PageObject {
    //Click Icon Account
    @FindBy(id = "dropdown-basic")
    WebElement IconAccount;
    public void clickIconAccount() {
        IconAccount.click();
    }

    //Click Button Login
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
    //Select Product Booking
    @FindBy(id = "AREI OUTDOORGEAR V2 MATRAS SPON1")
    WebElement ProductSelect;
    public void ClickProductSelect() {
        ProductSelect.click();
    }

    //Input Start Date
    @FindBy(id = "mui-4")
    WebElement StartDate;
    public void InputStartDate(String message) {
        StartDate.sendKeys(message);
    }

    //Input End Date
    @FindBy(id = "mui-5")
    WebElement EndDate;
    public void InputEndDate(String message) {
        EndDate.sendKeys(message);
    }

}
