package basic;

import java.util.Scanner;

public class Text32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a purchase price:");
		int p=sc.nextInt();
		System.out.println("enter a selling price:");
		int s=sc.nextInt();
		if(s>p)
		{
			System.out.println((s-p)+"rs profit");
		}
		else
		{
			System.out.println((p-s)+"rs loss");
		}
	}

}
