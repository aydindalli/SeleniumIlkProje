package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;

public class Day05_Xpath02 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");

        // xpath kullanımında, attribute kullanmaya gerek duymazsanız,sadece tagName yazılarakta webelement bulunabilir.
        WebElement welcomeYazisi = driver.findElement(By.xpath("//h1"));
        System.out.println(welcomeYazisi.getText());


    }
}
