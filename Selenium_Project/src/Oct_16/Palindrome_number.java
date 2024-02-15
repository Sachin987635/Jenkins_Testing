package Oct_16;

import java.util.Scanner;

public class Palindrome_number {
	public static void main(String[] args) {
		System.out.print("Check number : ");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int temp=no;
		int rev=0,rem;
		while(temp!=0) {
			rem=temp%10;       //121%10=1  //12%10=2   //1%10=1
			rev=rev*10+rem;	   //0*10+1=1  //1*10+2=12 //12*10+1=121
			temp=temp/10;      //121/10=12 //12/10=1   //1/10=0
		}
		if(no==rev) {
			System.out.println("Its a palindrome "+rev);
		}
		else {
			System.out.println("Its not a palindrome "+rev);
		}
	}
}
