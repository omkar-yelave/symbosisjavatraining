package basic;

public class Text68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,flag;
		System.out.println("prime no. 1-100:");
		for(i=1;i<=100;i++) {
			flag=0;
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(i);
			}
		}
		
	}

}
