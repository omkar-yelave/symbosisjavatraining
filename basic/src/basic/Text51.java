package basic;

import java.util.Scanner;

public class Text51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no:");
		int n=sc.nextInt();
		int sum=0,i,b,p=1;
		for(i=0;n!=0;i++)
		{
			b=n%2;
			sum=sum+b*p;
			n=n/2;
			p=p*10;
			
			
		}
		System.out.println("binary no:"+sum);
	}

}
