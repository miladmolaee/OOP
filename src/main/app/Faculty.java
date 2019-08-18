package main.app;

public class Faculty {

	String name = "Polymer Engineering Department of Amirkabir University of Thechnology";
	
	
	public Faculty() {
		// TODO Auto-generated constructor stub
		System.out.print("Constructor --- (SuperClass) Faculty\n");
	}

	
	public void print() {
		System.out.print("\n" + name + "\n");
	}
	
	public String toString() {
		return this.name;
	}
}
