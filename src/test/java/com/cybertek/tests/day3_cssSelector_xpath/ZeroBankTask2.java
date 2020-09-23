package com.cybertek.tests.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankTask2 {
    /*
    TC #2: Zero Bank link text verification
    1.Open Chrome browser
    2.Go to http://zero.webappsecurity.com/login.html
    3.Verify link text from top left:Expected: “Zero Bank”
    4.Verify link href attribute value contains:Expected: “index.html”
     */

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");

        String expectedLinkText = "Zero Bank";
        String actualLinkText = driver.findElement(By.partialLinkText("Zero")).getText();
        System.out.println(actualLinkText);

        if (expectedLinkText.equals(actualLinkText)){
            System.out.println("Verification Passed!!");
        }else{
            System.out.println("Verification Failed!!");
        }

        String expectedInHREF = "index.html";
        String actualHREF = driver.findElement(By.className("brand")).getAttribute("href");
        System.out.println(actualHREF);

        if (actualHREF.contains(expectedInHREF)){
            System.out.println("Verification Passed!!: "+expectedInHREF+" is contained in "+actualHREF);
        }else{
            System.out.println(expectedInHREF+" is not contained in "+actualHREF);
        }
    }
}
