package basic;

import java.util.Scanner;

public class Text27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no:");
		int n=sc.nextInt();
		System.out.println("1.check even/odd");
		System.out.println("2.check positive/negative");
		System.out.println("3.check divisible by3");
		System.out.println("enter your option:");
		int op=sc.nextInt();
		switch(op)
		{
			case 1:
				String res1=(n%2==0)?("even"):("odd");
				System.out.println(res1);
				break;
			case 2:
				String res2=(n>0)?("positive"):(n<0)?("negative"):("zero");
				System.out.println(res2);
				break;
			case 3:
				String res3=(n%3==0)?("divisible by 3"):("not divisible by 3");
				System.out.println(res3);
				break;
			default:
				System.out.println("enter valid option");
		}
	}

}
