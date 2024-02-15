package Day7Oct16;
//Swapping of two number without using third variable
public class SwappingWithout_Third_Variable {
	public static void main(String[] args) {
		int a=90;
		int b=47;
		System.out.println("Value of a = "+a+" Value of b = "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Value of a = "+a+" Value of b = "+b);
	}
}
