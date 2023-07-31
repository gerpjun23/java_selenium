package jul22.week4.day19.TestNGAnnothations;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class ClickReports extends BaseClass {
  
	
	@Test (invocationCount = 1)
  public void reports() {
		driver.findElement(By.linkText("Reports")).click();
  } 

}
