package jun23.week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrame {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		String text = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
		System.out.println(text);
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome to Selenium");
		
		driver.switchTo().frame("frame3");
		WebElement frame3 = driver.findElement(By.xpath("//input[@type='checkbox']"));
		frame3.click();
		driver.switchTo().defaultContent();
		
		//driver.switchTo().parentFrame();
		
		driver.switchTo().frame("frame2");
		WebElement frame2 = driver.findElement(By.xpath("//select[@id='animals']"));
		Select select = new Select(frame2);
		select.selectByVisibleText("Avatar");
		
		
		
		
		
		

	}

}
