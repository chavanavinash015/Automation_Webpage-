package javaScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
    //    driver.manage().window().maximize();
        driver.get("C:\\Users\\lenovo\\Desktop\\CQA-115\\Selenium\\src\\main\\resources\\Test.html");

        JavascriptExecutor javaScriptExecutor= (JavascriptExecutor) driver;
        Thread.sleep(3000);

//        driver.findElement(By.id("username")).sendKeys("Username");

        javaScriptExecutor.executeScript("document.getElementById('username').value='test'");
        Thread.sleep(3000);
//        driver.findElement(By.id("password")).sendKeys("Password");

        javaScriptExecutor.executeScript("document.getElementById('password').value='Password'");
        Thread.sleep(5000);
        driver.close();


    }
}
