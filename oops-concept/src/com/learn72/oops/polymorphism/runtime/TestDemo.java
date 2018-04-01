package com.learn72.oops.polymorphism.runtime;

public class TestDemo {
	
	public static void main(String[] args) {
		
		String input=args[0];
		
		//method chaining
		new Factory().getShape(input).draw();
		
		
	}

}
