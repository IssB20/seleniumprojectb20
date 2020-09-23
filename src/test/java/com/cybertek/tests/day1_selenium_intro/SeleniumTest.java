package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumTest {

    public static void main(String[] args) {

        // 1- setup the web Driver

        WebDriverManager.chromedriver().setup();

        // 2- create the instance of the chrome driver

        WebDriver driver = new ChromeDriver();

        // 3- test if driver is working

        driver.get("Https://facebook.com");

        driver.close();


    }

}
