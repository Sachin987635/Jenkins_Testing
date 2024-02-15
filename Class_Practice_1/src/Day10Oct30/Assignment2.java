package Day10Oct30;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 Create a method named ReadDataofRange and pass the initial row No and end row no, 
 that method will read the data of that particular range.
*/
public class Assignment2 {
	public void ReadDataofRange(int start,int end) throws IOException {
		File f=new File("../Class_Practice/src/Day10Oct30/input.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		int sachin=0;
		String s;
		while((s=br.readLine())!=null) {
			sachin++;
			if((sachin>=start)&&(sachin<=end)) {
				System.out.println(s);
			}
		}
	}
	public static void main(String[] args) throws IOException {
		Assignment2 obj=new Assignment2();
		obj.ReadDataofRange(2,4);
	}
}
