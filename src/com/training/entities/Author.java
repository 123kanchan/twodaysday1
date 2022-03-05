package com.training.entities;
//java.lang.Object  is the super class for every class object
public class Author {
	
	//data members
	private int id;
	private String name;
	private String email;
	private String mobileNumber;
	
	//boiler plate code
	//getters  -- return individual value
	//encapsulation 
	//data members are private 
	//how to access the data member 
	//App.java , if i want to set a value to the name of the author
	//or i want to get the email address of author 
	
	//getters and setters 
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	

	//constructors
	
	public Author(int id, String name, String email, String mobileNumber) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobileNumber = mobileNumber;
	}
	public Author() {
		super();//parent class constructor
		//who is the parent of Author 
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", email=" + email + ", mobileNumber=" + mobileNumber + "]";
	}
	
	

}
