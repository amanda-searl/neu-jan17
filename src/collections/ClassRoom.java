package collections;

import java.util.ArrayList;

public class ClassRoom {

	private ArrayList<Student> students = new ArrayList<Student>();

	public void addStudent(Student st) {
		students.add(st);
	}

	public void removeStudent(Student st) {
		students.remove(st);
	}

	public int getTotalStudents() {
		return students.size();
	}

	public static void main(String[] args) {
		ClassRoom cr = new ClassRoom();
		Student amanda = new Student();
		Student frank = new Student();
		Student kevin = new Student();
		Student Monika = new Student();
		cr.addStudent(amanda);
		System.out.println(cr.getTotalStudents());
		cr.addStudent(frank);
		System.out.println(cr.getTotalStudents());
		cr.addStudent(kevin);
		System.out.println(cr.getTotalStudents());
		cr.addStudent(Monika);
		System.out.println(cr.getTotalStudents());
		cr.removeStudent(amanda);
		System.out.println(cr.getTotalStudents());
		cr.addStudent(Monika);
		cr.addStudent(Monika);
		cr.addStudent(Monika);
		cr.addStudent(Monika);
		cr.addStudent(Monika);
		System.out.println(cr.getTotalStudents());
		// cr.removeStudent(amanda);
		// System.out.println(cr.getTotalStudents());

	}

}

class Student {
	String name;

}
