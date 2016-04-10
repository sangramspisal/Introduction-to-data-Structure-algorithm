package com.chapter3.assignment1;

public class Employee {
	private int empID;
	private String firstName;
	private String lastName;
	private String emailID;
	
	public Employee(int empID, String firstName, String lastName, String emailID) {
		super();
		this.empID = empID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailID = emailID;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", firstName=" + firstName + ", lastName=" + lastName + ", emailID="
				+ emailID + "]";
	}
	

}
