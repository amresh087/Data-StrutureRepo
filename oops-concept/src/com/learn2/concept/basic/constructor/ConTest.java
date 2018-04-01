package com.learn2.concept.basic.constructor;

public class ConTest
{

	public static void main(String args[])
	{
		Account a1=new Account();
		a1.putDetails();

		a1.getDetails(101,"Delhi",7800);
		a1.putDetails();

		Account a2=new Account("s.r",750);
		a2.putDetails();
		a2.getDetails(013,"s.r",6789);
		a2.putDetails();
	}//main
}//class
