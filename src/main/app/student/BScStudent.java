package main.app.student;

public class BScStudent extends Student {

	public BScStudent() {
		// TODO Auto-generated constructor stub
		System.out.print("Constructor #1 --- BScStudent\n");
	}
	
	public BScStudent(String firstName, String lastName,
			String department, long studentNumber, double average) {
		System.out.print("Constructor #2 --- BScStudent\n");
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.studentNumber = studentNumber;
		this.average = average;
	}

	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print("\nBSc. student:\n");
		super.print();
	}
}
