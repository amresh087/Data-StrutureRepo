package com.learn56.oops.inheritance.superkeyword;

public class Der extends Base
{
	int a;
	int b;

	void assignData(int x,int y)
	{
		a=x;
		b=y;
	}

	void disp()
	{
	super.disp();
	System.out.println("der class"+a+"  "+b);
	int total=super.a+super.b+a+b;
	System.out.println("total is"+total);
	}

}//class