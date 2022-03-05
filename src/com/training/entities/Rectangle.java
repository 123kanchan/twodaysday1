package com.training.entities;

public class Rectangle  extends Shape{

	@Override
	public int calcArea() {
		return this.side1 *this.side2;
	}

	
	public void fill() {
		
		System.out.println("fill with colors");
	}
	
	
	
	@Override
	public String toString() {
		return "Rectangle [side1=" + side1 + ", side2=" + side2 + "]";
	}

	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int side1, int side2) {
		super(side1, side2);
		// TODO Auto-generated constructor stub
	}
	
	

}
