package Day12Nov13;

import java.io.File;
/*
Read from filel and Write that data into File2(Copy + Paste)
*/
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Assignment5 {
	public static void main(String[] args) throws IOException {
		File file1=new File("../Class_Practice_2/src/test/java/Day12Nov13/Assignment3Output.xlsx");
		FileInputStream inputstream=new FileInputStream(file1);
		XSSFWorkbook workbook1=new XSSFWorkbook(inputstream);
		XSSFSheet sheet1=workbook1.getSheetAt(0);
		File file2=new File("../Class_Practice_2/src/test/java/Day12Nov13/AssignmentOutput.xlsx");
		FileOutputStream outputstream=new FileOutputStream(file2);
		XSSFWorkbook workbook2=new XSSFWorkbook();
		XSSFSheet sheet=workbook2.createSheet();
		int rowcount=sheet1.getPhysicalNumberOfRows();
		String sk = null;
		for(int i=0;i<rowcount;i++) {
			XSSFRow rows=sheet1.getRow(i);
			int cellcount=rows.getPhysicalNumberOfCells();
			for(int j=0;j<cellcount;j++) {
				XSSFCell cells=rows.getCell(j);
				sk=cells.getStringCellValue();
				System.out.println(sk);
			}
		}
		workbook2.write(outputstream);
		outputstream.flush();
		outputstream.close();
	}
	
}
