package basic;

import java.util.Scanner;

public class Text48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of term:");
		int n=sc.nextInt();
		int a=0,b=1,c,i;
		System.out.println("fibonnachi series:"+a+"\n"+b);
		
		for(i=2;i<n;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
	}

}
