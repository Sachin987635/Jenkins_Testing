package Nov_7;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Assignment_1 {
	public void ReadData(int x) throws BiffException, IOException {
		File f=new File("../Selenium/src/main/java/Nov_7/Input.xls");
		Workbook wk=Workbook.getWorkbook(f);
		Sheet sh=wk.getSheet(0);
		int row=sh.getRows();
		int col=sh.getColumns();
		int sachin=0;
		for(int i=0;i<row;i++) {
			sachin=sachin+1;
			if(sachin==x){
				for(int j=0;j<col;j++) {
					Cell cell=sh.getCell(j,i);
					System.out.println(cell.getContents());
				}
			}
		}
	}
	public static void main(String[] args) throws BiffException, IOException{
		Assignment_1 obj=new Assignment_1();
		obj.ReadData(3);
	}
}
