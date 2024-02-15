package org.testing.ddframework;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.read.biff.WorkbookParser;

public class DataDrivenFramework {
	@Test(dataProvider = "dataprovider2")
	public void DDf(String s,String k){
	}
	@DataProvider
	public Object[][] dataprovider1(){
		Object[][] data=new Object[3][2];
		data[0][0]="user1";
		data[0][1]="pass1";
		data[1][0]="user2";
		data[1][1]="pass2";
		data[2][0]="user3";
		data[2][1]="pass3";
		return data;
	}
	@DataProvider
	public Object[][] dataprovider2() throws BiffException, IOException{
		File f=new File("../YtFramework/src/test/java/org/testing/ddframework/Output.xls");
		Workbook wk=Workbook.getWorkbook(f);
		Sheet sheet=wk.getSheet(0);
		int row=sheet.getRows();
		int col=sheet.getColumns();
		Object[][] object=new Object[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				Cell cell=sheet.getCell(j,i);
				object[i][j]=cell.getContents();
			}
		}
		
		return object;
	}
}	
