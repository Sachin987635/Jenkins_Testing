package Nov_13;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class Practice_ReadExcelData {
	public static void main(String[] args) throws IOException {
		File f=new File("../Selenium/src/test/java/Nov_13/Input_Apache.xlsx");
		//to read the data we will create file input stream object
		FileInputStream readdata=new FileInputStream(f);
		//to get the complete readed data in workbook create its object and aquire from inputstraem object
		XSSFWorkbook wk=new XSSFWorkbook(readdata);
		//Now create sheet object and take sheet index from workbook
		//Alternate to get sheet name wk.getSheet(sheet1);
		XSSFSheet sheet=wk.getSheetAt(0);
		//get row count in integer value
		int r=sheet.getPhysicalNumberOfRows();
		//Create for loop to get the Rows data till row count
		for(int i=0;i<r;i++) {
			//get rows data till row count
			XSSFRow rows=sheet.getRow(i);
			//Collect columns count from particular row
			int c=rows.getPhysicalNumberOfCells();
			//Create inner loop to get cell data with the help of rows index
			for(int j=0;j<rows.getPhysicalNumberOfCells();j++) {
				//Create cell object and get value one by one from particular row
				XSSFCell cell=rows.getCell(j);
				//print cell value in the form of string
				System.out.println(cell.getStringCellValue());
			}
		}
	}
}
