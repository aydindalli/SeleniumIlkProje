package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_LocatorsTagName {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");

        // id, name , classname, linkText, partialLinkText, tagName...
        WebElement homeLinki=driver.findElement(By.tagName("a"));
        System.out.println(homeLinki.getText()); // home linkindeki terimi yazdirir

    }
}
