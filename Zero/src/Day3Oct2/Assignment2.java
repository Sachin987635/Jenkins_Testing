package Day3Oct2;
/*
default method
3 parameterized method
1 parameterized method
4 parameterized method
2 parameterized method
*/
public class Assignment2 {
	public void m1() {
		System.out.println("default method");
	}
	public void m1(int a) {
		this.m1(1,2,3);
		System.out.println("1 parameterized method Test");
	}
	public void m1(int a,int b) {
		this.m1(1, 2, 3, 4);
		System.out.println("2 parameterized method Test");
	}
	public void m1(int a,int b,int c) {
		this.m1();
		System.out.println("3 parameterized method Test");
	}
	public void m1(int a,int b,int c,int d) {
		this.m1(1);
		System.out.println("4 parameterized method Test");
	}
	public static void main(String[] args) {
		Assignment2 obj=new Assignment2();
		obj.m1(1,2);
	}
}
