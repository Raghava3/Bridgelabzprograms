package com.Bridgelabz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;



public class TestListInt {
	public static void main(String[] args) throws IOException {
		//reading from the file
		FileReader fs=new FileReader("/home/bridgelabz3/Desktop/Raghava/raghava/Fileint.txt");
		
		BufferedReader br =new BufferedReader(fs);
		LinkedList ll=new LinkedList();
		String s="",s1="";
		while((s=br.readLine())!=null){
			s1=s1+s;
		}
		br.close();
		String[] str=s1.split(" ");
		int[] arr=new int[str.length];
		for (int i = 0; i < str.length; i++) {
			arr[i]=Integer.parseInt(str[i]);
		}
		//sort the array in ascending order using utility class 
		UtilityClass ut=new UtilityClass();
		arr=ut.bubbleSortForInteger(arr);
		
		for (int i = 0; i < arr.length; i++) {
			ll.add(arr[i]);
		}
		System.out.println(ll);
		System.out.println("enter a no to find.....");
		Scanner scn=new Scanner(System.in);
		int find=scn.nextInt();
		scn.close();
		//calling the method which is present in linked list
		if(ll.search(find)){
			//ll.remove(find);// if we want to remove only on number
			ll.removeAll(find);//if we want to remove repeting number
			System.out.println("value found....so..!!!!! Removed");
		}
		//calling the method which is present in linked list
		else{
			ll.add(find);
			System.out.println("value not found....so..!!!!! Added");
		}
		System.out.println(ll);
	}
}