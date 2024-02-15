package Rough_kam_di_kapi;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Assignment_4 {
	public void WriteDataInaRange(int initval,int endval) throws IOException{
		File f=new File("../Class_Practice/src/Rough_kam_di_kapi/output.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		Scanner sc=new Scanner(System.in);
		String sk = null;
		for(int i=0;i<=endval;i++) {
			int sachin=+1;
			if(sachin>=initval)
				sk=sc.next();
				bw.write(sk);
		}
	}
}
