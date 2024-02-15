package Oct_5;
/*"Assignment
Output should be in the below sequence

Parent 4 parameterized consrructor
Parent default constructor
Parent 3 parameterized consrructor
Parent 1 parameterized consrructor
Parent 2 parameterized consrructor
Child default parameterized consrructor
Child 1 parameterized constructor
Child 3 parameterized consrructor
Child 2 parameterized consrructor
Child 4 parameterized consrructor"*/
public class Child extends Parent{
	public Child() {
		super(1,2);
		System.out.println("Child Default Parametrized Construuctor");
	}
	public Child(int a) {
		this();
		System.out.println("Child 1 Parametrized Construuctor");
	}
	public Child(int a,int b) {
		this(1,2,3);
		System.out.println("Child 2 Parametrized  Construuctor");
	}
	public Child(int a,int b,int c) {
		this(1);
		System.out.println("Child 3 Parametrized Construuctor");
	}
	public Child(int a,int b,int c,int d) {
		this(1,2);
		System.out.println("Child 4 Parametrized Construuctor");
	}
	public static void main(String[] args) {
		Child obj=new Child(1,2,3,4);
	}
}
