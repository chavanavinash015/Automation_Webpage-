package autoItPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class FindElements_Examples {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        int totalLiks = allLinks.size();
        System.out.println("total number of links present on the web page is : "+totalLiks);

        int visibleLinkCount = 0;
        int hiddenLinkCount = 0;

        for(WebElement link : allLinks){
            if (link.isDisplayed()){
                visibleLinkCount++;
                System.out.println(visibleLinkCount+" -> "+link.getText());
            }else {
                hiddenLinkCount++;
            }
        }
        System.out.println("Total number of visible links :"+visibleLinkCount);
        System.out.println("Total number of hidden links :"+hiddenLinkCount);

        driver.close();

    }
}
