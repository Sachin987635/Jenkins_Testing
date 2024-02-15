package Nov_7;

import java.io.File;
import java.io.IOException;

import jxl.*;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class Practice_WriteData {
	public static void main(String[] args) throws BiffException, IOException, WriteException {
		File f=new File("../Selenium_Project/src/Nov_7/Input1.xls");
		WritableWorkbook wk=Workbook.createWorkbook(f);
		WritableSheet sh=wk.createSheet("Komal", 0);
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				Label l=new Label(i, j, "Komal");
				sh.addCell(l);
			}
		}
		wk.write();
		wk.close();
	}
}