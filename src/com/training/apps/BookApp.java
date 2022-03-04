package com.training.apps;

import java.time.LocalDate;

import com.training.entities.Book;

public class BookApp {
	public static void main(String[] args) {
		
		
		Book b1 = new Book();
		b1.setId(1111);
		b1.setTitle("Tao of physics");
		b1.setDateOfPublishing(LocalDate.of(2000, 3, 13));
		b1.setPrice(340);
		
		//created a Book object with all the values 
		
		Book b2= new Book(1123,"Mastering AWS",LocalDate.of(2016, 4, 13),290);
		
		//setters 
		//overload
		//method overloading
		//same method name --different parameters
		
		
	    System.out.println(b1);
	   
	    System.out.println(b2);
	    System.out.println(Book.getCtr());
		
	   
	}

}
