package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverMethods {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

        webDriver.get("http://google.com");
        webDriver.navigate().to("http://amazon.com");
        String sayfaTitleAmazon=webDriver.getTitle();  // Amazon.com : Online Shopping for ...
        String sayfaUrlAmazon =webDriver.getCurrentUrl(); // https:// www.amazon.com/
        System.out.println(sayfaTitleAmazon);
        System.out.println(sayfaUrlAmazon);


        webDriver.navigate().to("http://youtube.com");
        String sayfaTitleYoutube = webDriver.getTitle();
        String sayfaUrlYoutube =webDriver.getCurrentUrl();
        System.out.println(sayfaTitleYoutube);
        System.out.println(sayfaUrlYoutube);

        webDriver.navigate().back();
        webDriver.navigate().back();
        String sayfaTitleGoogle = webDriver.getTitle();
        String sayfaUrlGoogle =webDriver.getCurrentUrl();
        System.out.println(sayfaTitleGoogle);
        System.out.println(sayfaUrlGoogle);

        webDriver.close();
        webDriver.quit();
    }
}
