package pages.header;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
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

    private SelenideElement getLoadingIndicator() {
        return $(By.id("preloader"));
    }
    private SelenideElement getLogo() {
        return $(("img[alt='PHPTRAVELS | Travel Technology Partner']"));
    }

    public void selectMyAccountButton() { getMyAccountButton().click(); }

    public SignupPageObject selectSignUpButton(){ // izmantot, ka pēc nospiešanas notiek pāreja uz citu lapu
            getSignUpButton().click();
            return page(SignupPageObject.class);
    }

    public boolean isLogovisible(){
        return getLogo().isDisplayed();
    }

    public boolean isMyAccountButtonVisible(){
        return getMyAccountButton().isDisplayed();
    }

    public void waitUntilpageLoadingIsFinished(){
        getLoadingIndicator().waitUntil(Condition.attribute("style", "display: none;"), 5000);
    }
}
