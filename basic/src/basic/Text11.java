package basic;

import java.util.Scanner;

public class Text11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter height of traingle:");
		int hight=sc.nextInt();
		System.out.println("enter base of traingle:");
		int base=sc.nextInt();
		
		int area=(base*hight)/2;
		System.out.println("area of traingle:"+ area);
	}

}
