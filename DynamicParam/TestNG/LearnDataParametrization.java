package jul22.week4.day20.DynamicParam.TestNG;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnDataParametrization extends BaseClass {

	@Test(dataProvider = "sendData")
	public void learnDataParametrization(String fname, String lname) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("My Info")).click();
		driver.findElement(By.name("firstName")).clear();
		driver.findElement(By.name("lastName")).clear();

		driver.findElement(By.name("firstName")).sendKeys(fname);
		driver.findElement(By.name("lastName")).sendKeys(lname);
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
	}

	@DataProvider(name = "sendData")
	public String[][] fetchData() throws IOException {
		/*
		 * String[][] data = new String[3][2];
		 * 
		 * data[0][0]="Prabhjot"; data[0][1]="Singh"; data[1][0]="Kanika";
		 * data[1][1]="K"; data[2][0]="Sivani"; data[2][1]="S"; data[3][0]="Sudhakar";
		 * data[3][1]="K";
		 */
		
		ReadExcelDatajul rd = new ReadExcelDatajul();
		String[][] readData = rd.readData();
		return readData;
	}

}
