package jul22.week3.day14.WebTableAndAlert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable1 {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/write-xpath-table.html");
		driver.manage().window().maximize();
		
		WebElement webTable = driver.findElement(By.xpath("(//table)[2]"));
		
		List<WebElement> tableRows = webTable.findElements(By.tagName("tr"));
		
		System.out.println(tableRows.size());

		for (int i=0; i<tableRows.size(); i++)
		{
			List<WebElement> allColumnData = tableRows.get(i).findElements(By.tagName("td"));
			System.out.println(allColumnData.size());
			
			for (int j=0; j<allColumnData.size(); j++)
			{
				String columnData = allColumnData.get(j).getText();
				System.out.println(columnData);
			}
		}
		driver.close();
}
	
}
