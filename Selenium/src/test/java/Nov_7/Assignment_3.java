package Nov_7;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Assignment_3 {
	public void WriteData() throws IOException, RowsExceededException, WriteException {
		Scanner s=new Scanner(System.in);
		int rowcount= s.nextInt();
		File f=new File("../Selenium/src/main/java/Nov_7/Input1.xls");
		WritableWorkbook wk=Workbook.createWorkbook(f);
		WritableSheet sh=wk.createSheet("sk", 0);
		int Sachin=0;
		for(int i=0;i<3;i++) {
			Sachin=Sachin+1;
			for(int j=0;j<3;j++) {
				Label lb=new Label(i, j, "Then");
				sh.addCell(lb);
			}
			if(Sachin==2) {
				break;
			}
		}
		wk.write();
		wk.close();
	}
	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		Assignment_3 obj=new Assignment_3();
		obj.WriteData();
		System.out.println();
	}
}