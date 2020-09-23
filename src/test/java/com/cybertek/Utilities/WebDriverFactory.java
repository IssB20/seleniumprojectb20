package com.cybertek.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    /* Task: New Method Creation
    Method Name: getDriver
    Static method
    Accepts String argument: browserType --> will determine what browser opens
                           if browserType = chrome =
    Return type: WebDriver

     */

    public static WebDriver getDriver( String browserType){

        if (browserType.equalsIgnoreCase("Chrome")){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();

        }else if(browserType.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            return  new FirefoxDriver();

        }else{
            System.out.println("Given Browser does not exist. Driver= null!");
            return null;
        }
    }
}
