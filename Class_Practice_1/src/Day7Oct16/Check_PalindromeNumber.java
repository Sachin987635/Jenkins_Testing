package Day7Oct16;

import java.util.Scanner;

public class Check_PalindromeNumber {

public static void main(String []args) {
	System.out.println("Enter some value : ");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int temp=n;
	int rev=0,rem;
	while(n!=0) {
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	if(temp==rev) {
		System.out.println("This is a palindrome");
	}
	else {
		System.out.println("This is not a palindrome");
	}
}
}
