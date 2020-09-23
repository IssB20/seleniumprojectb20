package com.cybertek.tests.day0Practices;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.*;

public class cssXpathPractice2 {
    /*
    XPATHand CSSSelectorPRACTICESDO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
    TC #2: PracticeCybertek.com_AddRemoveElements WebElement verification
    1. Open Chrome browser
    2. Go to http://practice.cybertekschool.com/add_remove_elements/
    3. Click to “Add Element” button
    4. Verify “Delete” button is displayed after clicking.
    5. Click to “Delete” button.
    6. Verify “Delete” button is NOT displayed after clicking.
    USE XPATH and/orCSS Selector LOCATOR FOR ALL WebELEMENT LOCATORS Better if you do with both for practice purposes.
     */
    public static void main(String[] args) throws  InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");

        Thread.sleep(3000);

        //3. Click to “Add Element” button
        //by cssSelector:
        WebElement addElementButton = driver.findElement(By.cssSelector("button[onclick='addElement()']"));
        addElementButton.click();

        Thread.sleep(3000);

        //by Xpath:
        WebElement addElementButton2 = driver.findElement(By.xpath("//button[.='Add Element']"));
        addElementButton2.click();

        //4. Verify “Delete” button is displayed after clicking.
        // by cssSelector:
        WebElement DeleteButtonElement1 = driver.findElement(By.cssSelector("button.added-manually")); // tagName.class value
        boolean deleteButtonElement1Displayed = DeleteButtonElement1.isDisplayed();
        System.out.println("delete Button Element1 Displayed ? " + deleteButtonElement1Displayed);
        Thread.sleep(3000);

        DeleteButtonElement1.click();

        //by Xpath:

        WebElement deleteButtonElement2 = driver.findElement(By.xpath("//*[@class='added-manually']"));
        boolean deleteButtonElement2Displayed = deleteButtonElement2.isDisplayed();
        System.out.println("delete Button Element2 Displayed = " + deleteButtonElement2Displayed);

        Thread.sleep(3000);
        deleteButtonElement2.click();

        //6. Verify “Delete” button is NOT displayed after clicking:
        driver.navigate().refresh();
        Thread.sleep(10000);

        try {

            System.out.println("displayed Delete Button = " + deleteButtonElement2.isDisplayed());
        }catch (StaleElementReferenceException e){
            System.out.println("displayed Delete Button = "+false );
        }


    }
}
