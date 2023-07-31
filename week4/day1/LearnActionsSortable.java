package jun23.week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnActionsSortable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("-remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Sortable")).click();
		driver.switchTo().frame(0);
		
		
		WebElement Item1 = driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-arrowthick-2-n-s'])[1]"));
		WebElement Item2 = driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-arrowthick-2-n-s'])[2]"));
		WebElement Item3 = driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-arrowthick-2-n-s'])[3]"));
		WebElement Item4 = driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-arrowthick-2-n-s'])[4]"));
		WebElement Item5 = driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-arrowthick-2-n-s'])[5]"));
		WebElement Item6 = driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-arrowthick-2-n-s'])[6]"));
		WebElement Item7 = driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-arrowthick-2-n-s'])[7]"));
		Actions action = new Actions(driver);
		action.clickAndHold(Item3).moveToElement(Item5).release().perform();

	}

}
