package com.cybertek.tests.Vytrack_Project;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class VyTrack_Edit_Date {

    WebDriver driver;

    @BeforeMethod
    public void edit_Delete_VehicleOdometer() throws InterruptedException {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


        driver.get("https://qa2.vytrack.com/user/login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.cssSelector("input#prependedInput")).sendKeys("user176");
        driver.findElement(By.name("_password")).sendKeys("UserUser123" + Keys.ENTER);
    }

    @Test
    public void Edit_Date() throws InterruptedException {
        driver.findElement(By.xpath("//li[@class='dropdown dropdown-level-1'][1]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//span[.='Vehicle Odometer']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//tr[@class='grid-row row-click-action'][1]")).click();

        //find and click edit button:
        driver.findElement(By.xpath("//a[@title='Edit Vehicle Odometer']")).click();
        Thread.sleep(3000);

        //choose date: date format (MM dd, yyyy) ex Sep 17, 2020
        WebElement dateBox = driver.findElement(By.xpath("//input[@placeholder='Choose a date']"));
        dateBox.click();
        dateBox.clear(); // will clear any previous date
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MMM dd, yyyy");
        LocalDate ld = LocalDate.of(2020, 9, 25);

        dateBox.sendKeys(ld.format(dateFormat));
        Thread.sleep(3000);





    }

}
