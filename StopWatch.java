package com.Bridgelabz;

import java.util.Scanner;

public class StopWatch {


	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		char d='y';
		long stopTime=0;
		long startTime=0;
		System.out.println("enter 1 to start");
		d=scn.next().charAt(0);
		
		do{
		if(d=='1')
		{
			startTime = System.currentTimeMillis();
		}
		else
		{  while(d!='1'){
			System.out.println("please start the clock by pressing 1 ");
			d=scn.next().charAt(0);
			if(d=='1')
			{
				startTime = System.currentTimeMillis();
			}
		}
		}
		System.out.println("enter 2 to stop ");
		d=scn.next().charAt(0);
		if(d=='2')
		{
			stopTime = System.currentTimeMillis();

		}	
		else
		{  while(d!='2'){
			System.out.println("please stop  clock by pressing 2 ");
			d=scn.next().charAt(0);
			if(d=='2'){
				stopTime = System.currentTimeMillis();
			}}
		}
		System.out.println("Elapsed time was " + (stopTime - startTime) + " miliseconds.");
		System.out.println("Elapsed time was " + (stopTime - startTime)/1000 + " seconds.");
		System.out.println("Do you want conitnue?,press y ");
		d=scn.next().charAt(0);
		
		
		}while(d=='y');
		System.out.println("Thank you");
		scn.close();
	}


}
