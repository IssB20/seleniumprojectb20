package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1_GoogleTitleVerification {
    /*
    TC #1: Google Title Verification
           1.Open Chrome browser
           2.Go to https://www.google.com
           3.Verify title
           Expected: Google
     */

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup(); // set up the browser driver
        WebDriver driver = new ChromeDriver(); // create an instance of the ChromeDriver and  opens empty browser

        driver.navigate().to("http://google.com");  // or driver.get("https://google.com")

        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("Title Verification PASSED!");
        }else{
            System.out.println("Title Verification FAILED! ");
        }

        driver.close();





    }
}
