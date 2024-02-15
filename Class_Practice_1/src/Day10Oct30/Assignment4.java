package Day10Oct30;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
Create a method named WriteDataInaRange 
and pass the initialrowCount,endrowCount and that method will 
write in that range and you have to take the data from user, 
that should be write in the file(2,7) 
while calling the method should write from 2nd to 7th line and first line will be blank
 * */
public class Assignment4 {
	public void WriteDataInaRange(int start,int end) throws IOException {
		File f=new File("../Class_Practice/src/Day10Oct30/output1.txt");
		FileWriter fw=new FileWriter(f,true);
		int sachin=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value");
		BufferedWriter br=new BufferedWriter(fw);
		for(int i=1;i<=end;i++) {
			sachin++;
			if(sachin>=start) {
				String sk=sc.nextLine();
				br.write(sk);
			}
			br.newLine();
		}br.close();
		
	}
	public static void main(String[] args) throws IOException {
		Assignment4 obj=new Assignment4();
		obj.WriteDataInaRange(2,4);
	}
}
