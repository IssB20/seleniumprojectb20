package com.cybertek.tests.day4_findElements_checkBoxes_radio;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P2_MerriamWebster_Links {

    public static void main(String[] args) {

        //TC #0: FINDELEMENTS
        // 1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");


        // 2.Go to https://www.merriam-webster.com/
        driver.get("https://www.merriam-webster.com/");

        // 3.Print out the texts of all links
            //locating all of the web elements on the page and storing in a list of WebElements
        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));

        for (WebElement eachLink : listOfLinks){
            System.out.println("eachLink = " + eachLink.getText());
        }

        // 4.Print out how many link is missing text

        int linksWithoutText =0;
        int linksWithText = 0;

        for (WebElement eachLink : listOfLinks){
            //System.out.println("eachLink = " + eachLink.getText());
            String textOfEachLink = eachLink.getText();
            if (textOfEachLink.isEmpty()){
                linksWithoutText++;
            }else{
                linksWithText++;
            }
        }

        System.out.println("links Without Text = " + linksWithoutText);


        /*
        int count=0;
        for (WebElement eachLink : listOfLinks){
            if (eachLink.getText().equals("")){
                count++;
            }
        }
        System.out.println(count);
         */
        // 5.Print out how many link has text
        System.out.println("links With Text = " + linksWithText);

        // 6.Print out how many total link
        System.out.println("The number of total links on this page" + listOfLinks.size());
    }
}
