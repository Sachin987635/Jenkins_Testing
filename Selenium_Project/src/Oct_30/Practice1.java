package Oct_30;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Practice1 {
	public static void main(String[] args) throws IOException {
		File f=new File("../Selenium_Project/src/Oct_30/input.txt");
		FileReader fr=new FileReader(f);
		int n;
		while((n=fr.read())!=-1) {
			System.out.print((char)n);
		}
	}
}
