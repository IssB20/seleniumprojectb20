package com.cybertek.tests.day4_findElements_checkBoxes_radio;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cybertek {

    public static void main(String[] args)  throws InterruptedException{
        /*
        TC #3: PracticeCybertek/ForgotPassword URL verification
        1.Open Chrome browser
        2.Go to http://practice.cybertekschool.com/forgot_password
        3.Enter any email into input box
        4.Click on Retrieve password
        5.Verify URL contains: Expected: “email_sent”
        6.Verify textBox displayed the content as expected.
        Expected: “Your e-mail’s been sent!”
         */


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.manage().window().maximize();


        driver.findElement(By.name("email")).sendKeys("islem@gmail.com");
        driver.findElement(By.tagName("i")).click();



        String expectedInTitle ="email_sent";
        String actualUrl = driver.getCurrentUrl();

        Thread.sleep(5000);

        if (actualUrl.contains(expectedInTitle)){
            System.out.println("URL Verification Passed!!");
        }else {
            System.out.println("URL Verification Failed!!");
        }

        Thread.sleep(5000);

        String expectedTextBox = "Your e-mail's been sent!";
        String actualTextBox = driver.findElement(By.tagName("h4")).getText();

        if (expectedTextBox.equals(actualTextBox)){
            System.out.println("TextBox Verification Passed!!");
        }else{
            System.out.println("Textbox Verification Failed!!");
        }



    }
}
