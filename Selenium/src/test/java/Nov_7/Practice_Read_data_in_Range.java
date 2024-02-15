package Nov_7;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Practice_Read_data_in_Range {
	public void ReadDataInRange(int x,int y) throws BiffException, IOException {
		File f=new File("../Selenium/src/main/java/Nov_7/Input.xls");
		Workbook wk=Workbook.getWorkbook(f);
		Sheet sh =wk.getSheet(0);
		int row=sh.getRows();
		int col=sh.getColumns();
		int Sachin=0;
		int Kumar=0;
		for(int i=0;i<row;i++) {
			Sachin=Sachin+1;
			if(Sachin==x) {
				for(int j=0;j<col;j++) {
					Kumar=Kumar+1;
					if(Kumar==y) {
						Cell cell=sh.getCell(j, i);
						System.out.println(cell.getContents());
					}	
				}
			}
			
		}
	}
	public static void main(String[] args) throws BiffException, IOException {
		Assignment_2 obj=new Assignment_2();
		obj.ReadDataInRange(2,3);
	}
}
