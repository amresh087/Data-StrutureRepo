package com.learn62.oops.abstraction.partially;

public abstract  class Car {
	
	public abstract void feature();
	
	public abstract void logo();
	
	public String carseries;
	
	public Car(String carseries)
	{
		this.carseries=carseries;
	}
	
	public  void version()
	{
		System.out.println("version series is : "+carseries);
	}
	
	
	
	public void wheels()
	{
		System.out.println("No fo wheels 4");
	}

}
