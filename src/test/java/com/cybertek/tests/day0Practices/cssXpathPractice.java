package com.cybertek.tests.day0Practices;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cssXpathPractice {

    public static void main(String[] args) throws  InterruptedException{

       /*
       TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
       1. Open Chrome browser
       2. Go to http://practice.cybertekschool.com/forgot_password
       3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
           a. “Home” link
           b. “Forgot password” header
           c. “E-mail” text
           d. E-mail input box
           e. “Retrieve password” button
           f. “Powered by Cybertek School” text
       4. Verify all WebElements are displayed.
       Better if you do with both XPATH and CSS selector for practice purposes
        */


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //locate by cssSelector:
        boolean homeLinkDisplayed1 = driver.findElement(By.cssSelector("a[class='nav-link']")).isDisplayed();
        driver.findElement(By.cssSelector("a.nav-link")).click();
        System.out.println("displayed Home Link = " + homeLinkDisplayed1);

        Thread.sleep(3000);
        driver.navigate().back();
        /*
        if (homeLinkDisplayed){
            System.out.println("Home link Verification Passed!!");
        }else{
            System.out.println("Home link Verification Failed!!");
        }
         */


        // locate by Xpath:
        //driver.findElement(By.xpath("//li[@class='nav-item']")).click();
      //  driver.findElement(By.xpath("//*[@class='nav-item']")).click();
        Thread.sleep(3000);
        boolean displayedHomeLink2 = driver.findElement(By.xpath("//a[.='Home']")).isDisplayed();
        System.out.println("displayed Home link = " + displayedHomeLink2);

       // locate “Forgot password” header:
        boolean displayedForgotPassword = driver.findElement(By.xpath("//h2[.='Forgot Password']")).isDisplayed();
        System.out.println("displayedForgotPassword = " + displayedForgotPassword);

      // locate “E-mail” text:
        boolean displayedEmailText1 = driver.findElement(By.cssSelector("label[for='email']")).isDisplayed();
        System.out.println("displayedEmailText1 = " + displayedEmailText1);

        // by xpath
        boolean displayedEmailText2 = driver.findElement(By.xpath("//label[.='E-mail']")).isDisplayed();
        System.out.println("displayedEmailText2 = " + displayedEmailText2);

     // locate E-mail input box:
        //by cssSelector:
        boolean displayedEmailBox1 = driver.findElement(By.cssSelector("input[type='text']")).isDisplayed();
        System.out.println("displayedEmailBox1 = " + displayedEmailBox1);

        //by xpath:
        WebElement emailBoxElement = driver.findElement(By.xpath("//input[@name='email']"));
        boolean displayedEmailBox2 = emailBoxElement.isDisplayed();
        System.out.println("displayedEmailBox2 = " + displayedEmailBox2);

    //Locate “Retrieve password” button:
        // by ccsSelector:
        WebElement retrievePasswordElement1 = driver.findElement(By.cssSelector("button#form_submit"));
        boolean retrievePasswordDisplayed1 = retrievePasswordElement1.isDisplayed();
        System.out.println("retrieveButtonDisplayed1 = " + retrievePasswordDisplayed1);

        // by xpath:
        WebElement retrievePasswordElement2 = driver.findElement(By.xpath("//i[.='Retrieve password']"));
        boolean retrievePasswordDisplayed2 = retrievePasswordElement2.isDisplayed();
        System.out.println("retrievePasswordDisplayed2 = " + retrievePasswordDisplayed2);

    // Locate “Powered by Cybertek School” text:
        // by cssSelector:
        WebElement poweredByCybertekElement1 = driver.findElement(By.cssSelector("div[style='text-align: center;']"));
        boolean poweredByCybertekSchoolDisplayed1 = poweredByCybertekElement1.isDisplayed();
        System.out.println("poweredByCybertekSchoolDisplayed1 = " + poweredByCybertekSchoolDisplayed1);

        // by xpath:
        WebElement poweredByCybertekSchoolElement = driver.findElement(By.xpath("//div[@style='text-align: center;']"));
        boolean poweredByCyberteElementDisplayed = poweredByCybertekSchoolElement.isDisplayed();
        System.out.println("poweredByCyberteElementDisplayed = " + poweredByCyberteElementDisplayed);

        String text = poweredByCybertekSchoolElement.getText();
        System.out.println("text = " + text);

    }

}
