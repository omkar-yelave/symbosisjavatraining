package basic;

import java.util.Scanner;

public class Text43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no:");
		int n=sc.nextInt();
		int i,rem,sum=0;
		for(i=0;n!=0;i++)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println("in no digit sum:"+sum);
	}

}
