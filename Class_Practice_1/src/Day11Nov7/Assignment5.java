package Day11Nov7;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class Assignment5 {
	public static void main(String[] args) throws BiffException, IOException, WriteException {
		File f=new File("../Class_Practice/src/Day11Nov7/Output1.xls");
		Workbook wk=Workbook.getWorkbook(f);
		Sheet sh=wk.getSheet(0);
		int row=sh.getRows();
		int col=sh.getColumns();
		File ff=new File("../Class_Practice/src/Day11Nov7/Outputtest.xls");
		WritableWorkbook wr=Workbook.createWorkbook(ff);
		WritableSheet ws=wr.createSheet("sachink", 0);
		String sk;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				Cell cl=sh.getCell(j, i);
				sk=cl.getContents();
				Label lb=new Label(j, i, sk);
				ws.addCell(lb);
			}
		}wr.write();
		wr.close();
		System.out.println("Completed");
	}
}
