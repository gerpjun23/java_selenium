package jun23.week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnModalDialog {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement simpleAlert = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		
		WebElement confirmationAlert = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		
		WebElement promptAlert = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
			
		WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
		
		simpleAlert.click();
		driver.switchTo().alert().accept();
		//driver.quit();
		
		System.out.println(result.getText());
		
		confirmationAlert.click();
		//Clicking ok button in the Window Based prompt alert
		driver.switchTo().alert().accept();
		System.out.println(result.getText());
		
		confirmationAlert.click();
	
		//Clicking cancel button in the Window Based prompt alert
		driver.switchTo().alert().dismiss();
		System.out.println(result.getText());
		
		promptAlert.click();
		driver.switchTo().alert().sendKeys("Hi Sudhakar");
		driver.switchTo().alert().accept();
		System.out.println(result.getText());
		driver.switchTo().alert().accept();
		
		confirmationAlert.click();
		
		driver.switchTo().alert().dismiss();
		System.out.println(result.getText());
		
		
	}

}
