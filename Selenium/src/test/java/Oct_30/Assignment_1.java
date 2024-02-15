package Oct_30;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Assignment_1 {
	public void Readdata(int n) throws IOException {
		File f=new File("../Selenium_Project/src/Oct_30/input.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String s;int a=0;
		Assignment_1 obj=new Assignment_1();
		while((s=br.readLine())!=null) {
			a=a+1;
			if(a==n) {
				System.out.println(s);
				break;
			}
		}
	}
	public static void main(String[] args) throws IOException {
		Assignment_1 obj=new Assignment_1();
		obj.Readdata(2);
	}
}
