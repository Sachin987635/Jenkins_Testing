package Oct_30;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Practice2 {
	public static void main(String[] args) throws IOException {
		File f=new File("../Selenium_Project/src/Oct_30/input.txt");
		FileReader fr=new FileReader(f);
		BufferedReader rd=new BufferedReader(fr);
		String s;
		int Sachin=0;
		while((s=rd.readLine())!=null) {
			System.out.println(s);
			Sachin=Sachin+1;
			if(Sachin==1) {
				break;
			}
		}
	}
}
