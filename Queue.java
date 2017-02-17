package com.Bridgelabz;

public class Queue {

	

	int[]QueueArray=new int[100];
	int front=-1;
	int rare=-1;
	static int count=0;
	
	
	public int  add()
	{
		int n=++count;
		return n;
	//	System.out.println("Current queue size="+count+"\n");
	}
	
	public int  exit()
	{
	 --count	;
	return count;
	}
	
	public int size()
	{
		return count;
	}
	
	public boolean empty()
	{
		return count==0;
	}
	
	public boolean full()
	{
		return count==10;
	}
}
	

