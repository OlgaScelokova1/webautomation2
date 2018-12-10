package pages.header;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.signuppage.SignupPageObject;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;
import java.io.File;

public class NavigationPageObject {

//    private SelenideElement getMyAccountButton() {
//        return $((".navbar-collapse  #li_myaccount"));
//    }
//
//    private SelenideElement getSignUpButton() {
//        return $((".navbar-collapse .dropdown-menu > li > a[href='https://www.phptravels.net/register']"));
//    }
//
//    private SelenideElement getLoadingIndicator() {
//        return $(By.id("preloader"));
//    }
//    private SelenideElement getLogo() {
//        return $(("img[alt='PHPTRAVELS | Travel Technology Partner']"));
//    }
//
//    public void selectMyAccountButton() { getMyAccountButton().click(); }
//
//    public SignupPageObject selectSignUpButton(){ // izmantot, ka pēc nospiešanas notiek pāreja uz citu lapu
//            getSignUpButton().click();
//            return page(SignupPageObject.class);
//    }
//
//    public boolean isLogovisible(){
//        return getLogo().isDisplayed();
//    }
//
//    public boolean isMyAccountButtonVisible(){
//        return getMyAccountButton().isDisplayed();
//    }
//
//    public void waitUntilpageLoadingIsFinished(){
//        getLoadingIndicator().waitUntil(Condition.attribute("style", "display: none;"), 5000);
//    }
    private SelenideElement getLoginButton() {
       return $((".appButton-3GZ9-9"));
    }

    private SelenideElement getGreetingText() {
        return $((".themeHeader-1Dn4KU"));
    }

    public void waitUntilLoginButtonIsVisible(){
        getLoginButton().waitUntil(Condition.visible, 5000);
    }

    public void waitGreetingTextIsVisible(){
        getGreetingText().waitUntil(Condition.visible, 5000);
    }

    public boolean isLoginButtonVisible(){
        return getLoginButton().isDisplayed();
    }

    public boolean isGreetingVisible(){
        return getGreetingText().isDisplayed();
    }

    public void selectLoginButton() { getLoginButton().click(); }

    public void enterEmail(String email) { getEmailield().sendKeys(email); }

    public void enterPassword(String password) { getPasswordField().sendKeys(password); }

    private SelenideElement getEmailield() {
        return $("input[type='email']");
    }

    private SelenideElement getPasswordField() {
        return $("input[type='password']");
    }

    private SelenideElement getLoginFormButton() {
        return $(("button[type='submit']"));
    }

    private SelenideElement getChat() {
        return $(byXpath("//*[contains(text(),'Bermudu kvartāls')]"));
    }
    public void waitUntilChatIsVisible(){
        getChat().waitUntil(Condition.visible, 10000);
    }

    public void selectChat() { getChat().click(); }

    public void selectLoginFormButton() { getLoginFormButton().click(); }

    private SelenideElement getUploadButton() {
        return $((".file-input"));
    }
    private SelenideElement getUploadButton2() {
        return $(byXpath("//*[contains(text(),'Upload')]"));
    }

    private SelenideElement getFileName() {
        return $(byXpath("//div/a[contains(text(),'test.txt')]"));
    }

    public void selectUploadButton() {
        File file = new File("/Users/olgascelokova/Desktop/test.txt");
        getUploadButton().uploadFile(file);
        getUploadButton2().click();
    }

    public void waitSentFileVisible(){
        getFileName().waitUntil(Condition.visible, 5000);
    }

    public boolean isTextVisible(){
        return getFileName().isDisplayed();
    }
}
