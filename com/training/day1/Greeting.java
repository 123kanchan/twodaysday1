//always keep your codes in some package
//packages are for grouping your source codes meaningfully
package com.training.day1;

//created a class Greeting with public access specifier
//non public means package friendly
//public means it is available to all packages

 public class Greeting {
	 
	 //syntax for methods
	 //access specifier -public
	 //return type -void
	 //method name  greeting1
	 //() - empty with  no parameters
	 //{ }  --logic
	 public static void greeting1() {
		 
		System.out.println("greetings from other package"); 
		 
	 }
	 
	 public void greeting2() {
		 
		 System.out.println("greetings from non static method");
		 
		 
	 }
	 

}
