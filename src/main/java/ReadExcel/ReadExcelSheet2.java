package ReadExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelSheet2 {
	public static void main(String [] args) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook("./excelData/S3_3EditOpportunity.xlsx");
		XSSFSheet ws = wb.getSheet("Sheet1");
		int rowCount = ws.getLastRowNum();
		System.out.println("RowCount "+rowCount);
		short cellCount = ws.getRow(0).getLastCellNum();
		System.out.println("CellCount "+cellCount);
		
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j <cellCount; j++) {
			String cellValue = ws.getRow(i).getCell(j).getStringCellValue();
			System.out.println("Values "+cellValue);
		}	
	}  
		wb.close();
	}	
}