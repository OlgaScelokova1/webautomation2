package stepdefinitions;


import General.TestContext;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class ContactFormSteps {
    private TestContext test;
    public ContactFormSteps(TestContext testContext){
        this.test = testContext;
    }



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


    @Then("^form is sent$")
    public void formIsSent() throws Throwable {
        test.getLandingpage().waitUntilMessageVisible();
        assertThat(test.getLandingpage().isSuccessMessageVisible()).isTrue();
    }

    @And("^I send contact message$")
    public void iSendContactMessage() throws Throwable {
        test.getLandingpage().sendContactForm();
    }
}
