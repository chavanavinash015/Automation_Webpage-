package listBoxExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.HashSet;
import java.util.List;

public class PrintUniqueElementInthelistbox {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);


        driver.get("C:\\Users\\lenovo\\Desktop\\CQA-115\\Selenium\\src\\main\\resources\\ListBox_Breakfast.html");

        WebElement listElement = driver.findElement(By.id("mtr"));

        Select s = new Select(listElement);

        List<WebElement> allOptions = s.getOptions();

        int count = allOptions.size();
     System.out.println(count);
     System.out.println("-----print the values in the list ----");

     HashSet<String> allElements = new HashSet<String>();

     for (WebElement option : allOptions) {
         String text = option.getText();
         System.out.println(text);

         allElements.add(text);
     }
     System.out.println(allElements);

    }
}

