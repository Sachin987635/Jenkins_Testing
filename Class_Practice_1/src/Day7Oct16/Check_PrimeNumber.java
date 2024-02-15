package Day7Oct16;

import java.util.Scanner;

//Check prime number
public class Check_PrimeNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter some value");
		int value=s.nextInt();
		System.out.println("Lets check the value is prime or not : " + value);
		int half=value/2;
		int check=0;
		for (int i=2;i<=half;i++) {
			if(value%i==0) {
				System.out.println("This is not a prime number ");
				check=1;
				break;
			}
		}
		if(check==0) {
			System.out.println("This is a prime number");
		}
	}
}
