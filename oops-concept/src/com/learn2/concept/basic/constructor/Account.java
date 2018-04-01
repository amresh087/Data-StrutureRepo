package com.learn2.concept.basic.constructor;

public class Account {
	int acid;
	String branch;
	float bal;

	// constructor
	Account() {
		System.out.println("Zero -arg constructor");
		branch = "n.guda";
		bal = 250;
	}

	Account(String br, float tbal) {
		System.out.println("param  constructor");
		branch = br;
		bal = tbal;
	}

	void getDetails(int x, String y, float z) {
		acid = x;
		branch = y;
		bal = z;
	}

	void putDetails() {
		System.out.println(acid + "  " + branch + "  " + bal);
	}
}// class
