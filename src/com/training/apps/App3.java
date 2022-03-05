package com.training.apps;

import com.training.entities.LoanType;

public class App3 {
	public static void main(String[] args) {
		
		//purpose of values() method of enum
		//it returns the array of values of that enum type
		//return value is captured in ltarr of type LoanType
		LoanType[] ltarr = LoanType.values();
		
		//using forEach we are iterating over the LoanType array
		
		for(LoanType l : ltarr) {
			
			System.out.println(l);
			System.out.println(l.getNumberOfDispersals());
		}
		
		//valueOf
		//converting String value into enum type
		
		
		LoanType l1= LoanType.EDUCATION;
		
		System.out.println(l1.display());
		
		System.out.println(l1.printVal());
		
	}
}
