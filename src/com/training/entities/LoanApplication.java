package com.training.entities;

import java.time.LocalDate;

public class LoanApplication {

	//data members 
	private long id;
	private String applicantName;
	private LocalDate dateOfApplication;
	private LoanType loanType;
	

	//getters and setters
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public LocalDate getDateOfApplication() {
		return dateOfApplication;
	}
	public void setDateOfApplication(LocalDate dateOfApplication) {
		this.dateOfApplication = dateOfApplication;
	}
	public LoanType getLoanType() {
		return loanType;
	}
	public void setLoanType(LoanType loanType) {
		this.loanType = loanType;
	}
	

	
	//constructors
	//4
	public LoanApplication(long id, String applicantName,
			LocalDate dateOfApplication, LoanType loanType) {
		super();
		this.id = id;
		this.applicantName = applicantName;
		this.dateOfApplication = dateOfApplication;
		this.loanType = loanType;
	}
	//default
	public LoanApplication() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//2 parameters
	public LoanApplication(long id, String name) {
		
		this.id=id;
		this.applicantName = name;
		
	}
	
	//3 parameters long,String,LocalDate
	public LoanApplication(long id, String applicantName, LocalDate dateOfApplication) {
		super();
		this.id = id;
		this.applicantName = applicantName;
		this.dateOfApplication = dateOfApplication;
	}
	
	//3 parameters  long,String,LoanType
	public LoanApplication(long id, String applicantName, LoanType loanType) {
		super();
		this.id = id;
		this.applicantName = applicantName;
		this.loanType = loanType;
		this.dateOfApplication = LocalDate.now();
		
	}
	@Override
	public String toString() {
		return "LoanApplication [id=" + id + ", applicantName=" + applicantName + ", dateOfApplication="
				+ dateOfApplication + ", loanType=" + loanType + "]";
	}
	
	
	
	
	//toString
	
	
	
	
}
