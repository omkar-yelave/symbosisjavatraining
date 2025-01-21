package basic;

import java.util.Scanner;

public class Text14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of a,b,c:");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double p=Math.sqrt((b*b)-(4*a*c));
		System.out.println(p);
		double x=(-b+p)/(2*a);
		double y=(-b-p)/(2*a);
		System.out.println("solution:"+x+" "+y);
		
		
		
	}

}
