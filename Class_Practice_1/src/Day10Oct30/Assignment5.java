package Day10Oct30;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Assignment5 {
	public void CopyData(String f1,String f2) throws IOException {
		File f =new File("../Class_Practice/src/Day10Oct30/input.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		File ff=new File("../Class_Practice/src/Day10Oct30/outputnew.txt");
		BufferedWriter bw=new BufferedWriter(new FileWriter(ff));
		int s;
		while((s=br.read())!=-1) {
			bw.write((char)s);
		}bw.close();
	}
	public static void main(String[] args) throws IOException {
		Assignment5 obj=new Assignment5();
		obj.CopyData("s", "k");
	}
}
