package com.Bridgelabz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Banking 
{

	public static void main(String[] args)
	{
		Queue q=new Queue();
		char  n='y';
		int k='0',fl=1,fl1=1;
		int t=0,l=0;
		double amtd=0,amtw=0;
		int tic=1,flag,flag1=0,option;
		while(true)
		{
			BankingMethodImplementationClassForMyBank b=new BankingMethodImplementationClassForMyBank();
			Scanner sc=new Scanner(System.in);
			System.out.println(" enter 1  to join queue  ");

			System.out.println(" enter 2  to proceed with transaction  ");
			n=sc.next().charAt(0);
			//generating the ticket number{

			if(n=='1')
			{ 
				flag1=1;
				t++;
				System.err.println("your ticket no is "+t);
				System.out.println();
				l=  q.add();
				System.out.println(l);
			}

			//checking the ticket number}
			else if(n=='2')
			{
				if(flag1==1)  
				{   try{
					System.out.println(" enter ticket number");
					k=sc.nextInt();
				}
				catch(InputMismatchException f)
				{
					while(true)
					{
						System.out.println("invalid ticket number");
						break;
					}
				}
				//	System.out.println("tic="+tic+"k="+k+"l="+l);
				if(tic==k&&(l>0))
				{

					flag=1;

					while(flag==1)
					{


						try{

							System.out.println("Select your operation in Bank\n 1>\tFor Deposite\n 2>\tFor WithDraw\n 3>\tFor Check Balance\n 4>\tExit\nEnter Your choice!!!");
							option =sc.nextInt();
						}
						catch(InputMismatchException f)
						{
							while (true)
							{

								System.out.println(" transaction incomplete . join queue for any further trancation ");
								option =4;
								break;
							}
						}
						if(option==1)
						{ 
							try{
								System.out.println("Enter the amount to deposite");
								amtd=sc.nextDouble();
							}
							catch(InputMismatchException d)
							{
								while(true)
								{   flag=0;
								fl=0;
								System.out.println(" invalid amount,transaction incomplete . join queue for any further trancation");
								tic++;
								l=q.exit();
								break;
								}
							}
							if(fl==1)
							{
								b.dep(amtd);
								q.exit();

							}
						}

						else if(option==2)
						{
							try{
								System.out.println("Enter the amount to withdraw");
								amtw=sc.nextDouble();
							}
							catch(InputMismatchException a)
							{
								while(true)
								{
									flag=0;
									fl1=0;
									System.out.println(" invalid amount. transaction incomplete . join queue for any further trancation  ");
									tic++;
									l=q.exit();
									break;
								}
							}
							if(fl1==1)
							{
								b.wd(amtw);
								q.exit();
							}
						}
						else if(option ==3)
						{
							b.check();

						}
						else if(option ==4)
						{
							flag=0;
							tic++;
							l=q.exit();
							System.out.println("thank u . ");
						}

					}

				}

				else 
				{
					System.out.println("please come in queue ");
				}

				}

			}

		}
	}
}



