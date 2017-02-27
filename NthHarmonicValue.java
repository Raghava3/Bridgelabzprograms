package com.Bridgelabz;
import java.util.InputMismatchException;
import  java.util.Scanner;

import java.io.*;

public class NthHarmonicValue 
{

	public static int lcm(int a,int b)
	{
		int max,min,x,lcm=0;

		if(a>b)
		{
			max=a;
			min=b;
		}
		else
		{
			max=b;
			min=a;
		}
       for(int i=1;i<=min;i++)
		{
			x=max*i; 
			if(x%min==0) 
			{
				lcm=x; 
				break; 
			}
		}
		return lcm;
	}
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		int de=0,n=0;
		do{
			try{		
				System.out.println("enter the  n value to find harmonic");
				n=scn.nextInt();
		    	}
			catch(InputMismatchException e)
			{
				System.out.println("its not a  valid integer value");
				break;
			}
			if(n>22)
			{
				System.out.println("exceeds the memory,please give lesser value");
			}
			else{
			int d=1,ne=0;

			for(int i=1;i<=n;i++)
			{
				d=NthHarmonicValue.lcm(d,i);
			}
			for(int i=1;i<=n;i++)
			{
				ne=ne+(d/i);
			}
			System.out.println("the nth harmonic value is "+ne+"/"+d);
			}
			// exception handled 
			try{
				System.out.println("Do you want to continue ,press 1");
				de=scn.nextInt();
				}
			catch(InputMismatchException e)
			{
				System.out.println("Thank u");
				System.exit(0);
			}
		}while(de==1);
		scn.close();
	System.out.println("Thank u");
	}
}