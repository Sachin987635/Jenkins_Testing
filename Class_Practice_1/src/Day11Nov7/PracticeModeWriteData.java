package Day11Nov7;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class PracticeModeWriteData {
	public static void main(String[] args) throws BiffException, IOException, WriteException {
		File f=new File("../Class_Practice/src/Day11Nov7/Output.xls");
/*		WritableWorkbook wk=Workbook.createWorkbook(f);
		WritableSheet ws=wk.createSheet("sachin", 0);
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				Label lb=new Label(j, i, "Sachin");
				ws.addCell(lb);
			}
		}wk.write();
		wk.close();
	*/
		//Create sheet data ask from user for each label
		WritableWorkbook wk=Workbook.createWorkbook(f);
		WritableSheet sh=wk.createSheet("users", 0);
		Scanner sc=new Scanner(System.in);
		String userval;
		System.out.println("Enter data in excel");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				userval=sc.next();
				Label lb=new Label(j,i,userval);
				sh.addCell(lb);
			}
		}wk.write();
		wk.close();
	}
}
