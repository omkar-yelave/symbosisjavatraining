package basic;

import java.util.Scanner;

public class Text26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any 2 no:");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		
	for(int i=0;true ;i++)
	{
		System.out.println("1.add");
		System.out.println("2.sub");
		System.out.println("3.mul");
		System.out.println("4.div");
		System.out.println("5.exit");
		System.out.println("enter option:");
		 int op=sc.nextInt();
		 if(op==5)
			{
				break;
			}
		switch(op)
		{
			case 1:
				System.out.println(a+b);
				break;
			case 2:
				System.out.println(a-b);
				break;
			case 3:
				System.out.println(a*b);
				break;
			case 4:
				System.out.println(a/b);
				break;
			default:
				System.out.println("enter valid option");
		}
		
	}
	}

}
