package com.Bridgelabz;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TwoDarray {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int val=0;
		int r=0;
		int c=0;
		char d=' ';
		do
		{
			try{
				System.out.println("Enter the order of the matrix");
				r=sc.nextInt();
				c=sc.nextInt();
			}    
			catch(InputMismatchException e)
			{

				System.out.println("sorry you have  entered non-integer value ");
				System.exit(0);
			}
			try{
				System.out.println("Press 1 to get 2D Integer Array.");
				System.out.println("Press 2 to get 2D double Array.");
				System.out.println("Press 3 to get 2D boolean Array.");
				val=sc.nextInt();
			}
			catch(InputMismatchException e)
			{

				System.out.println("sorry you have pressed different number ");
				System.exit(0);
;
			}
			System.out.println("Enter "+r*c+" elements");
			switch(val)
			{  
			
			case 1:{
				int ar[][]=new int[r][c];
				for(int i=0;i<ar.length;i++)
				{
					for(int j=0;j<ar[i].length;j++)
					{
						try{
						ar[i][j]=sc.nextInt();
						}
						catch(InputMismatchException e)
						{

							System.out.println("sorry you have  entered non-integer value ");
							System.exit(0);
;
						}
					}
				}
				System.out.println("the array elements are");
				for(int i=0;i<ar.length;i++)
				{
					for(int j=0;j<ar[i].length;j++)
					{
						System.out.print(ar[i][j]+" ");
					}
					System.out.println();
				}
				break;  
			}
			case 2:{
				double ar[][]=new double[r][c];
				for(int i=0;i<ar.length;i++)
				{
					for(int j=0;j<ar[i].length;j++)
					{
						try{
						ar[i][j]=sc.nextDouble();
					}
						catch(InputMismatchException e)
						{

							System.out.println("sorry you have  entered non-integer value ");
							System.exit(0);
;
						}
					}
				}
				System.out.println("the array elements are");

				for(int i=0;i<ar.length;i++)
				{
					for(int j=0;j<ar[i].length;j++)
					{
						System.out.print(ar[i][j]+" ");
					}
					System.out.println();
				}
				break; 
			} 
			case 3:{
				boolean ar[][]=new boolean[r][c];
				for(int i=0;i<ar.length;i++)
				{
					for(int j=0;j<ar[i].length;j++)
					{ try{
						ar[i][j]=sc.nextBoolean();
					}
					catch(InputMismatchException e)
					{

						System.out.println("sorry you have  entered non-boolean value ");
						System.exit(0);

					}
					}
				}
				System.out.println("the array elements are");

				for(int i=0;i<ar.length;i++)
				{
					for(int j=0;j<ar[i].length;j++)
					{
						System.out.print(ar[i][j]+" ");
					}
					System.out.println();
				}
				break;  
			}	
			default:System.out.println("Entere valid option");
			}
			try{
				System.out.println("Do you want conitnue?,press y or n");
				d=sc.next().charAt(0);
			}
			catch(InputMismatchException e)
			{
				System.out.println("Thank you ");
				System.exit(0);
			}

		}while(d=='y'||d=='Y');
		sc.close();
		System.out.println("Thank you");
	}
}
