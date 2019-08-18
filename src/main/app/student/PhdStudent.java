package main.app.student;

import main.app.Teacher;

public class PhdStudent extends Student {

	private String thesisTitle;
	private Teacher supervisor;
	
	
	public PhdStudent() {
		// TODO Auto-generated constructor stub
		System.out.print("Constructor #1 --- PhdStudent\n");
	}
	
	public PhdStudent(String firstName, String lastName, String department,
			long studentNumber, double average) {
		System.out.print("Constructor #2 --- PhdStudent\n");
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.studentNumber = studentNumber;
		this.average = average;
	}
	
	public PhdStudent(String firstName, String lastName, String department,
			long studentNumber, double average, Teacher supervisor, String thesisTitle) {
		System.out.print("Constructor #3 --- PhdStudent\n");
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.studentNumber = studentNumber;
		this.average = average;
		this.supervisor = supervisor;
		this.thesisTitle = thesisTitle;
	}

	
	public void setThesisTitle(String thesisTitle) {
		this.thesisTitle = thesisTitle;
	}
	
	public void setSupervisor(Teacher supervisor) {
		this.supervisor = supervisor;
	}
	
	public Teacher getSupervisor() {
		return this.supervisor;
	}
	
	public String getThesisTitle() {
		return this.thesisTitle;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print("\nPhd student:\n");
		super.print();
		System.out.print("student -> supervisor: " + supervisor.toString() + "\n");
		System.out.print("student -> thesis title: " + thesisTitle + "\n");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "first name: " + firstName + "\nlast name: " + lastName + "\ndepartment: " +
		department + "\nstudent number: " + studentNumber + "\naverage: " + average + 
		"\nsupervisor: " + supervisor.toString() + "\nthesis title: " + thesisTitle +"\n";
	}

}
