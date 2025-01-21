package basic;

import java.util.Scanner;

public class Text45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no:");
		int n=sc.nextInt();
		int i,rem,rev=0;
		int t=n;
		for(i=0;n!=0;i++)
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		if(rev==t)
		{
			System.out.println(t+" is rev");
		}
		else
		{
			System.out.println(t+" is not rev");
		}
	}

}
