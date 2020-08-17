package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


    // youtube.com a gidelim ;
    // title video kelimesi iceriyor mu
    // driver i kapatalim

public class Day02_TitleUrlTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

        webDriver.get("http://youtube.com");
        String youtubeTitle = webDriver.getTitle();

        if(youtubeTitle.contains("video")){
            System.out.println("Video kelimesini iceriyor  "+  youtubeTitle);
        } else{
            System.out.println("Video kelimesini icermiyor  "+  youtubeTitle);
        }
    webDriver.quit();
    }
}
