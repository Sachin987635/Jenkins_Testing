package Day10Oct30;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestPractice {

	public static void main(String[] args) throws IOException {
		File f=new File("../Class_Practice/src/Day10Oct30/output.txt");
		FileWriter fw=new FileWriter(f);
			BufferedWriter br=new BufferedWriter(fw);
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter data");
			for(int i=0;i<=3;i++) {
				String f1=sc.next();
				br.write(f1);
				br.newLine();
			}
			br.close();
	}
}
