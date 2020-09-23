package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_GoogleSearch {

    public static void main(String[] args) {

        /*
        TC#4:	Google	search
        1-Open	a	chrome	browser
        2-Go	to:	https://google.com
        3-Write	“apple”	in	search	box
        4-Click	google	search	button
        5-Verify	title:Expected:	Title	should	start	with “apple" word
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(); // open empty browser

        driver.get("https://google.com");

        //3- find search box and write apple in search box
        driver.findElement(By.name("q")).sendKeys("apple" + Keys.ENTER);

        // 4 - Click google search

        // 5 verify title after search Expected title should be = "apple - Google Search"

        String expectedTitle = "apple - Google Search";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Search Title Verification PASSED!");
        }else{
            System.out.println("Search Title Verification FAIlED!");
        }

        if (actualTitle.startsWith("apple")){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        driver.close();




    }
}
