package Nov_13;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Assignment_2 {
	public void ReadData() throws IOException {
		File f=new File("../Selenium/src/test/java/Nov_13/Input_Apache.xlsx");
		FileInputStream readdata=new FileInputStream(f);
		XSSFWorkbook wk=new XSSFWorkbook(readdata);
		XSSFSheet sheet=wk.getSheetAt(0);
		int r=sheet.getPhysicalNumberOfRows();
		int startval=0;
		for(int i=0;i<r;i++) {
			XSSFRow xr=sheet.getRow(i);
			startval=startval+1;
			if(startval>=2&&startval<=4) {
			for(int j=0;j<xr.getPhysicalNumberOfCells();j++) {
					XSSFCell xc=xr.getCell(j);
					System.out.println(xc.getStringCellValue());
				}
			}
		}
	}
	public static void main(String[]args) throws IOException {
		Assignment_1 obj=new Assignment_1();
		obj.ReadData();
	}
}
