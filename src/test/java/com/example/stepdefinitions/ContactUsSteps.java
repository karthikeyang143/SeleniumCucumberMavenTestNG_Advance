package com.example.stepdefinitions;

import com.example.pageobjects.ContactUsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class ContactUsSteps {
    WebDriver driver;
    ContactUsPage contactUsPage;

    public ContactUsSteps()
    {
        this.driver = Hooks.driver;
    }

    @When("I fill the contact us page with required details")
    public void IFillTheContactUsPageWithRequiredDetails() throws InterruptedException {
        Thread.sleep(1000);
        contactUsPage = new ContactUsPage(driver);
        contactUsPage.Fill_ContactUs_Details();
    }
    @Then("I submit the contact us details")
    public void ISubmitTheContactUsDetails() throws InterruptedException {
        contactUsPage.clickSendButton();
    }
    @And("I see the success message")
    public void ISeeTheSuccessMessage() throws InterruptedException {
        contactUsPage.verifyContactusLandingPage();
    }
}
