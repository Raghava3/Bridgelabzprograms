package com.Bridgelabz;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BinarySearchWord {
	public static void main(String[] args) throws IOException {
		Scanner scn =new Scanner(System.in);
		String s="",ts="";
		FileReader f=new FileReader("/home/bridgelabz3/Desktop/Raghava/raghava/fileiodemo");//this is the path of the file
		BufferedReader b= new BufferedReader(f/* we cant pass the above address directley we havae to pass the string so we are passing it by storing in the f*/);
	//	System.out.println("b===="+b);//this will give the fully qualified class name of buffered reader ex-java.io.BufferedReader@55f96302
		while((s=b.readLine())!=null){
			System.out.println("actual content of the file is --> \""+s+".\"");// gives the actual content of the file
			ts+=s;
			}
		b.close();
	      
	    		  
		String[] str=ts.split(" ");//using the split function 
		
		System.out.println("-------------------------------------");

		System.out.println("After  spliting ");
		System.out.println("-------------------------------------");
		for (int i = 0; i < str.length; i++)
		{
			str[i].toLowerCase();//converting into the lower case
			System.out.println(str[i]);//printing after the split function 
			
		}
		System.out.println("-------------------------------------");
		System.out.println("After sorting");
		System.out.println("-------------------------------------");

		str=sort(str);//calling the sort method
		System.out.println("-------------------------------------");

		System.out.println("enter the string to serch");
		
		String s1=scn.next();
		s1=s1.toLowerCase();//converting into the lower case
		
		//doing the binary search for the string
		int first=0;
		int last=str.length-1;
		int mid;
		while(first<=last){		

			mid=(first+last)/2;
			if(s1.compareTo(str[mid])>0){
				first=mid+1;
			}
			else if(s1.compareTo(str[mid])<0){
				last=mid-1;
			}
			else{
				System.out.println();
				System.out.println("found the string....!!!!!   :"+str[mid]);
				return;
			}
		}
		System.out.println();
		System.out.println("could not found the string");
		
			
	}		


	private static String[] sort(String[] str) {
	//using the bubble sort method	
		for (int i = 0; i < str.length-1; i++) {
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
		for(String ele :str){
			System.out.println(ele);
		}
		return str;
	}
}
