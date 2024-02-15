package Oct_30;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Assignment_3 {
	public void writedata() throws IOException {
		int setval;
		Scanner s=new Scanner(System.in);
		setval = s.nextInt();
		File f1=new File("../Selenium_Project/src/Oct_30/input.txt");
		FileReader fr=new FileReader(f1);
		BufferedReader br=new BufferedReader(fr);
		String str;
		int Sachin=0;
		File f=new File("../Selenium_Project/src/Oct_30/input1.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		while((str=br.readLine())!=null){
			Sachin=Sachin+1;
			System.out.println(str);
			bw.write(str);
			bw.newLine();
			if(Sachin==setval) {
				break;
			}
		}
		bw.close();
	}
	public static void main(String[] args) throws IOException {
		Assignment_3 obj=new Assignment_3();
		obj.writedata();
	}
}
