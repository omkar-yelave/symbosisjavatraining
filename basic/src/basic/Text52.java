package basic;

import java.util.Scanner;

public class Text52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any binary no:");
		int n=sc.nextInt();
		int sum=0,b,p=1,i;
		for(i=0;n!=0;i++)
		{
			b=n%10;
			sum=sum+b*p;
			n=n/10;
			p=p*2;
		}
		System.out.println("decimal no:"+sum);
	}

}
