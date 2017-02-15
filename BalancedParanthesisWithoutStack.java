package com.Bridgelabz;

import java.util.Scanner;
public class BalancedParanthesisWithoutStack {
	
	 public static boolean reu(char a, char b[],int n)
	 {
		 for (int i = n; i < b.length; i++) 
		 {
			if(b[i]=='{'||b[i]=='[')
			{
				char  c=b[i];
				n=i+1;
				reu(c,b,n);
			}
			else if(b[i]=='}'||b[i]==']')
			{
				
				if(b[n]-b[i-1]==2)
					
						{
					return true;
						}
			}
		}
		 
		return false; 
	 }

	public static void main(String[] args)
	{Scanner e=new Scanner(System.in);
		System.out.println("  enter the string ");
		
		 String s=e.next();
		 char a[]=new char[s.length()];
		 a=s.toCharArray();
		
		 for(int i=0;i<s.length();i++)
		 { 
		 if(a[i]=='{'||a[i]=='[')
		 {
		
		 char k=a[i];
		 while(i<s.length())
		 {
			
		if(BalancedParanthesisWithoutStack.reu(k, a, i+1))
		{
			
			if(i==(s.length()-2))
			{
				System.out.println("balanced");
				System.exit(0);
			}
			
		}i++;
			
		}
		
			System.out.println("not balanced");
		
		
	}

}
	}
}