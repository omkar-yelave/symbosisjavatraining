package basic;

import java.util.Scanner;

public class Text12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year:");
		int y=sc.nextInt();
		if(y%4==0)
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("not leap year");
		}
		
	}

}
