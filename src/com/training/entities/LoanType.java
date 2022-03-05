package com.training.entities;

public enum LoanType {
	HOUSING(1000) {
		@Override
		public String printVal() {
			// TODO Auto-generated method stub
			return "hi there ,its a housing loan application";
		}
	},AGRICULTURE(10000) {
		@Override
		public String printVal() {
			// TODO Auto-generated method stub
			return "its agriculture loan";
		}
	},EDUCATION(10000) {
		@Override
		public String printVal() {
			// TODO Auto-generated method stub
			return "it's related to education";
		}
	};

	int numberOfDispersals;
	LoanType(int i) {
		this.numberOfDispersals = i;
	}
	public int getNumberOfDispersals() {
		return numberOfDispersals;
	}
	public void setNumberOfDispersals(int numberOfDispersals) {
		this.numberOfDispersals = numberOfDispersals;
	}
	public String display() {
		String msg =  "You have applied for "+this+"Loantype";
		return msg;
	}
	
	public abstract String printVal();
	
}


/**
***
*final class LoanType extends Enum {
*
*public final static LoanType AGRICULTURE =  	new LoanType(); 0
*public final static LoanType HOUSING =  	new LoanType();  1
*public final static LoanType EDUCATION =  	new LoanType();  2
*
*}
*
*/