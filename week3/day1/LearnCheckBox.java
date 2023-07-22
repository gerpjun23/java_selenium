package jun23.week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnCheckBox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://demo.guru99.com/test/radio.html");
		
		WebElement checkBox1 = driver.findElement(By.xpath("(//input[@name='webform'])[4]"));
		WebElement checkBox2 = driver.findElement(By.xpath("(//input[@name='webform'])[5]"));
		WebElement checkBox3 = driver.findElement(By.xpath("(//input[@name='webform'])[6]"));
		
			//select (or) click checkBox1
			checkBox1.click();
			boolean cb1 = checkBox1.isSelected();
			if (cb1==true)
			{
				System.out.println("CheckBox1 is Selected");
			}
			
			else
			{
				System.out.println("CheckBox1 is not Selected");
			}
			
			//checkBox2.click();
			boolean cb2 = checkBox2.isSelected();
			if (cb2==true)
			{
				System.out.println("CheckBox2 is Selected");
			}
			
			else
			{
				System.out.println("CheckBox2 is not Selected");
			}
			
			
			checkBox3.click();
			boolean cb3 = checkBox3.isSelected();
			if (cb3==true)
			{
				System.out.println("CheckBox3 is Selected");
			}
			
			else
			{
				System.out.println("CheckBox3 is not Selected");
			}
			
		

	}

}
