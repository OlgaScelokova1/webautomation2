package stepdefinitions;


import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.header.NavigationPageObject;
import pages.signuppage.SignupPageObject;
import General.User;
import static utils.RandomGenerator.*;

public class SignupSteps {
    NavigationPageObject homepage = new NavigationPageObject();
    SignupPageObject signuppage = new SignupPageObject();
    private User user = new User();

    @Given("^I have opened landing page$")
    public void iHaveOpenedLandingPage() throws Throwable {
        System.out.println("OPEN HOMEPAGE");
    }

    @When("^I select My Account menu$")
    public void iSelectMyAccountMenu() throws Throwable {
        //System.out.println("OPEN HOMEPAGE");
        homepage.selectMyAccountButton();
    }

    @And("^I select Sign up menu$")
    public void iSelectSignUpMenu() throws Throwable {
        //System.out.println("OPEN HOMEPAGE");
        homepage.selectSignUpButton();
    }

    @And("^I enter valid first name in signup form$")
    public void iEnterValidFirstNameInSignupForm() throws Throwable {
        //System.out.println("OPEN HOMEPAGE");
        signuppage.enterFirstName(user.getFirstName());
    }

    @And("^I enter valid last name in signup form$")
    public void iEnterValidLastNameInSignupForm() throws Throwable {
        //System.out.println("OPEN HOMEPAGE");
        signuppage.enterLastName(user.getLastName());
    }

    @And("^I enter valid mobile number in signup form$")
    public void iEnterValidMobileNumberInSignupForm() throws Throwable {
        //System.out.println("OPEN HOMEPAGE");
        signuppage.enterMobileNumber(user.getMobileNumber());
    }

    @And("^I enter valid email address in signup form$")
    public void iEnterValidEmailAddressInSignupForm() throws Throwable {
        //System.out.println("OPEN HOMEPAGE");
        signuppage.enterEmail(user.getEmailAddress());
    }

    @And("^I enter password in signup form$")
    public void iEnterPasswordInSignupForm() throws Throwable {
        //System.out.println("OPEN HOMEPAGE");
        signuppage.enterPassword(user.getPassword());
    }

    @And("^I re-enter password in signup form$")
    public void iReEnterPasswordInSignupForm() throws Throwable {
        //System.out.println("OPEN HOMEPAGE");
        signuppage.enterConfirmationPassword(user.getPassword());
    }

    @And("^I select SIGN UP button$")
    public void iSelectSIGNUPButton() throws Throwable {
        //System.out.println("OPEN HOMEPAGE");
        signuppage.selectSignUpButton();
    }

    @Then("^dashboard is opened$")
    public void dashboardIsOpened() throws Throwable {
        System.out.println("OPEN HOMEPAGE");
    }
}
