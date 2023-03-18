package fileUploadPopUp3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileUploadTest {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);

        //  driver.manage().window().maximize();
        driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");

        Thread.sleep(3000);

        driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/input[2]")).sendKeys("E:demo.txt");

        Thread.sleep(10000);
        driver.close();

    }
}

