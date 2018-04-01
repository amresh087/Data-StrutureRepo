package com.learn62.oops.abstraction.partially;

public class TestDemo {
	
	public static void main(String[] args) {
		
		
		//direct object not possible
		//Car c=new Car(); 
		
		//indirect object
		Car bmw=new BMW("A6");
		bmw.version();
		bmw.feature();
		bmw.logo();
		bmw.wheels();
		
		System.out.println("====================");
		
		//indirect object
		Car audi=new Audi("Q3");
		audi.version();
		audi.feature();
		audi.logo();
		audi.wheels();
		
		
	}

}
