package com.cybertek.tests.day5_testNG_intro_dropDowns;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class P05_SeleniumEasy_Task1 {

    public static void main(String[] args) {

        //TC #2: SeleniumEasy Checkbox Verification – Section 1
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2. Go to http://www.seleniumeasy.com/test/basic-checkbox-demo.html
        driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html ");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //3. Verify “Success – Check box is checked” message is NOT displayed.
        WebElement successMessage = driver.findElement(By.xpath("//div[.='Success - Check box is checked']"));
                                 //  driver.findElement(By.xpath("div[@id='txtAge']"));

        if (!successMessage.isDisplayed()){
            System.out.println("Success Message is not displayed. Verification Passed!!");
        }else{
            System.out.println("Success Message is displayed . Verification Failed!!");
        }


        //4. Click to checkbox under “Single Checkbox Demo” section
        WebElement successCheckBox = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        successCheckBox.click();


        //5. Verify “Success – Check box is checked” message is displayed.

        if (successCheckBox.isSelected() && successMessage.isDisplayed()){
            System.out.println("Success Message is Displayed. Verification Passed!!");
        }else{
            System.out.println("Success Message is not Displayed. Verification Failed!!");
        }


    }
}
