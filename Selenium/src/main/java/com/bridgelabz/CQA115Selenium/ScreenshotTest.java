package com.bridgelabz.CQA115Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class ScreenshotTest {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");

        WebDriver driver2 = new ChromeDriver();
        driver2.manage().window().maximize();
        driver2.get("https://www.facebook.com/");

        driver2.findElement(By.id("email")).sendKeys("1234567890");
        Thread.sleep(2000);

        TakesScreenshot takesScreenshot = (TakesScreenshot) driver2;
        File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);

        File destinationFile = new File("./scree"+System.currentTimeMillis()+ "ScreenShot.png");

        try {
            FileHandler.copy(sourceFile,destinationFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        driver2.close();
    }
}
