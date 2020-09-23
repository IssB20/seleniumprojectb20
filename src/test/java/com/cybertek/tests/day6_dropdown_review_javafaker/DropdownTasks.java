package com.cybertek.tests.day6_dropdown_review_javafaker;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropdownTasks {


    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //open a new browser
        driver = WebDriverFactory.getDriver("chrome");
        // maximize the page:
        driver.manage().window().maximize();
        // implicit wait:
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // get the page:
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

   // TC #2: Selecting state from State dropdown and verifying result
    @Test
    public void test2_verify_state_dropdown() throws InterruptedException {
        /*
        3. Select Illinois
        4. Select Virginia
        5. Select California
        6. Verify final selected option is California.
        Use all Select options. (visible text, value, index)
         */

        // we need to locate the dropdown
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        // select illinois
        Thread.sleep(1000);
        stateDropdown.selectByVisibleText("Illinois");
        Thread.sleep(1000);

        // select virgina:
        stateDropdown.selectByValue("VA");

        //select California:
        Thread.sleep(1000);
        stateDropdown.selectByIndex(5);

        // Verify final selected option is California:
        String expectedResult ="California";
        String actualResult = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(expectedResult, actualResult,"Actual vs Expected is not equal!");











    }

   // TC #3: Selecting date on dropdown and verifying
    @Test
    public void test3_date_dropDown_verification(){

        //3. Select “December 1 , 1921” and verify it is selected:

        Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));


        // creating expected result:
        String expectedYear = "1921";
        String expectedMonth = "December";
        String expectedDay = "1";

        //select year by text:
        yearDropdown.selectByVisibleText("1921");

        //select month by value:
        monthDropdown.selectByValue("11");

        // select day by index:
        dayDropdown.selectByIndex(0);

        // Actual result:
        String actualYear = yearDropdown.getFirstSelectedOption().getText();
        String actualMonth = monthDropdown.getFirstSelectedOption().getText();
        String actualDay = dayDropdown.getFirstSelectedOption().getText();

        //Creating assert lines to compare actual vs expected
        Assert.assertEquals(actualYear , expectedYear , "Actual Year Vs Expected Year not Equal");
        Assert.assertEquals(actualMonth , expectedMonth , "Actual Month Vs expected Month not equal");
        Assert.assertTrue( actualDay.equals(expectedDay), "Actual day Vs Expected Day not Equal" );



    }

    @Test
    public void test4_multiple_value_select_dropdown() throws InterruptedException {
     //TC #4: Selecting value from multiple select dropdown

        //locating the dropdown:
        Select languageDropdown = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));

        //3. Select all the options from multiple select dropdown.
        //Creating a list of web elements to store all of the options inside of this dropdown
        List<WebElement> allOptions = languageDropdown.getOptions();

        // Loop through all the options to select all of them
        //4. Print out all selected values.

        for (WebElement eachOption : allOptions ){
            Thread.sleep(500);
            eachOption.click();  // this will click each option with every iteration
            System.out.println("selected: "+eachOption.getText());
            // Asserting the option is actually selected or not
            Assert.assertTrue(eachOption.isSelected(), "the option: " +eachOption.getText()+" is not selected!!");

        }

        //5. Deselect all values:
        languageDropdown.deselectAll();

        for (WebElement eachOption : allOptions){
           // Assert.assertTrue( ! eachOption.isSelected() ); // it will be false boolean value, with ! we make it "true"
          // assertFalse method looks for "false" boolean value to pass the test.
            Assert.assertFalse( eachOption.isSelected() ); // it will be true value
        }
    }

    @Test
    public void test5(){
        //TC #5: Selecting value from non-select dropdown

        // 3. Click to non-select dropdown
       // locate the HTML dropdown as a regular webElement
       WebElement  webSiteDropdown = driver.findElement(By.xpath("//div[@class='dropdown']/a"));
       webSiteDropdown.click();


        //4. Select Facebook from dropdown
        WebElement facebookLink = driver.findElement(By.xpath("//a[.='Facebook']"));
        facebookLink.click();

        //5. Verify title is “Facebook - Log In or Sign Up”
        String expectedTitle = "Facebook - Log In or Sign Up";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(expectedTitle , actualTitle , "Actual Title does not match expected title!");
    }

    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }


}

