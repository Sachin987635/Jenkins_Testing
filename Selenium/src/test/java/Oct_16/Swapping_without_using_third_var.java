package Oct_16;

public class Swapping_without_using_third_var {
	public static void main(String[] args) {
		int a=51;
		int b=2;
		System.out.println("Value of a "+a);
		System.out.println("Value of b "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Swapping done ");
		System.out.println("Value of a "+a);
		System.out.println("Value of b "+b);
	}
}
