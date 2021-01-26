package com.automation.tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class Tools {

    public static String url = "https://app.dev.jigsawinteractive.com/";



    public static synchronized void buildDriver(BrowserType type) {
        SeleniumWebDriver.setWebDriver(type);
        SeleniumWebDriver.getWebDriver().get(url);
    }

    public static synchronized WebElement findElementBy(By by) throws Exception {
        WebElement element = null;
        int br = 1;
        while (br <= 5) {
            try {
                br++;
                SeleniumWebDriver.getWebDriver().manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
                WebDriverWait wait = new WebDriverWait(SeleniumWebDriver.getWebDriver(), 40);
                element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
                SeleniumWebDriver.getWebDriver().manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
                return element;
            } catch (Exception e) {
                if (br == 5) {
                    destroyDriver();
                    throw e;
                }
                try {
                    Thread.sleep(500);
                } catch (Exception exc) {
                }
            }
        }
        return element;
    }


    public static synchronized void destroyDriver() {
        SeleniumWebDriver.getWebDriver().quit();
    }




        }












