package Day7Oct16;

import java.util.Scanner;

public class Check_ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=sc.nextInt();
		int temp=n;
		int rev=0,rem;
		if(n>=100&&n<=999) {
			while(n>0) {
				rem=n%10;
				System.out.println(rem);
				rev=rev+rem*rem*rem;
				System.out.println(rev);
				n=n/10;
				System.out.println(n);
				System.out.println("******************");
			}
		}
		if(n>=10&&n<=99) {
			while(n>0) {
				rem=n%10;
				System.out.println(rem);
				rev=rev+rem*rem;
				System.out.println(rev);
				n=n/10;
				System.out.println(n);
				System.out.println("******************");
			}
		}
		if(n>=1000&&n<=9999) {
			while(n>0) {
				rem=n%10;
				System.out.println(rem);
				rev=rev+rem*rem*rem;
				System.out.println(rev);
				n=n/10;
				System.out.println(n);
				System.out.println("******************");
			}
		}
		if(rev==temp) {
			System.out.println("This is an armstrong number ");
		}
		else {
			System.out.println("This is not an armstrong number ");
		
	}
}
}
