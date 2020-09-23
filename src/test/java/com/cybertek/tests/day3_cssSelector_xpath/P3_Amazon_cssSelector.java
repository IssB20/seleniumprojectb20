package com.cybertek.tests.day3_cssSelector_xpath;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_Amazon_cssSelector {

    public static void main(String[] args) {

        /*
        C #3: Amazon link number verification
        1. Open Chrome browser
        2. Go to https://www.amazon.com
        3. Enter search term (use cssSelector to locate search box)
        4. Verify title contains search term
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com");

        WebElement searchBox = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")); // sscSelector
        searchBox.sendKeys("wooden spoon"  + Keys.ENTER);

       // WebElement searchBox2 = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));



    }
}
