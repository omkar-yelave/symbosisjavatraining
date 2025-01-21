package basic;

import java.util.Scanner;

public class Text33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a character:");
		char ch=sc.nextLine().charAt(0);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
		{
			System.out.println(ch+" is vowel");
		}
		else
		{
			System.out.println(ch+" is consonant");
		}
	}

}
