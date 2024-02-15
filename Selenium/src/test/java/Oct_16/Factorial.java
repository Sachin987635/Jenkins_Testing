package Oct_16;

public class Factorial {
	public static void main(String[] args) {
		int n=6;  //5*4*3*2*1
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
			System.err.print("x"+fact);
		}
		
		System.out.println(fact);
	}
}
