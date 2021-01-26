package com.automation.pageObjects;

import com.automation.tools.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyAccountPO extends Tools {

    //Personal Profile Info

    static synchronized public WebElement emailAddressProfileInfo() throws Exception {
        return findElementBy(By.id("EmailAddress"));
    }

    static synchronized public WebElement password() throws Exception {
        return findElementBy(By.id("Password"));
    }

    static synchronized public WebElement confirmPassword() throws Exception {
        return findElementBy(By.id("ConfirmPassword"));
    }
    static synchronized public WebElement firstName() throws Exception {
        return findElementBy(By.id("FirstName"));
    }

    static synchronized public WebElement lastName() throws Exception {
        return findElementBy(By.id("LastName"));
    }
    static synchronized public WebElement country() throws Exception {
        return findElementBy(By.name("CountryId_input"));
    }
    static synchronized public WebElement stateRegion() throws Exception {
        return findElementBy(By.id("ConfirmPassword"));
    }
    static synchronized public WebElement city() throws Exception {
        return findElementBy(By.id("ConfirmPassword"));
    }


}
