package com.training.aws;

//first line of code is package , in which your source code is residing
//where is my HelloWorld.java -- in com.training.aws

//public --keyword --  access specifier - which tells its visibility and accessibility
//class --- keyword -- for declaring a  class
//HelloWorld   ---  name of the class declared 
//where is HelloWorld declared ? in which file
//HelloWorld.java  -
//in which package com.training.aws
//if I want public class , it has to be in its own source code file
//if I want non public class then it can be defined in this source code also
//also one type of access specifier , default or package friendly

public class HelloWorld {
	
	public static void main(String [] a) {
		
		System.out.println("hello world!");
		
		
		
		//called getGreetings() method 
		//getGreetings is  non static method
		//because it is nonstatic we have created object of this class
		//h1
		//through h1 , we have invoked getGreetings()
		
		System.out.println(getGreetings());
	}
    
	
	//public --access specifier
	//String --return type
	//getGreetings()  method is camelCase
	//no input parameters
	
	//methods have to be defined and  executed or called
	//this is the definition
	public static String getGreetings() {
		setGreeting("new season greetings");
		return "Hi there!!";
	}
	
	//public --access specifier
	//private -access specifier ,means it can be called from  within the same class only
	//void  -- return type
	//method name = setGreetings 
	//input parameters name greetings ,what is the data type of greetings String
	
	//{ } --definition or the body of the method 
	
   private static void setGreeting(String greetings) {
	   
	   System.out.println("YOur greetings are "+greetings);
	   
   }
}
