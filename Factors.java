package com.Bridgelabz;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Factors 
{
	public static void main(String[] args)
	{
		Scanner scn =new Scanner(System.in);
		char d=' ';
		int num=0;
		int p=0;
		do{
			try{
				System.out.println("Enter the number you want to find prime factors ");
				num=scn.nextInt();
			}
			catch(InputMismatchException e)
			{

				System.out.println("sorry you have  entered non-integer value ");
				break;
			}

			if(p!=1)
			{
				int  count;
				System.out.println("prime factors of "+num+" are");
				for (int i = 1; i <= num; i++) 
				{

					count = 0;
					for (int j = 2; j <= i / 2; j++)
					{
						if (i % j == 0)
						{
							count++;
							break;
						}
					}
					if (count == 0)
					{

						if(num%i==0)
						{

							System.out.println(i);
						}
					}
				}
			}

			try{
				System.out.println("Do you want to see prime factors of another number ?,press y or n");
				d=scn.next().charAt(0);
			}
			catch(InputMismatchException e)
			{
				System.out.println("Thank you ");
				System.exit(0);
			}

		}while(d=='y'||d=='Y');
		System.out.println("Thank you.");

		scn.close();
	}
}