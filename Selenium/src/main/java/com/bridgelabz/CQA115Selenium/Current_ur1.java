package com.bridgelabz.CQA115Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Current_ur1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");

        String title= driver.getTitle();
        System.out.println("Title of this page is :"+title);

        String Currenturl=driver.getCurrentUrl();
        System.out.println("=====================");
        System.out.println("The Current Url is :"+Currenturl);

        String source=driver.getPageSource();
        System.out.println("=====================");
        System.out.println("This is My Page Source :"+source);

        Thread.sleep(3000);

        String expected_title="Google";

        if (title.contains(expected_title))
            System.out.println("Display HomePage");
        else
            System.out.println("Not Display HomePage");

        driver.close();

    }
}
