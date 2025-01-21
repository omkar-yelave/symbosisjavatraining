package basic;

import java.util.Scanner;

public class Text24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a character:");
		char ch=sc.next().charAt(0);
		switch(ch)
		{
		case 'A':
		case 'a':
			System.out.println("apple");
			break;
		case 'B':
		case 'b':
			System.out.println("bat");
			break;
		case 'C':
		case 'c':
				System.out.println("cat");
				break;
		case 'D':
		case 'd':
				System.out.println("dog");
				break;
		default:
			System.out.println("enter valid character");
		}
	}

}
