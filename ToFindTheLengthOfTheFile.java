package com.Bridgelabz;
import java.io.File;


public class ToFindTheLengthOfTheFile {
	
	   public static void main(String[] args) {
	      
	      File f = null;
	      String path;
	      long len;
	      boolean bool = false;
	      
	      try{      
	         // create new file
	         f = new File("/home/bridgelabz3/Desktop/Raghava/raghava/fileiodemo");
	         
	         // true if the file path is a file, else false
	         bool = f.exists();

	     	
	         // if path exists
	         if(bool)
	         {
	            // returns the length in bytes
	            len = f.length();
	                                 
	            // path
	            path = f.getPath();
	            
	            // print
	            System.out.print(path+" file length: "+len);
	         }
	      }catch(Exception e){
	         // if any error occurs
	         e.printStackTrace();
	      }
	   }
	}
	
	
	


