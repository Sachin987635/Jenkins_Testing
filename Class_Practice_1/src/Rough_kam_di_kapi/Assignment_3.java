package Rough_kam_di_kapi;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Assignment_3 {
	public void WriteDataInaRange(int rowcount) throws IOException {
		File f=new File("../Class_Practice/src/Rough_kam_di_kapi/output.txt");
		FileWriter fr=new FileWriter(f,true);
		BufferedWriter bw=new BufferedWriter(fr);
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("Enter some data");
		for(int i=1;i<=rowcount;i++) {
			s=sc.nextLine();
			bw.write(s);
			bw.newLine();
		}bw.close();
	}
	public static void main(String[] args) throws IOException {
		Assignment_3 obj=new Assignment_3();
		obj.WriteDataInaRange(2);
	}
}
