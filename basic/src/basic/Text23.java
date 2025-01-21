package basic;

import java.util.Scanner;

public class Text23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any 3 no:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int res=(a>b && a>c)?a:(b>c)?b:c;
		System.out.println(res+" is greater no.");
	}

}
