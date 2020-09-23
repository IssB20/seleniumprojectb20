package com.cybertek.tests.Vytrack_Project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VyTrack_login {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://qa2.vytrack.com/user/login");
        driver.manage().window().maximize();
        driver.findElement(By.name("_username")).sendKeys("user176");
        Thread.sleep(2000);
        driver.findElement(By.name("_password")).sendKeys("UserUser123"+ Keys.ENTER);






    }
}
