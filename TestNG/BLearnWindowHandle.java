package jul22.week4.day19.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BLearnWindowHandle {

	@Test
	public void learnWindowHandle() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.findElement(By.linkText("Click Here")).click();
		
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		
		

	}

}
