package Day12Nov13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*Create a method (ReadDataBasedUponRange) and pass the initial row and end row 
that method will read the data based upon that range
*/
public class Assignment3 {
	public void ReadDataBasedUponRange(int startcount,int endcount) throws IOException {
		File file=new File("../Class_Practice_2/src/test/java/Day12Nov13/input.xlsx");
		FileInputStream fileinputstream=new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(fileinputstream);
		XSSFSheet sheet=workbook.getSheetAt(0);
		int rowcount=sheet.getLastRowNum();
		for(int i=0;i<rowcount;i++) {
			XSSFRow rows=sheet.getRow(i);
			for(int j=0;j<rows.getLastCellNum();j++) {
			if(i>=startcount&&j<=endcount) {
					XSSFCell cells=rows.getCell(j);
					System.out.println(cells.getStringCellValue());
			}
			}
		}
	}
	public static void main(String[] args) throws IOException {
		Assignment3 obj=new Assignment3();
		obj.ReadDataBasedUponRange(2, 3);
	}
}
