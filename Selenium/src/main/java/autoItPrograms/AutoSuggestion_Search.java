package autoItPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class AutoSuggestion_Search {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins");

        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("http://www.google.com");

        driver.findElement(By.id("lst-ib")).sendKeys("selenium");
        Thread.sleep(2000);
        List<WebElement> allOptions = driver.findElements(By.xpath("//*[contains(text(),'selenium')]"));
        int count = allOptions.size();
        System.out.println("Number of values present in the dropdown is :" + count);
        String expectedValue = "selenium interview questions";


        for (WebElement option : allOptions) {
            String text = option.getText();
            System.out.println(" " + text);

            if (text.equalsIgnoreCase(expectedValue)) {
                option.click();
                break;

            }
        }
    }
}