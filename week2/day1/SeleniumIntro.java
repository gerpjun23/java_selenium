package jun23.week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumIntro {

	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	ChromeDriver driver = new ChromeDriver(options);
	//FirefoxDriver driver = new FirefoxDriver(options);
	
	driver.get("https://demo.guru99.com/test/login.html");
	driver.manage().window().maximize();

	driver.findElement(By.id("email")).sendKeys("test@test.com");
	driver.findElement(By.name("passwd")).sendKeys("test");
	
	driver.findElement(By.id("SubmitLogin")).click();
	}
	
	
}
