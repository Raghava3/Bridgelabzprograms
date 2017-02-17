package com.Bridgelabz;

public class vendingmachine {
public static void main(String[] args)
{
	int n=1,k=0,j,t=n,d=n,r=n,c=0;
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
		c=j/1000;
	t=j-((j/1000)*1000);
	}
	d=t;
	t=t/500;
	if(t>=1)
	{
		
		d=d-500;
		System.out.println("1 no of 500 rs notes");
		c=c+1;
	}
	  if(d>1) 
	{
		System.out.println(d/100+" of 100 rs notes");
		c=c+1;
	}
	  r=d;
	  System.out.println("r"+r);
	  r=r-((d/100)*100);
	  if(r>=50)
	  {
		  System.out.println("1 of 50 rs note "); 
		  System.out.println(r-50);
		  c=c+1;
	  }
	  r=r-50;
	  if(r==40)
	  {c=c+2;
		  System.out.println("2  of 20 notes ");
	  }
	  
	//  System.out.println("r"+r);
	  else if (r>20)
	  {
		  c=c+1;
		  System.out.println("1 of 20rs notes");
		  
	  }
	  r=r-20;
	  System.out.println(r);
	  if(r>=10)
	  {
		  c=c+1;
		  System.out.println("1 of 10rs notes");
		  
	  }
	  r=r-10;
	  System.out.println(r);
	  if(r>5&&r!=0)
	  {
		  c=c+1;
		  System.out.println("1 of 5rs notes");
		  
	  }
	  r=r-5;
	  System.out.println(r);
	  if(r==4)
	  {
		  c=c+2;
		  System.out.println("2 no of 2 rs coin");
	  }
	  else if(r==3)
	  {
		  c=c+2;
		  System.out.println("1 no of 2 rs coin ");
		  System.out.println("1 no of 1 rs coin ");

	  }
	  else if(r==2)
	  {
		  c=c+1;
		  System.out.println("1 no of 2 rs coin ");
	  }
	  else
	  {
		  c=c+1;
		  System.out.println("1 no of 1 rs coin");
	  }
	  
	  System.out.println("totol no of denonination is "+c);
}
}
