package basic;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any 2 no:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int tmp;
		tmp=a;
		a=b;
		b=tmp;
		System.out.println("after swapping:"+a+"," +b);
		
	}

}
