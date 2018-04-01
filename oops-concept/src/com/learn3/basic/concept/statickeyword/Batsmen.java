package com.learn3.basic.concept.statickeyword;

//Example on static Variables
public class Batsmen {
	int bid;
	int pscore;
	static int tscore;
	// static block
	static {
		tscore = 0;
		System.out.println("hello");
	}

	void getRuns(int id, int r) {
		pscore = r;
		bid = id;
		tscore = tscore + pscore;
		System.out.println("pscore is" + pscore);
	}

	static void scoreBoard() {
		System.out.println(" team score is " + tscore);
	}// score Board

	public static void main(String[] args) {
		System.out.println("this is main");
		//create object
		Batsmen sachin = new Batsmen();
		sachin.getRuns(10, 89);
		scoreBoard();
		
		
		//create object
		Batsmen gangu = new Batsmen();
		//call non static method
		gangu.getRuns(2, 4);
		
		//call static method from static method
		scoreBoard();
		//call static method
		Batsmen.scoreBoard();

	}
}
