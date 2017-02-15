package com.Bridgelabz;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SerchingInTheFileAndAddingToLinkedList 
{
	
	public static void main(String[] args) throws IOException {
		Scanner scn =new Scanner(System.in);
		String s="",ts="",stri="";
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
		LinkedListForFile l=new LinkedListForFile();//creating the object of linked list
		for (int i = 0; i < str.length; i++)
		{
		System.out.println(	l.insert(str[i]));//adding to linked list
		}
		
		System.out.println("enter the string to search");//taking input from user to check the string is present or not
		String st=scn.next();
		if(l.search(st))//if its there then remove
		{
			System.out.println("found "+st+"hence removing");
			int loc=l.index(st);
			int i=0;
			System.out.println("loca"+loc);
			System.out.println("len"+str.length);
           // condition to swap
			if(loc<str.length-1)
			{
			while(loc<(str.length))
			{
				str[loc-1]=str[loc];
				loc++;
			}
			}
			else
			 {
				 System.out.println(loc);
				str[loc-1]="";
			
			 }
			//just to print the o/p on console 
			for (int j = 0; j < str.length-1; j++) 
			{
				stri=stri+str[j];
			}
         //	Writing into the file
			 String Filename="/home/bridgelabz3/Desktop/Raghava/raghava/fileiodemo.txt";
			 ExtraClass1 e1=new ExtraClass1();
			 e1.writingInToTheFile(Filename, stri);
		

				}
		
		else
		{
			//code to add to file
			System.out.println("not found hence adding in to the file ");
			for (int j = 0; j < str.length-1; j++) 
			{
				stri=stri+" "+str[j]+" ";
			}
			stri=stri+st;
			
			String Filename="/home/bridgelabz3/Desktop/Raghava/raghava/fileiodemo.txt";
			 ExtraClass1 e1=new ExtraClass1();
			 e1.writingInToTheFile(Filename, stri);
		
			
		}
	}

}
