package com.learn1.concept.basic.classesandobject;

public class DefinContributionRateDemo {
	
	public static void main(String[] args) {
		
		
		System.out.println("I am from main method...");
			DefinContributionRate dcRate=new DefinContributionRate();
			dcRate.showData();
			double calcdata=dcRate.calculation();
		System.out.println("calcdata="+calcdata);
		
		
	}

}
