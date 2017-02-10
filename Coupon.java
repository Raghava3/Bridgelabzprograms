package com.Bridgelabz;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Coupon 
{
	
	public static void main(String[] args)
	{ 
		int n=0;
		char d=0;
		double a[];
		int k=0;
		do
			{
			Scanner s=new Scanner(System.in);
		try{	
		System.out.println(" Enter how many coupon you need ");
		n=s.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println("sorry you have  entered different  value ");
			System.exit(0);
			
		}
		
		
		a=new double[n];
	//logic to generate different coupon numbers
		System.out.println("your coupon numbers are");
		for (int i = 0; i < n; i++)
		{
			a[i]=Math.random();
			
			for(int j=0;j<i;j++)
			{
				k++;
				if(a[j]==a[i])
				{
					i--;
					break;
				}
		}
		}
		//print coupon numbers
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		
		try{
			System.out.println("Do you want conitnue?,press y or n");
			d=s.next().charAt(0);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Thank you ");
			System.exit(0);
		}
			}while(d=='y'||d=='Y');
		System.out.println("Thank you.");
	// total random numbers generated to get unique coupon numbers	System.err.println(k);
	}
}