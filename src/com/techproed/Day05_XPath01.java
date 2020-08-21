package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_XPath01 {
    public static void main(String[] args) {
        // Absolute xpath = mutlak ,kesin adres , genelde kullanilmaz-gereksiz
        // Relative xpath  = bagli veya baglantili xpath, kullanilacak xpath

        // xpath ; //tagName[@attribute = 'value']
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/sign_in");

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){

        }

        //input[@type='email'] -> xpath 'imiz onemli!
        WebElement emailKutusu = driver.findElement(By.xpath("//input[@type='email']"));
        emailKutusu.sendKeys("testtechproed@gmail.com");

        // <input type="email" class="form-control form" placeholder="Email" data-test="email" name="session[email]" id="session_email">
        // xpath ; class :  //input[@class='form-control form']
        //         id    : id="session_email

        WebElement sifreKutusu = driver.findElement(By.xpath("//input[@type='password']"));
        sifreKutusu.sendKeys("Test1234!");

        // //input[@class='form-control' and @name='session[password]']  ; kesin ikisi
        // //input[@class='form-control' or @name='session[password]']  ; ikisinden biri varsa
        WebElement signInButonu = driver.findElement(By.xpath("//input[@type='submit']"));
        signInButonu.click();
    }
}
