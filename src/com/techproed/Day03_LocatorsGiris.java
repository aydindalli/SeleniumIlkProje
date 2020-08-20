package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Day03_LocatorsGiris {
    public static void main(String[] args) {
        // Java projemize, chromedriver'ı tanıttık.
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");

        // ilk webelementimizi buluyoruz.
        // Web sayfasındaki tüm elamanlarin data type (veri tipi) -> WebElement dir
        // webelementimizi id kullanarak bulduk.
        WebElement signInLink = driver.findElement(By.id("sign-in"));

        // webelementimize tıkladık.
        signInLink.click();

        //email kutusunu bulalım.
        WebElement emailKutusu = driver.findElement(By.id("session_email"));

        // emailKutusu'nun içerisine yazı gönderiyoruz
        emailKutusu.sendKeys("testtechproed@gmail.com");

        //sifre kutusunu buluyor.
        WebElement sifreKutusu = driver.findElement(By.id("session_password"));

        // sifreKutusu'nun içerisine yazı gönderiyoruz
        sifreKutusu.sendKeys("Test1234!");

        // sign in butonunu buluyoruz. // name="commit"// bilgisayar otomatik giris yapar click ile
        WebElement signInButonu = driver.findElement(By.name("commit"));
        signInButonu.click();

        String baslik = driver.getTitle();
        if(baslik.equals("Address Book")){
            System.out.println("Giriş Başarılı.");
        }else{
            System.out.println("Giriş Başarısız.");
        }
        // driver.quit();
    }
}
