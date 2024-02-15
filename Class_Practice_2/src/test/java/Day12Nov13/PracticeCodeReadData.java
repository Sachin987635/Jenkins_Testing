package Day12Nov13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PracticeCodeReadData {
	public static void main(String[] args) throws IOException {
		File f=new File("../Class_Practice_2/src/test/java/Day12Nov13/input.xlsx");
		XSSFWorkbook xw=new XSSFWorkbook(new FileInputStream(f));
		XSSFSheet sheet = xw.getSheetAt(0);
		int r=sheet.getPhysicalNumberOfRows();
		for(int i=0;i<r;i++) {
			XSSFRow row=sheet.getRow(i);
			System.out.println("-------------Row Start-------------");
			if(i==1) {
				int c=row.getPhysicalNumberOfCells();
				for(int j=0;j<c;j++) {
					XSSFCell cell=row.getCell(j);
					System.out.println(cell.getStringCellValue());
				}
			}
			
		}
	}
}
