package basic;

import java.util.Scanner;

public class Text29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter gender(enter only M/F):");
		char gen=sc.next().charAt(0);
		System.out.println("enter age:");
		int age=sc.nextInt();
		System.out.println("enter height in cm:");
		int h=sc.nextInt();
		if(gen=='M' || gen=='m')
		{
			if(age>25 && h>170)
			{
				System.out.println("he is selected");
			}
			else
			{
				System.out.println("he is not selected");
			}
		}
		else if(gen=='F' || gen=='f')
		{
			if(age>22 && h>160)
			{
				System.out.println("she is selected");
			}
			else
			{
				System.out.println("she is not selected");
			}
		}
		else
		{
			System.out.println("enter valid gender");
		}
	}

}
