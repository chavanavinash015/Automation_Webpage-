package javaScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorPageScholl {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://facebook.com/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 0; i < 5; i++) {

            js.executeScript("window.scrollBy(0, 100)");

            Thread.sleep(3000);
        }

        for (int i = 0; i < 5; i++) {

            js.executeScript("window.scrollBy(0, -100)");

            Thread.sleep(3000);

            driver.close();
        }
    }
}
