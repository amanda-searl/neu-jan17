package class9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentManagement {

	private static Map<String, Student> students = new LinkedHashMap<String, Student>();

	public static void main(String[] args) throws Exception {
		String file = "/Users/dosapats/students.txt";
		populateStudentsFromFile(file, students);
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Enter Command[create, delete, display, exit]");
			String x = scanner.nextLine();
			if (x.equals("create")) {
				createStudent(scanner);
			}
			if (x.equals("delete")) {
				deleteStudent(scanner);
			}
			if (x.equals("display")) {
				displayStudents();
			}
			if (x.equals("exit")) {
				break;
			}
		}
		writeStudentsIntoFile(file, students);
	}

	private static void writeStudentsIntoFile(String file, Map<String, Student> students) throws Exception {
		File f = new File(file);
		FileWriter fw = new FileWriter(f);
		PrintWriter pw = new PrintWriter(fw);
		for (Student st : students.values()) {
			pw.println(st.toWriteableString());
		}
		pw.close();
	}

	private static void populateStudentsFromFile(String file, Map<String, Student> students) throws Exception {
		File f = new File(file);
		FileInputStream fis = new FileInputStream(f);
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader reader = new BufferedReader(isr);
		while (true) {
			String line = reader.readLine();
			if (line == null)
				break;
			Student st = new Student();
			st.fromWriteableString(line);
			students.put(st.getRoll(), st);
		}
		reader.close();
	}

	private static void displayStudents() {
		for (Student st : students.values()) {
			System.out.println(st.toWriteableString());
		}
	}

	private static void deleteStudent(Scanner scanner) {
		System.out.println("Enter Roll no of Student that needs to be deleted");
		String roll = scanner.nextLine();
		if (students.containsKey(roll)) {
			students.remove(roll);
			System.out.println("Student with roll -> " + roll + " is deleted");
		} else {
			System.out.println("Student with roll -> " + roll + " is not found");
		}

	}

	private static void createStudent(Scanner scanner) {
		System.out.println("Enter Roll Number");
		String roll = scanner.nextLine();
		System.out.println("Enter Name");
		String name = scanner.nextLine();
		Student st = new Student();
		st.setRoll(roll);
		st.setName(name);
		students.put(st.getRoll(), st);
	}

}
