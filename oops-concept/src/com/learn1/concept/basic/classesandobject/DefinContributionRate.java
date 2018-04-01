package com.learn1.concept.basic.classesandobject;

public class DefinContributionRate {
	
	 int rateId=12;
	 String description="This is my contribution of year";
	 double contributionAmount=201;
	 double contributionPercent=56.90;
	
	
	 
	 public void showData()
	 {
		 
		 System.out.println("------start showData method- logic------- ");
		 
		 System.out.println("rateId : "+rateId);
		 System.out.println("description : "+description);
		 System.out.println("contributionAmount : "+contributionAmount);
		 System.out.println("contributionPercent : "+contributionPercent);
		 
		 System.out.println("------End showData method- logic------- ");
		 
		 
	 }
	 
	 
	 public double calculation()
	 {
		 System.out.println("------calculation showData method- logic------- ");
		 return contributionAmount*contributionPercent;
		
	 }
	
	
	
	
	
	

}
