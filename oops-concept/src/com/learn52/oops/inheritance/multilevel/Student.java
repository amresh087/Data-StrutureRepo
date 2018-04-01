package com.learn52.oops.inheritance.multilevel;

public class Student extends Marks {
	int sno;
	String sname;
	int total;
	float avg;

	// defualt constructor
	Student() {
		System.out.println("Student class Constructor");
	}

	/**
	 * 
	 * @param sno
	 * @param sname
	 */
	void get(int sno, String sname) {
		this.sno = sno;
		this.sname = sname;

		total = m1 + m2 + m3;
		avg = total / 3.0f;
		System.out.println("Student class get()");
	}

	/**
	 * 
	 */
	void disp() {
		System.out.println("name is" + sname);
		System.out.println("number is" + sno);
		super.disp();// invokes base class disp();
		System.out.println("total is" + total);
		System.out.println("avg is" + avg);
	}
}// Student class
