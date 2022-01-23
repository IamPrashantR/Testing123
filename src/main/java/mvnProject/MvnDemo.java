package mvnProject;

public class MvnDemo {
	static int mul;
	static int sum;
	static int div;
	public int addition(int m,int n)
	{
		sum=m+n;
		return sum;
	}
	public int multiplication(int m,int n)
	{
		mul=m*n;
		return mul;
	}
	public int division(int m,int n)
	{
		div=m/n;
		return div;
	}
	
	public static void main(String[] args) {
		MvnDemo obj=new MvnDemo();
		System.out.println(obj.addition(10, 20));
		System.out.println(obj.multiplication(20, 10));
		System.out.println(obj.division(20, 10));
		

	}

}
