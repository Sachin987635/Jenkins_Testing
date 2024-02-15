package Day7Oct16;
//Swapping of two number using third variable
public class SwappingUsing_Third_Variable {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c = 0;
		System.out.println("value of a =" +a+" " +"value of b = " +b);
		c=a;
		a=b;
		b=c;
		System.out.println("value of a =" +a+" " +"value of b = " +b);
	}
}
