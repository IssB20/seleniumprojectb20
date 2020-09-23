package com.cybertek.tests.day0Practices;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P2_FindElementApple {

    public static void main(String[] args) throws InterruptedException {

        //TC #03: FIND ELEMENTS_APPLE
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2. Go to https://www.apple.com
        driver.get("https://www.apple.com");

        //3. Click to all of the headers one by one:
          // Mac:
        WebElement macHeader = driver.findElement(By.xpath("//li[@class='ac-gn-item ac-gn-item-menu ac-gn-mac']"));
        macHeader.click();
        String macTitle = driver.getTitle();
        int totalLinksOnMacHeader = driver.findElements(By.xpath("//body//a")).size();


        Thread.sleep(2000);

          //iPad:
        WebElement iPadHeader = driver.findElement(By.xpath("//a[@href='/ipad/']"));
        iPadHeader.click();
        String iPadTitle = driver.getTitle();
        int totalLinksOnIPadHeader = driver.findElements(By.xpath("//body//a")).size();

        Thread.sleep(2000);

          //iPhone:
        WebElement iPhoneHeader = driver.findElement(By.xpath("//li[@class='ac-gn-item ac-gn-item-menu ac-gn-iphone']"));
        iPhoneHeader.click();
        String iPhoneTitle = driver.getTitle();
        int totalLinksOnIphoneHeader = driver.findElements(By.xpath("//body//a")).size();
        Thread.sleep(2000);

          //Watch:
        WebElement watchHeader = driver.findElement(By.xpath("//li[@class='ac-gn-item ac-gn-item-menu ac-gn-watch']"));
        watchHeader.click();
        String watchTitle = driver.getTitle();
        int totalLinksOnWatchHeader = driver.findElements(By.xpath("//body//a")).size();
        Thread.sleep(2000);

          //TV:
        WebElement tvHeader = driver.findElement(By.xpath("//li[contains(@class,'tv')]"));
        tvHeader.click();
        String tvTitle = driver.getTitle();
        int totalLinksOnTvHeader = driver.findElements(By.xpath("//body//a")).size();
        Thread.sleep(2000);

          //Music:
        WebElement musicHeader = driver.findElement(By.xpath("//li[contains(@class,'music')]"));
        musicHeader.click();
        String musicTitle = driver.getTitle();
        int totalLinksOnMusicHeader = driver.findElements(By.xpath("//body//a")).size();
        Thread.sleep(2000);

          //Support:
        WebElement supportHeader = driver.findElement(By.xpath("//li[contains(@class,'su')]"));
        supportHeader.click();
        String supportTitle = driver.getTitle();
        int totalLinksOnSupportHeader = driver.findElements(By.xpath("//body//a")).size();

        //4. Print out how many links on each page with the titles of the pages
        /*
        ArrayList<WebElement> headerList = new ArrayList<WebElement>();
        headerList.addAll(Arrays.asList(macHeader,iPadHeader,iPhoneHeader,watchHeader,tvHeader,musicHeader,supportHeader));

         */
        System.out.println("total Links On Mac Header = " + totalLinksOnMacHeader);
        System.out.println("mac Title = " + macTitle);

        System.out.println("total Links On IPad Header = " + totalLinksOnIPadHeader);
        System.out.println("iPad Title = " + iPadTitle);

        System.out.println("total Links On IphoneHeader = " + totalLinksOnIphoneHeader);
        System.out.println("iPhone Title = " + iPhoneTitle);

        System.out.println("total Links On Watch Header = " + totalLinksOnWatchHeader);
        System.out.println("watch Title = " + watchTitle);

        System.out.println("total Links On Tv Header = " + totalLinksOnTvHeader);
        System.out.println("tv Title = " + tvTitle);

        System.out.println("total Links On Music Header = " + totalLinksOnMusicHeader);
        System.out.println("music Title = " + musicTitle);

        System.out.println("total Links On Suppor tHeader = " + totalLinksOnSupportHeader);
        System.out.println("support Title = " + supportTitle);


        //5. Loop through all
        //6. Print out how many link is missing text TOTAL
        //7. Print out how many link has text TOTAL
        //8. Print out how many total link TOTAL
    }
}
