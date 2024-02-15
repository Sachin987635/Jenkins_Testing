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
public class Parent {
	public Parent() {
		this(1,2,3,4);
		System.out.println("Parent Default Parametrized Construuctor");
	}
	public Parent(int a) {
		this(1,2,3);
		System.out.println("Parent 1 Parametrized Construuctor");
	}
	public Parent(int a,int b) {
		this(1);
		System.out.println("Parent 2 Parametrized Construuctor");
	}
	public Parent(int a,int b,int c) {
		this();
		System.out.println("Parent 3 Parametrized Construuctor");
	}
	public Parent(int a,int b,int c,int d) {
		System.out.println("Parent 4 Parametrized Construuctor");
	}
}
