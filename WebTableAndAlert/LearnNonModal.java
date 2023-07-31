package jul22.week3.day14.WebTableAndAlert;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnNonModal {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/howto/howto_css_modals.asp");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//button[text()='Open Modal'])[1]")).click();
		String text = driver.findElement(By.xpath("//p[text()='Modals are awesome!']")).getText();
		System.out.println(text);

	}

}
