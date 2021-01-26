package com.automation.pageObjects;

import com.automation.tools.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class FirstTimeUserPagePO extends Tools {

    static synchronized public WebElement getFirstTimeUserButton() throws Exception {
        return findElementBy(By.id("btnFirstTimeUser")) ;
    }

    static synchronized public WebElement emailAddress() throws Exception {
        return findElementBy(By.id("txtEmail")) ;
    }

    static synchronized public WebElement continueButton() throws Exception {
        return findElementBy(By.id("btnContinue")) ;
    }

    static synchronized public WebElement cancelButton() throws Exception {
        return findElementBy(By.id("btnCancel"));
    }

    static synchronized public WebElement welcomeText() throws Exception {
        return findElementBy(By.className("form-group"));
    }







}
