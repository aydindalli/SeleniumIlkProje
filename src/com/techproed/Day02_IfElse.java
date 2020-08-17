package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElse {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // driver.manage().window().maximize();

        driver.get("http://amazon.com");
        String amazonTitle = driver.getTitle();  // title icinde car kelimesini icerip icermedigini kontrol edelim

        if(amazonTitle.contains("Car")){
            System.out.println("Car kelimesi iceriyor  " + amazonTitle);
        }else {
            System.out.println("Car gelimesi icermiyor  " + amazonTitle);
        }

        if(amazonTitle.contains("Books")){
            System.out.println("Books kelimesi iceriyor  " + amazonTitle);
        }else {
            System.out.println("Books gelimesi icermiyor  " + amazonTitle);
        }
        driver.quit();
    }
}
