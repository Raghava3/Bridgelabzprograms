package com.Bridgelabz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GamblerOne {

	
	public static void main(String[] args)
	{
		int n=0,goal=0,amt=0;
		double w=0,l=0;
		Scanner scn=new  Scanner(System.in);
		try{
			System.out.println("Enter how much amount you have");
			amt=scn.nextInt();
			System.out.println("Enter the goal ");
			goal=scn.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println("sorry you have  entered different value ");
			System.exit(0);
		}
		do{
			if(goal<amt)
			{
				goal=goal+amt;
			}
			n++;

			double j=Math.random();
			if(j>0.5)
			{ 
				amt=amt+1;
				System.out.println("congrats u have won "+1+" $ total amt is "+amt);
				w=w+1;
			}
			else
			{ 
				amt=amt-1;
				System.out.println("sry  u have lost  "+1+" $ total amt is "+amt);
				l=l+1;
			}

		}while((amt!=0)&&((amt!=goal)||(amt<1)));
		if(amt==goal)
		{
			System.out.println("congrts u have reached u r goal");
		}
		else
		{
			System.out.println("sorry u have losed u r amount");
		}
		System.out.println("total play is "+n);
		System.out.println("win % is "+(w/n)*100);
		System.out.println("loss % is "+(l/n)*100);
		scn.close();
	}

}
