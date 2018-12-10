package pages.landing;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.JavascriptExecutor;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class LandingPageObject {

    private SelenideElement getLogo() {
        return $((".tdl-logo.light"));
    }

    private SelenideElement getContactUsButton() {
        return $(("div.right-side .contact-us-btn"));
    }

    public void waitUntilLogoIsVisible(){
        getLogo().waitUntil(Condition.visible, 5000);
    }

    public void waitContactUsButtonIsVisible(){
        getContactUsButton().waitUntil(Condition.visible, 5000);
    }

    public boolean isLogoVisible(){
        return getLogo().isDisplayed();
    }
    public boolean isContactUsButtonVisible(){
        return getContactUsButton().isDisplayed();
    }

    public void selectContactUsButton() { getContactUsButton().click(); }

    private SelenideElement getFormTitle() {
        return $(By.xpath("//*[contains(text(),'Send us a Message')]"));
    }

    public void waitUntilFormTitleIsVisible(){
        getFormTitle().waitUntil(Condition.visible, 5000);
    }

    public boolean isFormTitleVisible(){
        return getFormTitle().isDisplayed();
    }

    private SelenideElement getFirstNameField() {
        return $("input[name='firstName']");
    }
    private SelenideElement getLastNameField() {
        return $("input[name='lastName']");
    }

    public void enterFirstName(String firstname) { getFirstNameField().sendKeys(firstname); }

    public void enterLastName(String lastname) { getLastNameField().sendKeys(lastname); }

    private SelenideElement getMobileNumberField() {
        return $("input[name='phone']");
    }

    private SelenideElement getEmailield() {
        return $("input[name='email']");
    }

    public void enterMobileNumber(String mobilenumber) { getMobileNumberField().sendKeys(mobilenumber);}

    public void enterEmail(String email) { getEmailield().sendKeys(email); }

    private SelenideElement getCompanyField() {
        return $("input[name='company']");
    }

    public void enterCompany(String company) { getCompanyField().sendKeys(company); }
    private SelenideElement getTopicField() {
        return $((".field-box"));
    }

    private SelenideElement getServicesOption() {
        return $(By.xpath("//*[contains(text(),'Services')]"));
    }

    public void selectServicesOption() {
        getTopicField().waitUntil(Condition.visible, 5000);
        getTopicField().click();
        getServicesOption().waitUntil(Condition.visible, 5000);
        getServicesOption().click(); }

    private SelenideElement getMessageField() {
        return $("textarea[name='message']");
    }

    public void enterMessage(String message) { getMessageField().sendKeys(message); }

    private SelenideElement getCaptchaField() {
        return $((".recaptcha-checkbox"));
    }

    private SelenideElement getCaptchaField2() {
        return $(("#recaptcha-accessible-status"));
    }



    public void selectCaptchaField() {
        setAttributeValue(getCaptchaField(), "true");
    }

    private SelenideElement getSendButton() {
        return $((".filled-cta-btn.disabled"));
    }

    public void selectCaptchaField2() {
        WebDriver driver=getWebDriver();
        driver.get("https://www.testdevlab.com/contact-us");
        driver.switchTo().frame(0);
        new WebDriverWait(driver, 120).until(ExpectedConditions.visibilityOf(driver.findElement(By.className("recaptcha-checkbox-checkmark")))).click();
    }

    public void setAttributeValue(WebElement elem, String value){
        WebDriver driver = getWebDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        String scriptSetAttrValue = "arguments[0].setAttribute(arguments[1],arguments[2])";

        js.executeScript(scriptSetAttrValue, elem, "class", value);

    }

    public void aaa(){
        setAttributeValue(getSendButton(),"filled-cta-btn no-select");
        getWebDriver().findElement(By.className("filled-cta-btn")).click();

    }

    private SelenideElement getformSent() {
        return $((".form-success"));
    }

    public void waitUntilMessageVisible(){
        getformSent().waitUntil(Condition.visible, 5000);
    }

    public boolean isSuccessMessageVisible(){
        return getformSent().isDisplayed();
    }



//    public void selectCaptchaField() {
//        WebDriver driver = getWebDriver();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("document.getElementsByClassName('goog-inline-block').setAttribute('aria-checked','true')");
//
//    }



    }
