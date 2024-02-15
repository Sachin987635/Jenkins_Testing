package Day10Oct30;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
Create a method named ReadData and pass the row No 
and that method will read the data of that particular row
*/
public class Assignment1 {
	public void ReadData(int givenval) throws IOException {
		File f=new File("../Class_Practice/src/Day10Oct30/input.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		int sachin=0;
		String s;
		while((s=br.readLine())!=null) {
			sachin++;
			if(sachin==givenval) {
				System.out.print(s);
				break;
			}
		}
	}
	public static void main(String[] args) throws IOException {
		Assignment1 obj=new Assignment1();
		obj.ReadData(3);
	}
}
