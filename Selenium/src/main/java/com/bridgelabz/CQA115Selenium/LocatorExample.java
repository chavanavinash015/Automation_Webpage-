package com.bridgelabz.CQA115Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class LocatorExample {

    public static void main(String[] args) throws InterruptedException, AWTException {

        System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");

        WebDriver driver4 = new ChromeDriver();

        driver4.get("https://www.facebook.com");
        WebElement driverElement = driver4.findElement(By.id("email"));

        driverElement.sendKeys("chavanavinash015@gmail.com");

        Thread.sleep(2000);
        driverElement.clear();

        Thread.sleep(2000);

        WebElement driverElement1 = driver4.findElement(By.name("email"));

        driverElement1.sendKeys("9767884048");

        Thread.sleep(2000);

//        driverElement1.clear();

        WebElement driverElement2 = driver4.findElement(By.cssSelector("#pass"));

        driverElement2.sendKeys("AVINASHCHAVAN015");

        Thread.sleep(2000);

        WebElement driverElement3 = driver4.findElement(new By.ByTagName("button"));

        driverElement3.click();

        Thread.sleep(3000);

//        driver.close();

        String actualUrl = driver4.getCurrentUrl();
        if (actualUrl.contains("https://mail.google.com/mail/u/0/#inbox")) {
            System.out.println("Home page is displayed");
        } else {
            System.out.println("Homepage is Not Displayed until you not provided OTP");

        }


    }
}
