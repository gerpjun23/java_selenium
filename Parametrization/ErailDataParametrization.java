package jul22.week4.day20.Parametrization;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ErailDataParametrization extends ErailStationBaseClass {

	@Test (dataProvider="fetchData")
	public void getTrainStation(String fromStation, String toStation)
	{
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationTo")).clear();
		
		driver.findElement(By.id("txtStationFrom")).sendKeys(fromStation);
			
		driver.findElement(By.id("txtStationTo")).sendKeys(toStation);		

		driver.findElement(By.id("buttonFromTo")).click();
		
	}
	
	@DataProvider (name ="fetchData")
	public String[][] sendData() throws IOException
	{
		/*
		 * String[][] data = new String[6][2];
		 * 
		 * data[0][0] = "Chennai Egmore"; data[0][1] = "Mumbai Central"; data[1][0] =
		 * "Delhi"; data[1][1] = "Goa"; data[2][0] = "Ahmedabad Jn"; data[2][1] =
		 * "Lucknow"; data[3][0] = "Chandigarh"; data[3][1] = "Delhi"; data[4][0] =
		 * "Thanjavur"; data[4][1] = "Mgr Chennai Ctr"; data[5][0] = "Ksr Bengaluru";
		 * data[5][1] = "BhopalJn";
		 * 
		 * 
		 * 
		 * return data;
		 */
		
		
		ReadingDataFromExcel re = new ReadingDataFromExcel();
		String[][] readData = re.readData();
		return readData;
		
		/*
		 * LearnReadingDataFromExcel re = new LearnReadingDataFromExcel(); String[][]
		 * readData = re.readData(); return readData;
		 */
		
		
	}

}
