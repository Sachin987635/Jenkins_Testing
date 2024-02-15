package Day12Nov13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PracticeCodeWriteData {
	public static void main(String[] args) throws IOException {
		File file=new File("../Class_Practice_2/src/test/java/Day12Nov13/Output.xlsx");
		FileOutputStream fileoutputstream=new FileOutputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("sachin");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter data in excel");
		String userval;
		for(int i=0;i<3;i++) {
			XSSFRow row=sheet.createRow(i);
			for(int j=0;j<3;j++) {
				userval=sc.next();
				XSSFCell cell=row.createCell(j);
				cell.setCellValue(userval);
			}
		}
		workbook.write(fileoutputstream);
		fileoutputstream.flush();
		fileoutputstream.close();
	}
}
