package com.training.apps;

import com.training.entities.Book;
import com.training.entities.Rectangle;
import com.training.entities.Shape;

interface Distributable{
	public void distribute();
}
//like classes can extends other classes

//class A extends b,c --can we say this
//interface a extends b,c  --is possible

//interfaces can extends another interfaces

interface ColorPrintable extends Printable,Distributable{
	public void colorPrint();
	
	
}

public interface Printable {
//by default the methods which you declare in interface are public abstract 
	
	public void print();
	
}

//class A has ability to be Distributable
//A is Distributable
//A wants to distribute and print also
class A implements Distributable,Printable{
  //instance variabel of class A is a Shape s
	Shape s = new Rectangle(3,3);
	@Override
	public void distribute() {
		
		System.out.println("distributing Rectangle of area"+s.calcArea());
	}

	@Override
	public void print() {
	System.out.println("printing "+s);
		
	}
	
	
	
}

class B implements Printable{
//instance variable of class B is x of int type 
	
	private int x ;
	
	B(int x){
		
		this.x  =x;
	}
	@Override
	public void print() {
	
		System.out.println("x value is "+x);
	}
	
	
	
}

class C implements ColorPrintable{
  //instance variable 
	private Book b1;
	
	
	
	public C(Book b1) {
	super();
	this.b1 = b1;
}

	public C() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		
		System.out.println("printing book "+b1.getTitle()+b1.getPrice());
	}

	@Override
	public void distribute() {
		System.out.println("distribution of books");
	}

	@Override
	public void colorPrint() {
		System.out.println("color printing of books");
		
	}
	
	
	
}