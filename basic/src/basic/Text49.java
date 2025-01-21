package basic;

import java.util.Scanner;

public class Text49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no:");
		int n=sc.nextInt();
		int i,j,flag;
		System.out.println("given no prime factor:");
		for(i=1;i<=n;i++)
		{
			flag=0;
			if(n%i==0)
			{
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

}
