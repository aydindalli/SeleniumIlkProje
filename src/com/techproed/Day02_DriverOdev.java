package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverOdev {

    public static void main(String[] args) {
        // driver'ımızı ekranı kaplayacak şekilde kullanalım.
        // 1 - ilk önce google.com'a gidelim.
        // 2 - sayfanın title'ını alalım ve ekrana yazdıralım.
        // 3 - daha sonra youtube.com'a gidelim.
        // 4 - sayfanın title'ını ve url'ini alalım ekrana yazdıralım.
        // 5 - google.com'a geri gelelim ve sayfanın url'ini alıp ekrana yazdıralım.
        // 6 - driver'ımızı kapatalım.

        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        // 1. Google gittik
        webDriver.get("http://google.com");
        // Title i al yazdir
        String titleGoogle =webDriver.getTitle();
        System.out.println(titleGoogle);

        // Youtube e gittik
        webDriver.navigate().to("http://youtube.com");
        // Title aldik
        String titleYoutube = webDriver.getTitle();
        System.out.println(titleYoutube);
        // Url i aldik ve yazdirdik
        String urlYoutube = webDriver.getCurrentUrl();
        System.out.println(urlYoutube);

        // Geri geldik ve Url yi yazdirdik
        webDriver.navigate().back();
        String syfUrl2 =webDriver.getCurrentUrl();
        System.out.println(syfUrl2);

        // Kapattik
        webDriver.quit();
    }
}
