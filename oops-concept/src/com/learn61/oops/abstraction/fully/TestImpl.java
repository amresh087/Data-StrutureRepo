package com.learn61.oops.abstraction.fully;

public class TestImpl extends A implements Third {

	
	
	
	@Override
	public void red() {
		System.out.println("this is red()");
		 
	}

	@Override
	public void blue() {
		System.out.println("this is blue()");
		
	}

	@Override
	public void pink() {
		System.out.println("this is pink()");
		
	}

	@Override
	public void yellow() {
		System.out.println("this is yellow()");
	}
	
	void xyz()
	{
		System.out.println("pi value=="+pi);
		pi=3.4f;
		System.out.println("after change pi value=="+pi);
		//colorcode=2; erors
		System.out.println("this is xyz()");
	}

}
