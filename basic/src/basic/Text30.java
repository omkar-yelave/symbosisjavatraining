package basic;

import java.util.Scanner;

public class Text30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter electricity unit:");
		double unit=sc.nextDouble();
		double res;
		if(unit<=100)
		{
			res=3*unit;
		}
		else if(unit<=300 && unit>=101)
		{
			res=300+5*unit;
		}
		else if(unit<=500 && unit>=301)
		{
			res=300+1000+7*unit;
		}
		else
		{
			res=300+1000+1400+10*unit;
		}
		System.out.println("bill:"+res);
	}

}
