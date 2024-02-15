package Day9Oct23;

public class Double_loop_assignment6 {
	public static void main(String[] args) {
		int n=10;
		for(int i=1;i<=n;i++) { 
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
