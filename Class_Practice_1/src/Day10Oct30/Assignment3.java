package Day10Oct30;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
Create a method named WriteData and pass the rowCount and 
that method will write till that rowCount 
and you have to take the data from user, that should be write in the file 
*/
public class Assignment3 {
	public void WriteData(int RowCount) throws IOException {
		File f=new File("../Class_Practice/src/Day10Oct30/output1.txt");
		FileWriter fr=new FileWriter(f,true);
		BufferedWriter br=new BufferedWriter(fr);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter data");
		for(int i=1;i<=RowCount;i++) {
			String s=sc.nextLine();
			br.write(s);
			br.newLine();
		}
		br.close();
	}
	public static void main(String[] args) throws IOException {
		Assignment3 obj=new Assignment3();
		obj.WriteData(1);
	}
}
