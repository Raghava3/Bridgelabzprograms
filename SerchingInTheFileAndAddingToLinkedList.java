package com.Bridgelabz;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SerchingInTheFileAndAddingToLinkedList 
{
	
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
		LinkedListForFile l=new LinkedListForFile();
		for (int i = 0; i < str.length; i++)
		{
		System.out.println(	l.insert(str[i]));
		}
		
		System.out.println("enter the string to search ");
		String st=scn.next();
	System.out.println(	l.search(st));
		
	}

}
