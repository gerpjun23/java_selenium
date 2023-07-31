package jul22.week3.day14.WebTableAndAlert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/trains-between-stations/new-delhi-NDLS/mumbai-central-BCT");
		driver.manage().window().maximize();

		WebElement webTable = driver.findElement(By.xpath("(//table)[2]"));
		
		List<WebElement> tableRows = webTable.findElements(By.tagName("tr"));
		
		for (int i=0; i<tableRows.size(); i++)
		{
			WebElement allRows = tableRows.get(i);
			
			List<WebElement> allColumns = allRows.findElements(By.tagName("td"));
			
			for (int j=0; j<allColumns.size(); j++)
			{
				String columnValue = allColumns.get(j).getText();
				System.out.println(columnValue);
			}
		}
		driver.close();
	}

}
