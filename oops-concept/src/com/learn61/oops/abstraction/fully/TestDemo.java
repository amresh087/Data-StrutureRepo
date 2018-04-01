package com.learn61.oops.abstraction.fully;

public class TestDemo {
	
	
	public static void main(String[] args) {
		
		System.out.println("----------call with direct object----");
		//create direct object
		TestImpl t=new TestImpl();
		t.red();
		t.blue();
		t.xyz();
		t.pink();
		t.yellow();
		//System.out.println("constant value--"+t.pi);
		
		
		System.out.println("----------call with Indirect object of First interface----");
		First f=new TestImpl();
		f.red();
		f.blue();
		//	f.xyz(); error
		//f.pink();
		
		System.out.println("----------call with Indirect object of Second interface----");
		Second s=new TestImpl();
		s.pink();
		//s.red(); error
		// s.xyz() ; error
		
		
		System.out.println("----------call with Indirect object of Third interface----");
		Third th=new TestImpl();
		th.red();
		th.pink();
		th.yellow();
//		th.xyz();
	}

}
