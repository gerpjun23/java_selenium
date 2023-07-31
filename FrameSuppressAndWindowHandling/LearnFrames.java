package jul22.week3.day15.FrameSuppressAndWindowHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrames {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		
		//1) Select a Frame by Index
		//driver.findElement(By.xpath("//frame[@id='frame1']"));
		driver.switchTo().frame(0);
		driver.findElement(By.tagName("input")).sendKeys("Sudhakar");
		
		//2) driver.swithTo().frame("idvalue" or "namevalue")
		driver.switchTo().frame("frame3");
		
		driver.findElement(By.xpath("//input[@id='a']")).click();
		
		//Moving back to the parent frame
		driver.switchTo().parentFrame();
		driver.findElement(By.tagName("input")).clear();
		driver.findElement(By.tagName("input")).sendKeys("Sailaja");

		//switch to the home page - DOM page 
		driver.switchTo().defaultContent();
		
		//3) Select the Frame by Xpath
		//driver.findElement(By.xpath("//iframe[@id='frame2']"));
		driver.switchTo().frame("frame2");
		
		WebElement animals = driver.findElement(By.id("animals"));
		Select selectAnimal = new Select(animals);
		selectAnimal.selectByValue("avatar");
		
	}

}
