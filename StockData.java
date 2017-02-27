package com.Bridgelabz;

public class StockData {
	
	
	String stockname;
	int noofshares;
	double shareprice;
	public StockData(String Stockname, int noofshares , double shareprice)
	{
		this.stockname=Stockname;
		this.noofshares=noofshares;
		this.shareprice=shareprice;
	}
	
	public String toString()
	{
		return "stock data=[stockname is \""+stockname+"\"  noofshares = "+noofshares+" shareprice = "+shareprice+"]";
	}
	
	

}
