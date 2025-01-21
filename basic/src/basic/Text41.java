package basic;

public class Text41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,odd=0;
		System.out.println("odd no 1-10:");
		for(i=1;i<=10;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
				odd=odd+i;
			}
		}
		System.out.println("addition odd no 1-10:"+odd);
	}

}
