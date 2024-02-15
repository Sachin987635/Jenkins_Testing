package Oct_30;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Assignment_2 {
	public void ReadDataOfRange(int a,int b) throws IOException {
		File f=new File("../Selenium_Project/src/Oct_30/input.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String s;
		int n=0;
		while((s=br.readLine())!=null) {
			n=n+1;
			if(n>=a && n<=b) {
				System.out.println(s);
				if(n==b) {
					break;
				}
			}	
		}
		
	}
	public static void main(String[] args) throws IOException {
		Assignment_2 obj=new Assignment_2();
		obj.ReadDataOfRange(3,8);
	}
}
