package com.Bridgelabz;

public class LinkedListClassForSD {
	
	NodeClassForStockData head;
	NodeClassForStockData last;
	public  boolean  insert (StockData obj)
	{
		NodeClassForStockData n=new NodeClassForStockData(obj);
		if(head==null && last==null)
		{
			head =n;
			last=n;
			return true;
		}
		else 
		{
			NodeClassForStockData temp=last;
			last =n;
			temp.next=n;
			 temp=head;
		while(temp.next!=null)	
		{
			temp=temp.next;	 
	    }
		temp.next=n;
		return true;
		
		}
		}
	
	public void display(int n ,int t, int v)
		{
			
			NodeClassForStockData temp=head;
			for(int  i=0;i<n;i++)
			{
				System.out.println(temp.StockData);
				temp=temp.next;
				
			}
			System.out.println("total   number of  stock is "+t);
		System.out.println("totoal share value is "+v);
		
			
		}
	}
//own implementation for serch method  


