package Day11Nov7;
//Create a method (ReadDataBasedUponRowNo) and that method will read the data of that particular row.
import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Assignment2 {
	public void ReadDataBasedUponRowNo(int row) throws BiffException, IOException {
		File f=new File("../Class_Practice/src/Day11Nov7/Importdata.xls");
		Workbook wk=Workbook.getWorkbook(f);
		Sheet sh=wk.getSheet(0);
		int r=sh.getRows();
		int c=sh.getColumns();
		for(int i=0;i<r;i++) {
			if(i==row) {
				for(int j=0;j<c;j++) {
					Cell cl=sh.getCell(j, i);
					System.out.println(cl.getContents());
				}
			}
		}
	}
	public static void main(String[] args) throws BiffException, IOException {
		Assignment2 obj=new Assignment2();
		obj.ReadDataBasedUponRowNo(1);
	}
}
