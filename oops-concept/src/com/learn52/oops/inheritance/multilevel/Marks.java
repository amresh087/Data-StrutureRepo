package com.learn52.oops.inheritance.multilevel;

public class Marks {

	int m1, m2, m3;

	Marks() {
		System.out.println("marks class constructor");
	}

	/**
	 * 
	 * @param x
	 * @param y
	 * @param m3
	 */
	void get(int x, int y, int m3) {
		m1 = x;
		m2 = y;
		this.m3 = m3;
		System.out.println("Marks class get()");
	}

	/**
	 * 
	 */
	void disp() {
		System.out.println("marks are");
		System.out.println(m1 + "  " + m2 + "  " + m3);
	}

}
