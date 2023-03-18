package autoItPrograms;

import com.bridgelabz.CQA115Selenium.RobotTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class AutoIT_Example {

    public static void main(String[] args) throws InterruptedException, AWTException, IOException {
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_P);
        robot.keyRelease(KeyEvent.VK_P);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        Runtime run = Runtime.getRuntime();

        run.exec("");

        driver.close();

    }
}
