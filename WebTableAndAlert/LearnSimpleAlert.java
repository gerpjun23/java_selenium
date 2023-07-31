package jul22.week3.day14.WebTableAndAlert;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSimpleAlert {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		//simple alert
		String simpleAlertText = driver.switchTo().alert().getText();
		System.out.println(simpleAlertText);
		driver.switchTo().alert().accept();
		
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		//confirmation alert
		//click ok button in the confirmation alert - accept()
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		//click cancel button in the confirmation alert - dismiss()
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		//prompt alert
		String promptAlertText = driver.switchTo().alert().getText();
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		System.out.println(promptAlertText);
		
		driver.switchTo().alert().sendKeys("Hi Sudhakar");
		driver.switchTo().alert().accept();
		
		String text = driver.findElement(By.xpath("//p[@id='result']")).getText();
		
		System.out.println("Result is: "+ text);
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		driver.switchTo().alert().dismiss();
		
		driver.close();
	}
	
	


}
