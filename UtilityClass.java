package com.Bridgelabz;

import java.util.Scanner;

public class UtilityClass {
	
// class which contains all bubble , insertion sort and binary search method for string and integer
	
	//binary search  method for integer
public static int BinarySearchForInteger(int[] sortedArray, int start, int end, int key)
{
        
        if (start < end) {
            int mid = start + (end - start) / 2; 
            if (key < sortedArray[mid]) 
            {
                return BinarySearchForInteger(sortedArray, start, mid, key);
                 
            } 
            else if (key > sortedArray[mid]) 
            {
                return BinarySearchForInteger(sortedArray, mid+1, end , key);
                 
            } 
            else 
            {
                return mid;  
            }
        }
        return -2; 
       }
//--------------------------------------------------------------------------------------------------//
//binary search method for string
public static int BinarySearchForString(String[] sortedArray, int first, int last, String key) 
{
	{
		
		while(first<=last){		

			int mid=(first+last)/2;
			if(key.compareTo(sortedArray[mid])<0){
				first=mid+1;
			}
			else if(key.compareToIgnoreCase(sortedArray[mid])<0){
				BinarySearchForString(sortedArray, first, mid, key);
			}
			else if (key.compareToIgnoreCase(sortedArray[mid]) >0)
            {
                return BinarySearchForString(sortedArray, mid+1, last , key);
                 
            } 
			else 
            {
                return mid;  
            }
		}
		return -2; 
    }
}
//---------------------------------------------------------------------------------------------
//bubble sort method for string

private static String[] bubbleSortForString(String[] str) 
{
	for (int i = 0; i < str.length-1; i++) 
	{
		for (int j = 0; j < str.length-1-i; j++) 
		{
			
			if(str[j].compareTo(str[j+1])>0)
			{
				String temp= str[j];
				str[j]=str[j+1];
				str[j+1]=temp;
			}
		
		}
	}
	
	return str;
}

//---------------------------------------------------------------------------------------------
//bubble sort method for integer


private static int[] bubbleSortForInteger(int[] str) 
{
	for (int i = 0; i < str.length-1; i++) 
	{
		for (int j = 0; j < str.length-1-i; j++) 
		{
			
			if(str[j]>str[j+1])
			{
			int  temp= str[j];
				str[j]=str[j+1];
				str[j+1]=temp;
			}
		
		}
	}
	
	return str;
}


public static void main(String[] args)
{
	int a[]=new int[10];
	String c[]=new String[10];
   Scanner sc =new Scanner(System.in);
   System.out.println("enter the elemnts which need to be sorted");
	for (int i = 0; i < a.length; i++) 
	{
		
	  a[i]=sc.nextInt();	
	}
	
	int b[]=UtilityClass.bubbleSortForInteger(a);
	
	for (int i = 0; i < b.length; i++) 
	{
		System.out.println(b[i]);
	}
	 System.out.println("enter the string which need to be sorted");
		for (int i = 0; i < a.length; i++) 
		{
			
		  c[i]=sc.next();	
		}
		
		String d[]=UtilityClass.bubbleSortForString(c);
		
		for (int i = 0; i < b.length; i++) 
		{
			System.out.println(d[i]);
		}
		
	
}
}
