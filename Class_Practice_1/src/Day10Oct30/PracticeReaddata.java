package Day10Oct30;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PracticeReaddata {
	public static void main(String[] args) throws IOException {
		File f=new File("../Class_Practice/src/Day10Oct30/input.txt");
		FileReader fr=new FileReader(f);
		int a=0;
		if(a==0) {
			int n;
			System.out.println("This is FileReader");
			while((n=fr.read())!=-1) {
				System.out.print((char)n);
			}
		}
		else {
			BufferedReader b=new BufferedReader(fr);
			String s;
			System.out.println("This is BufferReader");
			while((s=b.readLine())!=null) {
				System.out.println(s);
			}
		}
		
	}
}
