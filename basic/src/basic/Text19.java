package basic;

import java.util.Scanner;

public class Text19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any 2 no:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>b)
		{
			System.out.println(a+" is greater no");
		}
		else
		{
			System.out.println(b+" is greater no");
		}
	}

}
