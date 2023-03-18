package com.bridgelabz.CQA115Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSignIn {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");

        WebDriver driver1 = new ChromeDriver();
        driver1.manage().window().maximize();
        driver1.get("https://www.facebook.com/");

        driver1.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);

        driver1.findElement(By.name("firstname")).sendKeys("Avi");
        Thread.sleep(2000);

        driver1.findElement(By.name("lastname")).sendKeys("Chavan");
        Thread.sleep(2000);

        driver1.findElement(By.name("reg_email__")).sendKeys("8459827577");
        Thread.sleep(2000);

        driver1.findElement(By.name("reg_passwd__")).sendKeys("Test12345");
        Thread.sleep(2000);

        driver1.findElement(By.name("birthday_day")).sendKeys("1");
        Thread.sleep(2000);

        driver1.findElement(By.name("birthday_month")).sendKeys("Jan");
        Thread.sleep(2000);

        driver1.findElement(By.name("birthday_year")).sendKeys("1999");
        Thread.sleep(2000);

        driver1.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
        Thread.sleep(2000);

        driver1.findElement(By.name("websubmit")).click();
        Thread.sleep(2000);
    }
}
