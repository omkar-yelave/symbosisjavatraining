package basic;

import java.util.Scanner;

public class Text22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any two no:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		String res=(a>b)?(a+" greater no"):(b+" is greater no");
		System.out.println(res);
		
		int res2=(a>b)?a:b;
		System.out.println(res2+" is greater no.");
	}

}
