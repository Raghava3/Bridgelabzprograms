package com.Bridgelabz;

import java.util.Scanner;

public class MainClassForSD {
	
	public static void main(String[] args)
	{
	boolean k=true;
	int totalstock=0;
	int totalvalue=0;
	Scanner scn=new Scanner(System.in);
	LinkedListClassForSD l1=new LinkedListClassForSD();
	System.out.println("Enter how many values you want to store");
   int n =scn.nextInt();
   for (int i = 0; i < n; i++)
   {
	System.out.println("enter name of"+(i+1)+"element");
	String stockname=scn.next();
	System.out.println("enter number of stock");
	int noofshares=scn.nextInt();
	System.out.println("enter the price of the share");
    int price=scn.nextInt();
     totalstock=totalstock+n;
     totalvalue=totalvalue+(noofshares*price);
  StockData ob=   new StockData(stockname,noofshares,price);
    k=l1.insert(ob);
    System.out.println(k);
    
   }

    l1.display(n);

   	
   }
	}
