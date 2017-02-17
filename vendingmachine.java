package com.Bridgelabz;

public class vendingmachine {
public static void main(String[] args)
{
	int n=16990,k=0,j,t=n,d=n,r=n;
		j=n;//System.out.println(n.compareTo(k));
	while(n>=1)
	{
		k++;
		n=n/10;
		
	}
	System.out.println("coming");
	if(k>=4)
	{
		System.out.println("coming"+j);
		System.out.println((j/1000)+"  of 1000 rs notes "); 
	t=j-((j/1000)*1000);
	}
	d=t;
	t=t/500;
	if(t>=1)
	{
		
		d=d-500;
		System.out.println(d);
	}
	  if(d>1) 
	{
		System.out.println(d/100+" of 100 rs notes");
		
	}
	  r=d;
	  System.out.println("r"+r);
	  r=r-((d/100)*100);
	  if(r>=50)
	  {
		  System.out.println("1 of 50 rs note "); 
		  System.out.println(r-50);
	  }
	  r=r-50;
	  if(r==40)
	  {
		  System.out.println("20 of 20 notes ");
	  }
	  
	  System.out.println("r"+r);
	  if(r>0&&r<20)
	  {
		  System.out.println("1 of 20rs notes");
	  }
}
}
