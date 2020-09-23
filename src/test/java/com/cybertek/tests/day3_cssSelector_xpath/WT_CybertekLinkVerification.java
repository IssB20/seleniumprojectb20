package com.cybertek.tests.day3_cssSelector_xpath;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WT_CybertekLinkVerification {
    public static void main(String[] args) {


        //TC #3: PracticeCybertek/ForgotPassword URL verification
        // 1.Open Chrome browser
        // 2.Go to http://practice.cybertekschool.com/forgot_password
        // 3.Enter any email into input box
        // 4.Click on Retrieve password
        // 5.Verify URL contains: Expected: “email_sent”
        // 6.Verify textBox displayed the content as expected.
        // Expected: “Your e-mail's been sent!”

     //   WebDriverManager.chromedriver().setup();
     //   WebDriver driver = new ChromeDriver();

        WebDriver driver = WebDriverFactory.getDriver("asdfrg"); // using static method getDriver();

        driver.get("http://practice.cybertekschool.com/forgot_password");

       // driver.findElement(By.name("email")).sendKeys("anyemail@domain.com");
        WebElement emailInputBox = driver.findElement(By.name("email"));
        emailInputBox.sendKeys("anyemail@domain.com");


        //driver.findElement(By.id("form_submit")).click();
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        String expectedInUrl = "email_sent";
        String actualUrl = driver.getCurrentUrl();

        if ( actualUrl.contains(expectedInUrl)){
            System.out.println("URL Verification Passed!!");
        }else {
            System.out.println("URL Verification Failed!!");
        }


        String expectedText = "Your e-mail's been sent!";
       //  driver.findElement(By.name("confirmation_message")).getText();
        WebElement confirmationMessage = driver.findElement(By.name("confirmation_message"));
        String actualText = confirmationMessage.getText();

        System.out.println("Actual Text: "+ actualText);
        System.out.println("Expected Text: "+ expectedText);

        if ( actualText.equals( expectedText)){
            System.out.println("Header Text Verification Passed!");
        }else{
            System.out.println("Header Text Verification Failed!");
        }

        if (confirmationMessage.isDisplayed()){
            System.out.println("Confirmation message is displayed. Verification passed!");
        }else {
            System.out.println("Confirmation message is Not displayed. Verification Failed!");
        }


        /*
        boolean isDisplayed = driver.findElement(By.name("confirmation_message")).isDisplayed();
        System.out.println(isDisplayed);
         */


    }
}
