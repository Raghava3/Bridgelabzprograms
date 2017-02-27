package com.Bridgelabz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FindYourNumber 
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
	//	System.out.println("enter a no:");
	//int no=scn.nextInt();
		int no=Integer.parseInt(args[0]);
		int arr[]=new int[no];
		int n=1,num=0,pow=1;
		int count=0;
		for(int i=1;i<=no/4;i++){
		pow=pow*2;
		count++;
		if(no==pow){
			break;
		}
	}
	for(int i=0;i<no;i++){
		arr[i]=++i;
	}
		try{
		System.out.println("assume a no between 1- "+(no-1)+"if assumed press 1 ");
		n=scn.nextInt();
		}
		catch(InputMismatchException a)
		{
			  num=	FindYourNumber.wrong();
			while(n!=1)
			{
				num=	FindYourNumber.wrong();
			}
		}
		if(n==1)
		{
		int f=0;
		int l=arr.length-1;
		int m;
		
		while(f<=l&&count!=-1)
		{
			
			m=(f+l)/2;
			if((m+1)==no)
			{
				System.out.println("your number is  exactly this "+m);
				return ;
			}
			else if (m==0)
			{
				System.out.println("your number is  exactly this "+(m+1));
				return;
			}
			count--;
			System.out.println("your assumed number is this "+m+" if yes  press 'ok'");
		
			System.out.println("\n or enter 'true' if the value is greater or enter  'false' if value is smaller " );
			String s=scn.next();
			
			if(s.equalsIgnoreCase("ok")){
				System.out.println("got it!!!!!!!!!  :"+m);
				return;
			}
			
			else if(s.equalsIgnoreCase("true"))
			{
				System.out.println("you have "+(count+1)+" turns");

				f=m+1;
			}
			else if(s.equalsIgnoreCase("false")){
				System.out.println("you have "+count+" turns");

				l=m-1;
			}
			
			else {
				System.out.println("invalid input");
				count++;
			    }
			
		}
		
		}
		System.out.println("!!!!!!!!!!!....first assume then search....!!!!!!!!!!!");

	}
	public static int wrong()
	{		
		Scanner scn =new Scanner(System.in);
		int n=0;
		try{
			System.out.println("assume and press 1");
			 n=scn.nextInt();
			// scn.close();
	     	}
		catch(InputMismatchException a)
		 {
			return 0;
		 }
		
		return n;
	}
	

}
