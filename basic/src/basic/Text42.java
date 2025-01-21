package basic;

import java.util.Scanner;

public class Text42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no:");
		double n=sc.nextDouble();
		double i,fact=1;
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial is:"+fact);
	}

}
