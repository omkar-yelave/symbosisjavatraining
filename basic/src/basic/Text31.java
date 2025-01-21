package basic;

import java.util.Scanner;

public class Text31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter basic salary:");
		double sal=sc.nextDouble();
		System.out.println("------------salary slip--------------");
		double da=(30.0/100.0)*sal;
		System.out.println("DA:"+da);
		double hra=(15.0/100.0)*sal;
		System.out.println("HRA:"+hra);
		double gs=sal+da+hra;
		System.out.println("gross salary:"+gs);
		double pf=(12.0/100.0)*sal;
		System.out.println("PF:"+pf);
		double ins=500;
		double nd=pf+ins;
		System.out.println("net deduction:"+nd);
		double ns=gs-nd;
		System.out.println("net salary:"+ns);
		
	}

}
