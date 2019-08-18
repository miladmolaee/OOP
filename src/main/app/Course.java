package main.app;

import java.util.ArrayList;

import main.app.student.BScStudent;
import main.app.student.MScStudent;
import main.app.student.PhdStudent;
import main.app.student.Student;

public class Course extends Faculty{

	protected String name;
	protected Teacher teacher;
	protected ArrayList<Object> student = new ArrayList<Object>();
	
	public Course(String name) {
		// TODO Auto-generated constructor stub
		System.out.print("Constructor --- Course\n");
		this.name = name;
	}
	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public void addStudent(Student student) {
		this.student.add(student);
	}
	
	public void addStudent(BScStudent bScStudent) {
		this.student.add(bScStudent);
	}	
	
	public void addStudent(MScStudent mScStudent) {
		this.student.add(mScStudent);
	}
	
	public void addStudent(PhdStudent phdStudent) {
		this.student.add(phdStudent);
	}
	
	public ArrayList<Object> getStudents() {
		return this.student;
	}

	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.print("\n=======================================================\n");
		System.out.print("course name: " + name + "\n");
		System.out.print("teacher: " + teacher.toString() + "\n");
		for(Object student : this.student)
			((Student) student).print();
		System.out.print("=======================================================\n");
	}
}
