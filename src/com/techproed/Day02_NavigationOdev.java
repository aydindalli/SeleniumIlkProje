package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationOdev {

    public static void main(String[] args) {
        // 1 - ilk önce google.com'a gidiniz.
        // 2 - oradan youtube.com'a gidiniz.
        // 3 - google.com'a back methodu ile geri dönünüz.
        // 4 - youtube.com'a geri giniz.(forward methodu ile)
        // 5 - youtube.com'u yenileyiniz (refresh methodu ile)

        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

        webDriver.get("http://google.com");
        webDriver.navigate().to("http://youtube.com"); // get de kullanabiliriz
        webDriver.navigate().back();                       // geri google gittik
        webDriver.navigate().forward();                    // forward ile tekrar ileri youtube gittik
        webDriver.navigate().refresh();                    // sayfayi yeniledik
        webDriver.close();                                 // sayfayi kapattik
        webDriver.quit();                                  // ekrani kapattik
    }
}
