package com.example.pageobjects;

import com.example.stepdefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ContactUsPage {

    WebDriver driver;

    By hdr_Contactus = By.xpath("//*[contains(text(),'Customer service - Contact us')]");
    By lst_SubjectHandling_Contactus = By.id("id_contact");
    By txt_Email_Contactus = By.id("email");
    By txt_OrderRef_Contactus = By.id("id_order");
    By txt_Message_Contactus = By.id("message");
    By btn_Send_Contactus = By.xpath("//button[@id='submitMessage']/span");
    By txt_SuccessMsg_Contactus = By.xpath("//*[text()='Your message has been successfully sent to our team.']");

    //Constructor to maintain the driver session
    public ContactUsPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void selectSubjectHandling(String strInput)
    {
        Select lstSubject = new Select(driver.findElement(lst_SubjectHandling_Contactus));
        lstSubject.selectByVisibleText(strInput);
    }
    public void enterEmail(String strInput)
    {
        driver.findElement(txt_Email_Contactus).sendKeys(strInput);
    }
    public void enterOrderRef(String strInput)
    {
        driver.findElement(txt_OrderRef_Contactus).sendKeys(strInput);
    }
    public void enterMessage(String strInput)
    {
        driver.findElement(txt_Message_Contactus).sendKeys(strInput);
    }
    public void clickSendButton()
    {
        driver.findElement(btn_Send_Contactus).click();
    }

    public void verifyContactusLandingPage() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(hdr_Contactus).isDisplayed());
    }
    public void Fill_ContactUs_Details()
    {
        selectSubjectHandling("Customer service");
        enterEmail("test@gmail.com");
        enterOrderRef("Order12345");
        enterMessage("Hi, This is a test message");
    }
    public void verifyContactusSuccessMsg() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(driver.findElement(txt_SuccessMsg_Contactus).isDisplayed());
    }

}
