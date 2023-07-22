package jun23.week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class LearnSelectDropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement selectCountry = driver.findElement(By.xpath("//select[@name='country']"));
		
		Select select = new Select(selectCountry);
		
		//select.selectByIndex(4);
		//select.selectByValue("CANADA");
		//select.selectByVisibleText("CAMEROON");
		
		for (int i=0; i<=40; i++)
		{
			select.selectByIndex(i);
						
		}
		
		//for (int i=0; i<selectCountry.getSize(); i++)
		
		
		
		
		

	}

}
