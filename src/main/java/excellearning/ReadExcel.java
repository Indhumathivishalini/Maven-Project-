package excellearning;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel { 

	public  String[][] readExcel(String excelSheet) throws IOException {
		// TODO Auto-generated method stub

		XSSFWorkbook wbook = new XSSFWorkbook("./data/"+excelSheet+".xlsx");
		XSSFSheet sheet = wbook.getSheetAt(0);
		
		//  to get total count of rows n a sheet
		int rowcount = sheet.getLastRowNum(); 
		System.out.println(rowcount);
		
		//to find rows and column number
		XSSFRow headerrow = sheet.getRow(0);
		int lastCellNum = headerrow.getLastCellNum();
		System.out.println(lastCellNum);
		
		String[][] data =new String[rowcount][lastCellNum];
		
		// to iterate through rows and column
		for (int i= 1; i<=rowcount;i++) {
		XSSFRow row = sheet.getRow(i);
		for(int j=0;j<lastCellNum;j++) {
		XSSFCell cell = row.getCell(j);	
		String value = cell.getStringCellValue();
		System.out.println(value);
		data[i-1][j]= value;
		}
		
		}
		
	wbook.close();
	return data;	
	}
	

}
