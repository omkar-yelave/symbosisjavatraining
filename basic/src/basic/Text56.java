package basic;

import java.util.Scanner;

public class Text56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no:");
		int n=sc.nextInt();
		int i,sum=0;
		for(i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n)
		{
			System.out.println(n+" is perfect");
		}
		else
		{
			System.out.println(n+" is not perfect");
		}
	}

}
