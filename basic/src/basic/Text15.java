package basic;

import java.util.Scanner;

public class Text15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a name:");
		String s=sc.nextLine();
		char c=s.charAt(0);
		System.out.println("first character is:"+c);
		
		System.out.println("enter your full name:");
		String p=sc.nextLine();
		System.out.println("name:"+p);
	}

}
