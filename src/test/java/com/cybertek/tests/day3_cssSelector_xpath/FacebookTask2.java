package com.cybertek.tests.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTask2 {
     /*
        TC #2: Facebook incorrect login title verification
        1.Open Chrome browser
        2.Go to https://www.facebook.com
        3.Enter incorrect username
        4.Enter incorrect password
        5.Verify title changed to: Expected: “Log into Facebook | Facebook”
         */

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        driver.findElement(By.id("email")).sendKeys("islem@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("islem79");
        driver.findElement(By.name("login")).click();

        Thread.sleep(5000);

        //System.out.println(driver.getTitle());

        String expectedTitle = "Log into Facebook | Facebook";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Passed!!");
        }else{
            System.out.println("Failed!!");
        }

        /*
        if (driver.getTitle().equals("Log into Facebook | Facebook")){
            System.out.println("Title Verification Passed!!");
        }else{
            System.out.println("Title Verification Failed!!");
        }
         */


       // driver.close();

    }
}
