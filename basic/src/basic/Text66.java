package basic;

public class Text66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=4;j++)
			{
				if(j<(5-i))
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
	}

}
