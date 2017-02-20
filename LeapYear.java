package com.Bridgelabz;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		char d='y';
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
			System.out.println("Do you want conitnue?,press y ");
			d=scn.next().charAt(0);
	//	}
	//	catch(InputMismatchException e)
			// changed from try catch block to if block
			if(d!='y'&&d!='Y')
		{
			System.out.println("Thank you ");
			System.exit(0);
		}
			}while(d=='y'||d=='Y');
		System.out.println("Thank you.");
	
		scn.close();
	}

}
