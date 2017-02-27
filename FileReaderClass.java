package com.Bridgelabz;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
public class FileReaderClass {

	public static void main(String[] args)
	{
		FileReader fr=null;
		try
		{
			fr=new FileReader("/home/bridgelabz3/Desktop/Raghava/raghava/fileiodemo");
			int x=fr.read();
		
			
			while(x!=-1)
			{
				char c=(char)x;
				System.out.print(c);
				x=fr.read();
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
		finally
		{
			try
			{
				fr.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	 
}
