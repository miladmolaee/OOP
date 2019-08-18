package main.app;

public class Teacher extends Faculty {

	public String name;
	
	public Teacher() {
		// TODO Auto-generated constructor stub
		System.out.print("Constructor #1 --- Teacher\n");
	}
	
	public Teacher(String name) {
		// TODO Auto-generated constructor stub
		System.out.print("Constructor #2 --- Teacher\n");
		this.name = name;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
}
