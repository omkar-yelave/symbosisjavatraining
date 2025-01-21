package basic;
class Cal{
	void Add(int a,int b)
	{
		System.out.println("add:"+ (a+b));
	}
	void Sub(int a, int b)
	{
		System.out.println("sub:"+ (a-b));
	}
	void mul(int a, int b)
	{
		System.out.println("mul:"+ (a*b));
	}
	
}
public class Text6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		Cal k1=new Cal();
		k1.Add(a, b);
		k1.Sub(a, b);
		k1.mul(a, b);
		
		
	}

}
