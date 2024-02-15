package Day5Oct5;

public class Assignment_Parent {
	public void Assignment_Parent(){
		this.Assignment_Parent(1,2,3,4);
		System.out.println("Parent default constructor");
	}
	public void Assignment_Parent(int a){
		this.Assignment_Parent(1,2,3);
		System.out.println("Parent 1 parameterized constructor");
	}
	public void Assignment_Parent(int a,int b){
		this.Assignment_Parent(1);
		System.out.println("Parent 2 parameterized constructor");
	}
	public void Assignment_Parent(int a,int b,int c){
		this.Assignment_Parent();
		System.out.println("Parent 3 parameterized constructor");
	}
	public void Assignment_Parent(int a,int b,int c,int d){
		System.out.println("Parent 4 parameterized constructor");
	}
}
