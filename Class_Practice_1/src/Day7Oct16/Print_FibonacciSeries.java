package Day7Oct16;

import java.util.Scanner;

public class Print_FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Value of a : "+a+" Value of b : "+b);
		for(int i=1;i<=50;i++) {
			int sum=a+b;
			a=b;
			b=sum;
			System.out.print(sum+",");
		}
	}
}
