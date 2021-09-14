package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyFirstTestCase {

    @Test
    public void dummyTest(){

        //System.setProperty("webdriver.chrome.driver", "D:\\chromedrivers\\v2.31\\chromedriver.exe");
        System.out.println("If you can see this, I made it to the console!!");

        WebDriver driver = new ChromeDriver();
        driver.get("https://askomdch.com");
        driver.close();
    }

}
