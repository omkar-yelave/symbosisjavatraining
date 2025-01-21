package basic;

import java.util.Scanner;

public class Text54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter octal no:");
		int n=sc.nextInt();
		int sum=0,p=1,i,b;
		for(i=0;n!=0;i++)
		{
			b=n%10;
			sum=sum+b*p;
			n=n/10;
			p=p*8;
		}
		System.out.println("decimal no:"+sum);
	}

}
