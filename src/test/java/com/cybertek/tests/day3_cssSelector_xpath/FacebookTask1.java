package com.cybertek.tests.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTask1 {
    /*
    TC #1: Facebook title verification
    1.Open Chrome browser
    2.Go to https://www.facebook.com
    3.Verify title: Expected: “Facebook -Log In or Sign Up”
     */
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        System.out.println(driver.getTitle());
        if (driver.getTitle().equals("Facebook - Log In or Sign Up")){
            System.out.println("Title Verification Passed!!");
        }else{
            System.out.println("Title Verification Failed!!");
        }
        driver.close();

        System.out.println("========================================");





    }
}
