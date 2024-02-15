package Day9Oct23;
/*
             1
             2 3
             4 5 6
             7 8 9 10
 * */
public class Double_loop_assignment4 {
	public static void main(String[] args) {
	
		int x=1;
		for(int i=1;i<=10;) {
			for(int j=1;j<=x;j++) {
				System.out.print(i++ + " ");
			}
			
			System.out.println();
			x++;
		}
			
	}
}
