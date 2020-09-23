package com.cybertek.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SmartBearUtilities {

            //Mini-Task:
            //#1- Create a new class called : SmartBearUtilities
            //#2- Create a static method called loginToSmartBear
            //#3- This method simply logs in to SmartBear when you call it.
            //#4- Accepts WebDriver type as parameter
            //BREAK UNTIL: 3.10PM CST - 4.10PM EST

            public static void  loginToSmartBear(WebDriver driver){
                /*
                driver =  WebDriverFactory.getDriver("chrome");
                driver.manage().window().maximize();
                driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

                 */
                driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("tester"+ Keys.ENTER);
                driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
                driver.findElement(By.id("ctl00_MainContent_login_button")).click();
            }

            WebDriver driver;
            @Test
            public void test(){
                com.cybertek.Utilities.SmartBearUtilities.loginToSmartBear(driver);
            }
        }


