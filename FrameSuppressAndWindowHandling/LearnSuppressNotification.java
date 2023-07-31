package jul22.week3.day15.FrameSuppressAndWindowHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSuppressNotification {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		  ChromeOptions chromeoptions = new ChromeOptions();
		  chromeoptions.addArguments("--remote-allow-origins=*");
		  chromeoptions.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(chromeoptions);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		//driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		String text = driver.findElement(By.xpath("//label[text()=' BOOK TICKET ']")).getText();
		System.out.println(text);
		
		
		//driver.findElement(By.linkText("Gift Cards")).click();

	}

}
