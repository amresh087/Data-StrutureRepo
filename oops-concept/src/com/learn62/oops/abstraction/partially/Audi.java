package com.learn62.oops.abstraction.partially;

public class Audi extends Car{

	public Audi(String carseries) {
		super(carseries);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void feature() {
		
		System.out.println("Audi car feature");
	}

	@Override
	public void logo() {
		System.out.println("Audi car logo");
		
	}

}
