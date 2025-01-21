package basic;

import java.util.Scanner;

public class Text20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks of 5 subject (each out off 100:)");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double d=sc.nextDouble();
		double e=sc.nextDouble();
		double tot=a+b+c+d+e;
		System.out.println("total is:"+tot);
		double per=(tot/500)*100;
		System.out.println("percentage is:"+per);
		if(a>=35 && b>=35 && c>=35 && d>=35 && e>=35)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		
	}

}
