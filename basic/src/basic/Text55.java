package basic;

import java.util.Scanner;

public class Text55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no:");
		int n=sc.nextInt();
		int b,sum=0,p=1,i;
		for(i=0;n!=0;i++)
		{
			b=n%16;
			sum=sum+b*p;
			n=n/16;
			p=p*10;
		}
		if(n<10)
		{
			System.out.println("hexadecimal no:"+sum);
		}
		else
		{
			
		}
	}

}
