package class9.swing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindGroups {
	public static void main(String args[]) {
		List<String> students = getStudents();
		int count = 0;
		while (true) {
			if (students.size() == 0)
				break;
			int x = (int) (Math.random() * students.size());
			String student = students.get(x);
			System.out.println(count + " - " + student);
			count++;
			if (count % 4 == 0) {
				System.out.println("----------");
			}
			students.remove(student);
		}
	}

	private static List<String> getStudents() {
		String[] students = { "Amanda", "Melody", "Sirisha", "Frank", "Sandhiya", "Nienu", "Mounika", "Tan", "Harsha",
				"Jane", "Cynthia", "Harold", "Daisy", "Kevin", "Mia" };

		return new ArrayList<String>(Arrays.asList(students));
	}
}
