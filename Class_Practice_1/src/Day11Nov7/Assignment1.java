package Day11Nov7;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/*Create a method (ReadDataBasedUponRowNoAndColumnNo) and pass the rowNo and columnNo 
that method will read the data of that particular cell while calling the method, 
pass the rowNo and columNo and that method will read the data of that particular cell*/
public class Assignment1 {
	public void ReadDataBasedUponRowNoAndColumnNo(int row,int column) throws BiffException, IOException{
		File f=new File("../Class_Practice/src/Day11Nov7/Importdata.xls");
		Workbook wk=Workbook.getWorkbook(f);
		Sheet sh=wk.getSheet(0);
		int r=sh.getRows();
		int c=sh.getColumns();
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				Cell cl=sh.getCell(j,i);
				if(i==row&&j==column) {
					System.out.println(cl.getContents());
				}
			}
		}
	}
	public static void main(String[] args) throws BiffException, IOException {
		Assignment1 obj=new Assignment1();
		obj.ReadDataBasedUponRowNoAndColumnNo(1,2);
	}
}
