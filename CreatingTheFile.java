package com.Bridgelabz;
import java.io.File;
import java.io.IOException;

public class CreatingTheFile {

	public static void main(String[] args)

	{
		File f1=new File("/home/bridgelabz3/Desktop/Raghava/raghava/fileiodemo.txt");
		if(f1.exists()==false)
		{
			try
			{
				f1.createNewFile();
				System.out.println(" file created in :"+f1.getAbsolutePath());
			}
			catch(IOException r)
			{
				r.printStackTrace();
			}
			
		}
		else
		{
			System.out.println("File already exist");
		}
	}
	
}
