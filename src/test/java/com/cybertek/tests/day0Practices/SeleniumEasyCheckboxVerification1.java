package com.cybertek.tests.day0Practices;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumEasyCheckboxVerification1 {

    public static void main(String[] args) {

        // TC	#2:	SeleniumEasy	Checkbox Verification – Section	1
       // 1. Open	Chrome	browser
       // 2. Go	to	http://www.seleniumeasy.com/test/basic-checkbox-demo.html

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");

       //3. Verify	“Success	– Check	box	is	checked”	message	is	NOT displayed.
        WebElement successMessage = driver.findElement(By.cssSelector("div#txtAge"));
        System.out.println("'Success -Check Box is checked' message is Displayed = " + successMessage.isDisplayed());

       //4. Click	to	checkbox	under	“Single	Checkbox	Demo”	section
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();

      //5. Verify	“Success	– Check	box	is	checked”	message	is displayed.
        System.out.println("'Success -Check Box is checked' message is Displayed = " + successMessage.isDisplayed());

    }
}
