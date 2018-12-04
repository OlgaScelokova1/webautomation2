package pages.header;

import com.codeborne.selenide.SelenideElement;
import pages.signuppage.SignupPageObject;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;


public class NavigationPageObject {

    private SelenideElement getMyAccountButton() {
        return $((".navbar-collapse  #li_myaccount"));
    }

    private SelenideElement getSignUpButton() {
        return $((".navbar-collapse .dropdown-menu > li > a[href='https://www.phptravels.net/register']"));
    }

    public void selectMyAccountButton() { getMyAccountButton().click(); }

    public SignupPageObject selectSignUpButton(){ // izmantot, ka pēc nospiešanas notiek pāreja uz citu lapu
            getSignUpButton().click();
            return page(SignupPageObject.class);
    }
}
