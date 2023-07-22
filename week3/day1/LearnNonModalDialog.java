package jun23.week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnNonModalDialog {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.w3schools.com/howto/howto_css_modals.asp");
		
		driver.findElement(By.xpath("//button[@class='ws-btn w3-dark-grey']")).click();
		
		String helloWorld = driver.findElement(By.xpath("//p[text()='Hello World!']")).getText();
		System.out.println( helloWorld);
		

	}

}
