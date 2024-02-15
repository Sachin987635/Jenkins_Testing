package Rough_kam_di_kapi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Assignment_2 {
	public void ReadDataofRange(int startpoint,int endpoint) throws IOException{
		File f=new File("../Class_Practice/src/Rough_kam_di_kapi/input.txt");
		BufferedReader br=new BufferedReader(new FileReader(f));
		int sachin=0;
		String s;
		while((s=br.readLine())!=null){
			sachin++;
			if(sachin>=startpoint&&sachin<=endpoint) {
				System.out.println(s);
			}
		}
	}
	public static void main(String[] args) throws IOException {
		Assignment_2 obj=new Assignment_2();
		obj.ReadDataofRange(2,5);
	}
}
