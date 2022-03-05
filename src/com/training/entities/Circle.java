package com.training.entities;

public class Circle extends Shape{

	@Override
	public int calcArea() {
		//double datatype -8 bytes
		//we are trying to fit in 4 bytes int
		
		//we are (int) -we are assuring compiler we know we are going to lose some data and we are ok with it
		
		
		return (int)3.14*this.side1*this.side1;
	}

	
	public void spin() {
		
		System.out.println("spin fast");
	}
	@Override
	public String toString() {
		return  "Circle [side1=" + side1 + ", side2=" + side2 + "]";
	}

	public Circle() {
		super();
		
	}

	public Circle(int side1, int side2) {
		super(side1, side2);
		
	}
   public Circle(int side1) {
	   this.side1 = side1;
   }
	
	
}
