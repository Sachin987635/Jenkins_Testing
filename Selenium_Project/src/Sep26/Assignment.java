package Sep26;
//((((10+2)+2)-2)*2)/2)
public class Assignment {
	public int sum(int a,int b) {
		int c =a+b;
		return c;
	}
	public int sub(int a,int b) {
		int c =a+b;
		return c;
	}
	public int mul(int a,int b) {
		int c =a+b;
		return c;
	}
	public void div(int a,int b) {
		int c =a+b;
		System.out.println(c);
		}
	public static void main(String[] args) {
		Assignment obj=new Assignment();
		int temp=obj.sum(10, 2);
		obj.sum(temp, 2);
		obj.sub(temp, 2);
		obj.mul(temp, 2);
		obj.div(temp, 2);
	}
}
