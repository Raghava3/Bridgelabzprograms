package com.Bridgelabz;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonReadFmFlFor {
	public static void main(String[] args) throws Exception{
		Scanner scn=new Scanner(System.in);
		FileReader file=new FileReader("/home/bridgelabz3/Desktop/Raghava/raghava/FILE1.txt");
		JSONParser parser= new JSONParser();
		int n=0;
		Object obj=parser.parse(file);
		JSONObject jo=(JSONObject)obj;
		
		System.out.println("enter how many objects u want to see");
		n=scn.nextInt();
		
		for (int i=0;i<n;i++)
		{
			
			System.out.println("enter item name u want to find");
			String itemname=scn.next();
		JSONArray ja=(JSONArray)jo.get(itemname);
		Iterator<String> iterator ;
	//	System.out.println("Rice");
		System.out.println();
	
		
try{
	 iterator = ja.iterator();
	
		while (iterator.hasNext()) {
            System.out.println(iterator.next());
        } 
}
		catch(NullPointerException a)
		{
			System.out.println("there is no item");
		}
		}
	}

}
