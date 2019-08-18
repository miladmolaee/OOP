package main.app.student;

import main.app.Faculty;

public class Student extends Faculty{

	protected String firstName;
	protected String lastName;
	protected String department;
	protected long studentNumber;
	protected double average;
	
	public Student() {
		// TODO Auto-generated constructor stub
		System.out.print("Constructor --- Student\n");
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setStudentNumber(long studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void setGpa(double average) {
		this.average = average;
	}

	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getDepartment() {
		return this.department;
	}
	
	public long getStudentNumber() {
		return this.studentNumber;
	}
	
	public double getAverage() {
		return this.average;
	}
	
	@Override
	public void print() {
		System.out.print("student -> first name: " + firstName + "\n");
		System.out.print("student -> last name: " + lastName + "\n");
		System.out.print("student -> department: " + department + "\n");
		System.out.print("student -> student number: " + studentNumber + "\n");
		System.out.print("student -> average: " + average + "\n");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "first name: " + firstName + "\nlast name: " + lastName + "\ndepartment: " +
		department + "\nstudent number: " + studentNumber + "\naverage: " + average + "\n";
	}
	
}
