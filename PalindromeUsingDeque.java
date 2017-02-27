package com.Bridgelabz;

import java.util.Scanner;

public class PalindromeUsingDeque {
	
	public static void  main(String[]args)
	{	
		char d='o';
		Scanner sc=new Scanner(System.in);
		do{
		System.out.println("Enter to check palindrome or not");
		String st=sc.next();
		char[]ch=st.toCharArray();
		int n=ch.length-1;
		PalindromeMetods m=new PalindromeMetods(10);

		for(int i=0;i<ch.length;i++)
		{
			m.addFront(ch[i]);
		}

		int s=m.size();
		System.out.println("Size= "+s);

		String Sout="";

		for(int i=0;i<=n;i++)
		{
			char c=m.removeFront();
			Sout=Sout+c;
		}
		System.out.println("Reversed - "+Sout);
		if(st.equals(Sout))
		{
			System.out.println("Palindrome ");
		}
		else
		{
			System.out.println("not a palindrome ");
		}
		
		System.out.println("Do you want conitnue?,press y ");
		d=sc.next().charAt(0);
	}while(d=='y'||d=='Y');
	System.out.println("Thank you");
sc.close();
	}
	

}
