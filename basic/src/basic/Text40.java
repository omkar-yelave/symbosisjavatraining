package basic;

public class Text40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,even=0;
		System.out.println("even no 1-10:");
		for(i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
				even=even+i;
			}
		}
		System.out.println("additon of even no 1-10:"+even);
	}

}
