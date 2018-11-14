package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignupSteps {
    @Given("^I have opened landing page$")
    public void iHaveOpenedLandingPage() throws Throwable {
        System.out.println("OPEN HOMEPAGE");
    }

    @When("^I select My Account menu$")
    public void iSelectMyAccountMenu() throws Throwable {
        //System.out.println("OPEN HOMEPAGE");
        selectMyAccountMenu();
    }

    @And("^I select Sign up menu$")
    public void iSelectSignUpMenu() throws Throwable {
        //System.out.println("OPEN HOMEPAGE");
        sleectSignUpButton();
    }

    @And("^I enter valid first name in signup form$")
    public void iEnterValidFirstNameInSignupForm() throws Throwable {
        //System.out.println("OPEN HOMEPAGE");
        enterFirstName();
    }

    @And("^I enter valid last name in signup form$")
    public void iEnterValidLastNameInSignupForm() throws Throwable {
        //System.out.println("OPEN HOMEPAGE");
        enterLastName();
    }

    @And("^I enter valid mobile number in signup form$")
    public void iEnterValidMobileNumberInSignupForm() throws Throwable {
        //System.out.println("OPEN HOMEPAGE");
        enterMobileNumber();
    }

    @And("^I enter valid email address in signup form$")
    public void iEnterValidEmailAddressInSignupForm() throws Throwable {
        //System.out.println("OPEN HOMEPAGE");
        enterEmail();
    }

    @And("^I enter password in signup form$")
    public void iEnterPasswordInSignupForm() throws Throwable {
        //System.out.println("OPEN HOMEPAGE");
        enterPassword();
    }

    @And("^I re-enter password in signup form$")
    public void iReEnterPasswordInSignupForm() throws Throwable {
        //System.out.println("OPEN HOMEPAGE");
        confirmPassword();
    }

    @And("^I select SIGN UP button$")
    public void iSelectSIGNUPButton() throws Throwable {
        //System.out.println("OPEN HOMEPAGE");
        selectSignUpButton();
    }

    @Then("^dashboard is opened$")
    public void dashboardIsOpened() throws Throwable {
        System.out.println("OPEN HOMEPAGE");
    }
}
