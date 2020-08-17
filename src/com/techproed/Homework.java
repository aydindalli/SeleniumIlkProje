package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Homework {
    public static void main(String[] args) {
        /*
        1. Yeni bir class oluşturun :Homework
        2. ChromeDriver'ı kullanarak facebook'a gidin ve sayfa başlığının(Page Title) "facebook" olup olmadığını doğrulayın,
        Değilse, doğru başlığı(Actual title) yazdırın.
        3. Sayfa URL'sinin facebook içerip içermediğini(contains), Değilse doğru URL'yi(Actual url) yazdırın.
        4. Ardından Navigate to https://www.walmart.com/
        5  . Walmart sayfa başlığının "Walmart.com" içerip içermediğini(contains) doğrulayın
        6. Navigate back to facebook
        7. Sayfayı yenileyin(refresh)
        8. Maximize the window
        9. Close the browse
         */

        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // webDriver.manage().window().maximize();

        driver.get("http://facebook.com");
        String titleFacebook = driver.getTitle();
        if(titleFacebook.contains("facebook")){
            System.out.println("Sayfa basligi dogru ;" + titleFacebook);
        }else{
            System.out.println("Actuel sayfa basligi ;"+ titleFacebook);
        }

        String urlFacebook = driver.getCurrentUrl();
        if(urlFacebook.contains("facebook")){
            System.out.println("Facebook var ;"+ urlFacebook);
        }else{
            System.out.println("Facebook yok ;"+ urlFacebook);
        }

        driver.navigate().to("https://walmart.com");
        String titleWalmart = driver.getTitle();
        if(titleWalmart.contains("Walmart.com")){
            System.out.println("Walmart.com var");
        }else{
            System.out.println("Walmart.com yok");
        }

        driver.navigate().back();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.close();
    }
}
