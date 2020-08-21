package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_CssSelector {
    public static void main(String[] args) {

        // id, name, classname, tagname, linkText, partialLinkText, xpath, cssSelector

        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/sign_in");

        // Eger class name icinde eger bosluk varsa cssSelector kullanmalisiniz
        // cssSelector kullanirken , class value kullaniyorsak .value
        WebElement emailKutusu = driver.findElement(By.cssSelector(".form-control"));

        // cssSelector kullanirken , id value kullaniyorsak    #isim
        //WebElement emailKutusu = driver.findElement(By.cssSelector("#session_email"));
        emailKutusu.sendKeys("testtechproed@gmail.com");

        // tagName[attribute name='value']
        WebElement sifreKutusu = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        sifreKutusu.sendKeys("Test1234!");

        sifreKutusu.submit();



    }
}
