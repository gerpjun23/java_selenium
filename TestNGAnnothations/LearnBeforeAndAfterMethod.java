package jul22.week4.day19.TestNGAnnothations;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class LearnBeforeAndAfterMethod extends BaseClass {
  
	
	
	@Test
  public void addEmployee() {
		driver.findElement(By.linkText("Add Employee")).click();
  }

	@Test (dependsOnMethods = {"jul22.week4.day19.TestNGAnnothations.ClickReports.reports", "addEmployee"})
	  public void reportsDepends() {
		driver.findElement(By.linkText("Reports")).click();
	  }
 
}
