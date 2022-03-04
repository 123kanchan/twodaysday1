package com.training.entities;

import java.time.LocalDate;

public class Book {
	//instance variables
	//will be created for every instance
	private int id;
	private String title;
	private LocalDate dateOfPublishing;
	private double price;
	
    //static variable
	private static int ctr;
	public static int getCtr() {return ctr;}
	
	public Book() {
		ctr++;
		System.out.println("Book created");
	}
	
	
	public Book(int id,String title , LocalDate dop,double price) {
		
		this.id=id;
		this.title = title;
		this.dateOfPublishing = dop;
		this.price = price;
		System.out.println("Book created");
		ctr++;
		
	}
	//purpose of setters method
	//to set values to instance variables
	//setId(int) , setTitle(String) , 
	public void setId(int id) {
		this.id = id;}
	
	public void setTitle(String title) {
		
		this.title = title;
		
	}
	public void setDateOfPublishing(LocalDate dop) {
		this.dateOfPublishing = dop;
	}
	
	public void setPrice(double op) {
		this.price = op;
	}
	//purpose of getters to get the values of instance variables
	
	public int getId() {
		return this.id;
		
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public LocalDate getDateOfPublishing() {
		return this.dateOfPublishing;
	}


    public double getPrice() {
    	return this.price;
    	
    }
     //toString() -- java.lang.Object
    //it was giving us the output in the form of 
    //com.training.entities.Book@15db9742 
    //fully qualified class name with the package name id
    
    @Override
    public String toString() {
    	
       return this.title + " "+this.dateOfPublishing + " "+this.price;	
    }
    

}//end of Book class

