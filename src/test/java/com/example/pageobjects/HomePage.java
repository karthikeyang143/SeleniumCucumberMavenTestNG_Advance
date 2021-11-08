package com.example.pageobjects;

import com.example.stepdefinitions.Hooks;
import com.example.utilities.PropertiesFileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage {

    WebDriver driver;
    PropertiesFileReader propertiesFileReader = new PropertiesFileReader();

    By lnk_Signin_Login = By.xpath("//a[@class='login'][contains(text(),'Sign in')]");
    By lnk_Contactus_Login = By.xpath("//div[@id='contact-link']/a[contains(text(),'Contact us')]");

    //Constructor to maintain the driver session
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void clickContactUsButton()
    {
        driver.findElement(lnk_Contactus_Login).click();
    }
    public void clickSigninButton()
    {
        driver.findElement(lnk_Signin_Login).click();
    }
    public void verifyHomeLandingPage() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(lnk_Signin_Login).isDisplayed());
    }

}
