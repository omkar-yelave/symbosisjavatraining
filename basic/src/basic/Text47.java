package basic;

import java.util.Scanner;

public class Text47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any 2 no:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int i,gcd = 0;
		for(i=1;i<=a && i<=b;i++)
		{
			if(a%i==0 && b%i==0)
			{
				gcd=i;
			}
		}
		System.out.println("gcd:"+gcd);
		int lcm=(a*b)/gcd;
		System.out.println("lcm:"+lcm);
		
	}

}
