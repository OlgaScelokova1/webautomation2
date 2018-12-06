package pages.signuppage;

import com.codeborne.selenide.SelenideElement;
import pages.account.AccountPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class SignupPageObject {
    private SelenideElement getFirstNameField() {
        return $("input[name='firstname']");
    }

    private SelenideElement getLastNameField() {
        return $("input[name='lastname']");
    }

    private SelenideElement getMobileNumberField() {
        return $("input[name='phone']");
    }

    private SelenideElement getEmailield() {
        return $("input[name='email']");
    }

    private SelenideElement getPasswordField() {
        return $("input[name='password']");
    }

    private SelenideElement getCinfirmPasswordField() {
        return $("input[name='confirmpassword']");
    }

    private SelenideElement getSignUpButton() {
        return $("div.form-group> button");
    }
    private SelenideElement getSignUpForm() {
        return $(".panel-default");
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

    public boolean isSignUpFormVisible(){
        return getSignUpForm().isDisplayed();
    }
}
