

package com.learn52.oops.inheritance.multilevel;

public class MLInhTest {
	public static void main(String[] args) {
		//
		
		Result rs=new Result();
		//Mark get method call
		rs.get(67,89,67);
		//Student get method call
		rs.get(101,"raja");
		//Student disp method call
		rs.disp();
		//Result find_Grade_Result method call
		rs.find_Grade_Result();
		
	}

}
