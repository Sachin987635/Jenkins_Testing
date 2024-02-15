package Oct_30;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Practice3 {
	public static void main(String[] args) throws IOException {
		File f=new File("../Selenium_Project/src/Oct_30/input.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Hello i am updated.");
		bw.newLine();
		bw.write("Now i am in Noida.");
		bw.close();
	}
}
