package com.learn4.basic.concept.thiskeyword;

public class Test 
{
		int a,b;

	final float PI;
	{
		PI=5;
		a=50;
		System.out.println("hai");

	}
   Test()
	{
	     System.out.println("zero-arg cons");
	}
	Test(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("param constructor");
	}

Test getData(int x,int y)
	{
	a=x;
	b=y;
	return this;
	}

Test disp()
	{
	  System.out.println(a+"   "+b+"  "+PI);
	  return this;
	}

	
}
