package jul22.week4.day19.TestNG;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DLearnWindowHandlesWithSeparateMethod {
	
	//Global variable driver
	public static ChromeDriver driver;
	public void windowHandles(int index) {
		Set<String> setWindowHandles = driver.getWindowHandles();
		List<String> listWindowHandles = new ArrayList<String>(setWindowHandles);
		String windows = listWindowHandles.get(index);
		driver.switchTo().window(windows);

	}

		@Test
		public void learnWHWSM() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://demo.guru99.com/popup.php");
			driver.findElement(By.linkText("Click Here")).click();
			
			DLearnWindowHandlesWithSeparateMethod lwhs= new DLearnWindowHandlesWithSeparateMethod();
			lwhs.windowHandles(1);			
			driver.findElement(By.name("emailid")).sendKeys("sudhakar.karuppannan@gmail.com");
			lwhs.windowHandles(0);
			String headerText = driver.findElement(By.xpath("//h2[text()='Guru99 Bank']")).getText();
			System.out.println(headerText);
			lwhs.windowHandles(1);
				
		}

	
}
