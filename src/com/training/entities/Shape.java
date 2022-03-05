package com.training.entities;

public  class Shape {

	protected int side1;
	protected int side2;
	
	public Shape(int side1, int side2) {
		super();
		this.side1 = side1;
		this.side2 = side2;
	}

	public Shape() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Shape [side1=" + side1 + ", side2=" + side2 + "]";
	}

	
	//only declaration
	//no definition
	//no method body
	//where will be its definition found , in its concrete classes
	public  int calcArea() {return 0;}

	public int getSide1() {
		return side1;
	}

	public void setSide1(int side1) {
		this.side1 = side1;
	}

	public int getSide2() {
		return side2;
	}

	public void setSide2(int side2) {
		this.side2 = side2;
	}
	

}
