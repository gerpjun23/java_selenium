package jun23.week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSeleniumLinkText {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	ChromeDriver driver = new ChromeDriver(options);
	
	driver.get("https://www.google.ca/");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Français")).click();

	}

}
