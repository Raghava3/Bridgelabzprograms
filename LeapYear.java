package com.Bridgelabz;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		int n=0;
		int year=0;
		do
		{
			try{
				System.out.println("enter the year");
				year=scn.nextInt();
			}
			catch(InputMismatchException  e)
			{
				System.out.println("its not a year");
				break;
			}
			if((year/1000>=1)&&(year/1000<=9))

			{

				if ((year%4==0)||(year%400==0)&&(year%100!=0))
				{
					System.out.println("leap year");
				}
				else 
				{
					System.out.println("not a leap year");

				}
			}
			else 
			{
				System.out.println("number should be four digit");
			}
			try{
				System.out.println("enter 1 to continue");
				n=scn.nextInt();
			}
			catch(InputMismatchException e)
			{
				System.out.println("Thank you");
				System.exit(0);
			}
		}while(n==1);
		System.out.println("thank u");
		scn.close();
	}

}
