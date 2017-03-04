package class7;

public class ClassRoom {

	private Student[] students = new Student[3];
	private int totalStudents = 0;

	public void addStudent(Student st) {
		if (totalStudents == students.length) {
			expandStudentsArray();
		}
		students[totalStudents] = st;
		totalStudents++;
	}

	private void expandStudentsArray() {
		Student newStudentsArray[] = new Student[students.length * 2];
		for (int i = 0; i < students.length; i++) {
			newStudentsArray[i] = students[i];
		}
		students = newStudentsArray;
	}

	public void removeStudent(Student st) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == st) {
				students[i] = null;
				totalStudents--;
				return;
			}

		}
	}

	public int getTotalStudents() {
		return totalStudents;
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
