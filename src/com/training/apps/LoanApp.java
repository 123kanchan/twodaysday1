package com.training.apps;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.training.entities.LoanApplication;
import com.training.entities.LoanType;

public class LoanApp {

	
	public static void main(String[] args) {
		 
		LoanApplication appl1 =  new 
				LoanApplication(121212, "John", LoanType.AGRICULTURE);

		System.out.println(appl1);
		
		LoanApplication application2 = getApplicationDetails();
		
		System.out.println(application2);
		
		
		
	
		
		
		
		
	}

	public static LoanApplication getApplicationDetails() {
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("Enter application Id ");
		//idd will store the long value coming from the input stream
		//input stream is system.in --keyboard
		
	//scanner  --InputStream object 
		
		long idd =  scanner.nextLong();
		
		System.out.println("Enter applicant name");
		String name =  scanner.next();
		
		System.out.println("Enter loan type");
		String ltype =  scanner.next();
		
		//lt1 has the LoanType value of the String ltype which the user has provided
		
		LoanType lt1 =  LoanType.valueOf(ltype);
		
		//we have 3 things 
		//id name ltype
		
		System.out.println("Enter loan application date dd-MMM-yyyy");
		
		String dateOfappl =  scanner.next();
		
		DateTimeFormatter formater =  DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		LocalDate d1 =  LocalDate.parse(dateOfappl,formater);
		
		LoanApplication application2 =
				new LoanApplication(idd, name, d1,lt1);
		return application2;
	}
}
