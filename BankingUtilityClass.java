package com.Bridgelabz;

import java.util.Scanner;

public class BankingUtilityClass {

	 
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		
		Queue q=new Queue();
		int op=1;
		while(op==1&&q.size()<q.QueueArray.length&&q.size()>=0)
		{
			System.out.println("First enter into queue\n 1>\tFor enter to Queue\n 2>\tProcede with Transaction\n\tEnter your choice");
			op=sc.nextInt();
			if(op==1)
				q.add();
			if(op==2&&q.empty())
				System.out.println("First Enter into Queue");
		}
		
		
		BankingCashCounter b=new BankingCashCounter();
		
		
		while(q.full()||!q.full()&&!q.empty())
		{
		System.out.println("Select your operation in Bank\n 1>\tFor Deposite\n 2>\tFor WithDraw\n 3>\tFor Check Balance\n 4>\tFor Enter into Queue\nEnter Your choice!!!");
		int option =sc.nextInt();
		
		switch (option)
		{
		case(1):System.out.println("Enter the amount to deoposite");
		double amtd=sc.nextDouble();
		b.dep(amtd);
		q.exit();
		
		break;
		
		case(2):System.out.println("Enter the amount to withdraw");
		double amtw=sc.nextDouble();
		b.wd(amtw);
		q.exit();
		
		break;
		
		case(3):b.check();
	
		break;
		
		case(4):
		while(q.size()<q.QueueArray.length&&q.QueueArray.length>0)
		{
			
			System.out.println("First enter into queue\n 1>\tFor enter to Queue\n 2>\tProcede with Transaction\n\tEnter your choice");
			op=sc.nextInt();
			if(op==1)
				q.add();
			if(op==2&&q.empty())
				System.out.println("First Enter into Queue");
		}
		
		}
		
			System.out.println("\n come Next!!!\n");
		}
	}

}


