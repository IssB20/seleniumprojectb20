package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6_HeaderVerification {

    public static void main(String[] args) {

      /*
      TC #6: Zero Bankheader verification
      1.Open Chrome browser
      2.Go to http://zero.webappsecurity.com/login.html
      3.Verify header text Expected: “Log in to ZeroBank”
       */


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");

       // WebElement header = driver.findElement(By.tagName("h3")); // find element WebElement
        driver.findElement(By.tagName("h3")); // find element WebElement

        String actualText = driver.findElement(By.tagName("h3")).getText(); // return string
        String expectedText = "Log in to ZeroBank";

        if (expectedText.equals(actualText)){
            System.out.println("Header Verification PASSED!");
        }else {
            System.out.println("Header Verification FAILED!");
        }

        driver.close();




    }
}
