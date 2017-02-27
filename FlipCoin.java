package com.Bridgelabz;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FlipCoin {
	
	public static void main(String[] args)
	{
		Scanner scn =new Scanner (System.in);
		int head=0;
		char d='y';
		double count=0;
		do{
			try{	
				System.out.println("how many time you want to flip the coin: ");
				count=scn.nextInt();
			}
			catch(InputMismatchException e)
			{
				System.out.println("its not a number");
				break;
			}
			for(int i=1;i<=count;i++)
			{
				double j=Math.random();
				if(j<0.5)
				{
					System.out.println(i+" Heads");
					head++;
				}
				else
				{
					System.out.println(i+" Tails");
				}

			}

			double perc =(head*100)/count;
			System.out.println();
			System.out.println("Heads % = "+perc);

			System.out.println("Tails % = "+(100-perc));
	//		try
		//	{
				System.out.println("Do you wish to conitnue,press y");
				d=scn.next().charAt(0);
		//	}
		//	catch(InputMismatchException e)
				if(d!='y'&&d!='Y')	
			{
				System.out.println("thank u");

				System.exit(0);
			}
			
		}while(d=='y'||d=='Y');
System.out.println("Thank you");

	}

}