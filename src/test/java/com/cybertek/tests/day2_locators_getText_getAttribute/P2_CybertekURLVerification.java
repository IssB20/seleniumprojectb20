package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekURLVerification {
    /*
     TC #2: Cybertek verifications
     1.Open Chrome browser
     2.Go to http://practice.cybertekschool.com
     3.Verify URL containsExpected: cybertekschool
     4.Verify title: Expected: Practice
     */

    public static void main(String[] args) {
       // 1 - I need to set up my Browser driver
        WebDriverManager.chromedriver().setup();

       // 2- create instance of chrome browser from WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();// this will maximize the newly opened browser page

      // 3- navigate to the url and verify URL Contains
        driver.navigate().to("http://practice.cybertekschool.com");

        String expectedInUrl = "cybertekschool";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedInUrl)){
            System.out.println("URL Verification PASSED!");
        }else{
            System.out.println("URL Verification FAILED!");
        }


     // 4- verify Actual title & Expected Title => Practice

     if (driver.getTitle().equals("Practice")){
         System.out.println("Title Verification PASSED!");
     }else{
         System.out.println("Title Verification FAILED!");
     }

        driver.close();










    }
}
