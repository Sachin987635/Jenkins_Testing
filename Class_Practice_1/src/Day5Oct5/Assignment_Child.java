package Day5Oct5;
/*
Parent 4 parameterized consrructor
Parent default constructor
Parent 3 parameterized consrructor
Parent 1 parameterized consrructor
Parent 2 parameterized consrructor
Child default parameterized consrructor
Child 1 parameterized constructor
Child 3 parameterized consrructor
Child 2 parameterized consrructor
Child 4 parameterized consrructor
*/
public class Assignment_Child extends Assignment_Parent{
	public void Assignment_Child(){
		super.Assignment_Parent(1,2);
		System.out.println("Child default constructor");
	}
	public void Assignment_Child(int a){
		this.Assignment_Child();
		System.out.println("Child 1 parameterized constructor");
	}
	public void Assignment_Child(int a,int b){
		this.Assignment_Child(1, 2, 3);
		System.out.println("Child 2 parameterized constructor");
	}
	public void Assignment_Child(int a,int b,int c){
		this.Assignment_Child(1);
		System.out.println("Child 3 parameterized constructor");
	}
	public void Assignment_Child(int a,int b,int c,int d){
		this.Assignment_Child(1, 2);
		System.out.println("Child 4 parameterized constructor");
	}
	
	public static void main(String[] args) {
		Assignment_Child obj=new Assignment_Child();
		obj.Assignment_Child(1,2,3,4);
	}
}
