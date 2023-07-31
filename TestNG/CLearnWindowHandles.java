package jul22.week4.day19.TestNG;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import mar22.week4.day8.windowhandling.WindowHandle;

public class CLearnWindowHandles {
	
		@Test
		public void learnWindowHandles() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.findElement(By.linkText("Click Here")).click();
		
		//Set Property - May or may not maintain the order 2) duplicate is not allowed
		
		Set<String> setWindowHandles = driver.getWindowHandles();
		
		//listWindowHandles - Maintains the order 
		List<String> listWindowHandles = new ArrayList<String>(setWindowHandles);
		String firstWindow = listWindowHandles.get(0);
		String secondWindow = listWindowHandles.get(1);
		
		
		driver.switchTo().window(secondWindow);
		driver.findElement(By.name("emailid")).sendKeys("sudhakar.karuppannan@gmail.com");
		driver.switchTo().window(firstWindow);
		String headerText = driver.findElement(By.xpath("//h2[text()='Guru99 Bank']")).getText();
		System.out.println(headerText);
		
			
	}

}
