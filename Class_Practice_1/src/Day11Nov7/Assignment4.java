package Day11Nov7;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

/*
Create a method(WriteData) and pass the rowCount and columnCount and 
that method will write based upon rowCount and ColumnCount and the data 
which we will write we have to take from user using Scanner Class
*/
public class Assignment4 {
	public void WriteData(int rowcount,int columncount) throws IOException, RowsExceededException, WriteException {
		File f =new File("../Class_Practice/src/Day11Nov7/Output1.xls");
		WritableWorkbook wk=Workbook.createWorkbook(f);
		WritableSheet sh=wk.createSheet("sachin", 0);
		Scanner sc=new Scanner(System.in);
		String sk;
		System.out.println("Enter data");
		for(int i=0;i<rowcount;i++) {
			for(int j=0;j<columncount;j++) {
				sk=sc.next();
				Label lb=new Label(j,i,sk);
				sh.addCell(lb);
			}
		}wk.write();
		wk.close();
		
	}
	public static void main(String[] args) throws RowsExceededException, WriteException, IOException {
		Assignment4 obj=new Assignment4();
		obj.WriteData(3,3);
	}
}
