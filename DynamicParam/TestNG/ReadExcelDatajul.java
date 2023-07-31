package jul22.week4.day20.DynamicParam.TestNG;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelDatajul {

	@Test
	public String[][] readData() throws IOException {
		
		//Step1: Access the Workbook
		XSSFWorkbook wb = new XSSFWorkbook("./datajul22/ReadData.xlsx");
		
		//Step2: Access the Worksheet
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		//Step3: Get the Last Row value count
		int rowCount = ws.getLastRowNum();
		//System.out.println(rowCount);
		
		//Step4: Get the Last Column value count
		short cellCount = ws.getRow(0).getLastCellNum();
		//System.out.println(cellCount);
		
		String[][] data = new String[rowCount][cellCount];
		
		for(int i=1; i <= rowCount; i++)
		{
			for(int j=0; j<cellCount; j++)
			{
				String stringCellValue = ws.getRow(i).getCell(j).getStringCellValue();
				//System.out.println(stringCellValue);
				data[i-1][j]=stringCellValue;
			}
		}
		
		wb.close();
		return data;
		
		

	}

}
