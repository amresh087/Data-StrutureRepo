package com.learn52.oops.inheritance.multilevel;

public class Result extends Student {
	char grade;
	String result;

	Result() {
		System.out.println("Result class Constructor");
	}

	void find_Grade_Result() {
		if (avg < 35) {
			grade = 'N';
			result = "fail";
		} else if (avg < 50) {
			grade = 'C';
			result = "pass";
		} else if (avg < 60) {
			grade = 'B';
			result = "pass";
		} else if (avg >= 60 && avg <= 100) {
			grade = 'A';
			result = "pass";
		} else {
			System.out.println("Invalid marks ");
		}

		System.out.println("grade is" + grade);
		System.out.println("result is" + result);

	}

}// Result class