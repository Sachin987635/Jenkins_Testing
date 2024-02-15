package Rough_kam_di_kapi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Assignment_1 {
		public void ReadData(int count) throws IOException {
			Scanner sc=new Scanner(System.in);
			File f =new File("../Class_Practice/src/Rough_kam_di_kapi/input.txt");
			FileReader fr=new FileReader(f);
			BufferedReader br=new BufferedReader(fr);
			String s;
			System.out.println("Enter line number");
			count = sc.nextInt();
			int sachin=0;
			while((s=br.readLine())!=null) {
				sachin++;
				if(sachin==count) {
					System.out.println(s);
				}
			}
		}
		public static void main(String[] args) throws IOException {
			Assignment_1 obj=new Assignment_1();
			obj.ReadData(0);
		}
}
