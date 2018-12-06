package stepdefinitions;


import General.TestContext;

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


    @Given("^I have opened landing page$")
    public void iHaveOpenedLandingPage() {
        test.getNavigation().waitUntilpageLoadingIsFinished();
        assertThat(test.getNavigation().isMyAccountButtonVisible()).isTrue();
        assertThat(test.getNavigation().isLogovisible()).isTrue();
    }

    @When("^I select My Account menu$")
    public void iSelectMyAccountMenu() {
        //System.out.println("OPEN HOMEPAGE");
        test.getNavigation().selectMyAccountButton();
    }

    @And("^I select Sign up menu$")
    public void iSelectSignUpMenu() {
        //System.out.println("OPEN HOMEPAGE");
        test.getNavigation().selectSignUpButton();
    }

    @And("^I enter valid first name in signup form$")
    public void iEnterValidFirstNameInSignupForm() {
        //System.out.println("OPEN HOMEPAGE");
        test.getSignuupPage().enterFirstName(test.getUser().getFirstName());
    }

    @And("^I enter valid last name in signup form$")
    public void iEnterValidLastNameInSignupForm() {
        //System.out.println("OPEN HOMEPAGE");
        test.getSignuupPage().enterLastName(test.getUser().getLastName());
    }

    @And("^I enter valid mobile number in signup form$")
    public void iEnterValidMobileNumberInSignupForm() {
        //System.out.println("OPEN HOMEPAGE");
        test.getSignuupPage().enterMobileNumber(test.getUser().getMobileNumber());
    }

    @And("^I enter valid email address in signup form$")
    public void iEnterValidEmailAddressInSignupForm() {
        //System.out.println("OPEN HOMEPAGE");
        test.getSignuupPage().enterEmail(test.getUser().getEmailAddress());
    }

    @And("^I enter password in signup form$")
    public void iEnterPasswordInSignupForm() {
        //System.out.println("OPEN HOMEPAGE");
        test.getSignuupPage().enterPassword(test.getUser().getPassword());
    }

    @And("^I re-enter password in signup form$")
    public void iReEnterPasswordInSignupForm() {
        //System.out.println("OPEN HOMEPAGE");
        test.getSignuupPage().enterConfirmationPassword(test.getUser().getPassword());
    }

    @And("^I select SIGN UP button$")
    public void iSelectSIGNUPButton() {
        //System.out.println("OPEN HOMEPAGE");
        test.getSignuupPage().selectSignUpButton();
    }

    @Then("^dashboard is opened$")
    public void dashboardIsOpened() {
        assertThat(test.getAccountPage().getGreetingsText()).isEqualTo("Hi, " + test.getUser().getFirstName() + " " + test.getUser().getLastName());
        test.getNavigation().waitUntilpageLoadingIsFinished();
        test.getAccountPage().waitUntilLogoLoadingIsFinished();
        assertThat(test.getAccountPage().isUserLogoVisible()).isTrue();
    }

    @And("^Sign Up page is opened$")
    public void signUpPageIsOpened() {
        test.getNavigation().waitUntilpageLoadingIsFinished();
        assertThat(test.getSignuupPage().isSignUpFormVisible()).isTrue();
    }
}
