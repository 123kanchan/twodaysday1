package com.training.apps;

import java.util.Scanner;

import com.training.entities.Circle;
import com.training.entities.Rectangle;
import com.training.entities.Shape;

public class AppShape {
public static void main(String[] args) {
//local	
Shape s = null ;

//compiler is complaining that you dont have a static method
//drawShape 

System.out.println("1.Rectangle");
System.out.println("2.Circle");
System.out.println("Enter your choice");
Scanner scanner=  new Scanner(System.in);

int choice =  scanner.nextInt();

switch(choice) {
//parent class ref variable takes the shape of child class Rectangle  because Rectangle is a Shape
case 1: s=new Rectangle(4,4);break;
	
//s can become a Circle because Circle class extends Shape

case 2:s=new Circle(3);break;
	
default:System.out.println("invalid choice");
System.exit(0);

	

}
drawShape(s);



	
}

//dynamic polymorphism -- runtime the object gets bound to the method call
//overriding the abstract method gives us dynamic polymorphism



private static void drawShape(Shape s) {
	
	System.out.println(s.calcArea());
	System.out.println(s+"being drawn");
	//on lhs object 
	//on rhs class /type
	
	if(s instanceof Rectangle)
	    //downcast the shape to REctangle
		//but before downcasting 
		//we are checking whether it is instanceof 
	{((Rectangle) s).fill();}
	else
	if (s instanceof Circle) {

		((Circle) s).spin();
		
	}
	else
	{
		System.out.println("some other shape");
	}
	
}


//what is static polymorphism ?


//how itis done in Java ?

//method overloading /constructor overloading are a way static polymorphism 

//why static , because method gets bound to the object at the compilation time





}
