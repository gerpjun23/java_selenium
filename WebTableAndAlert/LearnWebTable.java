package jul22.week3.day14.WebTableAndAlert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {
	
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://demo.guru99.com/test/write-xpath-table.html");
		driver.manage().window().maximize();
		
		WebElement webTable = driver.findElement(By.xpath("(//table)[2]"));
		
		List<WebElement> tableRows = webTable.findElements(By.tagName("tr"));
		System.out.println(tableRows.size()); //Output --> 2
		
		for(int i=0; i<tableRows.size(); i++)
		{
			WebElement allTableRow = tableRows.get(i);
			
			List<WebElement> allColumn = allTableRow.findElements(By.tagName("td"));
			System.out.println(allColumn.size());
			
			for (int j=0; j<allColumn.size(); j++)
			{
				String columnText = allColumn.get(j).getText();
				System.out.println(columnText);
			}
		}
		driver.close();
	}

}
