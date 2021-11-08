package com.example.stepdefinitions;

import com.example.pageobjects.ContactUsPage;
import com.example.pageobjects.HomePage;
import com.example.utilities.PropertiesFileReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeSteps {
    WebDriver driver;
    PropertiesFileReader propertiesFileReader = new PropertiesFileReader();
    HomePage homePage;
    ContactUsPage contactUsPage;

    public HomeSteps()
    {
        this.driver = Hooks.driver;
    }

    @Given("Launch Application")
    public void LaunchApplication()
    {
        driver.manage().window().maximize();
        driver.get(propertiesFileReader.getApplicationUrl());
    }

    @And("I see the home page")
    public void IseetheHomePage() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.verifyHomeLandingPage();
        Thread.sleep(1000);
    }

    @And("I Navigate to Contact us page")
    public void INavigateToContactusPage() throws InterruptedException {
        homePage.clickContactUsButton();
        Thread.sleep(1000);
        contactUsPage = new ContactUsPage(driver);
        contactUsPage.verifyContactusLandingPage();
    }

}
