package com.Bridgelabz;

import java.io.FileReader;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonReadingFromFIle {
public static void main(String[] args) throws Exception{
		//Reading from the file 
		FileReader file=new FileReader("/home/bridgelabz3/Desktop/Raghava/raghava/FILE1.txt");
		//creating the object of jsonparser 
		JSONParser parser= new JSONParser();
		//reading the file using the parser methods
		Object obj=parser.parse(file);
		//passing that to object 
		JSONObject jo=(JSONObject)obj;
		JSONArray ja=(JSONArray)jo.get("rice");
		Iterator<String> iterator ;

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
		
		System.out.println();
		ja=(JSONArray)jo.get("pulse");
	//	System.out.println("pulse");
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
		System.out.println();
		ja=(JSONArray)jo.get("rice");
	//	System.out.println("wheat");
		System.out.println();
		try{
		iterator = ja.iterator();
		while (iterator.hasNext()) 
		{
            System.out.println(iterator.next());
		} 
}
		catch(NullPointerException a)
		{
			System.out.println("there is no item");
		}
         /*   System.out.println();
    		ja=(JSONArray)jo.get("ragi");
    	//	System.out.println("wheat");
    		System.out.println();
    		try{
    		iterator = ja.iterator();
    		while (iterator.hasNext()) 
    		{
                System.out.println(iterator.next());
    		}
    		}
    		catch(NullPointerException a)
    		{
    			System.out.println("there is no item");
    		}
*/

	}
}

