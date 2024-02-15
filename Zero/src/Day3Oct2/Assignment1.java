package Day3Oct2;
/*
4 parameterized constructor
3 parameterized constructor
default constructor
2 parameterized constructor
1 parameterized constructor
*/
public class Assignment1 {
	public Assignment1() {
		this(1,2,3);
		System.out.println("default constructor");
	}
	public Assignment1(int a) {
		this(1,2);
		System.out.println("1 parameterized constructor");
	}
	public Assignment1(int a,int b) {
		this();
		System.out.println("2 parameterized constructor");
	}
	public Assignment1(int a,int b,int c) {
		this(1,2,3,4);
		System.out.println("3 parameterized constructor");
	}
	public Assignment1(int a,int b,int c,int d) {
		System.out.println("4 parameterized constructor");
	}
	public static void main(String[] args) {
		Assignment1 obj=new Assignment1(1);
	}
}
