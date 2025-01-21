package basic;
class Class1{
	static int a,b;
	static void display()
	{
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
}
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class1.a=10;
		Class1.b=20;
		System.out.println("a:"+Class1.a);
		System.out.println("b:"+Class1.b);
		Class1.display();

	}

}
