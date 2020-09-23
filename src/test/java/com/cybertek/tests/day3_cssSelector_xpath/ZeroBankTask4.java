package com.cybertek.tests.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankTask4 {
    //TC #4: Zero Bank login title verification
    // 1.Open Chrome browser
    // 2.Go to http://zero.webappsecurity.com/login.html
    // 3.Enter username: username
    // 4.Enter password: password
    // 5.Click to “Account Activity” link
    // 6.Verify title changed to:Expected: “Zero –Account Activity”
    // 7.Click to “Transfer Funds” link
    // 8.Verify title changed to:Expected: “Zero –Transfer Funds”
    // 9.Click to “Pay Bills” link
    // 10.Verify title changed to:Expected: “Zero -Pay Bills”
    // 11.Click to “My Money Map” link
    // 12.Verify title changed to:Expected: “Zero –My Money Map”
    // 13.Click to “Online Statements” link
    // 14.Verify title changed to:Expected: “Zero –Online Statements”•

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");
        driver.findElement(By.name("user_login")).sendKeys("username");
        //Thread.sleep(3000);
        driver.findElement(By.id("user_password")).sendKeys("password"+ Keys.ENTER);
        //Thread.sleep(2000);

        driver.findElement(By.id("account_activity_tab")).click();
       // Thread.sleep(2000);
        String expectedTitle = "Zero - Account Activity";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("Title Verification Passed!!");
        }else{
            System.out.println("Title Verification Failed!!");
        }

        //driver.findElement(By.id("transfer_funds_tab")).click();
        driver.findElement(By.linkText("Transfer Funds")).click();

        String transferFundTitle = "Zero - Transfer Funds";
        String actualTransferFundTitle = driver.getTitle();

        if (transferFundTitle.equals(actualTransferFundTitle)){
            System.out.println("Transfer Fund Title Passed!!");
        }else{
            System.out.println("Transfer Fund Title Failed!!");
        }

        driver.findElement(By.id("pay_bills_tab")).click();

        if (driver.getTitle().equals("Zero - Pay Bills")){
            System.out.println("Pay Bill Title Passed!!");
        }else{
            System.out.println("Pay Bills Title Failed!!");
        }

        driver.findElement(By.id("money_map_tab")).click();

        if (driver.getTitle().equals("Zero - My Money Map")){
            System.out.println("My Money Map title Passed!!");
        }else{
            System.out.println("My Money Map title Failed!!");
        }

        driver.findElement(By.id("online_statements_tab")).click();

        if (driver.getTitle().equals("Zero - Online Statements")){
            System.out.println("Statements Title Passed!!");
        }else{
            System.out.println("Statements Title Failed!!");
        }

    }
}
