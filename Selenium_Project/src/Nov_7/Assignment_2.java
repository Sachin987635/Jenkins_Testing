package Nov_7;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Assignment_2 {
	public void ReadDataInRange(int x,int y) throws BiffException, IOException {
		Scanner s=new Scanner(System.in);
		x=s.nextInt();
		y=s.nextInt();
		File f=new File("../Selenium_Project/src/Nov_7/Input.xls");
		Workbook wk=Workbook.getWorkbook(f);
		Sheet sh=wk.getSheet(0);
		int row=sh.getRows();
		int col=sh.getColumns();
		int Sachin=0;
		for(int i=0;i<row;i++) {
			Sachin=Sachin+1;
			if(Sachin>=x && Sachin<=y) {
			for(int j=0;j<col;j++) {
					Cell cell=sh.getCell(j,i);
					System.out.println(cell.getContents());
				}
			}
		}
	}
	public static void main(String[] args) throws BiffException, IOException {
		Assignment_2 obj=new Assignment_2();
		obj.ReadDataInRange(2,4);
	}
}
