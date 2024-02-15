package Oct2;
/*Output should be in the below sequence
3 parameterized method
1 parameterized method
4 parameterized method
2 parameterized method"*/
public class Assignment2 {
	public void m1(int a) {
		this.m3(1,2,3);
		System.out.println("1 Parametrized method");
	}
	public void m2(int a,int b) {
		this.m4(1,2,3,4);
		System.out.println("2 Parametrized method");
	}
	public void m3(int a,int b,int c) {
		System.out.println("3 Parametrized method");
	}
	public void m4(int a,int b,int c,int d) {
		this.m1(1);
		System.out.println("4 Parametrized method");
	}
	public static void main(String[] args) {
		Assignment2 obj=new Assignment2();
		obj.m2(1,2);
	}
}
