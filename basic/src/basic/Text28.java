package basic;

import java.util.Scanner;

public class Text28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter base and hight:");
		int b=sc.nextInt();
		int h=sc.nextInt();
		System.out.println("1.area circle");
		System.out.println("2.area traingle");
		System.out.println("3.area reactangle");
		System.out.println("enter your option:");
		int op=sc.nextInt();
		switch(op)
		{
			case 1:
				System.out.println(3.14*b*b);
				break;
			case 2:
				System.out.println((b*h)/2);
				break;
			case 3:
				System.out.println(b*h);
				break;
			default:
				System.out.println("enter valid option");
		}
		
	}

}
