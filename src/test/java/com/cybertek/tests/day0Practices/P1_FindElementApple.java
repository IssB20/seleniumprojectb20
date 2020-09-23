package com.cybertek.tests.day0Practices;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P1_FindElementApple {

    public static void main(String[] args) {


        //TC #02: FIND ELEMENTS: APPLE
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2. Go to https://www.apple.com
        driver.get("https://www.apple.com");

        //3. Click to iPhone
        WebElement iphoneElement = driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-iphone']"));
       // WebElement iphoneElement = driver.findElement(By.xpath("//span[.='iPhone']")); ==> not clickable!!

        iphoneElement.click();

        //4. Print out the texts of all links
        List<WebElement> linksList = driver.findElements(By.xpath("//body//a"));

        for (WebElement eachLink : linksList){
            System.out.println("Text of each Link: " + eachLink.getText());
        }

        //5. Print out how many link is missing text
        int linksWithoutText= 0;
        int linksWithText = 0;

        for (WebElement eachLink : linksList){
            if (eachLink.getText().isEmpty()){
                linksWithoutText++;
            }else{
                linksWithText++;
            }
        }
        System.out.println("Total Number of links Without Text = " + linksWithoutText);

        //6. Print out how many link has text
        System.out.println("Total number of links With Text = " + linksWithText);

        //7. Print out how many total link
        System.out.println("Total number of links = " + linksList.size());
    }
}
