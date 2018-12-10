package stepdefinitions;


import General.TestContext;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class SignupSteps {
    private TestContext test;
    public SignupSteps(TestContext testContext){
        this.test = testContext;
    }


//    @Given("^I have opened landing page$")
//    public void iHaveOpenedLandingPage() {
//        test.getNavigation().waitUntilpageLoadingIsFinished();
//        assertThat(test.getNavigation().isMyAccountButtonVisible()).isTrue();
//        assertThat(test.getNavigation().isLogovisible()).isTrue();
//    }
//
//    @When("^I select My Account menu$")
//    public void iSelectMyAccountMenu() {
//        //System.out.println("OPEN HOMEPAGE");
//        test.getNavigation().selectMyAccountButton();
//    }
//
//    @And("^I select Sign up menu$")
//    public void iSelectSignUpMenu() {
//        //System.out.println("OPEN HOMEPAGE");
//        test.getNavigation().selectSignUpButton();
//    }
//
//    @And("^I enter valid first name in signup form$")
//    public void iEnterValidFirstNameInSignupForm() {
//        //System.out.println("OPEN HOMEPAGE");
//        test.getSignuupPage().enterFirstName(test.getUser().getFirstName());
//    }
//
//    @And("^I enter valid last name in signup form$")
//    public void iEnterValidLastNameInSignupForm() {
//        //System.out.println("OPEN HOMEPAGE");
//        test.getSignuupPage().enterLastName(test.getUser().getLastName());
//    }
//
//    @And("^I enter valid mobile number in signup form$")
//    public void iEnterValidMobileNumberInSignupForm() {
//        //System.out.println("OPEN HOMEPAGE");
//        test.getSignuupPage().enterMobileNumber(test.getUser().getMobileNumber());
//    }
//
//    @And("^I enter valid email address in signup form$")
//    public void iEnterValidEmailAddressInSignupForm() {
//        //System.out.println("OPEN HOMEPAGE");
//        test.getSignuupPage().enterEmail(test.getUser().getEmailAddress());
//    }
//
//    @And("^I enter password in signup form$")
//    public void iEnterPasswordInSignupForm() {
//        //System.out.println("OPEN HOMEPAGE");
//        test.getSignuupPage().enterPassword(test.getUser().getPassword());
//    }
//
//    @And("^I re-enter password in signup form$")
//    public void iReEnterPasswordInSignupForm() {
//        //System.out.println("OPEN HOMEPAGE");
//        test.getSignuupPage().enterConfirmationPassword(test.getUser().getPassword());
//    }
//
//    @And("^I select SIGN UP button$")
//    public void iSelectSIGNUPButton() {
//        //System.out.println("OPEN HOMEPAGE");
//        test.getSignuupPage().selectSignUpButton();
//    }
//
//    @Then("^dashboard is opened$")
//    public void dashboardIsOpened() {
//        assertThat(test.getAccountPage().getGreetingsText()).isEqualTo("Hi, " + test.getUser().getFirstName() + " " + test.getUser().getLastName());
//        test.getNavigation().waitUntilpageLoadingIsFinished();
//        test.getAccountPage().waitUntilLogoLoadingIsFinished();
//        assertThat(test.getAccountPage().isUserLogoVisible()).isTrue();
//    }
//
//    @And("^Sign Up page is opened$")
//    public void signUpPageIsOpened() {
//        test.getNavigation().waitUntilpageLoadingIsFinished();
//        assertThat(test.getSignuupPage().isSignUpFormVisible()).isTrue();
//    }

//    @Given("^I have opened landing page Discord$")
//    public void iHaveOpenedLandingPageDiscord() {
//        test.getNavigation().waitUntilLoginButtonIsVisible();
//        test.getNavigation().waitGreetingTextIsVisible();
//        assertThat(test.getNavigation().isLoginButtonVisible()).isTrue();
//        assertThat(test.getNavigation().isGreetingVisible()).isTrue();
//    }
//
//    @When("^I select login button$")
//    public void iSelectLoginButton() throws Throwable {
//        test.getNavigation().selectLoginButton();
//    }
//
//    @And("^Login menu is opened$")
//    public void loginMenuIsOpened() throws Throwable {
//        System.out.println("LOGIN MENU IS OPENED");
//    }
//
//    @And("^I enter valid email$")
//    public void iEnterValidEmail() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        test.getNavigation().enterEmail("olgascelokova@gmail.com");
//    }
//
//    @And("^I enter password$")
//    public void iEnterPassword() throws Throwable {
//        test.getNavigation().enterPassword("163241Ko");
//    }
//
//    @And("^I press login button$")
//    public void iPressLoginButton() throws Throwable {
//        test.getNavigation().selectLoginFormButton();
//    }
//
//    @And("^I choose a person$")
//    public void iChooseAPerson() throws Throwable {
//        test.getNavigation().waitUntilChatIsVisible();
//        test.getNavigation().selectChat();
//    }
//
//    @And("^select upload button$")
//    public void selectUploadButton() throws Throwable {
//        test.getNavigation().selectUploadButton();
//        test.getNavigation().waitSentFileVisible();
//        assertThat(test.getNavigation().isTextVisible()).isTrue();
//
//    }

    @Given("^I have opened TestDevLab landing page$")
    public void iHaveOpenedTestDevLabLandingPage() throws Throwable {
        test.getLandingpage().waitContactUsButtonIsVisible();
        assertThat(test.getLandingpage().isContactUsButtonVisible()).isTrue();
    }

    @When("^I select Contact Us button$")
    public void iSelectContactUsButton() throws Throwable {
        test.getLandingpage().selectContactUsButton();
    }

    @And("^contact form is opened$")
    public void contactFormIsOpened() throws Throwable {
        test.getLandingpage().waitUntilFormTitleIsVisible();
        assertThat(test.getLandingpage().isFormTitleVisible()).isTrue();
    }

    @And("^I enter first name in contact form$")
    public void iEnterFirstNameInContactForm() throws Throwable {
        test.getLandingpage().enterFirstName(test.getUser().getFirstName());
    }

    @And("^I enter last name in contact form$")
    public void iEnterLastNameInContactForm() throws Throwable {
        test.getLandingpage().enterLastName(test.getUser().getLastName());
    }

    @And("^I enter email address in contact form$")
    public void iEnterEmailAddressInContactForm() throws Throwable {
        test.getLandingpage().enterEmail(test.getUser().getEmailAddress());
    }

    @And("^I enter phone number in contact form$")
    public void iEnterPhoneNumberInContactForm() throws Throwable {
        test.getLandingpage().enterMobileNumber(test.getUser().getMobileNumber());
    }

    @And("^I enter company name in contact form$")
    public void iEnterCompanyNameInContactForm() throws Throwable {
        test.getLandingpage().enterCompany(test.getUser().getCompany());
    }

    @And("^I select services topic$")
    public void iSelectServicesTopic() throws Throwable {
        test.getLandingpage().selectServicesOption();
    }

    @And("^I enter message in contact form$")
    public void iEnterMessageInContactForm() throws Throwable {
        test.getLandingpage().enterMessage(test.getUser().getMessage());
    }

    @And("^I select I'm not a robot option$")
    public void iSelectIMNotARobotOption() throws Throwable {
        test.getLandingpage().aaa();
    }

    @Then("^form is sent$")
    public void formIsSent() throws Throwable {
        test.getLandingpage().waitUntilMessageVisible();
        assertThat(test.getLandingpage().isSuccessMessageVisible()).isTrue();
    }
}
