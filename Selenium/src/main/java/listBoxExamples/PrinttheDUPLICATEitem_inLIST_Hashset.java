package listBoxExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.HashSet;
import java.util.List;

public class PrinttheDUPLICATEitem_inLIST_Hashset {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("C:\\Users\\lenovo\\Desktop\\CQA-115\\Selenium\\src\\main\\resources\\ListBox_Breakfast.html");

        WebElement listbox = driver.findElement(By.id("mtr"));

        Select s = new Select(listbox);

        List<WebElement> allOptions = s.getOptions();

        int count1 = allOptions.size();
        System.out.println("Number of elements in the list is :" + count1);

        HashSet<String> allElementText = new HashSet<String>();

        for (int i = 0; i < count1; i++) {
            String text = allOptions.get(i).getText();

            if (!allElementText.add(text)) {
                System.out.println(text +" is the duplicate item in the list box");
            }
        }
        System.out.println(allElementText.size());
        System.out.println(allElementText);
        driver.close();

        }
    }