package com.Bridgelabz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CorrectVendingMachine {
	static int[] arr={1,2,5,10,20,50,100,500,1000};
	static int thousand,fivehundred,hundred,fifty,twenty,ten,five,two,one;
	public static void main(String[] args) 
	{
		int amount=0;
		Scanner scn =new Scanner(System.in);
		try{
		System.out.println("Enter the amount to get a change of that");
		 amount=scn.nextInt();
		}
		catch(InputMismatchException e)
		{
			// callin g,ethod if any exception are there 
		amount=	CorrectVendingMachine.wrong();
		while(amount==0)
		{
			amount=	CorrectVendingMachine.wrong();
		}
		}
		
		scn.close();
		change(amount);
		
	    System.out.println("Denomination table");
	    System.out.println("---------------------------------------------------");
		System.out.println("1000 * "+thousand+"="+"\t"+1000*thousand);
		System.out.println("500  * "+fivehundred+"="+"\t"+500*fivehundred);
		System.out.println("100  * "+hundred+"="+"\t"+100*hundred);
		System.out.println("50   * "+fifty+"="+"\t"+50*fifty);
		System.out.println("20   * "+twenty+"="+"\t"+20*twenty);
		System.out.println("10   * "+ten+"="+"\t"+10*ten);
		System.out.println("5    * "+five+"="+"\t"+5*five);
		System.out.println("2    * "+two+"="+"\t"+2*two);
		System.out.println("1    * "+one+"="+"\t"+1*one);
		System.out.println("--------------------------------------------------");
		System.out.println("Total denominatios :"+(thousand+fivehundred+hundred+fifty+twenty+ten+five+two+one));

		
	}
	static int change(int price)
	{
		if(price==0){
			return price;
		}
		while(price>=1000){
			price-=1000;
			thousand++;
		}
		if(price<1000&&price>=500){
			while(price<1000&&price>=500){
				price-=500;
				fivehundred++;
			}
		}
		else if(price<500&&price>=100){
			while(price<500&&price>=100){
				price-=100;
				hundred++;
			}
		}
		else if(price<100&&price>=50){
			while(price<100&&price>=50){
				price-=50;
				fifty++;
			}
		}
		else if(price<50&&price>=20){
			while(price<50&&price>=20){
				price-=20;
				twenty++;
			}
		}
		else if(price<20&&price>=10){
			while(price<20&&price>=10){
				price-=10;
				ten++;
			}
		}
		else if(price<10&&price>=5){
			while(price<10&&price>=5){
				price-=5;
				five++;
			}
		}
		else if(price<5&&price>=2){
			while(price<5&&price>=2){
				price-=2;
				two++;
			}
		}
		else if(price<2&&price>=1){
			while(price<2&&price>=1){
				price-=1;
				one++;
			}
		}
		return change(price);
	}
	
//method to handle the exception	
public static int wrong()
{		
	Scanner scn =new Scanner(System.in);
	int amt=0;
	try{
		System.out.println("Enter amount in number");
		 amt=scn.nextInt();
		 scn.close();
     	}
	catch(InputMismatchException a)
	 {
		return 0;
	 }
	
	return amt;
}
}
