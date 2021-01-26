package com.automation.steps;

import com.automation.tools.BrowserType;
import com.automation.tools.Tools;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static com.automation.pageObjects.FirstTimeUserPagePO.*;
import static com.automation.pageObjects.MyAccountPO.*;

public class JigsawSteps extends Tools {


    @Given("^open Jigsaw web application$")
    public void open_Jigsaw_web_application() throws Throwable {
        buildDriver(BrowserType.CHROME);
    }

    @When("^click on the First time user button$")
    public void clickTheFirstTimeUserButton() throws Throwable{
        getFirstTimeUserButton().click();
    }

    @And("^verify that Login page is open$")
    public void verifyThatLoginPageIsOpen() throws Throwable{

        String welcomeTextToBeVerified=welcomeText().getText();
        Assert.assertTrue("Text Not found",welcomeTextToBeVerified.contains("Welcome! Please enter your email address to continue."));
        emailAddress().isDisplayed();
        continueButton().isDisplayed();
        cancelButton().isDisplayed();
    }

    @And("^enter a valid email address$")
    public void enterEmail() throws Throwable{
        emailAddress().sendKeys("zetnova@abv.bg");
    }

    @And("^click the Continue button$")
    public void pressContinue() throws Throwable{
        continueButton().click();
    }

    @And("^verify that My Profile page is open and assert that your email address is pre-populated in the Email address field$")
    public void verifyEmailAddress() throws Throwable{
       String emailFieldPersonalInfo= emailAddressProfileInfo().getAttribute("value");
       Assert.assertTrue("Email is not added in email address field" , emailFieldPersonalInfo.equals("zetnova@abv.bg"));
       password().isDisplayed();
       confirmPassword().isDisplayed();
       firstName().isDisplayed();
       lastName().isDisplayed();
    }

    @And("^fill up the required fields and close the page$")
    public void fillUpRequiredFields() throws Throwable{
        password().sendKeys("111222AAABBB");
        confirmPassword().sendKeys("111222AAABBB");
        firstName().sendKeys("Zdravko");
        lastName().sendKeys("Stoychev");
        country().sendKeys("Spain");
        stateRegion().sendKeys("Madrid");
        city().sendKeys("Madrid");

        destroyDriver();
    }





}




