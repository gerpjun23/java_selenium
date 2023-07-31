package jul22.week4.day19.TestNGAnnothations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static ChromeDriver driver;
	
	@Parameters({"password", "url", "username"})
	@BeforeMethod
	  public void beforeMethod(String pword, String url, String uname) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pword);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	  }
	
	@AfterMethod
	  public void afterMethod() {
		  driver.findElement(By.xpath("//P[text()='Paul Collings']")).click();
		  driver.findElement(By.linkText("Logout")).click();
		  driver.close();
	  }

}
