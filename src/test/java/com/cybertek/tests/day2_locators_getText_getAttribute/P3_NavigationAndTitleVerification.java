package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_NavigationAndTitleVerification {

    public static void main(String[] args) {


        /*
        TC #3: Back and forth navigation
        1-Open a chrome browser
        2-Go to: https://google.com
        3-Click to Gmail from top right.
        4-Verify title contains:Expected: Gmail
        5-Go back to Google by using the .back();
        6-Verify title equals Expected: Google
         */


        //1 setup and open chrome browser
        WebDriverManager.chromedriver().setup();

        //2-open new chrome browser
        WebDriver driver = new ChromeDriver();

        //3- navigate to www.google.com
        driver.get("https://google.com");

        //4- clique Gmail from top right
        //driver.findElement(By.linkText("Gmail")).click();
         driver.findElement(By.partialLinkText("mail")).click();// find link using partialLinkText

        String expectedInTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if (driver.getTitle().contains("Gmail")){
            System.out.println("Gmail Title Verification PASSED!");
        }else{
            System.out.println("Gmail Title Verification FAILED!");
        }

        //5- go back to previous page
        driver.navigate().back();

        if (driver.getTitle().equals("Google")){
            System.out.println("Google Title Verification PASSED!");
        }else{
            System.out.println("Google Title Verification FAILED!");
        }

        driver.close();







    }
}
