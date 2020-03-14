
package com.data;

public class User 
{
	private String name;
	private int id;
	private double balance; 
	 
	public User(int idf,String nm, double bal) 
	{	 
		 name = nm;
		 id  = idf;
		 balance = bal;
	}
	public User() 
	{
		 
	}
	 
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getId()
	{
		return id ;
	}
	public void setId(int wd) {
		id = wd;
	}
	public double getBalance() 
	{
		return balance;
	}
	public void setBalance(double bal)
	{
		this.balance = bal;
	}	 

}
