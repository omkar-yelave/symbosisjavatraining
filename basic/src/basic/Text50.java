package basic;

import java.util.Scanner;

public class Text50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no:");
		int n=sc.nextInt();
		int a=0,b=1,c=0;
		if(n==a || n==b)
		{
			System.out.println(n+" is in fibonnachi series");
		}
		else
		{
			while(b<n)
			{
				c=a+b;
				a=b;
				b=c;
				if(b==n)
				{
					System.out.println(n+" is in fibonnachi series");
					return;  //exit the program.
				}
			}
			
		}
		if(n!=0 && n!=1)
		{
			System.out.println(n+" is not in fibonnachi series");
		}
	}

}
