package Day12Nov13;

import java.awt.Label;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*
Create a method(WriteData) and pass the rowCount and columnCount and 
that method will write based upon rowCount and ColumnCount and 
the data which we will write we have to take from user using Scanner Class 
*/
public class Assignment4 {
	public void WriteData(int rowcount,int columncount) throws IOException {
		File file=new File("../Class_Practice_2/src/test/java/Day12Nov13/Assignment4Output.xlsx");
		FileOutputStream fileoutputstream=new FileOutputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("sachin");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter data : ");
		String sk;
		for(int i=0;i<rowcount;i++) {
			XSSFRow rows=sheet.createRow(i);
			for(int j=0;j<columncount;j++) {
				XSSFCell cells=rows.createCell(j);
				sk=sc.next();
				cells.setCellValue(sk);
			}
		}
		workbook.write(fileoutputstream);
		fileoutputstream.flush();
		fileoutputstream.close();
	}
	public static void main(String[] args) throws IOException {
		Assignment4 obj=new Assignment4();
		obj.WriteData(5,2);
	}
}
