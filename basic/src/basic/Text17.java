package basic;

import java.util.Scanner;

public class Text17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no:");
		int n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println(" "+n+" is even no");
		}
		else {
			System.out.println(" "+n+" is odd no");
		}
	}

}
