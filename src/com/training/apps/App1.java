package com.training.apps;

import com.training.utils.Calculator;

public class App1 {
	public static void main(String[] args) {
		//we have created a reference variable c1 of type Calcualtor
		//we have allocated mem and created the object
		//local variable c1 to the main method
		
		Calculator  c1 = new Calculator();
		
		//calling setA to set int a
		c1.setA(34);
		
		//calling setB to set b
		c1.setB(67);
		
		
		//invoking add 
		
		System.out.println(c1.add());
		
		System.out.println(c1.getA());
		System.out.println(c1.getB());
		
		
	}

	
	
}
