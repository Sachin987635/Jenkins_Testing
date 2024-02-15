package Oct3;

import java.util.Scanner;

/*"Solve the below expression
(((((x1+x2)+x3)*x4)-x5)/x6)
sum
sub
mult
div
x1,x2,x3,x4,x5,x6"*/
public class Assignment {
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
		System.out.println("Result : "+c);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		int f=sc.nextInt();
		Assignment obj=new Assignment();
		int temp=obj.sum(a, b);
		temp=obj.sum(temp, c);
		temp=obj.mul(temp, d);
		temp=obj.sub(temp, e);
		obj.div(temp, f);
	}
}
