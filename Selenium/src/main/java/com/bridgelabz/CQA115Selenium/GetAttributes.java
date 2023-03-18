package com.bridgelabz.CQA115Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributes {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");


        WebElement Checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));

        String tooltipText = Checkbox.getAttribute("title");
        System.out.println(tooltipText);
        driver.close();
    }
}
