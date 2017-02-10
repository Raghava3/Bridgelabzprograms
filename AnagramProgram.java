package com.Bridgelabz;
import java.util.Scanner;

public class AnagramProgram {

	// method to remove spacess
	static String removeSpc(String st)
	{
		char ch[]=st.toCharArray();
		st=" ";
		for (int i = 0; i < ch.length; i++) {

			if(ch[i]!=' ')
			{
				st=st+ch[i];
			}

		}
		return st;
	}
	//method to convert String lower to  lower case
	static String toLower(String st)
	{
		char ch[]=st.toCharArray();
		st=" ";
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>=65&&ch[i]<=90)
			{
				st=st+(char)(ch[i]+32);
			}
			else
			{
				st=st+ch[i];

			}
		}
	
		return st;
	}
// method to sort
	static char[] sort (char c[])
	{
		for (int i = 0; i < c.length; i++)

		{
			for(int j=i+1;j<c.length;j++)

			{

				if(c[i]>=c[j])
				{
					char t=c[i];
					c[i]=c[j];
					c[j]=t;
				}
			}
		}
	
		return c;
	}

	static boolean check(String st1,String st2)
	{
		char ch1[]=st1.toCharArray();
		char ch2[]=st2.toCharArray();
		ch1=sort(ch1);
		ch2=sort(ch2);
		for (int i = 0; i < ch1.length; i++) 
		{
			if(ch1[i]!=ch2[i])
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args)
	{
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter first string");
		String st1=scn.nextLine();
		System.out.println("Enter second string");
		String st2=scn.nextLine();
		st1=removeSpc(st1);
		st2=removeSpc(st2);

		if(st1.length()!=st2.length())
		{ 
			
			
			System.out.println(" these two strings are not anagram");
			return;
		}
			
		st1=toLower(st1);
		st2=toLower(st2);

		boolean rs=check(st1,st2);
		if(rs)
		{			

			System.out.println("Strings are anagram");
			
		}
		else
		{
			System.out.println("strings are not anagram");
		}
	scn.close();
	System.out.println("Thank you");
	}
}
