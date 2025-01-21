package basic;

import java.util.Scanner;

public class Text34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a character:");
		char ch=sc.nextLine().charAt(0);
		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
		{
			System.out.println(ch+" is alphabet");
		}
		else if(ch>=0 && ch<=9)
		{
			System.out.println(ch+" is digit");
		}
		else
		{
			System.out.println(ch+" is special character");
		}
	}

}
