package javascript_AlertPopUp1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert_PromptPopUp {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);

        driver.get("http://www.tizag.com/javascriptT/javascriptprompt.php");
        // "Say my name"
        driver.findElement(By.xpath("//input[@value='Say my name!']")).click();
        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);

        System.out.println(alert.getText());
        Thread.sleep(2000);

        alert.sendKeys("ajit");
        Thread.sleep(2000);

        alert.accept();
        Thread.sleep(2000);
        System.out.println(alert.getText());
        alert.dismiss();
    }
}
