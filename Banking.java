package com.Bridgelabz;

import java.util.Scanner;

public class Banking 
{

	public static void main(String[] args)
	{
		Queue q=new Queue();
		char  n='y';
		int k='1';
		int t=0,l=0;
		int tic=1,flag,flag1=0,option;
		while(true)
		{
			BankingMethodImplementationClassForMyBank b=new BankingMethodImplementationClassForMyBank();
			Scanner sc=new Scanner(System.in);
			System.out.println(" enter 1  to join queue  ");

			System.out.println(" enter 2  to proceed with transaction  ");
			n=sc.next().charAt(0);

			if(n=='1')
			{ 
				flag1=1;
				t++;
				System.err.println("your ticket no is "+t);
				System.out.println();
				l=  q.add();
			}


			else if(n=='2')
			{
				if(flag1==1)  
				{
					System.out.println(" enter ticket number");
					k=sc.nextInt();
				System.out.println("tic="+tic+"k="+k+"l="+l);
					if(tic==k&&(l>0))
					{

						flag=1;

						while(flag==1)
						{
							System.out.println("Select your operation in Bank\n 1>\tFor Deposite\n 2>\tFor WithDraw\n 3>\tFor Check Balance\n 4>\tExit\nEnter Your choice!!!");
							option =sc.nextInt();

							if(option==1)
								{tic++;   
									System.out.println("Enter the amount to deposite");
									double amtd=sc.nextDouble();
									b.dep(amtd);
									q.exit();

								        }

								else if(option==2)
								{

									System.out.println("Enter the amount to withdraw");
									double amtw=sc.nextDouble();
									b.wd(amtw);
									q.exit();

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



