package com.learn62.oops.abstraction.partially;

public class BMW extends Car{

	public BMW(String carseries) {
		super(carseries);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void feature() {
		System.out.println("BMW feature");
		
	}

	@Override
	public void logo() {
		System.out.println("BMW logo");
		
	}

}
