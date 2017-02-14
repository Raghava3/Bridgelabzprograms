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
        return -1; 
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
//---------------------------------------------------------------------------------------------
//insertion  sort method for string

		
		
		   public static void insertionSortForString(String[] array) 
			{
			        int len = array.length;

			        for (int i = len - 1; i > 0; i--) {
			            if (array[i].compareTo(array[i-1])<0)
			            {
			                swap(array, i, i - 1);
			            }
			        }

			        for (int i = 2; i < len; i++) {
			            String temp = array[i];
			            int j = i;
			            while (temp.compareTo(array[j - 1])<0)
			            {
			                array[j] = array[j - 1];
			                j--;
			            }
			            array[j] = temp;
			        }

			        for (int i = 0; i < array.length; i++) {
			        	
			        	System.out.println(array[i]);
						
					}
			    }

			    public static  void swap(String[] array, int i, int j) 
			    {
			        String temp = array[i];
			        array[i] = array[j];
			        array[j] = temp;
			    }
			    
			    
			  //---------------------------------------------------------------------------------------------
			  //insertion  sort method for integer 

			  		
			  		
			  		 /*  public static void insertionSortForInteger(int [] array) 
			  			{
			  			        int len = array.length;

			  			        for (int i = len - 1; i > 1; i--) {
			  			            if (array[i]<(array[i-1]))
			  			            {
			  			                swap(array, i, i - 1);
			  			            }
			  			        }

			  			        for (int i = 2; i < len; i++) {
			  			            int temp = array[i];
			  			            int j = i;
			  			            while (temp>(array[j - 1]))
			  			            {
			  			                array[j] = array[j - 1];
			  			                j--;
			  			            }
			  			            array[j] = temp;
			  			        }

			  			        for (int i = 0; i < array.length; i++) {
			  			        	
			  			        	System.out.println(array[i]);
			  						
			  					}
			  			    }

			  			    public static  void swap(int[] array, int i, int j) 
			  			    {
			  			        int temp = array[i];
			  			        array[i] = array[j];
			  			        array[j] = temp;
			  			    }
			    */
			    
			    
			    private static void insertionSortForInteger(int[] arr) {
					for (int i = 1; i < arr.length; i++) {
						int valueToSort = arr[i];
						int j = i;
						while (j > 0 && arr[j - 1] > valueToSort) {
							arr[j] = arr[j - 1];
							j--;
						}
						arr[j] = valueToSort;
					}
					
					for (int i = 0; i < arr.length; i++)
					{
						System.out.println(arr[i]);
					}
				}
			    
	  //---------------------------------------------------------------------------------------------
	// Main method

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
	
UtilityClass.insertionSortForInteger(a);
	
	/*for (int i = 0; i < b.length; i++) 
	{
		System.out.println(b[i]);
	}*/
	
	
	
	 System.out.println("enter the string which need to be sorted");
		for (int i = 0; i < a.length; i++) 
		{
			
		  c[i]=sc.next();	
		}
		
		UtilityClass.insertionSortForString(c);
		
		/*for (int i = 0; i < b.length; i++) 
		{
			System.out.println(d[i]);
		}*/
		sc.close();
}	
		


			  
}

