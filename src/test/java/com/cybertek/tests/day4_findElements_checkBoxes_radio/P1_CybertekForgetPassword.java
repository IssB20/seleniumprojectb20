package com.cybertek.tests.day4_findElements_checkBoxes_radio;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_CybertekForgetPassword {

    public static void main(String[] args) {

        //TC #3: PracticeCybertek/ForgotPassword URL verification
        // 1.Open Chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // 2.Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

       //3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
          // a. “Home” link
          // using the text of the anchor tag to locate a
             WebElement homeLink = driver.findElement(By.xpath("//a[.='Home']"));

         // using href attribute value:
         // WebElement homeLink = driver.findElement(By.xpath("//a[@href='/']"));

          // b. “Forgot password” header
             WebElement forgetPasswordHeader = driver.findElement(By.xpath("//h2[.='Forgot Password']"));

          // c. “E-mail” text
        WebElement emailLabel = driver.findElement(By.xpath("//label[@for='email']"));


          // d. E-mail input box
        WebElement emailBox = driver.findElement(By.xpath("//input[@name='email']"));

          // e. “Retrieve password” button
              // using cssSelector
                // option1 = button#form_submit
                // option2 = button[id='form_submit']
                // option3 = button[id='radius']
        WebElement passwordButton = driver.findElement(By.cssSelector("button.radius"));


          // f. “Powered by Cybertek School” text

        WebElement linkText = driver.findElement(By.xpath("//a[.='Cybertek School']")); // will return the link only
        WebElement poweredByDiv = driver.findElement(By.xpath("//div[@style='text-align: center;']")); // will return powered by Cybertek School

        System.out.println("linkText = " + linkText.getText());
        System.out.println("poweredByDiv = " + poweredByDiv.getText());


        //4. Verify all WebElements are displayed.
        // .isDisplayed --> return true if web element is displayed
        // .isDisplayed --> return false if web element is not displayed

        if (homeLink.isDisplayed() && forgetPasswordHeader.isDisplayed() && emailBox.isDisplayed() && emailLabel.isDisplayed()
                && passwordButton.isDisplayed() && poweredByDiv.isDisplayed() ){
            System.out.println("Web element Verification Passed!!");
        }else{
            System.out.println("Eb element verification Failed!!");
        }



    }
}
