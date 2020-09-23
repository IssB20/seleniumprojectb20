package com.cybertek.tests.Vytrack_Project;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class VyTrack_Grid_Setting {

    WebDriver driver;

    @Test
    public void grid_Setting() throws InterruptedException {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://qa2.vytrack.com/user/login");
        driver.findElement(By.name("_username")).sendKeys("user176");
        driver.findElement(By.name("_password")).sendKeys("UserUser123"+ Keys.ENTER);

        Thread.sleep(3000);

        //find fleet module:
        WebElement fleetElement = driver.findElement(By.xpath("//li[@class='dropdown dropdown-level-1'][1]"));
        fleetElement.click();
        Thread.sleep(3000);


        // find vehicle odometer :
        driver.findElement(By.xpath("//span[.='Vehicle Odometer']")).click();
        Thread.sleep(3000);

        // click on Grid Setting:
        WebElement gridSetting = driver.findElement(By.xpath("//i[@class='fa-cog hide-text']"));
        gridSetting.click();

        Thread.sleep(3000);

/*
        //select/ un-select driver checkbox:
        WebElement driverCheckbox = driver.findElement(By.cssSelector("input#column-c116"));
        driverCheckbox.click();

 */



        // select/ un-select  unit checkbox:
        WebElement unitCheckbox = driver.findElement(By.xpath("//input[@id='column-c117']"));
        unitCheckbox.click();

        //select/ un-select model checkbox:
        WebElement modelCheckbox = driver.findElement(By.xpath("//input[@id='column-c118']"));
        modelCheckbox.click();


        // close Grid setting:
        WebElement closeGridSettings = driver.findElement(By.xpath("//span[@class='close']"));
        Thread.sleep(3000);
        closeGridSettings.click();


    }
}
