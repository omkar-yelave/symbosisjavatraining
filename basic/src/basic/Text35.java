package basic;

import java.util.Scanner;

public class Text35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your salary:");
		double sal=sc.nextDouble();
		double in=0.0;
		
		if(sal<=250000)
		{
			System.out.println("nil");
		}
		else if(sal>250000 && sal<=750000)
		{
			in=(5.0/100.0)*(sal-250000);
			System.out.println("tax:"+in);
		}
		else if(sal>750000 && sal<=1000000)
		{
			in=((10.0/100.0)*(sal-750000))+25000;
			System.out.println("tax:"+in);
		}
		else if(sal>1000000 && sal<=1500000)
		{
			in=((20.0/100.0)*(sal-250000))+25000+25000;
			System.out.println("tax:"+in);
		}
		else
		{
			in=(30.0/100.0)*(sal-250000)+25000+25000+100000;
			System.out.println("tax:"+in);
		}
		
	}

}
