package com.Bridgelabz;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ToPrintUserName {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		String s=" ";
		String name="";
		int len=0;
		int d=0;
		do{
			System.out.println("Enter the Name");
			name=scn.next();
			len=name.length();
			if(name.length()>3)
			{
				
				char a[]=name.toCharArray();

			

				for(int i=0;i<a.length;i++)
				{

					if ((a[i]>=75&&a[i]<=90)||(a[i]>=97&&a[i]<=122))
					{

						s=s+a[i];

					}
					else
					{
						System.out.println(" Name should contain  only alphabets");
						break;
					}
				}

				if(s.length()==len+1)
				{

					System.out.println("hello "+s+" how are you ?");
				}
			}
			else
			{
				System.out.println("Name  should conatin atleat 3 character");
			}
			try
			{
				System.out.println("enter 1 to continue ");
				d=scn.nextInt();
			}
			catch(InputMismatchException e)
			{
				System.out.println("thank u");
				System.exit(0);
			}
		}while (d==1);
		scn.close();
	}
}