package excellearning;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EditExcel {

	public   String[][] editExcel(String excelSheet) throws IOException {
		// TODO Auto-generated constructor stub
		
	//	XSSFWorkbook wbook = new XSSFWorkbook("./data/"+excelSheet+".xlsx");
	//	XSSFSheet sheet = wbook.getSheetAt(1);	
		
		XSSFWorkbook wbook =new XSSFWorkbook(new FileInputStream("./Data/EditLead.xlsx"));
		XSSFSheet sheet = wbook.getSheet("Sheet1");
		
		int rowcount = sheet.getLastRowNum(); 
		System.out.println(rowcount);
		
		XSSFRow headerrow = sheet.getRow(0);
		int lastCellNum = headerrow.getLastCellNum();
		System.out.println(lastCellNum);
		
		String data[][] =new String[rowcount][lastCellNum];


		for(int i=1;i<=rowcount;i++) {

			XSSFRow row = sheet.getRow(i);


			for(int j=0;j<lastCellNum;j++) {
				org.apache.poi.xssf.usermodel.XSSFCell cell = row.getCell(j);

				String value = cell.getStringCellValue();

				System.out.println(value);


			    data[i-1][j]= value;		
	}
			

}
		
		wbook.close();

		return data;
		
		
		
	}}
