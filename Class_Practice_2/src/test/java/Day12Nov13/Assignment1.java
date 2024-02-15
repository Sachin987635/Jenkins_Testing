package Day12Nov13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*
Create a method (ReadDataBasedUponRowNoAndColumnNo) and pass the rowNo and columnNo that method will read 
the data of that particular cell while calling the method, pass the rowNo and columNo and 
that method will read the data of that particular cell 
*/
public class Assignment1 {
	public void ReadDataBasedUponRowNoAndColumnNo(int row,int cell) throws IOException {
		File file=new File("../Class_Practice_2/src/test/java/Day12Nov13/input.xlsx");
		FileInputStream fileinputstream=new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(fileinputstream);
		XSSFSheet sheet=workbook.getSheetAt(0);
		int rowcount=sheet.getLastRowNum();
		for(int i=0;i<rowcount;i++) {
			XSSFRow rows=sheet.getRow(i);
			int cellcount=rows.getLastCellNum();
			for(int j=0;j<cellcount;j++) {
				if(i==row&&j==cell) {
					XSSFCell cells=rows.getCell(j);
				System.out.println(cells.getStringCellValue());
				}
			}
		}
	}
	public static void main(String[] args) throws IOException {
		Assignment1 obj=new Assignment1();
		obj.ReadDataBasedUponRowNoAndColumnNo(1,0);
	}
}
