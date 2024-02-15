package Oct_16;

import java.util.Scanner;

public class Prime_number{
	static int num;
	static boolean flag=true;
	public static void main(String[] args) {
		System.out.print("Please enter a value : ");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		sc.close();
		for(int i=2;i<=num-1;i++) {
			if(num%i==0) {
				flag=false;
			}
		}
		if(flag==true) {
			System.out.println("Its a prime number");
		}
		else {
			System.out.println("Its not a prime number");
		}
	}
}