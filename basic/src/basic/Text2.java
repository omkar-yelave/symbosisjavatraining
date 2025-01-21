package basic;

public class Text2 {
	static int a,b;
	static void display()
	{
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
	public static void main(String []args) {
		a=10;
		b=20;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		display();
	}
}
