package autoItPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class WebTables_Examples {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins");

        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("C:\\Users\\lenovo\\Desktop\\CQA-115\\Selenium\\src\\main\\resources\\WebTables.html");

        List<WebElement> allRows = driver.findElements(By.xpath("//tr"));
        int totalRows = allRows.size();
        System.out.println("total number of rows present in the table is :"+ totalRows);

        List<WebElement> allColumns = driver.findElements(By.xpath("//th"));
        int totalColumns = allColumns.size();
        System.out.println("Total number of columns in the table is :" + totalColumns);


        List<WebElement> allCells = driver.findElements(By.xpath("//th|//td"));
        int totalCells = allCells.size();
        System.out.println("Total number of cells present in the table is :" + totalCells);

        int countNumberValue = 0;
        int sum=0;
        for (WebElement cell : allCells) {
            String cellValue = cell.getText();
            try{ int number = Integer.parseInt(cellValue);
                System.out.print(" "+number);
                countNumberValue++;
                sum = sum+number;
            }catch (Exception e) {

            }
        }
        System.out.println("Total count of numeric values is :"+countNumberValue);
        System.out.println("Total sum of all the numeric values is :"+sum);

        driver.close();

    }
}
