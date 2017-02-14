package com.Bridgelabz;

public class LinkedListForFile {
	
	Node head;
	Node last;
	// own implementation for insert
	public    boolean  insert (String s )
	{
		Node n=new Node(s);
		if(head==null && last==null)
		{
			head =n;
			last=n;
			return true;
		}
		else 
		{
			Node temp=last;
			last =n;
			temp.next=n;
			 temp=head;
		while(temp.next!=null)	
		{
			temp=temp.next;	 
	    }
		temp.next=null;
		
		return true;
		
		}
		}
	//own implementation to search
	public boolean search(String s)
	{
	    Node  tmp = head;
	    while(tmp!=null)
	    {
	    	
	        if(head==null)
	        {
	            return false;
	        }
	        else
	        {
	        String b=""+tmp.s;
	      
	        if(b.equals(s))
	        {
	         return true;
	        }
	        
	        tmp = tmp.next;
	      
	        }
	     //   return false;
	        }
   return false;
	
}
	
// method to get the index
	
	public int index(String s)
	{int n=0;
		  Node  tmp = head;
		    while(tmp!=null)
		    {
		    	n++;
		        if(head==null)
		        {
		            return -1;
		        }
		        else
		        {
		        String b=""+tmp.s;
		      
		        if(b.equals(s))
		        {
		         return n;
		        }
		        
		        tmp = tmp.next;
		      
		        }
		     //   return false;
		        }
	   return -1;
		
	}
	
}
