package com.training.apps;

import com.training.utils.Calculator;

public class App1 {
	public static void main(String[] args) {
		//we have created a reference variable c1 of type Calcualtor
		//we have allocated mem and created the object
		//local variable c1 to the main method
		//this is a call to the default constructor
		//means no args constructor
		//whos is providing this method
		//we have not written yet 
		//jvm
		//once dev has written 
		Calculator  c1 = new Calculator();
		Calculator  c2 = new Calculator();
		c2.setA(100);
		c2.setB(200);
		//calling setA to set int a
		c1.setA(34);
		
		//calling setB to set b
		c1.setB(67);
		
		
		//invoking add 
		
		System.out.println(c1.add());
		
		System.out.println(c1.getA());
		System.out.println(c1.getB());
		
		System.out.println(c2.add());
		System.out.println(Calculator.getCtr()+"calculator objects created");
		
	}

	
	
}
