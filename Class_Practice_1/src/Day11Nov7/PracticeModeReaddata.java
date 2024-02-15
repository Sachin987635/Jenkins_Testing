package Day11Nov7;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;

public class PracticeModeReaddata {
	public static void main(String[] args) throws BiffException, IOException {
		File f=new File("../Class_Practice/src/Day11Nov7/Importdata.xls");
		Workbook wk=Workbook.getWorkbook(f);
		Sheet sh=wk.getSheet(0);
		int row=sh.getRows();
		int column=sh.getColumns();
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				Cell cl=sh.getCell(j,i);
				String sk=cl.getContents();
					System.out.println(sk);
			}
		}
	}
}