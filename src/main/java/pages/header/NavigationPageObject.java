package pages.header;

import com.codeborne.selenide.SelenideElement;
import pages.signuppage.SignupPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;


public class NavigationPageObject {

    private SelenideElement getMyAccountButton() {
        return $("test");
    }

    private SelenideElement getSignUpButton() {
        return $("test");
    }

    public void selectMyAccountButton() { getMyAccountButton().click(); }

    public SignupPageObject selectSignUpButton(){ // izmantot, ka pēc nospiešanas notiek pāreja uz citu lapu
            getSignUpButton().click();
            return page(SignupPageObject.class);
    }
}
