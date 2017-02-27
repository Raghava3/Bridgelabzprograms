package com.Bridgelabz;

import java.util.Scanner;

public class InsertionSortForString {
	
	
	public static void main (String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the string to sort");
		String s=scn.nextLine();
		String st[]=s.split(" ");
		InsertionSortForString.insertionSort(st);
	}
	
	    public static void insertionSort(String[] array) 
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

	  
	    }
	
	
	



