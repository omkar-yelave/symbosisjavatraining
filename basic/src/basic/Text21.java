package basic;

import java.util.Scanner;

public class Text21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any 3 no:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a+" is greater no.");
			}
			else {
				System.out.println(c+" is greater no.");
			}
		}
		else {
			if(b>c)
			{
				System.out.println(b+" is greater no.");
			}
			else {
				System.out.println(c+" is greater no.");
			}
		}
	}

}
