package com.training.apps;

import java.time.LocalDate;
import java.util.Scanner;

import com.training.entities.Book;

public class InterApp {

	public static void main(String[] args) {
		
		byte a =10;
		int b =  a;
		long c = b ;
		
		
	   Distributable d1 =null;
	   
	   Printable p1 = null;
	   
	   ColorPrintable  c1 = null ;
	   
		
		System.out.println("1.Distributable");
		System.out.println("2.Printable");
		System.out.println("3.Color Printable");
		
		System.out.println("enter your choice");
		
		Scanner scanner =  new Scanner(System.in);
		
		int choice =  scanner.nextInt();
		
		switch(choice) {
		
		case 1 : d1=new A();
		System.out.println("a created as it is distributable");
		d1.distribute();
		d1=new C();
		d1.distribute();
		break;
		
		case 2: p1 = new B(100);
		p1.print();
		break;
		
		case 3: 
			Book b1 =new Book(1212,"rise of kali",LocalDate.of(2021, 3, 3),340);  
			c1 = new C(b1);
		c1.colorPrint();
		c1.distribute();
		c1.print();
		break;
		
		default:
			
		System.out.println("invalid choice");
		System.exit(0);
		
		}
		
		
		
	}
}
