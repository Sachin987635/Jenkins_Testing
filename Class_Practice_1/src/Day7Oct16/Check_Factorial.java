package Day7Oct16;

import java.util.Scanner;

public class Check_Factorial {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter some value : ");
		int a=sc.nextInt();
		int sum=1;
		for(int i=1;i<=a;i++) {
			sum=sum*i;
		}
		System.out.println(sum);
	}
}
