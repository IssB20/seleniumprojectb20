package com.cybertek.tests.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeaderVerification1 {
    /*
    TC #3: Facebook header verification
    1.Open Chrome browser
    2.Go to https://www.facebook.com
    3.Verify header text is as expected: Expected: “Connect with friends and the world around you on Facebook.”
     */

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(); // will open empty chrome browser
        driver.get("https://www.facebook.com");

        String actualHeader = driver.findElement(By.tagName("h2")).getText();
        String expectedHeader = "Connect with friends and the world around you on Facebook.";

        System.out.println("Actual Header: "+actualHeader);

        if (actualHeader.equals(expectedHeader)){
            System.out.println("Header Verification Passed!!");
        }else{
            System.out.println("Header Verification Failed!!");
        }



    }
}
