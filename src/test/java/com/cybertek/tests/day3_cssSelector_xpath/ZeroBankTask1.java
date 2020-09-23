package com.cybertek.tests.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankTask1 {
    /*
    TC #1: Zero Bank title verification
    1.Open Chrome browser
    2.Go to http://zero.webappsecurity.com/login.html
    3.Verify titleExpected: “Zero - Log in”
     */
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");

        String expectedTitle="Zero - Log in";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("Title Verification Passed!!");
        }else{
            System.out.println("Title Verification Failed!!");
        }

    }
}
