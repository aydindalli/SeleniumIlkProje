package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDers {
    public static void main(String[] args) {
        // chromedriver i tanidik
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");
        // selenium ile ilgili ilk kodumuz
        // webdriver nesnesi olusturarak chrome driver i kullanabilir hale getirdik
        WebDriver webDriver = new ChromeDriver();

        // driver imiza google.com  a gitmesini soyledik
        // get   komutu  ; yazdigimiz url( adrese ) nin gitmesini saglar...
        webDriver.get("http://google.com");

        // driverimizda acik olan pencereyi kapatir, acilan tek pencereyi kapatir
        webDriver.close();

        // driverimizi komple kapatiyor, acik olan tum pencereleri kapatiyor
        webDriver.quit();

    }

}
