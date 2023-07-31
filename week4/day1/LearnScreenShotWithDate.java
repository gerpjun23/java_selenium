package jun23.week4.day1;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnScreenShotWithDate {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://demo.guru99.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Step 1: To take the screen shot we need to get the source ScreenShotAs Output File
		File sourceScreenShot = driver.getScreenshotAs(OutputType.FILE);
		
		Date date = new Date();
		String dateString = date.toString();
		System.out.println(dateString);
		
		String dateStringReplaceAll = dateString.replaceAll("[:, ]", "");


		//Step 2:Create a Target File
		File targetScreenShot = new File("./snapshot/guru99demo_"+dateStringReplaceAll+".jpg");
		
		
		//Step 3: Copy the source to Target
		FileUtils.copyFile(sourceScreenShot, targetScreenShot);
		
		System.out.println("Completed");
	}


}
