package main.app.student;

public class MScStudent extends Student {

	public MScStudent() {
		// TODO Auto-generated constructor stub
		System.out.print("Constructor #1 --- MScStudent\n");
	}

	public MScStudent(String firstName, String lastName, String department,
			long studentNumber, double average) {
		System.out.print("Constructor #2 --- MScStudent\n");
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.studentNumber = studentNumber;
		this.average = average;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print("\nMSc. student:\n");
		super.print();
	}
}
