package com.Bridgelabz;

public class BankingMethodImplementationClassForMyBank {

	double minBalance=10000.00;
	double balance=minBalance;
	
	Queue q=new Queue();
	
	public void dep(double amtd)
	{
		balance=balance+amtd;
		System.out.println("Amount of Rs"+amtd+" Deposited Sucessfully");
		System.out.println("Current Balance is Rs"+balance);
		System.out.println("Current queue size="+q.size());
	}
	
	public  void wd(double amt)
	{
		if((balance-amt)>minBalance)
		{
			balance=balance-amt;
			System.out.println("Amount of Rs"+amt+" Withdraws Sucessfully");
			System.out.println("Current Balance is Rs"+balance);
		}
		else
		{
			System.out.println("Don't have sufficient Balance to Withdraw");
			System.out.println("Come first who want to Deposite");
		}
		
		System.out.println("Current queue size="+q.size());
	}
	
	public void check()
	{
		System.out.println("Current Balance is Rs"+balance);
	}

}
