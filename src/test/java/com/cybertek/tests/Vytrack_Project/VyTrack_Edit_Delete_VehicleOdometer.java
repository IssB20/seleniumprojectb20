package com.cybertek.tests.Vytrack_Project;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class VyTrack_Edit_Delete_VehicleOdometer {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://qa2.vytrack.com/user/login");

    }

    @Test
    public void edit_Delete_VehicleOdometer() throws InterruptedException {

        // Login to VyTrack:
        driver.findElement(By.cssSelector("input#prependedInput")).sendKeys("user176");
        Thread.sleep(2000);
        driver.findElement(By.name("_password")).sendKeys("UserUser123"+ Keys.ENTER);



        // select Fleet Module
        driver.findElement(By.xpath("//li[@class='dropdown dropdown-level-1'][1]")).click();
        Thread.sleep(3000);

        //Select Vehicle odometer
        driver.findElement(By.xpath("//span[.='Vehicle Odometer']")).click();
        Thread.sleep(3000);

        // click on any vehicle odometer row:
        driver.findElement(By.xpath("//tr[@class='grid-row row-click-action'][1]")).click();
        Thread.sleep(3000);

        //find and click edit button:
        driver.findElement(By.xpath("//a[@title='Edit Vehicle Odometer']")).click();
        Thread.sleep(3000);

        //find and clear the old odometer value:
        WebElement odometerInput = driver.findElement(By.xpath("//input[@data-name='field__odometer-value']"));
        odometerInput.clear();
        //input new odometer value:
        String newOdometer = "999999";
        odometerInput.sendKeys(newOdometer);

        Thread.sleep(3000);

        //choose today date:
        driver.findElement(By.xpath("//input[@placeholder='Choose a date']")).click();

        driver.findElement(By.xpath("//button[.='Today']")).click();

        //save the new entry:
        driver.findElement(By.xpath("//button[@class='btn btn-success action-button']")).click();
        Thread.sleep(3000);


        // delete vehicle odometer:
        driver.findElement(By.xpath("//a[@title='Delete Vehicle Odometer']")).click();
        Thread.sleep(5000);

        driver.findElement(By.linkText("Yes, Delete")).click();
        Thread.sleep(5000);
       // driver.close();
    }
}
