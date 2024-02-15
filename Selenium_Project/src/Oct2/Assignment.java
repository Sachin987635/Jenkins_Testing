package Oct2;
/*4 parameterized constructor
3 parameterized constructor
default constructor
2 parameterized constructor
1 parameterized constructor*/

public class Assignment {
	public Assignment() {
		this(1,2,3);
		System.out.println("Default Parametrized method");
	}
	public Assignment(int a) {
		this(1,2);
		System.out.println("1 Parametrized method");
	}
	public Assignment(int a,int b) {
		this();
		System.out.println("2 Parametrized method");
	}
	public Assignment(int a,int b,int c) {
		this(1,2,3,4);
		System.out.println("3 Parametrized method");
	}
	public Assignment(int a,int b,int c,int d) {
		System.out.println("4 Parametrized method");
	}
	
	public static void main(String[]args) {
		Assignment obj=new Assignment(1);
	}
}
