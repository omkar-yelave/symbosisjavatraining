package basic;

import java.util.Scanner;

public class Text53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter decimal no:");
		int n=sc.nextInt();
		int sum=0,b,p=1,i;
		for(i=0;n!=0;i++)
		{
			b=n%8;
			sum=sum+b*p;
			n=n/8;
			p=p*10;
		}
		System.out.println("octal no:"+sum);
	}

}
