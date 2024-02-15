package Day4Oct3;

import java.util.Scanner;

//(((((x1+x2)+x3)*x4)-x5)/x6)
public class Assigment {
	public int sum(int a,int b) {
		int c=a+b;
		return c;
	}
	public int sub(int a,int b) {
		int c=a-b;
		return c;
	}
	public int mul(int a,int b) {
		int c=a*b;
		return c;
	}
	public void div(int a,int b) {
		int c=a/b;
		System.out.println("(((((x1+x2)+x3)*x4)-x5)/x6) = "+c);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of x1");
		int x1=sc.nextInt();
		System.out.println("Enter value of x2");
		int x2=sc.nextInt();
		System.out.println("Enter value of x3");
		int x3=sc.nextInt();
		System.out.println("Enter value of x4");
		int x4=sc.nextInt();
		System.out.println("Enter value of x5");
		int x5=sc.nextInt();
		System.out.println("Enter value of x6");
		int x6=sc.nextInt();
		
		Assigment obj=new Assigment();
		int temp=obj.sum(x1, x2);
		temp=obj.sum(temp,x3);
		temp=obj.mul(temp,x4);
		temp=obj.sub(temp,x5);
		obj.div(temp,x6);
	}
}
