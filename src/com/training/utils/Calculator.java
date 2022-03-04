//package will be always the first statement
package com.training.utils;
//after package you can use imports if you want to use that package classes
public class Calculator {
	//instance variables
	private int a;
	private int b;
	
	//static variable
	private static int ctr;
	
 
	
	//methods are called as setters and getters 
	//accessors getters and mutators setters
	public void setA(int a) {
		this.a=a;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public int getA() {return a;}
	public int getB() {return b;}

    	
    	
     public int add() {
    	 return this.a+this.b;
     }   	
	



}