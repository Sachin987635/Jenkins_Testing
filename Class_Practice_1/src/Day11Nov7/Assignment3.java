package Day11Nov7;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/*
Create a method (ReadDataBasedUponRange) and pass the initial row and 
end row that method will read the data based upon that range 
*/
public class Assignment3 {
	public void ReadDataBasedUponRange(int startrow,int endrow) throws BiffException, IOException {
		File f=new File("../Class_Practice/src/Day11Nov7/Importdata.xls");
		Workbook wk=Workbook.getWorkbook(f);
		Sheet sh=wk.getSheet(0);
		int r=sh.getRows();
		int c=sh.getColumns();
		for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					if((i>=startrow)&&(i<=endrow)) {
					Cell cl=sh.getCell(j,i);
					System.out.println(cl.getContents());
					}
			}
		}
	}
	public static void main(String[] args) throws BiffException, IOException {
		Assignment3 obj=new Assignment3();
		obj.ReadDataBasedUponRange(2,3);
	}
}
