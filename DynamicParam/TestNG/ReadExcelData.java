package jul22.week4.day20.DynamicParam.TestNG;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public String[][] readData() throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook("./data/ErailStation.xlsx");

		XSSFSheet ws = wb.getSheet("Sheet1");
		
		int rowCount = ws.getLastRowNum();
		
		short cellCount = ws.getRow(1).getLastCellNum();
		
		String[][] data = new String[rowCount][cellCount];
		
		for(int i=1; i<=rowCount; i++)
		{
			for(int j=0; j<cellCount; j++)
			{
				String stringCellValue = ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(stringCellValue);
				data[i-1][j] = stringCellValue;
			}
		}
		
		wb.close();
		return data;
		
		
	}

}
