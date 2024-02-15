package Nov_7;

import java.io.File;
import java.io.IOException;

import jxl.*;
import jxl.read.biff.BiffException;

public class Practice_ReadData {
	public static void main(String[] args) throws BiffException, IOException {
		File f=new File("../Selenium/src/main/java/Nov_7/Input.xls");
		Workbook wk=Workbook.getWorkbook(f);//Create an object and aquire value of workbook object
		Sheet sh=wk.getSheet(0);//Store sheet 0 data in sheet object
		int r=sh.getRows(); //get rows from sheet
		int c=sh.getColumns(); //get columns from sheet
		System.out.println(r); 
		System.out.println(c);
		for(int i=0;i<r;i++) { //loop for rows
			for(int j=0;j<c;j++) { //loop for columns
				Cell cl=sh.getCell(j,i); // create cell class object and take particullar cell value from sheet in form of RowColumn format Like A2
				System.out.println(cl.getContents()); //Print content of a cell
			}//loop will be restart until selected row data will not be read completely
		}// loop will restart after selected row all the columns are reading done
	}
}
