package com.bridgelabz.CQA115Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
     //   driver.manage().window().maximize();
        driver.get("http://www.facebook.com");

        driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect and share with the people')]"));

        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9767884048");

        driver.close();
    }

}
