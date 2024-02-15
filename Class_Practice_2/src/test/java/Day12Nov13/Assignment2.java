package Day12Nov13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Create a method (ReadDataBasedUponRowNo) and that method will read the data of that particular row.
public class Assignment2 {
	public void ReadDataBasedUponRowNo(int row) throws IOException {
		File f=new File("../Class_Practice_2/src/test/java/Day12Nov13/input.xlsx");
		FileInputStream fileinputstream=new FileInputStream(f);
		XSSFWorkbook workbook=new XSSFWorkbook(fileinputstream);
		XSSFSheet sheet=workbook.getSheetAt(0);
		int rowcount=sheet.getLastRowNum();
		for(int i=0;i<rowcount;i++) {
			if(i==row) {
				XSSFRow rows=sheet.getRow(i);
				int cellcount=rows.getPhysicalNumberOfCells();
				for(int j=0;j<cellcount;j++){
					XSSFCell cells=rows.getCell(j);
					System.out.println(cells.getStringCellValue());
				}
			}
		}
	}
	public static void main(String[] args) throws IOException {
		Assignment2 obj=new Assignment2();
		obj.ReadDataBasedUponRowNo(0);
	}
}
