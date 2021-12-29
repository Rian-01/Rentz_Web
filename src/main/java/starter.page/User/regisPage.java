package starter.page.User;

import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class regisPage extends PageObject {
    //Click Icon Account
    @FindBy(id = "dropdown-basic")
    WebElement IconAccount;
    public void clickIconAccount() {
        IconAccount.click();
    }

    //Click Text Registration
    @FindBy(id = "daftar")
    WebElement TextButtonRegis;
    public void ClickTextButtonRegis() {
        TextButtonRegis.click();
    }

    //Input Name
    @FindBy(id ="name" )
    WebElement Name;
    public void InputName(String name) {
        Name.sendKeys(name);
    }

    //Input Email
    @FindBy(id = "email")
    WebElement Email;
    public void InputEmail(String email) {
        Email.sendKeys(email);
    }

    //Input Number HP
    @FindBy(id = "phone" )
    WebElement NumberHP;
    public void InputNumberHP(String number) {
        NumberHP.sendKeys(number);
    }

    //Input Password
    @FindBy(id = "password" )
    WebElement Password;
    public void InputPassword(String password) {
        Password.sendKeys(password);
    }

    //Click Regis
    @FindBy(id = "btn-daftar")
    WebElement RegisButton;
    public void ClickRegisButton() {
        RegisButton.click();
    }

    //Validate Registration Failed
    @FindBy(id = "swal2-html-container")
    WebElement PopUpMessageRegisFail;
    public void validateMessageRegisFail(String message){
        element(PopUpMessageRegisFail).waitUntilVisible();
        Assert.assertEquals(message,PopUpMessageRegisFail.getText());
    }
}
