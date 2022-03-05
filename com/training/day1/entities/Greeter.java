//importance of this package line
//it means the class which we are defining resides in this package
//which class are we defining
//Greeter.java
//we are defining Greeter 
//Greeter belongs to com.training.day1.entities
//System class belongs to java.lang
//we dont have to import it because it is a default package

package com.training.day1.entities;
//access specifier is public

import java.time.LocalDate;

import com.training.day1.Greeting;


public class Greeter {
	//public access specifier
	//static access modifier -means class level
	//we dont have to create an object to invoke this method'
	//static means no object is needed
	//static means it belongs to class level
	//one instance
	//void  means main doesnt return anything
	//main method name
	//parameters in the round brackets
	//String [] --String array
	//args  --name of the parameter of type String []
	
	public static void main(String[] args) {
		
		//System -- java class in java.lang package
		//we dont have to import that package
		//static object out
		//println method prints to the  standard output
		
		System.out.println("hello there ");
		//Greeting is the class name
		//. is going to associate the method call
		//greeting1()
		
		Greeting.greeting1();
		//to create an object
		//<classname> <ref variable name> = <new> <constructor>
		//in java what is a constructor
		//constructor is a special method which has the 
		//same name as that of the class
		// it has to be called to create an instance 
		//or an object
		
		Greeting g1 =  new Greeting();
		
		//how are we creating objects
		//how i created a LocalDate object
		
		LocalDate date1 =  LocalDate.now();
		System.out.println(date1);
		
		//in java everything is a child of
		//java.lang.Object
		
		//main of Greeter is calling
		//greeting2() method of Greeting class
		
		g1.greeting2();
		
		
	}

}
