package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Text16 {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		char ch = 0;
		int a,b,c = 0;
		
		try {
		System.out.println("enter a character:");
		 ch=(char) br.read();
		
		br.readLine();
		System.out.println("enter any 2 no:");
		 a=Integer.parseInt(br.readLine());
		 b=Integer.parseInt(br.readLine());
		 c=a+b;
		 System.out.println("char is:"+ch);
		System.out.println("add:"+c);
		}
		catch(Exception e) {}
		}
		
		
	}
