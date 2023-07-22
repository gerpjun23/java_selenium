package jun23.week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnRadioButton {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://demo.guru99.com/test/radio.html");
		
		WebElement radioButton1 = driver.findElement(By.xpath("(//input[@name='webform'])[1]"));
		WebElement radioButton2 = driver.findElement(By.xpath("(//input[@name='webform'])[2]"));
		WebElement radioButton3 = driver.findElement(By.xpath("(//input[@name='webform'])[3]"));
		
		for (int i=0; i<3; i++)
		{
			if (i==0)
				{
				radioButton1.click();
				System.out.println("RadioButton1 is selected");
				}
			
			else if (i==1)
			{
				radioButton2.click();
				System.out.println("RadioButton2 is selected");
				}	
			
		
		else
		{
			radioButton3.click();
		System.out.println("RadioButton3 is selected");
		}
			
		}
	}
		
	

}
