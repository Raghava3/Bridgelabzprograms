package com.Bridgelabz;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Triples
{
	public static void main(String[] args)
	{
		int n=0;
		char d='y';
		int flag=0;
		Scanner scn=new Scanner(System.in);
	do
		{
		 flag=0;
		try{
			System.out.println("Enter the value for n");
			n=scn.nextInt();
		}
		catch(InputMismatchException e)
		{

			System.out.println("sorry you have  entered non-integer value ");
			System.exit(0);
		}

		int a[]=new int[n];


		for (int i = 0; i<a.length; i++) 
		{ 
			System.out.println("enter the "+(i+1)+"value");
			try{
				a[i]=scn.nextInt();
			}
			catch(InputMismatchException e)
			{
				System.out.println("sorry you have  entered non-integer value ");
				System.exit(0);
				
			}

		}
		System.out.println(" the array values are"); 
		for (int i =0; i <a.length; i++) 
		{ 
			System.out.println(" "+a[i]);

		}
		//    logic  to find triples

		for (int i = 0; i <a.length; i++) 
		{ 
			for (int j = i+1; j <a.length; j++) 
			{
				for (int k = j+1; k <a.length; k++) 
				{ 
					if((a[i]+a[j]+a[k])==0)
					{
						flag=1;
						System.out.println("the triples are "+a[i]+" "+a[j]+" "+a[k]+" present at the location "+i+j+k);
					}

				}
			}
		}			if(flag==0)
		{
			System.out.println("no triples are present");
		}

		try{
			System.out.println("Do you want conitnue?,press y or n");
			d=scn.next().charAt(0);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Thank you ");
			System.exit(0);
		}
	}while(d=='y'||d=='Y');
	scn.close();
	System.out.println("Thank you");
}

}