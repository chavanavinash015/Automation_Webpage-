package com.bridgelabz.CQA115Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationKeys {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");

        WebDriver driver3 = new ChromeDriver();

        driver3.get("https://www.facebook.com/");
        driver3.navigate().back();
        Thread.sleep(2000);

        driver3.get("https://www.amazon.in/");
        driver3.navigate().forward();
        Thread.sleep(2000);

        driver3.navigate().refresh();
        driver3.close();
    }
}
