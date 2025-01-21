package basic;

import java.util.Scanner;

public class Text10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter tmp in centrigrade:");
		int c=sc.nextInt();
		int f=(c*9/5)+32;
		System.out.println("tmp in f:"+f);
	}

}
