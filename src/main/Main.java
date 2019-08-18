package main;

import java.util.ArrayList;
import main.app.Course;
import main.app.Teacher;
import main.app.student.BScStudent;
import main.app.student.MScStudent;
import main.app.student.PhdStudent;
import main.app.student.Student;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		BScStudent amir = new BScStudent();
		BScStudent amir = new BScStudent("Amir","Naderi","Computer",9121032,16.21);
		
		
//		MScStudent milad = new MScStudent("Miald", "Molaee", "Polymer", 9132602, 17.72);			
		MScStudent milad = new MScStudent();
		milad.setFirstName("Miald");
		milad.setLastName("Molaee");
		milad.setDepartment("Polymer");
		milad.setStudentNumber(9132602);
		milad.setGpa(17.72);
		
	
		
//		PhdStudent ali = new PhdStudent();

//		PhdStudent ali = new PhdStudent("Ali","Amiri","Mechanic",90321231,19.73,
//				new Teacher("Dr. jahanbakhsh"), "Monte Carlo Simulation");
		
		PhdStudent ali = new PhdStudent("Ali","Amiri","Mechanic",90321231,19.73);
		ali.setSupervisor(new Teacher("Dr. jahanbakhsh"));
		ali.setThesisTitle("Monte Carlo Simulation");
		
		
		milad.print();
		amir.print();
		ali.print();

		
		Course math = new Course("Java Programming");
		
		Teacher teacher = new Teacher();
		teacher.name = "Dr. Karimi";
		
		math.setTeacher(teacher);

		math.addStudent(milad);
		math.addStudent(amir);
		math.addStudent(ali);
		
		
		  ArrayList<Object> students = math.getStudents();
		  
		  for (int i = 0; i < students.size(); i++) { 
			  if (students.get(i) instanceof Student) 
				  print("\nstudent -> " + students.get(i).toString()); 
			  else if (students.get(i) instanceof BScStudent) 
				  print("\nBsc student -> " + students.get(i).toString());
			  else if (students.get(i) instanceof MScStudent)
				  print("\nMsc student -> " + students.get(i).toString()); 
			  else if(students.get(i) instanceof PhdStudent) 
				  print("\nPhd student -> " + students.get(i).toString()); 
		  }
		 
		

		math.print();
		
	}
	
	private static void print(String string) {
		// TODO Auto-generated method stub
		System.out.print(string);
	}

}
