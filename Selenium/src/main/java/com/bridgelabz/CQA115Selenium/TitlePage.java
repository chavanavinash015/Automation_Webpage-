package com.bridgelabz.CQA115Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitlePage {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
      //  driver.manage().window().maximize();
        driver.get("https://www.geeksforgeeks.org/");

        String expectedTitle = "Tutorials List - GeeksForGeeks";

        Thread.sleep(3000);
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Home page is displayed");
        } else {
            System.out.println("Home page is Not displayed");
        }
    }
}
