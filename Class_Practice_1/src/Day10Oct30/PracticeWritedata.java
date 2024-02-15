package Day10Oct30;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeWritedata {
	public static void main(String[] args) throws IOException {
		File f=new File("../Class_Practice/src/Day10Oct30/output.txt");
		FileWriter fw=new FileWriter(f);
		
		int a=1;
		
		if (a==0) {
			fw.write("This is testdata");
			fw.close();
		}
		else {
			BufferedWriter br=new BufferedWriter(fw);
			br.newLine();
			br.write("This is line 1");
			br.newLine();
			br.write("This is line 2");
			br.close();
		}
	}
}
