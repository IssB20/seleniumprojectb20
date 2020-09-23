package com.cybertek.tests.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeaderVerification2 {
    /*
    TC #4: Facebook header verification
    1.Open Chrome browser
    2.Go to https://www.facebook.com
    3.Verify “Create a page” link href value contains text: Expected: “registration_form”
     */
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");



        String actualHref = driver.findElement(By.className("_8esh")).getAttribute("href");

        String expectedInHref = "registration_form";

        if (actualHref.contains(expectedInHref)){
            System.out.println("Verification Passed!!");
        }else{
            System.out.println("Verification Failed!!");
        }

        System.out.println(actualHref);


    }
}
