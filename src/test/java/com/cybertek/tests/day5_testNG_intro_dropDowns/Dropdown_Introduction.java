package com.cybertek.tests.day5_testNG_intro_dropDowns;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Dropdown_Introduction {
/*

 */

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){

        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //1- Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");

    }

    @Test
    public void dropdown_test_1() throws InterruptedException {
         //TC#1: Verifying “Simple dropdown” and “State selection” dropdown default values

        //3. Verify “Simple dropdown” default selected value is correct
        //Expected: “Please select an option”
        // we must locate the dropdown then pass it into select constructor

        Select simpleDropdown = new Select(driver.findElement(By.id("dropdown")));
        simpleDropdown.getFirstSelectedOption(); // return web element
        String actualSelectedOption = simpleDropdown.getFirstSelectedOption().getText();
        String expectedSelectedOption ="Please select an option";

        Assert.assertEquals(actualSelectedOption,expectedSelectedOption);

        Thread.sleep(3000);
        simpleDropdown.selectByVisibleText("Option 2");

        //4. Verify “State selection” default selected value is correct
        //Expected: “Select a State”

    }
}
