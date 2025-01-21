package basic;

import java.util.Scanner;

public class Text44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no:");
		int n=sc.nextInt();
		int i,rev=0,rem;
		for(i=0;n!=0;i++)
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		System.out.println("rev no:"+rev);
	}

}
