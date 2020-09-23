package com.cybertek.tests.day0Practices;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StateDropDown {


    //TC #2: Selecting state from State dropdown and verifying result
    //1. Open Chrome browser
    //2. Go to http://practice.cybertekschool.com/dropdown
    //3. Select Illinois
    //4. Select Virginia
    //5. Select California
    //6. Verify final selected option is California.
    //Use all Select options. (visible text, value, index)

    @Test
    public void state_dropdown_test(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");


        // first find dropdown web element: "Select a state"

        Select stateSelector = new Select(driver.findElement(By.xpath("//*[@id='state']")));
       //Select stateSelector = new Select(driver.findElement(By.cssSelector("select#state")));

        //select Illinois using selectByVisibleText():
        stateSelector.selectByVisibleText("Illinois");

        //select Virginia using selectByValue():
        stateSelector.selectByValue("VA");

        //select California using SelectByIndex():
        stateSelector.selectByIndex(5);

        //Verify final selected option is California.
        String expectedState = "California";
        String actualState = stateSelector.getFirstSelectedOption().getText();
        Assert.assertEquals( actualState , expectedState);


        driver.close();






    }

}
