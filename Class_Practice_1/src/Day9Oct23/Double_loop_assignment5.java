package Day9Oct23;
/*
     *
    **
   ***
  ****
 *****

 * */
public class Double_loop_assignment5 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=0;j<5-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
