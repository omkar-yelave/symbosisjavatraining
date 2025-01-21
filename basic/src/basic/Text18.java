package basic;

import java.util.Scanner;

public class Text18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no:");
		int n=sc.nextInt();
		if(n>0)
		{
			System.out.println(n+" is positive");
		}
		else if(n<0)
		{
			System.out.println(n+" is negative");
		}
		else
		{
			System.out.println(n+" is zero");
		}
	}

}
