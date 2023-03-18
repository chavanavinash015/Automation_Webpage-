package com.bridgelabz.CQA115Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;


public class RobotTest {

    public static void main(String[] args) throws InterruptedException, AWTException {

        System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");

        WebDriver driver4 = new ChromeDriver();

        driver4.get("https://www.facebook.com/");

        driver4.navigate().to("https://www.amazon.in/");
        Thread.sleep(3000);

        Robot robot = new Robot();

        robot.mouseMove(300,500);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_I);
        Thread.sleep(3000);

        robot.keyRelease(KeyEvent.VK_I);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(3000);

        driver4.close();


    }
}
