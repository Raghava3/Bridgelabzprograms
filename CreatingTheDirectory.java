package com.Bridgelabz;
import java.io.File;

public class CreatingTheDirectory {
	
	public static void main(String [] args)
	{
	File dir2=new File("/home/bridgelabz3/Desktop/Raghava/raghava");
	if(dir2.exists()==false)
	{
		dir2.mkdir();
		System.out.println("folder created "+dir2.getAbsolutePath());
	}
	else 
	{
		System.out.println("forlder is alredy created ");
	}
	}
}
