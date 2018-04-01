package com.learn72.oops.polymorphism.runtime;

public class Factory {
	
	public Shape getShape(String name)
	{
		Shape s;
		if("circle".equalsIgnoreCase(name))
		{
			s=new Circle();
			
		}
		else if("rectangle".equalsIgnoreCase(name))
		{
			s=new Rectangle();
		}
		else
		{
			s=null;
		}
		
		return s;
	}

}
