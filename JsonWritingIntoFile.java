package com.Bridgelabz;

import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;



import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonWritingIntoFile {
	public static void main(String[] args) throws IOException 
	{
		Scanner scn =new Scanner(System.in);
		int nofitems=0;
		int no=0;
		int flag=0;
		JSONArray ja=null;//json array is created

		JSONObject jobj =new JSONObject();//json object is created 
		try{
		System.out.println("Enter the Number of items u have");
		nofitems=scn.nextInt();
		}
		catch(InputMismatchException a)
		{

		flag=1;
			 no=JsonWritingIntoFile.wrong();
			while(no==0)
			{
				no=	JsonWritingIntoFile.wrong();
			}
			nofitems=no;
		}
		if(flag==1)
		{
		scn.next();
		
		}for (int i = 0; i < nofitems; i++)
		{
			
		//	scn.next();
			System.out.println("enter the item");
			String itemname=scn.next();
	
		   
			System.out.println("enter the brand name");
			String Brandname=scn.next();
		

			System.out.println("enter the weight  ");
			String weg=scn.next();
			
			

			System.out.println("enter the price per kg");
			String pr=scn.next();
		
			ja=new JSONArray();
			ja.add(Brandname);
			ja.add(weg);
			ja.add(pr);
			jobj.put(itemname, ja);
		}



		FileWriter fw=new FileWriter("/home/bridgelabz3/Desktop/Raghava/raghava/FILE1.txt");
		fw.write(jobj.toJSONString());
		System.out.println(jobj.toJSONString());
		fw.flush();
		fw.close();
		scn.close();
	} 
	public static int wrong()
	{		
		Scanner scn1 =new Scanner(System.in);
		int n=0;
		try{
			System.out.println("Please enter number of products in  number");
			 n=scn1.nextInt();
		
	     	}
		catch(InputMismatchException a)
		 {
			return 0;
		 }
		 return n;
		
	}

}
