package basic;
class Class2{
	 int a,b;
	 void display()
	{
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
}
public class Text4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class2 t1=new Class2();
		t1.a=10;
		t1.b=20;
		System.out.println("a:"+t1.a);
		System.out.println("b:"+t1.b);
		t1.display();

	}

}
