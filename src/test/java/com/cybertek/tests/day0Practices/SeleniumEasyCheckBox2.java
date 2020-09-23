package com.cybertek.tests.day0Practices;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumEasyCheckBox2 {

    public static void main(String[] args) {

        /*
        TC	#3:	SeleniumEasy	Checkbox	Verification	– Section	2
       1. Open	Chrome	browser
       2. Go	to	http://www.seleniumeasy.com/test/basic-checkbox-demo.html
       3. Verify	“Check All”	button	text	is	“Check	All”
       4. Click	to	“Check	All”	button
       5. Verify	all	check	boxes	are	checked
       6. Verify	button	text	changed	to	“Uncheck	All”
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        WebElement checkAllButton = driver.findElement(By.xpath("//input[@type='button']"));
        System.out.println("check All Text is displayed = " + checkAllButton.isDisplayed());
        System.out.println("Check All” button text is “Check All” = " + checkAllButton.getText());

        checkAllButton.click();




    }
}
