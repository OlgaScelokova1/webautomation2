package pages.signuppage;

import com.codeborne.selenide.SelenideElement;
import pages.account.AccountPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class SignupPageObject {
    private SelenideElement getFirstNameField() {
        return $("test");
    }

    private SelenideElement getLastNameField() {
        return $("test");
    }

    private SelenideElement getMobileNumberField() {
        return $("test");
    }

    private SelenideElement getEmailield() {
        return $("test");
    }

    private SelenideElement getPasswordField() {
        return $("test");
    }

    private SelenideElement getCinfirmPasswordField() {
        return $("test");
    }

    private SelenideElement getSignUpButton() {
        return $("test");
    }

    public void enterFirstName(String firstname) { getFirstNameField().sendKeys(firstname); }

    public void enterLastName(String lastname) { getLastNameField().sendKeys(lastname); }

    public void enterMobileNumber(String mobilenumber) { getMobileNumberField().sendKeys(mobilenumber);}

    public void enterEmail(String email) { getEmailield().sendKeys(email); }

    public void enterPassword(String password) { getPasswordField().sendKeys(password); }

    public void enterConfirmationPassword(String confirmationpassword) { getCinfirmPasswordField().sendKeys(confirmationpassword); }

    public AccountPageObject selectSignUpButton(){ // izmantot, ka pēc nospiešanas notiek pāreja uz citu lapu
        getSignUpButton().click();
        return page(AccountPageObject.class);
    }
}
